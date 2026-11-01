package l;

/* JADX INFO: renamed from: l.ۡ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9183 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9184 extends AbstractC2832 {
    @Override // l.AbstractC1421
    /* JADX INFO: renamed from: ۙ */
    public final String mo4983() {
        return "ParameterWrapBytesString";
    }

    @Override // l.AbstractC12006
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo23640(int i, String str) {
        if (i != 0) {
            return i != 1 ? str : "Ljava/lang/String;";
        }
        return "[B";
    }

    @Override // l.AbstractC2832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8587(C10124 c10124, InterfaceC7945 interfaceC7945) {
        EnumC18057 enumC18057;
        Iterable<InterfaceC1594> iterableMo11508 = interfaceC7945.mo11508();
        int iMo11507 = interfaceC7945.mo11507() - c10124.getParameters().size();
        int i = iMo11507 + 1;
        boolean z = false;
        boolean z2 = false;
        for (InterfaceC1594 interfaceC1594 : iterableMo11508) {
            EnumC10297 enumC10297Mo5435 = interfaceC1594.mo5435();
            if (!enumC10297Mo5435.m26111() || (enumC18057 = enumC10297Mo5435.f35328) == EnumC18057.Format22t || enumC18057 == EnumC18057.Format21t) {
                break;
            }
            if (enumC10297Mo5435 == EnumC10297.f35066) {
                InterfaceC10331 interfaceC10331 = (InterfaceC10331) interfaceC1594;
                InterfaceC15914 interfaceC15914 = (InterfaceC15914) interfaceC10331.getReference();
                if (interfaceC10331.mo1140() == iMo11507) {
                    if (interfaceC15914.getType().equals("[B")) {
                        z = true;
                    }
                } else if (interfaceC10331.mo1140() != i) {
                    continue;
                } else if (interfaceC15914.getType().equals("Ljava/lang/String;")) {
                    z2 = true;
                }
            }
        }
        return z && z2;
    }
}
