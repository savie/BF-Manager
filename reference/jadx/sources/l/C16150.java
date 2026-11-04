package l;

/* JADX INFO: renamed from: l.ܶܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16150 {
    public final InterfaceC9437 a;
    public final C23742 b;
    public int c;

    public C16150(InterfaceC9437 interfaceC9437, C23742 c23742) {
        InterfaceC8912 interfaceC8912 = c23742.e;
        if (interfaceC8912 != null) {
            InterfaceC8912 interfaceC8913 = (InterfaceC8912) interfaceC9437.P(AbstractC17577.b);
            AbstractC22338 abstractC22338 = (AbstractC22338) interfaceC9437.P(AbstractC17577.a);
            InterfaceC17116 interfaceC17116B = null;
            interfaceC8912 = C17359.equals(interfaceC8912, interfaceC8913) ? null : interfaceC8912;
            C17359.equals(null, abstractC22338);
            if (interfaceC8912 != null) {
                InterfaceC8912 interfaceC8914 = interfaceC8912 != null ? interfaceC8912 : interfaceC8913;
                if (interfaceC8912 != null) {
                    if (interfaceC9437.d(EnumC8692.EPOCH_DAY)) {
                        interfaceC17116B = interfaceC8914.B(interfaceC9437);
                    } else if (interfaceC8912 != C20012.c || interfaceC8913 != null) {
                        for (EnumC8692 enumC8692 : EnumC8692.values()) {
                            if (enumC8692.isDateBased() && interfaceC9437.d(enumC8692)) {
                                throw new C21241("Unable to apply override chronology '" + interfaceC8912 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + interfaceC9437);
                            }
                        }
                    }
                }
                interfaceC9437 = new C17642(interfaceC17116B, interfaceC9437, interfaceC8914, abstractC22338);
            }
        }
        this.a = interfaceC9437;
        this.b = c23742;
    }

    public final Object b(C14435 c14435) {
        InterfaceC9437 interfaceC9437 = this.a;
        Object objP = interfaceC9437.P(c14435);
        if (objP != null || this.c != 0) {
            return objP;
        }
        throw new C21241("Unable to extract " + c14435 + " from temporal " + interfaceC9437);
    }

    public final Long a(InterfaceC16831 interfaceC16831) {
        int i = this.c;
        InterfaceC9437 interfaceC9437 = this.a;
        if (i <= 0 || interfaceC9437.d(interfaceC16831)) {
            return Long.valueOf(interfaceC9437.C(interfaceC16831));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
