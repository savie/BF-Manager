package l;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9245 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f30091;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f30092;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Spinner f30093;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public View f30094;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C1789 f30095;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public View f30096;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f30097;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24430(int i) {
        TextView textView = this.f30091;
        View view = this.f30097;
        View view2 = this.f30096;
        View view3 = this.f30094;
        C1789 c1789 = this.f30095;
        TextView textView2 = this.f30092;
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
            C3280 c3280 = c1789.f6106;
            if (c3280.f10689.m50980() && c3280.f10693.m50980() && c3280.f10691.m50980()) {
                textView2.setText(c1789.f6106.m10815());
                textView2.setVisibility(0);
                return;
            } else {
                textView2.setVisibility(8);
                return;
            }
        }
        C12975 c12975 = c1789.f6105;
        if (c12975.f41599.m50980() && c12975.f41602.m50980() && c12975.f41601.m50980()) {
            textView2.setText(c1789.f6105.m32385());
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }
}
