package l;

import android.content.DialogInterface;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13769 implements InterfaceC17354 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f45382;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22347 f45383;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC22090 f45384;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f45385;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f45386;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11392 f45387;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f45388;

    @Override // l.InterfaceC17354
    public final void onCanceled() {
    }

    public C13769(boolean z, C22347 c22347, DialogInterfaceC19356 dialogInterfaceC19356, C11392 c11392, RunnableC22090 runnableC22090, TextView textView, AbstractActivityC12483 abstractActivityC12483) {
        this.f45388 = z;
        this.f45383 = c22347;
        this.f45382 = dialogInterfaceC19356;
        this.f45387 = c11392;
        this.f45384 = runnableC22090;
        this.f45386 = textView;
        this.f45385 = abstractActivityC12483;
    }

    @Override // l.InterfaceC17354
    /* JADX INFO: renamed from: ۙ */
    public final void mo6536(C14558 c14558, boolean z) throws Throwable {
        boolean z2 = this.f45388;
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f45382;
        if (!z2 || (this.f45383.m49555(dialogInterfaceC19356) && dialogInterfaceC19356.m44375())) {
            C0403.m2141(this.f45387);
            this.f45384.run();
            C15829.m37611(R.string.MT_Protector);
            dialogInterfaceC19356.dismiss();
        }
    }

    @Override // l.InterfaceC17354
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6537(Exception exc) {
        boolean z = this.f45388;
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f45382;
        if (z && (!this.f45383.m49555(dialogInterfaceC19356) || !dialogInterfaceC19356.m44375())) {
            return true;
        }
        if (exc instanceof C15721) {
            C23053.m50998(this.f45386, (C15721) exc);
            dialogInterfaceC19356.m44373().setEnabled(false);
            return true;
        }
        if (!(exc instanceof C6065)) {
            this.f45385.m31002(exc, (DialogInterface.OnDismissListener) null);
            return true;
        }
        C15829.m37619(C16737.m39264(R.string.MT_Protector, ((C6065) exc).m16465()));
        return true;
    }
}
