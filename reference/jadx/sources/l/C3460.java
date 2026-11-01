package l;

/* JADX INFO: renamed from: l.ۗ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4LM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3460 extends AbstractC9812 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C3460 f12720;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3460 f12721;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f12722;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f12723;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2175 f12724;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23344 f12725;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f12726;

    public C3460(C23344 c23344, boolean z, C2175 c2175, C3460 c3460) {
        super(589824, null);
        this.f12725 = c23344;
        this.f12722 = z;
        this.f12724 = c2175;
        int i = c2175.f7888;
        this.f12726 = i == 0 ? -1 : i - 2;
        this.f12720 = c3460;
        if (c3460 != null) {
            c3460.f12721 = this;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3460 m10172(C23344 c23344, String str, C3460 c3460) {
        C2175 c2175 = new C2175();
        c2175.m6771(c23344.m51441(str));
        c2175.m6771(0);
        return new C3460(c23344, true, c2175, c3460);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3460 m10171(C23344 c23344, int i, C1470 c1470, String str, C3460 c3460) {
        C2175 c2175 = new C2175();
        int i2 = i >>> 24;
        if (i2 == 0 || i2 == 1) {
            c2175.m6771(i >>> 16);
        } else {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 23:
                    c2175.m6772(i2, (i & 16776960) >> 8);
                    break;
                case 19:
                case 20:
                case 21:
                    c2175.m6764(i2);
                    break;
                case 22:
                    c2175.m6771(i >>> 16);
                    break;
                default:
                    switch (i2) {
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            c2175.m6772(i2, (i & 16776960) >> 8);
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            c2175.m6773(i);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
        }
        C1470.m5115(c1470, c2175);
        c2175.m6771(c23344.m51441(str));
        c2175.m6771(0);
        return new C3460(c23344, true, c2175, c3460);
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
    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10179(Object obj, String str) {
        this.f12723++;
        boolean z = this.f12722;
        C23344 c23344 = this.f12725;
        C2175 c2175 = this.f12724;
        if (z) {
            c2175.m6771(c23344.m51441(str));
        }
        if (obj instanceof String) {
            c2175.m6772(115, c23344.m51441((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            c2175.m6772(66, c23344.m51449((int) ((Byte) obj).byteValue()).f54335);
            return;
        }
        if (obj instanceof Boolean) {
            c2175.m6772(90, c23344.m51449(((Boolean) obj).booleanValue() ? 1 : 0).f54335);
            return;
        }
        if (obj instanceof Character) {
            c2175.m6772(67, c23344.m51449((int) ((Character) obj).charValue()).f54335);
            return;
        }
        if (obj instanceof Short) {
            c2175.m6772(83, c23344.m51449((int) ((Short) obj).shortValue()).f54335);
            return;
        }
        if (obj instanceof C14172) {
            c2175.m6772(99, c23344.m51441(((C14172) obj).m34268()));
            return;
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c2175.m6772(91, bArr.length);
            int length = bArr.length;
            while (i < length) {
                c2175.m6772(66, c23344.m51449((int) bArr[i]).f54335);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            c2175.m6772(91, zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                c2175.m6772(90, c23344.m51449(zArr[i] ? 1 : 0).f54335);
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            c2175.m6772(91, sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                c2175.m6772(83, c23344.m51449((int) sArr[i]).f54335);
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            c2175.m6772(91, cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                c2175.m6772(67, c23344.m51449((int) cArr[i]).f54335);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            c2175.m6772(91, iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                c2175.m6772(73, c23344.m51449(iArr[i]).f54335);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            c2175.m6772(91, jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                c2175.m6772(74, c23344.m51451(jArr[i]).f54335);
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            c2175.m6772(91, fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                c2175.m6772(70, c23344.m51448(fArr[i]).f54335);
                i++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            c2175.m6772(91, dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                c2175.m6772(68, c23344.m51447(dArr[i]).f54335);
                i++;
            }
            return;
        }
        C5704 c5704M51452 = c23344.m51452(obj);
        c2175.m6772(".s.IFJDCS".charAt(c5704M51452.f54336), c5704M51452.f54335);
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10180(String str, String str2, String str3) {
        this.f12723++;
        boolean z = this.f12722;
        C2175 c2175 = this.f12724;
        C23344 c23344 = this.f12725;
        if (z) {
            c2175.m6771(c23344.m51441(str));
        }
        c2175.m6772(101, c23344.m51441(str2));
        c2175.m6771(c23344.m51441(str3));
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9812 mo10176(String str, String str2) {
        this.f12723++;
        boolean z = this.f12722;
        C23344 c23344 = this.f12725;
        C2175 c2175 = this.f12724;
        if (z) {
            c2175.m6771(c23344.m51441(str));
        }
        c2175.m6772(64, c23344.m51441(str2));
        c2175.m6771(0);
        return new C3460(c23344, true, c2175, null);
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9812 mo10175(String str) {
        this.f12723++;
        boolean z = this.f12722;
        C23344 c23344 = this.f12725;
        C2175 c2175 = this.f12724;
        if (z) {
            c2175.m6771(c23344.m51441(str));
        }
        c2175.m6772(91, 0);
        return new C3460(c23344, false, c2175, null);
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10177() {
        int i = this.f12726;
        if (i != -1) {
            byte[] bArr = this.f12724.f7887;
            int i2 = this.f12723;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m10181(String str) {
        if (str != null) {
            this.f12725.m51441(str);
        }
        int i = 8;
        for (C3460 c3460 = this; c3460 != null; c3460 = c3460.f12720) {
            i += c3460.f12724.f7888;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m10170(C3460 c3460, C3460 c3461, C3460 c3462, C3460 c3463) {
        int iM10181 = c3460 != null ? c3460.m10181("RuntimeVisibleAnnotations") : 0;
        if (c3461 != null) {
            iM10181 += c3461.m10181("RuntimeInvisibleAnnotations");
        }
        if (c3462 != null) {
            iM10181 += c3462.m10181("RuntimeVisibleTypeAnnotations");
        }
        return c3463 != null ? iM10181 + c3463.m10181("RuntimeInvisibleTypeAnnotations") : iM10181;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10178(int i, C2175 c2175) {
        int i2 = 2;
        int i3 = 0;
        C3460 c3460 = null;
        for (C3460 c3461 = this; c3461 != null; c3461 = c3461.f12720) {
            c3461.mo10177();
            i2 += c3461.f12724.f7888;
            i3++;
            c3460 = c3461;
        }
        c2175.m6771(i);
        c2175.m6773(i2);
        c2175.m6771(i3);
        while (c3460 != null) {
            C2175 c2176 = c3460.f12724;
            c2175.m6768(0, c2176.f7888, c2176.f7887);
            c3460 = c3460.f12721;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10174(C23344 c23344, C3460 c3460, C3460 c3461, C3460 c3462, C3460 c3463, C2175 c2175) {
        if (c3460 != null) {
            c3460.m10178(c23344.m51441("RuntimeVisibleAnnotations"), c2175);
        }
        if (c3461 != null) {
            c3461.m10178(c23344.m51441("RuntimeInvisibleAnnotations"), c2175);
        }
        if (c3462 != null) {
            c3462.m10178(c23344.m51441("RuntimeVisibleTypeAnnotations"), c2175);
        }
        if (c3463 != null) {
            c3463.m10178(c23344.m51441("RuntimeInvisibleTypeAnnotations"), c2175);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m10169(String str, C3460[] c3460Arr, int i) {
        int iM10181 = (i * 2) + 7;
        for (int i2 = 0; i2 < i; i2++) {
            C3460 c3460 = c3460Arr[i2];
            iM10181 += c3460 == null ? 0 : c3460.m10181(str) - 8;
        }
        return iM10181;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10173(int i, C3460[] c3460Arr, int i2, C2175 c2175) {
        int iM10181 = (i2 * 2) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            C3460 c3460 = c3460Arr[i3];
            iM10181 += c3460 == null ? 0 : c3460.m10181(null) - 8;
        }
        c2175.m6771(i);
        c2175.m6773(iM10181);
        c2175.m6764(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            C3460 c3461 = null;
            for (C3460 c3462 = c3460Arr[i4]; c3462 != null; c3462 = c3462.f12720) {
                c3462.mo10177();
                i5++;
                c3461 = c3462;
            }
            c2175.m6771(i5);
            while (c3461 != null) {
                C2175 c2176 = c3461.f12724;
                c2175.m6768(0, c2176.f7888, c2176.f7887);
                c3461 = c3461.f12721;
            }
        }
    }
}
