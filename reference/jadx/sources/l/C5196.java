package l;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: l.ۙ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C5196 extends C20507 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f18120;

    public C5196(int i, InterfaceC2213 interfaceC2213, Object obj, ReferenceQueue referenceQueue) {
        super(referenceQueue, obj, interfaceC2213);
        this.f18120 = i;
    }

    @Override // l.C20507, l.InterfaceC10064
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2148() {
        return this.f18120;
    }

    @Override // l.C20507, l.InterfaceC10064
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC10064 mo2144(ReferenceQueue referenceQueue, Object obj, InterfaceC2213 interfaceC2213) {
        return new C5196(this.f18120, interfaceC2213, obj, referenceQueue);
    }
}
