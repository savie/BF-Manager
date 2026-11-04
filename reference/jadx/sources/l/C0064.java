package l;

/* JADX INFO: renamed from: l.֡֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0064 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f948 = 0;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f949;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final C0064 f950;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile Object f951;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f952;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C5504 f953;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile Object f954;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f955;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f956;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f957;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile Object f958;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f959;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f960;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile Object f961;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f962;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f963;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C0064.class.getName());
        f950 = new C0064();
        f949 = new C6031();
    }

    public C0064(C23931 c23931, int i) {
        super(c23931);
        this.f958 = "";
        this.f952 = 0;
        this.f955 = 1;
        this.f959 = 1;
        this.f954 = "";
        this.f961 = "";
        this.f963 = "";
        this.f957 = 0;
        this.f951 = "";
        this.f956 = false;
        this.f962 = (byte) -1;
    }

    public C0064() {
        this.f958 = "";
        this.f952 = 0;
        this.f955 = 1;
        this.f959 = 1;
        this.f954 = "";
        this.f961 = "";
        this.f963 = "";
        this.f957 = 0;
        this.f951 = "";
        this.f956 = false;
        this.f962 = (byte) -1;
        this.f958 = "";
        this.f955 = 1;
        this.f959 = 1;
        this.f954 = "";
        this.f961 = "";
        this.f963 = "";
        this.f951 = "";
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40267;
        c7544.m20621(C0064.class, C23931.class);
        return c7544;
    }

    public final boolean hasName() {
        return (this.f960 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f958;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f958 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m1063() {
        return (this.f960 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m1070() {
        return this.f952;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m1076() {
        return (this.f960 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC14233 m1077() {
        EnumC14233 enumC14233M34550 = EnumC14233.m34550(this.f955);
        return enumC14233M34550 == null ? EnumC14233.LABEL_OPTIONAL : enumC14233M34550;
    }

    public final boolean hasType() {
        return (this.f960 & 8) != 0;
    }

    public final EnumC17963 getType() {
        EnumC17963 enumC17963M41916 = EnumC17963.m41916(this.f959);
        return enumC17963M41916 == null ? EnumC17963.TYPE_DOUBLE : enumC17963M41916;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m1060() {
        return (this.f960 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m1062() {
        Object obj = this.f954;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f954 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m1067() {
        return (this.f960 & 32) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m1061() {
        Object obj = this.f961;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f961 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m1073() {
        return (this.f960 & 64) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m1064() {
        Object obj = this.f963;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f963 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m1068() {
        return (this.f960 & 128) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m1071() {
        return this.f957;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m1065() {
        return (this.f960 & 256) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m1066() {
        Object obj = this.f951;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f951 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m1074() {
        return (this.f960 & 512) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C5504 m1069() {
        C5504 c5504 = this.f953;
        return c5504 == null ? C5504.getDefaultInstance() : c5504;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m1072() {
        return (this.f960 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m1075() {
        return this.f956;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f962;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m1074() && !m1069().isInitialized()) {
            this.f962 = (byte) 0;
            return false;
        }
        this.f962 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f960 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.f958);
        }
        if ((this.f960 & 32) != 0) {
            AbstractC9035.m24111(abstractC14846, 2, this.f961);
        }
        if ((this.f960 & 2) != 0) {
            abstractC14846.mo14022(3, this.f952);
        }
        if ((this.f960 & 4) != 0) {
            abstractC14846.mo14022(4, this.f955);
        }
        if ((this.f960 & 8) != 0) {
            abstractC14846.mo14022(5, this.f959);
        }
        if ((this.f960 & 16) != 0) {
            AbstractC9035.m24111(abstractC14846, 6, this.f954);
        }
        if ((this.f960 & 64) != 0) {
            AbstractC9035.m24111(abstractC14846, 7, this.f963);
        }
        if ((this.f960 & 512) != 0) {
            abstractC14846.mo14025(8, m1069());
        }
        if ((this.f960 & 128) != 0) {
            abstractC14846.mo14022(9, this.f957);
        }
        if ((this.f960 & 256) != 0) {
            AbstractC9035.m24111(abstractC14846, 10, this.f951);
        }
        if ((this.f960 & 1024) != 0) {
            abstractC14846.mo14010(17, this.f956);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.f960 & 1) != 0 ? AbstractC9035.m24096(1, this.f958) : 0;
        if ((this.f960 & 32) != 0) {
            iM24096 += AbstractC9035.m24096(2, this.f961);
        }
        if ((this.f960 & 2) != 0) {
            iM24096 += AbstractC14846.m35766(3, this.f952);
        }
        if ((this.f960 & 4) != 0) {
            iM24096 += AbstractC14846.m35768(4, this.f955);
        }
        if ((this.f960 & 8) != 0) {
            iM24096 += AbstractC14846.m35768(5, this.f959);
        }
        if ((this.f960 & 16) != 0) {
            iM24096 += AbstractC9035.m24096(6, this.f954);
        }
        if ((this.f960 & 64) != 0) {
            iM24096 += AbstractC9035.m24096(7, this.f963);
        }
        if ((this.f960 & 512) != 0) {
            iM24096 += AbstractC14846.m35774(8, m1069());
        }
        if ((this.f960 & 128) != 0) {
            iM24096 += AbstractC14846.m35766(9, this.f957);
        }
        if ((this.f960 & 256) != 0) {
            iM24096 += AbstractC9035.m24096(10, this.f951);
        }
        if ((this.f960 & 1024) != 0) {
            iM24096 += AbstractC14846.m35772(17);
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
        if (!(obj instanceof C0064)) {
            return super.equals(obj);
        }
        C0064 c0064 = (C0064) obj;
        if (hasName() != c0064.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c0064.getName())) || m1063() != c0064.m1063()) {
            return false;
        }
        if ((m1063() && this.f952 != c0064.f952) || m1076() != c0064.m1076()) {
            return false;
        }
        if ((m1076() && this.f955 != c0064.f955) || hasType() != c0064.hasType()) {
            return false;
        }
        if ((hasType() && this.f959 != c0064.f959) || m1060() != c0064.m1060()) {
            return false;
        }
        if ((m1060() && !m1062().equals(c0064.m1062())) || m1067() != c0064.m1067()) {
            return false;
        }
        if ((m1067() && !m1061().equals(c0064.m1061())) || m1073() != c0064.m1073()) {
            return false;
        }
        if ((m1073() && !m1064().equals(c0064.m1064())) || m1068() != c0064.m1068()) {
            return false;
        }
        if ((m1068() && this.f957 != c0064.f957) || m1065() != c0064.m1065()) {
            return false;
        }
        if ((m1065() && !m1066().equals(c0064.m1066())) || m1074() != c0064.m1074()) {
            return false;
        }
        if ((!m1074() || m1069().equals(c0064.m1069())) && m1072() == c0064.m1072()) {
            return (!m1072() || this.f956 == c0064.f956) && getUnknownFields().equals(c0064.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40249.hashCode() + 779;
        if (hasName()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m1063()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + this.f952;
        }
        if (m1076()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + this.f955;
        }
        if (hasType()) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + this.f959;
        }
        if (m1060()) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + m1062().hashCode();
        }
        if (m1067()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + m1061().hashCode();
        }
        if (m1073()) {
            iHashCode = C18176.m42345(iHashCode, 37, 7, 53) + m1064().hashCode();
        }
        if (m1068()) {
            iHashCode = C18176.m42345(iHashCode, 37, 9, 53) + this.f957;
        }
        if (m1065()) {
            iHashCode = C18176.m42345(iHashCode, 37, 10, 53) + m1066().hashCode();
        }
        if (m1074()) {
            iHashCode = C18176.m42345(iHashCode, 37, 8, 53) + m1069().hashCode();
        }
        if (m1072()) {
            iHashCode = C18176.m42345(iHashCode, 37, 17, 53) + C23447.m52661(this.f956);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C23931 newBuilder() {
        return f950.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f950.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f950.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C23931 toBuilder() {
        int i = 0;
        if (this == f950) {
            return new C23931(i);
        }
        C23931 c23931 = new C23931(i);
        c23931.m53447(this);
        return c23931;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C23931(interfaceC7937, 0);
    }

    public static C0064 getDefaultInstance() {
        return f950;
    }

    public static InterfaceC11490 parser() {
        return f949;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f949;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f950;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f950;
    }
}
