package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11792 extends AbstractC6229 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C11792 f39585;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f39586;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f39587;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte f39588;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f39589;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23539 f39590;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f39591;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f39592;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f39593;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f39594;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f39595;

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        C17518 c17518 = new C17518(this);
        if ((this.f39594 & 1) != 0) {
            abstractC22044.mo14240(1, this.f39589);
        }
        if ((this.f39594 & 2) != 0) {
            abstractC22044.mo14240(2, this.f39595);
        }
        if ((this.f39594 & 4) != 0) {
            abstractC22044.mo14240(3, this.f39592);
        }
        if ((this.f39594 & 8) != 0) {
            abstractC22044.mo14240(7, this.f39593);
        }
        if ((this.f39594 & 16) != 0) {
            abstractC22044.mo14240(11, this.f39587);
        }
        if ((this.f39594 & 32) != 0) {
            abstractC22044.mo14254(12, m29475());
        }
        for (int i = 0; i < this.f39591.size(); i++) {
            abstractC22044.mo14254(EnumC12167.f40728, (InterfaceC23206) this.f39591.get(i));
        }
        c17518.m40779(536870912, abstractC22044);
        getUnknownFields().writeTo(abstractC22044);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C11792.class.getName());
        f39585 = new C11792();
        f39586 = new C4735();
    }

    public C11792(C13909 c13909) {
        super(c13909);
        this.f39589 = false;
        this.f39595 = false;
        this.f39592 = false;
        this.f39593 = false;
        this.f39587 = false;
        this.f39588 = (byte) -1;
    }

    public C11792() {
        this.f39589 = false;
        this.f39595 = false;
        this.f39592 = false;
        this.f39593 = false;
        this.f39587 = false;
        this.f39588 = (byte) -1;
        this.f39591 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46298;
        c6956.m18696(C11792.class, C13909.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m29474() {
        return (this.f39594 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m29472() {
        return this.f39589;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m29470() {
        return (this.f39594 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m29466() {
        return this.f39595;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m29473() {
        return (this.f39594 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m29476() {
        return this.f39592;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m29465() {
        return (this.f39594 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m29471() {
        return this.f39593;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m29467() {
        return (this.f39594 & 16) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m29469() {
        return this.f39587;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m29468() {
        return (this.f39594 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23539 m29475() {
        C23539 c23539 = this.f39590;
        return c23539 == null ? C23539.getDefaultInstance() : c23539;
    }

    @Override // l.AbstractC6229, l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f39588;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m29468() || m29475().isInitialized()) {
            for (int i = 0; i < this.f39591.size(); i++) {
                if (!((C4923) this.f39591.get(i)).isInitialized()) {
                    this.f39588 = (byte) 0;
                    return false;
                }
            }
            if (!m17285()) {
                this.f39588 = (byte) 0;
                return false;
            }
            this.f39588 = (byte) 1;
            return true;
        }
        this.f39588 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48961 = (this.f39594 & 1) != 0 ? AbstractC22044.m48961(1) : 0;
        if ((this.f39594 & 2) != 0) {
            iM48961 += AbstractC22044.m48961(2);
        }
        if ((this.f39594 & 4) != 0) {
            iM48961 += AbstractC22044.m48961(3);
        }
        if ((this.f39594 & 8) != 0) {
            iM48961 += AbstractC22044.m48961(7);
        }
        if ((this.f39594 & 16) != 0) {
            iM48961 += AbstractC22044.m48961(11);
        }
        if ((this.f39594 & 32) != 0) {
            iM48961 += AbstractC22044.m48963(12, m29475());
        }
        for (int i2 = 0; i2 < this.f39591.size(); i2++) {
            iM48961 += AbstractC22044.m48963(EnumC12167.f40728, (InterfaceC23206) this.f39591.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48961 + m17282();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11792)) {
            return super.equals(obj);
        }
        C11792 c11792 = (C11792) obj;
        if (m29474() != c11792.m29474()) {
            return false;
        }
        if ((m29474() && this.f39589 != c11792.f39589) || m29470() != c11792.m29470()) {
            return false;
        }
        if ((m29470() && this.f39595 != c11792.f39595) || m29473() != c11792.m29473()) {
            return false;
        }
        if ((m29473() && this.f39592 != c11792.f39592) || m29465() != c11792.m29465()) {
            return false;
        }
        if ((m29465() && this.f39593 != c11792.f39593) || m29467() != c11792.m29467()) {
            return false;
        }
        if ((!m29467() || this.f39587 == c11792.f39587) && m29468() == c11792.m29468()) {
            return (!m29468() || m29475().equals(c11792.m29475())) && this.f39591.equals(c11792.f39591) && getUnknownFields().equals(c11792.getUnknownFields()) && m17283().equals(c11792.m17283());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46268.hashCode() + 779;
        if (m29474()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + C9779.m24888(this.f39589);
        }
        if (m29470()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + C9779.m24888(this.f39595);
        }
        if (m29473()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + C9779.m24888(this.f39592);
        }
        if (m29465()) {
            iHashCode = C17922.m41614(iHashCode, 37, 7, 53) + C9779.m24888(this.f39593);
        }
        if (m29467()) {
            iHashCode = C17922.m41614(iHashCode, 37, 11, 53) + C9779.m24888(this.f39587);
        }
        if (m29468()) {
            iHashCode = C17922.m41614(iHashCode, 37, 12, 53) + m29475().hashCode();
        }
        if (this.f39591.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, EnumC12167.f40728, 53) + this.f39591.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC23019.m50911(iHashCode, m17283()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C13909 newBuilder() {
        return f39585.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f39585.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f39585.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C13909 toBuilder() {
        int i = 0;
        if (this == f39585) {
            return new C13909(i);
        }
        C13909 c13909 = new C13909(i);
        c13909.m33744(this);
        return c13909;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C13909(interfaceC6790, 0);
    }

    public static C11792 getDefaultInstance() {
        return f39585;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f39586;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f39585;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f39585;
    }
}
