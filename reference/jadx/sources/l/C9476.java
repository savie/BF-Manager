package l;

/* JADX INFO: renamed from: l.ۡܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes4.dex */
public class C9476 extends C13951 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7240 f30708;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9476(C7240 c7240) {
        super(c7240.f23878);
        this.f30708 = c7240;
        this.f44252 = c7240.firstEntry();
    }

    @Override // l.C13951
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo24861() {
        C14697 c14697M35365 = this.f44249.m35365();
        this.f44249 = c14697M35365;
        C7240 c7240 = this.f30708;
        if (c7240.f23880 || c14697M35365 == null || Character.compare(c14697M35365.f66377, c7240.f23881) >= 0) {
            return;
        }
        this.f44249 = null;
    }

    @Override // l.C13951
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo24860() {
        C14697 c14697M35366 = this.f44252.m35366();
        this.f44252 = c14697M35366;
        C7240 c7240 = this.f30708;
        if (c7240.f23879 || c14697M35366 == null || Character.compare(c14697M35366.f66377, c7240.f23882) < 0) {
            return;
        }
        this.f44252 = null;
    }
}
