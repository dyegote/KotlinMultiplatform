package previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import model.Expense
import model.ExpensesCategory
import ui.AllExpensesHeader
import ui.ExpensesItem
import ui.ExpensesTotalHeader

@Preview(showBackground = true)
@Composable
fun ExpensesTotalHeaderPreview(){
    ExpensesTotalHeader(total = 2500.0)
}

@Preview(showBackground = true)
@Composable
fun AllExpensesHeaderPreview() {
    AllExpensesHeader()
}

@Preview(showBackground = false)
@Composable
fun ExpensesItemPreview() {
    val expense = Expense(
        0,
        23500.0,
        ExpensesCategory.CAR,
        "Sample description"

    )
    ExpensesItem(expense = expense) {
        
    }
}