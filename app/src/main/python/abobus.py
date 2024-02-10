import SqliteController
from matplotlib.pyplot import savefig, subplots


class App(SqliteController.Controller):
    def __init__(self, db):
        super().__init__(db)
        self.expenses_table = [
            {"id": "INTEGER PRIMARY KEY"},
            {"name": "TEXT NOT NULL"},
            {"amount": "INTEGER NOT NULL"},
            {"category": "TEXT NOT NULL"},
            {"date": "TEXT NOT NULL"}
        ]

        self.earnings_table = [
            {"id": "INTEGER PRIMARY KEY"},
            {"name": "TEXT NOT NULL"},
            {"amount": "INTEGER NOT NULL"},
            {"date": "TEXT NOT NULL"}
        ]
        super().create_table("expenses", self.expenses_table)
        super().create_table("earnings", self.earnings_table)

    def get_data_by_id(self, table, sql_id) -> int:
        try:
            return super().get_data(table, f"id = {sql_id}")
        except:
            return 500

    def clear_table(self, table):
        try:
            super().delete(table, "1 = 1")
            return 200
        except:
            return 500

    def delete(self, table: str, sql_id) -> int:
        try:
            super().delete(table, f"id = {sql_id}")
            return 200
        except:
            return 500

    def update(self, table: str, sql_id, attr_name: str, value) -> int:
        try:
            super().update(table, sql_id, attr_name, value)
            return 200
        except:
            return 500

    def add_into_table(self, amount, date: str, name, operation_type, category=None) -> int:
        elements_add_list = [
            {"name": name},
            {"amount": amount},
            {"category": category},
            {"date": date}
        ]
        if operation_type == "expenses":
            elements_add_list.append({"category": category})
        elif operation_type == "earnings":
            pass
        try:
            super().add(operation_type, elements_add_list)
            return 200
        except:
            return 500

    def get_info_by_date(self, date: str) -> list or int:
        try:
            return [
                {"expenses": super().get_data("expenses", f"date LIKE '%.{date}'")},
                {"earnings": super().get_data("earnings", f"date LIKE '%.{date}'")}
            ]
        except:
            return 500

    def popular_by_date(self, date: str) -> dict or int:
        categories = {}
        operation_list = super().get_data("expenses", f"date LIKE '%.{date}'")
        try:
            for operation in operation_list:
                if operation[3] not in categories.keys():
                    categories[operation[3]] = 1
                else:
                    categories[operation[3]] += 1
            return categories
        except:
            return 500

    @staticmethod
    def get_diagram(labels: list, sizes: list):
        fig1, ax1 = subplots()
        ax1.pie(sizes, labels=labels, autopct='%1.1f%%')
        savefig("diagram.png")

    def diagram_by_date(self, date):
        try:
            diagram_data = self.popular_by_date(date)
            self.get_diagram(diagram_data.keys(), diagram_data.values())
            return 200
        except:
            return 500