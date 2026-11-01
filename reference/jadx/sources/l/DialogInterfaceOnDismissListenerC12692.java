package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۫᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnDismissListenerC12692 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC11281 f42366;

    public DialogInterfaceOnDismissListenerC12692(DialogInterfaceOnCancelListenerC11281 dialogInterfaceOnCancelListenerC11281) {
        this.f42366 = dialogInterfaceOnCancelListenerC11281;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC11281 dialogInterfaceOnCancelListenerC11281 = this.f42366;
        if (dialogInterfaceOnCancelListenerC11281.mDialog != null) {
            dialogInterfaceOnCancelListenerC11281.onDismiss(dialogInterfaceOnCancelListenerC11281.mDialog);
        }
    }
}
