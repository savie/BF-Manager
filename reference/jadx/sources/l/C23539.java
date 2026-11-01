package l;

import moe.shizuku.server.IShizukuApplication;

/* JADX INFO: renamed from: l.᩻ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23539 extends AbstractC6229 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C23539 f76219;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f76220;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f76221 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f76222;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f76223;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f76224;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f76225;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f76226;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f76227;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f76228;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f76229;

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        C17518 c17518 = new C17518(this);
        if ((this.f76228 & 1) != 0) {
            abstractC22044.mo14252(1, this.f76226);
        }
        if ((this.f76228 & 2) != 0) {
            abstractC22044.mo14252(2, this.f76222);
        }
        if ((this.f76228 & 4) != 0) {
            abstractC22044.mo14252(3, this.f76224);
        }
        if ((this.f76228 & 8) != 0) {
            abstractC22044.mo14252(4, this.f76229);
        }
        if ((this.f76228 & 16) != 0) {
            abstractC22044.mo14252(5, this.f76223);
        }
        if ((this.f76228 & 32) != 0) {
            abstractC22044.mo14252(6, this.f76225);
        }
        c17518.m40779(IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation, abstractC22044);
        getUnknownFields().writeTo(abstractC22044);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C23539.class.getName());
        f76219 = new C23539();
        f76220 = new C8016();
    }

    public C23539(C19305 c19305) {
        super(c19305);
        this.f76226 = 0;
        this.f76222 = 0;
        this.f76224 = 0;
        this.f76229 = 0;
        this.f76223 = 0;
        this.f76225 = 0;
        this.f76227 = (byte) -1;
    }

    public C23539() {
        this.f76227 = (byte) -1;
        this.f76226 = 0;
        this.f76222 = 0;
        this.f76224 = 0;
        this.f76229 = 0;
        this.f76223 = 0;
        this.f76225 = 0;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46279;
        c6956.m18696(C23539.class, C19305.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m51873() {
        return (this.f76228 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC20716 m51875() {
        EnumC20716 enumC20716M46566 = EnumC20716.m46566(this.f76226);
        return enumC20716M46566 == null ? EnumC20716.FIELD_PRESENCE_UNKNOWN : enumC20716M46566;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m51879() {
        return (this.f76228 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final EnumC10133 m51882() {
        EnumC10133 enumC10133M25756 = EnumC10133.m25756(this.f76222);
        return enumC10133M25756 == null ? EnumC10133.ENUM_TYPE_UNKNOWN : enumC10133M25756;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m51880() {
        return (this.f76228 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC17188 m51878() {
        EnumC17188 enumC17188M40106 = EnumC17188.m40106(this.f76224);
        return enumC17188M40106 == null ? EnumC17188.REPEATED_FIELD_ENCODING_UNKNOWN : enumC17188M40106;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m51876() {
        return (this.f76228 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final EnumC10839 m51872() {
        EnumC10839 enumC10839M27163 = EnumC10839.m27163(this.f76229);
        return enumC10839M27163 == null ? EnumC10839.UTF8_VALIDATION_UNKNOWN : enumC10839M27163;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m51871() {
        return (this.f76228 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC16483 m51877() {
        EnumC16483 enumC16483M38745 = EnumC16483.m38745(this.f76223);
        return enumC16483M38745 == null ? EnumC16483.MESSAGE_ENCODING_UNKNOWN : enumC16483M38745;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m51874() {
        return (this.f76228 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC20011 m51881() {
        EnumC20011 enumC20011M45309 = EnumC20011.m45309(this.f76225);
        return enumC20011M45309 == null ? EnumC20011.JSON_FORMAT_UNKNOWN : enumC20011M45309;
    }

    @Override // l.AbstractC6229, l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f76227;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m17285()) {
            this.f76227 = (byte) 0;
            return false;
        }
        this.f76227 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48966 = (this.f76228 & 1) != 0 ? AbstractC22044.m48966(1, this.f76226) : 0;
        if ((this.f76228 & 2) != 0) {
            iM48966 += AbstractC22044.m48966(2, this.f76222);
        }
        if ((this.f76228 & 4) != 0) {
            iM48966 += AbstractC22044.m48966(3, this.f76224);
        }
        if ((this.f76228 & 8) != 0) {
            iM48966 += AbstractC22044.m48966(4, this.f76229);
        }
        if ((this.f76228 & 16) != 0) {
            iM48966 += AbstractC22044.m48966(5, this.f76223);
        }
        if ((this.f76228 & 32) != 0) {
            iM48966 += AbstractC22044.m48966(6, this.f76225);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48966 + m17282();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23539)) {
            return super.equals(obj);
        }
        C23539 c23539 = (C23539) obj;
        if (m51873() != c23539.m51873()) {
            return false;
        }
        if ((m51873() && this.f76226 != c23539.f76226) || m51879() != c23539.m51879()) {
            return false;
        }
        if ((m51879() && this.f76222 != c23539.f76222) || m51880() != c23539.m51880()) {
            return false;
        }
        if ((m51880() && this.f76224 != c23539.f76224) || m51876() != c23539.m51876()) {
            return false;
        }
        if ((m51876() && this.f76229 != c23539.f76229) || m51871() != c23539.m51871()) {
            return false;
        }
        if ((!m51871() || this.f76223 == c23539.f76223) && m51874() == c23539.m51874()) {
            return (!m51874() || this.f76225 == c23539.f76225) && getUnknownFields().equals(c23539.getUnknownFields()) && m17283().equals(c23539.m17283());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46308.hashCode() + 779;
        if (m51873()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.f76226;
        }
        if (m51879()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f76222;
        }
        if (m51880()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + this.f76224;
        }
        if (m51876()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + this.f76229;
        }
        if (m51871()) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + this.f76223;
        }
        if (m51874()) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + this.f76225;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC23019.m50911(iHashCode, m17283()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23539 m51865(AbstractC23725 abstractC23725, C4818 c4818) {
        return (C23539) ((C8016) f76220).parseFrom(abstractC23725, (C2701) c4818);
    }

    public static C19305 newBuilder() {
        return f76219.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f76219.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f76219.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C19305 toBuilder() {
        int i = 0;
        if (this == f76219) {
            return new C19305(i);
        }
        C19305 c19305 = new C19305(i);
        c19305.m44291(this);
        return c19305;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C19305(interfaceC6790, 0);
    }

    public static C23539 getDefaultInstance() {
        return f76219;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f76220;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f76219;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f76219;
    }
}
