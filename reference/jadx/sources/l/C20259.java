package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20259 extends AbstractC6229 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C20259 f65693;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f65694;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f65695;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte f65696;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23539 f65697;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f65698;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65699;

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        C17518 c17518 = new C17518(this);
        if ((this.f65699 & 2) != 0) {
            abstractC22044.mo14240(33, this.f65695);
        }
        if ((this.f65699 & 1) != 0) {
            abstractC22044.mo14254(34, m45766());
        }
        for (int i = 0; i < this.f65698.size(); i++) {
            abstractC22044.mo14254(EnumC12167.f40728, (InterfaceC23206) this.f65698.get(i));
        }
        c17518.m40779(536870912, abstractC22044);
        getUnknownFields().writeTo(abstractC22044);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C20259.class.getName());
        f65693 = new C20259();
        f65694 = new C20964();
    }

    public C20259(C16026 c16026) {
        super(c16026);
        this.f65695 = false;
        this.f65696 = (byte) -1;
    }

    public C20259() {
        this.f65695 = false;
        this.f65696 = (byte) -1;
        this.f65698 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46284;
        c6956.m18696(C20259.class, C16026.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m45767() {
        return (this.f65699 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23539 m45766() {
        C23539 c23539 = this.f65697;
        return c23539 == null ? C23539.getDefaultInstance() : c23539;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m45768() {
        return (this.f65699 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m45769() {
        return this.f65695;
    }

    @Override // l.AbstractC6229, l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f65696;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m45767() || m45766().isInitialized()) {
            for (int i = 0; i < this.f65698.size(); i++) {
                if (!((C4923) this.f65698.get(i)).isInitialized()) {
                    this.f65696 = (byte) 0;
                    return false;
                }
            }
            if (!m17285()) {
                this.f65696 = (byte) 0;
                return false;
            }
            this.f65696 = (byte) 1;
            return true;
        }
        this.f65696 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48961 = (this.f65699 & 2) != 0 ? AbstractC22044.m48961(33) : 0;
        if ((this.f65699 & 1) != 0) {
            iM48961 += AbstractC22044.m48963(34, m45766());
        }
        for (int i2 = 0; i2 < this.f65698.size(); i2++) {
            iM48961 += AbstractC22044.m48963(EnumC12167.f40728, (InterfaceC23206) this.f65698.get(i2));
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
        if (!(obj instanceof C20259)) {
            return super.equals(obj);
        }
        C20259 c20259 = (C20259) obj;
        if (m45767() != c20259.m45767()) {
            return false;
        }
        if ((!m45767() || m45766().equals(c20259.m45766())) && m45768() == c20259.m45768()) {
            return (!m45768() || this.f65695 == c20259.f65695) && this.f65698.equals(c20259.f65698) && getUnknownFields().equals(c20259.getUnknownFields()) && m17283().equals(c20259.m17283());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46291.hashCode() + 779;
        if (m45767()) {
            iHashCode = C17922.m41614(iHashCode, 37, 34, 53) + m45766().hashCode();
        }
        if (m45768()) {
            iHashCode = C17922.m41614(iHashCode, 37, 33, 53) + C9779.m24888(this.f65695);
        }
        if (this.f65698.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, EnumC12167.f40728, 53) + this.f65698.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC23019.m50911(iHashCode, m17283()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C16026 newBuilder() {
        return f65693.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f65693.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f65693.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C16026 toBuilder() {
        int i = 0;
        if (this == f65693) {
            return new C16026(i);
        }
        C16026 c16026 = new C16026(i);
        c16026.m38006(this);
        return c16026;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C16026(interfaceC6790, 0);
    }

    public static C20259 getDefaultInstance() {
        return f65693;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f65694;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f65693;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f65693;
    }
}
