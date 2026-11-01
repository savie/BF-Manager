package l;

import android.util.FloatProperty;

/* JADX INFO: renamed from: l.۟ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB43 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7441 extends AbstractC20847 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatProperty f24817;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7441(String str, FloatProperty floatProperty) {
        super(str);
        this.f24817 = floatProperty;
    }

    @Override // l.AbstractC20847
    public final float getValue(Object obj) {
        return ((Float) this.f24817.get(obj)).floatValue();
    }

    @Override // l.AbstractC20847
    public final void setValue(Object obj, float f) {
        this.f24817.setValue(obj, f);
    }
}
