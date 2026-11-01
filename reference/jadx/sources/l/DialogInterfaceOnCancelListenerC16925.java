package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܽ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnCancelListenerC16925 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC11281 f54116;

    public DialogInterfaceOnCancelListenerC16925(DialogInterfaceOnCancelListenerC11281 dialogInterfaceOnCancelListenerC11281) {
        this.f54116 = dialogInterfaceOnCancelListenerC11281;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC11281 dialogInterfaceOnCancelListenerC11281 = this.f54116;
        if (dialogInterfaceOnCancelListenerC11281.mDialog != null) {
            dialogInterfaceOnCancelListenerC11281.onCancel(dialogInterfaceOnCancelListenerC11281.mDialog);
        }
    }
}
