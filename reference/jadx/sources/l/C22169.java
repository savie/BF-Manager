package l;

/* JADX INFO: renamed from: l.᩹۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U940 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22169 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f72515;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72516 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C22169 f72517;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f72518;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f72519;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f72520;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f72521;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C22169.class.getName());
        f72517 = new C22169();
        f72515 = new C13703();
    }

    public C22169(C11586 c11586, int i) {
        super(c11586);
        this.f72521 = false;
        this.f72520 = 0;
        this.f72518 = (byte) -1;
    }

    public C22169() {
        this.f72521 = false;
        this.f72518 = (byte) -1;
        this.f72520 = 0;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C1001.f4677;
        c6956.m18696(C22169.class, C11586.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m49186() {
        return (this.f72519 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m49187() {
        return this.f72521;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m49188() {
        return (this.f72519 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC5235 m49185() {
        EnumC5235 enumC5235M14429 = EnumC5235.m14429(this.f72520);
        return enumC5235M14429 == null ? EnumC5235.UTF8_VALIDATION_UNKNOWN : enumC5235M14429;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f72518;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f72518 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f72519 & 1) != 0) {
            abstractC22044.mo14240(1, this.f72521);
        }
        if ((this.f72519 & 2) != 0) {
            abstractC22044.mo14252(2, this.f72520);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48961 = (this.f72519 & 1) != 0 ? AbstractC22044.m48961(1) : 0;
        if ((this.f72519 & 2) != 0) {
            iM48961 += AbstractC22044.m48966(2, this.f72520);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48961;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22169)) {
            return super.equals(obj);
        }
        C22169 c22169 = (C22169) obj;
        if (m49186() != c22169.m49186()) {
            return false;
        }
        if ((!m49186() || this.f72521 == c22169.f72521) && m49188() == c22169.m49188()) {
            return (!m49188() || this.f72520 == c22169.f72520) && getUnknownFields().equals(c22169.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C1001.f4675.hashCode() + 779;
        if (m49186()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + C9779.m24888(this.f72521);
        }
        if (m49188()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f72520;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C11586 newBuilder() {
        return f72517.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f72517.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f72517.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C11586 toBuilder() {
        int i = 0;
        if (this == f72517) {
            return new C11586(i);
        }
        C11586 c11586 = new C11586(i);
        c11586.m28881(this);
        return c11586;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C11586(interfaceC6790, 0);
    }

    public static C22169 getDefaultInstance() {
        return f72517;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f72515;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f72517;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f72517;
    }
}
