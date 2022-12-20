package yusupov.noteapp.di

import androidx.room.Room
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import yusupov.noteapp.feature_note.data.data_source.NoteDatabase
import yusupov.noteapp.feature_note.data.repository.NoteRepositoryImpl
import yusupov.noteapp.feature_note.domain.repository.NoteRepository
import yusupov.noteapp.feature_note.domain.use_case.NoteUseCases

val koinAppModule = module {

    single {
        Room.databaseBuilder(
            androidApplication(),
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }
    factory { (get() as NoteDatabase).noteDao }
    single<NoteRepository> { NoteRepositoryImpl(dao = get()) }
    factory { NoteUseCases(getNotesUseCase = get(), deleteNoteUseCase = get()) }
}