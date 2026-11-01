package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4RX */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC10543 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7720 f36095;

    public DialogInterfaceOnClickListenerC10543(C7720 c7720) {
        this.f36095 = c7720;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C7720 c7720 = this.f36095;
        c7720.f25538 = i;
        c7720.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
