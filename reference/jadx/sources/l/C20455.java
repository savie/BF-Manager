package l;

/* JADX INFO: renamed from: l.᩵ۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4LM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20455 extends AbstractC3301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f65498;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23243 f65499;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4047 f65500;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20455 f65501;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f65502;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f65503;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C20455 f65504;

    public C20455(C23243 c23243, boolean z, C4047 c4047, C20455 c20455) {
        super(589824, null);
        this.f65499 = c23243;
        this.f65498 = z;
        this.f65500 = c4047;
        int i = c4047.f13788;
        this.f65502 = i == 0 ? -1 : i - 2;
        this.f65501 = c20455;
        if (c20455 != null) {
            c20455.f65504 = this;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20455 m46878(C23243 c23243, String str, C20455 c20455) {
        C4047 c4047 = new C4047();
        c4047.m13021(c23243.m52265(str));
        c4047.m13021(0);
        return new C20455(c23243, true, c4047, c20455);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20455 m46877(C23243 c23243, int i, C20259 c20259, String str, C20455 c20455) {
        C4047 c4047 = new C4047();
        int i2 = i >>> 24;
        if (i2 == 0 || i2 == 1) {
            c4047.m13021(i >>> 16);
        } else {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 23:
                    c4047.m13022(i2, (i & 16776960) >> 8);
                    break;
                case 19:
                case 20:
                case 21:
                    c4047.m13014(i2);
                    break;
                case 22:
                    c4047.m13021(i >>> 16);
                    break;
                default:
                    switch (i2) {
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            c4047.m13022(i2, (i & 16776960) >> 8);
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            c4047.m13023(i);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
        }
        C20259.m46532(c20259, c4047);
        c4047.m13021(c23243.m52265(str));
        c4047.m13021(0);
        return new C20455(c23243, true, c4047, c20455);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ */
    public final void mo7996(Object obj, String str) {
        this.f65503++;
        boolean z = this.f65498;
        C23243 c23243 = this.f65499;
        C4047 c4047 = this.f65500;
        if (z) {
            c4047.m13021(c23243.m52265(str));
        }
        if (obj instanceof String) {
            c4047.m13022(115, c23243.m52265((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            c4047.m13022(66, c23243.m52244((int) ((Byte) obj).byteValue()).f53507);
            return;
        }
        if (obj instanceof Boolean) {
            c4047.m13022(90, c23243.m52244(((Boolean) obj).booleanValue() ? 1 : 0).f53507);
            return;
        }
        if (obj instanceof Character) {
            c4047.m13022(67, c23243.m52244((int) ((Character) obj).charValue()).f53507);
            return;
        }
        if (obj instanceof Short) {
            c4047.m13022(83, c23243.m52244((int) ((Short) obj).shortValue()).f53507);
            return;
        }
        if (obj instanceof C3105) {
            c4047.m13022(99, c23243.m52265(((C3105) obj).m10138()));
            return;
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c4047.m13022(91, bArr.length);
            int length = bArr.length;
            while (i < length) {
                c4047.m13022(66, c23243.m52244((int) bArr[i]).f53507);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            c4047.m13022(91, zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                c4047.m13022(90, c23243.m52244(zArr[i] ? 1 : 0).f53507);
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            c4047.m13022(91, sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                c4047.m13022(83, c23243.m52244((int) sArr[i]).f53507);
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            c4047.m13022(91, cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                c4047.m13022(67, c23243.m52244((int) cArr[i]).f53507);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            c4047.m13022(91, iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                c4047.m13022(73, c23243.m52244(iArr[i]).f53507);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            c4047.m13022(91, jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                c4047.m13022(74, c23243.m52246(jArr[i]).f53507);
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            c4047.m13022(91, fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                c4047.m13022(70, c23243.m52243(fArr[i]).f53507);
                i++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            c4047.m13022(91, dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                c4047.m13022(68, c23243.m52242(dArr[i]).f53507);
                i++;
            }
            return;
        }
        C17275 c17275M52247 = c23243.m52247(obj);
        c4047.m13022(".s.IFJDCS".charAt(c17275M52247.f53505), c17275M52247.f53507);
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ */
    public final void mo7997(String str, String str2, String str3) {
        this.f65503++;
        boolean z = this.f65498;
        C4047 c4047 = this.f65500;
        C23243 c23243 = this.f65499;
        if (z) {
            c4047.m13021(c23243.m52265(str));
        }
        c4047.m13022(101, c23243.m52265(str2));
        c4047.m13021(c23243.m52265(str3));
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo7994(String str, String str2) {
        this.f65503++;
        boolean z = this.f65498;
        C23243 c23243 = this.f65499;
        C4047 c4047 = this.f65500;
        if (z) {
            c4047.m13021(c23243.m52265(str));
        }
        c4047.m13022(64, c23243.m52265(str2));
        c4047.m13021(0);
        return new C20455(c23243, true, c4047, null);
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo7993(String str) {
        this.f65503++;
        boolean z = this.f65498;
        C23243 c23243 = this.f65499;
        C4047 c4047 = this.f65500;
        if (z) {
            c4047.m13021(c23243.m52265(str));
        }
        c4047.m13022(91, 0);
        return new C20455(c23243, false, c4047, null);
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ */
    public final void mo7995() {
        int i = this.f65502;
        if (i != -1) {
            byte[] bArr = this.f65500.f13787;
            int i2 = this.f65503;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m46882(String str) {
        if (str != null) {
            this.f65499.m52265(str);
        }
        int i = 8;
        for (C20455 c20455 = this; c20455 != null; c20455 = c20455.f65501) {
            i += c20455.f65500.f13788;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46876(C20455 c20455, C20455 c20456, C20455 c20457, C20455 c20458) {
        int iM46882 = c20455 != null ? c20455.m46882("RuntimeVisibleAnnotations") : 0;
        if (c20456 != null) {
            iM46882 += c20456.m46882("RuntimeInvisibleAnnotations");
        }
        if (c20457 != null) {
            iM46882 += c20457.m46882("RuntimeVisibleTypeAnnotations");
        }
        return c20458 != null ? iM46882 + c20458.m46882("RuntimeInvisibleTypeAnnotations") : iM46882;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46881(int i, C4047 c4047) {
        int i2 = 2;
        int i3 = 0;
        C20455 c20455 = null;
        for (C20455 c20456 = this; c20456 != null; c20456 = c20456.f65501) {
            c20456.mo7995();
            i2 += c20456.f65500.f13788;
            i3++;
            c20455 = c20456;
        }
        c4047.m13021(i);
        c4047.m13023(i2);
        c4047.m13021(i3);
        while (c20455 != null) {
            C4047 c4048 = c20455.f65500;
            c4047.m13018(0, c4048.f13788, c4048.f13787);
            c20455 = c20455.f65504;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46880(C23243 c23243, C20455 c20455, C20455 c20456, C20455 c20457, C20455 c20458, C4047 c4047) {
        if (c20455 != null) {
            c20455.m46881(c23243.m52265("RuntimeVisibleAnnotations"), c4047);
        }
        if (c20456 != null) {
            c20456.m46881(c23243.m52265("RuntimeInvisibleAnnotations"), c4047);
        }
        if (c20457 != null) {
            c20457.m46881(c23243.m52265("RuntimeVisibleTypeAnnotations"), c4047);
        }
        if (c20458 != null) {
            c20458.m46881(c23243.m52265("RuntimeInvisibleTypeAnnotations"), c4047);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46875(String str, C20455[] c20455Arr, int i) {
        int iM46882 = (i * 2) + 7;
        for (int i2 = 0; i2 < i; i2++) {
            C20455 c20455 = c20455Arr[i2];
            iM46882 += c20455 == null ? 0 : c20455.m46882(str) - 8;
        }
        return iM46882;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46879(int i, C20455[] c20455Arr, int i2, C4047 c4047) {
        int iM46882 = (i2 * 2) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            C20455 c20455 = c20455Arr[i3];
            iM46882 += c20455 == null ? 0 : c20455.m46882(null) - 8;
        }
        c4047.m13021(i);
        c4047.m13023(iM46882);
        c4047.m13014(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            C20455 c20456 = null;
            for (C20455 c20457 = c20455Arr[i4]; c20457 != null; c20457 = c20457.f65501) {
                c20457.mo7995();
                i5++;
                c20456 = c20457;
            }
            c4047.m13021(i5);
            while (c20456 != null) {
                C4047 c4048 = c20456.f65500;
                c4047.m13018(0, c4048.f13788, c4048.f13787);
                c20456 = c20456.f65504;
            }
        }
    }
}
