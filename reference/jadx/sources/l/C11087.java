package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11087 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C11087 f37637;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f37638;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List f37639;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f37640;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C11087.class.getName());
        f37637 = new C11087();
        f37638 = new C0502();
    }

    public C11087(C16731 c16731, int i) {
        super(c16731);
        this.f37640 = (byte) -1;
    }

    public C11087() {
        this.f37640 = (byte) -1;
        this.f37639 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46266;
        c6956.m18696(C11087.class, C16731.class);
        return c6956;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f37640;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f37640 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        for (int i = 0; i < this.f37639.size(); i++) {
            abstractC22044.mo14254(1, (InterfaceC23206) this.f37639.get(i));
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48963 = 0;
        for (int i2 = 0; i2 < this.f37639.size(); i2++) {
            iM48963 += AbstractC22044.m48963(1, (InterfaceC23206) this.f37639.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48963;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11087)) {
            return super.equals(obj);
        }
        C11087 c11087 = (C11087) obj;
        return this.f37639.equals(c11087.f37639) && getUnknownFields().equals(c11087.getUnknownFields());
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46317.hashCode() + 779;
        if (this.f37639.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.f37639.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C16731 newBuilder() {
        return f37637.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f37637.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f37637.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C16731 toBuilder() {
        int i = 0;
        if (this == f37637) {
            return new C16731(i);
        }
        C16731 c16731 = new C16731(i);
        c16731.m39246(this);
        return c16731;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C16731(interfaceC6790, 0);
    }

    public static C11087 getDefaultInstance() {
        return f37637;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f37638;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f37637;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f37637;
    }
}
