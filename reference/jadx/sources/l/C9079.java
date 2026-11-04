package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۡۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9079 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14806 f29507;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f29508;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20194 f29509;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f29510;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f29511;

    public C9079(AbstractActivityC17204 abstractActivityC17204, AbstractC14806 abstractC14806, DialogInterfaceC8327 dialogInterfaceC8327, C20194 c20194) {
        this.f29510 = abstractActivityC17204;
        this.f29507 = abstractC14806;
        this.f29508 = dialogInterfaceC8327;
        this.f29509 = c20194;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8199(this.f29510, 100);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        AbstractC22044 abstractC22044M39164 = C16530.m39164();
        AbstractC14806 abstractC14806 = this.f29507;
        this.f29511 = C12569.m31283(abstractC22044M39164, abstractC14806.mo18532(), abstractC14806.m35652().getEncoded(), abstractC14806.m35653().getEncoded());
        abstractC14806.mo18535();
        abstractC14806.mo18536();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C6331.m18055();
        this.f29508.dismiss();
        this.f29509.accept(this.f29511);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f29510.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
