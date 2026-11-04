package l;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J4W4 */
/* JADX INFO: loaded from: classes3.dex */
public class C5994 extends PopupWindow {
    public C5994(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17421(context, attributeSet, i);
    }

    public C5994(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        m17421(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17421(Context context, AttributeSet attributeSet, int i) {
        C5204 c5204M15649 = C5204.m15649(context, attributeSet, C10401.f33060, i, 0);
        if (c5204M15649.m15655(2)) {
            C20323.m46665(this, c5204M15649.m15654(2, false));
        }
        setBackgroundDrawable(c5204M15649.m15669(0));
        c5204M15649.m15664();
    }
}
