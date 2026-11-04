package l;

/* JADX INFO: renamed from: l.ܶۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7M5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15781 implements InterfaceC21003 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23241 f51362;

    public C15781(C23241 c23241) {
        this.f51362 = c23241;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37718() {
        C23241 c23241 = this.f51362;
        int i = c23241.f75287 - 1;
        c23241.f75287 = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (C7578 c7578 : c23241.f75289) {
            i2 += c7578.m20746().f10965;
        }
        C16549[] c16549Arr = new C16549[i2];
        int i3 = 0;
        for (C7578 c7579 : c23241.f75289) {
            int i4 = c7579.m20746().f10965;
            int i5 = 0;
            while (i5 < i4) {
                c16549Arr[i3] = c7579.m20746().m11056(i5);
                i5++;
                i3++;
            }
        }
        c23241.f75288 = new C3356(c16549Arr);
        c23241.f75290.mo3768((InterfaceC9147) c23241);
    }

    @Override // l.InterfaceC22002
    /* JADX INFO: renamed from: ۙ */
    public final void mo7501(InterfaceC10813 interfaceC10813) {
        C23241 c23241 = this.f51362;
        c23241.f75290.mo7501((InterfaceC10813) c23241);
    }
}
