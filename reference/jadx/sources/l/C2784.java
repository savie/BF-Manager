package l;

/* JADX INFO: renamed from: l.ۖ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 35UV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2784 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14075 m8456(C10547 c10547, int i, InterfaceC1594 interfaceC1594) {
        String str;
        if (interfaceC1594 instanceof InterfaceC3005) {
            C20424 c20424 = c10547.f36110;
            InterfaceC3005 interfaceC3005 = (InterfaceC3005) interfaceC1594;
            C22541 c22541 = new C22541(c10547, i, interfaceC3005);
            int iMo8965 = interfaceC3005.mo8965() + i;
            EnumC10297 enumC10297Mo5435 = ((InterfaceC3005) c22541.f46227).mo5435();
            switch (C5607.f19209[enumC10297Mo5435.f35328.ordinal()]) {
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
                    if (enumC10297Mo5435 != EnumC10297.f35086) {
                        str = enumC10297Mo5435 != EnumC10297.f35282 ? "sswitch_data_" : "pswitch_data_";
                    } else {
                        str = "array_";
                    }
                    break;
                default:
                    str = null;
                    break;
            }
            C8430 c8430 = new C8430(c20424, iMo8965, str);
            c22541.f73510 = c8430;
            c22541.f73510 = c10547.m26683().m23459(c8430);
            return c22541;
        }
        if (interfaceC1594 instanceof C6063) {
            return new C19013(c10547, i, (C6063) interfaceC1594);
        }
        int i2 = C11958.f40081[interfaceC1594.mo5435().f35328.ordinal()];
        if (i2 == 1) {
            return new C3096(c10547, i, (InterfaceC23031) interfaceC1594);
        }
        if (i2 == 2) {
            return new C7018(c10547, i, (InterfaceC22969) interfaceC1594);
        }
        if (i2 == 3) {
            return new C18307(c10547, i, (InterfaceC15208) interfaceC1594);
        }
        return C14075.m34037(c10547, i, interfaceC1594);
    }
}
