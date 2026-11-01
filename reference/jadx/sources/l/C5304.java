package l;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: l.ۚۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5304 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14724(AudioTrack audioTrack, C9724 c9724) {
        LogSessionId logSessionIdM24676 = c9724.m24676();
        if (logSessionIdM24676.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdM24676);
    }
}
