package l;

/* JADX INFO: renamed from: l.᩵֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20201 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f64846;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C20201 f64847;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f64848;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C16471 f64849;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f64850;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C16471 f64851;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f64852;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C20201.class.getName());
        f64847 = new C20201();
        f64846 = new C23185();
    }

    public C20201(C3047 c3047, int i) {
        super(c3047);
        this.f64852 = 0;
        this.f64848 = (byte) -1;
    }

    public C20201() {
        this.f64848 = (byte) -1;
        this.f64852 = 0;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40289;
        c7544.m20621(C20201.class, C3047.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m46467() {
        return (this.f64850 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC5810 m46463() {
        EnumC5810 enumC5810M16936 = EnumC5810.m16936(this.f64852);
        return enumC5810M16936 == null ? EnumC5810.EDITION_UNKNOWN : enumC5810M16936;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m46466() {
        return (this.f64850 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16471 m46464() {
        C16471 c16471 = this.f64849;
        return c16471 == null ? C16471.getDefaultInstance() : c16471;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m46465() {
        return (this.f64850 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16471 m46462() {
        C16471 c16471 = this.f64851;
        return c16471 == null ? C16471.getDefaultInstance() : c16471;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f64848;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m46466() && !m46464().isInitialized()) {
            this.f64848 = (byte) 0;
            return false;
        }
        if (m46465() && !m46462().isInitialized()) {
            this.f64848 = (byte) 0;
            return false;
        }
        this.f64848 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f64850 & 1) != 0) {
            abstractC14846.mo14022(3, this.f64852);
        }
        if ((this.f64850 & 2) != 0) {
            abstractC14846.mo14025(4, m46464());
        }
        if ((this.f64850 & 4) != 0) {
            abstractC14846.mo14025(5, m46462());
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35768 = (this.f64850 & 1) != 0 ? AbstractC14846.m35768(3, this.f64852) : 0;
        if ((this.f64850 & 2) != 0) {
            iM35768 += AbstractC14846.m35774(4, m46464());
        }
        if ((this.f64850 & 4) != 0) {
            iM35768 += AbstractC14846.m35774(5, m46462());
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
        if (!(obj instanceof C20201)) {
            return super.equals(obj);
        }
        C20201 c20201 = (C20201) obj;
        if (m46467() != c20201.m46467()) {
            return false;
        }
        if ((m46467() && this.f64852 != c20201.f64852) || m46466() != c20201.m46466()) {
            return false;
        }
        if ((!m46466() || m46464().equals(c20201.m46464())) && m46465() == c20201.m46465()) {
            return (!m46465() || m46462().equals(c20201.m46462())) && getUnknownFields().equals(c20201.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40297.hashCode() + 779;
        if (m46467()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + this.f64852;
        }
        if (m46466()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + m46464().hashCode();
        }
        if (m46465()) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + m46462().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C3047 newBuilder() {
        return f64847.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f64847.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f64847.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C3047 toBuilder() {
        int i = 0;
        if (this == f64847) {
            return new C3047(i);
        }
        C3047 c3047 = new C3047(i);
        c3047.m9902(this);
        return c3047;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C3047(interfaceC7937, 0);
    }

    public static C20201 getDefaultInstance() {
        return f64847;
    }

    public static InterfaceC11490 parser() {
        return f64846;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f64846;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f64847;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f64847;
    }
}
