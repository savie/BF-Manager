package l;

/* JADX INFO: renamed from: l.ۚ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes3.dex */
public final class C5579 extends AbstractC23219 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18279 f19160;

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ۙ */
    public final void mo8403(AbstractC8774 abstractC8774, AbstractC8774 abstractC8775, boolean z) {
        C8378 c8378 = (C8378) abstractC8774;
        if (z) {
            return;
        }
        this.f19160.f58321.m48204(c8378.f29098, C9768.f32849);
    }

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8404(AbstractC8774 abstractC8774) {
        C8378 c8378 = (C8378) abstractC8774;
        AbstractC16579 abstractC16579 = c8378.f29095.f30190;
        if (c8378.f29098 == null || !abstractC16579.m39001(EnumC6617.CLASS)) {
            return false;
        }
        C23800 c23800 = this.f19160.f58325;
        AbstractC0618 abstractC0618 = abstractC16579.f53222;
        c23800.getClass();
        try {
            c23800.m52385(abstractC0618);
            return m15441(c8378.f29098).m48596() == 1;
        } catch (C23945 unused) {
            return false;
        }
    }

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ܰ */
    public final C21825 mo8405(AbstractC8774 abstractC8774) {
        C8378 c8378 = (C8378) abstractC8774;
        C18279 c18279 = this.f19160;
        C23195 c23195 = (C23195) c18279.f58326.mo1921((AbstractC8774) m15441(c8378.f29098).f70876, (Object) null);
        C21825 c21825 = c23195.f75270;
        C21452 c21452 = c23195.f75268;
        C5286 c5286 = c18279.f58327;
        c5286.m14629((InterfaceC12260) c8378);
        return C21825.of((Object) c5286.m14650(c21452, c21825));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5579(C18279 c18279) {
        super(c18279, EnumC14047.LAMBDA, EnumC18651.f60531);
        this.f19160 = c18279;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ۡۡ۟] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.᩺᩵۟] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m15441(C8753 c8753) {
        C19003 c19003 = new C19003();
        for (Object obj : c8753.f30090) {
            if (obj.m22847(EnumC18651.f60478)) {
                obj = (C23195) obj;
                if ((obj.f75267.f70567 & 68719476736L) == 0) {
                }
            }
            c19003.m43723(obj);
        }
        return c19003.m43726();
    }
}
