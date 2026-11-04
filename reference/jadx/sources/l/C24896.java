package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24896 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final C24896 f80551;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f80552;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f80553;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile Object f80554;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile Object f80555;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f80556;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f80557;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f80558;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC16733 f80559;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C3266 f80560;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f80561;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C25224 f80562;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f80563;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f80564;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f80565;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1072 f80566;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC16733 f80567;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C24896.class.getName());
        f80551 = new C24896();
        f80552 = new C1775();
    }

    public C24896(C11469 c11469, int i) {
        super(c11469);
        this.f80554 = "";
        this.f80555 = "";
        this.f80566 = C1072.m4023();
        this.f80559 = AbstractC9035.m24122();
        this.f80567 = AbstractC9035.m24122();
        this.f80556 = "";
        this.f80564 = 0;
        this.f80565 = (byte) -1;
    }

    public C24896() {
        this.f80554 = "";
        this.f80555 = "";
        this.f80566 = C1072.m4023();
        this.f80559 = AbstractC9035.m24122();
        this.f80567 = AbstractC9035.m24122();
        this.f80556 = "";
        this.f80564 = 0;
        this.f80565 = (byte) -1;
        this.f80554 = "";
        this.f80555 = "";
        this.f80566 = C1072.m4023();
        this.f80559 = AbstractC9035.m24122();
        this.f80567 = AbstractC9035.m24122();
        List list = Collections.EMPTY_LIST;
        this.f80561 = list;
        this.f80553 = list;
        this.f80557 = list;
        this.f80558 = list;
        this.f80556 = "";
        this.f80564 = 0;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40302;
        c7544.m20621(C24896.class, C11469.class);
        return c7544;
    }

    public final boolean hasName() {
        return (this.f80563 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f80554;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f80554 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m55454() {
        return (this.f80563 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m55463() {
        Object obj = this.f80555;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f80555 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m55456() {
        return this.f80566.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m55455(int i) {
        return this.f80566.get(i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m55471() {
        return this.f80559.size();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m55466(int i) {
        return this.f80559.getInt(i);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m55464() {
        return this.f80561.size();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15504 m55470(int i) {
        return (C15504) this.f80561.get(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m55459() {
        return this.f80553.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16250 m55469(int i) {
        return (C16250) this.f80553.get(i);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m55453() {
        return this.f80557.size();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22240 m55462(int i) {
        return (C22240) this.f80557.get(i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m55473() {
        return this.f80558.size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0064 m55458(int i) {
        return (C0064) this.f80558.get(i);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m55472() {
        return (this.f80563 & 4) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3266 m55465() {
        C3266 c3266 = this.f80560;
        return c3266 == null ? C3266.getDefaultInstance() : c3266;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m55461() {
        return (this.f80563 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C25224 m55467() {
        C25224 c25224 = this.f80562;
        return c25224 == null ? C25224.getDefaultInstance() : c25224;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m55468() {
        return (this.f80563 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m55460() {
        Object obj = this.f80556;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f80556 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m55457() {
        return (this.f80563 & 32) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC5810 m55452() {
        EnumC5810 enumC5810M16936 = EnumC5810.m16936(this.f80564);
        return enumC5810M16936 == null ? EnumC5810.EDITION_UNKNOWN : enumC5810M16936;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f80565;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f80561.size(); i++) {
            if (!m55470(i).isInitialized()) {
                this.f80565 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f80553.size(); i2++) {
            if (!m55469(i2).isInitialized()) {
                this.f80565 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f80557.size(); i3++) {
            if (!m55462(i3).isInitialized()) {
                this.f80565 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f80558.size(); i4++) {
            if (!m55458(i4).isInitialized()) {
                this.f80565 = (byte) 0;
                return false;
            }
        }
        if (m55472() && !m55465().isInitialized()) {
            this.f80565 = (byte) 0;
            return false;
        }
        this.f80565 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f80563 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.f80554);
        }
        if ((this.f80563 & 2) != 0) {
            AbstractC9035.m24111(abstractC14846, 2, this.f80555);
        }
        for (int i = 0; i < this.f80566.size(); i++) {
            AbstractC9035.m24111(abstractC14846, 3, this.f80566.mo4025(i));
        }
        for (int i2 = 0; i2 < this.f80561.size(); i2++) {
            abstractC14846.mo14025(4, (InterfaceC18775) this.f80561.get(i2));
        }
        for (int i3 = 0; i3 < this.f80553.size(); i3++) {
            abstractC14846.mo14025(5, (InterfaceC18775) this.f80553.get(i3));
        }
        for (int i4 = 0; i4 < this.f80557.size(); i4++) {
            abstractC14846.mo14025(6, (InterfaceC18775) this.f80557.get(i4));
        }
        for (int i5 = 0; i5 < this.f80558.size(); i5++) {
            abstractC14846.mo14025(7, (InterfaceC18775) this.f80558.get(i5));
        }
        if ((this.f80563 & 4) != 0) {
            abstractC14846.mo14025(8, m55465());
        }
        if ((this.f80563 & 8) != 0) {
            abstractC14846.mo14025(9, m55467());
        }
        for (int i6 = 0; i6 < this.f80559.size(); i6++) {
            abstractC14846.mo14022(10, this.f80559.getInt(i6));
        }
        for (int i7 = 0; i7 < this.f80567.size(); i7++) {
            abstractC14846.mo14022(11, this.f80567.getInt(i7));
        }
        if ((this.f80563 & 16) != 0) {
            AbstractC9035.m24111(abstractC14846, 12, this.f80556);
        }
        if ((this.f80563 & 32) != 0) {
            abstractC14846.mo14022(14, this.f80564);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.f80563 & 1) != 0 ? AbstractC9035.m24096(1, this.f80554) : 0;
        if ((this.f80563 & 2) != 0) {
            iM24096 += AbstractC9035.m24096(2, this.f80555);
        }
        int iM24117 = 0;
        for (int i2 = 0; i2 < this.f80566.size(); i2++) {
            iM24117 += AbstractC9035.m24117(this.f80566.mo4025(i2));
        }
        int size = this.f80566.size() + iM24096 + iM24117;
        for (int i3 = 0; i3 < this.f80561.size(); i3++) {
            size += AbstractC14846.m35774(4, (InterfaceC18775) this.f80561.get(i3));
        }
        for (int i4 = 0; i4 < this.f80553.size(); i4++) {
            size += AbstractC14846.m35774(5, (InterfaceC18775) this.f80553.get(i4));
        }
        for (int i5 = 0; i5 < this.f80557.size(); i5++) {
            size += AbstractC14846.m35774(6, (InterfaceC18775) this.f80557.get(i5));
        }
        for (int i6 = 0; i6 < this.f80558.size(); i6++) {
            size += AbstractC14846.m35774(7, (InterfaceC18775) this.f80558.get(i6));
        }
        if ((this.f80563 & 4) != 0) {
            size += AbstractC14846.m35774(8, m55465());
        }
        if ((this.f80563 & 8) != 0) {
            size += AbstractC14846.m35774(9, m55467());
        }
        int iM35762 = 0;
        for (int i7 = 0; i7 < this.f80559.size(); i7++) {
            iM35762 += AbstractC14846.m35762(this.f80559.getInt(i7));
        }
        int size2 = this.f80559.size() + size + iM35762;
        int iM35763 = 0;
        for (int i8 = 0; i8 < this.f80567.size(); i8++) {
            iM35763 += AbstractC14846.m35762(this.f80567.getInt(i8));
        }
        int size3 = this.f80567.size() + size2 + iM35763;
        if ((this.f80563 & 16) != 0) {
            size3 += AbstractC9035.m24096(12, this.f80556);
        }
        if ((this.f80563 & 32) != 0) {
            size3 += AbstractC14846.m35768(14, this.f80564);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size3;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24896)) {
            return super.equals(obj);
        }
        C24896 c24896 = (C24896) obj;
        if (hasName() != c24896.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c24896.getName())) || m55454() != c24896.m55454()) {
            return false;
        }
        if ((m55454() && !m55463().equals(c24896.m55463())) || !this.f80566.equals(c24896.f80566) || !this.f80559.equals(c24896.f80559) || !this.f80567.equals(c24896.f80567) || !this.f80561.equals(c24896.f80561) || !this.f80553.equals(c24896.f80553) || !this.f80557.equals(c24896.f80557) || !this.f80558.equals(c24896.f80558) || m55472() != c24896.m55472()) {
            return false;
        }
        if ((m55472() && !m55465().equals(c24896.m55465())) || m55461() != c24896.m55461()) {
            return false;
        }
        if ((m55461() && !m55467().equals(c24896.m55467())) || m55468() != c24896.m55468()) {
            return false;
        }
        if ((!m55468() || m55460().equals(c24896.m55460())) && m55457() == c24896.m55457()) {
            return (!m55457() || this.f80564 == c24896.f80564) && getUnknownFields().equals(c24896.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40271.hashCode() + 779;
        if (hasName()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m55454()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + m55463().hashCode();
        }
        if (this.f80566.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + this.f80566.hashCode();
        }
        if (this.f80559.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 10, 53) + this.f80559.hashCode();
        }
        if (this.f80567.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 11, 53) + this.f80567.hashCode();
        }
        if (this.f80561.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + this.f80561.hashCode();
        }
        if (this.f80553.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + this.f80553.hashCode();
        }
        if (this.f80557.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + this.f80557.hashCode();
        }
        if (this.f80558.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 7, 53) + this.f80558.hashCode();
        }
        if (m55472()) {
            iHashCode = C18176.m42345(iHashCode, 37, 8, 53) + m55465().hashCode();
        }
        if (m55461()) {
            iHashCode = C18176.m42345(iHashCode, 37, 9, 53) + m55467().hashCode();
        }
        if (m55468()) {
            iHashCode = C18176.m42345(iHashCode, 37, 12, 53) + m55460().hashCode();
        }
        if (m55457()) {
            iHashCode = C18176.m42345(iHashCode, 37, 14, 53) + this.f80564;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C24896 parseFrom(byte[] bArr) {
        return (C24896) ((C1775) f80552).parseFrom(bArr);
    }

    public static C11469 newBuilder() {
        return f80551.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f80551.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f80551.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C11469 toBuilder() {
        int i = 0;
        if (this == f80551) {
            return new C11469(i);
        }
        C11469 c11469 = new C11469(i);
        c11469.m28837(this);
        return c11469;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C11469(interfaceC7937, 0);
    }

    public static C24896 getDefaultInstance() {
        return f80551;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f80552;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f80551;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f80551;
    }
}
