package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6225 implements InterfaceC2096 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f21146;

    public C6225(ArrayList arrayList) {
        this.f21146 = arrayList;
    }

    @Override // l.InterfaceC2096
    /* JADX INFO: renamed from: ۙ */
    public final void mo6637(C9859 c9859) {
        C0727 c0727Mo17429 = c9859.mo17429();
        C16251 c16251M49955 = c9859.m49955();
        int size = c0727Mo17429.size();
        for (int i = 0; i < size; i++) {
            ((C11871) this.f21146.get(c9859.m24960(i))).m29608(c16251M49955, c0727Mo17429.m15275get(i));
        }
    }
}
