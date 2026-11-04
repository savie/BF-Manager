package l;

/* JADX INFO: renamed from: l.ۨܺۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2SQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12469 implements InterfaceC4288 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24404 f40053;

    @Override // l.InterfaceC4288
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2798(Object obj) {
        InterfaceC10650 interfaceC10650 = (InterfaceC10650) obj;
        int iMo4171 = interfaceC10650.mo4171();
        if (iMo4171 == 3) {
            return new C20674(this, (InterfaceC1702) interfaceC10650);
        }
        if (iMo4171 != 5) {
            return iMo4171 != 6 ? interfaceC10650 : new C3520(this, (InterfaceC12888) interfaceC10650);
        }
        return new C23658(this, (InterfaceC22585) interfaceC10650);
    }

    public C12469(C24404 c24404) {
        this.f40053 = c24404;
    }
}
