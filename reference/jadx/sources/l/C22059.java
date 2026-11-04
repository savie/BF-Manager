package l;

import android.widget.SeekBar;

/* JADX INFO: renamed from: l.᩷۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SX */
/* JADX INFO: loaded from: classes.dex */
public final class C22059 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f71133;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f71134;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14984 f71135;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C22059(DialogInterfaceC8327 dialogInterfaceC8327, String str, InterfaceC14984 interfaceC14984) {
        this.f71133 = dialogInterfaceC8327;
        this.f71134 = str;
        this.f71135 = interfaceC14984;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f71133.m22439(this.f71134 + (seekBar.getProgress() + 5) + "s)");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f71135.accept(seekBar.getProgress() + 5);
    }
}
