package github.daniedev.learncompose.ui.chatscreen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider

@Preview(showBackground = true)
@Composable
fun Conversation(@PreviewParameter(ConversationProvider::class) messages: List<Message>) {
    LazyColumn {
        messages.map { item { MessageCard(it) } }
    }
}

class ConversationProvider: PreviewParameterProvider<List<Message>> {
    override val values: Sequence<List<Message>>
        get() = sequenceOf(SampleData.conversationSample)
}