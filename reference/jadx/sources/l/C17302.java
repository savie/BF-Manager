package l;

/* JADX INFO: renamed from: l.ܿۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: GAN8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17302 extends AbstractC18858 implements InterfaceC8130 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC18858 f55076;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC22386 f55077;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f55078;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22386 f55079;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8130 f55080;

    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final StackTraceElement mo40270() {
        return null;
    }

    public C17302(InterfaceC8130 interfaceC8130, InterfaceC22386 interfaceC22386) {
        super(C0368.f1838, C1218.f5350);
        this.f55080 = interfaceC8130;
        this.f55079 = interfaceC22386;
        this.f55078 = ((Number) interfaceC22386.mo4415(0, C12364.f41341)).intValue();
    }

    @Override // l.AbstractC21680, l.InterfaceC8275
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC8275 mo21694() {
        AbstractC18858 abstractC18858 = this.f55076;
        if (C6009.m16315(abstractC18858)) {
            return abstractC18858;
        }
        return null;
    }

    @Override // l.AbstractC18858, l.InterfaceC14771
    public final InterfaceC22386 getContext() {
        InterfaceC22386 interfaceC22386 = this.f55077;
        return interfaceC22386 == null ? C1218.f5350 : interfaceC22386;
    }

    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ܰ */
    public final Object mo11546(Object obj) {
        Throwable thM41594 = C17904.m41594(obj);
        if (thM41594 != null) {
            this.f55077 = new C20125(thM41594, getContext());
        }
        AbstractC18858 abstractC18858 = this.f55076;
        if (abstractC18858 != null) {
            abstractC18858.mo2097(obj);
        }
        return EnumC13214.COROUTINE_SUSPENDED;
    }

    @Override // l.AbstractC18858, l.AbstractC21680
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void mo40269() {
        super.mo40269();
    }

    @Override // l.InterfaceC8130
    /* JADX INFO: renamed from: ۙ */
    public final Object mo21429(Object obj, AbstractC18858 abstractC18858) {
        try {
            Object objM40268 = m40268(abstractC18858, obj);
            return objM40268 == EnumC13214.COROUTINE_SUSPENDED ? objM40268 : C7321.f24318;
        } catch (Throwable th) {
            this.f55077 = new C20125(th, abstractC18858.getContext());
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final Object m40268(AbstractC18858 abstractC18858, Object obj) {
        InterfaceC22386 context = abstractC18858.getContext();
        C9727.m24681(context);
        InterfaceC22386 interfaceC22386 = this.f55077;
        if (interfaceC22386 != context) {
            if (!(interfaceC22386 instanceof C20125)) {
                if (((Number) context.mo4415(0, new C23653(this))).intValue() == this.f55078) {
                    this.f55077 = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f55079 + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(C12529.m31140("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C20125) interfaceC22386).f65356 + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f55076 = abstractC18858;
        Object objMo16319 = C10953.f37244.mo16319(this.f55080, obj, this);
        if (!C13465.m32965(objMo16319, EnumC13214.COROUTINE_SUSPENDED)) {
            this.f55076 = null;
        }
        return objMo16319;
    }
}
