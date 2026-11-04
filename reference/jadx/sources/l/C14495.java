package l;

/* JADX INFO: renamed from: l.ܰۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U940 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14495 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45608 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f45609;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C14495 f45610;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f45611;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f45612;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f45613;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f45614;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C14495.class.getName());
        f45610 = new C14495();
        f45609 = new C12258();
    }

    public C14495(C6293 c6293, int i) {
        super(c6293);
        this.f45614 = false;
        this.f45611 = 0;
        this.f45613 = (byte) -1;
    }

    public C14495() {
        this.f45614 = false;
        this.f45613 = (byte) -1;
        this.f45611 = 0;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C21209.f67698;
        c7544.m20621(C14495.class, C6293.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m35011() {
        return (this.f45612 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m35010() {
        return this.f45614;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m35012() {
        return (this.f45612 & 2) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC4055 m35009() {
        EnumC4055 enumC4055M13048 = EnumC4055.m13048(this.f45611);
        return enumC4055M13048 == null ? EnumC4055.UTF8_VALIDATION_UNKNOWN : enumC4055M13048;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f45613;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f45613 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f45612 & 1) != 0) {
            abstractC14846.mo14010(1, this.f45614);
        }
        if ((this.f45612 & 2) != 0) {
            abstractC14846.mo14022(2, this.f45611);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35772 = (this.f45612 & 1) != 0 ? AbstractC14846.m35772(1) : 0;
        if ((this.f45612 & 2) != 0) {
            iM35772 += AbstractC14846.m35768(2, this.f45611);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35772;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14495)) {
            return super.equals(obj);
        }
        C14495 c14495 = (C14495) obj;
        if (m35011() != c14495.m35011()) {
            return false;
        }
        if ((!m35011() || this.f45614 == c14495.f45614) && m35012() == c14495.m35012()) {
            return (!m35012() || this.f45611 == c14495.f45611) && getUnknownFields().equals(c14495.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C21209.f67696.hashCode() + 779;
        if (m35011()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + C23447.m52661(this.f45614);
        }
        if (m35012()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f45611;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C6293 newBuilder() {
        return f45610.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f45610.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f45610.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C6293 toBuilder() {
        int i = 0;
        if (this == f45610) {
            return new C6293(i);
        }
        C6293 c6293 = new C6293(i);
        c6293.m17981(this);
        return c6293;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C6293(interfaceC7937, 0);
    }

    public static C14495 getDefaultInstance() {
        return f45610;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f45609;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f45610;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f45610;
    }
}
