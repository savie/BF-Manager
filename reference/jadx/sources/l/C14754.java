package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ᩶۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public final class C14754 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f48259;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C9941 f48260;

    public C14754(AbstractActivityC12483 abstractActivityC12483) {
        this.f48259 = abstractActivityC12483;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10252(this.f48259, 300);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f48260 = C7118.m19003();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        AbstractActivityC12483 abstractActivityC12483 = this.f48259;
        if (abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed() || !abstractActivityC12483.getLifecycle().mo9170().m24173(EnumC9414.STARTED)) {
            return;
        }
        C12763 c12763M10654 = C3589.m10654();
        if (c12763M10654 != null && !c12763M10654.f42565.mo20296()) {
            C3589.m10647(abstractActivityC12483);
            return;
        }
        if (!C7118.m19009(this.f48260)) {
            C3589.m10647(abstractActivityC12483);
            return;
        }
        C21830 c21830M25149 = this.f48260.m25149();
        if (c21830M25149 != null) {
            new C3589(abstractActivityC12483);
            C3589.m10651(c21830M25149, this.f48260.m25148());
        } else {
            C15829.m37618(R.string.MT_Protector);
            if (abstractActivityC12483 instanceof ActivityC6412) {
                abstractActivityC12483.finish();
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        AbstractActivityC12483 abstractActivityC12483 = this.f48259;
        if (abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) {
            return;
        }
        abstractActivityC12483.m31003(exc, abstractActivityC12483 instanceof ActivityC6412);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
