package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20726 extends AbstractC11272 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f66407;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C20726 f66408;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f66409;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f66410;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f66411;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte f66412;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f66413;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16471 f66414;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f66415;

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        C1578 c1578 = new C1578(this);
        if ((this.f66413 & 1) != 0) {
            abstractC14846.mo14010(2, this.f66415);
        }
        if ((this.f66413 & 2) != 0) {
            abstractC14846.mo14010(3, this.f66411);
        }
        if ((this.f66413 & 4) != 0) {
            abstractC14846.mo14010(6, this.f66409);
        }
        if ((this.f66413 & 8) != 0) {
            abstractC14846.mo14025(7, m47399());
        }
        for (int i = 0; i < this.f66410.size(); i++) {
            abstractC14846.mo14025(EnumC5810.f19979, (InterfaceC18775) this.f66410.get(i));
        }
        c1578.m5597(536870912, abstractC14846);
        getUnknownFields().writeTo(abstractC14846);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C20726.class.getName());
        f66408 = new C20726();
        f66407 = new C23710();
    }

    public C20726(C3572 c3572) {
        super(c3572);
        this.f66415 = false;
        this.f66411 = false;
        this.f66409 = false;
        this.f66412 = (byte) -1;
    }

    public C20726() {
        this.f66415 = false;
        this.f66411 = false;
        this.f66409 = false;
        this.f66412 = (byte) -1;
        this.f66410 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40283;
        c7544.m20621(C20726.class, C3572.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m47403() {
        return (this.f66413 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m47404() {
        return this.f66415;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m47397() {
        return (this.f66413 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m47400() {
        return this.f66411;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m47402() {
        return (this.f66413 & 4) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m47401() {
        return this.f66409;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m47398() {
        return (this.f66413 & 8) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C16471 m47399() {
        C16471 c16471 = this.f66414;
        return c16471 == null ? C16471.getDefaultInstance() : c16471;
    }

    @Override // l.AbstractC11272, l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f66412;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m47398() || m47399().isInitialized()) {
            for (int i = 0; i < this.f66410.size(); i++) {
                if (!((C20748) this.f66410.get(i)).isInitialized()) {
                    this.f66412 = (byte) 0;
                    return false;
                }
            }
            if (!m28524()) {
                this.f66412 = (byte) 0;
                return false;
            }
            this.f66412 = (byte) 1;
            return true;
        }
        this.f66412 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35772 = (this.f66413 & 1) != 0 ? AbstractC14846.m35772(2) : 0;
        if ((2 & this.f66413) != 0) {
            iM35772 += AbstractC14846.m35772(3);
        }
        if ((this.f66413 & 4) != 0) {
            iM35772 += AbstractC14846.m35772(6);
        }
        if ((this.f66413 & 8) != 0) {
            iM35772 += AbstractC14846.m35774(7, m47399());
        }
        for (int i2 = 0; i2 < this.f66410.size(); i2++) {
            iM35772 += AbstractC14846.m35774(EnumC5810.f19979, (InterfaceC18775) this.f66410.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35772 + m28523();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20726)) {
            return super.equals(obj);
        }
        C20726 c20726 = (C20726) obj;
        if (m47403() != c20726.m47403()) {
            return false;
        }
        if ((m47403() && this.f66415 != c20726.f66415) || m47397() != c20726.m47397()) {
            return false;
        }
        if ((m47397() && this.f66411 != c20726.f66411) || m47402() != c20726.m47402()) {
            return false;
        }
        if ((!m47402() || this.f66409 == c20726.f66409) && m47398() == c20726.m47398()) {
            return (!m47398() || m47399().equals(c20726.m47399())) && this.f66410.equals(c20726.f66410) && getUnknownFields().equals(c20726.getUnknownFields()) && m28526().equals(c20726.m28526());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40287.hashCode() + 779;
        if (m47403()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + C23447.m52661(this.f66415);
        }
        if (m47397()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + C23447.m52661(this.f66411);
        }
        if (m47402()) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + C23447.m52661(this.f66409);
        }
        if (m47398()) {
            iHashCode = C18176.m42345(iHashCode, 37, 7, 53) + m47399().hashCode();
        }
        if (this.f66410.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, EnumC5810.f19979, 53) + this.f66410.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC19124.m44248(iHashCode, m28526()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C3572 newBuilder() {
        return f66408.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f66408.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f66408.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C3572 toBuilder() {
        int i = 0;
        if (this == f66408) {
            return new C3572(i);
        }
        C3572 c3572 = new C3572(i);
        c3572.m11621(this);
        return c3572;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C3572(interfaceC7937, 0);
    }

    public static C20726 getDefaultInstance() {
        return f66408;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f66407;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f66408;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f66408;
    }
}
