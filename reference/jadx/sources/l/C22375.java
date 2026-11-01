package l;

/* JADX INFO: renamed from: l.᩹ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22375 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f73052;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C22375 f73053;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile Object f73054;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile Object f73055;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f73056;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile Object f73057;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f73058;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f73059;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23081 f73060;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f73061;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C22375.class.getName());
        f73053 = new C22375();
        f73052 = new C2618();
    }

    public C22375(C5441 c5441, int i) {
        super(c5441);
        this.f73057 = "";
        this.f73054 = "";
        this.f73055 = "";
        this.f73061 = false;
        this.f73056 = false;
        this.f73059 = (byte) -1;
    }

    public C22375() {
        this.f73057 = "";
        this.f73054 = "";
        this.f73055 = "";
        this.f73061 = false;
        this.f73056 = false;
        this.f73059 = (byte) -1;
        this.f73057 = "";
        this.f73054 = "";
        this.f73055 = "";
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46282;
        c6956.m18696(C22375.class, C5441.class);
        return c6956;
    }

    public final boolean hasName() {
        return (this.f73058 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f73057;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f73057 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m49623() {
        return (this.f73058 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m49618() {
        Object obj = this.f73054;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f73054 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m49620() {
        return (this.f73058 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m49627() {
        Object obj = this.f73055;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f73055 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m49624() {
        return (this.f73058 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23081 m49619() {
        C23081 c23081 = this.f73060;
        return c23081 == null ? C23081.getDefaultInstance() : c23081;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m49626() {
        return (this.f73058 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m49621() {
        return this.f73061;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m49625() {
        return (this.f73058 & 32) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m49622() {
        return this.f73056;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f73059;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m49624() && !m49619().isInitialized()) {
            this.f73059 = (byte) 0;
            return false;
        }
        this.f73059 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f73058 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.f73057);
        }
        if ((this.f73058 & 2) != 0) {
            AbstractC18245.m42405(abstractC22044, 2, this.f73054);
        }
        if ((this.f73058 & 4) != 0) {
            AbstractC18245.m42405(abstractC22044, 3, this.f73055);
        }
        if ((this.f73058 & 8) != 0) {
            abstractC22044.mo14254(4, m49619());
        }
        if ((this.f73058 & 16) != 0) {
            abstractC22044.mo14240(5, this.f73061);
        }
        if ((this.f73058 & 32) != 0) {
            abstractC22044.mo14240(6, this.f73056);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.f73058 & 1) != 0 ? AbstractC18245.m42390(1, this.f73057) : 0;
        if ((this.f73058 & 2) != 0) {
            iM42390 += AbstractC18245.m42390(2, this.f73054);
        }
        if ((this.f73058 & 4) != 0) {
            iM42390 += AbstractC18245.m42390(3, this.f73055);
        }
        if ((this.f73058 & 8) != 0) {
            iM42390 += AbstractC22044.m48963(4, m49619());
        }
        if ((this.f73058 & 16) != 0) {
            iM42390 += AbstractC22044.m48961(5);
        }
        if ((this.f73058 & 32) != 0) {
            iM42390 += AbstractC22044.m48961(6);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM42390;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22375)) {
            return super.equals(obj);
        }
        C22375 c22375 = (C22375) obj;
        if (hasName() != c22375.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c22375.getName())) || m49623() != c22375.m49623()) {
            return false;
        }
        if ((m49623() && !m49618().equals(c22375.m49618())) || m49620() != c22375.m49620()) {
            return false;
        }
        if ((m49620() && !m49627().equals(c22375.m49627())) || m49624() != c22375.m49624()) {
            return false;
        }
        if ((m49624() && !m49619().equals(c22375.m49619())) || m49626() != c22375.m49626()) {
            return false;
        }
        if ((!m49626() || this.f73061 == c22375.f73061) && m49625() == c22375.m49625()) {
            return (!m49625() || this.f73056 == c22375.f73056) && getUnknownFields().equals(c22375.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46274.hashCode() + 779;
        if (hasName()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m49623()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + m49618().hashCode();
        }
        if (m49620()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + m49627().hashCode();
        }
        if (m49624()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + m49619().hashCode();
        }
        if (m49626()) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + C9779.m24888(this.f73061);
        }
        if (m49625()) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + C9779.m24888(this.f73056);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C5441 newBuilder() {
        return f73053.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f73053.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f73053.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C5441 toBuilder() {
        int i = 0;
        if (this == f73053) {
            return new C5441(i);
        }
        C5441 c5441 = new C5441(i);
        c5441.m15044(this);
        return c5441;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C5441(interfaceC6790, 0);
    }

    public static C22375 getDefaultInstance() {
        return f73053;
    }

    public static InterfaceC6271 parser() {
        return f73052;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f73052;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f73053;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f73053;
    }
}
