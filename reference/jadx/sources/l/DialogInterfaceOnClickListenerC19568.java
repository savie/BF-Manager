package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ᩴۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B4RX */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC19568 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15092 f63098;

    public DialogInterfaceOnClickListenerC19568(C15092 c15092) {
        this.f63098 = c15092;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C15092 c15092 = this.f63098;
        c15092.f49259 = i;
        c15092.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
