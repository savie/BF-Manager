package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩸ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22553 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72904;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72905;

    public /* synthetic */ DialogInterfaceOnClickListenerC22553(int i, Object obj) {
        this.f72904 = i;
        this.f72905 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f72904) {
            case 0:
                ((ActivityC18143) this.f72905).m42306(false);
                break;
            default:
                ((C9519) this.f72905).f30840 = i;
                break;
        }
    }
}
