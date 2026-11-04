package l;

/* JADX INFO: renamed from: l.᩶ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35UV */
/* JADX INFO: loaded from: classes.dex */
public final class C21489 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4335 m48893(C22718 c22718, int i, InterfaceC23331 interfaceC23331) {
        String str;
        if (interfaceC23331 instanceof InterfaceC20347) {
            C5564 c5564 = c22718.f73734;
            InterfaceC20347 interfaceC20347 = (InterfaceC20347) interfaceC23331;
            C0606 c0606 = new C0606(c22718, i, interfaceC20347);
            int iMo11703 = interfaceC20347.mo11703() + i;
            EnumC22631 enumC22631Mo30864 = ((InterfaceC20347) c0606.f15700).mo30864();
            switch (C18505.f60191[enumC22631Mo30864.f73508.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    str = "goto_";
                    break;
                case 4:
                case 5:
                    str = "cond_";
                    break;
                case 6:
                    if (enumC22631Mo30864 != EnumC22631.f73386) {
                        str = enumC22631Mo30864 != EnumC22631.f73464 ? "sswitch_data_" : "pswitch_data_";
                    } else {
                        str = "array_";
                    }
                    break;
                default:
                    str = null;
                    break;
            }
            C4818 c4818 = new C4818(c5564, iMo11703, str);
            c0606.f2415 = c4818;
            c0606.f2415 = c22718.m51246().m27487(c4818);
            return c0606;
        }
        if (interfaceC23331 instanceof C16663) {
            return new C14029(c22718, i, (C16663) interfaceC23331);
        }
        int i2 = C14775.f48345[interfaceC23331.mo30864().f73508.ordinal()];
        if (i2 == 1) {
            return new C6573(c22718, i, (InterfaceC9904) interfaceC23331);
        }
        if (i2 == 2) {
            return new C1352(c22718, i, (InterfaceC9794) interfaceC23331);
        }
        if (i2 == 3) {
            return new C7318(c22718, i, (InterfaceC0846) interfaceC23331);
        }
        return C4335.m13827(c22718, i, interfaceC23331);
    }
}
