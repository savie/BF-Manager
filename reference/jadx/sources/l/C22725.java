package l;

/* JADX INFO: renamed from: l.᩺ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22725 extends AbstractC17785 implements InterfaceC5791 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20608 f74035;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f74036;

    public C22725(InterfaceC20608 interfaceC20608) {
        this.f74035 = interfaceC20608;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22725 m50380(InterfaceC20608 interfaceC20608) {
        return new C22725(interfaceC20608);
    }

    @Override // l.InterfaceC5791
    /* JADX INFO: renamed from: ۙ */
    public final void mo9550(C18491 c18491) {
        c18491.m42886(this);
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۨ */
    public final int mo10845() {
        InterfaceC20608 interfaceC20608 = this.f74035;
        String strMo37426 = interfaceC20608.mo37426();
        int i = C17080.f54498;
        C12142 c12142 = new C12142(strMo37426);
        c12142.next();
        int iIntValue = c12142.hasNext() ? ((Integer) c12142.next()).intValue() : -1;
        if (!interfaceC20608.mo37429()) {
            if (iIntValue != -1) {
                return 1000;
            }
            return interfaceC20608.length();
        }
        if (iIntValue > 0) {
            return iIntValue;
        }
        if (interfaceC20608.mo37428() && !interfaceC20608.mo37426().startsWith("// ")) {
            return interfaceC20608.length() + 1;
        }
        return ((Integer) C4379.m12231(interfaceC20608).map(new C17437(4)).orElse(Integer.valueOf(interfaceC20608.length()))).intValue();
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final String mo10842() {
        InterfaceC20608 interfaceC20608 = this.f74035;
        if (interfaceC20608.mo37428() && !interfaceC20608.mo37426().startsWith("// ")) {
            return "// " + interfaceC20608.mo37426().substring(2);
        }
        return (String) C4379.m12231(interfaceC20608).orElse(interfaceC20608.mo37426());
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ܰ */
    public final C9548 mo10846() {
        Integer numValueOf = Integer.valueOf(this.f74035.getIndex());
        return C9548.m24395(numValueOf, numValueOf).m24403(AbstractC17785.f56393);
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final C6496 mo10843(InterfaceC13553 interfaceC13553, C6496 c6496) {
        Object next;
        String strM44198 = ((C19243) interfaceC13553).m44198(this.f74035, c6496.f21907);
        this.f74036 = strM44198;
        int length = strM44198.length();
        String str = this.f74036;
        int i = C17080.f54498;
        C12142 c12142 = new C12142(str);
        do {
            next = c12142.next();
        } while (c12142.hasNext());
        return c6496.m17699(c6496.f21907 + (length - ((Integer) next).intValue()));
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final void mo10844(C18806 c18806) {
        c18806.m43377(m41374(), this.f74036);
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51284(this.f74035, "tok");
        return c23244M37072.toString();
    }
}
