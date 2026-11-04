package l;

/* JADX INFO: renamed from: l.ۗᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3594 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C3594 f12289;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f12290;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile Object f12291;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f12292;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f12293;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f12294;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C3594.class.getName());
        f12289 = new C3594();
        f12290 = new C16272();
    }

    public C3594(C23732 c23732, int i) {
        super(c23732);
        this.f12291 = "";
        this.f12294 = false;
        this.f12293 = (byte) -1;
    }

    public C3594() {
        this.f12291 = "";
        this.f12294 = false;
        this.f12293 = (byte) -1;
        this.f12291 = "";
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40265;
        c7544.m20621(C3594.class, C23732.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m11654() {
        return (this.f12292 & 1) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m11651() {
        Object obj = this.f12291;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f12291 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11653() {
        return (this.f12292 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m11652() {
        return this.f12294;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f12293;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m11654()) {
            this.f12293 = (byte) 0;
            return false;
        }
        if (!m11653()) {
            this.f12293 = (byte) 0;
            return false;
        }
        this.f12293 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f12292 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.f12291);
        }
        if ((this.f12292 & 2) != 0) {
            abstractC14846.mo14010(2, this.f12294);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.f12292 & 1) != 0 ? AbstractC9035.m24096(1, this.f12291) : 0;
        if ((this.f12292 & 2) != 0) {
            iM24096 += AbstractC14846.m35772(2);
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
        if (!(obj instanceof C3594)) {
            return super.equals(obj);
        }
        C3594 c3594 = (C3594) obj;
        if (m11654() != c3594.m11654()) {
            return false;
        }
        if ((!m11654() || m11651().equals(c3594.m11651())) && m11653() == c3594.m11653()) {
            return (!m11653() || this.f12294 == c3594.f12294) && getUnknownFields().equals(c3594.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40248.hashCode() + 779;
        if (m11654()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + m11651().hashCode();
        }
        if (m11653()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + C23447.m52661(this.f12294);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C23732 newBuilder() {
        return f12289.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f12289.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f12289.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C23732 toBuilder() {
        int i = 0;
        if (this == f12289) {
            return new C23732(i);
        }
        C23732 c23732 = new C23732(i);
        c23732.m52998(this);
        return c23732;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C23732(interfaceC7937, 0);
    }

    public static C3594 getDefaultInstance() {
        return f12289;
    }

    public static InterfaceC11490 parser() {
        return f12290;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f12290;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f12289;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f12289;
    }
}
