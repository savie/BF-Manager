package l;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ۙۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8M6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4696 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13862 m14573(int i, byte[] bArr) {
        ArrayList arrayListM14572;
        C21287 c21287 = new C21287(bArr);
        try {
            c21287.m48503(4);
            int iM48500 = c21287.m48500();
            c21287.m48510(0);
            if (!(iM48500 == 1886547818)) {
                arrayListM14572 = m14572(c21287);
            } else {
                c21287.m48503(8);
                int iM48516 = c21287.m48516();
                int iM48509 = c21287.m48509();
                while (true) {
                    if (iM48516 < iM48509) {
                        int iM48501 = c21287.m48500() + iM48516;
                        if (iM48501 > iM48516 && iM48501 <= iM48509) {
                            int iM48502 = c21287.m48500();
                            if (iM48502 != 2037673328 && iM48502 != 1836279920) {
                                c21287.m48510(iM48501);
                                iM48516 = iM48501;
                            }
                            c21287.m48517(iM48501);
                            arrayListM14572 = m14572(c21287);
                        }
                    }
                    arrayListM14572 = null;
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (arrayListM14572 == null) {
            return null;
        }
        int size = arrayListM14572.size();
        if (size == 1) {
            C8642 c8642 = (C8642) arrayListM14572.get(0);
            return new C13862(c8642, c8642, i);
        }
        if (size != 2) {
            return null;
        }
        return new C13862((C8642) arrayListM14572.get(0), (C8642) arrayListM14572.get(1), i);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m14572(C21287 c21287) {
        C21287 c21288;
        int i;
        ArrayList arrayList;
        C8642 c8642;
        C21287 c21289 = c21287;
        if (c21287.m48493() != 0) {
            return null;
        }
        c21289.m48503(7);
        int iM48500 = c21287.m48500();
        if (iM48500 == 1684433976) {
            C21287 c212810 = new C21287();
            Inflater inflater = new Inflater(true);
            try {
                if (!C7116.m19492(c21289, c212810, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                c21289 = c212810;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iM48500 != 1918990112) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int iM48516 = c21289.m48516();
        int iM48509 = c21289.m48509();
        while (iM48516 < iM48509) {
            int iM48501 = c21289.m48500() + iM48516;
            if (iM48501 <= iM48516 || iM48501 > iM48509) {
                return null;
            }
            if (c21289.m48500() == 1835365224) {
                int iM48502 = c21289.m48500();
                if (iM48502 > 10000) {
                    c21288 = c21289;
                    arrayList = arrayList2;
                    i = iM48509;
                    c8642 = null;
                } else {
                    float[] fArr = new float[iM48502];
                    for (int i2 = 0; i2 < iM48502; i2++) {
                        fArr[i2] = Float.intBitsToFloat(c21289.m48500());
                    }
                    int iM48503 = c21289.m48500();
                    if (iM48503 > 32000) {
                        c21288 = c21289;
                        arrayList = arrayList2;
                        i = iM48509;
                    } else {
                        double dLog = Math.log(2.0d);
                        int iCeil = (int) Math.ceil(Math.log(((double) iM48502) * 2.0d) / dLog);
                        byte[] bArrM48497 = c21289.m48497();
                        C14573 c14573 = new C14573(bArrM48497, bArrM48497.length);
                        c14573.m35167(c21289.m48516() * 8);
                        float[] fArr2 = new float[iM48503 * 5];
                        int i3 = 5;
                        int[] iArr = new int[5];
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            if (i4 < iM48503) {
                                i = iM48509;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < i3) {
                                        int i7 = iArr[i6];
                                        int iM35163 = c14573.m35163(iCeil);
                                        int i8 = iCeil;
                                        int i9 = i7 + ((iM35163 >> 1) ^ (-(iM35163 & 1)));
                                        if (i9 < iM48502 && i9 >= 0) {
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
                                        iM48509 = i;
                                    }
                                }
                            } else {
                                i = iM48509;
                                c14573.m35167((c14573.m35166() + 7) & (-8));
                                int i10 = 32;
                                int iM35164 = c14573.m35163(32);
                                C7151[] c7151Arr = new C7151[iM35164];
                                int i11 = 0;
                                while (true) {
                                    if (i11 < iM35164) {
                                        int iM35165 = c14573.m35163(8);
                                        int iM35166 = c14573.m35163(8);
                                        int iM35167 = c14573.m35163(i10);
                                        if (iM35167 <= 128000) {
                                            c21288 = c21289;
                                            arrayList = arrayList2;
                                            int iCeil2 = (int) Math.ceil(Math.log(((double) iM48503) * 2.0d) / dLog);
                                            float[] fArr3 = new float[iM35167 * 3];
                                            int i12 = iM35164;
                                            float[] fArr4 = new float[iM35167 * 2];
                                            int i13 = 0;
                                            double d = dLog;
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < iM35167) {
                                                    int iM35168 = c14573.m35163(iCeil2);
                                                    int i15 = i13 + ((iM35168 >> 1) ^ (-(iM35168 & 1)));
                                                    if (i15 >= 0 && i15 < iM48503) {
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
                                                    c7151Arr[i11] = new C7151(iM35165, iM35166, fArr3, fArr4);
                                                    i11++;
                                                    i10 = 32;
                                                    c21289 = c21288;
                                                    arrayList2 = arrayList;
                                                    iM35164 = i12;
                                                    dLog = d;
                                                }
                                            }
                                        }
                                    } else {
                                        c21288 = c21289;
                                        arrayList = arrayList2;
                                        c8642 = new C8642(c7151Arr);
                                    }
                                }
                            }
                            c21288 = c21289;
                            arrayList = arrayList2;
                        }
                    }
                    c8642 = null;
                }
                if (c8642 == null) {
                    return null;
                }
                arrayList2 = arrayList;
                arrayList2.add(c8642);
            } else {
                c21288 = c21289;
                i = iM48509;
            }
            c21288.m48510(iM48501);
            iM48509 = i;
            iM48516 = iM48501;
            c21289 = c21288;
        }
        return arrayList2;
    }
}
