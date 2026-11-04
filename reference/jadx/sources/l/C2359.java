package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R65Z */
/* JADX INFO: loaded from: classes3.dex */
public class C2359 extends AbstractC3301 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f7610;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f7611;

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7995() {
    }

    public C2359(String str) {
        this(str, 0);
        if (getClass() != C2359.class) {
            throw new IllegalStateException();
        }
    }

    public C2359(String str, int i) {
        this.f7610 = str;
    }

    public C2359(ArrayList arrayList) {
        this.f7611 = arrayList;
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7996(Object obj, String str) {
        ArrayList arrayList = this.f7611;
        String str2 = this.f7610;
        if (arrayList == null) {
            this.f7611 = new ArrayList(str2 != null ? 2 : 1);
        }
        if (str2 != null) {
            this.f7611.add(str);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            ArrayList arrayList2 = this.f7611;
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            int length = bArr.length;
            while (i < length) {
                arrayList3.add(Byte.valueOf(bArr[i]));
                i++;
            }
            arrayList2.add(arrayList3);
            return;
        }
        if (obj instanceof boolean[]) {
            ArrayList arrayList4 = this.f7611;
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList5 = new ArrayList(zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                arrayList5.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            arrayList4.add(arrayList5);
            return;
        }
        if (obj instanceof short[]) {
            ArrayList arrayList6 = this.f7611;
            short[] sArr = (short[]) obj;
            ArrayList arrayList7 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                arrayList7.add(Short.valueOf(sArr[i]));
                i++;
            }
            arrayList6.add(arrayList7);
            return;
        }
        if (obj instanceof char[]) {
            ArrayList arrayList8 = this.f7611;
            char[] cArr = (char[]) obj;
            ArrayList arrayList9 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                arrayList9.add(Character.valueOf(cArr[i]));
                i++;
            }
            arrayList8.add(arrayList9);
            return;
        }
        if (obj instanceof int[]) {
            this.f7611.add(C21179.m48327((int[]) obj));
            return;
        }
        if (obj instanceof long[]) {
            ArrayList arrayList10 = this.f7611;
            long[] jArr = (long[]) obj;
            ArrayList arrayList11 = new ArrayList(jArr.length);
            int length5 = jArr.length;
            while (i < length5) {
                arrayList11.add(Long.valueOf(jArr[i]));
                i++;
            }
            arrayList10.add(arrayList11);
            return;
        }
        if (obj instanceof float[]) {
            ArrayList arrayList12 = this.f7611;
            float[] fArr = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr.length);
            int length6 = fArr.length;
            while (i < length6) {
                arrayList13.add(Float.valueOf(fArr[i]));
                i++;
            }
            arrayList12.add(arrayList13);
            return;
        }
        if (obj instanceof double[]) {
            ArrayList arrayList14 = this.f7611;
            double[] dArr = (double[]) obj;
            ArrayList arrayList15 = new ArrayList(dArr.length);
            int length7 = dArr.length;
            while (i < length7) {
                arrayList15.add(Double.valueOf(dArr[i]));
                i++;
            }
            arrayList14.add(arrayList15);
            return;
        }
        this.f7611.add(obj);
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7997(String str, String str2, String str3) {
        ArrayList arrayList = this.f7611;
        String str4 = this.f7610;
        if (arrayList == null) {
            this.f7611 = new ArrayList(str4 != null ? 2 : 1);
        }
        if (str4 != null) {
            this.f7611.add(str);
        }
        this.f7611.add(new String[]{str2, str3});
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo7994(String str, String str2) {
        ArrayList arrayList = this.f7611;
        String str3 = this.f7610;
        if (arrayList == null) {
            this.f7611 = new ArrayList(str3 != null ? 2 : 1);
        }
        if (str3 != null) {
            this.f7611.add(str);
        }
        C2359 c2359 = new C2359(str2);
        this.f7611.add(c2359);
        return c2359;
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo7993(String str) {
        ArrayList arrayList = this.f7611;
        String str2 = this.f7610;
        if (arrayList == null) {
            this.f7611 = new ArrayList(str2 != null ? 2 : 1);
        }
        if (str2 != null) {
            this.f7611.add(str);
        }
        ArrayList arrayList2 = new ArrayList();
        this.f7611.add(arrayList2);
        return new C2359(arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7998(AbstractC3301 abstractC3301) {
        if (abstractC3301 != null) {
            ArrayList arrayList = this.f7611;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i += 2) {
                    m7992(abstractC3301, (String) this.f7611.get(i), this.f7611.get(i + 1));
                }
            }
            abstractC3301.mo7995();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7992(AbstractC3301 abstractC3301, String str, Object obj) {
        if (abstractC3301 != null) {
            if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                abstractC3301.mo7997(str, strArr[0], strArr[1]);
                return;
            }
            if (obj instanceof C2359) {
                C2359 c2359 = (C2359) obj;
                c2359.m7998(abstractC3301.mo7994(str, c2359.f7610));
                return;
            }
            if (obj instanceof List) {
                AbstractC3301 abstractC3301Mo7993 = abstractC3301.mo7993(str);
                if (abstractC3301Mo7993 != null) {
                    List list = (List) obj;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        m7992(abstractC3301Mo7993, (String) null, list.get(i));
                    }
                    abstractC3301Mo7993.mo7995();
                    return;
                }
                return;
            }
            abstractC3301.mo7996(obj, str);
        }
    }
}
