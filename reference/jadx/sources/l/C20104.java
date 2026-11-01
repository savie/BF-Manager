package l;

/* JADX INFO: renamed from: l.᩶ۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 63ZD */
/* JADX INFO: loaded from: classes4.dex */
public final class C20104 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m45465(Object obj, AbstractC16579 abstractC16579) {
        if (!(obj instanceof Integer)) {
            return obj;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = C15871.f51352[abstractC16579.mo1933().ordinal()];
        if (i == 1) {
            return Boolean.valueOf(iIntValue != 0);
        }
        if (i == 2) {
            return Character.valueOf((char) iIntValue);
        }
        if (i != 3) {
            return i != 4 ? obj : Short.valueOf((short) iIntValue);
        }
        return Byte.valueOf((byte) iIntValue);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m45469(Object obj, AbstractC16579 abstractC16579) {
        Object objM45465 = m45465(obj, abstractC16579);
        int i = C15871.f51352[abstractC16579.mo1933().ordinal()];
        if (i == 2) {
            return "'" + C17281.m40239(((Character) objM45465).charValue()) + '\'';
        }
        if (i == 3) {
            Byte b = (Byte) objM45465;
            b.getClass();
            return String.format("(byte)0x%02x", b);
        }
        if (i == 5) {
            return ((Long) objM45465).longValue() + "L";
        }
        if (i == 6) {
            return m45467(((Float) objM45465).floatValue());
        }
        if (i == 7) {
            return m45466(((Double) objM45465).doubleValue());
        }
        if (!(objM45465 instanceof String)) {
            return objM45465 + "";
        }
        return "\"" + C17281.m40241((String) objM45465) + '\"';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45468(Object obj) {
        if (!(obj instanceof Byte)) {
            if (!(obj instanceof Short)) {
                if (!(obj instanceof Long)) {
                    if (obj instanceof Float) {
                        return m45467(((Float) obj).floatValue());
                    }
                    if (obj instanceof Double) {
                        return m45466(((Double) obj).doubleValue());
                    }
                    if (!(obj instanceof Character)) {
                        if (!(obj instanceof String)) {
                            if ((obj instanceof Integer) || (obj instanceof Boolean)) {
                                return obj.toString();
                            }
                            throw new IllegalArgumentException("Argument is not a primitive type or a string; it " + "has class ".concat(obj.getClass().getName()) + ".");
                        }
                        return "\"" + C17281.m40241((String) obj) + '\"';
                    }
                    return "'" + C17281.m40239(((Character) obj).charValue()) + '\'';
                }
                return ((Long) obj).longValue() + "L";
            }
            return String.format("(short)%d", (Short) obj);
        }
        return String.format("(byte)0x%02x", (Byte) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45467(float f) {
        if (Float.isNaN(f)) {
            return "0.0f/0.0f";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-1.0f/0.0f" : "1.0f/0.0f";
        }
        return f + "f";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45466(double d) {
        if (Double.isNaN(d)) {
            return "0.0/0.0";
        }
        if (Double.isInfinite(d)) {
            return d < 0.0d ? "-1.0/0.0" : "1.0/0.0";
        }
        return d + "";
    }
}
