package l;

/* JADX INFO: renamed from: l.۫ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13201 extends AbstractC11709 implements InterfaceC18422 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20660 f42155;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f42156;

    public C13201(InterfaceC20660 interfaceC20660) {
        this.f42155 = interfaceC20660;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13201 m32711(InterfaceC20660 interfaceC20660) {
        return new C13201(interfaceC20660);
    }

    @Override // l.InterfaceC18422
    /* JADX INFO: renamed from: ۙ */
    public final void mo2485(C25136 c25136) {
        c25136.m56044(this);
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۤ */
    public final int mo6935() {
        InterfaceC20660 interfaceC20660 = this.f42155;
        String strMo18733 = interfaceC20660.mo18733();
        int i = C21406.f68189;
        C14692 c14692 = new C14692(strMo18733);
        c14692.next();
        int iIntValue = c14692.hasNext() ? ((Integer) c14692.next()).intValue() : -1;
        if (!interfaceC20660.mo18731()) {
            if (iIntValue != -1) {
                return 1000;
            }
            return interfaceC20660.length();
        }
        if (iIntValue > 0) {
            return iIntValue;
        }
        if (interfaceC20660.mo18726() && !interfaceC20660.mo18733().startsWith("// ")) {
            return interfaceC20660.length() + 1;
        }
        return ((Integer) C2804.m9273(interfaceC20660).map(new C11794(3)).orElse(Integer.valueOf(interfaceC20660.length()))).intValue();
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ */
    public final String mo6932() {
        InterfaceC20660 interfaceC20660 = this.f42155;
        if (interfaceC20660.mo18726() && !interfaceC20660.mo18733().startsWith("// ")) {
            return "// " + interfaceC20660.mo18733().substring(2);
        }
        return (String) C2804.m9273(interfaceC20660).orElse(interfaceC20660.mo18733());
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ᩷ */
    public final C2346 mo6938() {
        Integer numValueOf = Integer.valueOf(this.f42155.getIndex());
        return C2346.m7908(numValueOf, numValueOf).m7916(AbstractC11709.f37886);
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ */
    public final C15438 mo6933(InterfaceC8770 interfaceC8770, C15438 c15438) {
        Object next;
        String strM41746 = ((C17896) interfaceC8770).m41746(this.f42155, c15438.f50284);
        this.f42156 = strM41746;
        int length = strM41746.length();
        String str = this.f42156;
        int i = C21406.f68189;
        C14692 c14692 = new C14692(str);
        do {
            next = c14692.next();
        } while (c14692.hasNext());
        return c15438.m36959(c15438.f50284 + (length - ((Integer) next).intValue()));
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ */
    public final void mo6934(C11338 c11338) {
        c11338.m28631(m29384(), this.f42156);
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10379(this.f42155, "tok");
        return c3179M46714.toString();
    }
}
