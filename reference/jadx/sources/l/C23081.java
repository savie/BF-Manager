package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23081 extends AbstractC6229 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74983 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f74984;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C23081 f74985;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f74986;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f74987;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f74988;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23539 f74989;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f74990;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74991;

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        C17518 c17518 = new C17518(this);
        if ((this.f74991 & 1) != 0) {
            abstractC22044.mo14240(33, this.f74986);
        }
        if ((this.f74991 & 2) != 0) {
            abstractC22044.mo14252(34, this.f74988);
        }
        if ((this.f74991 & 4) != 0) {
            abstractC22044.mo14254(35, m51072());
        }
        for (int i = 0; i < this.f74987.size(); i++) {
            abstractC22044.mo14254(EnumC12167.f40728, (InterfaceC23206) this.f74987.get(i));
        }
        c17518.m40779(536870912, abstractC22044);
        getUnknownFields().writeTo(abstractC22044);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C23081.class.getName());
        f74985 = new C23081();
        f74984 = new C1207();
    }

    public C23081(C13203 c13203) {
        super(c13203);
        this.f74986 = false;
        this.f74988 = 0;
        this.f74990 = (byte) -1;
    }

    public C23081() {
        this.f74986 = false;
        this.f74990 = (byte) -1;
        this.f74988 = 0;
        this.f74987 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46303;
        c6956.m18696(C23081.class, C13203.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m51073() {
        return (this.f74991 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m51076() {
        return this.f74986;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m51071() {
        return (this.f74991 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC6852 m51075() {
        EnumC6852 enumC6852M18468 = EnumC6852.m18468(this.f74988);
        return enumC6852M18468 == null ? EnumC6852.IDEMPOTENCY_UNKNOWN : enumC6852M18468;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m51074() {
        return (this.f74991 & 4) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23539 m51072() {
        C23539 c23539 = this.f74989;
        return c23539 == null ? C23539.getDefaultInstance() : c23539;
    }

    @Override // l.AbstractC6229, l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f74990;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m51074() || m51072().isInitialized()) {
            for (int i = 0; i < this.f74987.size(); i++) {
                if (!((C4923) this.f74987.get(i)).isInitialized()) {
                    this.f74990 = (byte) 0;
                    return false;
                }
            }
            if (!m17285()) {
                this.f74990 = (byte) 0;
                return false;
            }
            this.f74990 = (byte) 1;
            return true;
        }
        this.f74990 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48961 = (this.f74991 & 1) != 0 ? AbstractC22044.m48961(33) : 0;
        if ((this.f74991 & 2) != 0) {
            iM48961 += AbstractC22044.m48966(34, this.f74988);
        }
        if ((this.f74991 & 4) != 0) {
            iM48961 += AbstractC22044.m48963(35, m51072());
        }
        for (int i2 = 0; i2 < this.f74987.size(); i2++) {
            iM48961 += AbstractC22044.m48963(EnumC12167.f40728, (InterfaceC23206) this.f74987.get(i2));
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
        if (!(obj instanceof C23081)) {
            return super.equals(obj);
        }
        C23081 c23081 = (C23081) obj;
        if (m51073() != c23081.m51073()) {
            return false;
        }
        if ((m51073() && this.f74986 != c23081.f74986) || m51071() != c23081.m51071()) {
            return false;
        }
        if ((!m51071() || this.f74988 == c23081.f74988) && m51074() == c23081.m51074()) {
            return (!m51074() || m51072().equals(c23081.m51072())) && this.f74987.equals(c23081.f74987) && getUnknownFields().equals(c23081.getUnknownFields()) && m17283().equals(c23081.m17283());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46325.hashCode() + 779;
        if (m51073()) {
            iHashCode = C17922.m41614(iHashCode, 37, 33, 53) + C9779.m24888(this.f74986);
        }
        if (m51071()) {
            iHashCode = C17922.m41614(iHashCode, 37, 34, 53) + this.f74988;
        }
        if (m51074()) {
            iHashCode = C17922.m41614(iHashCode, 37, 35, 53) + m51072().hashCode();
        }
        if (this.f74987.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, EnumC12167.f40728, 53) + this.f74987.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC23019.m50911(iHashCode, m17283()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C13203 newBuilder() {
        return f74985.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f74985.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f74985.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C13203 toBuilder() {
        int i = 0;
        if (this == f74985) {
            return new C13203(i);
        }
        C13203 c13203 = new C13203(i);
        c13203.m32673(this);
        return c13203;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C13203(interfaceC6790, 0);
    }

    public static C23081 getDefaultInstance() {
        return f74985;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f74984;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f74985;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f74985;
    }
}
