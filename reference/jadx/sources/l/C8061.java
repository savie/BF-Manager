package l;

import android.util.SparseArray;
import android.view.View;
import com.umeng.analytics.pro.cb;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21CQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8061 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f28250;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f28251;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC4136 f28252;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double[] f28254;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC4136[] f28257;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String[] f28259;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View f28260;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f28262;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public double[] f28263;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17938[] f28266;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public HashMap f28269;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public HashMap f28272;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int[] f28273;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f28253 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23584 f28270 = new C23584();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23584 f28249 = new C23584();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18644 f28264 = new C18644();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C18644 f28261 = new C18644();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f28256 = Float.NaN;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f28258 = 0.0f;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f28255 = 1.0f;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float[] f28248 = new float[4];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f28267 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float[] f28265 = new float[1];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f28271 = new ArrayList();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f28268 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21224(int i) {
    }

    public C8061(View view) {
        this.f28260 = view;
        this.f28251 = view.getId();
        view.getLayoutParams();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m21233() {
        return this.f28249.f76393;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m21232() {
        return this.f28249.f76394;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21226(int i, float[] fArr) {
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / (i2 - 1);
        HashMap map = this.f28250;
        AbstractC8102 abstractC8102 = map == null ? null : (AbstractC8102) map.get("translationX");
        HashMap map2 = this.f28250;
        AbstractC8102 abstractC8103 = map2 == null ? null : (AbstractC8102) map2.get("translationY");
        HashMap map3 = this.f28272;
        AbstractC22172 abstractC22172 = map3 == null ? null : (AbstractC22172) map3.get("translationX");
        HashMap map4 = this.f28272;
        AbstractC22172 abstractC22173 = map4 != null ? (AbstractC22172) map4.get("translationY") : null;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = i3 * f2;
            float f4 = this.f28255;
            float f5 = 0.0f;
            if (f4 != f) {
                float f6 = this.f28258;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = (f3 - f6) * f4;
                }
            }
            double dMo18708 = f3;
            C23584 c23584 = this.f28270;
            C23188 c23188 = c23584.f76401;
            float f7 = Float.NaN;
            for (C23584 c23585 : this.f28267) {
                float f8 = f2;
                C23188 c23189 = c23585.f76401;
                if (c23189 != null) {
                    float f9 = c23585.f76392;
                    if (f9 < f3) {
                        f5 = f9;
                        c23188 = c23189;
                    } else if (Float.isNaN(f7)) {
                        f7 = c23585.f76392;
                    }
                }
                f2 = f8;
            }
            float f10 = f2;
            if (c23188 != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                float f11 = f7 - f5;
                dMo18708 = (((float) c23188.mo18708((f3 - f5) / f11)) * f11) + f5;
            }
            this.f28257[0].mo4689(dMo18708, this.f28254);
            AbstractC4136 abstractC4136 = this.f28252;
            if (abstractC4136 != null) {
                double[] dArr = this.f28254;
                if (dArr.length > 0) {
                    abstractC4136.mo4689(dMo18708, dArr);
                }
            }
            int i4 = i3 * 2;
            c23584.m52014(this.f28273, this.f28254, fArr, i4);
            if (abstractC22172 != null) {
                fArr[i4] = abstractC22172.m49189(f3) + fArr[i4];
            } else if (abstractC8102 != null) {
                fArr[i4] = abstractC8102.m21316(f3) + fArr[i4];
            }
            if (abstractC22173 != null) {
                int i5 = i4 + 1;
                fArr[i5] = abstractC22173.m49189(f3) + fArr[i5];
            } else if (abstractC8103 != null) {
                int i6 = i4 + 1;
                fArr[i6] = abstractC8103.m21316(f3) + fArr[i6];
            }
            i3++;
            f = 1.0f;
            i2 = i;
            f2 = f10;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21220(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrMo4691 = this.f28257[0].mo4691();
        if (iArr != null) {
            Iterator it = this.f28267.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((C23584) it.next()).f76398;
                i++;
            }
        }
        int i2 = 0;
        for (double d : dArrMo4691) {
            this.f28257[0].mo4689(d, this.f28254);
            this.f28270.m52014(this.f28273, this.f28254, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21223(float f, float[] fArr) {
        this.f28257[0].mo4689(m21218(f, (float[]) null), this.f28254);
        int[] iArr = this.f28273;
        double[] dArr = this.f28254;
        C23584 c23584 = this.f28270;
        float f2 = c23584.f76393;
        float f3 = c23584.f76394;
        float f4 = c23584.f76396;
        float f5 = c23584.f76403;
        for (int i = 0; i < iArr.length; i++) {
            float f6 = (float) dArr[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f6;
            } else if (i2 == 2) {
                f3 = f6;
            } else if (i2 == 3) {
                f4 = f6;
            } else if (i2 == 4) {
                f5 = f6;
            }
        }
        float f7 = f4 + f2;
        float f8 = f5 + f3;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f9 = f2 + 0.0f;
        float f10 = f3 + 0.0f;
        float f11 = f7 + 0.0f;
        float f12 = f8 + 0.0f;
        fArr[0] = f9;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f10;
        fArr[4] = f11;
        fArr[5] = f12;
        fArr[6] = f9;
        fArr[7] = f12;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21228(ArrayList arrayList) {
        this.f28271.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21229(AbstractC9077 abstractC9077) {
        this.f28271.add(abstractC9077);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21234(int i) {
        this.f28268 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x050a  */
    /* JADX WARN: Code duplicated, block: B:300:0x0718  */
    /* JADX WARN: Code duplicated, block: B:439:0x0afb  */
    /* JADX WARN: Code duplicated, block: B:462:0x0bbc A[PHI: r4
      0x0bbc: PHI (r4v18 java.lang.String) = (r4v17 java.lang.String), (r4v19 java.lang.String) binds: [B:461:0x0bba, B:457:0x0b99] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x0304  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21225(int i, int i2, long j) {
        C18644 c18644;
        C18644 c18645;
        ArrayList<AbstractC9077> arrayList;
        HashMap map;
        HashSet hashSet;
        ArrayList arrayList2;
        C8061 c8061;
        HashSet hashSet2;
        C23584 c23584;
        HashSet hashSet3;
        ArrayList arrayList3;
        String str;
        HashSet hashSet4;
        HashSet hashSet5;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        byte b;
        AbstractC22172 c2019;
        String str10;
        String str11;
        String str12;
        double dMo18708;
        String str13;
        HashSet hashSet6;
        Iterator it;
        HashMap map2;
        AbstractC23625 c20097;
        AbstractC23625 abstractC23625;
        C9824 c9824;
        String str14;
        HashSet hashSet7;
        HashMap map3;
        HashSet hashSet8;
        byte b2;
        AbstractC8102 c3867;
        C9824 c9825;
        C23584 c23585;
        C8061 c8062;
        HashSet hashSet9;
        HashSet hashSet10;
        HashMap map4;
        HashSet hashSet11;
        C3826 c3826;
        int i3;
        C8061 c8063 = this;
        new HashSet();
        HashSet hashSet12 = new HashSet();
        HashSet hashSet13 = new HashSet();
        HashSet hashSet14 = new HashSet();
        HashMap map5 = new HashMap();
        int i4 = c8063.f28268;
        C23584 c23586 = c8063.f28270;
        int i5 = -1;
        if (i4 != -1) {
            c23586.f76402 = i4;
        }
        C18644 c18646 = c8063.f28264;
        C18644 c18647 = c8063.f28261;
        c18646.m43128(c18647, hashSet13);
        float f = Float.NaN;
        C23584 c23587 = c8063.f28249;
        ArrayList arrayList4 = c8063.f28267;
        ArrayList arrayList5 = c8063.f28271;
        int i6 = 0;
        if (arrayList5 != null) {
            Iterator it2 = arrayList5.iterator();
            ArrayList arrayList6 = null;
            while (it2.hasNext()) {
                AbstractC9077 abstractC9077 = (AbstractC9077) it2.next();
                Iterator it3 = it2;
                if (abstractC9077 instanceof C3826) {
                    C3826 c3827 = (C3826) abstractC9077;
                    C23584 c23588 = new C23584();
                    c23588.f76391 = i6;
                    c23588.f76395 = f;
                    c23588.f76402 = i5;
                    c23588.f76400 = new LinkedHashMap();
                    c23588.f76398 = i6;
                    c23588.f76404 = new double[18];
                    c23588.f76397 = new double[18];
                    int i7 = c3827.f14183;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            float f2 = c3827.f30946 / 100.0f;
                            c23588.f76392 = f2;
                            c23588.f76391 = c3827.f14185;
                            float f3 = Float.isNaN(c3827.f14180) ? f2 : c3827.f14180;
                            float f4 = Float.isNaN(c3827.f14182) ? f2 : c3827.f14182;
                            c18647 = c18647;
                            float f5 = c23587.f76396;
                            c18646 = c18646;
                            float f6 = c23586.f76396;
                            float f7 = f5 - f6;
                            arrayList5 = arrayList5;
                            float f8 = c23587.f76403;
                            hashSet13 = hashSet13;
                            float f9 = c23586.f76403;
                            float f10 = f8 - f9;
                            map5 = map5;
                            c23588.f76399 = c23588.f76392;
                            float f11 = c23586.f76393;
                            hashSet12 = hashSet12;
                            float f12 = c23586.f76394;
                            hashSet14 = hashSet14;
                            float f13 = ((f5 / 2.0f) + c23587.f76393) - ((f6 / 2.0f) + f11);
                            float f14 = ((f8 / 2.0f) + c23587.f76394) - ((f9 / 2.0f) + f12);
                            float f15 = (f13 * f2) + f11;
                            float f16 = f7 * f3;
                            float f17 = f16 / 2.0f;
                            c23588.f76393 = (int) (f15 - f17);
                            float f18 = (f14 * f2) + f12;
                            float f19 = f10 * f4;
                            float f20 = f19 / 2.0f;
                            c23588.f76394 = (int) (f18 - f20);
                            c23588.f76396 = (int) (f6 + f16);
                            c23588.f76403 = (int) (f9 + f19);
                            float f21 = Float.isNaN(c3827.f14181) ? f2 : c3827.f14181;
                            float f22 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            if (!Float.isNaN(c3827.f14186)) {
                                f2 = c3827.f14186;
                            }
                            float f23 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            c23588.f76398 = 2;
                            c23588.f76393 = (int) (((f23 * f14) + ((f21 * f13) + c23586.f76393)) - f17);
                            c23588.f76394 = (int) (((f14 * f2) + ((f13 * f22) + c23586.f76394)) - f20);
                            c23588.f76401 = C23188.m51213(c3827.f14184);
                            c23588.f76402 = c3827.f14179;
                            c23585 = c23586;
                            c3826 = c3827;
                        } else {
                            float f24 = c3827.f30946 / 100.0f;
                            c23588.f76392 = f24;
                            c23588.f76391 = c3827.f14185;
                            float f25 = Float.isNaN(c3827.f14180) ? f24 : c3827.f14180;
                            float f26 = Float.isNaN(c3827.f14182) ? f24 : c3827.f14182;
                            float f27 = c23587.f76396;
                            float f28 = c23586.f76396;
                            float f29 = f27 - f28;
                            float f30 = c23587.f76403;
                            float f31 = c23586.f76403;
                            float f32 = f30 - f31;
                            c23588.f76399 = c23588.f76392;
                            float f33 = c23586.f76393;
                            float f34 = c23586.f76394;
                            float f35 = (f27 / 2.0f) + c23587.f76393;
                            float f36 = (f30 / 2.0f) + c23587.f76394;
                            float f37 = f29 * f25;
                            c23588.f76393 = (int) ((((f35 - ((f28 / 2.0f) + f33)) * f24) + f33) - (f37 / 2.0f));
                            float f38 = f32 * f26;
                            c23588.f76394 = (int) ((((f36 - ((f31 / 2.0f) + f34)) * f24) + f34) - (f38 / 2.0f));
                            c23588.f76396 = (int) (f28 + f37);
                            c23588.f76403 = (int) (f31 + f38);
                            c23588.f76398 = 3;
                            if (!Float.isNaN(c3827.f14181)) {
                                c23588.f76393 = (int) (c3827.f14181 * ((int) (i - c23588.f76396)));
                            }
                            if (!Float.isNaN(c3827.f14186)) {
                                c23588.f76394 = (int) (c3827.f14186 * ((int) (i2 - c23588.f76403)));
                            }
                            c23588.f76401 = C23188.m51213(c3827.f14184);
                            c23588.f76402 = c3827.f14179;
                            c23585 = c23586;
                            c3826 = c3827;
                        }
                        arrayList4.add((-Collections.binarySearch(arrayList4, c23588)) - 1, c23588);
                        i3 = c3826.f22460;
                        if (i3 != -1) {
                            c8062 = this;
                            c8062.f28253 = i3;
                        } else {
                            c8062 = this;
                        }
                        hashSet11 = hashSet13;
                        map4 = map5;
                        hashSet10 = hashSet12;
                        hashSet9 = hashSet14;
                    } else {
                        float f39 = c3827.f30946 / 100.0f;
                        c23588.f76392 = f39;
                        c23588.f76391 = c3827.f14185;
                        float f40 = Float.isNaN(c3827.f14180) ? f39 : c3827.f14180;
                        float f41 = Float.isNaN(c3827.f14182) ? f39 : c3827.f14182;
                        float f42 = c23587.f76396 - c23586.f76396;
                        float f43 = c23587.f76403 - c23586.f76403;
                        c23588.f76399 = c23588.f76392;
                        if (!Float.isNaN(c3827.f14181)) {
                            f39 = c3827.f14181;
                        }
                        float f44 = c23586.f76393;
                        float f45 = c23586.f76396;
                        float f46 = c23586.f76394;
                        float f47 = c23586.f76403;
                        C23584 c23589 = c23586;
                        float f48 = ((c23587.f76396 / 2.0f) + c23587.f76393) - ((f45 / 2.0f) + f44);
                        float f49 = ((c23587.f76403 / 2.0f) + c23587.f76394) - ((f47 / 2.0f) + f46);
                        float f50 = f48 * f39;
                        float f51 = f40 * f42;
                        float f52 = f51 / 2.0f;
                        c23588.f76393 = (int) ((f44 + f50) - f52);
                        float f53 = f39 * f49;
                        float f54 = f41 * f43;
                        float f55 = f54 / 2.0f;
                        c23588.f76394 = (int) ((f46 + f53) - f55);
                        c23588.f76396 = (int) (f45 + f51);
                        c23588.f76403 = (int) (f47 + f54);
                        c3826 = c3827;
                        float f56 = Float.isNaN(c3826.f14186) ? 0.0f : c3826.f14186;
                        float f57 = (-f49) * f56;
                        float f58 = f48 * f56;
                        c23588.f76398 = 1;
                        c23585 = c23589;
                        float f59 = (int) ((c23585.f76393 + f50) - f52);
                        float f60 = (int) ((c23585.f76394 + f53) - f55);
                        c23588.f76393 = f59 + f57;
                        c23588.f76394 = f60 + f58;
                        c23588.f76401 = C23188.m51213(c3826.f14184);
                        c23588.f76402 = c3826.f14179;
                    }
                    arrayList4.add((-Collections.binarySearch(arrayList4, c23588)) - 1, c23588);
                    i3 = c3826.f22460;
                    if (i3 != -1) {
                        c8062 = this;
                        c8062.f28253 = i3;
                    } else {
                        c8062 = this;
                    }
                    hashSet11 = hashSet13;
                    map4 = map5;
                    hashSet10 = hashSet12;
                    hashSet9 = hashSet14;
                } else {
                    HashSet hashSet15 = hashSet12;
                    HashSet hashSet16 = hashSet13;
                    HashSet hashSet17 = hashSet14;
                    HashMap map6 = map5;
                    c18646 = c18646;
                    c23585 = c23586;
                    c18647 = c18647;
                    arrayList4 = arrayList4;
                    arrayList5 = arrayList5;
                    c8062 = c8063;
                    if (abstractC9077 instanceof C20365) {
                        hashSet9 = hashSet17;
                        abstractC9077.mo18025(hashSet9);
                        hashSet11 = hashSet16;
                        map4 = map6;
                        hashSet10 = hashSet15;
                    } else {
                        hashSet9 = hashSet17;
                        if (abstractC9077 instanceof C15117) {
                            hashSet10 = hashSet15;
                            abstractC9077.mo18025(hashSet10);
                        } else {
                            hashSet10 = hashSet15;
                            if (abstractC9077 instanceof C17938) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                ArrayList arrayList7 = arrayList6;
                                arrayList7.add((C17938) abstractC9077);
                                arrayList6 = arrayList7;
                            } else {
                                map4 = map6;
                                abstractC9077.mo20250(map4);
                                hashSet11 = hashSet16;
                                abstractC9077.mo18025(hashSet11);
                            }
                        }
                        hashSet11 = hashSet16;
                        map4 = map6;
                    }
                }
                i5 = -1;
                i6 = 0;
                f = Float.NaN;
                arrayList4 = arrayList4;
                hashSet12 = hashSet10;
                map5 = map4;
                it2 = it3;
                c18647 = c18647;
                c18646 = c18646;
                arrayList5 = arrayList5;
                C23584 c235810 = c23585;
                hashSet14 = hashSet9;
                c8063 = c8062;
                hashSet13 = hashSet11;
                c23586 = c235810;
            }
            c18644 = c18646;
            c18645 = c18647;
            arrayList = arrayList5;
            map = map5;
            hashSet = hashSet12;
            arrayList2 = arrayList4;
            HashSet hashSet18 = hashSet13;
            c8061 = c8063;
            hashSet2 = hashSet14;
            c23584 = c23586;
            hashSet3 = hashSet18;
            arrayList3 = arrayList6;
        } else {
            c18644 = c18646;
            c18645 = c18647;
            arrayList = arrayList5;
            map = map5;
            hashSet = hashSet12;
            arrayList2 = arrayList4;
            c8061 = c8063;
            hashSet2 = hashSet14;
            c23584 = c23586;
            hashSet3 = hashSet13;
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            c8061.f28266 = (C17938[]) arrayList3.toArray(new C17938[0]);
        }
        String str15 = "rotation";
        String str16 = "scaleY";
        String str17 = "scaleX";
        String str18 = "progress";
        String str19 = "translationZ";
        String str20 = "translationY";
        String str21 = "translationX";
        HashSet hashSet19 = hashSet2;
        String str22 = "rotationY";
        String str23 = "rotationX";
        C23584 c235811 = c23584;
        String str24 = "CUSTOM,";
        ArrayList<C23584> arrayList8 = arrayList2;
        if (hashSet3.isEmpty()) {
            str = "CUSTOM,";
            hashSet4 = hashSet;
            hashSet5 = hashSet3;
        } else {
            c8061.f28250 = new HashMap();
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                Iterator it5 = it4;
                String str25 = (String) it4.next();
                if (!str25.startsWith(str24)) {
                    str14 = str24;
                    hashSet7 = hashSet;
                    map3 = map;
                    hashSet8 = hashSet3;
                    switch (str25.hashCode()) {
                        case -1249320806:
                            if (str25.equals("rotationX")) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -1249320805:
                            if (str25.equals("rotationY")) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -1225497657:
                            if (str25.equals("translationX")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -1225497656:
                            if (str25.equals("translationY")) {
                                b2 = 3;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -1225497655:
                            if (str25.equals("translationZ")) {
                                b2 = 4;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -1001078227:
                            if (str25.equals("progress")) {
                                b2 = 5;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -908189618:
                            if (str25.equals("scaleX")) {
                                b2 = 6;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -908189617:
                            if (str25.equals("scaleY")) {
                                b2 = 7;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -797520672:
                            if (str25.equals("waveVariesBy")) {
                                b2 = 8;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -760884510:
                            if (str25.equals("transformPivotX")) {
                                b2 = 9;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -760884509:
                            if (str25.equals("transformPivotY")) {
                                b2 = 10;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -40300674:
                            if (str25.equals("rotation")) {
                                b2 = 11;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -4379043:
                            if (str25.equals("elevation")) {
                                b2 = 12;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 37232917:
                            if (str25.equals("transitionPathRotate")) {
                                b2 = cb.k;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 92909918:
                            if (str25.equals("alpha")) {
                                b2 = cb.f77931l;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 156108012:
                            if (str25.equals("waveOffset")) {
                                b2 = 15;
                            } else {
                                b2 = -1;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            c3867 = new C3867();
                            break;
                        case 1:
                            c3867 = new C6690();
                            break;
                        case 2:
                            c3867 = new C21507();
                            break;
                        case 3:
                            c3867 = new C17979();
                            break;
                        case 4:
                            c3867 = new C18685();
                            break;
                        case 5:
                            C1045 c1045 = new C1045();
                            c1045.f4847 = false;
                            c3867 = c1045;
                            break;
                        case 6:
                            c3867 = new C22919();
                            break;
                        case 7:
                            c3867 = new C15158();
                            break;
                        case 8:
                            c3867 = new C4573();
                            break;
                        case 9:
                            c3867 = new C5279();
                            break;
                        case 10:
                            c3867 = new C22213();
                            break;
                        case 11:
                            c3867 = new C13041();
                            break;
                        case 12:
                            c3867 = new C11630();
                            break;
                        case 13:
                            c3867 = new C2456();
                            break;
                        case 14:
                            c3867 = new C4573();
                            break;
                        case 15:
                            c3867 = new C4573();
                            break;
                        default:
                            c3867 = null;
                            break;
                    }
                } else {
                    hashSet8 = hashSet3;
                    SparseArray sparseArray = new SparseArray();
                    str14 = str24;
                    String str26 = str25.split(",")[1];
                    for (AbstractC9077 abstractC9078 : arrayList) {
                        HashSet hashSet20 = hashSet;
                        HashMap map7 = map;
                        HashMap map8 = abstractC9078.f30944;
                        if (map8 != null && (c9825 = (C9824) map8.get(str26)) != null) {
                            sparseArray.append(abstractC9078.f30946, c9825);
                        }
                        map = map7;
                        hashSet = hashSet20;
                    }
                    hashSet7 = hashSet;
                    map3 = map;
                    C13747 c13747 = new C13747();
                    String str27 = str25.split(",")[1];
                    c13747.f45315 = sparseArray;
                    c3867 = c13747;
                }
                if (c3867 != null) {
                    c3867.m21319(str25);
                    c8061.f28250.put(str25, c3867);
                }
                it4 = it5;
                str24 = str14;
                hashSet3 = hashSet8;
                map = map3;
                hashSet = hashSet7;
            }
            str = str24;
            hashSet4 = hashSet;
            HashMap map9 = map;
            hashSet5 = hashSet3;
            if (arrayList != null) {
                for (AbstractC9077 abstractC9079 : arrayList) {
                    if (abstractC9079 instanceof C7665) {
                        abstractC9079.mo11120(c8061.f28250);
                    }
                }
            }
            c18644.m43126(0, c8061.f28250);
            c18645.m43126(100, c8061.f28250);
            for (String str28 : c8061.f28250.keySet()) {
                HashMap map10 = map9;
                ((AbstractC8102) c8061.f28250.get(str28)).mo21318(map10.containsKey(str28) ? ((Integer) map10.get(str28)).intValue() : 0);
                map9 = map10;
            }
            map = map9;
        }
        if (!hashSet4.isEmpty()) {
            if (c8061.f28269 == null) {
                c8061.f28269 = new HashMap();
            }
            Iterator it6 = hashSet4.iterator();
            while (it6.hasNext()) {
                String str29 = (String) it6.next();
                if (!c8061.f28269.containsKey(str29)) {
                    String str30 = str;
                    if (!str29.startsWith(str30)) {
                        it = it6;
                        map2 = map;
                        str = str30;
                        switch (str29) {
                            case "rotationX":
                                c20097 = new C20097();
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            case "rotationY":
                                c20097 = new C0340();
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            case "translationX":
                                c20097 = new C17274();
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            case "translationY":
                                c20097 = new C5985();
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            case "translationZ":
                                c20097 = new C10925();
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            case "progress":
                                C20802 c20802 = new C20802();
                                c20802.f67629 = false;
                                c20097 = c20802;
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            case "scaleX":
                                c20097 = new C16569();
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            case "scaleY":
                                c20097 = new C12336();
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            case "rotation":
                                c20097 = new C15864();
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            case "elevation":
                                c20097 = new C10219();
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            case "transitionPathRotate":
                                c20097 = new C7396();
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            case "alpha":
                                c20097 = new C19391();
                                c20097.f76539 = j;
                                abstractC23625 = c20097;
                                break;
                            default:
                                abstractC23625 = null;
                                break;
                        }
                    } else {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it6;
                        String str31 = str29.split(",")[1];
                        for (AbstractC9077 abstractC90710 : arrayList) {
                            String str32 = str30;
                            HashMap map11 = map;
                            HashMap map12 = abstractC90710.f30944;
                            if (map12 != null && (c9824 = (C9824) map12.get(str31)) != null) {
                                sparseArray2.append(abstractC90710.f30946, c9824);
                            }
                            str30 = str32;
                            map = map11;
                        }
                        map2 = map;
                        str = str30;
                        C8808 c8808 = new C8808();
                        c8808.f30291 = new SparseArray();
                        c8808.f30293 = str29.split(",")[1];
                        c8808.f30292 = sparseArray2;
                        abstractC23625 = c8808;
                    }
                    if (abstractC23625 != null) {
                        abstractC23625.m52091(str29);
                        c8061.f28269.put(str29, abstractC23625);
                    }
                    it6 = it;
                    map = map2;
                }
            }
            HashMap map13 = map;
            if (arrayList != null) {
                for (AbstractC9077 abstractC90711 : arrayList) {
                    if (abstractC90711 instanceof C15117) {
                        ((C15117) abstractC90711).m36240(c8061.f28269);
                    }
                }
            }
            for (String str33 : c8061.f28269.keySet()) {
                HashMap map14 = map13;
                ((AbstractC23625) c8061.f28269.get(str33)).mo22926(map14.containsKey(str33) ? ((Integer) map14.get(str33)).intValue() : 0);
                map13 = map14;
            }
        }
        int size = arrayList8.size();
        int i8 = size + 2;
        C23584[] c23584Arr = new C23584[i8];
        c23584Arr[0] = c235811;
        c23584Arr[size + 1] = c23587;
        if (arrayList8.size() > 0 && c8061.f28253 == -1) {
            c8061.f28253 = 0;
        }
        Iterator it7 = arrayList8.iterator();
        int i9 = 1;
        while (it7.hasNext()) {
            c23584Arr[i9] = (C23584) it7.next();
            i9++;
        }
        HashSet hashSet21 = new HashSet();
        Iterator it8 = c23587.f76400.keySet().iterator();
        while (it8.hasNext()) {
            String str34 = (String) it8.next();
            Iterator it9 = it8;
            C23584 c235812 = c235811;
            if (c235812.f76400.containsKey(str34)) {
                c235811 = c235812;
                hashSet6 = hashSet5;
                if (!hashSet6.contains(str + str34)) {
                    hashSet21.add(str34);
                }
            } else {
                c235811 = c235812;
                hashSet6 = hashSet5;
            }
            it8 = it9;
            hashSet5 = hashSet6;
        }
        String[] strArr = (String[]) hashSet21.toArray(new String[0]);
        c8061.f28259 = strArr;
        c8061.f28262 = new int[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = c8061.f28259;
            if (i10 < strArr2.length) {
                String str35 = strArr2[i10];
                c8061.f28262[i10] = 0;
                for (int i11 = 0; i11 < i8; i11++) {
                    if (c23584Arr[i11].f76400.containsKey(str35)) {
                        int[] iArr = c8061.f28262;
                        iArr[i10] = ((C9824) c23584Arr[i11].f76400.get(str35)).m24931() + iArr[i10];
                        break;
                    }
                }
                i10++;
            } else {
                boolean z = c23584Arr[0].f76402 != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i12 = 1;
                while (i12 < i8) {
                    c23584Arr[i12].m52013(c23584Arr[i12 - 1], zArr, z);
                    i12++;
                    str23 = str23;
                    str22 = str22;
                }
                String str36 = str22;
                String str37 = str23;
                int i13 = 0;
                for (int i14 = 1; i14 < length; i14++) {
                    if (zArr[i14]) {
                        i13++;
                    }
                }
                c8061.f28273 = new int[i13];
                c8061.f28254 = new double[i13];
                c8061.f28263 = new double[i13];
                int i15 = 0;
                for (int i16 = 1; i16 < length; i16++) {
                    if (zArr[i16]) {
                        c8061.f28273[i15] = i16;
                        i15++;
                    }
                }
                int[] iArr2 = {i8, c8061.f28273.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i8];
                int i17 = 0;
                while (i17 < i8) {
                    C23584 c235813 = c23584Arr[i17];
                    double[] dArr3 = dArr[i17];
                    String str38 = str21;
                    int[] iArr3 = c8061.f28273;
                    String str39 = str20;
                    String str40 = str19;
                    String str41 = str18;
                    String str42 = str17;
                    String str43 = str16;
                    String str44 = str15;
                    float[] fArr = {c235813.f76399, c235813.f76393, c235813.f76394, c235813.f76396, c235813.f76403, c235813.f76395};
                    int i18 = 0;
                    for (int i19 : iArr3) {
                        if (i19 < 6) {
                            dArr3[i18] = fArr[i19];
                            i18++;
                        }
                    }
                    dArr2[i17] = c23584Arr[i17].f76392;
                    i17++;
                    str21 = str38;
                    str20 = str39;
                    str19 = str40;
                    str18 = str41;
                    str17 = str42;
                    str16 = str43;
                    str15 = str44;
                }
                String str45 = str15;
                String str46 = str16;
                String str47 = str17;
                String str48 = str18;
                String str49 = str19;
                String str50 = str20;
                String str51 = str21;
                int i20 = 0;
                while (true) {
                    int[] iArr4 = c8061.f28273;
                    if (i20 < iArr4.length) {
                        if (iArr4[i20] < 6) {
                            String strM50267 = C22697.m50267(new StringBuilder(), C23584.f76390[c8061.f28273[i20]], " [");
                            for (int i21 = 0; i21 < i8; i21++) {
                                StringBuilder sbM23356 = C9023.m23356(strM50267);
                                sbM23356.append(dArr[i21][i20]);
                                strM50267 = sbM23356.toString();
                            }
                        }
                        i20++;
                    } else {
                        c8061.f28257 = new AbstractC4136[c8061.f28259.length + 1];
                        int i22 = 0;
                        while (true) {
                            String[] strArr3 = c8061.f28259;
                            if (i22 >= strArr3.length) {
                                c8061.f28257[0] = AbstractC4136.m11763(c8061.f28253, dArr2, dArr);
                                if (c23584Arr[0].f76402 != -1) {
                                    int[] iArr5 = new int[i8];
                                    double[] dArr4 = new double[i8];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i8, 2);
                                    for (int i23 = 0; i23 < i8; i23++) {
                                        C23584 c235814 = c23584Arr[i23];
                                        iArr5[i23] = c235814.f76402;
                                        dArr4[i23] = c235814.f76392;
                                        double[] dArr6 = dArr5[i23];
                                        dArr6[0] = c235814.f76393;
                                        dArr6[1] = c235814.f76394;
                                    }
                                    c8061.f28252 = AbstractC4136.m11764(iArr5, dArr4, dArr5);
                                }
                                c8061.f28272 = new HashMap();
                                if (arrayList != null) {
                                    Iterator it10 = hashSet19.iterator();
                                    float f61 = Float.NaN;
                                    while (it10.hasNext()) {
                                        String str52 = (String) it10.next();
                                        if (!str52.startsWith("CUSTOM")) {
                                            switch (str52.hashCode()) {
                                                case -1249320806:
                                                    str2 = str37;
                                                    str3 = str36;
                                                    str4 = str51;
                                                    str5 = str50;
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    b = str52.equals(str2) ? (byte) 0 : (byte) -1;
                                                    break;
                                                case -1249320805:
                                                    str3 = str36;
                                                    str4 = str51;
                                                    str5 = str50;
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str3)) {
                                                        str2 = str37;
                                                        b = 1;
                                                    } else {
                                                        str2 = str37;
                                                    }
                                                    break;
                                                case -1225497657:
                                                    str4 = str51;
                                                    str5 = str50;
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str4)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        b = 2;
                                                    } else {
                                                        str3 = str36;
                                                        str2 = str37;
                                                    }
                                                    break;
                                                case -1225497656:
                                                    str5 = str50;
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str5)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        b = 3;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                    }
                                                    break;
                                                case -1225497655:
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str6)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        b = 4;
                                                    } else {
                                                        str5 = str50;
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                    }
                                                    break;
                                                case -1001078227:
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str7)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        b = 5;
                                                    } else {
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                    }
                                                    break;
                                                case -908189618:
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str8)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        b = 6;
                                                    } else {
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                    }
                                                    break;
                                                case -908189617:
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str9)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        b = 7;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                    }
                                                    break;
                                                case -797520672:
                                                    str45 = str45;
                                                    if (str52.equals("waveVariesBy")) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        b = 8;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                    }
                                                    break;
                                                case -40300674:
                                                    str45 = str45;
                                                    if (str52.equals(str45)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        b = 9;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                    }
                                                    break;
                                                case -4379043:
                                                    if (str52.equals("elevation")) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                        b = 10;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                    }
                                                    break;
                                                case 37232917:
                                                    if (str52.equals("transitionPathRotate")) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                        b = 11;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                    }
                                                    break;
                                                case 92909918:
                                                    if (str52.equals("alpha")) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                        b = 12;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                    }
                                                    break;
                                                case 156108012:
                                                    if (str52.equals("waveOffset")) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                        b = cb.k;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                    }
                                                    break;
                                                default:
                                                    str2 = str37;
                                                    str3 = str36;
                                                    str4 = str51;
                                                    str5 = str50;
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    break;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c2019 = new C2019();
                                                    break;
                                                case 1:
                                                    c2019 = new C9782();
                                                    break;
                                                case 2:
                                                    c2019 = new C13706();
                                                    break;
                                                case 3:
                                                    c2019 = new C11589();
                                                    break;
                                                case 4:
                                                    c2019 = new C2415();
                                                    break;
                                                case 5:
                                                    C23893 c23893 = new C23893();
                                                    c23893.f77404 = false;
                                                    c2019 = c23893;
                                                    break;
                                                case 6:
                                                    c2019 = new C3430();
                                                    break;
                                                case 7:
                                                    c2019 = new C4532();
                                                    break;
                                                case 8:
                                                    c2019 = new C16837();
                                                    break;
                                                case 9:
                                                    c2019 = new C14721();
                                                    break;
                                                case 10:
                                                    c2019 = new C6253();
                                                    break;
                                                case 11:
                                                    c2019 = new C11193();
                                                    break;
                                                case 12:
                                                    c2019 = new C16837();
                                                    break;
                                                case 13:
                                                    c2019 = new C16837();
                                                    break;
                                                default:
                                                    c2019 = null;
                                                    break;
                                            }
                                        } else {
                                            C12604 c12604 = new C12604();
                                            c12604.f42109 = new float[1];
                                            str2 = str37;
                                            str3 = str36;
                                            c2019 = c12604;
                                            str4 = str51;
                                            str5 = str50;
                                            str6 = str49;
                                            str7 = str48;
                                            str8 = str47;
                                            str9 = str46;
                                            str45 = str45;
                                        }
                                        if (c2019 == null) {
                                            it10 = it10;
                                            str45 = str45;
                                            str46 = str9;
                                            str47 = str8;
                                            str10 = str7;
                                            str11 = str6;
                                            str12 = str5;
                                        } else {
                                            if (c2019.f72525 == 1 && Float.isNaN(f61)) {
                                                float[] fArr2 = new float[2];
                                                float f62 = 1.0f / 99;
                                                double d = 0.0d;
                                                float fHypot = 0.0f;
                                                double d2 = 0.0d;
                                                int i24 = 0;
                                                while (i24 < 100) {
                                                    float f63 = i24 * f62;
                                                    String str53 = str9;
                                                    String str54 = str8;
                                                    double d3 = f63;
                                                    c235811 = c235811;
                                                    C23188 c23188 = c235811.f76401;
                                                    float f64 = Float.NaN;
                                                    float f65 = 0.0f;
                                                    for (C23584 c235815 : arrayList8) {
                                                        String str55 = str7;
                                                        String str56 = str6;
                                                        C23188 c23189 = c235815.f76401;
                                                        if (c23189 != null) {
                                                            float f66 = c235815.f76392;
                                                            if (f66 < f63) {
                                                                c23188 = c23189;
                                                                f65 = f66;
                                                            } else if (Float.isNaN(f64)) {
                                                                f64 = c235815.f76392;
                                                            }
                                                        }
                                                        str7 = str55;
                                                        str6 = str56;
                                                    }
                                                    String str57 = str7;
                                                    String str58 = str6;
                                                    if (c23188 != null) {
                                                        if (Float.isNaN(f64)) {
                                                            f64 = 1.0f;
                                                        }
                                                        float f67 = f64 - f65;
                                                        dMo18708 = (((float) c23188.mo18708((f63 - f65) / f67)) * f67) + f65;
                                                    } else {
                                                        dMo18708 = d3;
                                                    }
                                                    c8061.f28257[0].mo4689(dMo18708, c8061.f28254);
                                                    c235811.m52014(c8061.f28273, c8061.f28254, fArr2, 0);
                                                    if (i24 > 0) {
                                                        fHypot = (float) (Math.hypot(d - ((double) fArr2[1]), d2 - ((double) fArr2[0])) + ((double) fHypot));
                                                    }
                                                    i24++;
                                                    d2 = fArr2[0];
                                                    d = fArr2[1];
                                                    str5 = str5;
                                                    str8 = str54;
                                                    str9 = str53;
                                                    str6 = str58;
                                                    str7 = str57;
                                                }
                                                str46 = str9;
                                                str47 = str8;
                                                str10 = str7;
                                                str11 = str6;
                                                str12 = str5;
                                                f61 = fHypot;
                                            } else {
                                                str46 = str9;
                                                str47 = str8;
                                                str10 = str7;
                                                str11 = str6;
                                                str12 = str5;
                                            }
                                            c2019.m49193(str52);
                                            c8061.f28272.put(str52, c2019);
                                        }
                                        it10 = it10;
                                        str48 = str10;
                                        str51 = str4;
                                        str36 = str3;
                                        str37 = str2;
                                        str50 = str12;
                                        str49 = str11;
                                    }
                                    for (AbstractC9077 abstractC90712 : arrayList) {
                                        if (abstractC90712 instanceof C20365) {
                                            ((C20365) abstractC90712).m45980(c8061.f28272);
                                        }
                                    }
                                    Iterator it11 = c8061.f28272.values().iterator();
                                    while (it11.hasNext()) {
                                        ((AbstractC22172) it11.next()).m49190();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str59 = strArr3[i22];
                            int i25 = 0;
                            int i26 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i26 < i8) {
                                if (c23584Arr[i26].f76400.containsKey(str59)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i8];
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i8, ((C9824) c23584Arr[i26].f76400.get(str59)).m24931());
                                    }
                                    C23584 c235816 = c23584Arr[i26];
                                    dArr7[i25] = c235816.f76392;
                                    double[] dArr9 = dArr8[i25];
                                    C9824 c9826 = (C9824) c235816.f76400.get(str59);
                                    if (c9826.m24931() == 1) {
                                        dArr9[0] = c9826.m24932();
                                    } else {
                                        int iM24931 = c9826.m24931();
                                        float[] fArr3 = new float[iM24931];
                                        c9826.m24930(fArr3);
                                        int i27 = 0;
                                        int i28 = 0;
                                        while (i27 < iM24931) {
                                            dArr9[i28] = fArr3[i27];
                                            i27++;
                                            str59 = str59;
                                            dArr7 = dArr7;
                                            i28++;
                                            dArr8 = dArr8;
                                        }
                                    }
                                    str13 = str59;
                                    i25++;
                                    dArr7 = dArr7;
                                    dArr8 = dArr8;
                                } else {
                                    str13 = str59;
                                }
                                i26++;
                                str59 = str13;
                            }
                            i22++;
                            c8061.f28257[i22] = AbstractC4136.m11763(c8061.f28253, Arrays.copyOf(dArr7, i25), (double[][]) Arrays.copyOf(dArr8, i25));
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        C23584 c23584 = this.f28270;
        sb.append(c23584.f76393);
        sb.append(" y: ");
        sb.append(c23584.f76394);
        sb.append(" end: x: ");
        C23584 c23585 = this.f28249;
        sb.append(c23585.f76393);
        sb.append(" y: ");
        sb.append(c23585.f76394);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21217(C23584 c23584) {
        float x = (int) this.f28260.getX();
        float y = (int) this.f28260.getY();
        float width = this.f28260.getWidth();
        float height = this.f28260.getHeight();
        c23584.f76393 = x;
        c23584.f76394 = y;
        c23584.f76396 = width;
        c23584.f76403 = height;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21227(View view) {
        C23584 c23584 = this.f28270;
        c23584.f76392 = 0.0f;
        c23584.f76399 = 0.0f;
        float x = view.getX();
        float y = view.getY();
        float width = view.getWidth();
        float height = view.getHeight();
        c23584.f76393 = x;
        c23584.f76394 = y;
        c23584.f76396 = width;
        c23584.f76403 = height;
        this.f28264.m43127(view);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21235(C20719 c20719, C18144 c18144) {
        C23584 c23584 = this.f28270;
        c23584.f76392 = 0.0f;
        c23584.f76399 = 0.0f;
        m21217(c23584);
        float fM46630 = c20719.m46630();
        float fM46639 = c20719.m46639();
        float fM46640 = c20719.m46640();
        float fM46619 = c20719.m46619();
        c23584.f76393 = fM46630;
        c23584.f76394 = fM46639;
        c23584.f76396 = fM46640;
        c23584.f76403 = fM46619;
        C4032 c4032M42252 = c18144.m42252(this.f28251);
        c23584.m52012(c4032M42252);
        this.f28256 = c4032M42252.f14902.f75004;
        this.f28264.m43129(c20719, c18144, this.f28251);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21230(C20719 c20719, C18144 c18144) {
        C23584 c23584 = this.f28249;
        c23584.f76392 = 1.0f;
        c23584.f76399 = 1.0f;
        m21217(c23584);
        float fM46630 = c20719.m46630();
        float fM46639 = c20719.m46639();
        float fM46640 = c20719.m46640();
        float fM46619 = c20719.m46619();
        c23584.f76393 = fM46630;
        c23584.f76394 = fM46639;
        c23584.f76396 = fM46640;
        c23584.f76403 = fM46619;
        c23584.m52012(c18144.m42252(this.f28251));
        this.f28261.m43129(c20719, c18144, this.f28251);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private float m21218(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f28255;
            if (f3 != 1.0d) {
                float f4 = this.f28258;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = (f - f4) * f3;
                }
            }
        }
        C23188 c23188 = this.f28270.f76401;
        float f5 = Float.NaN;
        for (C23584 c23584 : this.f28267) {
            C23188 c23189 = c23584.f76401;
            if (c23189 != null) {
                float f6 = c23584.f76392;
                if (f6 < f) {
                    c23188 = c23189;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = c23584.f76392;
                }
            }
        }
        if (c23188 != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) c23188.mo18708(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) c23188.mo18709(d);
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21231(float f, long j, View view, C21070 c21070) {
        boolean zMo2000;
        C7396 c7396;
        float f2;
        float fM21218 = m21218(f, (float[]) null);
        HashMap map = this.f28250;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((AbstractC8102) it.next()).mo3906(fM21218, view);
            }
        }
        HashMap map2 = this.f28269;
        if (map2 != null) {
            c7396 = null;
            zMo2000 = false;
            for (AbstractC23625 abstractC23625 : map2.values()) {
                if (abstractC23625 instanceof C7396) {
                    c7396 = (C7396) abstractC23625;
                } else {
                    zMo2000 |= abstractC23625.mo2000(fM21218, j, view, c21070);
                }
            }
        } else {
            zMo2000 = false;
            c7396 = null;
        }
        AbstractC4136[] abstractC4136Arr = this.f28257;
        C23584 c23584 = this.f28270;
        if (abstractC4136Arr != null) {
            double d = fM21218;
            abstractC4136Arr[0].mo4689(d, this.f28254);
            this.f28257[0].mo4693(d, this.f28263);
            AbstractC4136 abstractC4136 = this.f28252;
            if (abstractC4136 != null) {
                double[] dArr = this.f28254;
                if (dArr.length > 0) {
                    abstractC4136.mo4689(d, dArr);
                    this.f28252.mo4693(d, this.f28263);
                }
            }
            int[] iArr = this.f28273;
            double[] dArr2 = this.f28254;
            double[] dArr3 = this.f28263;
            float f3 = c23584.f76393;
            float f4 = c23584.f76394;
            float f5 = c23584.f76396;
            float f6 = c23584.f76403;
            if (iArr.length != 0) {
                f2 = f3;
                if (c23584.f76404.length <= iArr[iArr.length - 1]) {
                    int i = iArr[iArr.length - 1] + 1;
                    c23584.f76404 = new double[i];
                    c23584.f76397 = new double[i];
                }
            } else {
                f2 = f3;
            }
            Arrays.fill(c23584.f76404, Double.NaN);
            for (int i2 = 0; i2 < iArr.length; i2++) {
                double[] dArr4 = c23584.f76404;
                int i3 = iArr[i2];
                dArr4[i3] = dArr2[i2];
                c23584.f76397[i3] = dArr3[i2];
            }
            int i4 = 0;
            float f7 = Float.NaN;
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = f4;
            float f12 = f5;
            float f13 = f6;
            float f14 = 0.0f;
            while (true) {
                double[] dArr5 = c23584.f76404;
                if (i4 >= dArr5.length) {
                    break;
                }
                if (!Double.isNaN(dArr5[i4])) {
                    float f15 = (float) (Double.isNaN(c23584.f76404[i4]) ? 0.0d : c23584.f76404[i4] + 0.0d);
                    float f16 = (float) c23584.f76397[i4];
                    if (i4 == 1) {
                        f8 = f16;
                        f2 = f15;
                    } else if (i4 == 2) {
                        f10 = f16;
                        f11 = f15;
                    } else if (i4 == 3) {
                        f9 = f16;
                        f12 = f15;
                    } else if (i4 == 4) {
                        f14 = f16;
                        f13 = f15;
                    } else if (i4 == 5) {
                        f7 = f15;
                    }
                }
                i4++;
            }
            if (Float.isNaN(f7)) {
                if (!Float.isNaN(Float.NaN)) {
                    view.setRotation(Float.NaN);
                }
            } else {
                view.setRotation((float) (Math.toDegrees(Math.atan2((f14 / 2.0f) + f10, (f9 / 2.0f) + f8)) + ((double) f7) + ((double) (Float.isNaN(Float.NaN) ? 0.0f : Float.NaN))));
            }
            float f17 = f2 + 0.5f;
            int i5 = (int) f17;
            float f18 = f11 + 0.5f;
            int i6 = (int) f18;
            int i7 = (int) (f17 + f12);
            int i8 = (int) (f18 + f13);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight()) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            }
            view.layout(i5, i6, i7, i8);
            HashMap map3 = this.f28250;
            if (map3 != null) {
                for (AbstractC8102 abstractC8102 : map3.values()) {
                    if (abstractC8102 instanceof C2456) {
                        double[] dArr6 = this.f28263;
                        view.setRotation(((C2456) abstractC8102).m21316(fM21218) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                    }
                }
            }
            if (c7396 != null) {
                double[] dArr7 = this.f28263;
                view.setRotation(c7396.m52090(fM21218, j, view, c21070) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                zMo2000 = c7396.f76537 | zMo2000;
            }
            int i11 = 1;
            while (true) {
                AbstractC4136[] abstractC4136Arr2 = this.f28257;
                if (i11 >= abstractC4136Arr2.length) {
                    break;
                }
                AbstractC4136 abstractC4137 = abstractC4136Arr2[i11];
                float[] fArr = this.f28248;
                abstractC4137.mo4690(d, fArr);
                ((C9824) c23584.f76400.get(this.f28259[i11 - 1])).m24928(view, fArr);
                i11++;
            }
            C18644 c18644 = this.f28264;
            if (c18644.f60447 == 0) {
                if (fM21218 <= 0.0f) {
                    view.setVisibility(c18644.f60442);
                } else {
                    C18644 c18645 = this.f28261;
                    if (fM21218 >= 1.0f) {
                        view.setVisibility(c18645.f60442);
                    } else if (c18645.f60442 != c18644.f60442) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.f28266 != null) {
                int i12 = 0;
                while (true) {
                    C17938[] c17938Arr = this.f28266;
                    if (i12 >= c17938Arr.length) {
                        break;
                    }
                    c17938Arr[i12].m41759(fM21218, view);
                    i12++;
                }
            }
        } else {
            float f19 = c23584.f76393;
            C23584 c23585 = this.f28249;
            float fM1792 = C0280.m1792(c23585.f76393, f19, fM21218, f19);
            float f20 = c23584.f76394;
            float fM1793 = C0280.m1792(c23585.f76394, f20, fM21218, f20);
            float f21 = c23584.f76396;
            float f22 = c23585.f76396;
            float fM1794 = C0280.m1792(f22, f21, fM21218, f21);
            float f23 = c23584.f76403;
            float f24 = c23585.f76403;
            float f25 = fM1792 + 0.5f;
            int i13 = (int) f25;
            float f26 = fM1793 + 0.5f;
            int i14 = (int) f26;
            int i15 = (int) (f25 + fM1794);
            int iM1792 = (int) (f26 + C0280.m1792(f24, f23, fM21218, f23));
            int i16 = i15 - i13;
            int i17 = iM1792 - i14;
            if (f22 != f21 || f24 != f23) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
            }
            view.layout(i13, i14, i15, iM1792);
        }
        HashMap map4 = this.f28272;
        if (map4 != null) {
            for (AbstractC22172 abstractC22172 : map4.values()) {
                if (abstractC22172 instanceof C11193) {
                    double[] dArr8 = this.f28263;
                    view.setRotation(((C11193) abstractC22172).m49189(fM21218) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    abstractC22172.mo6502(fM21218, view);
                }
            }
        }
        return zMo2000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21221(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f28265;
        float fM21218 = m21218(f, fArr2);
        AbstractC4136[] abstractC4136Arr = this.f28257;
        C23584 c23584 = this.f28270;
        int i = 0;
        if (abstractC4136Arr != null) {
            double d = fM21218;
            abstractC4136Arr[0].mo4693(d, this.f28263);
            this.f28257[0].mo4689(d, this.f28254);
            float f4 = fArr2[0];
            while (true) {
                dArr = this.f28263;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            AbstractC4136 abstractC4136 = this.f28252;
            if (abstractC4136 != null) {
                double[] dArr2 = this.f28254;
                if (dArr2.length > 0) {
                    abstractC4136.mo4689(d, dArr2);
                    this.f28252.mo4693(d, this.f28263);
                    int[] iArr = this.f28273;
                    double[] dArr3 = this.f28263;
                    double[] dArr4 = this.f28254;
                    c23584.getClass();
                    C23584.m52010(f2, f3, fArr, iArr, dArr3, dArr4);
                    return;
                }
                return;
            }
            int[] iArr2 = this.f28273;
            double[] dArr5 = this.f28254;
            c23584.getClass();
            C23584.m52010(f2, f3, fArr, iArr2, dArr, dArr5);
            return;
        }
        C23584 c23585 = this.f28249;
        float f5 = c23585.f76393 - c23584.f76393;
        float f6 = c23585.f76394 - c23584.f76394;
        float f7 = c23585.f76396 - c23584.f76396;
        float f8 = (c23585.f76403 - c23584.f76403) + f6;
        fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
        fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21222(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float[] fArr2 = this.f28265;
        float fM21218 = m21218(f, fArr2);
        HashMap map = this.f28250;
        AbstractC8102 abstractC8102 = map == null ? null : (AbstractC8102) map.get("translationX");
        HashMap map2 = this.f28250;
        AbstractC8102 abstractC8103 = map2 == null ? null : (AbstractC8102) map2.get("translationY");
        HashMap map3 = this.f28250;
        AbstractC8102 abstractC8104 = map3 == null ? null : (AbstractC8102) map3.get("rotation");
        HashMap map4 = this.f28250;
        AbstractC8102 abstractC8105 = map4 == null ? null : (AbstractC8102) map4.get("scaleX");
        HashMap map5 = this.f28250;
        AbstractC8102 abstractC8106 = map5 == null ? null : (AbstractC8102) map5.get("scaleY");
        HashMap map6 = this.f28272;
        AbstractC22172 abstractC22172 = map6 == null ? null : (AbstractC22172) map6.get("translationX");
        HashMap map7 = this.f28272;
        AbstractC22172 abstractC22173 = map7 == null ? null : (AbstractC22172) map7.get("translationY");
        HashMap map8 = this.f28272;
        AbstractC22172 abstractC22174 = map8 == null ? null : (AbstractC22172) map8.get("rotation");
        HashMap map9 = this.f28272;
        AbstractC22172 abstractC22175 = map9 == null ? null : (AbstractC22172) map9.get("scaleX");
        HashMap map10 = this.f28272;
        AbstractC22172 abstractC22176 = map10 != null ? (AbstractC22172) map10.get("scaleY") : null;
        C8371 c8371 = new C8371();
        c8371.m21903();
        c8371.m21905(abstractC8104, fM21218);
        c8371.m21909(abstractC8102, abstractC8103, fM21218);
        c8371.m21906(abstractC8105, abstractC8106, fM21218);
        c8371.m21907(abstractC22174, fM21218);
        c8371.m21910(abstractC22172, abstractC22173, fM21218);
        c8371.m21908(abstractC22175, abstractC22176, fM21218);
        AbstractC4136 abstractC4136 = this.f28252;
        C23584 c23584 = this.f28270;
        if (abstractC4136 != null) {
            double[] dArr = this.f28254;
            if (dArr.length > 0) {
                double d = fM21218;
                abstractC4136.mo4689(d, dArr);
                this.f28252.mo4693(d, this.f28263);
                int[] iArr = this.f28273;
                double[] dArr2 = this.f28263;
                double[] dArr3 = this.f28254;
                c23584.getClass();
                C23584.m52010(f2, f3, fArr, iArr, dArr2, dArr3);
            }
            c8371.m21904(f2, f3, i, i2, fArr);
            return;
        }
        if (this.f28257 != null) {
            double dM21218 = m21218(fM21218, fArr2);
            this.f28257[0].mo4693(dM21218, this.f28263);
            this.f28257[0].mo4689(dM21218, this.f28254);
            float f4 = fArr2[0];
            int i3 = 0;
            while (true) {
                double[] dArr4 = this.f28263;
                if (i3 < dArr4.length) {
                    dArr4[i3] = dArr4[i3] * ((double) f4);
                    i3++;
                } else {
                    int[] iArr2 = this.f28273;
                    double[] dArr5 = this.f28254;
                    c23584.getClass();
                    C23584.m52010(f2, f3, fArr, iArr2, dArr4, dArr5);
                    c8371.m21904(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            C23584 c23585 = this.f28249;
            float f5 = c23585.f76393 - c23584.f76393;
            AbstractC22172 abstractC22177 = abstractC22176;
            float f6 = c23585.f76394 - c23584.f76394;
            float f7 = c23585.f76396 - c23584.f76396;
            float f8 = (c23585.f76403 - c23584.f76403) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
            c8371.m21903();
            c8371.m21905(abstractC8104, fM21218);
            c8371.m21909(abstractC8102, abstractC8103, fM21218);
            c8371.m21906(abstractC8105, abstractC8106, fM21218);
            c8371.m21907(abstractC22174, fM21218);
            c8371.m21910(abstractC22172, abstractC22173, fM21218);
            c8371.m21908(abstractC22175, abstractC22177, fM21218);
            c8371.m21904(f2, f3, i, i2, fArr);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21219() {
        int iMax = this.f28270.f76391;
        Iterator it = this.f28267.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C23584) it.next()).f76391);
        }
        return Math.max(iMax, this.f28249.f76391);
    }
}
