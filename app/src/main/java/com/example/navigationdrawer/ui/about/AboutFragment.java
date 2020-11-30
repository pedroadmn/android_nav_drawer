package com.example.navigationdrawer.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutFragment extends Fragment {

    public AboutFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String description = "The ATM company has the mission of support organization that wish achieve success through of excellence in manager and quality";

        Element versionElement = new Element();
        versionElement.setTitle("Version 1.0");

        return new AboutPage(getActivity())
//                .isRTL(false)
//                .enableDarkMode(false)
//                .setCustomFont(String) // or Typeface
                .setImage(R.drawable.logo)
                .setDescription(description)
                .addGroup("Contact Us")
                .addEmail("atendimento@atm.com.br", "Send an email")
                .addWebsite("https://www.google.com", "Acess nosso site")
                .addGroup("Social medias")
                .addInstagram("pedroadmn", "Instagram")
                .addItem(versionElement)
//                .addItem(adsElement)
//                .addGroup("Connect with us")
//                .addEmail("elmehdi.sakout@gmail.com")
//                .addWebsite("https://mehdisakout.com/")
//                .addFacebook("the.medy")
//                .addTwitter("medyo80")
//                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
//                .addPlayStore("com.ideashower.readitlater.pro")
//                .addGitHub("medyo")
//                .addInstagram("medyo80")
                .create();
//        return inflater.inflate(R.layout.fragment_about, container, false);
    }
}