package l;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J4W4 */
/* JADX INFO: loaded from: classes.dex */
public class C22587 extends PopupWindow {
    public C22587(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50095(context, attributeSet, i);
    }

    public C22587(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        m50095(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50095(Context context, AttributeSet attributeSet, int i) {
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, C12108.f40536, i, 0);
        if (c1977M6353.m6383(2)) {
            C10057.m25465(this, c1977M6353.m6376(2, false));
        }
        setBackgroundDrawable(c1977M6353.m6370(0));
        c1977M6353.m6379();
    }
}
