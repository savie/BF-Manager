package l;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: l.ۤ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11161 extends C7082 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f35144;

    public C11161(int i, InterfaceC2213 interfaceC2213, Object obj, ReferenceQueue referenceQueue) {
        super(referenceQueue, obj, interfaceC2213);
        this.f35144 = i;
    }

    @Override // l.C7082, l.InterfaceC10064
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2148() {
        return this.f35144;
    }

    @Override // l.C7082, l.InterfaceC10064
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC10064 mo2144(ReferenceQueue referenceQueue, Object obj, InterfaceC2213 interfaceC2213) {
        return new C11161(this.f35144, interfaceC2213, obj, referenceQueue);
    }
}
