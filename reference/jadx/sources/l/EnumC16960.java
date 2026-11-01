package l;

/* JADX INFO: renamed from: l.ܽ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC16960 implements InterfaceC9800 {
    TARGET_TYPE_UNKNOWN(0),
    TARGET_TYPE_FILE(1),
    TARGET_TYPE_EXTENSION_RANGE(2),
    TARGET_TYPE_MESSAGE(3),
    TARGET_TYPE_FIELD(4),
    TARGET_TYPE_ONEOF(5),
    TARGET_TYPE_ENUM(6),
    TARGET_TYPE_ENUM_ENTRY(7),
    TARGET_TYPE_SERVICE(8),
    TARGET_TYPE_METHOD(9);


    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final int f54253 = 8;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final int f54257 = 0;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final int f54258 = 3;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final int f54259 = 5;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16960[] f54261;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f54262 = 1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f54263 = 2;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final int f54264 = 9;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int f54265 = 7;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int f54268 = 4;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f54270 = 6;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f54273;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f54275;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC16960.class.getName());
        f54273 = new C0731();
        f54261 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f54275;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC16960 m39752(int i) {
        return m39749(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16960 m39749(int i) {
        switch (i) {
            case 0:
                return TARGET_TYPE_UNKNOWN;
            case 1:
                return TARGET_TYPE_FILE;
            case 2:
                return TARGET_TYPE_EXTENSION_RANGE;
            case 3:
                return TARGET_TYPE_MESSAGE;
            case 4:
                return TARGET_TYPE_FIELD;
            case 5:
                return TARGET_TYPE_ONEOF;
            case 6:
                return TARGET_TYPE_ENUM;
            case 7:
                return TARGET_TYPE_ENUM_ENTRY;
            case 8:
                return TARGET_TYPE_SERVICE;
            case 9:
                return TARGET_TYPE_METHOD;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m39748() {
        return f54273;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m39754() {
        return (C21857) m39751().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m39753() {
        return m39751();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m39751() {
        int i = C12727.f42445;
        return (C7040) C14097.f46276.m8532().get(3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16960 m39750(C21857 c21857) {
        if (c21857.getType() != m39751()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f54261[c21857.m48639()];
    }

    EnumC16960(int i) {
        this.f54275 = i;
    }
}
