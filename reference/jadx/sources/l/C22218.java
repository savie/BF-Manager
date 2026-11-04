package l;

/* JADX INFO: renamed from: l.᩷ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22218 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f71564;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C22218 f71565;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C2826 f71566;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f71567;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f71568;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f71569;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f71570;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C22218.class.getName());
        f71565 = new C22218();
        f71564 = new C14100();
    }

    public C22218(C5064 c5064, int i) {
        super(c5064);
        this.f71567 = 0;
        this.f71570 = 0;
        this.f71569 = (byte) -1;
    }

    public C22218() {
        this.f71567 = 0;
        this.f71570 = 0;
        this.f71569 = (byte) -1;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40301;
        c7544.m20621(C22218.class, C5064.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m50250() {
        return (this.f71568 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50248() {
        return this.f71567;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m50251() {
        return (this.f71568 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m50247() {
        return this.f71570;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m50249() {
        return (this.f71568 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2826 m50246() {
        C2826 c2826 = this.f71566;
        return c2826 == null ? C2826.getDefaultInstance() : c2826;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f71569;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m50249() && !m50246().isInitialized()) {
            this.f71569 = (byte) 0;
            return false;
        }
        this.f71569 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f71568 & 1) != 0) {
            abstractC14846.mo14022(1, this.f71567);
        }
        if ((this.f71568 & 2) != 0) {
            abstractC14846.mo14022(2, this.f71570);
        }
        if ((this.f71568 & 4) != 0) {
            abstractC14846.mo14025(3, m50246());
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35766 = (this.f71568 & 1) != 0 ? AbstractC14846.m35766(1, this.f71567) : 0;
        if ((this.f71568 & 2) != 0) {
            iM35766 += AbstractC14846.m35766(2, this.f71570);
        }
        if ((this.f71568 & 4) != 0) {
            iM35766 += AbstractC14846.m35774(3, m50246());
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
        if (!(obj instanceof C22218)) {
            return super.equals(obj);
        }
        C22218 c22218 = (C22218) obj;
        if (m50250() != c22218.m50250()) {
            return false;
        }
        if ((m50250() && this.f71567 != c22218.f71567) || m50251() != c22218.m50251()) {
            return false;
        }
        if ((!m50251() || this.f71570 == c22218.f71570) && m50249() == c22218.m50249()) {
            return (!m50249() || m50246().equals(c22218.m50246())) && getUnknownFields().equals(c22218.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40270.hashCode() + 779;
        if (m50250()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + this.f71567;
        }
        if (m50251()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f71570;
        }
        if (m50249()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + m50246().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C5064 newBuilder() {
        return f71565.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f71565.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f71565.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C5064 toBuilder() {
        int i = 0;
        if (this == f71565) {
            return new C5064(i);
        }
        C5064 c5064 = new C5064(i);
        c5064.m15325(this);
        return c5064;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C5064(interfaceC7937, 0);
    }

    public static C22218 getDefaultInstance() {
        return f71565;
    }

    public static InterfaceC11490 parser() {
        return f71564;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f71564;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f71565;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f71565;
    }
}
