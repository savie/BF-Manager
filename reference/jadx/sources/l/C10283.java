package l;

/* JADX INFO: renamed from: l.ۢܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10283 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C10283 f32837;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f32838;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f32839;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f32840;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile Object f32841;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f32842;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f32843;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f32844;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f32845;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C10283.class.getName());
        f32837 = new C10283();
        f32838 = new C8047();
    }

    public C10283(C19234 c19234, int i) {
        super(c19234);
        this.f32839 = 0;
        this.f32845 = "";
        this.f32841 = "";
        this.f32844 = false;
        this.f32840 = false;
        this.f32843 = (byte) -1;
    }

    public C10283() {
        this.f32839 = 0;
        this.f32845 = "";
        this.f32841 = "";
        this.f32844 = false;
        this.f32840 = false;
        this.f32843 = (byte) -1;
        this.f32845 = "";
        this.f32841 = "";
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40305;
        c7544.m20621(C10283.class, C19234.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26511() {
        return (this.f32842 & 1) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26506() {
        return this.f32839;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m26510() {
        return (this.f32842 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m26507() {
        Object obj = this.f32845;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f32845 = strM40221;
        }
        return strM40221;
    }

    public final boolean hasType() {
        return (this.f32842 & 4) != 0;
    }

    public final String getType() {
        Object obj = this.f32841;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f32841 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m26512() {
        return (this.f32842 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m26513() {
        return this.f32844;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m26509() {
        return (this.f32842 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m26508() {
        return this.f32840;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f32843;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f32843 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f32842 & 1) != 0) {
            abstractC14846.mo14022(1, this.f32839);
        }
        if ((this.f32842 & 2) != 0) {
            AbstractC9035.m24111(abstractC14846, 2, this.f32845);
        }
        if ((this.f32842 & 4) != 0) {
            AbstractC9035.m24111(abstractC14846, 3, this.f32841);
        }
        if ((this.f32842 & 8) != 0) {
            abstractC14846.mo14010(5, this.f32844);
        }
        if ((this.f32842 & 16) != 0) {
            abstractC14846.mo14010(6, this.f32840);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35766 = (this.f32842 & 1) != 0 ? AbstractC14846.m35766(1, this.f32839) : 0;
        if ((this.f32842 & 2) != 0) {
            iM35766 += AbstractC9035.m24096(2, this.f32845);
        }
        if ((this.f32842 & 4) != 0) {
            iM35766 += AbstractC9035.m24096(3, this.f32841);
        }
        if ((this.f32842 & 8) != 0) {
            iM35766 += AbstractC14846.m35772(5);
        }
        if ((this.f32842 & 16) != 0) {
            iM35766 += AbstractC14846.m35772(6);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35766;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10283)) {
            return super.equals(obj);
        }
        C10283 c10283 = (C10283) obj;
        if (m26511() != c10283.m26511()) {
            return false;
        }
        if ((m26511() && this.f32839 != c10283.f32839) || m26510() != c10283.m26510()) {
            return false;
        }
        if ((m26510() && !m26507().equals(c10283.m26507())) || hasType() != c10283.hasType()) {
            return false;
        }
        if ((hasType() && !getType().equals(c10283.getType())) || m26512() != c10283.m26512()) {
            return false;
        }
        if ((!m26512() || this.f32844 == c10283.f32844) && m26509() == c10283.m26509()) {
            return (!m26509() || this.f32840 == c10283.f32840) && getUnknownFields().equals(c10283.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40261.hashCode() + 779;
        if (m26511()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + this.f32839;
        }
        if (m26510()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + m26507().hashCode();
        }
        if (hasType()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + getType().hashCode();
        }
        if (m26512()) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + C23447.m52661(this.f32844);
        }
        if (m26509()) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + C23447.m52661(this.f32840);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C19234 newBuilder() {
        return f32837.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f32837.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f32837.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C19234 toBuilder() {
        int i = 0;
        if (this == f32837) {
            return new C19234(i);
        }
        C19234 c19234 = new C19234(i);
        c19234.m44565(this);
        return c19234;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C19234(interfaceC7937, 0);
    }

    public static C10283 getDefaultInstance() {
        return f32837;
    }

    public static InterfaceC11490 parser() {
        return f32838;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f32838;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f32837;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f32837;
    }
}
