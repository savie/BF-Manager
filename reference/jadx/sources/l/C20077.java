package l;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ᩴ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes5.dex */
public final class C20077 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f64538;

    public C20077(TextView textView) {
        this.f64538 = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f64538.setText(C3669.m11953(C3669.m11925(i * 50)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (C3669.f12617 != null) {
            C3669.f12617.f77122 = true;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress() * 50;
        this.f64538.setText(C3669.m11953(C3669.m11925(progress)));
        if (C3669.f12617 != null) {
            C3669.f12617.m53125(progress);
        }
    }
}
