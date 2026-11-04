package l;

import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16970 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f55483;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f55484;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f55485;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f55486;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f55487;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f55488;

    public /* synthetic */ RunnableC16970(Main main, long j, Spinner spinner, C23255 c23255, Spinner spinner2, TextView textView) {
        this.f55485 = main;
        this.f55488 = j;
        this.f55486 = spinner;
        this.f55483 = c23255;
        this.f55484 = spinner2;
        this.f55487 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Spinner spinner = this.f55484;
        int selectedItemPosition = this.f55486.getSelectedItemPosition();
        TextView textView = this.f55487;
        if (selectedItemPosition == 2 || selectedItemPosition == 3) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        Main main = this.f55485;
        long j = this.f55488;
        C23255 c23255 = this.f55483;
        long j2 = 1;
        try {
            if (selectedItemPosition == 0) {
                long j3 = ((long) Integer.parseInt(c23255.m54021().toString())) * (1 << (spinner.getSelectedItemPosition() * 10));
                if (j3 == 0) {
                    textView.setText("...");
                    return;
                }
                int i = (int) (j / j3);
                if (((long) i) * j3 != j || i == 0) {
                    i++;
                }
                textView.setText(main.getResources().getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i)));
                return;
            }
            if (selectedItemPosition == 1) {
                int i2 = Integer.parseInt(c23255.m54021().toString());
                if (i2 == 0) {
                    textView.setText("...");
                    return;
                }
                long j4 = j / ((long) i2);
                if (j4 >= 1 || j4 >= j) {
                    j2 = j4;
                }
                textView.setText(main.getString(R.string.MT_Protector, C8311.m22393(j2)));
            }
        } catch (Exception e) {
            if (c23255.m54099() == 0) {
                textView.setText("...");
            } else {
                textView.setText(e.toString());
            }
        }
    }
}
