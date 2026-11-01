package l;

import bin.mt.plugin.api.ui.dialog.DualProgressDialog;

/* JADX INFO: renamed from: l.ۙۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4537 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16134;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16136;

    public /* synthetic */ RunnableC4537(int i, int i2, Object obj) {
        this.f16135 = i2;
        this.f16136 = obj;
        this.f16134 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16135) {
            case 0:
                ((C21362) this.f16136).setItemChecked(this.f16134, true);
                break;
            default:
                ((DualProgressDialog) this.f16136).lambda$setMaxSubProgress$1(this.f16134);
                break;
        }
    }
}
