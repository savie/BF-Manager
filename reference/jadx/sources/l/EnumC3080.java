package l;

/* JADX INFO: renamed from: l.ۗ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3080 implements InterfaceC9800 {
    REPLACE(0),
    REPLACE_BZ(1),
    MOVE(2),
    BSDIFF(3),
    SOURCE_COPY(4),
    SOURCE_BSDIFF(5),
    REPLACE_XZ(8),
    ZERO(6),
    DISCARD(7),
    BROTLI_BSDIFF(10),
    PUFFDIFF(9),
    ZUCCHINI(11),
    LZ4DIFF_BSDIFF(12),
    LZ4DIFF_PUFFDIFF(13),
    REPLACE_ZSTD(14);

    public static final int BROTLI_BSDIFF_VALUE = 10;

    @Deprecated
    public static final int BSDIFF_VALUE = 3;
    public static final int DISCARD_VALUE = 7;
    public static final int LZ4DIFF_BSDIFF_VALUE = 12;
    public static final int LZ4DIFF_PUFFDIFF_VALUE = 13;

    @Deprecated
    public static final int MOVE_VALUE = 2;
    public static final int PUFFDIFF_VALUE = 9;
    public static final int REPLACE_BZ_VALUE = 1;
    public static final int REPLACE_VALUE = 0;
    public static final int REPLACE_XZ_VALUE = 8;
    public static final int REPLACE_ZSTD_VALUE = 14;
    public static final int SOURCE_BSDIFF_VALUE = 5;
    public static final int SOURCE_COPY_VALUE = 4;
    public static final EnumC3080[] VALUES;
    public static final int ZERO_VALUE = 6;
    public static final int ZUCCHINI_VALUE = 11;
    public static final InterfaceC17539 internalValueMap;
    public final int value;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC3080.class.getName());
        internalValueMap = new InterfaceC17539() { // from class: l.ۢ۟֨
            /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
            public EnumC3080 m24189findValueByNumber(int i) {
                return EnumC3080.forNumber(i);
            }
        };
        VALUES = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static EnumC3080 valueOf(int i) {
        return forNumber(i);
    }

    public static EnumC3080 forNumber(int i) {
        switch (i) {
            case 0:
                return REPLACE;
            case 1:
                return REPLACE_BZ;
            case 2:
                return MOVE;
            case 3:
                return BSDIFF;
            case 4:
                return SOURCE_COPY;
            case 5:
                return SOURCE_BSDIFF;
            case 6:
                return ZERO;
            case 7:
                return DISCARD;
            case 8:
                return REPLACE_XZ;
            case 9:
                return PUFFDIFF;
            case 10:
                return BROTLI_BSDIFF;
            case 11:
                return ZUCCHINI;
            case 12:
                return LZ4DIFF_BSDIFF;
            case 13:
                return LZ4DIFF_PUFFDIFF;
            case 14:
                return REPLACE_ZSTD;
            default:
                return null;
        }
    }

    public static InterfaceC17539 internalGetValueMap() {
        return internalValueMap;
    }

    public final C21857 getValueDescriptor() {
        return (C21857) getDescriptor().m18886().get(ordinal());
    }

    public final C7040 getDescriptorForType() {
        return getDescriptor();
    }

    public static final C7040 getDescriptor() {
        return (C7040) C4885.getDescriptor().m8532().get(0);
    }

    public static EnumC3080 valueOf(C21857 c21857) {
        if (c21857.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[c21857.m48639()];
    }

    EnumC3080(int i) {
        this.value = i;
    }
}
