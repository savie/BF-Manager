package l;

import android.util.FloatProperty;

/* JADX INFO: renamed from: l.᩷ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB43 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20847 {
    public final String mPropertyName;

    public abstract float getValue(Object obj);

    public abstract void setValue(Object obj, float f);

    public AbstractC20847(String str) {
        this.mPropertyName = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20847 m46872(FloatProperty floatProperty) {
        return new C7441(floatProperty.getName(), floatProperty);
    }
}
