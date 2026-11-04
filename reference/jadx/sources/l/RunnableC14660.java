package l;

/* JADX INFO: renamed from: l.ܰܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14660 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC19136 f47946;

    public RunnableC14660(DialogInterfaceOnCancelListenerC19136 dialogInterfaceOnCancelListenerC19136) {
        this.f47946 = dialogInterfaceOnCancelListenerC19136;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnCancelListenerC19136 dialogInterfaceOnCancelListenerC19136 = this.f47946;
        dialogInterfaceOnCancelListenerC19136.mOnDismissListener.onDismiss(dialogInterfaceOnCancelListenerC19136.mDialog);
    }
}
