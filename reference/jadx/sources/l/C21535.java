package l;

/* JADX INFO: renamed from: l.᩸ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: QAND */
/* JADX INFO: loaded from: classes5.dex */
public final class C21535 implements InterfaceC8130 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8130 f69950;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0763 f69951;

    public C21535(C18007 c18007, C0763 c0763, InterfaceC8130 interfaceC8130) {
        this.f69951 = c0763;
        this.f69950 = interfaceC8130;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l.InterfaceC8130
    /* JADX INFO: renamed from: ۙ */
    public final Object mo21429(Object obj, AbstractC18858 abstractC18858) throws Throwable {
        C15186 c15186;
        if (abstractC18858 instanceof C15186) {
            c15186 = (C15186) abstractC18858;
            int i = c15186.f49575;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15186.f49575 = i - Integer.MIN_VALUE;
            } else {
                c15186 = new C15186(this, abstractC18858);
            }
        } else {
            c15186 = new C15186(this, abstractC18858);
        }
        Object obj2 = c15186.f49574;
        EnumC13214 enumC13214 = EnumC13214.COROUTINE_SUSPENDED;
        int i2 = c15186.f49575;
        if (i2 == 0) {
            C18610.m43015(obj2);
            C0763 c0763 = this.f69951;
            Object obj3 = c0763.f3078;
            if (obj3 != C16597.f53269 && C13465.m32965(obj3, obj)) {
                return C7321.f24318;
            }
            c0763.f3078 = obj;
            c15186.f49575 = 1;
            if (this.f69950.mo21429(obj, c15186) == enumC13214) {
                return enumC13214;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C18610.m43015(obj2);
        }
        return C7321.f24318;
    }
}
