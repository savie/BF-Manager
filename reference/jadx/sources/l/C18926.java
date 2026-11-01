package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18926 implements InterfaceC5520 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21042 f61238;

    public C18926(C21042 c21042) {
        this.f61238 = c21042;
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4612(C6330 c6330) {
        m43600((AbstractC22454) c6330);
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4613(C9859 c9859) {
        m43600((AbstractC22454) c9859);
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ܰ */
    public final void mo4614(C6330 c6330) {
        m43600((AbstractC22454) c6330);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43600(AbstractC22454 abstractC22454) {
        C16251 c16251Mo17432 = abstractC22454.mo17432();
        C21042 c21042 = this.f61238;
        if (c16251Mo17432 != null) {
            C19073 c19073M38386 = c16251Mo17432.m38386();
            ArrayList arrayList = (ArrayList) c21042.f68547.get(c19073M38386);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c21042.f68547.put(c19073M38386, arrayList);
            }
            arrayList.add(c16251Mo17432);
        }
        if (abstractC22454 instanceof C6330) {
            if (abstractC22454.mo17426().m31572() == 56) {
                c21042.f68553.add((C6330) abstractC22454);
                return;
            }
            C1433 c1433M52814 = C23970.m52814();
            C12723 c12723M37181 = abstractC22454.mo17428().m37181();
            C0727 c0727Mo17429 = abstractC22454.mo17429();
            c1433M52814.getClass();
            if (c12723M37181.m31571()) {
                int size = c0727Mo17429.size();
                int iM38396 = 0;
                for (int i = 0; i < size; i++) {
                    iM38396 += c0727Mo17429.m15275get(i).m38396();
                }
                if (iM38396 >= 6) {
                    c21042.f68551.add((C6330) abstractC22454);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC22454 instanceof C9859) {
            c21042.f68552.add((C9859) abstractC22454);
        }
    }
}
