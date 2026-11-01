package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19553 extends AbstractC6229 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f62833;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C19553 f62834;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23539 f62835;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f62836;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f62837;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62838;

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        C17518 c17518 = new C17518(this);
        if ((this.f62838 & 1) != 0) {
            abstractC22044.mo14254(1, m44649());
        }
        for (int i = 0; i < this.f62836.size(); i++) {
            abstractC22044.mo14254(EnumC12167.f40728, (InterfaceC23206) this.f62836.get(i));
        }
        c17518.m40779(536870912, abstractC22044);
        getUnknownFields().writeTo(abstractC22044);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C19553.class.getName());
        f62834 = new C19553();
        f62833 = new C18847();
    }

    public C19553(C8264 c8264) {
        super(c8264);
        this.f62837 = (byte) -1;
    }

    public C19553() {
        this.f62837 = (byte) -1;
        this.f62836 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46286;
        c6956.m18696(C19553.class, C8264.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m44648() {
        return (this.f62838 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C23539 m44649() {
        C23539 c23539 = this.f62835;
        return c23539 == null ? C23539.getDefaultInstance() : c23539;
    }

    @Override // l.AbstractC6229, l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f62837;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m44648() || m44649().isInitialized()) {
            for (int i = 0; i < this.f62836.size(); i++) {
                if (!((C4923) this.f62836.get(i)).isInitialized()) {
                    this.f62837 = (byte) 0;
                    return false;
                }
            }
            if (!m17285()) {
                this.f62837 = (byte) 0;
                return false;
            }
            this.f62837 = (byte) 1;
            return true;
        }
        this.f62837 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48963 = (this.f62838 & 1) != 0 ? AbstractC22044.m48963(1, m44649()) : 0;
        for (int i2 = 0; i2 < this.f62836.size(); i2++) {
            iM48963 += AbstractC22044.m48963(EnumC12167.f40728, (InterfaceC23206) this.f62836.get(i2));
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
        if (!(obj instanceof C19553)) {
            return super.equals(obj);
        }
        C19553 c19553 = (C19553) obj;
        if (m44648() != c19553.m44648()) {
            return false;
        }
        return (!m44648() || m44649().equals(c19553.m44649())) && this.f62836.equals(c19553.f62836) && getUnknownFields().equals(c19553.getUnknownFields()) && m17283().equals(c19553.m17283());
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46313.hashCode() + 779;
        if (m44648()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + m44649().hashCode();
        }
        if (this.f62836.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, EnumC12167.f40728, 53) + this.f62836.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC23019.m50911(iHashCode, m17283()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C8264 newBuilder() {
        return f62834.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f62834.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f62834.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C8264 toBuilder() {
        int i = 0;
        if (this == f62834) {
            return new C8264(i);
        }
        C8264 c8264 = new C8264(i);
        c8264.m21663(this);
        return c8264;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C8264(interfaceC6790, 0);
    }

    public static C19553 getDefaultInstance() {
        return f62834;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f62833;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f62834;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f62834;
    }
}
