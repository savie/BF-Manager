package l;

/* JADX INFO: renamed from: l.ۙ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4965 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f17328;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C4965 f17329;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23539 f17330;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23539 f17331;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f17332;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f17333;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17334;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C4965.class.getName());
        f17329 = new C4965();
        f17328 = new C9428();
    }

    public C4965(C3076 c3076, int i) {
        super(c3076);
        this.f17334 = 0;
        this.f17333 = (byte) -1;
    }

    public C4965() {
        this.f17333 = (byte) -1;
        this.f17334 = 0;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46265;
        c6956.m18696(C4965.class, C3076.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m13775() {
        return (this.f17332 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC12167 m13772() {
        EnumC12167 enumC12167M30252 = EnumC12167.m30252(this.f17334);
        return enumC12167M30252 == null ? EnumC12167.EDITION_UNKNOWN : enumC12167M30252;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m13774() {
        return (this.f17332 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23539 m13771() {
        C23539 c23539 = this.f17331;
        return c23539 == null ? C23539.getDefaultInstance() : c23539;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m13773() {
        return (this.f17332 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23539 m13770() {
        C23539 c23539 = this.f17330;
        return c23539 == null ? C23539.getDefaultInstance() : c23539;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f17333;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m13774() && !m13771().isInitialized()) {
            this.f17333 = (byte) 0;
            return false;
        }
        if (m13773() && !m13770().isInitialized()) {
            this.f17333 = (byte) 0;
            return false;
        }
        this.f17333 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f17332 & 1) != 0) {
            abstractC22044.mo14252(3, this.f17334);
        }
        if ((this.f17332 & 2) != 0) {
            abstractC22044.mo14254(4, m13771());
        }
        if ((this.f17332 & 4) != 0) {
            abstractC22044.mo14254(5, m13770());
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48966 = (this.f17332 & 1) != 0 ? AbstractC22044.m48966(3, this.f17334) : 0;
        if ((this.f17332 & 2) != 0) {
            iM48966 += AbstractC22044.m48963(4, m13771());
        }
        if ((this.f17332 & 4) != 0) {
            iM48966 += AbstractC22044.m48963(5, m13770());
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
        if (!(obj instanceof C4965)) {
            return super.equals(obj);
        }
        C4965 c4965 = (C4965) obj;
        if (m13775() != c4965.m13775()) {
            return false;
        }
        if ((m13775() && this.f17334 != c4965.f17334) || m13774() != c4965.m13774()) {
            return false;
        }
        if ((!m13774() || m13771().equals(c4965.m13771())) && m13773() == c4965.m13773()) {
            return (!m13773() || m13770().equals(c4965.m13770())) && getUnknownFields().equals(c4965.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46316.hashCode() + 779;
        if (m13775()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + this.f17334;
        }
        if (m13774()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + m13771().hashCode();
        }
        if (m13773()) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + m13770().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C3076 newBuilder() {
        return f17329.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f17329.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f17329.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C3076 toBuilder() {
        int i = 0;
        if (this == f17329) {
            return new C3076(i);
        }
        C3076 c3076 = new C3076(i);
        c3076.m9260(this);
        return c3076;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C3076(interfaceC6790, 0);
    }

    public static C4965 getDefaultInstance() {
        return f17329;
    }

    public static InterfaceC6271 parser() {
        return f17328;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f17328;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f17329;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f17329;
    }
}
