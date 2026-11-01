package l;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: renamed from: l.ۢܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8HX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9724 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f32731;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f32732;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1961 f32733;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized LogSessionId m24676() {
        C1961 c1961;
        c1961 = this.f32733;
        c1961.getClass();
        return c1961.f7374;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m24677(LogSessionId logSessionId) {
        C1961 c1961 = this.f32733;
        c1961.getClass();
        c1961.m6331(logSessionId);
    }

    static {
        new C9724("");
    }

    public C9724(String str) {
        this.f32732 = str;
        this.f32733 = Build.VERSION.SDK_INT >= 31 ? new C1961() : null;
        this.f32731 = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9724)) {
            return false;
        }
        C9724 c9724 = (C9724) obj;
        return C13638.equals(this.f32732, c9724.f32732) && C13638.equals(this.f32733, c9724.f32733) && C13638.equals(this.f32731, c9724.f32731);
    }

    public final int hashCode() {
        return C13638.hash(this.f32732, this.f32733, this.f32731);
    }
}
