package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.֨ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SX */
/* JADX INFO: loaded from: classes2.dex */
public final class C1255 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f5473;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f5474;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23537 f5475;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C1255(DialogInterfaceC19356 dialogInterfaceC19356, String str, InterfaceC23537 interfaceC23537) {
        this.f5473 = dialogInterfaceC19356;
        this.f5474 = str;
        this.f5475 = interfaceC23537;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f5473.m44377(this.f5474 + (seekBar.getProgress() + 5) + "s)");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f5475.accept(seekBar.getProgress() + 5);
    }
}
