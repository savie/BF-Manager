package l;

import android.util.FloatProperty;

/* JADX INFO: renamed from: l.ۛۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB43 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6327 extends AbstractC24227 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatProperty f21438;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6327(String str, FloatProperty floatProperty) {
        super(str);
        this.f21438 = floatProperty;
    }

    @Override // l.AbstractC24227
    public final float getValue(Object obj) {
        return ((Float) this.f21438.get(obj)).floatValue();
    }

    @Override // l.AbstractC24227
    public final void setValue(Object obj, float f) {
        this.f21438.setValue(obj, f);
    }
}
