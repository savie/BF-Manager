package l;

import bin.mt.plugin.api.ui.dialog.ProgressDialog;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23313 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75520;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75521;

    public /* synthetic */ RunnableC23313(int i, Object obj) {
        this.f75520 = i;
        this.f75521 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75520) {
            case 0:
                DialogInterfaceOnClickListenerC12983.m32396(R.string.MT_Protector, (AbstractActivityC17204) this.f75521, "def_sign_key_warn");
                break;
            default:
                ((ProgressDialog) this.f75521).lambda$dismiss$3();
                break;
        }
    }
}
