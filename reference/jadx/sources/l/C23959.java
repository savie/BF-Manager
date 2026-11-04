package l;

/* JADX INFO: renamed from: l.᩺֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes.dex */
public final class C23959 extends AbstractC7550 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0838 f77548;

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ۙ */
    public final void mo12356(AbstractC8036 abstractC8036, AbstractC8036 abstractC8037, boolean z) {
        C18565 c18565 = (C18565) abstractC8036;
        if (z) {
            return;
        }
        this.f77548.f3151.m34531(c18565.f60319, C13146.f42064);
    }

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12357(AbstractC8036 abstractC8036) {
        C18565 c18565 = (C18565) abstractC8036;
        AbstractC22664 abstractC22664 = c18565.f60323.f26659;
        if (c18565.f60319 == null || !abstractC22664.m51067(EnumC21172.CLASS)) {
            return false;
        }
        C24705 c24705 = this.f77548.f3154;
        AbstractC22970 abstractC22970 = abstractC22664.f73596;
        c24705.getClass();
        try {
            c24705.m55092(abstractC22970);
            return m53494(c18565.f60319).m35551() == 1;
        } catch (C11540 unused) {
            return false;
        }
    }

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ᩷ */
    public final C14769 mo12358(AbstractC8036 abstractC8036) {
        C18565 c18565 = (C18565) abstractC8036;
        C0838 c0838 = this.f77548;
        C6633 c6633 = (C6633) c0838.f3153.mo23491((AbstractC8036) m53494(c18565.f60319).f48335, (Object) null);
        C14769 c14769 = c6633.f22145;
        C4197 c4197 = c6633.f22148;
        C15714 c15714 = c0838.f3158;
        c15714.m37552((InterfaceC5075) c18565);
        return C14769.of((Object) c15714.m37571(c4197, c14769));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23959(C0838 c0838) {
        super(c0838, EnumC20229.LAMBDA, EnumC21461.f68518);
        this.f77548 = c0838;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.۟ܿۘ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ۛ᩶ۘ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m53494(C7926 c7926) {
        C18499 c18499 = new C18499();
        for (Object obj : c7926.f26344) {
            if (obj.m21911(EnumC21461.f68505)) {
                obj = (C6633) obj;
                if ((obj.f22144.f15825 & 68719476736L) == 0) {
                }
            }
            c18499.m43089(obj);
        }
        return c18499.m43093();
    }
}
