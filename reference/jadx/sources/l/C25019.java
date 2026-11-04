package l;

/* JADX INFO: renamed from: l.᩻ۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBNX */
/* JADX INFO: loaded from: classes.dex */
public final class C25019 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55850(InterfaceC7140 interfaceC7140) {
        int iMo1655;
        if (interfaceC7140 != null) {
            int iMo2841 = interfaceC7140.mo2841();
            int i = 0;
            for (InterfaceC23331 interfaceC23331 : interfaceC7140.mo2840()) {
                if (interfaceC23331.mo30864().f73513 == 3) {
                    InterfaceC4859 interfaceC4859 = (InterfaceC4859) ((InterfaceC6177) interfaceC23331).getReference();
                    EnumC22631 enumC22631Mo30864 = interfaceC23331.mo30864();
                    if (enumC22631Mo30864 != EnumC22631.f73459 && enumC22631Mo30864 != EnumC22631.f73371) {
                        boolean z = enumC22631Mo30864 == EnumC22631.f73304 || enumC22631Mo30864 == EnumC22631.f73499;
                        InterfaceC6163 interfaceC6163 = C4244.f15461;
                        iMo1655 = C4244.m13548(interfaceC4859.mo6805(), z);
                    } else {
                        iMo1655 = ((InterfaceC0210) interfaceC23331).mo1655();
                    }
                    if (iMo1655 > i) {
                        i = iMo1655;
                    }
                }
            }
            if (i > 5 && i > iMo2841) {
                return false;
            }
        }
        return true;
    }
}
