package l;

import android.app.Notification;
import android.media.session.MediaSession;

/* JADX INFO: renamed from: l.ܺܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16920 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39901(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.MediaStyle m39899() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.MediaStyle m39900(Notification.MediaStyle mediaStyle, int[] iArr, C15600 c15600) {
        if (iArr != null) {
            m39903(mediaStyle, iArr);
        }
        if (c15600 != null) {
            m39902(mediaStyle, (MediaSession.Token) c15600.m37333());
        }
        return mediaStyle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39903(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39902(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }
}
