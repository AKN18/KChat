package com.example.k_chat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

@SuppressWarnings("deprecation")
public class TabsAccessorAdapter extends FragmentPagerAdapter {


    // Chat, Gruppe und Kontakte sind als Tabs oben und werden abgerufen
    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;

            case 1:
                GroupsFragment groupsFragment = new GroupsFragment();
                return groupsFragment;

            case 2:
                ContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;

            default:
                return null;
        }
    }


    // Es sind § Tabs
    @Override
    public int getCount() {
        return 3;
    }

    // Seiten Titel des Aktuellentab wird ausgegeben
    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Chats";

            case 1:
                return  "Groups";

            case 2:
                return "Contacts";

            default:
                return null;
        }

    }
}
