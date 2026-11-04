package l;

/* JADX INFO: renamed from: l.۬֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC13506 implements InterfaceC23425 {
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
    public static final EnumC13506[] VALUES;
    public static final int ZERO_VALUE = 6;
    public static final int ZUCCHINI_VALUE = 11;
    public static final InterfaceC1818 internalValueMap;
    public final int value;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC13506.class.getName());
        internalValueMap = new InterfaceC1818() { // from class: l.ۜ֨۫
            public EnumC13506 findValueByNumber(int i) {
                return EnumC13506.forNumber(i);
            }
        };
        VALUES = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static EnumC13506 valueOf(int i) {
        return forNumber(i);
    }

    public static EnumC13506 forNumber(int i) {
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

    public static InterfaceC1818 internalGetValueMap() {
        return internalValueMap;
    }

    public final C1357 getValueDescriptor() {
        return (C1357) getDescriptor().m21965().get(ordinal());
    }

    public final C8069 getDescriptorForType() {
        return getDescriptor();
    }

    public static final C8069 getDescriptor() {
        return (C8069) C4797.getDescriptor().m54743().get(0);
    }

    public static EnumC13506 valueOf(C1357 c1357) {
        if (c1357.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[c1357.m5001()];
    }

    EnumC13506(int i) {
        this.value = i;
    }
}
