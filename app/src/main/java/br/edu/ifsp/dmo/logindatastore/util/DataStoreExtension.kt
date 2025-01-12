package br.edu.ifsp.dmo.logindatastore.util

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import br.edu.ifsp.dmo.logindatastore.data.DataStoreRepository

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = DataStoreRepository.PreferencesFile.FILE_NAME)