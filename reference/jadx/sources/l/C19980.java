package l;

/* JADX INFO: renamed from: l.ᩴܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19980 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C19980 f64195;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f64196;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f64197;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f64198;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f64199;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f64200;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C19980.class.getName());
        f64195 = new C19980();
        f64196 = new C11029();
    }

    public C19980(C22964 c22964, int i) {
        super(c22964);
        this.f64197 = 0;
        this.f64200 = 0;
        this.f64199 = (byte) -1;
    }

    public C19980() {
        this.f64197 = 0;
        this.f64200 = 0;
        this.f64199 = (byte) -1;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40281;
        c7544.m20621(C19980.class, C22964.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m45908() {
        return (this.f64198 & 1) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m45905() {
        return this.f64197;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45907() {
        return (this.f64198 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m45906() {
        return this.f64200;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f64199;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f64199 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f64198 & 1) != 0) {
            abstractC14846.mo14022(1, this.f64197);
        }
        if ((this.f64198 & 2) != 0) {
            abstractC14846.mo14022(2, this.f64200);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35766 = (this.f64198 & 1) != 0 ? AbstractC14846.m35766(1, this.f64197) : 0;
        if ((this.f64198 & 2) != 0) {
            iM35766 += AbstractC14846.m35766(2, this.f64200);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35766;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19980)) {
            return super.equals(obj);
        }
        C19980 c19980 = (C19980) obj;
        if (m45908() != c19980.m45908()) {
            return false;
        }
        if ((!m45908() || this.f64197 == c19980.f64197) && m45907() == c19980.m45907()) {
            return (!m45907() || this.f64200 == c19980.f64200) && getUnknownFields().equals(c19980.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40293.hashCode() + 779;
        if (m45908()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + this.f64197;
        }
        if (m45907()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f64200;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C22964 newBuilder() {
        return f64195.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f64195.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f64195.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C22964 toBuilder() {
        int i = 0;
        if (this == f64195) {
            return new C22964(i);
        }
        C22964 c22964 = new C22964(i);
        c22964.m51821(this);
        return c22964;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C22964(interfaceC7937);
    }

    public static C19980 getDefaultInstance() {
        return f64195;
    }

    public static InterfaceC11490 parser() {
        return f64196;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f64196;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f64195;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f64195;
    }
}
