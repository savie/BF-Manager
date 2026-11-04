package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5504 extends AbstractC11272 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f19138;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final C5504 f19139;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19140 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f19141;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C16471 f19142;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f19143;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public List f19144;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f19145;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f19146;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte f19147;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f19148;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4758 f19149;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f19150;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f19151;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f19152;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f19153;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f19154;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public List f19155;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f19156;

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        C1578 c1578 = new C1578(this);
        if ((this.f19154 & 1) != 0) {
            abstractC14846.mo14022(1, this.f19152);
        }
        if ((this.f19154 & 2) != 0) {
            abstractC14846.mo14010(2, this.f19145);
        }
        if ((this.f19154 & 32) != 0) {
            abstractC14846.mo14010(3, this.f19146);
        }
        if ((this.f19154 & 8) != 0) {
            abstractC14846.mo14010(5, this.f19143);
        }
        if ((this.f19154 & 4) != 0) {
            abstractC14846.mo14022(6, this.f19148);
        }
        if ((this.f19154 & 64) != 0) {
            abstractC14846.mo14010(10, this.f19156);
        }
        if ((this.f19154 & 16) != 0) {
            abstractC14846.mo14010(15, this.f19150);
        }
        if ((this.f19154 & 128) != 0) {
            abstractC14846.mo14010(16, this.f19141);
        }
        if ((this.f19154 & 256) != 0) {
            abstractC14846.mo14022(17, this.f19151);
        }
        for (int i = 0; i < this.f19144.size(); i++) {
            abstractC14846.mo14022(19, ((Integer) this.f19144.get(i)).intValue());
        }
        for (int i2 = 0; i2 < this.f19153.size(); i2++) {
            abstractC14846.mo14025(20, (InterfaceC18775) this.f19153.get(i2));
        }
        if ((this.f19154 & 512) != 0) {
            abstractC14846.mo14025(21, m16370());
        }
        if ((this.f19154 & 1024) != 0) {
            abstractC14846.mo14025(22, m16363());
        }
        for (int i3 = 0; i3 < this.f19155.size(); i3++) {
            abstractC14846.mo14025(EnumC5810.f19979, (InterfaceC18775) this.f19155.get(i3));
        }
        c1578.m5597(536870912, abstractC14846);
        getUnknownFields().writeTo(abstractC14846);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C5504.class.getName());
        f19139 = new C5504();
        f19138 = new C7522();
    }

    public C5504(C18709 c18709) {
        super(c18709);
        this.f19152 = 0;
        this.f19145 = false;
        this.f19148 = 0;
        this.f19143 = false;
        this.f19150 = false;
        this.f19146 = false;
        this.f19156 = false;
        this.f19141 = false;
        this.f19151 = 0;
        this.f19147 = (byte) -1;
    }

    public C5504() {
        this.f19145 = false;
        this.f19143 = false;
        this.f19150 = false;
        this.f19146 = false;
        this.f19156 = false;
        this.f19141 = false;
        this.f19147 = (byte) -1;
        this.f19152 = 0;
        this.f19148 = 0;
        this.f19151 = 0;
        List list = Collections.EMPTY_LIST;
        this.f19144 = list;
        this.f19153 = list;
        this.f19155 = list;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40300;
        c7544.m20621(C5504.class, C18709.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16362() {
        return (this.f19154 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC0810 m16372() {
        EnumC0810 enumC0810M3260 = EnumC0810.m3260(this.f19152);
        return enumC0810M3260 == null ? EnumC0810.STRING : enumC0810M3260;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m16352() {
        return (this.f19154 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m16361() {
        return this.f19145;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m16367() {
        return (this.f19154 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final EnumC10723 m16354() {
        EnumC10723 enumC10723M27306 = EnumC10723.m27306(this.f19148);
        return enumC10723M27306 == null ? EnumC10723.JS_NORMAL : enumC10723M27306;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m16360() {
        return (this.f19154 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m16368() {
        return this.f19143;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m16353() {
        return (this.f19154 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m16371() {
        return this.f19150;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m16366() {
        return (this.f19154 & 32) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m16365() {
        return this.f19146;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m16358() {
        return (this.f19154 & 64) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m16355() {
        return this.f19156;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m16369() {
        return (this.f19154 & 128) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m16364() {
        return this.f19141;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m16359() {
        return (this.f19154 & 256) != 0;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final EnumC19674 m16356() {
        EnumC19674 enumC19674M45340 = EnumC19674.m45340(this.f19151);
        return enumC19674M45340 == null ? EnumC19674.RETENTION_UNKNOWN : enumC19674M45340;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m16357() {
        return (this.f19154 & 512) != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16471 m16370() {
        C16471 c16471 = this.f19142;
        return c16471 == null ? C16471.getDefaultInstance() : c16471;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m16351() {
        return (this.f19154 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C4758 m16363() {
        C4758 c4758 = this.f19149;
        return c4758 == null ? C4758.getDefaultInstance() : c4758;
    }

    @Override // l.AbstractC11272, l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f19147;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m16357() || m16370().isInitialized()) {
            for (int i = 0; i < this.f19155.size(); i++) {
                if (!((C20748) this.f19155.get(i)).isInitialized()) {
                    this.f19147 = (byte) 0;
                    return false;
                }
            }
            if (!m28524()) {
                this.f19147 = (byte) 0;
                return false;
            }
            this.f19147 = (byte) 1;
            return true;
        }
        this.f19147 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35768 = (this.f19154 & 1) != 0 ? AbstractC14846.m35768(1, this.f19152) : 0;
        if ((this.f19154 & 2) != 0) {
            iM35768 += AbstractC14846.m35772(2);
        }
        if ((this.f19154 & 32) != 0) {
            iM35768 += AbstractC14846.m35772(3);
        }
        if ((this.f19154 & 8) != 0) {
            iM35768 += AbstractC14846.m35772(5);
        }
        if ((this.f19154 & 4) != 0) {
            iM35768 += AbstractC14846.m35768(6, this.f19148);
        }
        if ((this.f19154 & 64) != 0) {
            iM35768 += AbstractC14846.m35772(10);
        }
        if ((this.f19154 & 16) != 0) {
            iM35768 += AbstractC14846.m35772(15);
        }
        if ((this.f19154 & 128) != 0) {
            iM35768 += AbstractC14846.m35772(16);
        }
        if ((this.f19154 & 256) != 0) {
            iM35768 += AbstractC14846.m35768(17, this.f19151);
        }
        int iM35762 = 0;
        for (int i2 = 0; i2 < this.f19144.size(); i2++) {
            iM35762 += AbstractC14846.m35762(((Integer) this.f19144.get(i2)).intValue());
        }
        int size = (this.f19144.size() * 2) + iM35768 + iM35762;
        for (int i3 = 0; i3 < this.f19153.size(); i3++) {
            size += AbstractC14846.m35774(20, (InterfaceC18775) this.f19153.get(i3));
        }
        if ((this.f19154 & 512) != 0) {
            size += AbstractC14846.m35774(21, m16370());
        }
        if ((this.f19154 & 1024) != 0) {
            size += AbstractC14846.m35774(22, m16363());
        }
        for (int i4 = 0; i4 < this.f19155.size(); i4++) {
            size += AbstractC14846.m35774(EnumC5810.f19979, (InterfaceC18775) this.f19155.get(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size + m28523();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5504)) {
            return super.equals(obj);
        }
        C5504 c5504 = (C5504) obj;
        if (m16362() != c5504.m16362()) {
            return false;
        }
        if ((m16362() && this.f19152 != c5504.f19152) || m16352() != c5504.m16352()) {
            return false;
        }
        if ((m16352() && this.f19145 != c5504.f19145) || m16367() != c5504.m16367()) {
            return false;
        }
        if ((m16367() && this.f19148 != c5504.f19148) || m16360() != c5504.m16360()) {
            return false;
        }
        if ((m16360() && this.f19143 != c5504.f19143) || m16353() != c5504.m16353()) {
            return false;
        }
        if ((m16353() && this.f19150 != c5504.f19150) || m16366() != c5504.m16366()) {
            return false;
        }
        if ((m16366() && this.f19146 != c5504.f19146) || m16358() != c5504.m16358()) {
            return false;
        }
        if ((m16358() && this.f19156 != c5504.f19156) || m16369() != c5504.m16369()) {
            return false;
        }
        if ((m16369() && this.f19141 != c5504.f19141) || m16359() != c5504.m16359()) {
            return false;
        }
        if ((m16359() && this.f19151 != c5504.f19151) || !this.f19144.equals(c5504.f19144) || !this.f19153.equals(c5504.f19153) || m16357() != c5504.m16357()) {
            return false;
        }
        if ((!m16357() || m16370().equals(c5504.m16370())) && m16351() == c5504.m16351()) {
            return (!m16351() || m16363().equals(c5504.m16363())) && this.f19155.equals(c5504.f19155) && getUnknownFields().equals(c5504.getUnknownFields()) && m28526().equals(c5504.m28526());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40258.hashCode() + 779;
        if (m16362()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + this.f19152;
        }
        if (m16352()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + C23447.m52661(this.f19145);
        }
        if (m16367()) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + this.f19148;
        }
        if (m16360()) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + C23447.m52661(this.f19143);
        }
        if (m16353()) {
            iHashCode = C18176.m42345(iHashCode, 37, 15, 53) + C23447.m52661(this.f19150);
        }
        if (m16366()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + C23447.m52661(this.f19146);
        }
        if (m16358()) {
            iHashCode = C18176.m42345(iHashCode, 37, 10, 53) + C23447.m52661(this.f19156);
        }
        if (m16369()) {
            iHashCode = C18176.m42345(iHashCode, 37, 16, 53) + C23447.m52661(this.f19141);
        }
        if (m16359()) {
            iHashCode = C18176.m42345(iHashCode, 37, 17, 53) + this.f19151;
        }
        if (this.f19144.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 19, 53) + this.f19144.hashCode();
        }
        if (this.f19153.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 20, 53) + this.f19153.hashCode();
        }
        if (m16357()) {
            iHashCode = C18176.m42345(iHashCode, 37, 21, 53) + m16370().hashCode();
        }
        if (m16351()) {
            iHashCode = C18176.m42345(iHashCode, 37, 22, 53) + m16363().hashCode();
        }
        if (this.f19155.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, EnumC5810.f19979, 53) + this.f19155.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC19124.m44248(iHashCode, m28526()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C18709 newBuilder() {
        return f19139.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f19139.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f19139.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C18709 toBuilder() {
        int i = 0;
        if (this == f19139) {
            return new C18709(i);
        }
        C18709 c18709 = new C18709(i);
        c18709.m43516(this);
        return c18709;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C18709(interfaceC7937, 0);
    }

    public static C5504 getDefaultInstance() {
        return f19139;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f19138;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f19139;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f19139;
    }
}
