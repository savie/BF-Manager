package l;

/* JADX INFO: renamed from: l.ۧᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11797 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C11797 f38104;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f38105;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f38106;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC16733 f38107;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f38108;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public volatile Object f38109;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f38110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38111;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1072 f38112;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC16733 f38113;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f38114;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C11797.class.getName());
        f38104 = new C11797();
        f38105 = new C5832();
    }

    public C11797(C2103 c2103, int i) {
        super(c2103);
        this.f38113 = AbstractC9035.m24122();
        this.f38108 = -1;
        this.f38107 = AbstractC9035.m24122();
        this.f38110 = -1;
        this.f38114 = "";
        this.f38109 = "";
        this.f38112 = C1072.m4023();
        this.f38106 = (byte) -1;
    }

    public C11797() {
        this.f38113 = AbstractC9035.m24122();
        this.f38108 = -1;
        this.f38107 = AbstractC9035.m24122();
        this.f38110 = -1;
        this.f38114 = "";
        this.f38109 = "";
        this.f38112 = C1072.m4023();
        this.f38106 = (byte) -1;
        this.f38113 = AbstractC9035.m24122();
        this.f38107 = AbstractC9035.m24122();
        this.f38114 = "";
        this.f38109 = "";
        this.f38112 = C1072.m4023();
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40280;
        c7544.m20621(C11797.class, C2103.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m29642() {
        return (this.f38111 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m29641() {
        Object obj = this.f38114;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f38114 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m29643() {
        return (this.f38111 & 2) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m29640() {
        Object obj = this.f38109;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f38109 = strM40221;
        }
        return strM40221;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f38106;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f38106 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        getSerializedSize();
        if (this.f38113.size() > 0) {
            abstractC14846.mo14018(10);
            abstractC14846.mo14018(this.f38108);
        }
        for (int i = 0; i < this.f38113.size(); i++) {
            abstractC14846.mo14021(this.f38113.getInt(i));
        }
        if (this.f38107.size() > 0) {
            abstractC14846.mo14018(18);
            abstractC14846.mo14018(this.f38110);
        }
        for (int i2 = 0; i2 < this.f38107.size(); i2++) {
            abstractC14846.mo14021(this.f38107.getInt(i2));
        }
        if ((this.f38111 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 3, this.f38114);
        }
        if ((this.f38111 & 2) != 0) {
            AbstractC9035.m24111(abstractC14846, 4, this.f38109);
        }
        for (int i3 = 0; i3 < this.f38112.size(); i3++) {
            AbstractC9035.m24111(abstractC14846, 6, this.f38112.mo4025(i3));
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35762 = 0;
        for (int i2 = 0; i2 < this.f38113.size(); i2++) {
            iM35762 += AbstractC14846.m35762(this.f38113.getInt(i2));
        }
        int iM35763 = this.f38113.isEmpty() ? iM35762 : AbstractC14846.m35762(iM35762) + iM35762 + 1;
        this.f38108 = iM35762;
        int iM35764 = 0;
        for (int i3 = 0; i3 < this.f38107.size(); i3++) {
            iM35764 += AbstractC14846.m35762(this.f38107.getInt(i3));
        }
        int iM24096 = iM35763 + iM35764;
        if (!this.f38107.isEmpty()) {
            iM24096 = iM24096 + 1 + AbstractC14846.m35762(iM35764);
        }
        this.f38110 = iM35764;
        if ((this.f38111 & 1) != 0) {
            iM24096 += AbstractC9035.m24096(3, this.f38114);
        }
        if ((this.f38111 & 2) != 0) {
            iM24096 += AbstractC9035.m24096(4, this.f38109);
        }
        int iM24117 = 0;
        for (int i4 = 0; i4 < this.f38112.size(); i4++) {
            iM24117 += AbstractC9035.m24117(this.f38112.mo4025(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f38112.size() + iM24096 + iM24117;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11797)) {
            return super.equals(obj);
        }
        C11797 c11797 = (C11797) obj;
        if (!this.f38113.equals(c11797.f38113) || !this.f38107.equals(c11797.f38107) || m29642() != c11797.m29642()) {
            return false;
        }
        if ((!m29642() || m29641().equals(c11797.m29641())) && m29643() == c11797.m29643()) {
            return (!m29643() || m29640().equals(c11797.m29640())) && this.f38112.equals(c11797.f38112) && getUnknownFields().equals(c11797.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40256.hashCode() + 779;
        if (this.f38113.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + this.f38113.hashCode();
        }
        if (this.f38107.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f38107.hashCode();
        }
        if (m29642()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + m29641().hashCode();
        }
        if (m29643()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + m29640().hashCode();
        }
        if (this.f38112.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + this.f38112.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C2103 newBuilder() {
        return f38104.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f38104.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f38104.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C2103 toBuilder() {
        int i = 0;
        if (this == f38104) {
            return new C2103(i);
        }
        C2103 c2103 = new C2103(i);
        c2103.m7278(this);
        return c2103;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C2103(interfaceC7937, 0);
    }

    public static C11797 getDefaultInstance() {
        return f38104;
    }

    public static InterfaceC11490 parser() {
        return f38105;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f38105;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f38104;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f38104;
    }
}
