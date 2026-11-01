package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.᩺᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23222 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18988 f75340;

    public C23222(C18988 c18988) {
        this.f75340 = c18988;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C18988 c18988 = this.f75340;
        if (z && (c18988.f61458 || !c18988.f61455)) {
            c18988.m43688(seekBar);
        } else {
            c18988.m43689(i + c18988.f61465);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f75340.f61455 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C18988 c18988 = this.f75340;
        c18988.f61455 = false;
        if (seekBar.getProgress() + c18988.f61465 != c18988.f61457) {
            c18988.m43688(seekBar);
        }
    }
}
