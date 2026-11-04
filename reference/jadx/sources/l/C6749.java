package l;

/* JADX INFO: renamed from: l.ۛ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public class C6749 extends AbstractC23157 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C6003 f22474;

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo18850(InterfaceC17189 interfaceC17189) {
        return ((InterfaceC18681) interfaceC17189).mo17439(1);
    }

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo18849(int i, InterfaceC17189 interfaceC17189) {
        C13460 c13460 = new C13460(i, i == -1 ? "<missing EOF>" : C8947.m23910(new StringBuilder("<missing "), C3454.f11497[i], ">"));
        InterfaceC18681 interfaceC18681 = (InterfaceC18681) interfaceC17189;
        InterfaceC21665 interfaceC21665Mo17439 = interfaceC18681.mo17439(1);
        if (interfaceC21665Mo17439.getType() == -1) {
            interfaceC21665Mo17439 = interfaceC18681.mo17439(-1);
        }
        c13460.f42847 = interfaceC21665Mo17439.getLine();
        c13460.f42853 = interfaceC21665Mo17439.mo33097();
        c13460.f42850 = 0;
        c13460.f42845 = interfaceC21665Mo17439.getInputStream();
        return c13460;
    }
}
