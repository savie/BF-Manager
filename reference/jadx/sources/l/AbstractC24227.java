package l;

import android.util.FloatProperty;

/* JADX INFO: renamed from: l.᩺ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB43 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24227 {
    public final String mPropertyName;

    public abstract float getValue(Object obj);

    public abstract void setValue(Object obj, float f);

    public AbstractC24227(String str) {
        this.mPropertyName = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC24227 m54211(FloatProperty floatProperty) {
        return new C6327(floatProperty.getName(), floatProperty);
    }
}
