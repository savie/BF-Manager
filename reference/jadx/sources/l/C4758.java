package l;

/* JADX INFO: renamed from: l.ۙ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4758 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f16709;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C4758 f16710;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f16711;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f16712;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16713;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f16714;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f16715;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f16716;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C4758.class.getName());
        f16710 = new C4758();
        f16709 = new C6777();
    }

    public C4758(C13488 c13488, int i) {
        super(c13488);
        this.f16711 = 0;
        this.f16714 = 0;
        this.f16716 = "";
        this.f16712 = 0;
        this.f16715 = (byte) -1;
    }

    public C4758() {
        this.f16711 = 0;
        this.f16714 = 0;
        this.f16716 = "";
        this.f16712 = 0;
        this.f16715 = (byte) -1;
        this.f16711 = 0;
        this.f16714 = 0;
        this.f16716 = "";
        this.f16712 = 0;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40278;
        c7544.m20621(C4758.class, C13488.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m14680() {
        return (this.f16713 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC5810 m14679() {
        EnumC5810 enumC5810M16936 = EnumC5810.m16936(this.f16711);
        return enumC5810M16936 == null ? EnumC5810.EDITION_UNKNOWN : enumC5810M16936;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m14682() {
        return (this.f16713 & 2) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC5810 m14677() {
        EnumC5810 enumC5810M16936 = EnumC5810.m16936(this.f16714);
        return enumC5810M16936 == null ? EnumC5810.EDITION_UNKNOWN : enumC5810M16936;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m14681() {
        return (this.f16713 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m14678() {
        Object obj = this.f16716;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f16716 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m14683() {
        return (this.f16713 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC5810 m14684() {
        EnumC5810 enumC5810M16936 = EnumC5810.m16936(this.f16712);
        return enumC5810M16936 == null ? EnumC5810.EDITION_UNKNOWN : enumC5810M16936;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f16715;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f16715 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f16713 & 1) != 0) {
            abstractC14846.mo14022(1, this.f16711);
        }
        if ((this.f16713 & 2) != 0) {
            abstractC14846.mo14022(2, this.f16714);
        }
        if ((this.f16713 & 4) != 0) {
            AbstractC9035.m24111(abstractC14846, 3, this.f16716);
        }
        if ((this.f16713 & 8) != 0) {
            abstractC14846.mo14022(4, this.f16712);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35768 = (this.f16713 & 1) != 0 ? AbstractC14846.m35768(1, this.f16711) : 0;
        if ((this.f16713 & 2) != 0) {
            iM35768 += AbstractC14846.m35768(2, this.f16714);
        }
        if ((this.f16713 & 4) != 0) {
            iM35768 += AbstractC9035.m24096(3, this.f16716);
        }
        if ((this.f16713 & 8) != 0) {
            iM35768 += AbstractC14846.m35768(4, this.f16712);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35768;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4758)) {
            return super.equals(obj);
        }
        C4758 c4758 = (C4758) obj;
        if (m14680() != c4758.m14680()) {
            return false;
        }
        if ((m14680() && this.f16711 != c4758.f16711) || m14682() != c4758.m14682()) {
            return false;
        }
        if ((m14682() && this.f16714 != c4758.f16714) || m14681() != c4758.m14681()) {
            return false;
        }
        if ((!m14681() || m14678().equals(c4758.m14678())) && m14683() == c4758.m14683()) {
            return (!m14683() || this.f16712 == c4758.f16712) && getUnknownFields().equals(c4758.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40263.hashCode() + 779;
        if (m14680()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + this.f16711;
        }
        if (m14682()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f16714;
        }
        if (m14681()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + m14678().hashCode();
        }
        if (m14683()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + this.f16712;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C13488 newBuilder() {
        return f16710.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f16710.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f16710.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C13488 toBuilder() {
        int i = 0;
        if (this == f16710) {
            return new C13488(i);
        }
        C13488 c13488 = new C13488(i);
        c13488.m33167(this);
        return c13488;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C13488(interfaceC7937, 0);
    }

    public static C4758 getDefaultInstance() {
        return f16710;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f16709;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f16710;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f16710;
    }
}
