package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.۟᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64NM */
/* JADX INFO: loaded from: classes3.dex */
public final class C7681 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Object[] f25444 = new Object[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object[] f25443 = new Object[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object[] m20308(int i, int i2, Object[] objArr) {
        Object[] objArr2;
        Class<?> cls = objArr.getClass();
        if (cls == Object[].class) {
            objArr2 = i == 0 ? f25444 : new Object[i];
        } else {
            objArr2 = (Object[]) Array.newInstance(cls.getComponentType(), i);
        }
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        return objArr2;
    }
}
