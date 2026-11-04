package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ۖܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2719 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5155 f9079;

    public C2719(C5155 c5155) {
        this.f9079 = c5155;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C5155 c5155 = this.f9079;
        if (z && (c5155.f17993 || !c5155.f17995)) {
            c5155.m15576(seekBar);
        } else {
            c5155.m15577(i + c5155.f17989);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f9079.f17995 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C5155 c5155 = this.f9079;
        c5155.f17995 = false;
        if (seekBar.getProgress() + c5155.f17989 != c5155.f17986) {
            c5155.m15576(seekBar);
        }
    }
}
