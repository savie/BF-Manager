package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnKeyListenerC6800 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f22659 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f22660;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13511 f22661;

    public DialogInterfaceOnKeyListenerC6800(C13511 c13511, Runnable runnable) {
        this.f22661 = c13511;
        this.f22660 = runnable;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C13511 c13511 = this.f22661;
        if (!c13511.f42961) {
            if (System.currentTimeMillis() - this.f22659 < 2000) {
                c13511.f42961 = true;
                Runnable runnable = this.f22660;
                if (runnable != null) {
                    runnable.run();
                    return true;
                }
            } else {
                C22673.m51152(R.string.MT_Protector);
                this.f22659 = System.currentTimeMillis();
            }
        }
        return true;
    }
}
