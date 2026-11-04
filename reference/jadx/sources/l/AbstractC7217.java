package l;

import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۜܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7217 implements InterfaceC2742 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17036 f23813;

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ֨ */
    public /* synthetic */ void mo9088() {
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ boolean mo9091(int i) {
        return true;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۫ۙ */
    public /* synthetic */ boolean mo7310() {
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

    public AbstractC7217(C17036 c17036) {
        this.f23813 = c17036;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۚ */
    public final String mo9090() {
        return this.f23813.m40138();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩸ۙ */
    public final IInArchive mo9096() {
        return this.f23813.m40144();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9094(IInArchive iInArchive) {
        this.f23813.m40145(iInArchive);
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
