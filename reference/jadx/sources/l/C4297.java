package l;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: l.ۙ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4297 extends C14756 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f15467;

    public C4297(int i, InterfaceC0769 interfaceC0769, Object obj, ReferenceQueue referenceQueue) {
        super(referenceQueue, obj, interfaceC0769);
        this.f15467 = i;
    }

    @Override // l.C14756, l.InterfaceC12639
    /* JADX INFO: renamed from: ܰ */
    public final int mo4755() {
        return this.f15467;
    }

    @Override // l.C14756, l.InterfaceC12639
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC12639 mo4751(ReferenceQueue referenceQueue, Object obj, InterfaceC0769 interfaceC0769) {
        return new C4297(this.f15467, interfaceC0769, obj, referenceQueue);
    }
}
