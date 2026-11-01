package l;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21520 extends AbstractC12554 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View f69919;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f69920;

    public C21520(View view) {
        super(view);
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f69920 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f69919 = view.findViewById(R.id.MT_Protector);
    }
}
