package com.example.cryptoapp.di

import dagger.Component

@Component (modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {


}