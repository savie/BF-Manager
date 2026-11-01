package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩵᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4II */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC19715 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogFragmentC9132 f63284;

    public DialogInterfaceOnClickListenerC19715(DialogFragmentC9132 dialogFragmentC9132) {
        this.f63284 = dialogFragmentC9132;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogFragmentC9132 dialogFragmentC9132 = this.f63284;
        dialogFragmentC9132.f31077 = i;
        dialogFragmentC9132.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
