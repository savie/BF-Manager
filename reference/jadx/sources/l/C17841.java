package l;

/* JADX INFO: renamed from: l.ܽ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final class C17841 extends AbstractC3671 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14528 f58526;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17841(C14528 c14528) {
        super(c14528);
        this.f58526 = c14528;
    }

    @Override // l.AbstractC3671
    /* JADX INFO: renamed from: ᩷ */
    public final C14769 mo11963(C8274 c8274, EnumC0816 enumC0816, AbstractC22664 abstractC22664, boolean z) {
        C18499 c18499 = new C18499();
        AbstractC22664 abstractC22664M22338 = c8274.m22338();
        C14528 c14528 = this.f58526;
        if (abstractC22664M22338 != null) {
            c18499.m43089(new C4417(c14528, c8274, enumC0816, new EnumC0816[0]));
        }
        c18499.m43089(new C19333(c14528, c8274, abstractC22664, enumC0816));
        return c18499.m43093();
    }
}
