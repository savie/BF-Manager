package l;

import moe.shizuku.server.IShizukuApplication;

/* JADX INFO: renamed from: l.ܺ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16471 extends AbstractC11272 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53413 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f53414;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C16471 f53415;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f53416;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f53417;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f53418;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f53419;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f53420;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f53421;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f53422;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f53423;

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        C1578 c1578 = new C1578(this);
        if ((this.f53423 & 1) != 0) {
            abstractC14846.mo14022(1, this.f53416);
        }
        if ((this.f53423 & 2) != 0) {
            abstractC14846.mo14022(2, this.f53421);
        }
        if ((this.f53423 & 4) != 0) {
            abstractC14846.mo14022(3, this.f53417);
        }
        if ((this.f53423 & 8) != 0) {
            abstractC14846.mo14022(4, this.f53419);
        }
        if ((this.f53423 & 16) != 0) {
            abstractC14846.mo14022(5, this.f53420);
        }
        if ((this.f53423 & 32) != 0) {
            abstractC14846.mo14022(6, this.f53418);
        }
        c1578.m5597(IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation, abstractC14846);
        getUnknownFields().writeTo(abstractC14846);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C16471.class.getName());
        f53415 = new C16471();
        f53414 = new C8792();
    }

    public C16471(C7301 c7301) {
        super(c7301);
        this.f53416 = 0;
        this.f53421 = 0;
        this.f53417 = 0;
        this.f53419 = 0;
        this.f53420 = 0;
        this.f53418 = 0;
        this.f53422 = (byte) -1;
    }

    public C16471() {
        this.f53422 = (byte) -1;
        this.f53416 = 0;
        this.f53421 = 0;
        this.f53417 = 0;
        this.f53419 = 0;
        this.f53420 = 0;
        this.f53418 = 0;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40268;
        c7544.m20621(C16471.class, C7301.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m39071() {
        return (this.f53423 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC10504 m39074() {
        EnumC10504 enumC10504M26958 = EnumC10504.m26958(this.f53416);
        return enumC10504M26958 == null ? EnumC10504.FIELD_PRESENCE_UNKNOWN : enumC10504M26958;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m39076() {
        return (this.f53423 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC4539 m39079() {
        EnumC4539 enumC4539M14271 = EnumC4539.m14271(this.f53421);
        return enumC4539M14271 == null ? EnumC4539.ENUM_TYPE_UNKNOWN : enumC4539M14271;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m39069() {
        return (this.f53423 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC1556 m39077() {
        EnumC1556 enumC1556M5486 = EnumC1556.m5486(this.f53417);
        return enumC1556M5486 == null ? EnumC1556.REPEATED_FIELD_ENCODING_UNKNOWN : enumC1556M5486;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39072() {
        return (this.f53423 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final EnumC24677 m39068() {
        EnumC24677 enumC24677M55019 = EnumC24677.m55019(this.f53419);
        return enumC24677M55019 == null ? EnumC24677.UTF8_VALIDATION_UNKNOWN : enumC24677M55019;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m39078() {
        return (this.f53423 & 16) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC12742 m39073() {
        EnumC12742 enumC12742M31553 = EnumC12742.m31553(this.f53420);
        return enumC12742M31553 == null ? EnumC12742.MESSAGE_ENCODING_UNKNOWN : enumC12742M31553;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m39070() {
        return (this.f53423 & 32) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC19455 m39075() {
        EnumC19455 enumC19455M44962 = EnumC19455.m44962(this.f53418);
        return enumC19455M44962 == null ? EnumC19455.JSON_FORMAT_UNKNOWN : enumC19455M44962;
    }

    @Override // l.AbstractC11272, l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f53422;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m28524()) {
            this.f53422 = (byte) 0;
            return false;
        }
        this.f53422 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35768 = (this.f53423 & 1) != 0 ? AbstractC14846.m35768(1, this.f53416) : 0;
        if ((this.f53423 & 2) != 0) {
            iM35768 += AbstractC14846.m35768(2, this.f53421);
        }
        if ((this.f53423 & 4) != 0) {
            iM35768 += AbstractC14846.m35768(3, this.f53417);
        }
        if ((this.f53423 & 8) != 0) {
            iM35768 += AbstractC14846.m35768(4, this.f53419);
        }
        if ((this.f53423 & 16) != 0) {
            iM35768 += AbstractC14846.m35768(5, this.f53420);
        }
        if ((this.f53423 & 32) != 0) {
            iM35768 += AbstractC14846.m35768(6, this.f53418);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35768 + m28523();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16471)) {
            return super.equals(obj);
        }
        C16471 c16471 = (C16471) obj;
        if (m39071() != c16471.m39071()) {
            return false;
        }
        if ((m39071() && this.f53416 != c16471.f53416) || m39076() != c16471.m39076()) {
            return false;
        }
        if ((m39076() && this.f53421 != c16471.f53421) || m39069() != c16471.m39069()) {
            return false;
        }
        if ((m39069() && this.f53417 != c16471.f53417) || m39072() != c16471.m39072()) {
            return false;
        }
        if ((m39072() && this.f53419 != c16471.f53419) || m39078() != c16471.m39078()) {
            return false;
        }
        if ((!m39078() || this.f53420 == c16471.f53420) && m39070() == c16471.m39070()) {
            return (!m39070() || this.f53418 == c16471.f53418) && getUnknownFields().equals(c16471.getUnknownFields()) && m28526().equals(c16471.m28526());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40291.hashCode() + 779;
        if (m39071()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + this.f53416;
        }
        if (m39076()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f53421;
        }
        if (m39069()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + this.f53417;
        }
        if (m39072()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + this.f53419;
        }
        if (m39078()) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + this.f53420;
        }
        if (m39070()) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + this.f53418;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC19124.m44248(iHashCode, m28526()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16471 m39060(AbstractC17084 abstractC17084, C20485 c20485) {
        return (C16471) ((C8792) f53414).parseFrom(abstractC17084, (C24215) c20485);
    }

    public static C7301 newBuilder() {
        return f53415.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f53415.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f53415.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C7301 toBuilder() {
        int i = 0;
        if (this == f53415) {
            return new C7301(i);
        }
        C7301 c7301 = new C7301(i);
        c7301.m19969(this);
        return c7301;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C7301(interfaceC7937, 0);
    }

    public static C16471 getDefaultInstance() {
        return f53415;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f53414;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f53415;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f53415;
    }
}
