package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֡ۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0366 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12362 f1819;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f1820;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f1821;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f1822;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f1823;

    public C0366(C12362 c12362, byte[] bArr, byte[] bArr2, DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f1819 = c12362;
        this.f1822 = bArr;
        this.f1820 = bArr2;
        this.f1821 = dialogInterfaceC19356;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10252(this.f1819.f41338, 100);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f1823 = C19954.m45248(C23053.m51001(), this.f1819.f41339.m46718(), this.f1822, this.f1820);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C21094.m47530();
        this.f1821.dismiss();
        this.f1819.f41337.accept(this.f1823);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f1819.f41338.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
