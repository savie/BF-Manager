package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۜۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public class C7082 extends WeakReference implements InterfaceC10064 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2213 f23347;

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ۙ */
    public final void mo2145(Object obj) {
    }

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2146() {
        return false;
    }

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo2147() {
        return true;
    }

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ᩷ */
    public int mo2148() {
        return 1;
    }

    public C7082(ReferenceQueue referenceQueue, Object obj, InterfaceC2213 interfaceC2213) {
        super(obj, referenceQueue);
        this.f23347 = interfaceC2213;
    }

    @Override // l.InterfaceC10064
    public final InterfaceC2213 getEntry() {
        return this.f23347;
    }

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC10064 mo2144(ReferenceQueue referenceQueue, Object obj, InterfaceC2213 interfaceC2213) {
        return new C7082(referenceQueue, obj, interfaceC2213);
    }

    @Override // l.InterfaceC10064
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2149() {
        return get();
    }
}
