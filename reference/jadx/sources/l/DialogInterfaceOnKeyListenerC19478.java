package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceOnKeyListenerC19478 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C24720 f62907 = C24720.m55196();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12765 f62908;

    public DialogInterfaceOnKeyListenerC19478(C12765 c12765) {
        this.f62908 = c12765;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C12765 c12765 = this.f62908;
        if (c12765.f40857) {
            return true;
        }
        if (this.f62907.m55200()) {
            c12765.m31630();
            return true;
        }
        C22673.m51152(R.string.MT_Protector);
        return true;
    }
}
