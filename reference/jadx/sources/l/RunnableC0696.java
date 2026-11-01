package l;

/* JADX INFO: renamed from: l.֡᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0696 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC11281 f2953;

    public RunnableC0696(DialogInterfaceOnCancelListenerC11281 dialogInterfaceOnCancelListenerC11281) {
        this.f2953 = dialogInterfaceOnCancelListenerC11281;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnCancelListenerC11281 dialogInterfaceOnCancelListenerC11281 = this.f2953;
        dialogInterfaceOnCancelListenerC11281.mOnDismissListener.onDismiss(dialogInterfaceOnCancelListenerC11281.mDialog);
    }
}
