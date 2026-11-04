package l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: l.᩵ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: RAP3 */
/* JADX INFO: loaded from: classes5.dex */
public class C20555 extends C5752 {
    public C20555(Context context) {
        super(context);
        m47122(context);
    }

    public C20555(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m47122(context);
    }

    public C20555(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m47122(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47122(Context context) {
        C17423.m40911(this);
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
