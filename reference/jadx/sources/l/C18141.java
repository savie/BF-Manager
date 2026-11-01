package l;

/* JADX INFO: renamed from: l.ᩳܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18141 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C18141 f58005;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f58006;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile Object f58007;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f58008;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19553 f58009;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f58010;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C18141.class.getName());
        f58005 = new C18141();
        f58006 = new C15320();
    }

    public C18141(C21669 c21669, int i) {
        super(c21669);
        this.f58007 = "";
        this.f58010 = (byte) -1;
    }

    public C18141() {
        this.f58007 = "";
        this.f58010 = (byte) -1;
        this.f58007 = "";
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46311;
        c6956.m18696(C18141.class, C21669.class);
        return c6956;
    }

    public final boolean hasName() {
        return (this.f58008 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f58007;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f58007 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m42230() {
        return (this.f58008 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C19553 m42231() {
        C19553 c19553 = this.f58009;
        return c19553 == null ? C19553.getDefaultInstance() : c19553;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f58010;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m42230() && !m42231().isInitialized()) {
            this.f58010 = (byte) 0;
            return false;
        }
        this.f58010 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f58008 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.f58007);
        }
        if ((this.f58008 & 2) != 0) {
            abstractC22044.mo14254(2, m42231());
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.f58008 & 1) != 0 ? AbstractC18245.m42390(1, this.f58007) : 0;
        if ((this.f58008 & 2) != 0) {
            iM42390 += AbstractC22044.m48963(2, m42231());
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
        if (!(obj instanceof C18141)) {
            return super.equals(obj);
        }
        C18141 c18141 = (C18141) obj;
        if (hasName() != c18141.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c18141.getName())) && m42230() == c18141.m42230()) {
            return (!m42230() || m42231().equals(c18141.m42231())) && getUnknownFields().equals(c18141.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46321.hashCode() + 779;
        if (hasName()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m42230()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + m42231().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C21669 newBuilder() {
        return f58005.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f58005.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f58005.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C21669 toBuilder() {
        int i = 0;
        if (this == f58005) {
            return new C21669(i);
        }
        C21669 c21669 = new C21669(i);
        c21669.m48402(this);
        return c21669;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C21669(interfaceC6790, 0);
    }

    public static C18141 getDefaultInstance() {
        return f58005;
    }

    public static InterfaceC6271 parser() {
        return f58006;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f58006;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f58005;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f58005;
    }
}
