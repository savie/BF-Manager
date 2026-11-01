package l;

/* JADX INFO: renamed from: l.֨۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0963 implements InterfaceC9800 {
    COW_COPY(0),
    COW_XOR(1),
    COW_REPLACE(2);

    public static final int COW_COPY_VALUE = 0;
    public static final int COW_REPLACE_VALUE = 2;
    public static final int COW_XOR_VALUE = 1;
    public static final EnumC0963[] VALUES;
    public static final InterfaceC17539 internalValueMap;
    public final int value;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC0963.class.getName());
        internalValueMap = new InterfaceC17539() { // from class: l.᩹۟֨
            /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
            public EnumC0963 m49092findValueByNumber(int i) {
                return EnumC0963.forNumber(i);
            }
        };
        VALUES = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static EnumC0963 valueOf(int i) {
        return forNumber(i);
    }

    public static EnumC0963 forNumber(int i) {
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
        return (C7040) C12959.getDescriptor().m8532().get(0);
    }

    public static EnumC0963 valueOf(C21857 c21857) {
        if (c21857.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[c21857.m48639()];
    }

    EnumC0963(int i) {
        this.value = i;
    }
}
