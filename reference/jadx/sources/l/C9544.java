package l;

/* JADX INFO: renamed from: l.ۢۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C9544 extends AbstractC14151 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13174 f32237;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9544(C13174 c13174) {
        super(c13174);
        this.f32237 = c13174;
    }

    @Override // l.AbstractC14151
    /* JADX INFO: renamed from: ܰ */
    public final C21825 mo9607(C10229 c10229, EnumC8112 enumC8112, AbstractC16579 abstractC16579, boolean z) {
        C19003 c19003 = new C19003();
        AbstractC16579 abstractC16579M26017 = c10229.m26017();
        C13174 c13174 = this.f32237;
        if (abstractC16579M26017 != null) {
            c19003.m43723(new C1449(c13174, c10229, enumC8112, new EnumC8112[0]));
        }
        c19003.m43723(new C21911(c13174, c10229, abstractC16579, enumC8112));
        return c19003.m43726();
    }
}
