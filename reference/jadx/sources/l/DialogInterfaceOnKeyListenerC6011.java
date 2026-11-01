package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnKeyListenerC6011 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22959 f20423 = C22959.m50801();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1777 f20424;

    public DialogInterfaceOnKeyListenerC6011(C1777 c1777) {
        this.f20424 = c1777;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C1777 c1777 = this.f20424;
        if (c1777.f6924) {
            return true;
        }
        if (this.f20423.m50803()) {
            c1777.m5839();
            return true;
        }
        C15829.m37611(R.string.MT_Protector);
        return true;
    }
}
