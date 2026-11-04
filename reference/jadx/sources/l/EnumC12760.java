package l;

/* JADX INFO: renamed from: l.۫֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC12760 implements InterfaceC23425 {
    COW_COPY(0),
    COW_XOR(1),
    COW_REPLACE(2);

    public static final int COW_COPY_VALUE = 0;
    public static final int COW_REPLACE_VALUE = 2;
    public static final int COW_XOR_VALUE = 1;
    public static final EnumC12760[] VALUES;
    public static final InterfaceC1818 internalValueMap;
    public final int value;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC12760.class.getName());
        internalValueMap = new InterfaceC1818() { // from class: l.ܳ֨۫
            public EnumC12760 findValueByNumber(int i) {
                return EnumC12760.forNumber(i);
            }
        };
        VALUES = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static EnumC12760 valueOf(int i) {
        return forNumber(i);
    }

    public static EnumC12760 forNumber(int i) {
        if (i == 0) {
            return COW_COPY;
        }
        if (i == 1) {
            return COW_XOR;
        }
        if (i != 2) {
            return null;
        }
        return COW_REPLACE;
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
        return (C8069) C5303.getDescriptor().m54743().get(0);
    }

    public static EnumC12760 valueOf(C1357 c1357) {
        if (c1357.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[c1357.m5001()];
    }

    EnumC12760(int i) {
        this.value = i;
    }
}
