package l;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: renamed from: l.᩵ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8HX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20738 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f66465;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f66466;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3584 f66467;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized LogSessionId m47432() {
        C3584 c3584;
        c3584 = this.f66467;
        c3584.getClass();
        return c3584.f12273;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47433(LogSessionId logSessionId) {
        C3584 c3584 = this.f66467;
        c3584.getClass();
        c3584.m11644(logSessionId);
    }

    static {
        new C20738("");
    }

    public C20738(String str) {
        this.f66466 = str;
        this.f66467 = Build.VERSION.SDK_INT >= 31 ? new C3584() : null;
        this.f66465 = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20738)) {
            return false;
        }
        C20738 c20738 = (C20738) obj;
        return C17359.equals(this.f66466, c20738.f66466) && C17359.equals(this.f66467, c20738.f66467) && C17359.equals(this.f66465, c20738.f66465);
    }

    public final int hashCode() {
        return C17359.hash(this.f66466, this.f66467, this.f66465);
    }
}
