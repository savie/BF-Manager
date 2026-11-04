package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11996 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f38659;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C11996 f38660;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38661 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte f38662;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f38663;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38664;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f38665;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f38666;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C11996.class.getName());
        f38660 = new C11996();
        f38659 = new C17217();
    }

    public C11996(C15725 c15725, int i) {
        super(c15725);
        this.f38663 = 0;
        this.f38665 = 0;
        this.f38662 = (byte) -1;
    }

    public C11996() {
        this.f38663 = 0;
        this.f38665 = 0;
        this.f38662 = (byte) -1;
        this.f38666 = Collections.EMPTY_LIST;
        this.f38663 = 0;
        this.f38665 = 0;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40264;
        c7544.m20621(C11996.class, C15725.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m30161() {
        return this.f38666;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m30163() {
        return (this.f38664 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC5810 m30162() {
        EnumC5810 enumC5810M16936 = EnumC5810.m16936(this.f38663);
        return enumC5810M16936 == null ? EnumC5810.EDITION_UNKNOWN : enumC5810M16936;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m30164() {
        return (this.f38664 & 2) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC5810 m30160() {
        EnumC5810 enumC5810M16936 = EnumC5810.m16936(this.f38665);
        return enumC5810M16936 == null ? EnumC5810.EDITION_UNKNOWN : enumC5810M16936;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f38662;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f38666.size(); i++) {
            if (!((C20201) this.f38666.get(i)).isInitialized()) {
                this.f38662 = (byte) 0;
                return false;
            }
        }
        this.f38662 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        for (int i = 0; i < this.f38666.size(); i++) {
            abstractC14846.mo14025(1, (InterfaceC18775) this.f38666.get(i));
        }
        if ((this.f38664 & 1) != 0) {
            abstractC14846.mo14022(4, this.f38663);
        }
        if ((this.f38664 & 2) != 0) {
            abstractC14846.mo14022(5, this.f38665);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35768 = 0;
        for (int i2 = 0; i2 < this.f38666.size(); i2++) {
            iM35768 += AbstractC14846.m35774(1, (InterfaceC18775) this.f38666.get(i2));
        }
        if ((this.f38664 & 1) != 0) {
            iM35768 += AbstractC14846.m35768(4, this.f38663);
        }
        if ((this.f38664 & 2) != 0) {
            iM35768 += AbstractC14846.m35768(5, this.f38665);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35768;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11996)) {
            return super.equals(obj);
        }
        C11996 c11996 = (C11996) obj;
        if (!this.f38666.equals(c11996.f38666) || m30163() != c11996.m30163()) {
            return false;
        }
        if ((!m30163() || this.f38663 == c11996.f38663) && m30164() == c11996.m30164()) {
            return (!m30164() || this.f38665 == c11996.f38665) && getUnknownFields().equals(c11996.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40247.hashCode() + 779;
        if (this.f38666.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + this.f38666.hashCode();
        }
        if (m30163()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + this.f38663;
        }
        if (m30164()) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + this.f38665;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11996 m30155(byte[] bArr, C20485 c20485) {
        return (C11996) ((C17217) f38659).parseFrom(bArr, (C24215) c20485);
    }

    public static C15725 newBuilder() {
        return f38660.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f38660.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f38660.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C15725 toBuilder() {
        int i = 0;
        if (this == f38660) {
            return new C15725(i);
        }
        C15725 c15725 = new C15725(i);
        c15725.m37635(this);
        return c15725;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C15725(interfaceC7937, 0);
    }

    public static C11996 getDefaultInstance() {
        return f38660;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f38659;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f38660;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f38660;
    }
}
