package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܽۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S1JO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16609 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Object f53300 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9186 f53301 = new C9186();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public WeakReference f53302 = new WeakReference(null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39052(InterfaceC1423 interfaceC1423, InterfaceC0380 interfaceC0380) {
        C9186 c9186 = this.f53301;
        if (c9186.m44964()) {
            InterfaceC10597 interfaceC10597 = (InterfaceC10597) this.f53302.get();
            if (interfaceC10597 != null) {
                c9186.m44963(interfaceC10597);
                this.f53302.clear();
            }
            if (c9186.m44964()) {
                throw new RuntimeException();
            }
        }
        C20137 c20137 = new C20137(0, interfaceC0380);
        this.f53302 = new WeakReference(c20137);
        c9186.m44959(interfaceC1423, c20137);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39050(InterfaceC0380 interfaceC0380, Object[] objArr) {
        Object obj = objArr[0];
        Object obj2 = f53300;
        if (obj != obj2) {
            objArr[0] = obj2;
            interfaceC0380.mo1825(obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39051(Object obj) {
        this.f53301.mo23642(new Object[]{obj});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39053(C22785 c22785) {
        this.f53301.mo23641(new Object[]{c22785});
    }
}
