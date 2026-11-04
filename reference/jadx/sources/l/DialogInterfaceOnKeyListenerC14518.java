package l;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.ܰۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4GG */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnKeyListenerC14518 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C24720 f45669 = C24720.m55196();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45670;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f45671;

    public DialogInterfaceOnKeyListenerC14518(int i, Runnable runnable) {
        this.f45670 = i;
        this.f45671 = runnable;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        if (this.f45669.m55199()) {
            C22673.m51152(this.f45670);
            return true;
        }
        C22673.m51157();
        this.f45671.run();
        return true;
    }
}
