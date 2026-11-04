package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21472 extends AbstractC11272 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f68584;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C21472 f68585;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f68586;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f68587;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C4758 f68588;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte f68589;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f68590;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16471 f68591;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f68592;

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        C1578 c1578 = new C1578(this);
        if ((this.f68592 & 1) != 0) {
            abstractC14846.mo14010(1, this.f68586);
        }
        if ((this.f68592 & 2) != 0) {
            abstractC14846.mo14025(2, m48839());
        }
        if ((this.f68592 & 4) != 0) {
            abstractC14846.mo14010(3, this.f68590);
        }
        if ((this.f68592 & 8) != 0) {
            abstractC14846.mo14025(4, m48841());
        }
        for (int i = 0; i < this.f68587.size(); i++) {
            abstractC14846.mo14025(EnumC5810.f19979, (InterfaceC18775) this.f68587.get(i));
        }
        c1578.m5597(536870912, abstractC14846);
        getUnknownFields().writeTo(abstractC14846);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C21472.class.getName());
        f68585 = new C21472();
        f68584 = new C4318();
    }

    public C21472(C14758 c14758) {
        super(c14758);
        this.f68586 = false;
        this.f68590 = false;
        this.f68589 = (byte) -1;
    }

    public C21472() {
        this.f68586 = false;
        this.f68590 = false;
        this.f68589 = (byte) -1;
        this.f68587 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40274;
        c7544.m20621(C21472.class, C14758.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m48837() {
        return (this.f68592 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m48840() {
        return this.f68586;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m48838() {
        return (this.f68592 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C16471 m48839() {
        C16471 c16471 = this.f68591;
        return c16471 == null ? C16471.getDefaultInstance() : c16471;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m48843() {
        return (this.f68592 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m48844() {
        return this.f68590;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m48842() {
        return (this.f68592 & 8) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4758 m48841() {
        C4758 c4758 = this.f68588;
        return c4758 == null ? C4758.getDefaultInstance() : c4758;
    }

    @Override // l.AbstractC11272, l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f68589;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m48838() || m48839().isInitialized()) {
            for (int i = 0; i < this.f68587.size(); i++) {
                if (!((C20748) this.f68587.get(i)).isInitialized()) {
                    this.f68589 = (byte) 0;
                    return false;
                }
            }
            if (!m28524()) {
                this.f68589 = (byte) 0;
                return false;
            }
            this.f68589 = (byte) 1;
            return true;
        }
        this.f68589 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35772 = (this.f68592 & 1) != 0 ? AbstractC14846.m35772(1) : 0;
        if ((this.f68592 & 2) != 0) {
            iM35772 += AbstractC14846.m35774(2, m48839());
        }
        if ((this.f68592 & 4) != 0) {
            iM35772 += AbstractC14846.m35772(3);
        }
        if ((this.f68592 & 8) != 0) {
            iM35772 += AbstractC14846.m35774(4, m48841());
        }
        for (int i2 = 0; i2 < this.f68587.size(); i2++) {
            iM35772 += AbstractC14846.m35774(EnumC5810.f19979, (InterfaceC18775) this.f68587.get(i2));
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
        if (!(obj instanceof C21472)) {
            return super.equals(obj);
        }
        C21472 c21472 = (C21472) obj;
        if (m48837() != c21472.m48837()) {
            return false;
        }
        if ((m48837() && this.f68586 != c21472.f68586) || m48838() != c21472.m48838()) {
            return false;
        }
        if ((m48838() && !m48839().equals(c21472.m48839())) || m48843() != c21472.m48843()) {
            return false;
        }
        if ((!m48843() || this.f68590 == c21472.f68590) && m48842() == c21472.m48842()) {
            return (!m48842() || m48841().equals(c21472.m48841())) && this.f68587.equals(c21472.f68587) && getUnknownFields().equals(c21472.getUnknownFields()) && m28526().equals(c21472.m28526());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40295.hashCode() + 779;
        if (m48837()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + C23447.m52661(this.f68586);
        }
        if (m48838()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + m48839().hashCode();
        }
        if (m48843()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + C23447.m52661(this.f68590);
        }
        if (m48842()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + m48841().hashCode();
        }
        if (this.f68587.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, EnumC5810.f19979, 53) + this.f68587.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC19124.m44248(iHashCode, m28526()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C14758 newBuilder() {
        return f68585.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f68585.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f68585.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C14758 toBuilder() {
        int i = 0;
        if (this == f68585) {
            return new C14758(i);
        }
        C14758 c14758 = new C14758(i);
        c14758.m35488(this);
        return c14758;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C14758(interfaceC7937, 0);
    }

    public static C21472 getDefaultInstance() {
        return f68585;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f68584;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f68585;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f68585;
    }
}
