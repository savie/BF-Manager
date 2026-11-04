package l;

/* JADX INFO: renamed from: l.᩶ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBF0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21296 implements InterfaceC11050 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22460 f67904;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f67905;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9230 f67906;

    @Override // l.InterfaceC11050
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo27936() {
        return false;
    }

    public C21296(C22460 c22460, int i, int i2, C9230 c9230) {
        if (i2 < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        C22460 c22460M50638 = c22460.m50638(i, (i2 * 2) + i);
        this.f67904 = c22460M50638;
        this.f67905 = i2;
        this.f67906 = c9230;
        for (int i3 = 0; i3 < i2; i3++) {
            try {
            } catch (ClassCastException e) {
                throw new RuntimeException("bogus class cpi", e);
            }
        }
    }

    @Override // l.InterfaceC11050
    public final int size() {
        return this.f67905;
    }

    @Override // l.InterfaceC11050
    public final C5085 getType(int i) {
        return ((C1028) this.f67906.get(this.f67904.m50641(i * 2))).m3933();
    }

    @Override // l.InterfaceC11050
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11050 mo1038(C5085 c5085) {
        throw new UnsupportedOperationException("unsupported");
    }
}
