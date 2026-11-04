package l;

/* JADX INFO: renamed from: l.۠֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8268 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C8268 f27207;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f27208;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile Object f27209;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f27210;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f27211;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f27212;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C8268.class.getName());
        f27207 = new C8268();
        f27208 = new C9013();
    }

    public C8268(C2302 c2302, int i) {
        super(c2302);
        this.f27212 = 0;
        this.f27209 = "";
        this.f27211 = (byte) -1;
    }

    public C8268() {
        this.f27212 = 0;
        this.f27209 = "";
        this.f27211 = (byte) -1;
        this.f27212 = 0;
        this.f27209 = "";
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40266;
        c7544.m20621(C8268.class, C2302.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m22321() {
        return (this.f27210 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC5810 m22320() {
        EnumC5810 enumC5810M16936 = EnumC5810.m16936(this.f27212);
        return enumC5810M16936 == null ? EnumC5810.EDITION_UNKNOWN : enumC5810M16936;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m22322() {
        return (this.f27210 & 2) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m22319() {
        Object obj = this.f27209;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f27209 = strM40221;
        }
        return strM40221;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f27211;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f27211 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f27210 & 2) != 0) {
            AbstractC9035.m24111(abstractC14846, 2, this.f27209);
        }
        if ((this.f27210 & 1) != 0) {
            abstractC14846.mo14022(3, this.f27212);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.f27210 & 2) != 0 ? AbstractC9035.m24096(2, this.f27209) : 0;
        if ((this.f27210 & 1) != 0) {
            iM24096 += AbstractC14846.m35768(3, this.f27212);
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
        if (!(obj instanceof C8268)) {
            return super.equals(obj);
        }
        C8268 c8268 = (C8268) obj;
        if (m22321() != c8268.m22321()) {
            return false;
        }
        if ((!m22321() || this.f27212 == c8268.f27212) && m22322() == c8268.m22322()) {
            return (!m22322() || m22319().equals(c8268.m22319())) && getUnknownFields().equals(c8268.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40252.hashCode() + 779;
        if (m22321()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + this.f27212;
        }
        if (m22322()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + m22319().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C2302 newBuilder() {
        return f27207.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f27207.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f27207.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C2302 toBuilder() {
        int i = 0;
        if (this == f27207) {
            return new C2302(i);
        }
        C2302 c2302 = new C2302(i);
        c2302.m7786(this);
        return c2302;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C2302(interfaceC7937, 0);
    }

    public static C8268 getDefaultInstance() {
        return f27207;
    }

    public static InterfaceC11490 parser() {
        return f27208;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f27208;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f27207;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f27207;
    }
}
