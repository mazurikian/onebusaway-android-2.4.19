package com.microsoft.embeddedsocial.sdk;

import android.app.Activity;
import android.content.Context;

import androidx.fragment.app.Fragment;

import com.microsoft.embeddedsocial.autorest.models.PublisherType;
import com.microsoft.embeddedsocial.sdk.ui.AppProfile;

import java.util.HashMap;

/**
 * No-op replacement for the old Microsoft Embedded Social SDK.
 *
 * The original artifact (com.acrowntest.test:sdk:0.7.4) was hosted on Bintray and
 * is no longer resolvable.  These stubs allow builds where Embedded Social is
 * disabled (the default for Agency Y) to compile without pulling that SDK.
 */
public final class EmbeddedSocial {
    private EmbeddedSocial() {
    }

    public static void init(Context context, int configResId, String apiKey, Object options) {
        // no-op
    }

    public static void setReportHandler(IReportHandler handler) {
        // no-op
    }

    public static void setNavigationDrawerHandler(INavigationDrawerHandler handler) {
        // no-op
    }

    public static void setAppProfile(AppProfile profile) {
        // no-op
    }

    public static boolean isSignedIn() {
        return false;
    }

    public static void launchSignInActivity(Activity activity) {
        // no-op
    }

    public static void launchOptionsActivity(Activity activity) {
        // no-op
    }

    public static Fragment getCommentFeedFragmentByName(String discussionTitle,
                                                        PublisherType publisherType,
                                                        HashMap<Integer, Integer> errorStrings) {
        return new Fragment();
    }
}
