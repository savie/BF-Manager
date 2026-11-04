package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes.dex */
public final class C23748 extends AbstractC11800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f76958;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f76959;

    public C23748(View view) {
        super(view);
        this.f76958 = (ImageView) view.findViewById(R.id.icon);
        this.f76959 = (TextView) view.findViewById(R.id.title);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53030(int i, int i2) {
        this.f76959.setText(i);
        this.f76958.setImageResource(i2);
    }
}
