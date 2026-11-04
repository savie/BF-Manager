package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15654 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC8552 f50870;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f50871;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2386 f50872;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f50873;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f50874;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18881 f50875;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f50876;

    public C15654(InterfaceC2386 interfaceC2386, C12915 c12915, AbstractC18881 abstractC18881, AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552) {
        this.f50872 = interfaceC2386;
        this.f50876 = c12915;
        this.f50875 = abstractC18881;
        this.f50870 = abstractDialogInterfaceOnClickListenerC8552;
        String path = interfaceC2386.getPath();
        this.f50874 = path;
        this.f50873 = C1402.m5124(4, 0, path);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f50876.m31979(), R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        AbstractC18881 abstractC18881 = this.f50875;
        String str = this.f50873;
        boolean zMo35586 = abstractC18881.mo35586(str);
        String str2 = this.f50874;
        if (zMo35586) {
            String strM28549 = C11293.m28549(this.f50872.getParent(), System.currentTimeMillis() + ".tmp");
            abstractC18881.mo35571(str, strM28549);
            abstractC18881.mo35571(str2, str);
            abstractC18881.mo35571(strM28549, str2);
            this.f50871 = true;
            return;
        }
        abstractC18881.mo35571(str2, str);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f50870.m22951();
        String str = this.f50873;
        String strM28558 = C11293.m28558(str);
        C12915 c12915 = this.f50876;
        c12915.m31975(strM28558);
        if (this.f50871) {
            DialogInterfaceOnClickListenerC12983.m32395(c12915.m31979(), "restore_backup", C21576.m49059(R.string.MT_Protector, C11293.m28558(str)), true);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f50876.m31979().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
        this.f50876.m31973();
        C6331.m18054(this.f50875.mo35579());
    }
}
