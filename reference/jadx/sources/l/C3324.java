package l;

/* JADX INFO: renamed from: l.ۗܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3324 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C3324 f12307;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f12308;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f12309;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f12310;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile Object f12311;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f12312;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C3324.class.getName());
        f12307 = new C3324();
        f12308 = new C1913();
    }

    public C3324(C9676 c9676, int i) {
        super(c9676);
        this.f12311 = "";
        this.f12312 = false;
        this.f12309 = (byte) -1;
    }

    public C3324() {
        this.f12311 = "";
        this.f12312 = false;
        this.f12309 = (byte) -1;
        this.f12311 = "";
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46296;
        c6956.m18696(C3324.class, C9676.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m9855() {
        return (this.f12310 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m9852() {
        Object obj = this.f12311;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f12311 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m9853() {
        return (this.f12310 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m9854() {
        return this.f12312;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f12309;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m9855()) {
            this.f12309 = (byte) 0;
            return false;
        }
        if (!m9853()) {
            this.f12309 = (byte) 0;
            return false;
        }
        this.f12309 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f12310 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.f12311);
        }
        if ((this.f12310 & 2) != 0) {
            abstractC22044.mo14240(2, this.f12312);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.f12310 & 1) != 0 ? AbstractC18245.m42390(1, this.f12311) : 0;
        if ((this.f12310 & 2) != 0) {
            iM42390 += AbstractC22044.m48961(2);
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
        if (!(obj instanceof C3324)) {
            return super.equals(obj);
        }
        C3324 c3324 = (C3324) obj;
        if (m9855() != c3324.m9855()) {
            return false;
        }
        if ((!m9855() || m9852().equals(c3324.m9852())) && m9853() == c3324.m9853()) {
            return (!m9853() || this.f12312 == c3324.f12312) && getUnknownFields().equals(c3324.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46307.hashCode() + 779;
        if (m9855()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + m9852().hashCode();
        }
        if (m9853()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + C9779.m24888(this.f12312);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C9676 newBuilder() {
        return f12307.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f12307.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f12307.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C9676 toBuilder() {
        int i = 0;
        if (this == f12307) {
            return new C9676(i);
        }
        C9676 c9676 = new C9676(i);
        c9676.m24613(this);
        return c9676;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C9676(interfaceC6790, 0);
    }

    public static C3324 getDefaultInstance() {
        return f12307;
    }

    public static InterfaceC6271 parser() {
        return f12308;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f12308;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f12307;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f12307;
    }
}
