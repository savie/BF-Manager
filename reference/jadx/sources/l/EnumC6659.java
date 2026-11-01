package l;

/* JADX INFO: renamed from: l.ۜۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T3FM */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6659 {
    CLASS_TYPE_PARAMETER(0),
    METHOD_TYPE_PARAMETER(1),
    CLASS_EXTENDS(16),
    CLASS_TYPE_PARAMETER_BOUND(17),
    METHOD_TYPE_PARAMETER_BOUND(18),
    FIELD(19),
    METHOD_RETURN(20),
    METHOD_RECEIVER(21),
    METHOD_FORMAL_PARAMETER(22),
    THROWS(23),
    LOCAL_VARIABLE(64, true),
    RESOURCE_VARIABLE(65, true),
    EXCEPTION_PARAMETER(66, true),
    INSTANCEOF(67, true),
    NEW(68, true),
    CONSTRUCTOR_REFERENCE(69, true),
    METHOD_REFERENCE(70, true),
    CAST(71, true),
    CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT(72, true),
    METHOD_INVOCATION_TYPE_ARGUMENT(73, true),
    CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT(74, true),
    METHOD_REFERENCE_TYPE_ARGUMENT(75, true),
    UNKNOWN(255);


    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final int f22498 = 75;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC6659[] f22504 = new EnumC6659[76];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f22509;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f22510;

    static {
        for (EnumC6659 enumC6659 : values()) {
            int i = enumC6659.f22510;
            if (i != UNKNOWN.f22510) {
                f22504[i] = enumC6659;
            }
        }
        for (int i2 = 0; i2 <= 75; i2++) {
            EnumC6659[] enumC6659Arr = f22504;
            if (enumC6659Arr[i2] == null) {
                enumC6659Arr[i2] = UNKNOWN;
            }
        }
    }

    EnumC6659(int i) {
        this(i, false);
    }

    EnumC6659(int i, boolean z) {
        if (i < 0 || i > 255) {
            C6171.m17174("Attribute type value needs to be an unsigned byte: ".concat(String.format("0x%02X", Integer.valueOf(i))));
            throw null;
        }
        this.f22510 = i;
        this.f22509 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m18045() {
        return this.f22509;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m18046() {
        return this.f22510;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m18044(int i) {
        if (i == UNKNOWN.f22510) {
            return true;
        }
        return i >= 0 && i < f22504.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC6659 m18042(int i) {
        EnumC6659 enumC6659 = UNKNOWN;
        if (i == enumC6659.f22510) {
            return enumC6659;
        }
        if (i >= 0) {
            EnumC6659[] enumC6659Arr = f22504;
            if (i < enumC6659Arr.length) {
                return enumC6659Arr[i];
            }
        }
        C6171.m17174("Unknown TargetType: " + i);
        throw null;
    }
}
