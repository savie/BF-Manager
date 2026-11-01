package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes3.dex */
public final class C7585 extends AbstractC12554 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f25112;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f25113;

    public C7585(View view) {
        super(view);
        this.f25112 = (ImageView) view.findViewById(R.id.icon);
        this.f25113 = (TextView) view.findViewById(R.id.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20104(int i, int i2) {
        this.f25113.setText(i);
        this.f25112.setImageResource(i2);
    }
}
