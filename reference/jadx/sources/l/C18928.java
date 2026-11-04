package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18928 extends AbstractC11272 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61400 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f61401;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C18928 f61402;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16471 f61403;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f61404;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f61405;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f61406;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f61407;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f61408;

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        C1578 c1578 = new C1578(this);
        if ((this.f61408 & 1) != 0) {
            abstractC14846.mo14010(33, this.f61406);
        }
        if ((this.f61408 & 2) != 0) {
            abstractC14846.mo14022(34, this.f61404);
        }
        if ((this.f61408 & 4) != 0) {
            abstractC14846.mo14025(35, m43953());
        }
        for (int i = 0; i < this.f61405.size(); i++) {
            abstractC14846.mo14025(EnumC5810.f19979, (InterfaceC18775) this.f61405.get(i));
        }
        c1578.m5597(536870912, abstractC14846);
        getUnknownFields().writeTo(abstractC14846);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C18928.class.getName());
        f61402 = new C18928();
        f61401 = new C21166();
    }

    public C18928(C18182 c18182) {
        super(c18182);
        this.f61406 = false;
        this.f61404 = 0;
        this.f61407 = (byte) -1;
    }

    public C18928() {
        this.f61406 = false;
        this.f61407 = (byte) -1;
        this.f61404 = 0;
        this.f61405 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40286;
        c7544.m20621(C18928.class, C18182.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m43952() {
        return (this.f61408 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m43956() {
        return this.f61406;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m43951() {
        return (this.f61408 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC7741 m43954() {
        EnumC7741 enumC7741M21069 = EnumC7741.m21069(this.f61404);
        return enumC7741M21069 == null ? EnumC7741.IDEMPOTENCY_UNKNOWN : enumC7741M21069;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m43955() {
        return (this.f61408 & 4) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16471 m43953() {
        C16471 c16471 = this.f61403;
        return c16471 == null ? C16471.getDefaultInstance() : c16471;
    }

    @Override // l.AbstractC11272, l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f61407;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m43955() || m43953().isInitialized()) {
            for (int i = 0; i < this.f61405.size(); i++) {
                if (!((C20748) this.f61405.get(i)).isInitialized()) {
                    this.f61407 = (byte) 0;
                    return false;
                }
            }
            if (!m28524()) {
                this.f61407 = (byte) 0;
                return false;
            }
            this.f61407 = (byte) 1;
            return true;
        }
        this.f61407 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35772 = (this.f61408 & 1) != 0 ? AbstractC14846.m35772(33) : 0;
        if ((this.f61408 & 2) != 0) {
            iM35772 += AbstractC14846.m35768(34, this.f61404);
        }
        if ((this.f61408 & 4) != 0) {
            iM35772 += AbstractC14846.m35774(35, m43953());
        }
        for (int i2 = 0; i2 < this.f61405.size(); i2++) {
            iM35772 += AbstractC14846.m35774(EnumC5810.f19979, (InterfaceC18775) this.f61405.get(i2));
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
        if (!(obj instanceof C18928)) {
            return super.equals(obj);
        }
        C18928 c18928 = (C18928) obj;
        if (m43952() != c18928.m43952()) {
            return false;
        }
        if ((m43952() && this.f61406 != c18928.f61406) || m43951() != c18928.m43951()) {
            return false;
        }
        if ((!m43951() || this.f61404 == c18928.f61404) && m43955() == c18928.m43955()) {
            return (!m43955() || m43953().equals(c18928.m43953())) && this.f61405.equals(c18928.f61405) && getUnknownFields().equals(c18928.getUnknownFields()) && m28526().equals(c18928.m28526());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40308.hashCode() + 779;
        if (m43952()) {
            iHashCode = C18176.m42345(iHashCode, 37, 33, 53) + C23447.m52661(this.f61406);
        }
        if (m43951()) {
            iHashCode = C18176.m42345(iHashCode, 37, 34, 53) + this.f61404;
        }
        if (m43955()) {
            iHashCode = C18176.m42345(iHashCode, 37, 35, 53) + m43953().hashCode();
        }
        if (this.f61405.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, EnumC5810.f19979, 53) + this.f61405.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC19124.m44248(iHashCode, m28526()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C18182 newBuilder() {
        return f61402.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f61402.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f61402.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C18182 toBuilder() {
        int i = 0;
        if (this == f61402) {
            return new C18182(i);
        }
        C18182 c18182 = new C18182(i);
        c18182.m42350(this);
        return c18182;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C18182(interfaceC7937, 0);
    }

    public static C18928 getDefaultInstance() {
        return f61402;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f61401;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f61402;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f61402;
    }
}
