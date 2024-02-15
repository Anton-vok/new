import sqlite3

# class Connector:
#     def __init__(self, db):
#         self.db = db
#         self.conn = sqlite3.connect(db)
#         self.cursor = self.conn.cursor()
# 
#     def close(self):
#         self.conn.close()
# 
# 
# class Controller(Connector):
#     def __init__(self, db):
#         super().__init__(db)
# 
#     def execute(self, query):
#         self.cursor.execute(query)
#         self.conn.commit()
# 
#     def create_table(self, name, params):
#         counter = 0
#         query = f"CREATE TABLE IF NOT EXISTS {name} ("
#         for param in params:
#             counter += 1
#             for name, data_type in param.items():
#                 if counter == len(params):
#                     query += str(name + ' ' + data_type)
#                 else:
#                     query += str(name + ' ' + data_type) + ', '
#         query += ');'
#         self.execute(query)
# 
#     def add(self, table, params):
#         attr_names_list = []
#         values_list = []
#         for param in params:
#             for key, value in param.items():
#                 attr_names_list.append(key)
#                 values_list.append(value)
#         query = f"INSERT INTO {table} {tuple(attr_names_list)} VALUES {tuple(values_list)}"
#         self.execute(query)
# 
#     def delete(self, table: str, condition):
#         self.execute(f"DELETE FROM {table} WHERE {condition}")
# 
#     def update(self, table: str, sql_id, attr_name: str, value):
#         self.execute(f"UPDATE {table} SET {attr_name} = {value} WHERE id = {sql_id}")
# 
#     def get_data(self, table, condition):
#         self.execute(f"SELECT * FROM {table} WHERE {condition}")
#         return self.cursor.fetchall()
# 


class Connector:
    def __init__(self, db):
        self.db = db
        self.conn = sqlite3.connect(db)
        self.cursor = self.conn.cursor()

    def close(self):
        self.conn.close()


class Controller(Connector):
    def __init__(self, db):
        super().__init__(db)

    def execute(self, query) -> int:
        # Simple check for sql injection
        if not "--" or "/*" in query:
            self.cursor.execute(query)
            self.conn.commit()
        else:
            # Error code for possible sql injection
            return 400

    def create_table(self, name, params):
        counter = 0
        query = f"CREATE TABLE IF NOT EXISTS {name} ("
        for param in params:
            counter += 1
            for name, data_type in param.items():
                if counter == len(params):
                    query += str(name + ' ' + data_type)
                else:
                    query += str(name + ' ' + data_type) + ', '
        query += ');'
        self.execute(query)

    def add(self, table, params):
        attr_names_list = []
        values_list = []
        for param in params:
            for key, value in param.items():
                attr_names_list.append(key)
                values_list.append(value)
        query = f"INSERT INTO {table} {tuple(attr_names_list)} VALUES {tuple(values_list)}"
        self.execute(query)

    def delete(self, table: str, condition):
        self.execute(f"DELETE FROM {table} WHERE {condition}")

    def update(self, table: str, sql_id, attr_name: str, value):
        self.execute(f"UPDATE {table} SET {attr_name} = {value} WHERE id = {sql_id}")

    def get_data(self, table, condition, range_flag):
        self.execute(f"SELECT * FROM {table} WHERE {condition}")
        if range_flag == 0:
            resp = self.cursor.fetchone()
        else:
            resp = tuple(self.cursor.fetchall())

        if resp is not None:
            return resp
        else:
            return ()

