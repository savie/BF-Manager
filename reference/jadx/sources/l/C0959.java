package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0959 extends AbstractC6229 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f3774;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C0959 f3775;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f3776;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte f3777;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f3778;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10611 f3779;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f3780;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23539 f3781;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f3782;

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        C17518 c17518 = new C17518(this);
        if ((this.f3782 & 1) != 0) {
            abstractC22044.mo14240(1, this.f3780);
        }
        if ((this.f3782 & 2) != 0) {
            abstractC22044.mo14254(2, m3732());
        }
        if ((this.f3782 & 4) != 0) {
            abstractC22044.mo14240(3, this.f3776);
        }
        if ((this.f3782 & 8) != 0) {
            abstractC22044.mo14254(4, m3735());
        }
        for (int i = 0; i < this.f3778.size(); i++) {
            abstractC22044.mo14254(EnumC12167.f40728, (InterfaceC23206) this.f3778.get(i));
        }
        c17518.m40779(536870912, abstractC22044);
        getUnknownFields().writeTo(abstractC22044);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C0959.class.getName());
        f3775 = new C0959();
        f3774 = new C5193();
    }

    public C0959(C22127 c22127) {
        super(c22127);
        this.f3780 = false;
        this.f3776 = false;
        this.f3777 = (byte) -1;
    }

    public C0959() {
        this.f3780 = false;
        this.f3776 = false;
        this.f3777 = (byte) -1;
        this.f3778 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46287;
        c6956.m18696(C0959.class, C22127.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m3729() {
        return (this.f3782 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m3731() {
        return this.f3780;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m3730() {
        return (this.f3782 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23539 m3732() {
        C23539 c23539 = this.f3781;
        return c23539 == null ? C23539.getDefaultInstance() : c23539;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m3733() {
        return (this.f3782 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m3736() {
        return this.f3776;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m3734() {
        return (this.f3782 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10611 m3735() {
        C10611 c10611 = this.f3779;
        return c10611 == null ? C10611.getDefaultInstance() : c10611;
    }

    @Override // l.AbstractC6229, l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f3777;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m3730() || m3732().isInitialized()) {
            for (int i = 0; i < this.f3778.size(); i++) {
                if (!((C4923) this.f3778.get(i)).isInitialized()) {
                    this.f3777 = (byte) 0;
                    return false;
                }
            }
            if (!m17285()) {
                this.f3777 = (byte) 0;
                return false;
            }
            this.f3777 = (byte) 1;
            return true;
        }
        this.f3777 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48961 = (this.f3782 & 1) != 0 ? AbstractC22044.m48961(1) : 0;
        if ((this.f3782 & 2) != 0) {
            iM48961 += AbstractC22044.m48963(2, m3732());
        }
        if ((this.f3782 & 4) != 0) {
            iM48961 += AbstractC22044.m48961(3);
        }
        if ((this.f3782 & 8) != 0) {
            iM48961 += AbstractC22044.m48963(4, m3735());
        }
        for (int i2 = 0; i2 < this.f3778.size(); i2++) {
            iM48961 += AbstractC22044.m48963(EnumC12167.f40728, (InterfaceC23206) this.f3778.get(i2));
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
        if (!(obj instanceof C0959)) {
            return super.equals(obj);
        }
        C0959 c0959 = (C0959) obj;
        if (m3729() != c0959.m3729()) {
            return false;
        }
        if ((m3729() && this.f3780 != c0959.f3780) || m3730() != c0959.m3730()) {
            return false;
        }
        if ((m3730() && !m3732().equals(c0959.m3732())) || m3733() != c0959.m3733()) {
            return false;
        }
        if ((!m3733() || this.f3776 == c0959.f3776) && m3734() == c0959.m3734()) {
            return (!m3734() || m3735().equals(c0959.m3735())) && this.f3778.equals(c0959.f3778) && getUnknownFields().equals(c0959.getUnknownFields()) && m17283().equals(c0959.m17283());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46314.hashCode() + 779;
        if (m3729()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + C9779.m24888(this.f3780);
        }
        if (m3730()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + m3732().hashCode();
        }
        if (m3733()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + C9779.m24888(this.f3776);
        }
        if (m3734()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + m3735().hashCode();
        }
        if (this.f3778.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, EnumC12167.f40728, 53) + this.f3778.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC23019.m50911(iHashCode, m17283()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C22127 newBuilder() {
        return f3775.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f3775.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f3775.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C22127 toBuilder() {
        int i = 0;
        if (this == f3775) {
            return new C22127(i);
        }
        C22127 c22127 = new C22127(i);
        c22127.m49090(this);
        return c22127;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C22127(interfaceC6790, 0);
    }

    public static C0959 getDefaultInstance() {
        return f3775;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f3774;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f3775;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f3775;
    }
}
