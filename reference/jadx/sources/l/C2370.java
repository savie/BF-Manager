package l;

/* JADX INFO: renamed from: l.ۖۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2370 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f8374;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C2370 f8375;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile Object f8376;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0959 f8377;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f8378;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f8379;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f8380;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C2370.class.getName());
        f8375 = new C2370();
        f8374 = new C13661();
    }

    public C2370(C11544 c11544, int i) {
        super(c11544);
        this.f8376 = "";
        this.f8379 = 0;
        this.f8380 = (byte) -1;
    }

    public C2370() {
        this.f8376 = "";
        this.f8379 = 0;
        this.f8380 = (byte) -1;
        this.f8376 = "";
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46285;
        c6956.m18696(C2370.class, C11544.class);
        return c6956;
    }

    public final boolean hasName() {
        return (this.f8378 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f8376;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f8376 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m7221() {
        return (this.f8378 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m7222() {
        return this.f8379;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m7223() {
        return (this.f8378 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C0959 m7220() {
        C0959 c0959 = this.f8377;
        return c0959 == null ? C0959.getDefaultInstance() : c0959;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f8380;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m7223() && !m7220().isInitialized()) {
            this.f8380 = (byte) 0;
            return false;
        }
        this.f8380 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f8378 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.f8376);
        }
        if ((this.f8378 & 2) != 0) {
            abstractC22044.mo14252(2, this.f8379);
        }
        if ((this.f8378 & 4) != 0) {
            abstractC22044.mo14254(3, m7220());
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.f8378 & 1) != 0 ? AbstractC18245.m42390(1, this.f8376) : 0;
        if ((this.f8378 & 2) != 0) {
            iM42390 += AbstractC22044.m48974(2, this.f8379);
        }
        if ((this.f8378 & 4) != 0) {
            iM42390 += AbstractC22044.m48963(3, m7220());
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
        if (!(obj instanceof C2370)) {
            return super.equals(obj);
        }
        C2370 c2370 = (C2370) obj;
        if (hasName() != c2370.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c2370.getName())) || m7221() != c2370.m7221()) {
            return false;
        }
        if ((!m7221() || this.f8379 == c2370.f8379) && m7223() == c2370.m7223()) {
            return (!m7223() || m7220().equals(c2370.m7220())) && getUnknownFields().equals(c2370.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46312.hashCode() + 779;
        if (hasName()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m7221()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f8379;
        }
        if (m7223()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + m7220().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C11544 newBuilder() {
        return f8375.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f8375.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f8375.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C11544 toBuilder() {
        int i = 0;
        if (this == f8375) {
            return new C11544(i);
        }
        C11544 c11544 = new C11544(i);
        c11544.m28725(this);
        return c11544;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C11544(interfaceC6790, 0);
    }

    public static C2370 getDefaultInstance() {
        return f8375;
    }

    public static InterfaceC6271 parser() {
        return f8374;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f8374;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f8375;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f8375;
    }
}
