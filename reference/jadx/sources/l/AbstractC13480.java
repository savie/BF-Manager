package l;

import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ܰ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13480 implements InterfaceC9868 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1777 f44565;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9221 f44566;

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ֨ۙ */
    public final /* synthetic */ boolean mo10347() {
        return true;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo11188() {
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ boolean mo10350(int i) {
        return true;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܰۙ */
    public final /* synthetic */ void mo11191() {
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ void mo11195(int i) {
    }

    public AbstractC13480(C9221 c9221, C1777 c1777) {
        this.f44566 = c9221;
        this.f44565 = c1777;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۬ */
    public final String mo11189() {
        return this.f44566.m23740();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۖۙ */
    public final IInArchive mo11185() {
        return this.f44566.m23742();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܰ */
    public final void mo11190(IInArchive iInArchive) {
        this.f44566.m23739(iInArchive);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۨ */
    public final void mo10349() {
        this.f44565.m5839();
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f44565.m5824();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۙ */
    public final void mo10348(int i) {
        this.f44565.m5840(i);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܺ */
    public final String mo11192() {
        return C11088.m27967(mo11189());
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۙ */
    public final void mo11187(String str) {
        C11088.m27975(mo11189(), str);
    }
}
