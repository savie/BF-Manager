package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14139 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C14139 f46398;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f46399;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f46400 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f46401;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f46402;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f46403;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f46404;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f46405;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C14139.class.getName());
        f46398 = new C14139();
        f46399 = new C14367();
    }

    public C14139(C1665 c1665, int i) {
        super(c1665);
        this.f46402 = 0;
        this.f46401 = 0;
        this.f46404 = (byte) -1;
    }

    public C14139() {
        this.f46402 = 0;
        this.f46401 = 0;
        this.f46404 = (byte) -1;
        this.f46405 = Collections.EMPTY_LIST;
        this.f46402 = 0;
        this.f46401 = 0;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46295;
        c6956.m18696(C14139.class, C1665.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List m34187() {
        return this.f46405;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m34188() {
        return (this.f46403 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC12167 m34186() {
        EnumC12167 enumC12167M30252 = EnumC12167.m30252(this.f46402);
        return enumC12167M30252 == null ? EnumC12167.EDITION_UNKNOWN : enumC12167M30252;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m34189() {
        return (this.f46403 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC12167 m34185() {
        EnumC12167 enumC12167M30252 = EnumC12167.m30252(this.f46401);
        return enumC12167M30252 == null ? EnumC12167.EDITION_UNKNOWN : enumC12167M30252;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f46404;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f46405.size(); i++) {
            if (!((C4965) this.f46405.get(i)).isInitialized()) {
                this.f46404 = (byte) 0;
                return false;
            }
        }
        this.f46404 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        for (int i = 0; i < this.f46405.size(); i++) {
            abstractC22044.mo14254(1, (InterfaceC23206) this.f46405.get(i));
        }
        if ((this.f46403 & 1) != 0) {
            abstractC22044.mo14252(4, this.f46402);
        }
        if ((this.f46403 & 2) != 0) {
            abstractC22044.mo14252(5, this.f46401);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48966 = 0;
        for (int i2 = 0; i2 < this.f46405.size(); i2++) {
            iM48966 += AbstractC22044.m48963(1, (InterfaceC23206) this.f46405.get(i2));
        }
        if ((this.f46403 & 1) != 0) {
            iM48966 += AbstractC22044.m48966(4, this.f46402);
        }
        if ((this.f46403 & 2) != 0) {
            iM48966 += AbstractC22044.m48966(5, this.f46401);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48966;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14139)) {
            return super.equals(obj);
        }
        C14139 c14139 = (C14139) obj;
        if (!this.f46405.equals(c14139.f46405) || m34188() != c14139.m34188()) {
            return false;
        }
        if ((!m34188() || this.f46402 == c14139.f46402) && m34189() == c14139.m34189()) {
            return (!m34189() || this.f46401 == c14139.f46401) && getUnknownFields().equals(c14139.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46306.hashCode() + 779;
        if (this.f46405.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.f46405.hashCode();
        }
        if (m34188()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + this.f46402;
        }
        if (m34189()) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + this.f46401;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14139 m34180(byte[] bArr, C4818 c4818) {
        return (C14139) ((C14367) f46399).parseFrom(bArr, (C2701) c4818);
    }

    public static C1665 newBuilder() {
        return f46398.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f46398.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f46398.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C1665 toBuilder() {
        int i = 0;
        if (this == f46398) {
            return new C1665(i);
        }
        C1665 c1665 = new C1665(i);
        c1665.m5570(this);
        return c1665;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C1665(interfaceC6790, 0);
    }

    public static C14139 getDefaultInstance() {
        return f46398;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f46399;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f46398;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f46398;
    }
}
