package l;

/* JADX INFO: renamed from: l.᩹ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes.dex */
public final class C22198 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C13026 f72624;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f72625;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f72626;

    public C22198(C13026 c13026) {
        this.f72624 = c13026;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m49255() {
        return this.f72625;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49254() {
        this.f72625 = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f72626) {
                return;
            }
            this.f72626 = true;
            C13026.m32209(this.f72624, this);
        }
    }
}
