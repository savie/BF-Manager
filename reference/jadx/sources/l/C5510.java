package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۚ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 63QR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5510 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C5510 f19172;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C14769 f19173;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f19175;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16327 f19178;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f19181;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f19182;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC21478 f19183;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C14769 f19184;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f19187;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f19186 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f19174 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f19176 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f19179 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f19180 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f19177 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f19185 = Integer.MIN_VALUE;

    static {
        C14769 c14769M35543 = C14769.m35543();
        f19173 = c14769M35543;
        f19172 = new C5510(EnumC21478.UNKNOWN, -1, Integer.MIN_VALUE, null, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769M35543);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        EnumC21478 enumC21478 = this.f19183;
        sb.append(enumC21478);
        int i = C19680.f63376[enumC21478.ordinal()];
        int i2 = this.f19187;
        int i3 = this.f19181;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                sb.append(", offset = ");
                sb.append(this.f19174);
                break;
            case 5:
            case 6:
                if (this.f19176 == null) {
                    sb.append(", lvarOffset is null!");
                } else {
                    sb.append(", {");
                    for (int i4 = 0; i4 < this.f19176.length; i4++) {
                        if (i4 != 0) {
                            sb.append("; ");
                        }
                        sb.append("start_pc = ");
                        sb.append(this.f19176[i4]);
                        sb.append(", length = ");
                        sb.append(this.f19179[i4]);
                        sb.append(", index = ");
                        sb.append(this.f19180[i4]);
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
                sb.append(this.f19175);
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
                sb.append(this.f19177);
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
                sb.append(this.f19174);
                sb.append(", type_index = ");
                sb.append(i3);
                break;
            case 23:
                sb.append(", position UNKNOWN!");
                break;
            default:
                C11972.m30024("Unknown target type: " + enumC21478);
                throw null;
        }
        if (!this.f19184.isEmpty()) {
            sb.append(", location = (");
            sb.append(this.f19184);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        sb.append(", pos = ");
        sb.append(this.f19182);
        C16327 c16327 = this.f19178;
        if (c16327 != null) {
            sb.append(", onLambda hash = ");
            sb.append(c16327.hashCode());
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16407(int i) {
        C11972.m30025("exception_index already set", !(this.f19177 >= 0));
        C11972.m30025("Expected a valid index into exception table", i >= 0);
        this.f19177 = i;
        this.f19186 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16408(int i, int i2) {
        C11972.m30025("exception_index is already set", !(this.f19177 >= 0));
        C11972.m30025("Expected a valid catch type", i >= 0);
        C11972.m30025("Expected a valid start position", i2 >= 0);
        this.f19177 = -(i + 1);
        this.f19185 = i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m16410() {
        C11972.m30025("exception_index is not set", this.f19177 >= 0);
        return this.f19177;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m16411() {
        int i = this.f19177;
        return i < 0 && i != Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16406() {
        C11972.m30025("exception_index does not contain valid catch info", m16411());
        return (-this.f19177) - 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m16409() {
        C11972.m30025("exceptionStartPos does not contain valid start position", this.f19185 >= 0);
        return this.f19185;
    }

    public C5510(EnumC21478 enumC21478, int i, int i2, C16327 c16327, int i3, int i4, C14769 c14769) {
        C11972.m30021(c14769);
        this.f19183 = enumC21478;
        this.f19182 = i;
        this.f19187 = i2;
        this.f19178 = c16327;
        this.f19181 = i3;
        this.f19175 = i4;
        this.f19184 = c14769;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C5510 m16389(C14769 c14769, C16327 c16327, int i) {
        return new C5510(EnumC21478.METHOD_RETURN, i, Integer.MIN_VALUE, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C5510 m16397(C14769 c14769, C16327 c16327, int i) {
        return new C5510(EnumC21478.METHOD_RECEIVER, i, Integer.MIN_VALUE, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C5510 m16400(C14769 c14769, C16327 c16327, int i, int i2) {
        return new C5510(EnumC21478.METHOD_FORMAL_PARAMETER, i2, i, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C5510 m16395(C14769 c14769, C16327 c16327, int i) {
        return new C5510(EnumC21478.METHOD_REFERENCE, i, Integer.MIN_VALUE, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5510 m16386(C14769 c14769, C16327 c16327, int i) {
        return new C5510(EnumC21478.CONSTRUCTOR_REFERENCE, i, Integer.MIN_VALUE, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C5510 m16391(C14769 c14769, C16327 c16327, int i) {
        return new C5510(EnumC21478.FIELD, i, Integer.MIN_VALUE, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C5510 m16399(C14769 c14769, C16327 c16327, int i) {
        return new C5510(EnumC21478.LOCAL_VARIABLE, i, Integer.MIN_VALUE, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C5510 m16401(C14769 c14769, C16327 c16327, int i) {
        return new C5510(EnumC21478.EXCEPTION_PARAMETER, i, Integer.MIN_VALUE, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C5510 m16393(C14769 c14769, C16327 c16327, int i) {
        return new C5510(EnumC21478.RESOURCE_VARIABLE, i, Integer.MIN_VALUE, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5510 m16384(C14769 c14769, C16327 c16327, int i) {
        return new C5510(EnumC21478.NEW, i, Integer.MIN_VALUE, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5510 m16387(C14769 c14769, C16327 c16327, int i, int i2) {
        return new C5510(EnumC21478.CLASS_EXTENDS, i2, Integer.MIN_VALUE, c16327, i, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C5510 m16404(C14769 c14769, C16327 c16327, int i) {
        return new C5510(EnumC21478.INSTANCEOF, i, Integer.MIN_VALUE, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5510 m16385(C14769 c14769, C16327 c16327, int i, int i2) {
        return new C5510(EnumC21478.CAST, i2, Integer.MIN_VALUE, c16327, i, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C5510 m16405(C14769 c14769, C16327 c16327, int i, int i2) {
        return new C5510(EnumC21478.METHOD_INVOCATION_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c16327, i, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C5510 m16402(C14769 c14769, C16327 c16327, int i, int i2) {
        return new C5510(EnumC21478.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c16327, i, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C5510 m16394(C14769 c14769, C16327 c16327, int i, int i2) {
        return new C5510(EnumC21478.CLASS_TYPE_PARAMETER, i2, i, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C5510 m16390(C14769 c14769, C16327 c16327, int i, int i2) {
        return new C5510(EnumC21478.METHOD_TYPE_PARAMETER, i2, i, c16327, Integer.MIN_VALUE, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C5510 m16396(C14769 c14769, C16327 c16327, int i, int i2) {
        return new C5510(EnumC21478.THROWS, i2, Integer.MIN_VALUE, c16327, i, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C5510 m16398(C14769 c14769, C16327 c16327, int i, int i2) {
        return new C5510(EnumC21478.METHOD_REFERENCE_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c16327, i, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C5510 m16392(C14769 c14769, C16327 c16327, int i, int i2) {
        return new C5510(EnumC21478.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c16327, i, Integer.MIN_VALUE, c14769);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C5510 m16403(C14769 c14769, C16327 c16327, int i, int i2, int i3) {
        return new C5510(EnumC21478.CLASS_TYPE_PARAMETER_BOUND, i3, i, c16327, Integer.MIN_VALUE, i2, c14769);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5510 m16388(C14769 c14769, C16327 c16327, int i, int i2, int i3) {
        return new C5510(EnumC21478.METHOD_TYPE_PARAMETER_BOUND, i3, i, c16327, Integer.MIN_VALUE, i2, c14769);
    }
}
