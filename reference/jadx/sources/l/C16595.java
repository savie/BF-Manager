package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܽۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16595 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f53264;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17131 f53265;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10416 f53266;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f53267;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f53268;

    public C16595(AbstractActivityC12483 abstractActivityC12483, AbstractC17131 abstractC17131, DialogInterfaceC19356 dialogInterfaceC19356, C10416 c10416) {
        this.f53264 = abstractActivityC12483;
        this.f53265 = abstractC17131;
        this.f53267 = dialogInterfaceC19356;
        this.f53266 = c10416;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10252(this.f53264, 100);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        AbstractC20745 abstractC20745M51001 = C23053.m51001();
        AbstractC17131 abstractC17131 = this.f53265;
        this.f53268 = C19954.m45248(abstractC20745M51001, abstractC17131.mo1460(), abstractC17131.m40009().getEncoded(), abstractC17131.m40013().getEncoded());
        abstractC17131.mo1458();
        abstractC17131.mo1455();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C21094.m47530();
        this.f53267.dismiss();
        this.f53266.accept(this.f53268);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f53264.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
