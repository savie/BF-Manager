package l;

/* JADX INFO: renamed from: l.᩶ܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T3FM */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC21478 {
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


    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final int f68665 = 75;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC21478[] f68667 = new EnumC21478[76];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f68669;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f68670;

    static {
        for (EnumC21478 enumC21478 : values()) {
            int i = enumC21478.f68670;
            if (i != UNKNOWN.f68670) {
                f68667[i] = enumC21478;
            }
        }
        for (int i2 = 0; i2 <= 75; i2++) {
            EnumC21478[] enumC21478Arr = f68667;
            if (enumC21478Arr[i2] == null) {
                enumC21478Arr[i2] = UNKNOWN;
            }
        }
    }

    EnumC21478(int i) {
        this(i, false);
    }

    EnumC21478(int i, boolean z) {
        if (i < 0 || i > 255) {
            C11972.m30024("Attribute type value needs to be an unsigned byte: ".concat(String.format("0x%02X", Integer.valueOf(i))));
            throw null;
        }
        this.f68670 = i;
        this.f68669 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m48863() {
        return this.f68669;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m48864() {
        return this.f68670;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m48862(int i) {
        if (i == UNKNOWN.f68670) {
            return true;
        }
        return i >= 0 && i < f68667.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21478 m48860(int i) {
        EnumC21478 enumC21478 = UNKNOWN;
        if (i == enumC21478.f68670) {
            return enumC21478;
        }
        if (i >= 0) {
            EnumC21478[] enumC21478Arr = f68667;
            if (i < enumC21478Arr.length) {
                return enumC21478Arr[i];
            }
        }
        C11972.m30024("Unknown TargetType: " + i);
        throw null;
    }
}
