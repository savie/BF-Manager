package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܿܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnDismissListenerC18390 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC19136 f59905;

    public DialogInterfaceOnDismissListenerC18390(DialogInterfaceOnCancelListenerC19136 dialogInterfaceOnCancelListenerC19136) {
        this.f59905 = dialogInterfaceOnCancelListenerC19136;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC19136 dialogInterfaceOnCancelListenerC19136 = this.f59905;
        if (dialogInterfaceOnCancelListenerC19136.mDialog != null) {
            dialogInterfaceOnCancelListenerC19136.onDismiss(dialogInterfaceOnCancelListenerC19136.mDialog);
        }
    }
}
