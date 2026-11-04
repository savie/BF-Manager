package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩶ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes5.dex */
public final class C21294 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f67899;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f67900;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7364 f67901;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2648 f67902;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f67903;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
    }

    public C21294(C8614 c8614, AbstractC7364 abstractC7364) {
        this.f67899 = c8614;
        this.f67901 = abstractC7364;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        if (this.f67901.f24218) {
            this.f67902 = this.f67899.m23169(false, (Runnable) null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        AbstractC7364 abstractC7364 = this.f67901;
        abstractC7364.mo20214(false);
        List listMo10160 = abstractC7364.mo10160();
        this.f67900 = listMo10160;
        abstractC7364.f24218 = false;
        C8614 c8614 = this.f67899;
        C14118.m34288(c8614, listMo10160);
        this.f67903 = c8614.f28166 || C8614.m23140(this.f67900, c8614.f28156);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C2648 c2648 = this.f67902;
        C8614 c8614 = this.f67899;
        if (!(c2648 == null && c8614.m23193()) && c8614.f28157 == this.f67901 && this.f67903) {
            c8614.m23127(this.f67900, true);
            c8614.f28159.m12741();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C2648 c2648 = this.f67902;
        if (c2648 != null) {
            c2648.m8777();
        }
    }
}
