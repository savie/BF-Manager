package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C25224 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f81475;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C25224 f81476;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f81477;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f81478;

    static {
        C0304.m1888(EnumC18203.PUBLIC, C25224.class.getName());
        f81476 = new C25224();
        f81475 = new C15526();
    }

    public C25224(C13289 c13289, int i) {
        super(c13289);
        this.f81478 = (byte) -1;
    }

    public C25224() {
        this.f81478 = (byte) -1;
        this.f81477 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40290;
        c7544.m20621(C25224.class, C13289.class);
        return c7544;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f81478;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f81478 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        for (int i = 0; i < this.f81477.size(); i++) {
            abstractC14846.mo14025(1, (InterfaceC18775) this.f81477.get(i));
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35774 = 0;
        for (int i2 = 0; i2 < this.f81477.size(); i2++) {
            iM35774 += AbstractC14846.m35774(1, (InterfaceC18775) this.f81477.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35774;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25224)) {
            return super.equals(obj);
        }
        C25224 c25224 = (C25224) obj;
        return this.f81477.equals(c25224.f81477) && getUnknownFields().equals(c25224.getUnknownFields());
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40298.hashCode() + 779;
        if (this.f81477.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + this.f81477.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C13289 newBuilder() {
        return f81476.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f81476.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f81476.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C13289 toBuilder() {
        int i = 0;
        if (this == f81476) {
            return new C13289(i);
        }
        C13289 c13289 = new C13289(i);
        c13289.m32830(this);
        return c13289;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C13289(interfaceC7937, 0);
    }

    public static C25224 getDefaultInstance() {
        return f81476;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f81475;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f81476;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f81476;
    }
}
