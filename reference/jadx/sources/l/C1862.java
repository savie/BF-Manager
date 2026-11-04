package l;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: l.֫ۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C1862 implements InterfaceC10064 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0567 f6263;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2433 f6264;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC10064 f6265;

    @Override // l.InterfaceC10064
    public final InterfaceC2213 getEntry() {
        return null;
    }

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC10064 mo2144(ReferenceQueue referenceQueue, Object obj, InterfaceC2213 interfaceC2213) {
        return this;
    }

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2146() {
        return true;
    }

    public C1862() {
        this(ConcurrentMapC5942.f20334);
    }

    public C1862(InterfaceC10064 interfaceC10064) {
        this.f6263 = C0567.m2582();
        this.f6264 = C2433.m8200();
        this.f6265 = interfaceC10064;
    }

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo2147() {
        return this.f6265.mo2147();
    }

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2148() {
        return this.f6265.mo2148();
    }

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ۙ */
    public final void mo2145(Object obj) {
        if (obj != null) {
            this.f6263.mo2583(obj);
        } else {
            this.f6265 = ConcurrentMapC5942.f20334;
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [l.ۚۤܽ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceFutureC14736 m6392(Object obj, AbstractC20836 abstractC20836) {
        InterfaceFutureC14736 interfaceFutureC14736M11572;
        try {
            this.f6264.m8202();
            if (this.f6265.get() == null) {
                Object objMo24413 = abstractC20836.mo24413(obj);
                return this.f6263.mo2583(objMo24413) ? this.f6263 : C3550.m11571(objMo24413);
            }
            abstractC20836.getClass();
            obj.getClass();
            return C3550.m11573(C3550.m11571(abstractC20836.mo24413(obj)), new InterfaceC5417() { // from class: l.ۚۤܽ
                @Override // l.InterfaceC5417
                public final Object apply(Object obj2) {
                    this.f19411.f6263.mo2583(obj2);
                    return obj2;
                }
            }, C18466.m43012());
        } catch (Throwable th) {
            if (!this.f6263.mo2584(th)) {
                interfaceFutureC14736M11572 = C3550.m11572(th);
            } else {
                interfaceFutureC14736M11572 = this.f6263;
            }
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return interfaceFutureC14736M11572;
        }
    }

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2149() {
        return C19212.m44537(this.f6263);
    }

    @Override // l.InterfaceC10064
    public final Object get() {
        return this.f6265.get();
    }
}
