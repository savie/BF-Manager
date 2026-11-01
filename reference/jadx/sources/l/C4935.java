package l;

/* JADX INFO: renamed from: l.ۙ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2SQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4935 implements InterfaceC2196 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11992 f17266;

    @Override // l.InterfaceC2196
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1014(Object obj) {
        InterfaceC7239 interfaceC7239 = (InterfaceC7239) obj;
        int iMo1599 = interfaceC7239.mo1599();
        if (iMo1599 == 3) {
            return new C3026(this, (InterfaceC12179) interfaceC7239);
        }
        if (iMo1599 != 5) {
            return iMo1599 != 6 ? interfaceC7239 : new C9378(this, (InterfaceC0183) interfaceC7239);
        }
        return new C1615(this, (InterfaceC20645) interfaceC7239);
    }

    public C4935(C11992 c11992) {
        this.f17266 = c11992;
    }
}
