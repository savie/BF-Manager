package l;

/* JADX INFO: renamed from: l.ۡ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9231 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C9231 f30065;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f30066;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6995 f30067;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f30068;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile Object f30069;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f30070;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C9231.class.getName());
        f30065 = new C9231();
        f30066 = new C9977();
    }

    public C9231(C1029 c1029, int i) {
        super(c1029);
        this.f30069 = "";
        this.f30070 = (byte) -1;
    }

    public C9231() {
        this.f30069 = "";
        this.f30070 = (byte) -1;
        this.f30069 = "";
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40284;
        c7544.m20621(C9231.class, C1029.class);
        return c7544;
    }

    public final boolean hasName() {
        return (this.f30068 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f30069;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f30069 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24420() {
        return (this.f30068 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6995 m24421() {
        C6995 c6995 = this.f30067;
        return c6995 == null ? C6995.getDefaultInstance() : c6995;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f30070;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m24420() && !m24421().isInitialized()) {
            this.f30070 = (byte) 0;
            return false;
        }
        this.f30070 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f30068 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.f30069);
        }
        if ((this.f30068 & 2) != 0) {
            abstractC14846.mo14025(2, m24421());
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.f30068 & 1) != 0 ? AbstractC9035.m24096(1, this.f30069) : 0;
        if ((this.f30068 & 2) != 0) {
            iM24096 += AbstractC14846.m35774(2, m24421());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM24096;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9231)) {
            return super.equals(obj);
        }
        C9231 c9231 = (C9231) obj;
        if (hasName() != c9231.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c9231.getName())) && m24420() == c9231.m24420()) {
            return (!m24420() || m24421().equals(c9231.m24421())) && getUnknownFields().equals(c9231.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40288.hashCode() + 779;
        if (hasName()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m24420()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + m24421().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C1029 newBuilder() {
        return f30065.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f30065.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f30065.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C1029 toBuilder() {
        int i = 0;
        if (this == f30065) {
            return new C1029(i);
        }
        C1029 c1029 = new C1029(i);
        c1029.m3938(this);
        return c1029;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C1029(interfaceC7937, 0);
    }

    public static C9231 getDefaultInstance() {
        return f30065;
    }

    public static InterfaceC11490 parser() {
        return f30066;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f30066;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f30065;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f30065;
    }
}
