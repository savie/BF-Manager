package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4487 extends AbstractC6229 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f15959;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C4487 f15960;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f15961;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte f15962;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f15963;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f15964;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f15965;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23539 f15966;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f15967;

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        C17518 c17518 = new C17518(this);
        if ((this.f15961 & 1) != 0) {
            abstractC22044.mo14240(2, this.f15967);
        }
        if ((this.f15961 & 2) != 0) {
            abstractC22044.mo14240(3, this.f15964);
        }
        if ((this.f15961 & 4) != 0) {
            abstractC22044.mo14240(6, this.f15965);
        }
        if ((this.f15961 & 8) != 0) {
            abstractC22044.mo14254(7, m12525());
        }
        for (int i = 0; i < this.f15963.size(); i++) {
            abstractC22044.mo14254(EnumC12167.f40728, (InterfaceC23206) this.f15963.get(i));
        }
        c17518.m40779(536870912, abstractC22044);
        getUnknownFields().writeTo(abstractC22044);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C4487.class.getName());
        f15960 = new C4487();
        f15959 = new C9345();
    }

    public C4487(C2993 c2993) {
        super(c2993);
        this.f15967 = false;
        this.f15964 = false;
        this.f15965 = false;
        this.f15962 = (byte) -1;
    }

    public C4487() {
        this.f15967 = false;
        this.f15964 = false;
        this.f15965 = false;
        this.f15962 = (byte) -1;
        this.f15963 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46310;
        c6956.m18696(C4487.class, C2993.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m12526() {
        return (this.f15961 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m12529() {
        return this.f15967;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m12522() {
        return (this.f15961 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m12524() {
        return this.f15964;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m12527() {
        return (this.f15961 & 4) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m12528() {
        return this.f15965;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m12523() {
        return (this.f15961 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23539 m12525() {
        C23539 c23539 = this.f15966;
        return c23539 == null ? C23539.getDefaultInstance() : c23539;
    }

    @Override // l.AbstractC6229, l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f15962;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m12523() || m12525().isInitialized()) {
            for (int i = 0; i < this.f15963.size(); i++) {
                if (!((C4923) this.f15963.get(i)).isInitialized()) {
                    this.f15962 = (byte) 0;
                    return false;
                }
            }
            if (!m17285()) {
                this.f15962 = (byte) 0;
                return false;
            }
            this.f15962 = (byte) 1;
            return true;
        }
        this.f15962 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48961 = (this.f15961 & 1) != 0 ? AbstractC22044.m48961(2) : 0;
        if ((2 & this.f15961) != 0) {
            iM48961 += AbstractC22044.m48961(3);
        }
        if ((this.f15961 & 4) != 0) {
            iM48961 += AbstractC22044.m48961(6);
        }
        if ((this.f15961 & 8) != 0) {
            iM48961 += AbstractC22044.m48963(7, m12525());
        }
        for (int i2 = 0; i2 < this.f15963.size(); i2++) {
            iM48961 += AbstractC22044.m48963(EnumC12167.f40728, (InterfaceC23206) this.f15963.get(i2));
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
        if (!(obj instanceof C4487)) {
            return super.equals(obj);
        }
        C4487 c4487 = (C4487) obj;
        if (m12526() != c4487.m12526()) {
            return false;
        }
        if ((m12526() && this.f15967 != c4487.f15967) || m12522() != c4487.m12522()) {
            return false;
        }
        if ((m12522() && this.f15964 != c4487.f15964) || m12527() != c4487.m12527()) {
            return false;
        }
        if ((!m12527() || this.f15965 == c4487.f15965) && m12523() == c4487.m12523()) {
            return (!m12523() || m12525().equals(c4487.m12525())) && this.f15963.equals(c4487.f15963) && getUnknownFields().equals(c4487.getUnknownFields()) && m17283().equals(c4487.m17283());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46320.hashCode() + 779;
        if (m12526()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + C9779.m24888(this.f15967);
        }
        if (m12522()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + C9779.m24888(this.f15964);
        }
        if (m12527()) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + C9779.m24888(this.f15965);
        }
        if (m12523()) {
            iHashCode = C17922.m41614(iHashCode, 37, 7, 53) + m12525().hashCode();
        }
        if (this.f15963.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, EnumC12167.f40728, 53) + this.f15963.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC23019.m50911(iHashCode, m17283()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C2993 newBuilder() {
        return f15960.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f15960.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f15960.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C2993 toBuilder() {
        int i = 0;
        if (this == f15960) {
            return new C2993(i);
        }
        C2993 c2993 = new C2993(i);
        c2993.m8957(this);
        return c2993;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C2993(interfaceC6790, 0);
    }

    public static C4487 getDefaultInstance() {
        return f15960;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f15959;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f15960;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f15960;
    }
}
