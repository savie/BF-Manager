package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12727 extends AbstractC6229 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f42444;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f42445 = 0;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final C12727 f42446;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f42447;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte f42448;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f42449;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f42450;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public List f42451;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C10611 f42452;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f42453;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C23539 f42454;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f42455;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f42456;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public List f42457;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f42458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f42459;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f42460;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42461;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f42462;

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        C17518 c17518 = new C17518(this);
        if ((this.f42461 & 1) != 0) {
            abstractC22044.mo14252(1, this.f42447);
        }
        if ((this.f42461 & 2) != 0) {
            abstractC22044.mo14240(2, this.f42453);
        }
        if ((this.f42461 & 32) != 0) {
            abstractC22044.mo14240(3, this.f42456);
        }
        if ((this.f42461 & 8) != 0) {
            abstractC22044.mo14240(5, this.f42458);
        }
        if ((this.f42461 & 4) != 0) {
            abstractC22044.mo14252(6, this.f42462);
        }
        if ((this.f42461 & 64) != 0) {
            abstractC22044.mo14240(10, this.f42449);
        }
        if ((this.f42461 & 16) != 0) {
            abstractC22044.mo14240(15, this.f42455);
        }
        if ((this.f42461 & 128) != 0) {
            abstractC22044.mo14240(16, this.f42459);
        }
        if ((this.f42461 & 256) != 0) {
            abstractC22044.mo14252(17, this.f42450);
        }
        for (int i = 0; i < this.f42451.size(); i++) {
            abstractC22044.mo14252(19, ((Integer) this.f42451.get(i)).intValue());
        }
        for (int i2 = 0; i2 < this.f42460.size(); i2++) {
            abstractC22044.mo14254(20, (InterfaceC23206) this.f42460.get(i2));
        }
        if ((this.f42461 & 512) != 0) {
            abstractC22044.mo14254(21, m31615());
        }
        if ((this.f42461 & 1024) != 0) {
            abstractC22044.mo14254(22, m31614());
        }
        for (int i3 = 0; i3 < this.f42457.size(); i3++) {
            abstractC22044.mo14254(EnumC12167.f40728, (InterfaceC23206) this.f42457.get(i3));
        }
        c17518.m40779(536870912, abstractC22044);
        getUnknownFields().writeTo(abstractC22044);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C12727.class.getName());
        f42446 = new C12727();
        f42444 = new C7082();
    }

    public C12727(C23311 c23311) {
        super(c23311);
        this.f42447 = 0;
        this.f42453 = false;
        this.f42462 = 0;
        this.f42458 = false;
        this.f42455 = false;
        this.f42456 = false;
        this.f42449 = false;
        this.f42459 = false;
        this.f42450 = 0;
        this.f42448 = (byte) -1;
    }

    public C12727() {
        this.f42453 = false;
        this.f42458 = false;
        this.f42455 = false;
        this.f42456 = false;
        this.f42449 = false;
        this.f42459 = false;
        this.f42448 = (byte) -1;
        this.f42447 = 0;
        this.f42462 = 0;
        this.f42450 = 0;
        List list = Collections.EMPTY_LIST;
        this.f42451 = list;
        this.f42460 = list;
        this.f42457 = list;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46300;
        c6956.m18696(C12727.class, C23311.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m31611() {
        return (this.f42461 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final EnumC21899 m31620() {
        EnumC21899 enumC21899M48691 = EnumC21899.m48691(this.f42447);
        return enumC21899M48691 == null ? EnumC21899.STRING : enumC21899M48691;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m31607() {
        return (this.f42461 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m31605() {
        return this.f42453;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m31613() {
        return (this.f42461 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final EnumC21193 m31604() {
        EnumC21193 enumC21193M47646 = EnumC21193.m47646(this.f42462);
        return enumC21193M47646 == null ? EnumC21193.JS_NORMAL : enumC21193M47646;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m31602() {
        return (this.f42461 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m31616() {
        return this.f42458;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m31609() {
        return (this.f42461 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m31603() {
        return this.f42455;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m31600() {
        return (this.f42461 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m31619() {
        return this.f42456;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31601() {
        return (this.f42461 & 64) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m31618() {
        return this.f42449;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m31617() {
        return (this.f42461 & 128) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m31610() {
        return this.f42459;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m31621() {
        return (this.f42461 & 256) != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC20488 m31606() {
        EnumC20488 enumC20488M46289 = EnumC20488.m46289(this.f42450);
        return enumC20488M46289 == null ? EnumC20488.RETENTION_UNKNOWN : enumC20488M46289;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m31608() {
        return (this.f42461 & 512) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23539 m31615() {
        C23539 c23539 = this.f42454;
        return c23539 == null ? C23539.getDefaultInstance() : c23539;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m31612() {
        return (this.f42461 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10611 m31614() {
        C10611 c10611 = this.f42452;
        return c10611 == null ? C10611.getDefaultInstance() : c10611;
    }

    @Override // l.AbstractC6229, l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f42448;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m31608() || m31615().isInitialized()) {
            for (int i = 0; i < this.f42457.size(); i++) {
                if (!((C4923) this.f42457.get(i)).isInitialized()) {
                    this.f42448 = (byte) 0;
                    return false;
                }
            }
            if (!m17285()) {
                this.f42448 = (byte) 0;
                return false;
            }
            this.f42448 = (byte) 1;
            return true;
        }
        this.f42448 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48966 = (this.f42461 & 1) != 0 ? AbstractC22044.m48966(1, this.f42447) : 0;
        if ((this.f42461 & 2) != 0) {
            iM48966 += AbstractC22044.m48961(2);
        }
        if ((this.f42461 & 32) != 0) {
            iM48966 += AbstractC22044.m48961(3);
        }
        if ((this.f42461 & 8) != 0) {
            iM48966 += AbstractC22044.m48961(5);
        }
        if ((this.f42461 & 4) != 0) {
            iM48966 += AbstractC22044.m48966(6, this.f42462);
        }
        if ((this.f42461 & 64) != 0) {
            iM48966 += AbstractC22044.m48961(10);
        }
        if ((this.f42461 & 16) != 0) {
            iM48966 += AbstractC22044.m48961(15);
        }
        if ((this.f42461 & 128) != 0) {
            iM48966 += AbstractC22044.m48961(16);
        }
        if ((this.f42461 & 256) != 0) {
            iM48966 += AbstractC22044.m48966(17, this.f42450);
        }
        int iM48969 = 0;
        for (int i2 = 0; i2 < this.f42451.size(); i2++) {
            iM48969 += AbstractC22044.m48969(((Integer) this.f42451.get(i2)).intValue());
        }
        int size = (this.f42451.size() * 2) + iM48966 + iM48969;
        for (int i3 = 0; i3 < this.f42460.size(); i3++) {
            size += AbstractC22044.m48963(20, (InterfaceC23206) this.f42460.get(i3));
        }
        if ((this.f42461 & 512) != 0) {
            size += AbstractC22044.m48963(21, m31615());
        }
        if ((this.f42461 & 1024) != 0) {
            size += AbstractC22044.m48963(22, m31614());
        }
        for (int i4 = 0; i4 < this.f42457.size(); i4++) {
            size += AbstractC22044.m48963(EnumC12167.f40728, (InterfaceC23206) this.f42457.get(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size + m17282();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12727)) {
            return super.equals(obj);
        }
        C12727 c12727 = (C12727) obj;
        if (m31611() != c12727.m31611()) {
            return false;
        }
        if ((m31611() && this.f42447 != c12727.f42447) || m31607() != c12727.m31607()) {
            return false;
        }
        if ((m31607() && this.f42453 != c12727.f42453) || m31613() != c12727.m31613()) {
            return false;
        }
        if ((m31613() && this.f42462 != c12727.f42462) || m31602() != c12727.m31602()) {
            return false;
        }
        if ((m31602() && this.f42458 != c12727.f42458) || m31609() != c12727.m31609()) {
            return false;
        }
        if ((m31609() && this.f42455 != c12727.f42455) || m31600() != c12727.m31600()) {
            return false;
        }
        if ((m31600() && this.f42456 != c12727.f42456) || m31601() != c12727.m31601()) {
            return false;
        }
        if ((m31601() && this.f42449 != c12727.f42449) || m31617() != c12727.m31617()) {
            return false;
        }
        if ((m31617() && this.f42459 != c12727.f42459) || m31621() != c12727.m31621()) {
            return false;
        }
        if ((m31621() && this.f42450 != c12727.f42450) || !this.f42451.equals(c12727.f42451) || !this.f42460.equals(c12727.f42460) || m31608() != c12727.m31608()) {
            return false;
        }
        if ((!m31608() || m31615().equals(c12727.m31615())) && m31612() == c12727.m31612()) {
            return (!m31612() || m31614().equals(c12727.m31614())) && this.f42457.equals(c12727.f42457) && getUnknownFields().equals(c12727.getUnknownFields()) && m17283().equals(c12727.m17283());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46276.hashCode() + 779;
        if (m31611()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.f42447;
        }
        if (m31607()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + C9779.m24888(this.f42453);
        }
        if (m31613()) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + this.f42462;
        }
        if (m31602()) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + C9779.m24888(this.f42458);
        }
        if (m31609()) {
            iHashCode = C17922.m41614(iHashCode, 37, 15, 53) + C9779.m24888(this.f42455);
        }
        if (m31600()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + C9779.m24888(this.f42456);
        }
        if (m31601()) {
            iHashCode = C17922.m41614(iHashCode, 37, 10, 53) + C9779.m24888(this.f42449);
        }
        if (m31617()) {
            iHashCode = C17922.m41614(iHashCode, 37, 16, 53) + C9779.m24888(this.f42459);
        }
        if (m31621()) {
            iHashCode = C17922.m41614(iHashCode, 37, 17, 53) + this.f42450;
        }
        if (this.f42451.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 19, 53) + this.f42451.hashCode();
        }
        if (this.f42460.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 20, 53) + this.f42460.hashCode();
        }
        if (m31608()) {
            iHashCode = C17922.m41614(iHashCode, 37, 21, 53) + m31615().hashCode();
        }
        if (m31612()) {
            iHashCode = C17922.m41614(iHashCode, 37, 22, 53) + m31614().hashCode();
        }
        if (this.f42457.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, EnumC12167.f40728, 53) + this.f42457.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC23019.m50911(iHashCode, m17283()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C23311 newBuilder() {
        return f42446.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f42446.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f42446.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C23311 toBuilder() {
        int i = 0;
        if (this == f42446) {
            return new C23311(i);
        }
        C23311 c23311 = new C23311(i);
        c23311.m51391(this);
        return c23311;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C23311(interfaceC6790, 0);
    }

    public static C12727 getDefaultInstance() {
        return f42446;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f42444;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f42446;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f42446;
    }
}
