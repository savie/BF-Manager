package l;

/* JADX INFO: renamed from: l.۟ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7227 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f24072;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C7227 f24073;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f24074;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f24075;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f24076;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18599 f24077;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24078;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C7227.class.getName());
        f24073 = new C7227();
        f24072 = new C8639();
    }

    public C7227(C10050 c10050, int i) {
        super(c10050);
        this.f24075 = 0;
        this.f24078 = 0;
        this.f24074 = (byte) -1;
    }

    public C7227() {
        this.f24075 = 0;
        this.f24078 = 0;
        this.f24074 = (byte) -1;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46270;
        c6956.m18696(C7227.class, C10050.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m19257() {
        return (this.f24076 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m19254() {
        return this.f24075;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m19258() {
        return (this.f24076 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m19255() {
        return this.f24078;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m19256() {
        return (this.f24076 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C18599 m19253() {
        C18599 c18599 = this.f24077;
        return c18599 == null ? C18599.getDefaultInstance() : c18599;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f24074;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m19256() && !m19253().isInitialized()) {
            this.f24074 = (byte) 0;
            return false;
        }
        this.f24074 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f24076 & 1) != 0) {
            abstractC22044.mo14252(1, this.f24075);
        }
        if ((this.f24076 & 2) != 0) {
            abstractC22044.mo14252(2, this.f24078);
        }
        if ((this.f24076 & 4) != 0) {
            abstractC22044.mo14254(3, m19253());
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48974 = (this.f24076 & 1) != 0 ? AbstractC22044.m48974(1, this.f24075) : 0;
        if ((this.f24076 & 2) != 0) {
            iM48974 += AbstractC22044.m48974(2, this.f24078);
        }
        if ((this.f24076 & 4) != 0) {
            iM48974 += AbstractC22044.m48963(3, m19253());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48974;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7227)) {
            return super.equals(obj);
        }
        C7227 c7227 = (C7227) obj;
        if (m19257() != c7227.m19257()) {
            return false;
        }
        if ((m19257() && this.f24075 != c7227.f24075) || m19258() != c7227.m19258()) {
            return false;
        }
        if ((!m19258() || this.f24078 == c7227.f24078) && m19256() == c7227.m19256()) {
            return (!m19256() || m19253().equals(c7227.m19253())) && getUnknownFields().equals(c7227.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46293.hashCode() + 779;
        if (m19257()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.f24075;
        }
        if (m19258()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f24078;
        }
        if (m19256()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + m19253().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C10050 newBuilder() {
        return f24073.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f24073.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f24073.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C10050 toBuilder() {
        int i = 0;
        if (this == f24073) {
            return new C10050(i);
        }
        C10050 c10050 = new C10050(i);
        c10050.m25443(this);
        return c10050;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C10050(interfaceC6790, 0);
    }

    public static C7227 getDefaultInstance() {
        return f24073;
    }

    public static InterfaceC6271 parser() {
        return f24072;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f24072;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f24073;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f24073;
    }
}
