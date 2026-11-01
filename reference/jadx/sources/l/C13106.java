package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.۬۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y16E */
/* JADX INFO: loaded from: classes3.dex */
public final class C13106 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3932 f43628;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f43629;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f43630;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C13106(C3932 c3932, DialogInterfaceC19356 dialogInterfaceC19356, String str) {
        this.f43628 = c3932;
        this.f43630 = dialogInterfaceC19356;
        this.f43629 = str;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f43630.m44377(this.f43629 + (seekBar.getProgress() + 6) + "dp)");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C3932 c3932 = this.f43628;
        c3932.m42292().edit().putInt(c3932.m13157(), seekBar.getProgress() + 6).apply();
        c3932.mo8453();
    }
}
