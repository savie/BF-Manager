package l;

import android.widget.SeekBar;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۙܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes2.dex */
public final class C4970 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC8552 f17295;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f17295.m22924((CharSequence) String.format(Locale.ROOT, "%.2f", Float.valueOf(((i * 5) + 80) / 100.0f)));
        }
    }

    public C4970(AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552) {
        this.f17295 = abstractDialogInterfaceOnClickListenerC8552;
    }
}
