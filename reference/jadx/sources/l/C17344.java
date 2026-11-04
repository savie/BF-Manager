package l;

/* JADX INFO: renamed from: l.ܽۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: QAND */
/* JADX INFO: loaded from: classes5.dex */
public final class C17344 implements InterfaceC3174 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3174 f56454;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24941 f56455;

    public C17344(C15852 c15852, C24941 c24941, InterfaceC3174 interfaceC3174) {
        this.f56455 = c24941;
        this.f56454 = interfaceC3174;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l.InterfaceC3174
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10365(Object obj, AbstractC6317 abstractC6317) throws Throwable {
        C16598 c16598;
        if (abstractC6317 instanceof C16598) {
            c16598 = (C16598) abstractC6317;
            int i = c16598.f53695;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16598.f53695 = i - Integer.MIN_VALUE;
            } else {
                c16598 = new C16598(this, abstractC6317);
            }
        } else {
            c16598 = new C16598(this, abstractC6317);
        }
        Object obj2 = c16598.f53696;
        EnumC16757 enumC16757 = EnumC16757.COROUTINE_SUSPENDED;
        int i2 = c16598.f53695;
        if (i2 == 0) {
            C19676.m45348(obj2);
            C24941 c24941 = this.f56455;
            Object obj3 = c24941.f80717;
            if (obj3 != C8394.f27504 && C15243.m36589(obj3, obj)) {
                return C11471.f36082;
            }
            c24941.f80717 = obj;
            c16598.f53695 = 1;
            if (this.f56454.mo10365(obj, c16598) == enumC16757) {
                return enumC16757;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C19676.m45348(obj2);
        }
        return C11471.f36082;
    }
}
