package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4II */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC10617 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogFragmentC22552 f33701;

    public DialogInterfaceOnClickListenerC10617(DialogFragmentC22552 dialogFragmentC22552) {
        this.f33701 = dialogFragmentC22552;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogFragmentC22552 dialogFragmentC22552 = this.f33701;
        dialogFragmentC22552.f72903 = i;
        dialogFragmentC22552.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
