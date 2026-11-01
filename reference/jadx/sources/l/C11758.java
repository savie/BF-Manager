package l;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: l.ۨܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8KC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11758 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29363(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29362(MediaDrm mediaDrm, byte[] bArr, C9724 c9724) {
        LogSessionId logSessionIdM24676 = c9724.m24676();
        if (logSessionIdM24676.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionIdM24676);
    }
}
