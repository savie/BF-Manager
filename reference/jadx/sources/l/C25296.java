package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩻᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes.dex */
public final class C25296 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14769 f81699;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56485(AbstractC16344 abstractC16344, AbstractC11781 abstractC11781) {
        m56484(abstractC11781, abstractC16344, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56486(AbstractC16344 abstractC16344, AbstractC11781 abstractC11781) {
        m56484(abstractC11781, abstractC16344, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56484(AbstractC11781 abstractC11781, AbstractC16344 abstractC16344, boolean z) {
        C18499 c18499 = new C18499();
        for (WeakReference weakReference : this.f81699) {
            InterfaceC11869 interfaceC11869 = (InterfaceC11869) weakReference.get();
            if (interfaceC11869 != null) {
                if (z) {
                    interfaceC11869.mo23379(abstractC16344, abstractC11781);
                } else {
                    interfaceC11869.mo23378(abstractC16344, abstractC11781);
                }
                c18499.m43089(weakReference);
            }
        }
        this.f81699 = c18499.m43093();
    }
}
