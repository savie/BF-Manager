package l;

/* JADX INFO: renamed from: l.᩺ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24456 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f79388;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C24456 f79389;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f79390;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C21472 f79391;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f79392;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile Object f79393;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f79394;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C24456.class.getName());
        f79389 = new C24456();
        f79388 = new C12521();
    }

    public C24456(C6556 c6556, int i) {
        super(c6556);
        this.f79393 = "";
        this.f79390 = 0;
        this.f79394 = (byte) -1;
    }

    public C24456() {
        this.f79393 = "";
        this.f79390 = 0;
        this.f79394 = (byte) -1;
        this.f79393 = "";
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40253;
        c7544.m20621(C24456.class, C6556.class);
        return c7544;
    }

    public final boolean hasName() {
        return (this.f79392 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f79393;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f79393 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m54706() {
        return (this.f79392 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m54705() {
        return this.f79390;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m54707() {
        return (this.f79392 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21472 m54704() {
        C21472 c21472 = this.f79391;
        return c21472 == null ? C21472.getDefaultInstance() : c21472;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f79394;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m54707() && !m54704().isInitialized()) {
            this.f79394 = (byte) 0;
            return false;
        }
        this.f79394 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f79392 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.f79393);
        }
        if ((this.f79392 & 2) != 0) {
            abstractC14846.mo14022(2, this.f79390);
        }
        if ((this.f79392 & 4) != 0) {
            abstractC14846.mo14025(3, m54704());
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.f79392 & 1) != 0 ? AbstractC9035.m24096(1, this.f79393) : 0;
        if ((this.f79392 & 2) != 0) {
            iM24096 += AbstractC14846.m35766(2, this.f79390);
        }
        if ((this.f79392 & 4) != 0) {
            iM24096 += AbstractC14846.m35774(3, m54704());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM24096;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24456)) {
            return super.equals(obj);
        }
        C24456 c24456 = (C24456) obj;
        if (hasName() != c24456.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c24456.getName())) || m54706() != c24456.m54706()) {
            return false;
        }
        if ((!m54706() || this.f79390 == c24456.f79390) && m54707() == c24456.m54707()) {
            return (!m54707() || m54704().equals(c24456.m54704())) && getUnknownFields().equals(c24456.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40303.hashCode() + 779;
        if (hasName()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m54706()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f79390;
        }
        if (m54707()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + m54704().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C6556 newBuilder() {
        return f79389.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f79389.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f79389.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C6556 toBuilder() {
        int i = 0;
        if (this == f79389) {
            return new C6556(i);
        }
        C6556 c6556 = new C6556(i);
        c6556.m18464(this);
        return c6556;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C6556(interfaceC7937, 0);
    }

    public static C24456 getDefaultInstance() {
        return f79389;
    }

    public static InterfaceC11490 parser() {
        return f79388;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f79388;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f79389;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f79389;
    }
}
