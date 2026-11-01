package l;

/* JADX INFO: renamed from: l.ܺۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBF0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15650 implements InterfaceC14093 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f50845;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14009 f50846;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11083 f50847;

    @Override // l.InterfaceC14093
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo34077() {
        return false;
    }

    public C15650(C14009 c14009, int i, int i2, C11083 c11083) {
        if (i2 < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        C14009 c14009M33866 = c14009.m33866(i, (i2 * 2) + i);
        this.f50846 = c14009M33866;
        this.f50845 = i2;
        this.f50847 = c11083;
        for (int i3 = 0; i3 < i2; i3++) {
            try {
            } catch (ClassCastException e) {
                throw new RuntimeException("bogus class cpi", e);
            }
        }
    }

    @Override // l.InterfaceC14093
    public final int size() {
        return this.f50845;
    }

    @Override // l.InterfaceC14093
    public final C3320 getType(int i) {
        return ((C6143) this.f50847.get(this.f50846.m33871(i * 2))).m17128();
    }

    @Override // l.InterfaceC14093
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14093 mo3156(C3320 c3320) {
        throw new UnsupportedOperationException("unsupported");
    }
}
