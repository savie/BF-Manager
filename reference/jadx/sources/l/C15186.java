package l;

/* JADX INFO: renamed from: l.ܳ۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6DO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49582 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f49583 = C16980.m40037(C15186.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36535(AbstractC1566 abstractC1566) {
        EnumC12006 enumC12006Mo5558 = abstractC1566.mo5558();
        if (enumC12006Mo5558 == EnumC12006.OBJECT) {
            return "L" + abstractC1566.mo5570().replace('.', '/') + ';';
        }
        if (enumC12006Mo5558 == EnumC12006.ARRAY) {
            return "[" + m36535(abstractC1566.mo5557());
        }
        return enumC12006Mo5558.m30193();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36534(long j, AbstractC1566 abstractC1566, C12326 c12326, boolean z, boolean z2) {
        if (abstractC1566 == null || !abstractC1566.mo5564()) {
            String string = Long.toString(j);
            if (!z || Math.abs(j) <= 100) {
                return string;
            }
            StringBuilder sbM10405 = C3188.m10405(string, "(0x");
            sbM10405.append(Long.toHexString(j));
            if (abstractC1566 == null || abstractC1566.mo5566(EnumC12006.FLOAT)) {
                sbM10405.append(", float:");
                sbM10405.append(Float.intBitsToFloat((int) j));
            }
            if (abstractC1566 == null || abstractC1566.mo5566(EnumC12006.DOUBLE)) {
                sbM10405.append(", double:");
                sbM10405.append(Double.longBitsToDouble(j));
            }
            sbM10405.append(')');
            return sbM10405.toString();
        }
        switch (C19662.f63336[abstractC1566.mo5558().ordinal()]) {
            case 1:
                return j == 0 ? "false" : "true";
            case 2:
                c12326.getClass();
                return C12326.m30747(z2, (char) j);
            case 3:
                return c12326.m30750(j, z2);
            case 4:
                return c12326.m30754(j, z2);
            case 5:
                return c12326.m30753(j, z2);
            case 6:
                return c12326.m30752(j, z2);
            case 7:
                return C12326.m30744(Float.intBitsToFloat((int) j));
            case 8:
                return C12326.m30743(Double.longBitsToDouble(j));
            case 9:
            case 10:
                if (j == 0) {
                    return "null";
                }
                f49583.mo13710("Wrong object literal: {} for type: {}", Long.valueOf(j), abstractC1566);
                return Long.toString(j);
            default:
                throw new C8597("Unknown type in literalToString: " + abstractC1566);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36536(C23195 c23195) {
        AbstractC1566 type = c23195.getType();
        if (type == null) {
            return null;
        }
        long jM52122 = c23195.m52122();
        switch (C19662.f63336[type.mo5558().ordinal()]) {
            case 1:
                return jM52122 == 0 ? "false" : "true";
            case 2:
                return String.valueOf((char) jM52122);
            case 3:
            case 4:
            case 5:
            case 6:
                return Long.toString(jM52122);
            case 7:
                return Float.toString(Float.intBitsToFloat((int) jM52122));
            case 8:
                return Double.toString(Double.longBitsToDouble(jM52122));
            case 9:
            case 10:
                if (jM52122 == 0) {
                    return "null";
                }
                f49583.mo13710("Wrong object literal: {} for type: {}", Long.valueOf(jM52122), type);
                return Long.toString(jM52122);
            default:
                return null;
        }
    }
}
