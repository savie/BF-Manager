package l;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14518 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1816 f47553;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f47554;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C14518(C1816 c1816, TextView textView) {
        this.f47553 = c1816;
        this.f47554 = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f47554.setText(String.valueOf(i + 1));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress() + 1;
        C1816 c1816 = this.f47553;
        c1816.m42292().edit().putInt(c1816.m13157(), progress).apply();
        c1816.mo13141((CharSequence) String.valueOf(progress));
    }
}
