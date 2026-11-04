package l;

import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.۬ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13928 implements InterfaceC2742 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10745 f44160;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20766 f44161;

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ void mo9088() {
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ boolean mo9091(int i) {
        return true;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۫ۙ */
    public final /* synthetic */ boolean mo7310() {
        return true;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo9093(int i) {
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷ۙ */
    public final /* synthetic */ void mo9095() {
    }

    public AbstractC13928(C20766 c20766, C10745 c10745) {
        this.f44161 = c20766;
        this.f44160 = c10745;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۚ */
    public final String mo9090() {
        return this.f44161.m47478();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩸ۙ */
    public final IInArchive mo9096() {
        return this.f44161.m47477();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9094(IInArchive iInArchive) {
        this.f44161.m47476(iInArchive);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7313() {
        this.f44160.m27402();
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f44160.m27399();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۙ */
    public final void mo7309(int i) {
        this.f44160.m27403(i);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܰ */
    public final String mo9092() {
        return C21054.m48109(mo9090());
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۙ */
    public final void mo9089(String str) {
        C21054.m48119(mo9090(), str);
    }
}
