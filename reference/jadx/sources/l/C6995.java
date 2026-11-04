package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6995 extends AbstractC11272 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f23067;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C6995 f23068;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f23069;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f23070;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C16471 f23071;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23072;

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        C1578 c1578 = new C1578(this);
        if ((this.f23072 & 1) != 0) {
            abstractC14846.mo14025(1, m19316());
        }
        for (int i = 0; i < this.f23070.size(); i++) {
            abstractC14846.mo14025(EnumC5810.f19979, (InterfaceC18775) this.f23070.get(i));
        }
        c1578.m5597(536870912, abstractC14846);
        getUnknownFields().writeTo(abstractC14846);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C6995.class.getName());
        f23068 = new C6995();
        f23067 = new C2520();
    }

    public C6995(C8486 c8486) {
        super(c8486);
        this.f23069 = (byte) -1;
    }

    public C6995() {
        this.f23069 = (byte) -1;
        this.f23070 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40254;
        c7544.m20621(C6995.class, C8486.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m19315() {
        return (this.f23072 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16471 m19316() {
        C16471 c16471 = this.f23071;
        return c16471 == null ? C16471.getDefaultInstance() : c16471;
    }

    @Override // l.AbstractC11272, l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f23069;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m19315() || m19316().isInitialized()) {
            for (int i = 0; i < this.f23070.size(); i++) {
                if (!((C20748) this.f23070.get(i)).isInitialized()) {
                    this.f23069 = (byte) 0;
                    return false;
                }
            }
            if (!m28524()) {
                this.f23069 = (byte) 0;
                return false;
            }
            this.f23069 = (byte) 1;
            return true;
        }
        this.f23069 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35774 = (this.f23072 & 1) != 0 ? AbstractC14846.m35774(1, m19316()) : 0;
        for (int i2 = 0; i2 < this.f23070.size(); i2++) {
            iM35774 += AbstractC14846.m35774(EnumC5810.f19979, (InterfaceC18775) this.f23070.get(i2));
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
        if (!(obj instanceof C6995)) {
            return super.equals(obj);
        }
        C6995 c6995 = (C6995) obj;
        if (m19315() != c6995.m19315()) {
            return false;
        }
        return (!m19315() || m19316().equals(c6995.m19316())) && this.f23070.equals(c6995.f23070) && getUnknownFields().equals(c6995.getUnknownFields()) && m28526().equals(c6995.m28526());
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40304.hashCode() + 779;
        if (m19315()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + m19316().hashCode();
        }
        if (this.f23070.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, EnumC5810.f19979, 53) + this.f23070.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC19124.m44248(iHashCode, m28526()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C8486 newBuilder() {
        return f23068.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f23068.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f23068.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C8486 toBuilder() {
        int i = 0;
        if (this == f23068) {
            return new C8486(i);
        }
        C8486 c8486 = new C8486(i);
        c8486.m22808(this);
        return c8486;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C8486(interfaceC7937, 0);
    }

    public static C6995 getDefaultInstance() {
        return f23068;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f23067;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f23068;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f23068;
    }
}
