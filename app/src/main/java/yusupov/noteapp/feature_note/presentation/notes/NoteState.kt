package yusupov.noteapp.feature_note.presentation.notes

import yusupov.noteapp.feature_note.domain.model.Note
import yusupov.noteapp.feature_note.domain.util.NoteOrder
import yusupov.noteapp.feature_note.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
