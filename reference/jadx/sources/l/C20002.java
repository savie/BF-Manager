package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20002 extends AbstractC11272 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f64264;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C20002 f64265;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16471 f64266;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public byte f64267;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f64268;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f64269;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f64270;

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        C1578 c1578 = new C1578(this);
        if ((this.f64270 & 2) != 0) {
            abstractC14846.mo14010(33, this.f64268);
        }
        if ((this.f64270 & 1) != 0) {
            abstractC14846.mo14025(34, m45995());
        }
        for (int i = 0; i < this.f64269.size(); i++) {
            abstractC14846.mo14025(EnumC5810.f19979, (InterfaceC18775) this.f64269.get(i));
        }
        c1578.m5597(536870912, abstractC14846);
        getUnknownFields().writeTo(abstractC14846);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C20002.class.getName());
        f64265 = new C20002();
        f64264 = new C11051();
    }

    public C20002(C22986 c22986) {
        super(c22986);
        this.f64268 = false;
        this.f64267 = (byte) -1;
    }

    public C20002() {
        this.f64268 = false;
        this.f64267 = (byte) -1;
        this.f64269 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40306;
        c7544.m20621(C20002.class, C22986.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m45994() {
        return (this.f64270 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16471 m45995() {
        C16471 c16471 = this.f64266;
        return c16471 == null ? C16471.getDefaultInstance() : c16471;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m45996() {
        return (this.f64270 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m45997() {
        return this.f64268;
    }

    @Override // l.AbstractC11272, l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f64267;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m45994() || m45995().isInitialized()) {
            for (int i = 0; i < this.f64269.size(); i++) {
                if (!((C20748) this.f64269.get(i)).isInitialized()) {
                    this.f64267 = (byte) 0;
                    return false;
                }
            }
            if (!m28524()) {
                this.f64267 = (byte) 0;
                return false;
            }
            this.f64267 = (byte) 1;
            return true;
        }
        this.f64267 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35772 = (this.f64270 & 2) != 0 ? AbstractC14846.m35772(33) : 0;
        if ((this.f64270 & 1) != 0) {
            iM35772 += AbstractC14846.m35774(34, m45995());
        }
        for (int i2 = 0; i2 < this.f64269.size(); i2++) {
            iM35772 += AbstractC14846.m35774(EnumC5810.f19979, (InterfaceC18775) this.f64269.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35772 + m28523();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20002)) {
            return super.equals(obj);
        }
        C20002 c20002 = (C20002) obj;
        if (m45994() != c20002.m45994()) {
            return false;
        }
        if ((!m45994() || m45995().equals(c20002.m45995())) && m45996() == c20002.m45996()) {
            return (!m45996() || this.f64268 == c20002.f64268) && this.f64269.equals(c20002.f64269) && getUnknownFields().equals(c20002.getUnknownFields()) && m28526().equals(c20002.m28526());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40262.hashCode() + 779;
        if (m45994()) {
            iHashCode = C18176.m42345(iHashCode, 37, 34, 53) + m45995().hashCode();
        }
        if (m45996()) {
            iHashCode = C18176.m42345(iHashCode, 37, 33, 53) + C23447.m52661(this.f64268);
        }
        if (this.f64269.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, EnumC5810.f19979, 53) + this.f64269.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC19124.m44248(iHashCode, m28526()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C22986 newBuilder() {
        return f64265.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f64265.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f64265.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C22986 toBuilder() {
        int i = 0;
        if (this == f64265) {
            return new C22986(i);
        }
        C22986 c22986 = new C22986(i);
        c22986.m51872(this);
        return c22986;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C22986(interfaceC7937, 0);
    }

    public static C20002 getDefaultInstance() {
        return f64265;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f64264;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f64265;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f64265;
    }
}
