package l;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.᩵۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4GG */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnKeyListenerC19458 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62664;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22959 f62665 = C22959.m50801();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f62666;

    public DialogInterfaceOnKeyListenerC19458(int i, Runnable runnable) {
        this.f62664 = i;
        this.f62666 = runnable;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        if (this.f62665.m50802()) {
            C15829.m37611(this.f62664);
            return true;
        }
        C15829.m37616();
        this.f62666.run();
        return true;
    }
}
