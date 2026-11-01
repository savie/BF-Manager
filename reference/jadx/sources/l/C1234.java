package l;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.֨ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7JT */
/* JADX INFO: loaded from: classes2.dex */
public final class C1234 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13230 f5402;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f5403;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C1234(C13230 c13230, TextView textView) {
        this.f5402 = c13230;
        this.f5403 = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f5403.setText(String.valueOf(i + 2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress() + 2;
        C13230 c13230 = this.f5402;
        c13230.m42292().edit().putInt(c13230.m13157(), progress).apply();
        c13230.mo13141((CharSequence) String.valueOf(progress));
    }
}
