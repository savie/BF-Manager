package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۖۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B5N */
/* JADX INFO: loaded from: classes3.dex */
public final class C2501 extends AbstractC8853 {
    @Override // l.AbstractC20847
    public final float getValue(Object obj) {
        return ((View) obj).getScrollX();
    }

    @Override // l.AbstractC20847
    public final void setValue(Object obj, float f) {
        ((View) obj).setScrollX((int) f);
    }
}
