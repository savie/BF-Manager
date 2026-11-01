package l;

/* JADX INFO: renamed from: l.ۤ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10611 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C10611 f36262;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f36263;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f36264;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f36265;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f36266;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f36267;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f36268;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f36269;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C10611.class.getName());
        f36262 = new C10611();
        f36263 = new C19783();
    }

    public C10611(C9200 c9200, int i) {
        super(c9200);
        this.f36267 = 0;
        this.f36264 = 0;
        this.f36269 = "";
        this.f36265 = 0;
        this.f36268 = (byte) -1;
    }

    public C10611() {
        this.f36267 = 0;
        this.f36264 = 0;
        this.f36269 = "";
        this.f36265 = 0;
        this.f36268 = (byte) -1;
        this.f36267 = 0;
        this.f36264 = 0;
        this.f36269 = "";
        this.f36265 = 0;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46272;
        c6956.m18696(C10611.class, C9200.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m26787() {
        return (this.f36266 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC12167 m26784() {
        EnumC12167 enumC12167M30252 = EnumC12167.m30252(this.f36267);
        return enumC12167M30252 == null ? EnumC12167.EDITION_UNKNOWN : enumC12167M30252;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m26789() {
        return (this.f36266 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC12167 m26783() {
        EnumC12167 enumC12167M30252 = EnumC12167.m30252(this.f36264);
        return enumC12167M30252 == null ? EnumC12167.EDITION_UNKNOWN : enumC12167M30252;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m26786() {
        return (this.f36266 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m26785() {
        Object obj = this.f36269;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f36269 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m26788() {
        return (this.f36266 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final EnumC12167 m26790() {
        EnumC12167 enumC12167M30252 = EnumC12167.m30252(this.f36265);
        return enumC12167M30252 == null ? EnumC12167.EDITION_UNKNOWN : enumC12167M30252;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f36268;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f36268 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f36266 & 1) != 0) {
            abstractC22044.mo14252(1, this.f36267);
        }
        if ((this.f36266 & 2) != 0) {
            abstractC22044.mo14252(2, this.f36264);
        }
        if ((this.f36266 & 4) != 0) {
            AbstractC18245.m42405(abstractC22044, 3, this.f36269);
        }
        if ((this.f36266 & 8) != 0) {
            abstractC22044.mo14252(4, this.f36265);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48966 = (this.f36266 & 1) != 0 ? AbstractC22044.m48966(1, this.f36267) : 0;
        if ((this.f36266 & 2) != 0) {
            iM48966 += AbstractC22044.m48966(2, this.f36264);
        }
        if ((this.f36266 & 4) != 0) {
            iM48966 += AbstractC18245.m42390(3, this.f36269);
        }
        if ((this.f36266 & 8) != 0) {
            iM48966 += AbstractC22044.m48966(4, this.f36265);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48966;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10611)) {
            return super.equals(obj);
        }
        C10611 c10611 = (C10611) obj;
        if (m26787() != c10611.m26787()) {
            return false;
        }
        if ((m26787() && this.f36267 != c10611.f36267) || m26789() != c10611.m26789()) {
            return false;
        }
        if ((m26789() && this.f36264 != c10611.f36264) || m26786() != c10611.m26786()) {
            return false;
        }
        if ((!m26786() || m26785().equals(c10611.m26785())) && m26788() == c10611.m26788()) {
            return (!m26788() || this.f36265 == c10611.f36265) && getUnknownFields().equals(c10611.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46289.hashCode() + 779;
        if (m26787()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.f36267;
        }
        if (m26789()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f36264;
        }
        if (m26786()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + m26785().hashCode();
        }
        if (m26788()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + this.f36265;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C9200 newBuilder() {
        return f36262.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f36262.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f36262.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C9200 toBuilder() {
        int i = 0;
        if (this == f36262) {
            return new C9200(i);
        }
        C9200 c9200 = new C9200(i);
        c9200.m23661(this);
        return c9200;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C9200(interfaceC6790, 0);
    }

    public static C10611 getDefaultInstance() {
        return f36262;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f36263;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f36262;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f36262;
    }
}
