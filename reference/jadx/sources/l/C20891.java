package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20891 extends RunnableC2545 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f67875;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21825 f67876;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20891(C0429 c0429, AbstractC23903 abstractC23903, C21825 c21825) {
        super(c0429, abstractC23903, C21825.m48588());
        this.f67875 = c0429;
        this.f67876 = c21825;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m46999(C21825 c21825) {
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C15953 c15953 = (C15953) it.next();
            C11867 c11867M49464 = m49464(c15953.f51661);
            c19003.m43723(new C13278(c11867M49464.f75167, c11867M49464.f39809, c15953.f51662));
        }
        return c19003.m43726();
    }

    @Override // l.RunnableC2545, java.lang.Runnable
    public final void run() {
        C0429 c0429 = this.f67875;
        InterfaceC2173 interfaceC2173 = c0429.f1975;
        try {
            c0429.f1975 = this.f10064;
            C21825 c21825M46999 = m46999(this.f67876);
            AbstractC23903 abstractC23903 = this.f10062;
            abstractC23903.m52712(c21825M46999.m48594(abstractC23903.mo50009()));
        } finally {
            c0429.f1975 = interfaceC2173;
        }
    }
}
