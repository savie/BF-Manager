package l;

/* JADX INFO: renamed from: l.᩻ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24804 implements InterfaceC23312 {
    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo34789(C13614 c13614, InterfaceC4825 interfaceC4825);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l.InterfaceC23312
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10984(InterfaceC3174 interfaceC3174, InterfaceC4825 interfaceC4825) throws Throwable {
        C11377 c11377;
        Throwable th;
        C13614 c13614;
        if (interfaceC4825 instanceof C11377) {
            c11377 = (C11377) interfaceC4825;
            int i = c11377.f35804;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11377.f35804 = i - Integer.MIN_VALUE;
            } else {
                c11377 = new C11377(this, (AbstractC6317) interfaceC4825);
            }
        } else {
            c11377 = new C11377(this, (AbstractC6317) interfaceC4825);
        }
        Object obj = c11377.f35806;
        Object obj2 = EnumC16757.COROUTINE_SUSPENDED;
        int i2 = c11377.f35804;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c13614 = c11377.f35803;
            try {
                C19676.m45348(obj);
                c13614.mo18033();
                return C11471.f36082;
            } catch (Throwable th2) {
                th = th2;
                c13614.mo18033();
                throw th;
            }
        }
        C19676.m45348(obj);
        C13614 c13615 = new C13614(interfaceC3174, c11377.getContext());
        try {
            c11377.f35803 = c13615;
            c11377.f35804 = 1;
            if (mo34789(c13615, (InterfaceC4825) c11377) == obj2) {
                return obj2;
            }
            c13614 = c13615;
            c13614.mo18033();
            return C11471.f36082;
        } catch (Throwable th3) {
            th = th3;
            c13614 = c13615;
            c13614.mo18033();
            throw th;
        }
    }
}
