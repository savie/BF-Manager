package l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: l.ۢ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAP3 */
/* JADX INFO: loaded from: classes4.dex */
public class C9784 extends C22357 {
    public C9784(Context context) {
        super(context);
        m24890(context);
    }

    public C9784(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24890(context);
    }

    public C9784(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24890(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24890(Context context) {
        C0674.m3027(this);
        setGravity(17);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        int i = (int) ((8.0f * f) + 0.5f);
        int i2 = (int) ((6.0f * f) + 0.5f);
        int i3 = (i2 * 2) + ((int) ((displayMetrics.scaledDensity * 180.0f) + 0.5f));
        setPadding(i2, i, i2, i);
        setMinWidth((int) ((f * 48.0f) + 0.5f));
        setMaxWidth(i3);
        setEllipsize(TextUtils.TruncateAt.END);
        setSingleLine();
        setTextSize(16.0f);
    }
}
