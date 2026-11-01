package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20867 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f67794;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3120 f67795;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f67796;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0405 f67797;

    public C20867(C0405 c0405, AbstractActivityC12483 abstractActivityC12483, C3120 c3120, DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f67797 = c0405;
        this.f67794 = abstractActivityC12483;
        this.f67795 = c3120;
        this.f67796 = dialogInterfaceC19356;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f67794, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        long jM9393 = this.f67795.m9393();
        C2724 c2724M8305 = C2724.m8305(4181);
        c2724M8305.m8316(jM9393);
        C1313 c1313M8321 = c2724M8305.m8321();
        if (!c1313M8321.m4686()) {
            throw new C4987(C4820.m13401(c1313M8321, R.string.MT_Protector));
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f67796.dismiss();
        this.f67797.mo950(this.f67794);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f67794.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
