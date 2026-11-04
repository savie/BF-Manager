package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۘ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes3.dex */
public final class C3836 extends C9829 {
    public C3836(Object[] objArr) {
        super(objArr, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12375(int i, C23974 c23974, C23974 c23975) {
        Object[] objArr;
        m52129(i);
        int i2 = this.f31644;
        Object[] objArr2 = this.f31642;
        int i3 = i2 + 2;
        if (i3 > objArr2.length) {
            if (i3 > objArr2.length) {
                int iMax = (int) Math.max(Math.min(((long) objArr2.length) + ((long) (objArr2.length >> 1)), 2147483639L), i3);
                Class<?> cls = objArr2.getClass();
                if (cls == Object[].class) {
                    objArr = iMax == 0 ? C8338.f27328 : new Object[iMax];
                } else {
                    objArr = (Object[]) Array.newInstance(cls.getComponentType(), iMax);
                }
                System.arraycopy(objArr2, 0, objArr, 0, i2);
                objArr2 = objArr;
            }
            this.f31642 = objArr2;
        }
        System.arraycopy(objArr2, i, objArr2, i + 2, i2 - i);
        objArr2[i] = c23974;
        objArr2[i + 1] = c23975;
        this.f31644 = i3;
    }
}
