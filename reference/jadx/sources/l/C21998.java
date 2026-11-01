package l;

/* JADX INFO: renamed from: l.᩹ۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8QE */
/* JADX INFO: loaded from: classes2.dex */
public final class C21998 extends AbstractC1990 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC6951 f71337;

    public C21998(String str, InterfaceC6951 interfaceC6951) {
        super(str);
        this.f71337 = interfaceC6951;
    }

    @Override // l.AbstractC1990
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9753 mo6404(byte[] bArr, int i, boolean z) {
        InterfaceC6951 interfaceC6951 = this.f71337;
        if (z) {
            interfaceC6951.reset();
        }
        return interfaceC6951.mo11108(0, i, bArr);
    }
}
