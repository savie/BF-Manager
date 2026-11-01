package l;

import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8581 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f29663;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f29664;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f29665;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10948 f29666;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f29667;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f29668;

    public /* synthetic */ RunnableC8581(Main main, long j, Spinner spinner, C10948 c10948, Spinner spinner2, TextView textView) {
        this.f29665 = main;
        this.f29668 = j;
        this.f29663 = spinner;
        this.f29666 = c10948;
        this.f29664 = spinner2;
        this.f29667 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Spinner spinner = this.f29664;
        int selectedItemPosition = this.f29663.getSelectedItemPosition();
        TextView textView = this.f29667;
        if (selectedItemPosition == 2 || selectedItemPosition == 3) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        Main main = this.f29665;
        long j = this.f29668;
        C10948 c10948 = this.f29666;
        long j2 = 1;
        try {
            if (selectedItemPosition == 0) {
                long j3 = ((long) Integer.parseInt(c10948.m17000().toString())) * (1 << (spinner.getSelectedItemPosition() * 10));
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
                int i2 = Integer.parseInt(c10948.m17000().toString());
                if (i2 == 0) {
                    textView.setText("...");
                    return;
                }
                long j4 = j / ((long) i2);
                if (j4 >= 1 || j4 >= j) {
                    j2 = j4;
                }
                textView.setText(main.getString(R.string.MT_Protector, C1791.m5873(j2)));
            }
        } catch (Exception e) {
            if (c10948.m16842() == 0) {
                textView.setText("...");
            } else {
                textView.setText(e.toString());
            }
        }
    }
}
