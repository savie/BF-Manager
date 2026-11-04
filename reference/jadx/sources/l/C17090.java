package l;

/* JADX INFO: renamed from: l.ܺ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17090 extends C7197 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40253(C24705 c24705, AbstractC17836 abstractC17836, InterfaceC2722 interfaceC2722, C11852 c11852, C11216 c11216) {
        for (AbstractC16344 abstractC16344 : this.f78966) {
            C11972.m30026(abstractC16344 instanceof C9433);
            C9433 c9433 = (C9433) abstractC16344;
            if (c9433.f30605 == abstractC17836 && c9433.f30608 == interfaceC2722 && c9433.f30606.f38180 == c11852.f38180) {
                return;
            }
        }
        m54393(new C9433(c24705, abstractC17836, null, interfaceC2722, c11852, c11216));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m40254() {
        return this.f78966.m43096();
    }
}
