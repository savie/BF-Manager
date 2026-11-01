package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܳ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14401 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21825 f47213;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34669(AbstractC3110 abstractC3110, AbstractC23903 abstractC23903) {
        m34668(abstractC23903, abstractC3110, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34670(AbstractC3110 abstractC3110, AbstractC23903 abstractC23903) {
        m34668(abstractC23903, abstractC3110, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34668(AbstractC23903 abstractC23903, AbstractC3110 abstractC3110, boolean z) {
        C19003 c19003 = new C19003();
        for (WeakReference weakReference : this.f47213) {
            InterfaceC23573 interfaceC23573 = (InterfaceC23573) weakReference.get();
            if (interfaceC23573 != null) {
                if (z) {
                    interfaceC23573.mo14414(abstractC3110, abstractC23903);
                } else {
                    interfaceC23573.mo14411(abstractC3110, abstractC23903);
                }
                c19003.m43723(weakReference);
            }
        }
        this.f47213 = c19003.m43726();
    }
}
