package l;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10687 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Spinner f36486;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public View f36487;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f36488;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3629 f36489;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public TextView f36490;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View f36491;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public View f36492;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26896(int i) {
        TextView textView = this.f36488;
        View view = this.f36487;
        View view2 = this.f36491;
        View view3 = this.f36492;
        C3629 c3629 = this.f36489;
        TextView textView2 = this.f36490;
        if (i == 0) {
            view3.setVisibility(0);
            view2.setVisibility(8);
            view.setVisibility(8);
            textView.setText(R.string.MT_Protector);
        } else if (i == 1) {
            view3.setVisibility(0);
            view2.setVisibility(0);
            view.setVisibility(8);
            textView.setText(R.string.MT_Protector);
        } else if (i == 2) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            view.setVisibility(0);
            textView.setText(R.string.MT_Protector);
        } else {
            throw new RuntimeException();
        }
        if (i != 2) {
            C7864 c7864 = c3629.f13333;
            if (c7864.f25879.m7428() && c7864.f25880.m7428() && c7864.f25877.m7428()) {
                textView2.setText(c3629.f13333.m20761());
                textView2.setVisibility(0);
                return;
            } else {
                textView2.setVisibility(8);
                return;
            }
        }
        C0807 c0807 = c3629.f13332;
        if (c0807.f3416.m7428() && c0807.f3420.m7428() && c0807.f3414.m7428()) {
            textView2.setText(c3629.f13332.m3377());
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }
}
