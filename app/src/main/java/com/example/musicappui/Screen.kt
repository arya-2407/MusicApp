package com.example.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title : String, val route : String){

    sealed class DrawerScreen(dTitle : String, dRoute : String, @DrawableRes val icon : Int)
        : Screen(dTitle,dRoute){
            object Account : DrawerScreen(
                dTitle = "Account",
                dRoute = "Account",
                icon = R.drawable.baseline_account_circle_24
            )
            object Subscription : DrawerScreen(
                dTitle = "Subscription",
                dRoute = "Subscribe",
                icon = R.drawable.baseline_library_music_24
            )
            object AddAccount : DrawerScreen(
                dTitle = "Add Account",
                dRoute = "add_account",
                icon = R.drawable.baseline_person_add_alt_1_24
            )
        }
}

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)