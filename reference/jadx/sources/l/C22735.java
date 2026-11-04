package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩸ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B5N */
/* JADX INFO: loaded from: classes.dex */
public final class C22735 extends AbstractC20497 {
    @Override // l.AbstractC24227
    public final float getValue(Object obj) {
        return ((View) obj).getScrollY();
    }

    @Override // l.AbstractC24227
    public final void setValue(Object obj, float f) {
        ((View) obj).setScrollY((int) f);
    }
}
