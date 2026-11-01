package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ۗۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 99K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2966 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13584 f11102;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public C2966(C13584 c13584) {
        this.f11102 = c13584;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f11102.m33204(i / 100.0f);
        }
    }
}
