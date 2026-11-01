package l;

/* JADX INFO: renamed from: l.֡ۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0223 implements InterfaceC3045 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5868 f1403;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f1404 = C10808.f36819;

    public C0223(AbstractC5868 abstractC5868) {
        this.f1403 = abstractC5868;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1597(Object obj) {
        this.f1404 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    @Override // l.InterfaceC3045
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1596(InterfaceC14771 interfaceC14771) {
        C13110 c13110;
        Object obj = this.f1404;
        C21203 c21203 = C10808.f36819;
        if (obj != c21203) {
            return Boolean.valueOf(!(obj instanceof C2484));
        }
        AbstractC5868 abstractC5868 = this.f1403;
        Object objMo5522 = abstractC5868.mo5522();
        this.f1404 = objMo5522;
        if (objMo5522 != c21203) {
            return Boolean.valueOf(!(objMo5522 instanceof C2484));
        }
        InterfaceC14771 interfaceC14771M45561 = C20149.m45561(interfaceC14771);
        if (!(interfaceC14771M45561 instanceof C14149)) {
            c13110 = new C13110(interfaceC14771M45561, 1);
        } else {
            C13110 c13110M34223 = ((C14149) interfaceC14771M45561).m34223();
            if (c13110M34223 == null) {
                c13110 = new C13110(interfaceC14771M45561, 2);
            } else {
                c13110 = c13110M34223.m32427() ? c13110M34223 : null;
                if (c13110 == null) {
                    c13110 = new C13110(interfaceC14771M45561, 2);
                }
            }
        }
        C16452 c16452 = new C16452(this, c13110);
        while (!abstractC5868.mo5525(c16452)) {
            Object objMo5523 = abstractC5868.mo5522();
            this.f1404 = objMo5523;
            if (objMo5523 instanceof C2484) {
                c13110.mo2097(Boolean.FALSE);
            } else if (objMo5523 != c21203) {
                c13110.m32442((InterfaceC15456) null);
            }
            Object objM32443 = c13110.m32443();
            EnumC13214 enumC13214 = EnumC13214.COROUTINE_SUSPENDED;
            return objM32443;
        }
        c13110.m32434((InterfaceC15456) new C12219(abstractC5868, c16452));
        Object objM32444 = c13110.m32443();
        EnumC13214 enumC13215 = EnumC13214.COROUTINE_SUSPENDED;
        return objM32444;
    }

    @Override // l.InterfaceC3045
    public final Object next() {
        Object obj = this.f1404;
        if (obj instanceof C2484) {
            int i = C2484.f9875;
            C5307 c5307 = new C5307("Channel was closed");
            int i2 = C7798.f25669;
            throw c5307;
        }
        C21203 c21203 = C10808.f36819;
        if (obj != c21203) {
            this.f1404 = c21203;
            return obj;
        }
        throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
    }
}
