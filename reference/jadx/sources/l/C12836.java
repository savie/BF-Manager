package l;

/* JADX INFO: renamed from: l.۬ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12836 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1733 f42709;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3662 f42710;

    public C12836(C3662 c3662) {
        this.f42710 = c3662;
        C13542 c13542 = c3662.f13406;
        c13542.getClass();
        this.f42709 = new C1733(c13542);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31832(C14435 c14435) {
        this.f42709.m5745(c14435);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f42709.m5746()) {
            C3662.m10797(this.f42710);
        }
    }
}
