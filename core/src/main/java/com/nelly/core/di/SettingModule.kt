package com.nelly.core.di

import com.nelly.core.data.local.storage.StorageSetting
import com.nelly.core.data.local.storage.StorageSettingImpl
import com.nelly.core.util.theme.ThemeSetting
import com.nelly.core.util.theme.ThemeSettingImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class SettingModule {

    @Binds
    @Singleton
    abstract fun bindThemeSetting(themeSettingImpl: ThemeSettingImpl): ThemeSetting

    @Binds
    @Singleton
    abstract fun bindStorageSetting(storageSettingImpl: StorageSettingImpl): StorageSetting
}