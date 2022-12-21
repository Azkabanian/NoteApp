package yusupov.noteapp.feature_note.domain.use_case

import yusupov.noteapp.feature_note.domain.model.InvalidNoteException
import yusupov.noteapp.feature_note.domain.model.Note
import yusupov.noteapp.feature_note.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Empty title")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Empty content")
        }
        repository.insertNote(note)
    }
}