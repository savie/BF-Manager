package l;

import android.content.DialogInterface;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3695 implements InterfaceC18837 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f12694;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC21244 f12695;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12801 f12696;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f12697;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f12698;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10737 f12699;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f12700;

    @Override // l.InterfaceC18837
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268() {
    }

    public C3695(boolean z, C12801 c12801, DialogInterfaceC8327 dialogInterfaceC8327, C10737 c10737, RunnableC21244 runnableC21244, TextView textView, AbstractActivityC17204 abstractActivityC17204) {
        this.f12700 = z;
        this.f12696 = c12801;
        this.f12698 = dialogInterfaceC8327;
        this.f12699 = c10737;
        this.f12695 = runnableC21244;
        this.f12694 = textView;
        this.f12697 = abstractActivityC17204;
    }

    @Override // l.InterfaceC18837
    /* JADX INFO: renamed from: ۙ */
    public final void mo1269(C9651 c9651, boolean z) {
        boolean z2 = this.f12700;
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f12698;
        if (!z2 || (this.f12696.m31748(dialogInterfaceC8327) && dialogInterfaceC8327.m22434())) {
            C9881.m25693(this.f12699);
            this.f12695.run();
            C22673.m51152(R.string.MT_Protector);
            dialogInterfaceC8327.dismiss();
        }
    }

    @Override // l.InterfaceC18837
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1270(Exception exc) {
        boolean z = this.f12700;
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f12698;
        if (z && (!this.f12696.m31748(dialogInterfaceC8327) || !dialogInterfaceC8327.m22434())) {
            return true;
        }
        if (exc instanceof C20774) {
            C16530.m39161(this.f12694, (C20774) exc);
            dialogInterfaceC8327.m22436().setEnabled(false);
            return true;
        }
        if (!(exc instanceof C9886)) {
            this.f12697.m40401(exc, (DialogInterface.OnDismissListener) null);
            return true;
        }
        C22673.m51160(C21576.m49059(R.string.MT_Protector, ((C9886) exc).m25699()));
        return true;
    }
}
