package l;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.֫᩶۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2052 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f7631;

    public C2052(TextView textView) {
        this.f7631 = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f7631.setText(C3589.m10660(C3589.m10635(i * 50)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (C3589.f13211 != null) {
            C3589.f13211.f42572 = true;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress() * 50;
        this.f7631.setText(C3589.m10660(C3589.m10635(progress)));
        if (C3589.f13211 != null) {
            C3589.f13211.m31735(progress);
        }
    }
}
