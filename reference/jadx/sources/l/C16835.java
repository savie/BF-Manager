package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ܽᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes4.dex */
public final class C16835 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22046 f53873;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f53874;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f53875;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C16835(DialogInterfaceC19356 dialogInterfaceC19356, String str, C22046 c22046) {
        this.f53875 = dialogInterfaceC19356;
        this.f53874 = str;
        this.f53873 = c22046;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (i < 20) {
            seekBar.setProgress(20);
            return;
        }
        this.f53875.m44377(this.f53874 + i + "%)");
        this.f53873.m48982(((float) i) / 100.0f);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        ApplicationC0716.f2992.edit().mo4065((int) (this.f53873.m48980() * 100.0f), "bottom_content_view_ratio_int").apply();
    }
}
