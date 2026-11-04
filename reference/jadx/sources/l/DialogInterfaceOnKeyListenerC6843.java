package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnKeyListenerC6843 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C24720 f22753 = C24720.m55196();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10745 f22754;

    public DialogInterfaceOnKeyListenerC6843(C10745 c10745) {
        this.f22754 = c10745;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        if (this.f22754.f34139) {
            return true;
        }
        if (this.f22753.m55200()) {
            this.f22754.m27402();
            return true;
        }
        C22673.m51152(R.string.MT_Protector);
        return true;
    }
}
