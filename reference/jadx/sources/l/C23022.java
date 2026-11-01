package l;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes.dex */
public final class C23022 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PlaybackState.Builder m50925() {
        return new PlaybackState.Builder();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50930(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        builder.setState(i, j, f, j2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m50938(PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50931(PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50933(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50932(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m50942(PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static List m50922(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PlaybackState m50928(PlaybackState.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static int m50923(PlaybackState playbackState) {
        return playbackState.getState();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static long m50939(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static long m50937(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static float m50920(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m50924(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static CharSequence m50935(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static long m50943(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m50940(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PlaybackState.CustomAction.Builder m50926(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50934(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PlaybackState.CustomAction m50927(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bundle m50941(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50929(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static CharSequence m50921(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m50936(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }
}
