package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ۤܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y16E */
/* JADX INFO: loaded from: classes3.dex */
public final class C10935 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22870 f34590;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f34591;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f34592;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C10935(C22870 c22870, DialogInterfaceC8327 dialogInterfaceC8327, String str) {
        this.f34590 = c22870;
        this.f34592 = dialogInterfaceC8327;
        this.f34591 = str;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f34592.m22439(this.f34591 + (seekBar.getProgress() + 6) + "dp)");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C22870 c22870 = this.f34590;
        c22870.m29658().edit().putInt(c22870.m12557(), seekBar.getProgress() + 6).apply();
        c22870.mo7306();
    }
}
