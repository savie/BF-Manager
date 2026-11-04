package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22240 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f71638;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C22240 f71639;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile Object f71640;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20002 f71641;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f71642;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f71643;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f71644;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C22240.class.getName());
        f71639 = new C22240();
        f71638 = new C13706();
    }

    public C22240(C5086 c5086, int i) {
        super(c5086);
        this.f71640 = "";
        this.f71644 = (byte) -1;
    }

    public C22240() {
        this.f71640 = "";
        this.f71644 = (byte) -1;
        this.f71640 = "";
        this.f71643 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40275;
        c7544.m20621(C22240.class, C5086.class);
        return c7544;
    }

    public final boolean hasName() {
        return (this.f71642 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f71640;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f71640 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m50295() {
        return this.f71643.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14452 m50294(int i) {
        return (C14452) this.f71643.get(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m50296() {
        return (this.f71642 & 2) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20002 m50293() {
        C20002 c20002 = this.f71641;
        return c20002 == null ? C20002.getDefaultInstance() : c20002;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f71644;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f71643.size(); i++) {
            if (!m50294(i).isInitialized()) {
                this.f71644 = (byte) 0;
                return false;
            }
        }
        if (m50296() && !m50293().isInitialized()) {
            this.f71644 = (byte) 0;
            return false;
        }
        this.f71644 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        if ((this.f71642 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.f71640);
        }
        for (int i = 0; i < this.f71643.size(); i++) {
            abstractC14846.mo14025(2, (InterfaceC18775) this.f71643.get(i));
        }
        if ((this.f71642 & 2) != 0) {
            abstractC14846.mo14025(3, m50293());
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.f71642 & 1) != 0 ? AbstractC9035.m24096(1, this.f71640) : 0;
        for (int i2 = 0; i2 < this.f71643.size(); i2++) {
            iM24096 += AbstractC14846.m35774(2, (InterfaceC18775) this.f71643.get(i2));
        }
        if ((this.f71642 & 2) != 0) {
            iM24096 += AbstractC14846.m35774(3, m50293());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM24096;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22240)) {
            return super.equals(obj);
        }
        C22240 c22240 = (C22240) obj;
        if (hasName() != c22240.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c22240.getName())) && this.f71643.equals(c22240.f71643) && m50296() == c22240.m50296()) {
            return (!m50296() || m50293().equals(c22240.m50293())) && getUnknownFields().equals(c22240.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40296.hashCode() + 779;
        if (hasName()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f71643.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + this.f71643.hashCode();
        }
        if (m50296()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + m50293().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C5086 newBuilder() {
        return f71639.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f71639.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f71639.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C5086 toBuilder() {
        int i = 0;
        if (this == f71639) {
            return new C5086(i);
        }
        C5086 c5086 = new C5086(i);
        c5086.m15384(this);
        return c5086;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C5086(interfaceC7937, 0);
    }

    public static C22240 getDefaultInstance() {
        return f71639;
    }

    public static InterfaceC11490 parser() {
        return f71638;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f71638;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f71639;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f71639;
    }
}
