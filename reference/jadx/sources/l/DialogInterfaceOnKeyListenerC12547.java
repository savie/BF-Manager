package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnKeyListenerC12547 implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f42004;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f42005 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17485 f42006;

    public DialogInterfaceOnKeyListenerC12547(C17485 c17485, Runnable runnable) {
        this.f42006 = c17485;
        this.f42004 = runnable;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C17485 c17485 = this.f42006;
        if (!c17485.f55635) {
            if (System.currentTimeMillis() - this.f42005 < 2000) {
                c17485.f55635 = true;
                Runnable runnable = this.f42004;
                if (runnable != null) {
                    runnable.run();
                    return true;
                }
            } else {
                C15829.m37611(R.string.MT_Protector);
                this.f42005 = System.currentTimeMillis();
            }
        }
        return true;
    }
}
