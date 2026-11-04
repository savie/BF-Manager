package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩶ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceOnCancelListenerC21374 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC19136 f68067;

    public DialogInterfaceOnCancelListenerC21374(DialogInterfaceOnCancelListenerC19136 dialogInterfaceOnCancelListenerC19136) {
        this.f68067 = dialogInterfaceOnCancelListenerC19136;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC19136 dialogInterfaceOnCancelListenerC19136 = this.f68067;
        if (dialogInterfaceOnCancelListenerC19136.mDialog != null) {
            dialogInterfaceOnCancelListenerC19136.onCancel(dialogInterfaceOnCancelListenerC19136.mDialog);
        }
    }
}
