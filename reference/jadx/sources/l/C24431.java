package l;

import android.widget.SeekBar;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ID */
/* JADX INFO: loaded from: classes.dex */
public final class C24431 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21447 f79300;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f79301;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17695 f79302;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public C24431(C21447 c21447, TextView textView, C17695 c17695) {
        this.f79300 = c21447;
        this.f79301 = textView;
        this.f79302 = c17695;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        String string = this.f79300.getContext().getString(R.string.MT_Protector, Integer.valueOf(i));
        TextView textView = this.f79301;
        textView.setText(string);
        seekBar.setContentDescription(textView.getText());
        if (z) {
            this.f79302.m41420(i);
        }
    }
}
