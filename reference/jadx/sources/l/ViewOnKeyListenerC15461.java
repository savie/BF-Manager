package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ܶ᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnKeyListenerC15461 implements View.OnKeyListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18988 f50381;

    public ViewOnKeyListenerC15461(C18988 c18988) {
        this.f50381 = c18988;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        C18988 c18988 = this.f50381;
        if ((!c18988.f61459 && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = c18988.f61464) == null) {
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }
}
