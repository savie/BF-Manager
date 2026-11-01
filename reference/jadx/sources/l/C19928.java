package l;

/* JADX INFO: renamed from: l.᩶ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19928 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C19928 f63858;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f63859;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f63860;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f63861;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f63862;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63863;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C19928.class.getName());
        f63858 = new C19928();
        f63859 = new C20633();
    }

    public C19928(C15695 c15695, int i) {
        super(c15695);
        this.f63862 = 0;
        this.f63863 = 0;
        this.f63860 = (byte) -1;
    }

    public C19928() {
        this.f63862 = 0;
        this.f63863 = 0;
        this.f63860 = (byte) -1;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46322;
        c6956.m18696(C19928.class, C15695.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m45228() {
        return (this.f63861 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m45225() {
        return this.f63862;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m45226() {
        return (this.f63861 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m45227() {
        return this.f63863;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f63860;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f63860 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f63861 & 1) != 0) {
            abstractC22044.mo14252(1, this.f63862);
        }
        if ((this.f63861 & 2) != 0) {
            abstractC22044.mo14252(2, this.f63863);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48974 = (this.f63861 & 1) != 0 ? AbstractC22044.m48974(1, this.f63862) : 0;
        if ((this.f63861 & 2) != 0) {
            iM48974 += AbstractC22044.m48974(2, this.f63863);
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
        if (!(obj instanceof C19928)) {
            return super.equals(obj);
        }
        C19928 c19928 = (C19928) obj;
        if (m45228() != c19928.m45228()) {
            return false;
        }
        if ((!m45228() || this.f63862 == c19928.f63862) && m45226() == c19928.m45226()) {
            return (!m45226() || this.f63863 == c19928.f63863) && getUnknownFields().equals(c19928.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46277.hashCode() + 779;
        if (m45228()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.f63862;
        }
        if (m45226()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f63863;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C15695 newBuilder() {
        return f63858.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f63858.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f63858.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C15695 toBuilder() {
        int i = 0;
        if (this == f63858) {
            return new C15695(i);
        }
        C15695 c15695 = new C15695(i);
        c15695.m37395(this);
        return c15695;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C15695(interfaceC6790);
    }

    public static C19928 getDefaultInstance() {
        return f63858;
    }

    public static InterfaceC6271 parser() {
        return f63859;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f63859;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f63858;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f63858;
    }
}
