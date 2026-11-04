package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2826 extends AbstractC11272 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f9278 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f9279;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C2826 f9280;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16471 f9281;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public byte f9282;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f9283;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f9284;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f9285;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f9286;

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        C1578 c1578 = new C1578(this);
        for (int i = 0; i < this.f9284.size(); i++) {
            abstractC14846.mo14025(2, (InterfaceC18775) this.f9284.get(i));
        }
        if ((this.f9286 & 2) != 0) {
            abstractC14846.mo14022(3, this.f9283);
        }
        if ((this.f9286 & 1) != 0) {
            abstractC14846.mo14025(50, m9309());
        }
        for (int i2 = 0; i2 < this.f9285.size(); i2++) {
            abstractC14846.mo14025(EnumC5810.f19979, (InterfaceC18775) this.f9285.get(i2));
        }
        c1578.m5597(536870912, abstractC14846);
        getUnknownFields().writeTo(abstractC14846);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C2826.class.getName());
        f9280 = new C2826();
        f9279 = new C18488();
    }

    public C2826(C0589 c0589) {
        super(c0589);
        this.f9283 = 1;
        this.f9282 = (byte) -1;
    }

    public C2826() {
        this.f9283 = 1;
        this.f9282 = (byte) -1;
        List list = Collections.EMPTY_LIST;
        this.f9285 = list;
        this.f9284 = list;
        this.f9283 = 1;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40279;
        c7544.m20621(C2826.class, C0589.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m9308() {
        return (this.f9286 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16471 m9309() {
        C16471 c16471 = this.f9281;
        return c16471 == null ? C16471.getDefaultInstance() : c16471;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m9306() {
        return (this.f9286 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC9537 m9307() {
        EnumC9537 enumC9537M24952 = EnumC9537.m24952(this.f9283);
        return enumC9537M24952 == null ? EnumC9537.UNVERIFIED : enumC9537M24952;
    }

    @Override // l.AbstractC11272, l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f9282;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f9285.size(); i++) {
            if (!((C20748) this.f9285.get(i)).isInitialized()) {
                this.f9282 = (byte) 0;
                return false;
            }
        }
        if (m9308() && !m9309().isInitialized()) {
            this.f9282 = (byte) 0;
            return false;
        }
        if (!m28524()) {
            this.f9282 = (byte) 0;
            return false;
        }
        this.f9282 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35774 = 0;
        for (int i2 = 0; i2 < this.f9284.size(); i2++) {
            iM35774 += AbstractC14846.m35774(2, (InterfaceC18775) this.f9284.get(i2));
        }
        if ((this.f9286 & 2) != 0) {
            iM35774 += AbstractC14846.m35768(3, this.f9283);
        }
        if ((this.f9286 & 1) != 0) {
            iM35774 += AbstractC14846.m35774(50, m9309());
        }
        for (int i3 = 0; i3 < this.f9285.size(); i3++) {
            iM35774 += AbstractC14846.m35774(EnumC5810.f19979, (InterfaceC18775) this.f9285.get(i3));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35774 + m28523();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2826)) {
            return super.equals(obj);
        }
        C2826 c2826 = (C2826) obj;
        if (!this.f9285.equals(c2826.f9285) || !this.f9284.equals(c2826.f9284) || m9308() != c2826.m9308()) {
            return false;
        }
        if ((!m9308() || m9309().equals(c2826.m9309())) && m9306() == c2826.m9306()) {
            return (!m9306() || this.f9283 == c2826.f9283) && getUnknownFields().equals(c2826.getUnknownFields()) && m28526().equals(c2826.m28526());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40255.hashCode() + 779;
        if (this.f9285.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, EnumC5810.f19979, 53) + this.f9285.hashCode();
        }
        if (this.f9284.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f9284.hashCode();
        }
        if (m9308()) {
            iHashCode = C18176.m42345(iHashCode, 37, 50, 53) + m9309().hashCode();
        }
        if (m9306()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + this.f9283;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC19124.m44248(iHashCode, m28526()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C0589 newBuilder() {
        return f9280.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f9280.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f9280.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C0589 toBuilder() {
        int i = 0;
        if (this == f9280) {
            return new C0589(i);
        }
        C0589 c0589 = new C0589(i);
        c0589.m2682(this);
        return c0589;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C0589(interfaceC7937, 0);
    }

    public static C2826 getDefaultInstance() {
        return f9280;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f9279;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f9280;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f9280;
    }
}
