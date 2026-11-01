package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R65Z */
/* JADX INFO: loaded from: classes4.dex */
public class C15353 extends AbstractC9812 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f50027;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f50028;

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ */
    public final void mo10177() {
    }

    public C15353(String str) {
        this(str, 0);
        if (getClass() != C15353.class) {
            throw new IllegalStateException();
        }
    }

    public C15353(String str, int i) {
        this.f50028 = str;
    }

    public C15353(ArrayList arrayList) {
        this.f50027 = arrayList;
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ */
    public final void mo10179(Object obj, String str) {
        ArrayList arrayList = this.f50027;
        String str2 = this.f50028;
        if (arrayList == null) {
            this.f50027 = new ArrayList(str2 != null ? 2 : 1);
        }
        if (str2 != null) {
            this.f50027.add(str);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            ArrayList arrayList2 = this.f50027;
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
            ArrayList arrayList4 = this.f50027;
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
            ArrayList arrayList6 = this.f50027;
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
            ArrayList arrayList8 = this.f50027;
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
            this.f50027.add(C2526.m7897((int[]) obj));
            return;
        }
        if (obj instanceof long[]) {
            ArrayList arrayList10 = this.f50027;
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
            ArrayList arrayList12 = this.f50027;
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
            ArrayList arrayList14 = this.f50027;
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
        this.f50027.add(obj);
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ */
    public final void mo10180(String str, String str2, String str3) {
        ArrayList arrayList = this.f50027;
        String str4 = this.f50028;
        if (arrayList == null) {
            this.f50027 = new ArrayList(str4 != null ? 2 : 1);
        }
        if (str4 != null) {
            this.f50027.add(str);
        }
        this.f50027.add(new String[]{str2, str3});
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo10176(String str, String str2) {
        ArrayList arrayList = this.f50027;
        String str3 = this.f50028;
        if (arrayList == null) {
            this.f50027 = new ArrayList(str3 != null ? 2 : 1);
        }
        if (str3 != null) {
            this.f50027.add(str);
        }
        C15353 c15353 = new C15353(str2);
        this.f50027.add(c15353);
        return c15353;
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo10175(String str) {
        ArrayList arrayList = this.f50027;
        String str2 = this.f50028;
        if (arrayList == null) {
            this.f50027 = new ArrayList(str2 != null ? 2 : 1);
        }
        if (str2 != null) {
            this.f50027.add(str);
        }
        ArrayList arrayList2 = new ArrayList();
        this.f50027.add(arrayList2);
        return new C15353(arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36800(AbstractC9812 abstractC9812) {
        if (abstractC9812 != null) {
            ArrayList arrayList = this.f50027;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i += 2) {
                    m36799(abstractC9812, (String) this.f50027.get(i), this.f50027.get(i + 1));
                }
            }
            abstractC9812.mo10177();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36799(AbstractC9812 abstractC9812, String str, Object obj) {
        if (abstractC9812 != null) {
            if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                abstractC9812.mo10180(str, strArr[0], strArr[1]);
                return;
            }
            if (obj instanceof C15353) {
                C15353 c15353 = (C15353) obj;
                c15353.m36800(abstractC9812.mo10176(str, c15353.f50028));
                return;
            }
            if (obj instanceof List) {
                AbstractC9812 abstractC9812Mo10175 = abstractC9812.mo10175(str);
                if (abstractC9812Mo10175 != null) {
                    List list = (List) obj;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        m36799(abstractC9812Mo10175, (String) null, list.get(i));
                    }
                    abstractC9812Mo10175.mo10177();
                    return;
                }
                return;
            }
            abstractC9812.mo10179(obj, str);
        }
    }
}
