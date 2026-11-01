package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0171 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C0171 f1263;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f1264;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f1265;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21463 f1266;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile Object f1267;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f1268;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f1269;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f1270;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11792 f1271;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f1272;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f1273;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f1274;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f1275;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f1276;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C0171.class.getName());
        f1263 = new C0171();
        f1264 = new C7933();
    }

    public C0171(C19222 c19222, int i) {
        super(c19222);
        this.f1267 = "";
        this.f1266 = C21463.m48084();
        this.f1274 = (byte) -1;
    }

    public C0171() {
        this.f1267 = "";
        this.f1266 = C21463.m48084();
        this.f1274 = (byte) -1;
        this.f1267 = "";
        List list = Collections.EMPTY_LIST;
        this.f1270 = list;
        this.f1273 = list;
        this.f1269 = list;
        this.f1275 = list;
        this.f1265 = list;
        this.f1276 = list;
        this.f1268 = list;
        this.f1266 = C21463.m48084();
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46297;
        c6956.m18696(C0171.class, C19222.class);
        return c6956;
    }

    public final boolean hasName() {
        return (this.f1272 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f1267;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f1267 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m1365() {
        return this.f1270.size();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4259 m1362(int i) {
        return (C4259) this.f1270.get(i);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m1357() {
        return this.f1273.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4259 m1364(int i) {
        return (C4259) this.f1273.get(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m1368() {
        return this.f1269.size();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0171 m1356(int i) {
        return (C0171) this.f1269.get(i);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m1363() {
        return this.f1275.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1582 m1358(int i) {
        return (C1582) this.f1275.get(i);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final List m1369() {
        return this.f1265;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m1360() {
        return this.f1265.size();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m1366() {
        return this.f1276.size();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18141 m1359(int i) {
        return (C18141) this.f1276.get(i);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m1361() {
        return (this.f1272 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11792 m1367() {
        C11792 c11792 = this.f1271;
        return c11792 == null ? C11792.getDefaultInstance() : c11792;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f1274;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f1270.size(); i++) {
            if (!m1362(i).isInitialized()) {
                this.f1274 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f1273.size(); i2++) {
            if (!m1364(i2).isInitialized()) {
                this.f1274 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f1269.size(); i3++) {
            if (!m1356(i3).isInitialized()) {
                this.f1274 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f1275.size(); i4++) {
            if (!m1358(i4).isInitialized()) {
                this.f1274 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.f1265.size(); i5++) {
            if (!((C7227) this.f1265.get(i5)).isInitialized()) {
                this.f1274 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f1276.size(); i6++) {
            if (!m1359(i6).isInitialized()) {
                this.f1274 = (byte) 0;
                return false;
            }
        }
        if (m1361() && !m1367().isInitialized()) {
            this.f1274 = (byte) 0;
            return false;
        }
        this.f1274 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f1272 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.f1267);
        }
        for (int i = 0; i < this.f1270.size(); i++) {
            abstractC22044.mo14254(2, (InterfaceC23206) this.f1270.get(i));
        }
        for (int i2 = 0; i2 < this.f1269.size(); i2++) {
            abstractC22044.mo14254(3, (InterfaceC23206) this.f1269.get(i2));
        }
        for (int i3 = 0; i3 < this.f1275.size(); i3++) {
            abstractC22044.mo14254(4, (InterfaceC23206) this.f1275.get(i3));
        }
        for (int i4 = 0; i4 < this.f1265.size(); i4++) {
            abstractC22044.mo14254(5, (InterfaceC23206) this.f1265.get(i4));
        }
        for (int i5 = 0; i5 < this.f1273.size(); i5++) {
            abstractC22044.mo14254(6, (InterfaceC23206) this.f1273.get(i5));
        }
        if ((this.f1272 & 2) != 0) {
            abstractC22044.mo14254(7, m1367());
        }
        for (int i6 = 0; i6 < this.f1276.size(); i6++) {
            abstractC22044.mo14254(8, (InterfaceC23206) this.f1276.get(i6));
        }
        for (int i7 = 0; i7 < this.f1268.size(); i7++) {
            abstractC22044.mo14254(9, (InterfaceC23206) this.f1268.get(i7));
        }
        for (int i8 = 0; i8 < this.f1266.size(); i8++) {
            AbstractC18245.m42405(abstractC22044, 10, this.f1266.mo21384(i8));
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.f1272 & 1) != 0 ? AbstractC18245.m42390(1, this.f1267) : 0;
        for (int i2 = 0; i2 < this.f1270.size(); i2++) {
            iM42390 += AbstractC22044.m48963(2, (InterfaceC23206) this.f1270.get(i2));
        }
        for (int i3 = 0; i3 < this.f1269.size(); i3++) {
            iM42390 += AbstractC22044.m48963(3, (InterfaceC23206) this.f1269.get(i3));
        }
        for (int i4 = 0; i4 < this.f1275.size(); i4++) {
            iM42390 += AbstractC22044.m48963(4, (InterfaceC23206) this.f1275.get(i4));
        }
        for (int i5 = 0; i5 < this.f1265.size(); i5++) {
            iM42390 += AbstractC22044.m48963(5, (InterfaceC23206) this.f1265.get(i5));
        }
        for (int i6 = 0; i6 < this.f1273.size(); i6++) {
            iM42390 += AbstractC22044.m48963(6, (InterfaceC23206) this.f1273.get(i6));
        }
        if ((this.f1272 & 2) != 0) {
            iM42390 += AbstractC22044.m48963(7, m1367());
        }
        for (int i7 = 0; i7 < this.f1276.size(); i7++) {
            iM42390 += AbstractC22044.m48963(8, (InterfaceC23206) this.f1276.get(i7));
        }
        for (int i8 = 0; i8 < this.f1268.size(); i8++) {
            iM42390 += AbstractC22044.m48963(9, (InterfaceC23206) this.f1268.get(i8));
        }
        int iM42412 = 0;
        for (int i9 = 0; i9 < this.f1266.size(); i9++) {
            iM42412 += AbstractC18245.m42412(this.f1266.mo21384(i9));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + this.f1266.size() + iM42390 + iM42412;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0171)) {
            return super.equals(obj);
        }
        C0171 c0171 = (C0171) obj;
        if (hasName() != c0171.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c0171.getName())) && this.f1270.equals(c0171.f1270) && this.f1273.equals(c0171.f1273) && this.f1269.equals(c0171.f1269) && this.f1275.equals(c0171.f1275) && this.f1265.equals(c0171.f1265) && this.f1276.equals(c0171.f1276) && m1361() == c0171.m1361()) {
            return (!m1361() || m1367().equals(c0171.m1367())) && this.f1268.equals(c0171.f1268) && this.f1266.equals(c0171.f1266) && getUnknownFields().equals(c0171.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46267.hashCode() + 779;
        if (hasName()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f1270.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f1270.hashCode();
        }
        if (this.f1273.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + this.f1273.hashCode();
        }
        if (this.f1269.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + this.f1269.hashCode();
        }
        if (this.f1275.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + this.f1275.hashCode();
        }
        if (this.f1265.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + this.f1265.hashCode();
        }
        if (this.f1276.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 8, 53) + this.f1276.hashCode();
        }
        if (m1361()) {
            iHashCode = C17922.m41614(iHashCode, 37, 7, 53) + m1367().hashCode();
        }
        if (this.f1268.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 9, 53) + this.f1268.hashCode();
        }
        if (this.f1266.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 10, 53) + this.f1266.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C19222 newBuilder() {
        return f1263.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f1263.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f1263.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C19222 toBuilder() {
        int i = 0;
        if (this == f1263) {
            return new C19222(i);
        }
        C19222 c19222 = new C19222(i);
        c19222.m44149(this);
        return c19222;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C19222(interfaceC6790, 0);
    }

    public static C0171 getDefaultInstance() {
        return f1263;
    }

    public static InterfaceC6271 parser() {
        return f1264;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f1264;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f1263;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f1263;
    }
}
