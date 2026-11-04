package l;

import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: l.ۢۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9945 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25775(C12183 c12183, C20738 c20738) {
        LogSessionId logSessionIdM47432 = c20738.m47432();
        if (logSessionIdM47432.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c12183.f39168.setString("log-session-id", logSessionIdM47432.getStringId());
    }
}
