package l;

/* JADX INFO: renamed from: l.۬ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAN8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13614 extends AbstractC6317 implements InterfaceC3174 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC11536 f43244;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC11536 f43245;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f43246;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC6317 f43247;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3174 f43248;

    @Override // l.AbstractC20487
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final StackTraceElement mo33360() {
        return null;
    }

    public C13614(InterfaceC3174 interfaceC3174, InterfaceC11536 interfaceC11536) {
        super(C2428.f7769, C24963.f80840);
        this.f43248 = interfaceC3174;
        this.f43244 = interfaceC11536;
        this.f43246 = ((Number) interfaceC11536.mo5004(0, C6903.f22888)).intValue();
    }

    @Override // l.AbstractC20487, l.InterfaceC24217
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24217 mo5178() {
        AbstractC6317 abstractC6317 = this.f43247;
        if (C1402.m5130(abstractC6317)) {
            return abstractC6317;
        }
        return null;
    }

    @Override // l.AbstractC6317, l.InterfaceC4825
    public final InterfaceC11536 getContext() {
        InterfaceC11536 interfaceC11536 = this.f43245;
        return interfaceC11536 == null ? C24963.f80840 : interfaceC11536;
    }

    @Override // l.AbstractC20487
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo10983(Object obj) {
        Throwable thM51055 = C22660.m51055(obj);
        if (thM51055 != null) {
            this.f43245 = new C9139(thM51055, getContext());
        }
        AbstractC6317 abstractC6317 = this.f43247;
        if (abstractC6317 != null) {
            abstractC6317.mo8188(obj);
        }
        return EnumC16757.COROUTINE_SUSPENDED;
    }

    @Override // l.AbstractC6317, l.AbstractC20487
    /* JADX INFO: renamed from: ۫ */
    public final void mo18033() {
        super.mo18033();
    }

    @Override // l.InterfaceC3174
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10365(Object obj, AbstractC6317 abstractC6317) {
        try {
            Object objM33359 = m33359(abstractC6317, obj);
            return objM33359 == EnumC16757.COROUTINE_SUSPENDED ? objM33359 : C11471.f36082;
        } catch (Throwable th) {
            this.f43245 = new C9139(th, abstractC6317.getContext());
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final Object m33359(AbstractC6317 abstractC6317, Object obj) {
        InterfaceC11536 context = abstractC6317.getContext();
        C13686.m33477(context);
        InterfaceC11536 interfaceC11536 = this.f43245;
        if (interfaceC11536 != context) {
            if (!(interfaceC11536 instanceof C9139)) {
                if (((Number) context.mo5004(0, new C11134(this))).intValue() != this.f43246) {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f43244 + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
                this.f43245 = context;
            } else {
                throw new IllegalStateException(C0878.m3582("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C9139) interfaceC11536).f29706 + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f43247 = abstractC6317;
        InterfaceC3817 interfaceC3817 = C22323.f72259;
        InterfaceC3174 interfaceC3174 = this.f43248;
        C15243.m36587((Object) interfaceC3174, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objMo12355 = interfaceC3817.mo12355(interfaceC3174, obj, this);
        if (!C15243.m36589(objMo12355, EnumC16757.COROUTINE_SUSPENDED)) {
            this.f43247 = null;
        }
        return objMo12355;
    }
}
