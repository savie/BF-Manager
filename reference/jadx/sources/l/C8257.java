package l;

/* JADX INFO: renamed from: l.۠֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 63ZD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8257 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m22245(Object obj, AbstractC22664 abstractC22664) {
        if (!(obj instanceof Integer)) {
            return obj;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = C2291.f7442[abstractC22664.mo9097().ordinal()];
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m22249(Object obj, AbstractC22664 abstractC22664) {
        Object objM22245 = m22245(obj, abstractC22664);
        int i = C2291.f7442[abstractC22664.mo9097().ordinal()];
        if (i == 2) {
            return "'" + C21901.m49590(((Character) objM22245).charValue()) + '\'';
        }
        if (i == 3) {
            Byte b = (Byte) objM22245;
            b.getClass();
            return String.format("(byte)0x%02x", b);
        }
        if (i == 5) {
            return ((Long) objM22245).longValue() + "L";
        }
        if (i == 6) {
            return m22247(((Float) objM22245).floatValue());
        }
        if (i == 7) {
            return m22246(((Double) objM22245).doubleValue());
        }
        if (!(objM22245 instanceof String)) {
            return objM22245 + "";
        }
        return "\"" + C21901.m49592((String) objM22245) + '\"';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22248(Object obj) {
        if (!(obj instanceof Byte)) {
            if (!(obj instanceof Short)) {
                if (!(obj instanceof Long)) {
                    if (obj instanceof Float) {
                        return m22247(((Float) obj).floatValue());
                    }
                    if (obj instanceof Double) {
                        return m22246(((Double) obj).doubleValue());
                    }
                    if (!(obj instanceof Character)) {
                        if (!(obj instanceof String)) {
                            if ((obj instanceof Integer) || (obj instanceof Boolean)) {
                                return obj.toString();
                            }
                            throw new IllegalArgumentException("Argument is not a primitive type or a string; it " + "has class ".concat(obj.getClass().getName()) + ".");
                        }
                        return "\"" + C21901.m49592((String) obj) + '\"';
                    }
                    return "'" + C21901.m49590(((Character) obj).charValue()) + '\'';
                }
                return ((Long) obj).longValue() + "L";
            }
            return String.format("(short)%d", (Short) obj);
        }
        return String.format("(byte)0x%02x", (Byte) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22247(float f) {
        if (Float.isNaN(f)) {
            return "0.0f/0.0f";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-1.0f/0.0f" : "1.0f/0.0f";
        }
        return f + "f";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22246(double d) {
        if (Double.isNaN(d)) {
            return "0.0/0.0";
        }
        if (Double.isInfinite(d)) {
            return d < 0.0d ? "-1.0/0.0" : "1.0/0.0";
        }
        return d + "";
    }
}
