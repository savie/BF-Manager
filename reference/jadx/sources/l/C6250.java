package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6250 extends AbstractC11272 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f21208;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C6250 f21209;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f21210;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f21211;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public List f21212;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C16471 f21213;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f21214;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte f21215;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f21216;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f21217;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21218;

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        C1578 c1578 = new C1578(this);
        if ((this.f21218 & 1) != 0) {
            abstractC14846.mo14010(1, this.f21211);
        }
        if ((this.f21218 & 2) != 0) {
            abstractC14846.mo14010(2, this.f21214);
        }
        if ((this.f21218 & 4) != 0) {
            abstractC14846.mo14010(3, this.f21210);
        }
        if ((this.f21218 & 8) != 0) {
            abstractC14846.mo14010(7, this.f21217);
        }
        if ((this.f21218 & 16) != 0) {
            abstractC14846.mo14010(11, this.f21216);
        }
        if ((this.f21218 & 32) != 0) {
            abstractC14846.mo14025(12, m17894());
        }
        for (int i = 0; i < this.f21212.size(); i++) {
            abstractC14846.mo14025(EnumC5810.f19979, (InterfaceC18775) this.f21212.get(i));
        }
        c1578.m5597(536870912, abstractC14846);
        getUnknownFields().writeTo(abstractC14846);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C6250.class.getName());
        f21209 = new C6250();
        f21208 = new C20420();
    }

    public C6250(C12215 c12215) {
        super(c12215);
        this.f21211 = false;
        this.f21214 = false;
        this.f21210 = false;
        this.f21217 = false;
        this.f21216 = false;
        this.f21215 = (byte) -1;
    }

    public C6250() {
        this.f21211 = false;
        this.f21214 = false;
        this.f21210 = false;
        this.f21217 = false;
        this.f21216 = false;
        this.f21215 = (byte) -1;
        this.f21212 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40260;
        c7544.m20621(C6250.class, C12215.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m17888() {
        return (this.f21218 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m17896() {
        return this.f21211;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17891() {
        return (this.f21218 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m17887() {
        return this.f21214;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m17895() {
        return (this.f21218 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m17898() {
        return this.f21210;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m17897() {
        return (this.f21218 & 8) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m17892() {
        return this.f21217;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m17890() {
        return (this.f21218 & 16) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m17893() {
        return this.f21216;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m17889() {
        return (this.f21218 & 32) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16471 m17894() {
        C16471 c16471 = this.f21213;
        return c16471 == null ? C16471.getDefaultInstance() : c16471;
    }

    @Override // l.AbstractC11272, l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f21215;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m17889() || m17894().isInitialized()) {
            for (int i = 0; i < this.f21212.size(); i++) {
                if (!((C20748) this.f21212.get(i)).isInitialized()) {
                    this.f21215 = (byte) 0;
                    return false;
                }
            }
            if (!m28524()) {
                this.f21215 = (byte) 0;
                return false;
            }
            this.f21215 = (byte) 1;
            return true;
        }
        this.f21215 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35772 = (this.f21218 & 1) != 0 ? AbstractC14846.m35772(1) : 0;
        if ((this.f21218 & 2) != 0) {
            iM35772 += AbstractC14846.m35772(2);
        }
        if ((this.f21218 & 4) != 0) {
            iM35772 += AbstractC14846.m35772(3);
        }
        if ((this.f21218 & 8) != 0) {
            iM35772 += AbstractC14846.m35772(7);
        }
        if ((this.f21218 & 16) != 0) {
            iM35772 += AbstractC14846.m35772(11);
        }
        if ((this.f21218 & 32) != 0) {
            iM35772 += AbstractC14846.m35774(12, m17894());
        }
        for (int i2 = 0; i2 < this.f21212.size(); i2++) {
            iM35772 += AbstractC14846.m35774(EnumC5810.f19979, (InterfaceC18775) this.f21212.get(i2));
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
        if (!(obj instanceof C6250)) {
            return super.equals(obj);
        }
        C6250 c6250 = (C6250) obj;
        if (m17888() != c6250.m17888()) {
            return false;
        }
        if ((m17888() && this.f21211 != c6250.f21211) || m17891() != c6250.m17891()) {
            return false;
        }
        if ((m17891() && this.f21214 != c6250.f21214) || m17895() != c6250.m17895()) {
            return false;
        }
        if ((m17895() && this.f21210 != c6250.f21210) || m17897() != c6250.m17897()) {
            return false;
        }
        if ((m17897() && this.f21217 != c6250.f21217) || m17890() != c6250.m17890()) {
            return false;
        }
        if ((!m17890() || this.f21216 == c6250.f21216) && m17889() == c6250.m17889()) {
            return (!m17889() || m17894().equals(c6250.m17894())) && this.f21212.equals(c6250.f21212) && getUnknownFields().equals(c6250.getUnknownFields()) && m28526().equals(c6250.m28526());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40277.hashCode() + 779;
        if (m17888()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + C23447.m52661(this.f21211);
        }
        if (m17891()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + C23447.m52661(this.f21214);
        }
        if (m17895()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + C23447.m52661(this.f21210);
        }
        if (m17897()) {
            iHashCode = C18176.m42345(iHashCode, 37, 7, 53) + C23447.m52661(this.f21217);
        }
        if (m17890()) {
            iHashCode = C18176.m42345(iHashCode, 37, 11, 53) + C23447.m52661(this.f21216);
        }
        if (m17889()) {
            iHashCode = C18176.m42345(iHashCode, 37, 12, 53) + m17894().hashCode();
        }
        if (this.f21212.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, EnumC5810.f19979, 53) + this.f21212.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC19124.m44248(iHashCode, m28526()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C12215 newBuilder() {
        return f21209.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f21209.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f21209.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C12215 toBuilder() {
        int i = 0;
        if (this == f21209) {
            return new C12215(i);
        }
        C12215 c12215 = new C12215(i);
        c12215.m30488(this);
        return c12215;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C12215(interfaceC7937, 0);
    }

    public static C6250 getDefaultInstance() {
        return f21209;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f21208;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f21209;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f21209;
    }
}
