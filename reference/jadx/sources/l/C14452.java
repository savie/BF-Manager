package l;

/* JADX INFO: renamed from: l.ܰ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14452 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f45469;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C14452 f45470;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f45471;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f45472;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile Object f45473;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile Object f45474;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f45475;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile Object f45476;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C18928 f45477;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f45478;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C14452.class.getName());
        f45470 = new C14452();
        f45469 = new C24150();
    }

    public C14452(C4012 c4012, int i) {
        super(c4012);
        this.f45473 = "";
        this.f45476 = "";
        this.f45474 = "";
        this.f45478 = false;
        this.f45472 = false;
        this.f45471 = (byte) -1;
    }

    public C14452() {
        this.f45473 = "";
        this.f45476 = "";
        this.f45474 = "";
        this.f45478 = false;
        this.f45472 = false;
        this.f45471 = (byte) -1;
        this.f45473 = "";
        this.f45476 = "";
        this.f45474 = "";
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40273;
        c7544.m20621(C14452.class, C4012.class);
        return c7544;
    }

    public final boolean hasName() {
        return (this.f45475 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f45473;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f45473 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m34900() {
        return (this.f45475 & 2) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m34896() {
        Object obj = this.f45476;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f45476 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m34897() {
        return (this.f45475 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m34905() {
        Object obj = this.f45474;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f45474 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m34904() {
        return (this.f45475 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18928 m34899() {
        C18928 c18928 = this.f45477;
        return c18928 == null ? C18928.getDefaultInstance() : c18928;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m34902() {
        return (this.f45475 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m34898() {
        return this.f45478;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m34903() {
        return (this.f45475 & 32) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m34901() {
        return this.f45472;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f45471;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m34904() && !m34899().isInitialized()) {
            this.f45471 = (byte) 0;
            return false;
        }
        this.f45471 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f45475 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.f45473);
        }
        if ((this.f45475 & 2) != 0) {
            AbstractC9035.m24111(abstractC14846, 2, this.f45476);
        }
        if ((this.f45475 & 4) != 0) {
            AbstractC9035.m24111(abstractC14846, 3, this.f45474);
        }
        if ((this.f45475 & 8) != 0) {
            abstractC14846.mo14025(4, m34899());
        }
        if ((this.f45475 & 16) != 0) {
            abstractC14846.mo14010(5, this.f45478);
        }
        if ((this.f45475 & 32) != 0) {
            abstractC14846.mo14010(6, this.f45472);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.f45475 & 1) != 0 ? AbstractC9035.m24096(1, this.f45473) : 0;
        if ((this.f45475 & 2) != 0) {
            iM24096 += AbstractC9035.m24096(2, this.f45476);
        }
        if ((this.f45475 & 4) != 0) {
            iM24096 += AbstractC9035.m24096(3, this.f45474);
        }
        if ((this.f45475 & 8) != 0) {
            iM24096 += AbstractC14846.m35774(4, m34899());
        }
        if ((this.f45475 & 16) != 0) {
            iM24096 += AbstractC14846.m35772(5);
        }
        if ((this.f45475 & 32) != 0) {
            iM24096 += AbstractC14846.m35772(6);
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
        if (!(obj instanceof C14452)) {
            return super.equals(obj);
        }
        C14452 c14452 = (C14452) obj;
        if (hasName() != c14452.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c14452.getName())) || m34900() != c14452.m34900()) {
            return false;
        }
        if ((m34900() && !m34896().equals(c14452.m34896())) || m34897() != c14452.m34897()) {
            return false;
        }
        if ((m34897() && !m34905().equals(c14452.m34905())) || m34904() != c14452.m34904()) {
            return false;
        }
        if ((m34904() && !m34899().equals(c14452.m34899())) || m34902() != c14452.m34902()) {
            return false;
        }
        if ((!m34902() || this.f45478 == c14452.f45478) && m34903() == c14452.m34903()) {
            return (!m34903() || this.f45472 == c14452.f45472) && getUnknownFields().equals(c14452.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40251.hashCode() + 779;
        if (hasName()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m34900()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + m34896().hashCode();
        }
        if (m34897()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + m34905().hashCode();
        }
        if (m34904()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + m34899().hashCode();
        }
        if (m34902()) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + C23447.m52661(this.f45478);
        }
        if (m34903()) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + C23447.m52661(this.f45472);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C4012 newBuilder() {
        return f45470.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f45470.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f45470.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C4012 toBuilder() {
        int i = 0;
        if (this == f45470) {
            return new C4012(i);
        }
        C4012 c4012 = new C4012(i);
        c4012.m12975(this);
        return c4012;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C4012(interfaceC7937, 0);
    }

    public static C14452 getDefaultInstance() {
        return f45470;
    }

    public static InterfaceC11490 parser() {
        return f45469;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f45469;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f45470;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f45470;
    }
}
