package l;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: l.ۢ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9817 extends C18989 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f33565;

    public C9817(int i, InterfaceC0769 interfaceC0769, Object obj, ReferenceQueue referenceQueue) {
        super(referenceQueue, obj, interfaceC0769);
        this.f33565 = i;
    }

    @Override // l.C18989, l.InterfaceC12639
    /* JADX INFO: renamed from: ܰ */
    public final int mo4755() {
        return this.f33565;
    }

    @Override // l.C18989, l.InterfaceC12639
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC12639 mo4751(ReferenceQueue referenceQueue, Object obj, InterfaceC0769 interfaceC0769) {
        return new C9817(this.f33565, interfaceC0769, obj, referenceQueue);
    }
}
