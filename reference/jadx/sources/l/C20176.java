package l;

/* JADX INFO: renamed from: l.᩶۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20176 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f65490 = {"B", "S", "C", "I"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45603(C9116 c9116) {
        for (C15943 c15943 : new C20881(c9116).m46935()) {
            String strM37903 = c15943.m37903();
            AbstractC7124 abstractC7124 = c15943.f51643;
            if (strM37903 == null) {
                System.err.println(c15943);
            } else {
                if (abstractC7124.f23823 == EnumC9947.CONSTANT) {
                    C14760 c14760 = (C14760) abstractC7124;
                    char cCharAt = strM37903.charAt(0);
                    if (cCharAt == 'D') {
                        Object obj = c14760.f48276;
                        if (!(obj instanceof Double)) {
                            c14760.f48276 = Double.valueOf(Double.longBitsToDouble(((Number) obj).longValue()));
                        }
                    } else if (cCharAt == 'F') {
                        Object obj2 = c14760.f48276;
                        if (!(obj2 instanceof Float)) {
                            c14760.f48276 = Float.valueOf(Float.intBitsToFloat(((Number) obj2).intValue()));
                        }
                    } else if (cCharAt == 'L' || cCharAt == '[') {
                        Integer num = 0;
                        if (num.equals(c14760.f48276)) {
                            c14760.f48276 = C14760.f48275;
                        }
                        if (strM37903.equals("[F")) {
                            Object obj3 = c14760.f48276;
                            if (obj3 instanceof int[]) {
                                int[] iArr = (int[]) obj3;
                                float[] fArr = new float[iArr.length];
                                for (int i = 0; i < iArr.length; i++) {
                                    fArr[i] = Float.intBitsToFloat(iArr[i]);
                                }
                                c14760.f48276 = fArr;
                            }
                        }
                        if (strM37903.equals("[D")) {
                            Object obj4 = c14760.f48276;
                            if (obj4 instanceof long[]) {
                                long[] jArr = (long[]) obj4;
                                double[] dArr = new double[jArr.length];
                                for (int i2 = 0; i2 < jArr.length; i2++) {
                                    dArr[i2] = Double.longBitsToDouble(jArr[i2]);
                                }
                                c14760.f48276 = dArr;
                            }
                        }
                    }
                }
                abstractC7124.f23821 = strM37903;
                abstractC7124.f23824 = null;
                c15943.f51640 = null;
                c15943.f51634 = null;
                c15943.f51636 = null;
                c15943.f51642 = null;
                c15943.f51641 = null;
                c15943.f51635 = null;
            }
        }
    }
}
