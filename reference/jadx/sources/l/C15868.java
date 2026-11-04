package l;

/* JADX INFO: renamed from: l.ܶۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15868 extends C8301 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f51597;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f51598;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15868(C22010 c22010, AbstractC11781 abstractC11781, boolean z) {
        super(abstractC11781, c22010);
        this.f51597 = c22010;
        this.f51598 = z;
    }

    @Override // l.C8301, l.AbstractC2335
    /* JADX INFO: renamed from: ۙ */
    public final C17007 mo3799(EnumC22229 enumC22229, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, C14769 c147610) {
        String str;
        boolean z = this.f51598;
        AbstractC11781 abstractC11782 = this.f31828;
        if (z) {
            str = abstractC11782.mo7874() ? "bad.static.method.in.unbound.lookup" : "bad.instance.method.in.unbound.lookup";
        } else {
            str = "bad.static.method.in.bound.lookup";
        }
        String str2 = str;
        if (abstractC11782.f38066.m33353()) {
            return ((AbstractC2335) abstractC11782).mo3799(enumC22229, interfaceC5075, abstractC11781, abstractC22664, abstractC19728, c14769, c147610);
        }
        C22010 c22010 = this.f51597;
        return c22010.f71000.m45978(enumC22229, c22010.f71001.m34514(), interfaceC5075, str2, C10925.m27726(abstractC11782), abstractC11782);
    }
}
