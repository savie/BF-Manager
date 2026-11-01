package l;

/* JADX INFO: renamed from: l.ۧܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11126 {
    public final InterfaceC21584 a;
    public final C23351 b;
    public int c;

    public C11126(InterfaceC21584 interfaceC21584, C23351 c23351) {
        InterfaceC21233 interfaceC21233 = c23351.e;
        if (interfaceC21233 != null) {
            InterfaceC21233 interfaceC21234 = (InterfaceC21233) interfaceC21584.T(AbstractC23702.b);
            AbstractC9114 abstractC9114 = (AbstractC9114) interfaceC21584.T(AbstractC23702.a);
            InterfaceC17579 interfaceC17579E = null;
            interfaceC21233 = C13638.equals(interfaceC21233, interfaceC21234) ? null : interfaceC21233;
            C13638.equals(null, abstractC9114);
            if (interfaceC21233 != null) {
                InterfaceC21233 interfaceC21235 = interfaceC21233 != null ? interfaceC21233 : interfaceC21234;
                if (interfaceC21233 != null) {
                    if (interfaceC21584.e(EnumC18762.EPOCH_DAY)) {
                        interfaceC17579E = interfaceC21235.E(interfaceC21584);
                    } else if (interfaceC21233 != C7122.c || interfaceC21234 != null) {
                        for (EnumC18762 enumC18762 : EnumC18762.values()) {
                            if (enumC18762.isDateBased() && interfaceC21584.e(enumC18762)) {
                                throw new C15464("Unable to apply override chronology '" + interfaceC21233 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + interfaceC21584);
                            }
                        }
                    }
                }
                interfaceC21584 = new C6186(interfaceC17579E, interfaceC21584, interfaceC21235, abstractC9114);
            }
        }
        this.a = interfaceC21584;
        this.b = c23351;
    }

    public final Object b(C22935 c22935) {
        InterfaceC21584 interfaceC21584 = this.a;
        Object objT = interfaceC21584.T(c22935);
        if (objT != null || this.c != 0) {
            return objT;
        }
        throw new C15464("Unable to extract " + c22935 + " from temporal " + interfaceC21584);
    }

    public final Long a(InterfaceC11002 interfaceC11002) {
        int i = this.c;
        InterfaceC21584 interfaceC21584 = this.a;
        if (i <= 0 || interfaceC21584.e(interfaceC11002)) {
            return Long.valueOf(interfaceC21584.G(interfaceC11002));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
