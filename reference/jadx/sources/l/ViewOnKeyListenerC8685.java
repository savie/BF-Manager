package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;

/* JADX INFO: renamed from: l.۠ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnKeyListenerC8685 implements View.OnKeyListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5155 f28347;

    public ViewOnKeyListenerC8685(C5155 c5155) {
        this.f28347 = c5155;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        C5155 c5155 = this.f28347;
        if ((!c5155.f17990 && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = c5155.f17985) == null) {
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }
}
