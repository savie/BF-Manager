package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18599 extends AbstractC6229 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59166 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f59167;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C18599 f59168;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f59169;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f59170;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte f59171;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23539 f59172;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f59173;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f59174;

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        C17518 c17518 = new C17518(this);
        for (int i = 0; i < this.f59169.size(); i++) {
            abstractC22044.mo14254(2, (InterfaceC23206) this.f59169.get(i));
        }
        if ((this.f59174 & 2) != 0) {
            abstractC22044.mo14252(3, this.f59170);
        }
        if ((this.f59174 & 1) != 0) {
            abstractC22044.mo14254(50, m43008());
        }
        for (int i2 = 0; i2 < this.f59173.size(); i2++) {
            abstractC22044.mo14254(EnumC12167.f40728, (InterfaceC23206) this.f59173.get(i2));
        }
        c17518.m40779(536870912, abstractC22044);
        getUnknownFields().writeTo(abstractC22044);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C18599.class.getName());
        f59168 = new C18599();
        f59167 = new C12955();
    }

    public C18599(C3781 c3781) {
        super(c3781);
        this.f59170 = 1;
        this.f59171 = (byte) -1;
    }

    public C18599() {
        this.f59170 = 1;
        this.f59171 = (byte) -1;
        List list = Collections.EMPTY_LIST;
        this.f59173 = list;
        this.f59169 = list;
        this.f59170 = 1;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46304;
        c6956.m18696(C18599.class, C3781.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m43007() {
        return (this.f59174 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C23539 m43008() {
        C23539 c23539 = this.f59172;
        return c23539 == null ? C23539.getDefaultInstance() : c23539;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m43006() {
        return (this.f59174 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC17893 m43005() {
        EnumC17893 enumC17893M41521 = EnumC17893.m41521(this.f59170);
        return enumC17893M41521 == null ? EnumC17893.UNVERIFIED : enumC17893M41521;
    }

    @Override // l.AbstractC6229, l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f59171;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f59173.size(); i++) {
            if (!((C4923) this.f59173.get(i)).isInitialized()) {
                this.f59171 = (byte) 0;
                return false;
            }
        }
        if (m43007() && !m43008().isInitialized()) {
            this.f59171 = (byte) 0;
            return false;
        }
        if (!m17285()) {
            this.f59171 = (byte) 0;
            return false;
        }
        this.f59171 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48963 = 0;
        for (int i2 = 0; i2 < this.f59169.size(); i2++) {
            iM48963 += AbstractC22044.m48963(2, (InterfaceC23206) this.f59169.get(i2));
        }
        if ((this.f59174 & 2) != 0) {
            iM48963 += AbstractC22044.m48966(3, this.f59170);
        }
        if ((this.f59174 & 1) != 0) {
            iM48963 += AbstractC22044.m48963(50, m43008());
        }
        for (int i3 = 0; i3 < this.f59173.size(); i3++) {
            iM48963 += AbstractC22044.m48963(EnumC12167.f40728, (InterfaceC23206) this.f59173.get(i3));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48963 + m17282();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18599)) {
            return super.equals(obj);
        }
        C18599 c18599 = (C18599) obj;
        if (!this.f59173.equals(c18599.f59173) || !this.f59169.equals(c18599.f59169) || m43007() != c18599.m43007()) {
            return false;
        }
        if ((!m43007() || m43008().equals(c18599.m43008())) && m43006() == c18599.m43006()) {
            return (!m43006() || this.f59170 == c18599.f59170) && getUnknownFields().equals(c18599.getUnknownFields()) && m17283().equals(c18599.m17283());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46318.hashCode() + 779;
        if (this.f59173.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, EnumC12167.f40728, 53) + this.f59173.hashCode();
        }
        if (this.f59169.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f59169.hashCode();
        }
        if (m43007()) {
            iHashCode = C17922.m41614(iHashCode, 37, 50, 53) + m43008().hashCode();
        }
        if (m43006()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + this.f59170;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC23019.m50911(iHashCode, m17283()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C3781 newBuilder() {
        return f59168.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f59168.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f59168.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C3781 toBuilder() {
        int i = 0;
        if (this == f59168) {
            return new C3781(i);
        }
        C3781 c3781 = new C3781(i);
        c3781.m11032(this);
        return c3781;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C3781(interfaceC6790, 0);
    }

    public static C18599 getDefaultInstance() {
        return f59168;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f59167;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f59168;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f59168;
    }
}
