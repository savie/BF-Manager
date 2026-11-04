package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.ۛܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class C6553 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7198 f21997;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f21998;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f21999;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C6553(DialogInterfaceC8327 dialogInterfaceC8327, String str, C7198 c7198) {
        this.f21999 = dialogInterfaceC8327;
        this.f21998 = str;
        this.f21997 = c7198;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (i < 20) {
            seekBar.setProgress(20);
            return;
        }
        this.f21999.m22439(this.f21998 + i + "%)");
        this.f21997.m19774(((float) i) / 100.0f);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        ApplicationC17729.f58258.edit().mo3486((int) (this.f21997.m19786() * 100.0f), "bottom_content_view_ratio_int").apply();
    }
}
