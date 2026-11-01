package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1582 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C1582 f6336;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f6337;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile Object f6338;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f6339;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21463 f6340;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f6341;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4487 f6342;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f6343;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f6344;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C1582.class.getName());
        f6336 = new C1582();
        f6337 = new C17105();
    }

    public C1582(C5816 c5816, int i) {
        super(c5816);
        this.f6338 = "";
        this.f6340 = C21463.m48084();
        this.f6344 = (byte) -1;
    }

    public C1582() {
        this.f6338 = "";
        this.f6340 = C21463.m48084();
        this.f6344 = (byte) -1;
        this.f6338 = "";
        List list = Collections.EMPTY_LIST;
        this.f6339 = list;
        this.f6343 = list;
        this.f6340 = C21463.m48084();
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46302;
        c6956.m18696(C1582.class, C5816.class);
        return c6956;
    }

    public final boolean hasName() {
        return (this.f6341 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f6338;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f6338 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m5400() {
        return this.f6339.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2370 m5401(int i) {
        return (C2370) this.f6339.get(i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m5402() {
        return (this.f6341 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C4487 m5403() {
        C4487 c4487 = this.f6342;
        return c4487 == null ? C4487.getDefaultInstance() : c4487;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f6344;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f6339.size(); i++) {
            if (!m5401(i).isInitialized()) {
                this.f6344 = (byte) 0;
                return false;
            }
        }
        if (m5402() && !m5403().isInitialized()) {
            this.f6344 = (byte) 0;
            return false;
        }
        this.f6344 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f6341 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.f6338);
        }
        for (int i = 0; i < this.f6339.size(); i++) {
            abstractC22044.mo14254(2, (InterfaceC23206) this.f6339.get(i));
        }
        if ((this.f6341 & 2) != 0) {
            abstractC22044.mo14254(3, m5403());
        }
        for (int i2 = 0; i2 < this.f6343.size(); i2++) {
            abstractC22044.mo14254(4, (InterfaceC23206) this.f6343.get(i2));
        }
        for (int i3 = 0; i3 < this.f6340.size(); i3++) {
            AbstractC18245.m42405(abstractC22044, 5, this.f6340.mo21384(i3));
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.f6341 & 1) != 0 ? AbstractC18245.m42390(1, this.f6338) : 0;
        for (int i2 = 0; i2 < this.f6339.size(); i2++) {
            iM42390 += AbstractC22044.m48963(2, (InterfaceC23206) this.f6339.get(i2));
        }
        if ((this.f6341 & 2) != 0) {
            iM42390 += AbstractC22044.m48963(3, m5403());
        }
        for (int i3 = 0; i3 < this.f6343.size(); i3++) {
            iM42390 += AbstractC22044.m48963(4, (InterfaceC23206) this.f6343.get(i3));
        }
        int iM42412 = 0;
        for (int i4 = 0; i4 < this.f6340.size(); i4++) {
            iM42412 += AbstractC18245.m42412(this.f6340.mo21384(i4));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f6340.size() + iM42390 + iM42412;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1582)) {
            return super.equals(obj);
        }
        C1582 c1582 = (C1582) obj;
        if (hasName() != c1582.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c1582.getName())) && this.f6339.equals(c1582.f6339) && m5402() == c1582.m5402()) {
            return (!m5402() || m5403().equals(c1582.m5403())) && this.f6343.equals(c1582.f6343) && this.f6340.equals(c1582.f6340) && getUnknownFields().equals(c1582.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46324.hashCode() + 779;
        if (hasName()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f6339.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f6339.hashCode();
        }
        if (m5402()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + m5403().hashCode();
        }
        if (this.f6343.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + this.f6343.hashCode();
        }
        if (this.f6340.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + this.f6340.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C5816 newBuilder() {
        return f6336.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f6336.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f6336.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C5816 toBuilder() {
        int i = 0;
        if (this == f6336) {
            return new C5816(i);
        }
        C5816 c5816 = new C5816(i);
        c5816.m15998(this);
        return c5816;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C5816(interfaceC6790, 0);
    }

    public static C1582 getDefaultInstance() {
        return f6336;
    }

    public static InterfaceC6271 parser() {
        return f6337;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f6337;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f6336;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f6336;
    }
}
