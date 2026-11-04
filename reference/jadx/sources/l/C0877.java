package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֨ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0877 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f3264;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f3265;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f3266;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2368 f3267;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f3268;

    public C0877(C2368 c2368, byte[] bArr, byte[] bArr2, DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f3267 = c2368;
        this.f3265 = bArr;
        this.f3264 = bArr2;
        this.f3266 = dialogInterfaceC8327;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8199(this.f3267.f7625, 100);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f3268 = C12569.m31283(C16530.m39164(), this.f3267.f7626.m49874(), this.f3265, this.f3264);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C6331.m18055();
        this.f3266.dismiss();
        this.f3267.f7628.accept(this.f3268);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f3267.f7625.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
