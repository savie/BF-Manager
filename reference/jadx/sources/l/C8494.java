package l;

/* JADX INFO: renamed from: l.۠᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8494 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C8494 f29435;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f29436;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f29437;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f29438;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile Object f29439;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f29440;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C8494.class.getName());
        f29435 = new C8494();
        f29436 = new C18371();
    }

    public C8494(C19077 c19077, int i) {
        super(c19077);
        this.f29440 = 0;
        this.f29439 = "";
        this.f29437 = (byte) -1;
    }

    public C8494() {
        this.f29440 = 0;
        this.f29439 = "";
        this.f29437 = (byte) -1;
        this.f29440 = 0;
        this.f29439 = "";
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46269;
        c6956.m18696(C8494.class, C19077.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m22197() {
        return (this.f29438 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC12167 m22198() {
        EnumC12167 enumC12167M30252 = EnumC12167.m30252(this.f29440);
        return enumC12167M30252 == null ? EnumC12167.EDITION_UNKNOWN : enumC12167M30252;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m22199() {
        return (this.f29438 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m22196() {
        Object obj = this.f29439;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f29439 = strM52260;
        }
        return strM52260;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f29437;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f29437 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f29438 & 2) != 0) {
            AbstractC18245.m42405(abstractC22044, 2, this.f29439);
        }
        if ((this.f29438 & 1) != 0) {
            abstractC22044.mo14252(3, this.f29440);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.f29438 & 2) != 0 ? AbstractC18245.m42390(2, this.f29439) : 0;
        if ((this.f29438 & 1) != 0) {
            iM42390 += AbstractC22044.m48966(3, this.f29440);
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
        if (!(obj instanceof C8494)) {
            return super.equals(obj);
        }
        C8494 c8494 = (C8494) obj;
        if (m22197() != c8494.m22197()) {
            return false;
        }
        if ((!m22197() || this.f29440 == c8494.f29440) && m22199() == c8494.m22199()) {
            return (!m22199() || m22196().equals(c8494.m22196())) && getUnknownFields().equals(c8494.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46301.hashCode() + 779;
        if (m22197()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + this.f29440;
        }
        if (m22199()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + m22196().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C19077 newBuilder() {
        return f29435.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f29435.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f29435.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C19077 toBuilder() {
        int i = 0;
        if (this == f29435) {
            return new C19077(i);
        }
        C19077 c19077 = new C19077(i);
        c19077.m43851(this);
        return c19077;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C19077(interfaceC6790, 0);
    }

    public static C8494 getDefaultInstance() {
        return f29435;
    }

    public static InterfaceC6271 parser() {
        return f29436;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f29436;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f29435;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f29435;
    }
}
