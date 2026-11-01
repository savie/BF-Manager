package l;

import android.widget.SeekBar;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes.dex */
public final class C22278 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC17341 f72808;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f72808.m40346((CharSequence) String.format(Locale.ROOT, "%.2f", Float.valueOf(((i * 5) + 80) / 100.0f)));
        }
    }

    public C22278(AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341) {
        this.f72808 = abstractDialogInterfaceOnClickListenerC17341;
    }
}
