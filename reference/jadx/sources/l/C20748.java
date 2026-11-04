package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20748 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C20748 f66484;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f66485;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile Object f66486;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f66487;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public byte f66488;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC17084 f66489;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f66490;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile Object f66491;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double f66492;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f66493;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f66494;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C20748.class.getName());
        f66484 = new C20748();
        f66485 = new C17018();
    }

    public C20748(C17764 c17764, int i) {
        super(c17764);
        this.f66486 = "";
        this.f66487 = 0L;
        this.f66490 = 0L;
        this.f66492 = 0.0d;
        this.f66489 = AbstractC17084.f55772;
        this.f66491 = "";
        this.f66488 = (byte) -1;
    }

    public C20748() {
        this.f66486 = "";
        this.f66487 = 0L;
        this.f66490 = 0L;
        this.f66492 = 0.0d;
        AbstractC17084 abstractC17084 = AbstractC17084.f55772;
        this.f66489 = abstractC17084;
        this.f66491 = "";
        this.f66488 = (byte) -1;
        this.f66493 = Collections.EMPTY_LIST;
        this.f66486 = "";
        this.f66489 = abstractC17084;
        this.f66491 = "";
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40269;
        c7544.m20621(C20748.class, C17764.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m47447() {
        return (this.f66494 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m47450() {
        Object obj = this.f66486;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f66486 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m47451() {
        return (this.f66494 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long m47453() {
        return this.f66487;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m47455() {
        return (this.f66494 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m47457() {
        return this.f66490;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m47456() {
        return (this.f66494 & 8) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m47446() {
        return this.f66492;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m47449() {
        return (this.f66494 & 16) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC17084 m47454() {
        return this.f66489;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m47452() {
        return (this.f66494 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m47448() {
        Object obj = this.f66491;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f66491 = strM40221;
        }
        return strM40221;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f66488;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f66493.size(); i++) {
            if (!((C3594) this.f66493.get(i)).isInitialized()) {
                this.f66488 = (byte) 0;
                return false;
            }
        }
        this.f66488 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        for (int i = 0; i < this.f66493.size(); i++) {
            abstractC14846.mo14025(2, (InterfaceC18775) this.f66493.get(i));
        }
        if ((this.f66494 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 3, this.f66486);
        }
        if ((this.f66494 & 2) != 0) {
            abstractC14846.mo14023(4, this.f66487);
        }
        if ((this.f66494 & 4) != 0) {
            abstractC14846.mo14023(5, this.f66490);
        }
        if ((this.f66494 & 8) != 0) {
            double d = this.f66492;
            abstractC14846.getClass();
            abstractC14846.mo14006(6, Double.doubleToRawLongBits(d));
        }
        if ((this.f66494 & 16) != 0) {
            abstractC14846.mo14008(7, this.f66489);
        }
        if ((this.f66494 & 32) != 0) {
            AbstractC9035.m24111(abstractC14846, 8, this.f66491);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = 0;
        for (int i2 = 0; i2 < this.f66493.size(); i2++) {
            iM24096 += AbstractC14846.m35774(2, (InterfaceC18775) this.f66493.get(i2));
        }
        if ((this.f66494 & 1) != 0) {
            iM24096 += AbstractC9035.m24096(3, this.f66486);
        }
        if ((this.f66494 & 2) != 0) {
            iM24096 += AbstractC14846.m35773(4, this.f66487);
        }
        if ((this.f66494 & 4) != 0) {
            iM24096 += AbstractC14846.m35760(5, this.f66490);
        }
        if ((this.f66494 & 8) != 0) {
            iM24096 += AbstractC14846.m35765(6) + 8;
        }
        if ((this.f66494 & 16) != 0) {
            iM24096 += AbstractC14846.m35761(7, this.f66489);
        }
        if ((this.f66494 & 32) != 0) {
            iM24096 += AbstractC9035.m24096(8, this.f66491);
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
        if (!(obj instanceof C20748)) {
            return super.equals(obj);
        }
        C20748 c20748 = (C20748) obj;
        if (!this.f66493.equals(c20748.f66493) || m47447() != c20748.m47447()) {
            return false;
        }
        if ((m47447() && !m47450().equals(c20748.m47450())) || m47451() != c20748.m47451()) {
            return false;
        }
        if ((m47451() && this.f66487 != c20748.f66487) || m47455() != c20748.m47455()) {
            return false;
        }
        if ((m47455() && this.f66490 != c20748.f66490) || m47456() != c20748.m47456()) {
            return false;
        }
        if ((m47456() && Double.doubleToLongBits(this.f66492) != Double.doubleToLongBits(c20748.f66492)) || m47449() != c20748.m47449()) {
            return false;
        }
        if ((!m47449() || this.f66489.equals(c20748.f66489)) && m47452() == c20748.m47452()) {
            return (!m47452() || m47448().equals(c20748.m47448())) && getUnknownFields().equals(c20748.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40292.hashCode() + 779;
        if (this.f66493.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f66493.hashCode();
        }
        if (m47447()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + m47450().hashCode();
        }
        if (m47451()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + C23447.m52660(this.f66487);
        }
        if (m47455()) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + C23447.m52660(this.f66490);
        }
        if (m47456()) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + C23447.m52660(Double.doubleToLongBits(this.f66492));
        }
        if (m47449()) {
            iHashCode = C18176.m42345(iHashCode, 37, 7, 53) + this.f66489.hashCode();
        }
        if (m47452()) {
            iHashCode = C18176.m42345(iHashCode, 37, 8, 53) + m47448().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C17764 newBuilder() {
        return f66484.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f66484.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f66484.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C17764 toBuilder() {
        int i = 0;
        if (this == f66484) {
            return new C17764(i);
        }
        C17764 c17764 = new C17764(i);
        c17764.m41577(this);
        return c17764;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C17764(interfaceC7937, 0);
    }

    public static C20748 getDefaultInstance() {
        return f66484;
    }

    public static InterfaceC11490 parser() {
        return f66485;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f66485;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f66484;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f66484;
    }
}
