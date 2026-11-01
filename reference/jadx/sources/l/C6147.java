package l;

/* JADX INFO: renamed from: l.ۛܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6147 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f20990;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C6147 f20991;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21463 f20992;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f20993;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC23890 f20994;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f20995;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f20996;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f20997;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC23890 f20998;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f20999;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public volatile Object f21000;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C6147.class.getName());
        f20991 = new C6147();
        f20990 = new C12498();
    }

    public C6147(C17436 c17436, int i) {
        super(c17436);
        this.f20998 = AbstractC18245.m42411();
        this.f20995 = -1;
        this.f20994 = AbstractC18245.m42411();
        this.f20993 = -1;
        this.f20999 = "";
        this.f21000 = "";
        this.f20992 = C21463.m48084();
        this.f20997 = (byte) -1;
    }

    public C6147() {
        this.f20998 = AbstractC18245.m42411();
        this.f20995 = -1;
        this.f20994 = AbstractC18245.m42411();
        this.f20993 = -1;
        this.f20999 = "";
        this.f21000 = "";
        this.f20992 = C21463.m48084();
        this.f20997 = (byte) -1;
        this.f20998 = AbstractC18245.m42411();
        this.f20994 = AbstractC18245.m42411();
        this.f20999 = "";
        this.f21000 = "";
        this.f20992 = C21463.m48084();
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46305;
        c6956.m18696(C6147.class, C17436.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m17150() {
        return (this.f20996 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m17151() {
        Object obj = this.f20999;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f20999 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m17152() {
        return (this.f20996 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m17149() {
        Object obj = this.f21000;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f21000 = strM52260;
        }
        return strM52260;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f20997;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f20997 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        getSerializedSize();
        if (this.f20998.size() > 0) {
            abstractC22044.mo14248(10);
            abstractC22044.mo14248(this.f20995);
        }
        for (int i = 0; i < this.f20998.size(); i++) {
            abstractC22044.mo14251(this.f20998.getInt(i));
        }
        if (this.f20994.size() > 0) {
            abstractC22044.mo14248(18);
            abstractC22044.mo14248(this.f20993);
        }
        for (int i2 = 0; i2 < this.f20994.size(); i2++) {
            abstractC22044.mo14251(this.f20994.getInt(i2));
        }
        if ((this.f20996 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 3, this.f20999);
        }
        if ((this.f20996 & 2) != 0) {
            AbstractC18245.m42405(abstractC22044, 4, this.f21000);
        }
        for (int i3 = 0; i3 < this.f20992.size(); i3++) {
            AbstractC18245.m42405(abstractC22044, 6, this.f20992.mo21384(i3));
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48969 = 0;
        for (int i2 = 0; i2 < this.f20998.size(); i2++) {
            iM48969 += AbstractC22044.m48969(this.f20998.getInt(i2));
        }
        int iM489610 = this.f20998.isEmpty() ? iM48969 : AbstractC22044.m48969(iM48969) + iM48969 + 1;
        this.f20995 = iM48969;
        int iM489611 = 0;
        for (int i3 = 0; i3 < this.f20994.size(); i3++) {
            iM489611 += AbstractC22044.m48969(this.f20994.getInt(i3));
        }
        int iM42390 = iM489610 + iM489611;
        if (!this.f20994.isEmpty()) {
            iM42390 = iM42390 + 1 + AbstractC22044.m48969(iM489611);
        }
        this.f20993 = iM489611;
        if ((this.f20996 & 1) != 0) {
            iM42390 += AbstractC18245.m42390(3, this.f20999);
        }
        if ((this.f20996 & 2) != 0) {
            iM42390 += AbstractC18245.m42390(4, this.f21000);
        }
        int iM42412 = 0;
        for (int i4 = 0; i4 < this.f20992.size(); i4++) {
            iM42412 += AbstractC18245.m42412(this.f20992.mo21384(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f20992.size() + iM42390 + iM42412;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6147)) {
            return super.equals(obj);
        }
        C6147 c6147 = (C6147) obj;
        if (!this.f20998.equals(c6147.f20998) || !this.f20994.equals(c6147.f20994) || m17150() != c6147.m17150()) {
            return false;
        }
        if ((!m17150() || m17151().equals(c6147.m17151())) && m17152() == c6147.m17152()) {
            return (!m17152() || m17149().equals(c6147.m17149())) && this.f20992.equals(c6147.f20992) && getUnknownFields().equals(c6147.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46319.hashCode() + 779;
        if (this.f20998.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.f20998.hashCode();
        }
        if (this.f20994.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f20994.hashCode();
        }
        if (m17150()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + m17151().hashCode();
        }
        if (m17152()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + m17149().hashCode();
        }
        if (this.f20992.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + this.f20992.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C17436 newBuilder() {
        return f20991.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f20991.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f20991.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C17436 toBuilder() {
        int i = 0;
        if (this == f20991) {
            return new C17436(i);
        }
        C17436 c17436 = new C17436(i);
        c17436.m40647(this);
        return c17436;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C17436(interfaceC6790, 0);
    }

    public static C6147 getDefaultInstance() {
        return f20991;
    }

    public static InterfaceC6271 parser() {
        return f20990;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f20990;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f20991;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f20991;
    }
}
