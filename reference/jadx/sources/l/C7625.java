package l;

/* JADX INFO: renamed from: l.۟ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7625 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21030 f25180;

    public C7625(C21030 c21030) {
        this.f25180 = c21030;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C21030 c21030;
        synchronized (this) {
            c21030 = this.f25180;
            this.f25180 = null;
        }
        if (c21030 != null) {
            C21030.m47404(c21030, (Throwable) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20153(Throwable th) {
        C21030 c21030;
        synchronized (this) {
            c21030 = this.f25180;
            this.f25180 = null;
        }
        if (c21030 != null) {
            C21030.m47404(c21030, th);
        }
    }
}
