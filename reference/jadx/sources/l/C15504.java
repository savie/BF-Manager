package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15504 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f50455;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C15504 f50456;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f50457;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f50458;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6250 f50459;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f50460;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f50461;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C1072 f50462;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f50463;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile Object f50464;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f50465;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f50466;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f50467;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f50468;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C15504.class.getName());
        f50456 = new C15504();
        f50455 = new C8880();
    }

    public C15504(C7389 c7389, int i) {
        super(c7389);
        this.f50464 = "";
        this.f50462 = C1072.m4023();
        this.f50467 = (byte) -1;
    }

    public C15504() {
        this.f50464 = "";
        this.f50462 = C1072.m4023();
        this.f50467 = (byte) -1;
        this.f50464 = "";
        List list = Collections.EMPTY_LIST;
        this.f50461 = list;
        this.f50457 = list;
        this.f50458 = list;
        this.f50468 = list;
        this.f50466 = list;
        this.f50463 = list;
        this.f50460 = list;
        this.f50462 = C1072.m4023();
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40259;
        c7544.m20621(C15504.class, C7389.class);
        return c7544;
    }

    public final boolean hasName() {
        return (this.f50465 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f50464;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f50464 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m37134() {
        return this.f50461.size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0064 m37131(int i) {
        return (C0064) this.f50461.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37127() {
        return this.f50457.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0064 m37137(int i) {
        return (C0064) this.f50457.get(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m37135() {
        return this.f50458.size();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15504 m37138(int i) {
        return (C15504) this.f50458.get(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m37130() {
        return this.f50468.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16250 m37129(int i) {
        return (C16250) this.f50468.get(i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List m37140() {
        return this.f50466;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m37132() {
        return this.f50466.size();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m37133() {
        return this.f50463.size();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9231 m37136(int i) {
        return (C9231) this.f50463.get(i);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m37128() {
        return (this.f50465 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6250 m37139() {
        C6250 c6250 = this.f50459;
        return c6250 == null ? C6250.getDefaultInstance() : c6250;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f50467;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f50461.size(); i++) {
            if (!m37131(i).isInitialized()) {
                this.f50467 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f50457.size(); i2++) {
            if (!m37137(i2).isInitialized()) {
                this.f50467 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f50458.size(); i3++) {
            if (!m37138(i3).isInitialized()) {
                this.f50467 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f50468.size(); i4++) {
            if (!m37129(i4).isInitialized()) {
                this.f50467 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.f50466.size(); i5++) {
            if (!((C22218) this.f50466.get(i5)).isInitialized()) {
                this.f50467 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f50463.size(); i6++) {
            if (!m37136(i6).isInitialized()) {
                this.f50467 = (byte) 0;
                return false;
            }
        }
        if (m37128() && !m37139().isInitialized()) {
            this.f50467 = (byte) 0;
            return false;
        }
        this.f50467 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f50465 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.f50464);
        }
        for (int i = 0; i < this.f50461.size(); i++) {
            abstractC14846.mo14025(2, (InterfaceC18775) this.f50461.get(i));
        }
        for (int i2 = 0; i2 < this.f50458.size(); i2++) {
            abstractC14846.mo14025(3, (InterfaceC18775) this.f50458.get(i2));
        }
        for (int i3 = 0; i3 < this.f50468.size(); i3++) {
            abstractC14846.mo14025(4, (InterfaceC18775) this.f50468.get(i3));
        }
        for (int i4 = 0; i4 < this.f50466.size(); i4++) {
            abstractC14846.mo14025(5, (InterfaceC18775) this.f50466.get(i4));
        }
        for (int i5 = 0; i5 < this.f50457.size(); i5++) {
            abstractC14846.mo14025(6, (InterfaceC18775) this.f50457.get(i5));
        }
        if ((this.f50465 & 2) != 0) {
            abstractC14846.mo14025(7, m37139());
        }
        for (int i6 = 0; i6 < this.f50463.size(); i6++) {
            abstractC14846.mo14025(8, (InterfaceC18775) this.f50463.get(i6));
        }
        for (int i7 = 0; i7 < this.f50460.size(); i7++) {
            abstractC14846.mo14025(9, (InterfaceC18775) this.f50460.get(i7));
        }
        for (int i8 = 0; i8 < this.f50462.size(); i8++) {
            AbstractC9035.m24111(abstractC14846, 10, this.f50462.mo4025(i8));
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.f50465 & 1) != 0 ? AbstractC9035.m24096(1, this.f50464) : 0;
        for (int i2 = 0; i2 < this.f50461.size(); i2++) {
            iM24096 += AbstractC14846.m35774(2, (InterfaceC18775) this.f50461.get(i2));
        }
        for (int i3 = 0; i3 < this.f50458.size(); i3++) {
            iM24096 += AbstractC14846.m35774(3, (InterfaceC18775) this.f50458.get(i3));
        }
        for (int i4 = 0; i4 < this.f50468.size(); i4++) {
            iM24096 += AbstractC14846.m35774(4, (InterfaceC18775) this.f50468.get(i4));
        }
        for (int i5 = 0; i5 < this.f50466.size(); i5++) {
            iM24096 += AbstractC14846.m35774(5, (InterfaceC18775) this.f50466.get(i5));
        }
        for (int i6 = 0; i6 < this.f50457.size(); i6++) {
            iM24096 += AbstractC14846.m35774(6, (InterfaceC18775) this.f50457.get(i6));
        }
        if ((this.f50465 & 2) != 0) {
            iM24096 += AbstractC14846.m35774(7, m37139());
        }
        for (int i7 = 0; i7 < this.f50463.size(); i7++) {
            iM24096 += AbstractC14846.m35774(8, (InterfaceC18775) this.f50463.get(i7));
        }
        for (int i8 = 0; i8 < this.f50460.size(); i8++) {
            iM24096 += AbstractC14846.m35774(9, (InterfaceC18775) this.f50460.get(i8));
        }
        int iM24117 = 0;
        for (int i9 = 0; i9 < this.f50462.size(); i9++) {
            iM24117 += AbstractC9035.m24117(this.f50462.mo4025(i9));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f50462.size() + iM24096 + iM24117;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15504)) {
            return super.equals(obj);
        }
        C15504 c15504 = (C15504) obj;
        if (hasName() != c15504.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c15504.getName())) && this.f50461.equals(c15504.f50461) && this.f50457.equals(c15504.f50457) && this.f50458.equals(c15504.f50458) && this.f50468.equals(c15504.f50468) && this.f50466.equals(c15504.f50466) && this.f50463.equals(c15504.f50463) && m37128() == c15504.m37128()) {
            return (!m37128() || m37139().equals(c15504.m37139())) && this.f50460.equals(c15504.f50460) && this.f50462.equals(c15504.f50462) && getUnknownFields().equals(c15504.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40276.hashCode() + 779;
        if (hasName()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f50461.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f50461.hashCode();
        }
        if (this.f50457.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + this.f50457.hashCode();
        }
        if (this.f50458.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + this.f50458.hashCode();
        }
        if (this.f50468.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + this.f50468.hashCode();
        }
        if (this.f50466.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + this.f50466.hashCode();
        }
        if (this.f50463.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 8, 53) + this.f50463.hashCode();
        }
        if (m37128()) {
            iHashCode = C18176.m42345(iHashCode, 37, 7, 53) + m37139().hashCode();
        }
        if (this.f50460.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 9, 53) + this.f50460.hashCode();
        }
        if (this.f50462.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 10, 53) + this.f50462.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C7389 newBuilder() {
        return f50456.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f50456.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f50456.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C7389 toBuilder() {
        int i = 0;
        if (this == f50456) {
            return new C7389(i);
        }
        C7389 c7389 = new C7389(i);
        c7389.m20302(this);
        return c7389;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C7389(interfaceC7937, 0);
    }

    public static C15504 getDefaultInstance() {
        return f50456;
    }

    public static InterfaceC11490 parser() {
        return f50455;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f50455;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f50456;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f50456;
    }
}
