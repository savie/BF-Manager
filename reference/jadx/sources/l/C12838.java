package l;

import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: l.۬ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12838 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31833(C1735 c1735, C9724 c9724) {
        LogSessionId logSessionIdM24676 = c9724.m24676();
        if (logSessionIdM24676.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c1735.f6852.setString("log-session-id", logSessionIdM24676.getStringId());
    }
}
