package l;

/* JADX INFO: renamed from: l.ܳܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31EV */
/* JADX INFO: loaded from: classes5.dex */
public class C15409 implements InterfaceC8829 {
    @Override // l.InterfaceC8829
    /* JADX INFO: renamed from: ۙ */
    public void mo2774(InterfaceC18525 interfaceC18525, InterfaceC8697 interfaceC8697, C2863 c2863, C1372 c1372) {
        if (interfaceC8697.mo18155()) {
            throw new RuntimeException();
        }
        InterfaceC5650 value = interfaceC8697.getValue();
        String strMo15176 = mo15176(value);
        interfaceC18525.mo14234(strMo15176);
        interfaceC18525.mo14233("name", interfaceC8697.mo18156());
        C14049.m34216(interfaceC18525, interfaceC8697, c1372);
        C14049.m34213(interfaceC18525, C14049.m34210(c2863, value));
        interfaceC18525.mo14232(strMo15176);
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo15176(InterfaceC5650 interfaceC5650) {
        return C14049.m34212(interfaceC5650);
    }
}
