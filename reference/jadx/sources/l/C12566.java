package l;

import android.app.Notification;
import android.media.session.MediaSession;

/* JADX INFO: renamed from: l.۫ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes3.dex */
public final class C12566 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31278(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.MediaStyle m31276() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.MediaStyle m31277(Notification.MediaStyle mediaStyle, int[] iArr, C22316 c22316) {
        if (iArr != null) {
            m31280(mediaStyle, iArr);
        }
        if (c22316 != null) {
            m31279(mediaStyle, (MediaSession.Token) c22316.m49484());
        }
        return mediaStyle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31280(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31279(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }
}
