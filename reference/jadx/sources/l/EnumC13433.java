package l;

/* JADX INFO: renamed from: l.۬᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC13433 implements InterfaceC9800 {
    TYPE_DOUBLE(1),
    TYPE_FLOAT(2),
    TYPE_INT64(3),
    TYPE_UINT64(4),
    TYPE_INT32(5),
    TYPE_FIXED64(6),
    TYPE_FIXED32(7),
    TYPE_BOOL(8),
    TYPE_STRING(9),
    TYPE_GROUP(10),
    TYPE_MESSAGE(11),
    TYPE_BYTES(12),
    TYPE_UINT32(13),
    TYPE_ENUM(14),
    TYPE_SFIXED32(15),
    TYPE_SFIXED64(16),
    TYPE_SINT32(17),
    TYPE_SINT64(18);


    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final int f44435 = 5;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final int f44439 = 3;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final int f44440 = 6;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final int f44441 = 10;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f44447 = 7;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final int f44448 = 18;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f44449 = 1;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final int f44450 = 2;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13433[] f44452;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int f44455 = 14;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f44458 = 8;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final int f44459 = 4;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f44460 = 12;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f44461;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final int f44463 = 16;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final int f44464 = 17;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final int f44466 = 13;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final int f44467 = 9;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final int f44468 = 15;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final int f44470 = 11;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f44472;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC13433.class.getName());
        f44461 = new C1437();
        f44452 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f44472;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC13433 m32928(int i) {
        return m32925(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC13433 m32925(int i) {
        switch (i) {
            case 1:
                return TYPE_DOUBLE;
            case 2:
                return TYPE_FLOAT;
            case 3:
                return TYPE_INT64;
            case 4:
                return TYPE_UINT64;
            case 5:
                return TYPE_INT32;
            case 6:
                return TYPE_FIXED64;
            case 7:
                return TYPE_FIXED32;
            case 8:
                return TYPE_BOOL;
            case 9:
                return TYPE_STRING;
            case 10:
                return TYPE_GROUP;
            case 11:
                return TYPE_MESSAGE;
            case 12:
                return TYPE_BYTES;
            case 13:
                return TYPE_UINT32;
            case 14:
                return TYPE_ENUM;
            case 15:
                return TYPE_SFIXED32;
            case 16:
                return TYPE_SFIXED64;
            case 17:
                return TYPE_SINT32;
            case 18:
                return TYPE_SINT64;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m32924() {
        return f44461;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m32930() {
        return (C21857) m32927().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m32929() {
        return m32927();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m32927() {
        int i = C4259.f15372;
        return (C7040) C14097.f46292.m8532().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC13433 m32926(C21857 c21857) {
        if (c21857.getType() != m32927()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f44452[c21857.m48639()];
    }

    EnumC13433(int i) {
        this.f44472 = i;
    }
}
