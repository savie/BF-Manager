package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ۙۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4410 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13584 f15705;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public C4410(C13584 c13584) {
        this.f15705 = c13584;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f15705.m33208(i / 100.0f);
        }
    }
}
