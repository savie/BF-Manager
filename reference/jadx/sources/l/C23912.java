package l;

/* JADX INFO: renamed from: l.᩹᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 9183 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23912 extends AbstractC5266 {
    @Override // l.AbstractC23166
    /* JADX INFO: renamed from: ۙ */
    public final String mo7731() {
        return "ParameterWrapBytesString";
    }

    @Override // l.AbstractC13819
    /* JADX INFO: renamed from: ۙ */
    public final String mo33724(int i, String str) {
        if (i != 0) {
            return i != 1 ? str : "Ljava/lang/String;";
        }
        return "[B";
    }

    @Override // l.AbstractC5266
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7732(C5122 c5122, InterfaceC7140 interfaceC7140) {
        EnumC7011 enumC7011;
        Iterable<InterfaceC23331> iterableMo2840 = interfaceC7140.mo2840();
        int iMo2841 = interfaceC7140.mo2841() - c5122.getParameters().size();
        int i = iMo2841 + 1;
        boolean z = false;
        boolean z2 = false;
        for (InterfaceC23331 interfaceC23331 : iterableMo2840) {
            EnumC22631 enumC22631Mo30864 = interfaceC23331.mo30864();
            if (!enumC22631Mo30864.m51000() || (enumC7011 = enumC22631Mo30864.f73508) == EnumC7011.Format22t || enumC7011 == EnumC7011.Format21t) {
                break;
            }
            if (enumC22631Mo30864 == EnumC22631.f73323) {
                InterfaceC21729 interfaceC21729 = (InterfaceC21729) interfaceC23331;
                InterfaceC19775 interfaceC19775 = (InterfaceC19775) interfaceC21729.getReference();
                if (interfaceC21729.mo1542() == iMo2841) {
                    if (interfaceC19775.getType().equals("[B")) {
                        z = true;
                    }
                } else if (interfaceC21729.mo1542() != i) {
                    continue;
                } else if (interfaceC19775.getType().equals("Ljava/lang/String;")) {
                    z2 = true;
                }
            }
        }
        return z && z2;
    }
}
