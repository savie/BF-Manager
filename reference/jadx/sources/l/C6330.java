package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۛۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6330 implements InterfaceC19795, InterfaceC11615, InterfaceC5392, InterfaceC14722 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21440;

    public /* synthetic */ C6330(Object obj) {
        this.f21440 = obj;
    }

    @Override // l.InterfaceC14722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo18051(C18452 c18452) {
        ((C15829) this.f21440).f51491.suppressLayout(false);
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC10582) obj).mo7222((C3125) this.f21440);
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        C3288.m10831((C8614) this.f21440, abstractC22044);
    }

    @Override // l.InterfaceC11615
    /* JADX INFO: renamed from: ۙ */
    public boolean mo13186(String str) {
        return (str == null || ((HashSet) this.f21440).add(str)) ? false : true;
    }
}
