package l;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.᩵۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8M6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19486 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8197 m44544(int i, byte[] bArr) {
        ArrayList arrayListM44543;
        C2460 c2460 = new C2460(bArr);
        try {
            c2460.m7535(4);
            int iM7499 = c2460.m7499();
            c2460.m7510(0);
            if (!(iM7499 == 1886547818)) {
                arrayListM44543 = m44543(c2460);
            } else {
                c2460.m7535(8);
                int iM7500 = c2460.m7500();
                int iM7509 = c2460.m7509();
                while (true) {
                    if (iM7500 < iM7509) {
                        int iM74910 = c2460.m7499() + iM7500;
                        if (iM74910 > iM7500 && iM74910 <= iM7509) {
                            int iM74911 = c2460.m7499();
                            if (iM74911 != 2037673328 && iM74911 != 1836279920) {
                                c2460.m7510(iM74910);
                                iM7500 = iM74910;
                            }
                            c2460.m7501(iM74910);
                            arrayListM44543 = m44543(c2460);
                        }
                    }
                    arrayListM44543 = null;
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (arrayListM44543 == null) {
            return null;
        }
        int size = arrayListM44543.size();
        if (size == 1) {
            C18074 c18074 = (C18074) arrayListM44543.get(0);
            return new C8197(c18074, c18074, i);
        }
        if (size != 2) {
            return null;
        }
        return new C8197((C18074) arrayListM44543.get(0), (C18074) arrayListM44543.get(1), i);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44543(C2460 c2460) {
        C2460 c2461;
        int i;
        ArrayList arrayList;
        C18074 c18074;
        C2460 c2462 = c2460;
        if (c2460.m7516() != 0) {
            return null;
        }
        c2462.m7535(7);
        int iM7499 = c2460.m7499();
        if (iM7499 == 1684433976) {
            C2460 c2463 = new C2460();
            Inflater inflater = new Inflater(true);
            try {
                if (!C17983.m41843(c2462, c2463, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                c2462 = c2463;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iM7499 != 1918990112) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int iM7500 = c2462.m7500();
        int iM7509 = c2462.m7509();
        while (iM7500 < iM7509) {
            int iM74910 = c2462.m7499() + iM7500;
            if (iM74910 <= iM7500 || iM74910 > iM7509) {
                return null;
            }
            if (c2462.m7499() == 1835365224) {
                int iM74911 = c2462.m7499();
                if (iM74911 > 10000) {
                    c2461 = c2462;
                    arrayList = arrayList2;
                    i = iM7509;
                    c18074 = null;
                } else {
                    float[] fArr = new float[iM74911];
                    for (int i2 = 0; i2 < iM74911; i2++) {
                        fArr[i2] = Float.intBitsToFloat(c2462.m7499());
                    }
                    int iM74912 = c2462.m7499();
                    if (iM74912 > 32000) {
                        c2461 = c2462;
                        arrayList = arrayList2;
                        i = iM7509;
                    } else {
                        double dLog = Math.log(2.0d);
                        int iCeil = (int) Math.ceil(Math.log(((double) iM74911) * 2.0d) / dLog);
                        byte[] bArrM7518 = c2462.m7518();
                        C11634 c11634 = new C11634(bArrM7518, bArrM7518.length);
                        c11634.m29029(c2462.m7500() * 8);
                        float[] fArr2 = new float[iM74912 * 5];
                        int i3 = 5;
                        int[] iArr = new int[5];
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            if (i4 < iM74912) {
                                i = iM7509;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < i3) {
                                        int i7 = iArr[i6];
                                        int iM29039 = c11634.m29039(iCeil);
                                        int i8 = iCeil;
                                        int i9 = i7 + ((iM29039 >> 1) ^ (-(iM29039 & 1)));
                                        if (i9 < iM74911 && i9 >= 0) {
                                            fArr2[i5] = fArr[i9];
                                            iArr[i6] = i9;
                                            i6++;
                                            i3 = 5;
                                            i5++;
                                            iCeil = i8;
                                        }
                                    } else {
                                        i4++;
                                        i3 = 5;
                                        iM7509 = i;
                                    }
                                }
                            } else {
                                i = iM7509;
                                c11634.m29029((c11634.m29028() + 7) & (-8));
                                int i10 = 32;
                                int iM290310 = c11634.m29039(32);
                                C18780[] c18780Arr = new C18780[iM290310];
                                int i11 = 0;
                                while (true) {
                                    if (i11 < iM290310) {
                                        int iM290311 = c11634.m29039(8);
                                        int iM290312 = c11634.m29039(8);
                                        int iM290313 = c11634.m29039(i10);
                                        if (iM290313 <= 128000) {
                                            c2461 = c2462;
                                            arrayList = arrayList2;
                                            int iCeil2 = (int) Math.ceil(Math.log(((double) iM74912) * 2.0d) / dLog);
                                            float[] fArr3 = new float[iM290313 * 3];
                                            int i12 = iM290310;
                                            float[] fArr4 = new float[iM290313 * 2];
                                            int i13 = 0;
                                            double d = dLog;
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < iM290313) {
                                                    int iM290314 = c11634.m29039(iCeil2);
                                                    int i15 = i13 + ((iM290314 >> 1) ^ (-(iM290314 & 1)));
                                                    if (i15 >= 0 && i15 < iM74912) {
                                                        int i16 = i14 * 3;
                                                        int i17 = i15 * 5;
                                                        fArr3[i16] = fArr2[i17];
                                                        fArr3[i16 + 1] = fArr2[i17 + 1];
                                                        fArr3[i16 + 2] = fArr2[i17 + 2];
                                                        int i18 = i14 * 2;
                                                        fArr4[i18] = fArr2[i17 + 3];
                                                        fArr4[i18 + 1] = fArr2[i17 + 4];
                                                        i14++;
                                                        i13 = i15;
                                                    }
                                                } else {
                                                    c18780Arr[i11] = new C18780(iM290311, iM290312, fArr3, fArr4);
                                                    i11++;
                                                    i10 = 32;
                                                    c2462 = c2461;
                                                    arrayList2 = arrayList;
                                                    iM290310 = i12;
                                                    dLog = d;
                                                }
                                            }
                                        }
                                    } else {
                                        c2461 = c2462;
                                        arrayList = arrayList2;
                                        c18074 = new C18074(c18780Arr);
                                    }
                                }
                            }
                            c2461 = c2462;
                            arrayList = arrayList2;
                        }
                    }
                    c18074 = null;
                }
                if (c18074 == null) {
                    return null;
                }
                arrayList2 = arrayList;
                arrayList2.add(c18074);
            } else {
                c2461 = c2462;
                i = iM7509;
            }
            c2461.m7510(iM74910);
            iM7509 = i;
            iM7500 = iM74910;
            c2462 = c2461;
        }
        return arrayList2;
    }
}
