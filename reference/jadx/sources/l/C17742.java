package l;

/* JADX INFO: renamed from: l.ܽܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17742 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C17742 f58274;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f58275;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f58276;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f58277;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f58278;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58279;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C17742.class.getName());
        f58274 = new C17742();
        f58275 = new C25202();
    }

    public C17742(C16996 c16996, int i) {
        super(c16996);
        this.f58276 = 0;
        this.f58279 = 0;
        this.f58278 = (byte) -1;
    }

    public C17742() {
        this.f58276 = 0;
        this.f58279 = 0;
        this.f58278 = (byte) -1;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40272;
        c7544.m20621(C17742.class, C16996.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m41552() {
        return (this.f58277 & 1) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41549() {
        return this.f58276;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41551() {
        return (this.f58277 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m41550() {
        return this.f58279;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f58278;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f58278 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f58277 & 1) != 0) {
            abstractC14846.mo14022(1, this.f58276);
        }
        if ((this.f58277 & 2) != 0) {
            abstractC14846.mo14022(2, this.f58279);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35766 = (this.f58277 & 1) != 0 ? AbstractC14846.m35766(1, this.f58276) : 0;
        if ((this.f58277 & 2) != 0) {
            iM35766 += AbstractC14846.m35766(2, this.f58279);
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
        if (!(obj instanceof C17742)) {
            return super.equals(obj);
        }
        C17742 c17742 = (C17742) obj;
        if (m41552() != c17742.m41552()) {
            return false;
        }
        if ((!m41552() || this.f58276 == c17742.f58276) && m41551() == c17742.m41551()) {
            return (!m41551() || this.f58279 == c17742.f58279) && getUnknownFields().equals(c17742.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40250.hashCode() + 779;
        if (m41552()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + this.f58276;
        }
        if (m41551()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f58279;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C16996 newBuilder() {
        return f58274.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f58274.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f58274.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C16996 toBuilder() {
        int i = 0;
        if (this == f58274) {
            return new C16996(i);
        }
        C16996 c16996 = new C16996(i);
        c16996.m40054(this);
        return c16996;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C16996(interfaceC7937);
    }

    public static C17742 getDefaultInstance() {
        return f58274;
    }

    public static InterfaceC11490 parser() {
        return f58275;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f58275;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f58274;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f58274;
    }
}
