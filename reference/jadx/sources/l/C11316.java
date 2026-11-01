package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11316 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f38187;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final C11316 f38188;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f38189;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC23890 f38190;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C11087 f38191;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f38192;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f38193;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f38194;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile Object f38195;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f38196;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23890 f38197;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile Object f38198;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f38199;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f38200;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f38201;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21463 f38202;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3553 f38203;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C11316.class.getName());
        f38188 = new C11316();
        f38187 = new C17665();
    }

    public C11316(C6376 c6376, int i) {
        super(c6376);
        this.f38195 = "";
        this.f38198 = "";
        this.f38202 = C21463.m48084();
        this.f38190 = AbstractC18245.m42411();
        this.f38197 = AbstractC18245.m42411();
        this.f38192 = "";
        this.f38189 = 0;
        this.f38201 = (byte) -1;
    }

    public C11316() {
        this.f38195 = "";
        this.f38198 = "";
        this.f38202 = C21463.m48084();
        this.f38190 = AbstractC18245.m42411();
        this.f38197 = AbstractC18245.m42411();
        this.f38192 = "";
        this.f38189 = 0;
        this.f38201 = (byte) -1;
        this.f38195 = "";
        this.f38198 = "";
        this.f38202 = C21463.m48084();
        this.f38190 = AbstractC18245.m42411();
        this.f38197 = AbstractC18245.m42411();
        List list = Collections.EMPTY_LIST;
        this.f38193 = list;
        this.f38200 = list;
        this.f38194 = list;
        this.f38196 = list;
        this.f38192 = "";
        this.f38189 = 0;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46271;
        c6956.m18696(C11316.class, C6376.class);
        return c6956;
    }

    public final boolean hasName() {
        return (this.f38199 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f38195;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f38195 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m28358() {
        return (this.f38199 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m28354() {
        Object obj = this.f38198;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f38198 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m28350() {
        return this.f38202.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m28342(int i) {
        return this.f38202.get(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m28355() {
        return this.f38190.size();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m28343(int i) {
        return this.f38190.getInt(i);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m28352() {
        return this.f38193.size();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0171 m28340(int i) {
        return (C0171) this.f38193.get(i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m28344() {
        return this.f38200.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1582 m28351(int i) {
        return (C1582) this.f38200.get(i);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m28346() {
        return this.f38194.size();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7558 m28360(int i) {
        return (C7558) this.f38194.get(i);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m28361() {
        return this.f38196.size();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4259 m28349(int i) {
        return (C4259) this.f38196.get(i);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m28345() {
        return (this.f38199 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3553 m28359() {
        C3553 c3553 = this.f38203;
        return c3553 == null ? C3553.getDefaultInstance() : c3553;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m28353() {
        return (this.f38199 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C11087 m28356() {
        C11087 c11087 = this.f38191;
        return c11087 == null ? C11087.getDefaultInstance() : c11087;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m28357() {
        return (this.f38199 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m28347() {
        Object obj = this.f38192;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f38192 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m28348() {
        return (this.f38199 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC12167 m28341() {
        EnumC12167 enumC12167M30252 = EnumC12167.m30252(this.f38189);
        return enumC12167M30252 == null ? EnumC12167.EDITION_UNKNOWN : enumC12167M30252;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f38201;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f38193.size(); i++) {
            if (!m28340(i).isInitialized()) {
                this.f38201 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f38200.size(); i2++) {
            if (!m28351(i2).isInitialized()) {
                this.f38201 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f38194.size(); i3++) {
            if (!m28360(i3).isInitialized()) {
                this.f38201 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f38196.size(); i4++) {
            if (!m28349(i4).isInitialized()) {
                this.f38201 = (byte) 0;
                return false;
            }
        }
        if (m28345() && !m28359().isInitialized()) {
            this.f38201 = (byte) 0;
            return false;
        }
        this.f38201 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f38199 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.f38195);
        }
        if ((this.f38199 & 2) != 0) {
            AbstractC18245.m42405(abstractC22044, 2, this.f38198);
        }
        for (int i = 0; i < this.f38202.size(); i++) {
            AbstractC18245.m42405(abstractC22044, 3, this.f38202.mo21384(i));
        }
        for (int i2 = 0; i2 < this.f38193.size(); i2++) {
            abstractC22044.mo14254(4, (InterfaceC23206) this.f38193.get(i2));
        }
        for (int i3 = 0; i3 < this.f38200.size(); i3++) {
            abstractC22044.mo14254(5, (InterfaceC23206) this.f38200.get(i3));
        }
        for (int i4 = 0; i4 < this.f38194.size(); i4++) {
            abstractC22044.mo14254(6, (InterfaceC23206) this.f38194.get(i4));
        }
        for (int i5 = 0; i5 < this.f38196.size(); i5++) {
            abstractC22044.mo14254(7, (InterfaceC23206) this.f38196.get(i5));
        }
        if ((this.f38199 & 4) != 0) {
            abstractC22044.mo14254(8, m28359());
        }
        if ((this.f38199 & 8) != 0) {
            abstractC22044.mo14254(9, m28356());
        }
        for (int i6 = 0; i6 < this.f38190.size(); i6++) {
            abstractC22044.mo14252(10, this.f38190.getInt(i6));
        }
        for (int i7 = 0; i7 < this.f38197.size(); i7++) {
            abstractC22044.mo14252(11, this.f38197.getInt(i7));
        }
        if ((this.f38199 & 16) != 0) {
            AbstractC18245.m42405(abstractC22044, 12, this.f38192);
        }
        if ((this.f38199 & 32) != 0) {
            abstractC22044.mo14252(14, this.f38189);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.f38199 & 1) != 0 ? AbstractC18245.m42390(1, this.f38195) : 0;
        if ((this.f38199 & 2) != 0) {
            iM42390 += AbstractC18245.m42390(2, this.f38198);
        }
        int iM42412 = 0;
        for (int i2 = 0; i2 < this.f38202.size(); i2++) {
            iM42412 += AbstractC18245.m42412(this.f38202.mo21384(i2));
        }
        int size = this.f38202.size() + iM42390 + iM42412;
        for (int i3 = 0; i3 < this.f38193.size(); i3++) {
            size += AbstractC22044.m48963(4, (InterfaceC23206) this.f38193.get(i3));
        }
        for (int i4 = 0; i4 < this.f38200.size(); i4++) {
            size += AbstractC22044.m48963(5, (InterfaceC23206) this.f38200.get(i4));
        }
        for (int i5 = 0; i5 < this.f38194.size(); i5++) {
            size += AbstractC22044.m48963(6, (InterfaceC23206) this.f38194.get(i5));
        }
        for (int i6 = 0; i6 < this.f38196.size(); i6++) {
            size += AbstractC22044.m48963(7, (InterfaceC23206) this.f38196.get(i6));
        }
        if ((this.f38199 & 4) != 0) {
            size += AbstractC22044.m48963(8, m28359());
        }
        if ((this.f38199 & 8) != 0) {
            size += AbstractC22044.m48963(9, m28356());
        }
        int iM48969 = 0;
        for (int i7 = 0; i7 < this.f38190.size(); i7++) {
            iM48969 += AbstractC22044.m48969(this.f38190.getInt(i7));
        }
        int size2 = this.f38190.size() + size + iM48969;
        int iM489610 = 0;
        for (int i8 = 0; i8 < this.f38197.size(); i8++) {
            iM489610 += AbstractC22044.m48969(this.f38197.getInt(i8));
        }
        int size3 = this.f38197.size() + size2 + iM489610;
        if ((this.f38199 & 16) != 0) {
            size3 += AbstractC18245.m42390(12, this.f38192);
        }
        if ((this.f38199 & 32) != 0) {
            size3 += AbstractC22044.m48966(14, this.f38189);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size3;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11316)) {
            return super.equals(obj);
        }
        C11316 c11316 = (C11316) obj;
        if (hasName() != c11316.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c11316.getName())) || m28358() != c11316.m28358()) {
            return false;
        }
        if ((m28358() && !m28354().equals(c11316.m28354())) || !this.f38202.equals(c11316.f38202) || !this.f38190.equals(c11316.f38190) || !this.f38197.equals(c11316.f38197) || !this.f38193.equals(c11316.f38193) || !this.f38200.equals(c11316.f38200) || !this.f38194.equals(c11316.f38194) || !this.f38196.equals(c11316.f38196) || m28345() != c11316.m28345()) {
            return false;
        }
        if ((m28345() && !m28359().equals(c11316.m28359())) || m28353() != c11316.m28353()) {
            return false;
        }
        if ((m28353() && !m28356().equals(c11316.m28356())) || m28357() != c11316.m28357()) {
            return false;
        }
        if ((!m28357() || m28347().equals(c11316.m28347())) && m28348() == c11316.m28348()) {
            return (!m28348() || this.f38189 == c11316.f38189) && getUnknownFields().equals(c11316.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46294.hashCode() + 779;
        if (hasName()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m28358()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + m28354().hashCode();
        }
        if (this.f38202.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + this.f38202.hashCode();
        }
        if (this.f38190.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 10, 53) + this.f38190.hashCode();
        }
        if (this.f38197.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 11, 53) + this.f38197.hashCode();
        }
        if (this.f38193.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + this.f38193.hashCode();
        }
        if (this.f38200.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + this.f38200.hashCode();
        }
        if (this.f38194.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + this.f38194.hashCode();
        }
        if (this.f38196.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 7, 53) + this.f38196.hashCode();
        }
        if (m28345()) {
            iHashCode = C17922.m41614(iHashCode, 37, 8, 53) + m28359().hashCode();
        }
        if (m28353()) {
            iHashCode = C17922.m41614(iHashCode, 37, 9, 53) + m28356().hashCode();
        }
        if (m28357()) {
            iHashCode = C17922.m41614(iHashCode, 37, 12, 53) + m28347().hashCode();
        }
        if (m28348()) {
            iHashCode = C17922.m41614(iHashCode, 37, 14, 53) + this.f38189;
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C11316 parseFrom(byte[] bArr) {
        return (C11316) ((C17665) f38187).parseFrom(bArr);
    }

    public static C6376 newBuilder() {
        return f38188.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f38188.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f38188.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C6376 toBuilder() {
        int i = 0;
        if (this == f38188) {
            return new C6376(i);
        }
        C6376 c6376 = new C6376(i);
        c6376.m17505(this);
        return c6376;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C6376(interfaceC6790, 0);
    }

    public static C11316 getDefaultInstance() {
        return f38188;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f38187;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f38188;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f38188;
    }
}
