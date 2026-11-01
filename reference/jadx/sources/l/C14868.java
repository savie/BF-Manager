package l;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14868 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m35547(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m35548(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m35549(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m35551(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.Action m35550(Notification.Action.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35554(Notification notification) {
        return notification.getGroup();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m35552(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m35553(Notification.Builder builder, boolean z) {
        return builder.setGroupSummary(z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m35556(Notification.Builder builder, boolean z) {
        return builder.setLocalOnly(z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m35555(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }
}
