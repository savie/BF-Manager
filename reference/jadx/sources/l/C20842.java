package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.᩷ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20842 extends C8387 {
    public C20842(Object[] objArr) {
        super(objArr, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46865(int i, C7436 c7436, C7436 c7437) {
        Object[] objArr;
        m8301(i);
        int i2 = this.f29127;
        Object[] objArr2 = this.f29126;
        int i3 = i2 + 2;
        if (i3 > objArr2.length) {
            if (i3 > objArr2.length) {
                int iMax = (int) Math.max(Math.min(((long) objArr2.length) + ((long) (objArr2.length >> 1)), 2147483639L), i3);
                Class<?> cls = objArr2.getClass();
                if (cls == Object[].class) {
                    objArr = iMax == 0 ? C7681.f25444 : new Object[iMax];
                } else {
                    objArr = (Object[]) Array.newInstance(cls.getComponentType(), iMax);
                }
                System.arraycopy(objArr2, 0, objArr, 0, i2);
                objArr2 = objArr;
            }
            this.f29126 = objArr2;
        }
        System.arraycopy(objArr2, i, objArr2, i + 2, i2 - i);
        objArr2[i] = c7436;
        objArr2[i + 1] = c7437;
        this.f29127 = i3;
    }
}
