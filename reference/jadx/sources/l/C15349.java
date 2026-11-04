package l;

/* JADX INFO: renamed from: l.ܳ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15349 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f50104 = {"B", "S", "C", "I"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36789(C13791 c13791) {
        for (C19825 c19825 : new C22809(c13791).m51436()) {
            String strM45618 = c19825.m45618();
            AbstractC11071 abstractC11071 = c19825.f63743;
            if (strM45618 == null) {
                System.err.println(c19825);
            } else {
                if (abstractC11071.f34921 == EnumC22260.CONSTANT) {
                    C16380 c16380 = (C16380) abstractC11071;
                    char cCharAt = strM45618.charAt(0);
                    if (cCharAt == 'D') {
                        Object obj = c16380.f53172;
                        if (!(obj instanceof Double)) {
                            c16380.f53172 = Double.valueOf(Double.longBitsToDouble(((Number) obj).longValue()));
                        }
                    } else if (cCharAt == 'F') {
                        Object obj2 = c16380.f53172;
                        if (!(obj2 instanceof Float)) {
                            c16380.f53172 = Float.valueOf(Float.intBitsToFloat(((Number) obj2).intValue()));
                        }
                    } else if (cCharAt == 'L' || cCharAt == '[') {
                        Integer num = 0;
                        if (num.equals(c16380.f53172)) {
                            c16380.f53172 = C16380.f53171;
                        }
                        if (strM45618.equals("[F")) {
                            Object obj3 = c16380.f53172;
                            if (obj3 instanceof int[]) {
                                int[] iArr = (int[]) obj3;
                                float[] fArr = new float[iArr.length];
                                for (int i = 0; i < iArr.length; i++) {
                                    fArr[i] = Float.intBitsToFloat(iArr[i]);
                                }
                                c16380.f53172 = fArr;
                            }
                        }
                        if (strM45618.equals("[D")) {
                            Object obj4 = c16380.f53172;
                            if (obj4 instanceof long[]) {
                                long[] jArr = (long[]) obj4;
                                double[] dArr = new double[jArr.length];
                                for (int i2 = 0; i2 < jArr.length; i2++) {
                                    dArr[i2] = Double.longBitsToDouble(jArr[i2]);
                                }
                                c16380.f53172 = dArr;
                            }
                        }
                    }
                }
                abstractC11071.f34923 = strM45618;
                abstractC11071.f34924 = null;
                c19825.f63735 = null;
                c19825.f63742 = null;
                c19825.f63734 = null;
                c19825.f63739 = null;
                c19825.f63741 = null;
                c19825.f63733 = null;
            }
        }
    }
}
