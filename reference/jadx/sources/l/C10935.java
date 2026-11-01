package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۧۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 63QR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10935 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C10935 f37178;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C21825 f37179;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f37183;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21825 f37184;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C22489 f37185;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f37189;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f37190;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC6659 f37191;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f37193;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f37181 = false;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f37182 = -1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int[] f37187 = null;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f37180 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f37192 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f37186 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f37188 = Integer.MIN_VALUE;

    static {
        C21825 c21825M48588 = C21825.m48588();
        f37179 = c21825M48588;
        f37178 = new C10935(EnumC6659.UNKNOWN, -1, Integer.MIN_VALUE, null, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825M48588);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        EnumC6659 enumC6659 = this.f37191;
        sb.append(enumC6659);
        int i = C12346.f41254[enumC6659.ordinal()];
        int i2 = this.f37193;
        int i3 = this.f37190;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                sb.append(", offset = ");
                sb.append(this.f37182);
                break;
            case 5:
            case 6:
                if (this.f37187 == null) {
                    sb.append(", lvarOffset is null!");
                } else {
                    sb.append(", {");
                    for (int i4 = 0; i4 < this.f37187.length; i4++) {
                        if (i4 != 0) {
                            sb.append("; ");
                        }
                        sb.append("start_pc = ");
                        sb.append(this.f37187[i4]);
                        sb.append(", length = ");
                        sb.append(this.f37180[i4]);
                        sb.append(", index = ");
                        sb.append(this.f37192[i4]);
                    }
                    sb.append(l.d);
                }
                break;
            case 7:
            case 21:
            case 22:
                break;
            case 8:
            case 9:
                sb.append(", param_index = ");
                sb.append(i2);
                break;
            case 10:
            case 11:
                sb.append(", param_index = ");
                sb.append(i2);
                sb.append(", bound_index = ");
                sb.append(this.f37183);
                break;
            case 12:
                sb.append(", type_index = ");
                sb.append(i3);
                break;
            case 13:
                sb.append(", type_index = ");
                sb.append(i3);
                break;
            case 14:
                sb.append(", exception_index = ");
                sb.append(this.f37186);
                break;
            case 15:
                sb.append(", param_index = ");
                sb.append(i2);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                sb.append(", offset = ");
                sb.append(this.f37182);
                sb.append(", type_index = ");
                sb.append(i3);
                break;
            case 23:
                sb.append(", position UNKNOWN!");
                break;
            default:
                C6171.m17174("Unknown target type: " + enumC6659);
                throw null;
        }
        if (!this.f37184.isEmpty()) {
            sb.append(", location = (");
            sb.append(this.f37184);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        sb.append(", pos = ");
        sb.append(this.f37189);
        C22489 c22489 = this.f37185;
        if (c22489 != null) {
            sb.append(", onLambda hash = ");
            sb.append(c22489.hashCode());
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27446(int i) {
        C6171.m17175("exception_index already set", !(this.f37186 >= 0));
        C6171.m17175("Expected a valid index into exception table", i >= 0);
        this.f37186 = i;
        this.f37181 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27447(int i, int i2) {
        C6171.m17175("exception_index is already set", !(this.f37186 >= 0));
        C6171.m17175("Expected a valid catch type", i >= 0);
        C6171.m17175("Expected a valid start position", i2 >= 0);
        this.f37186 = -(i + 1);
        this.f37188 = i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m27449() {
        C6171.m17175("exception_index is not set", this.f37186 >= 0);
        return this.f37186;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m27444() {
        int i = this.f37186;
        return i < 0 && i != Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27445() {
        C6171.m17175("exception_index does not contain valid catch info", m27444());
        return (-this.f37186) - 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m27448() {
        C6171.m17175("exceptionStartPos does not contain valid start position", this.f37188 >= 0);
        return this.f37188;
    }

    public C10935(EnumC6659 enumC6659, int i, int i2, C22489 c22489, int i3, int i4, C21825 c21825) {
        C6171.m17171(c21825);
        this.f37191 = enumC6659;
        this.f37189 = i;
        this.f37193 = i2;
        this.f37185 = c22489;
        this.f37190 = i3;
        this.f37183 = i4;
        this.f37184 = c21825;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C10935 m27437(C21825 c21825, C22489 c22489, int i) {
        return new C10935(EnumC6659.METHOD_RETURN, i, Integer.MIN_VALUE, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C10935 m27442(C21825 c21825, C22489 c22489, int i) {
        return new C10935(EnumC6659.METHOD_RECEIVER, i, Integer.MIN_VALUE, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C10935 m27432(C21825 c21825, C22489 c22489, int i, int i2) {
        return new C10935(EnumC6659.METHOD_FORMAL_PARAMETER, i2, i, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C10935 m27422(C21825 c21825, C22489 c22489, int i) {
        return new C10935(EnumC6659.METHOD_REFERENCE, i, Integer.MIN_VALUE, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10935 m27428(C21825 c21825, C22489 c22489, int i) {
        return new C10935(EnumC6659.CONSTRUCTOR_REFERENCE, i, Integer.MIN_VALUE, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C10935 m27435(C21825 c21825, C22489 c22489, int i) {
        return new C10935(EnumC6659.FIELD, i, Integer.MIN_VALUE, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C10935 m27431(C21825 c21825, C22489 c22489, int i) {
        return new C10935(EnumC6659.LOCAL_VARIABLE, i, Integer.MIN_VALUE, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C10935 m27439(C21825 c21825, C22489 c22489, int i) {
        return new C10935(EnumC6659.EXCEPTION_PARAMETER, i, Integer.MIN_VALUE, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C10935 m27433(C21825 c21825, C22489 c22489, int i) {
        return new C10935(EnumC6659.RESOURCE_VARIABLE, i, Integer.MIN_VALUE, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C10935 m27426(C21825 c21825, C22489 c22489, int i) {
        return new C10935(EnumC6659.NEW, i, Integer.MIN_VALUE, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10935 m27429(C21825 c21825, C22489 c22489, int i, int i2) {
        return new C10935(EnumC6659.CLASS_EXTENDS, i2, Integer.MIN_VALUE, c22489, i, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C10935 m27424(C21825 c21825, C22489 c22489, int i) {
        return new C10935(EnumC6659.INSTANCEOF, i, Integer.MIN_VALUE, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C10935 m27427(C21825 c21825, C22489 c22489, int i, int i2) {
        return new C10935(EnumC6659.CAST, i2, Integer.MIN_VALUE, c22489, i, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C10935 m27425(C21825 c21825, C22489 c22489, int i, int i2) {
        return new C10935(EnumC6659.METHOD_INVOCATION_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c22489, i, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C10935 m27440(C21825 c21825, C22489 c22489, int i, int i2) {
        return new C10935(EnumC6659.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c22489, i, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C10935 m27434(C21825 c21825, C22489 c22489, int i, int i2) {
        return new C10935(EnumC6659.CLASS_TYPE_PARAMETER, i2, i, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C10935 m27438(C21825 c21825, C22489 c22489, int i, int i2) {
        return new C10935(EnumC6659.METHOD_TYPE_PARAMETER, i2, i, c22489, Integer.MIN_VALUE, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C10935 m27423(C21825 c21825, C22489 c22489, int i, int i2) {
        return new C10935(EnumC6659.THROWS, i2, Integer.MIN_VALUE, c22489, i, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C10935 m27443(C21825 c21825, C22489 c22489, int i, int i2) {
        return new C10935(EnumC6659.METHOD_REFERENCE_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c22489, i, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C10935 m27436(C21825 c21825, C22489 c22489, int i, int i2) {
        return new C10935(EnumC6659.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c22489, i, Integer.MIN_VALUE, c21825);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C10935 m27441(C21825 c21825, C22489 c22489, int i, int i2, int i3) {
        return new C10935(EnumC6659.CLASS_TYPE_PARAMETER_BOUND, i3, i, c22489, Integer.MIN_VALUE, i2, c21825);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10935 m27430(C21825 c21825, C22489 c22489, int i, int i2, int i3) {
        return new C10935(EnumC6659.METHOD_TYPE_PARAMETER_BOUND, i3, i, c22489, Integer.MIN_VALUE, i2, c21825);
    }
}
