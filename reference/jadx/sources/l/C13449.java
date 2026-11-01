package l;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.۬᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13449 extends AbstractC6910 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6910 f44496 = new C13449(null, new Object[0], 0);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient int f44497;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient Object[] f44498;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient Object f44499;

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo7131() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13449 m32935(int i, Object[] objArr, C13261 c13261) {
        if (i == 0) {
            return (C13449) f44496;
        }
        if (i == 1) {
            C13638.requireNonNull(objArr[0]);
            C13638.requireNonNull(objArr[1]);
            return new C13449(null, objArr, 1);
        }
        C18304.m42519(i, objArr.length >> 1);
        Object objM32933 = m32933(i, AbstractC23844.m52566(i), 0, objArr);
        if (objM32933 instanceof Object[]) {
            Object[] objArr2 = (Object[]) objM32933;
            C1265 c1265 = (C1265) objArr2[2];
            if (c13261 == null) {
                throw c1265.m4589();
            }
            c13261.f44037 = c1265;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objM32933 = obj;
            i = iIntValue;
        }
        return new C13449(objM32933, objArr, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m32933(int i, int i2, int i3, Object[] objArr) {
        C1265 c1265 = null;
        int i4 = 1;
        if (i == 1) {
            C13638.requireNonNull(objArr[i3]);
            C13638.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i5 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = (i7 * 2) + i3;
                int i9 = (i6 * 2) + i3;
                Object obj = objArr[i8];
                C13638.requireNonNull(obj);
                Object obj2 = objArr[i8 ^ 1];
                C13638.requireNonNull(obj2);
                int iM30862 = C12411.m30862(obj.hashCode());
                while (true) {
                    int i10 = iM30862 & i5;
                    int i11 = bArr[i10] & 255;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj;
                            objArr[i9 ^ 1] = obj2;
                        }
                        i6++;
                        break;
                    }
                    if (obj.equals(objArr[i11])) {
                        int i12 = i11 ^ 1;
                        Object obj3 = objArr[i12];
                        C13638.requireNonNull(obj3);
                        c1265 = new C1265(obj, obj2, obj3);
                        objArr[i12] = obj2;
                        break;
                    }
                    iM30862 = i10 + 1;
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c1265};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = (i14 * 2) + i3;
                int i16 = (i13 * 2) + i3;
                Object obj4 = objArr[i15];
                C13638.requireNonNull(obj4);
                Object obj5 = objArr[i15 ^ 1];
                C13638.requireNonNull(obj5);
                int iM30863 = C12411.m30862(obj4.hashCode());
                while (true) {
                    int i17 = iM30863 & i5;
                    int i18 = sArr[i17] & HPKE.aead_EXPORT_ONLY;
                    if (i18 == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj4;
                            objArr[i16 ^ 1] = obj5;
                        }
                        i13++;
                        break;
                    }
                    if (obj4.equals(objArr[i18])) {
                        int i19 = i18 ^ 1;
                        Object obj6 = objArr[i19];
                        C13638.requireNonNull(obj6);
                        c1265 = new C1265(obj4, obj5, obj6);
                        objArr[i19] = obj5;
                        break;
                    }
                    iM30863 = i17 + 1;
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), c1265};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = (i20 * 2) + i3;
            int i23 = (i21 * 2) + i3;
            Object obj7 = objArr[i22];
            C13638.requireNonNull(obj7);
            Object obj8 = objArr[i4 ^ i22];
            C13638.requireNonNull(obj8);
            int iM30864 = C12411.m30862(obj7.hashCode());
            while (true) {
                int i24 = iM30864 & i5;
                int i25 = iArr[i24];
                if (i25 == -1) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj7;
                        objArr[i23 ^ 1] = obj8;
                    }
                    i21++;
                    break;
                }
                if (obj7.equals(objArr[i25])) {
                    int i26 = i25 ^ 1;
                    Object obj9 = objArr[i26];
                    C13638.requireNonNull(obj9);
                    c1265 = new C1265(obj7, obj8, obj9);
                    objArr[i26] = obj8;
                    break;
                }
                iM30864 = i24 + 1;
            }
            i20++;
            i4 = 1;
        }
        return i21 == i ? iArr : new Object[]{iArr, Integer.valueOf(i21), c1265};
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m32936(int i, int i2, int i3, Object[] objArr) {
        Object objM32933 = m32933(i, i2, i3, objArr);
        if (objM32933 instanceof Object[]) {
            throw ((C1265) ((Object[]) objM32933)[2]).m4589();
        }
        return objM32933;
    }

    public C13449(Object obj, Object[] objArr, int i) {
        this.f44499 = obj;
        this.f44498 = objArr;
        this.f44497 = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f44497;
    }

    @Override // l.AbstractC6910, java.util.Map
    public final Object get(Object obj) {
        Object objM32934 = m32934(this.f44499, this.f44498, this.f44497, 0, obj);
        if (objM32934 == null) {
            return null;
        }
        return objM32934;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m32934(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            C13638.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            C13638.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iM30862 = C12411.m30862(obj2.hashCode());
            while (true) {
                int i3 = iM30862 & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iM30862 = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iM30863 = C12411.m30862(obj2.hashCode());
            while (true) {
                int i5 = iM30863 & length2;
                int i6 = sArr[i5] & HPKE.aead_EXPORT_ONLY;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iM30863 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iM30864 = C12411.m30862(obj2.hashCode());
            while (true) {
                int i7 = iM30864 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iM30864 = i7 + 1;
            }
        }
    }

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23844 mo7130() {
        return new C5687(this, this.f44498, 0, this.f44497);
    }

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC23844 mo7133() {
        return new C22621(this, new C1453(0, this.f44497, this.f44498));
    }

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC1826 mo7132() {
        return new C1453(1, this.f44497, this.f44498);
    }

    @Override // l.AbstractC6910
    public Object writeReplace() {
        return super.writeReplace();
    }
}
