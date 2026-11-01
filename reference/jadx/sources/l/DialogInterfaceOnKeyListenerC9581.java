package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnKeyListenerC9581 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22959 f32300 = C22959.m50801();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4785 f32301;

    public DialogInterfaceOnKeyListenerC9581(C4785 c4785) {
        this.f32301 = c4785;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C4785 c4785 = this.f32301;
        if (c4785.f16828) {
            return true;
        }
        if (this.f32300.m50803()) {
            c4785.m13283();
            return true;
        }
        C15829.m37611(R.string.MT_Protector);
        return true;
    }
}
