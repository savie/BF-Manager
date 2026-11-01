package l;

/* JADX INFO: renamed from: l.᩺ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22947 implements InterfaceC18713 {
    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo37803(C17302 c17302, InterfaceC14771 interfaceC14771);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l.InterfaceC18713
    /* JADX INFO: renamed from: ۙ */
    public final Object mo16086(InterfaceC8130 interfaceC8130, InterfaceC14771 interfaceC14771) throws Throwable {
        C6718 c6718;
        Throwable th;
        C17302 c17302;
        if (interfaceC14771 instanceof C6718) {
            c6718 = (C6718) interfaceC14771;
            int i = c6718.f22644;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6718.f22644 = i - Integer.MIN_VALUE;
            } else {
                c6718 = new C6718(this, (AbstractC18858) interfaceC14771);
            }
        } else {
            c6718 = new C6718(this, (AbstractC18858) interfaceC14771);
        }
        Object obj = c6718.f22646;
        Object obj2 = EnumC13214.COROUTINE_SUSPENDED;
        int i2 = c6718.f22644;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c17302 = c6718.f22645;
            try {
                C18610.m43015(obj);
                c17302.mo40269();
                return C7321.f24318;
            } catch (Throwable th2) {
                th = th2;
                c17302.mo40269();
                throw th;
            }
        }
        C18610.m43015(obj);
        C17302 c17303 = new C17302(interfaceC8130, c6718.getContext());
        try {
            c6718.f22645 = c17303;
            c6718.f22644 = 1;
            if (mo37803(c17303, (InterfaceC14771) c6718) == obj2) {
                return obj2;
            }
            c17302 = c17303;
            c17302.mo40269();
            return C7321.f24318;
        } catch (Throwable th3) {
            th = th3;
            c17302 = c17303;
            c17302.mo40269();
            throw th;
        }
    }
}
