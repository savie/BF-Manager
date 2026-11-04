package l;

/* JADX INFO: renamed from: l.۟ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8QE */
/* JADX INFO: loaded from: classes4.dex */
public final class C7831 extends AbstractC6493 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2763 f26107;

    public C7831(String str, InterfaceC2763 interfaceC2763) {
        super(str);
        this.f26107 = interfaceC2763;
    }

    @Override // l.AbstractC6493
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC24393 mo18329(byte[] bArr, int i, boolean z) {
        InterfaceC2763 interfaceC2763 = this.f26107;
        if (z) {
            interfaceC2763.reset();
        }
        return interfaceC2763.mo5929(0, i, bArr);
    }
}
