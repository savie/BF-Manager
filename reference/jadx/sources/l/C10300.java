package l;

/* JADX INFO: renamed from: l.ۤ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 41VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10300 implements InterfaceC21733 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21588 f35334;

    @Override // l.InterfaceC21733
    /* JADX INFO: renamed from: ۙ */
    public final void mo5128(C12417 c12417, C17355 c17355) {
        String strM18509;
        C9014 c9014 = new C9014(c17355.m39114(), c17355.m39118(), false);
        C21588 c21588 = this.f35334;
        if (c21588.m48304(c9014) || (strM18509 = C6896.m18509(c17355)) == null) {
            return;
        }
        c21588.m48303(c9014, strM18509);
    }

    @Override // l.InterfaceC21733
    /* JADX INFO: renamed from: ۙ */
    public final void mo5127(C12417 c12417, C11006 c11006) {
        String strM18509;
        C9014 c9014 = new C9014(c11006.m39114(), c11006.m39118(), true);
        C21588 c21588 = this.f35334;
        if (c21588.m48304(c9014) || (strM18509 = C6896.m18509(c11006)) == null) {
            return;
        }
        c21588.m48303(c9014, strM18509);
    }

    public C10300(C21588 c21588) {
        this.f35334 = c21588;
    }
}
