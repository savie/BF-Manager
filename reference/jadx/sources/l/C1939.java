package l;

/* JADX INFO: renamed from: l.֫ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6S3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1939 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C3350 f7319;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f7321;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16072 f7322;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9702 f7324;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f7323 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f7320 = -1;

    public C1939(C3350 c3350, C16072 c16072, C9702 c9702) {
        this.f7319 = c3350;
        this.f7322 = c16072;
        this.f7324 = c9702;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C16072 m6300() {
        C16072 c16072;
        synchronized (this.f7319) {
            if (this.f7321 || this.f7319.f12391 != this || this.f7319.f12389 || this.f7319.f12392 != this.f7324) {
                throw new IllegalStateException("Recovery candidate has not been durably published");
            }
            this.f7321 = true;
            this.f7319.f12391 = null;
            c16072 = this.f7322;
        }
        return c16072;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f7319) {
            if (this.f7321) {
                return;
            }
            boolean z = true;
            this.f7321 = true;
            this.f7319.f12391 = null;
            if (this.f7319.f12389 || (this.f7319.f12392 != null && this.f7319.f12392.f32687.equals(this.f7324.f32687))) {
                z = false;
            }
            if (z) {
                C3350 c3350 = this.f7319;
                C9702 c9702 = this.f7324;
                C16072 c16072 = this.f7322;
                c16072.m38102().m30016((InterfaceC7486) new C15523(c3350, c9702, c16072));
            }
            this.f7322.close();
        }
    }
}
