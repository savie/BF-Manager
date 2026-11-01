package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩺ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B5N */
/* JADX INFO: loaded from: classes.dex */
public final class C22964 extends AbstractC8853 {
    @Override // l.AbstractC20847
    public final float getValue(Object obj) {
        return ((View) obj).getRotation();
    }

    @Override // l.AbstractC20847
    public final void setValue(Object obj, float f) {
        ((View) obj).setRotation(f);
    }
}
