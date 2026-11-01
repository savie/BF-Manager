package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.ᩴ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public class C18989 extends SoftReference implements InterfaceC12639 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0769 f61466;

    @Override // l.InterfaceC12639
    /* JADX INFO: renamed from: ۙ */
    public final void mo4752(Object obj) {
    }

    @Override // l.InterfaceC12639
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4753() {
        return false;
    }

    @Override // l.InterfaceC12639
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo4754() {
        return true;
    }

    /* JADX INFO: renamed from: ܰ */
    public int mo4755() {
        return 1;
    }

    public C18989(ReferenceQueue referenceQueue, Object obj, InterfaceC0769 interfaceC0769) {
        super(obj, referenceQueue);
        this.f61466 = interfaceC0769;
    }

    @Override // l.InterfaceC12639
    public final InterfaceC0769 getEntry() {
        return this.f61466;
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC12639 mo4751(ReferenceQueue referenceQueue, Object obj, InterfaceC0769 interfaceC0769) {
        return new C18989(referenceQueue, obj, interfaceC0769);
    }

    @Override // l.InterfaceC12639
    /* JADX INFO: renamed from: ۖ */
    public final Object mo4749() {
        return get();
    }
}
