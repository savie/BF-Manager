package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16250 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C16250 f52800;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f52801;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20726 f52802;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C1072 f52803;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f52804;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f52805;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile Object f52806;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f52807;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f52808;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C16250.class.getName());
        f52800 = new C16250();
        f52801 = new C2081();
    }

    public C16250(C11775 c11775, int i) {
        super(c11775);
        this.f52806 = "";
        this.f52803 = C1072.m4023();
        this.f52808 = (byte) -1;
    }

    public C16250() {
        this.f52806 = "";
        this.f52803 = C1072.m4023();
        this.f52808 = (byte) -1;
        this.f52806 = "";
        List list = Collections.EMPTY_LIST;
        this.f52804 = list;
        this.f52807 = list;
        this.f52803 = C1072.m4023();
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40285;
        c7544.m20621(C16250.class, C11775.class);
        return c7544;
    }

    public final boolean hasName() {
        return (this.f52805 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f52806;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f52806 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38562() {
        return this.f52804.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24456 m38563(int i) {
        return (C24456) this.f52804.get(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38565() {
        return (this.f52805 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20726 m38564() {
        C20726 c20726 = this.f52802;
        return c20726 == null ? C20726.getDefaultInstance() : c20726;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f52808;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f52804.size(); i++) {
            if (!m38563(i).isInitialized()) {
                this.f52808 = (byte) 0;
                return false;
            }
        }
        if (m38565() && !m38564().isInitialized()) {
            this.f52808 = (byte) 0;
            return false;
        }
        this.f52808 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f52805 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.f52806);
        }
        for (int i = 0; i < this.f52804.size(); i++) {
            abstractC14846.mo14025(2, (InterfaceC18775) this.f52804.get(i));
        }
        if ((this.f52805 & 2) != 0) {
            abstractC14846.mo14025(3, m38564());
        }
        for (int i2 = 0; i2 < this.f52807.size(); i2++) {
            abstractC14846.mo14025(4, (InterfaceC18775) this.f52807.get(i2));
        }
        for (int i3 = 0; i3 < this.f52803.size(); i3++) {
            AbstractC9035.m24111(abstractC14846, 5, this.f52803.mo4025(i3));
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.f52805 & 1) != 0 ? AbstractC9035.m24096(1, this.f52806) : 0;
        for (int i2 = 0; i2 < this.f52804.size(); i2++) {
            iM24096 += AbstractC14846.m35774(2, (InterfaceC18775) this.f52804.get(i2));
        }
        if ((this.f52805 & 2) != 0) {
            iM24096 += AbstractC14846.m35774(3, m38564());
        }
        for (int i3 = 0; i3 < this.f52807.size(); i3++) {
            iM24096 += AbstractC14846.m35774(4, (InterfaceC18775) this.f52807.get(i3));
        }
        int iM24117 = 0;
        for (int i4 = 0; i4 < this.f52803.size(); i4++) {
            iM24117 += AbstractC9035.m24117(this.f52803.mo4025(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f52803.size() + iM24096 + iM24117;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16250)) {
            return super.equals(obj);
        }
        C16250 c16250 = (C16250) obj;
        if (hasName() != c16250.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c16250.getName())) && this.f52804.equals(c16250.f52804) && m38565() == c16250.m38565()) {
            return (!m38565() || m38564().equals(c16250.m38564())) && this.f52807.equals(c16250.f52807) && this.f52803.equals(c16250.f52803) && getUnknownFields().equals(c16250.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40307.hashCode() + 779;
        if (hasName()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f52804.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f52804.hashCode();
        }
        if (m38565()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + m38564().hashCode();
        }
        if (this.f52807.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + this.f52807.hashCode();
        }
        if (this.f52803.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + this.f52803.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C11775 newBuilder() {
        return f52800.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f52800.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f52800.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C11775 toBuilder() {
        int i = 0;
        if (this == f52800) {
            return new C11775(i);
        }
        C11775 c11775 = new C11775(i);
        c11775.m29552(this);
        return c11775;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C11775(interfaceC7937, 0);
    }

    public static C16250 getDefaultInstance() {
        return f52800;
    }

    public static InterfaceC11490 parser() {
        return f52801;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f52801;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f52800;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f52800;
    }
}
