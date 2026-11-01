package l;

/* JADX INFO: renamed from: l.ܶۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15072 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C15072 f49128;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f49129;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f49130;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile Object f49131;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f49132;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f49133;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f49134;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f49135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f49136;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C15072.class.getName());
        f49128 = new C15072();
        f49129 = new C6604();
    }

    public C15072(C22833 c22833, int i) {
        super(c22833);
        this.f49134 = 0;
        this.f49136 = "";
        this.f49131 = "";
        this.f49135 = false;
        this.f49132 = false;
        this.f49130 = (byte) -1;
    }

    public C15072() {
        this.f49134 = 0;
        this.f49136 = "";
        this.f49131 = "";
        this.f49135 = false;
        this.f49132 = false;
        this.f49130 = (byte) -1;
        this.f49136 = "";
        this.f49131 = "";
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46283;
        c6956.m18696(C15072.class, C22833.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m36127() {
        return (this.f49133 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m36121() {
        return this.f49134;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m36124() {
        return (this.f49133 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m36123() {
        Object obj = this.f49136;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f49136 = strM52260;
        }
        return strM52260;
    }

    public final boolean hasType() {
        return (this.f49133 & 4) != 0;
    }

    public final String getType() {
        Object obj = this.f49131;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f49131 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m36126() {
        return (this.f49133 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m36128() {
        return this.f49135;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m36125() {
        return (this.f49133 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m36122() {
        return this.f49132;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f49130;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f49130 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f49133 & 1) != 0) {
            abstractC22044.mo14252(1, this.f49134);
        }
        if ((this.f49133 & 2) != 0) {
            AbstractC18245.m42405(abstractC22044, 2, this.f49136);
        }
        if ((this.f49133 & 4) != 0) {
            AbstractC18245.m42405(abstractC22044, 3, this.f49131);
        }
        if ((this.f49133 & 8) != 0) {
            abstractC22044.mo14240(5, this.f49135);
        }
        if ((this.f49133 & 16) != 0) {
            abstractC22044.mo14240(6, this.f49132);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48974 = (this.f49133 & 1) != 0 ? AbstractC22044.m48974(1, this.f49134) : 0;
        if ((this.f49133 & 2) != 0) {
            iM48974 += AbstractC18245.m42390(2, this.f49136);
        }
        if ((this.f49133 & 4) != 0) {
            iM48974 += AbstractC18245.m42390(3, this.f49131);
        }
        if ((this.f49133 & 8) != 0) {
            iM48974 += AbstractC22044.m48961(5);
        }
        if ((this.f49133 & 16) != 0) {
            iM48974 += AbstractC22044.m48961(6);
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
        if (!(obj instanceof C15072)) {
            return super.equals(obj);
        }
        C15072 c15072 = (C15072) obj;
        if (m36127() != c15072.m36127()) {
            return false;
        }
        if ((m36127() && this.f49134 != c15072.f49134) || m36124() != c15072.m36124()) {
            return false;
        }
        if ((m36124() && !m36123().equals(c15072.m36123())) || hasType() != c15072.hasType()) {
            return false;
        }
        if ((hasType() && !getType().equals(c15072.getType())) || m36126() != c15072.m36126()) {
            return false;
        }
        if ((!m36126() || this.f49135 == c15072.f49135) && m36125() == c15072.m36125()) {
            return (!m36125() || this.f49132 == c15072.f49132) && getUnknownFields().equals(c15072.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46290.hashCode() + 779;
        if (m36127()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.f49134;
        }
        if (m36124()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + m36123().hashCode();
        }
        if (hasType()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + getType().hashCode();
        }
        if (m36126()) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + C9779.m24888(this.f49135);
        }
        if (m36125()) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + C9779.m24888(this.f49132);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C22833 newBuilder() {
        return f49128.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f49128.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f49128.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C22833 toBuilder() {
        int i = 0;
        if (this == f49128) {
            return new C22833(i);
        }
        C22833 c22833 = new C22833(i);
        c22833.m50574(this);
        return c22833;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C22833(interfaceC6790, 0);
    }

    public static C15072 getDefaultInstance() {
        return f49128;
    }

    public static InterfaceC6271 parser() {
        return f49129;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f49129;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f49128;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f49128;
    }
}
