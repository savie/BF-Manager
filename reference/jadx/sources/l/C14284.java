package l;

/* JADX INFO: renamed from: l.ܳۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14284 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C14284 f46810;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f46811;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f46812;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f46813;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f46814;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f46815;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C14284.class.getName());
        f46810 = new C14284();
        f46811 = new C10756();
    }

    public C14284(C23456 c23456, int i) {
        super(c23456);
        this.f46814 = 0;
        this.f46815 = 0;
        this.f46812 = (byte) -1;
    }

    public C14284() {
        this.f46814 = 0;
        this.f46815 = 0;
        this.f46812 = (byte) -1;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46281;
        c6956.m18696(C14284.class, C23456.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m34521() {
        return (this.f46813 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m34518() {
        return this.f46814;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m34519() {
        return (this.f46813 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m34520() {
        return this.f46815;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f46812;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f46812 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f46813 & 1) != 0) {
            abstractC22044.mo14252(1, this.f46814);
        }
        if ((this.f46813 & 2) != 0) {
            abstractC22044.mo14252(2, this.f46815);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48974 = (this.f46813 & 1) != 0 ? AbstractC22044.m48974(1, this.f46814) : 0;
        if ((this.f46813 & 2) != 0) {
            iM48974 += AbstractC22044.m48974(2, this.f46815);
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
        if (!(obj instanceof C14284)) {
            return super.equals(obj);
        }
        C14284 c14284 = (C14284) obj;
        if (m34521() != c14284.m34521()) {
            return false;
        }
        if ((!m34521() || this.f46814 == c14284.f46814) && m34519() == c14284.m34519()) {
            return (!m34519() || this.f46815 == c14284.f46815) && getUnknownFields().equals(c14284.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46273.hashCode() + 779;
        if (m34521()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.f46814;
        }
        if (m34519()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f46815;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C23456 newBuilder() {
        return f46810.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f46810.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f46810.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C23456 toBuilder() {
        int i = 0;
        if (this == f46810) {
            return new C23456(i);
        }
        C23456 c23456 = new C23456(i);
        c23456.m51702(this);
        return c23456;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C23456(interfaceC6790);
    }

    public static C14284 getDefaultInstance() {
        return f46810;
    }

    public static InterfaceC6271 parser() {
        return f46811;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f46811;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f46810;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f46810;
    }
}
