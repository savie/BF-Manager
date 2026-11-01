package l;

/* JADX INFO: renamed from: l.ۘ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4259 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15372 = 0;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f15373;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final C4259 f15374;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile Object f15375;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f15376;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f15377;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile Object f15378;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile Object f15379;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f15380;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f15381;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12727 f15382;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f15383;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile Object f15384;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte f15385;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Object f15386;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f15387;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C4259.class.getName());
        f15374 = new C4259();
        f15373 = new C12022();
    }

    public C4259(C2848 c2848, int i) {
        super(c2848);
        this.f15378 = "";
        this.f15380 = 0;
        this.f15381 = 1;
        this.f15377 = 1;
        this.f15379 = "";
        this.f15375 = "";
        this.f15386 = "";
        this.f15387 = 0;
        this.f15384 = "";
        this.f15376 = false;
        this.f15385 = (byte) -1;
    }

    public C4259() {
        this.f15378 = "";
        this.f15380 = 0;
        this.f15381 = 1;
        this.f15377 = 1;
        this.f15379 = "";
        this.f15375 = "";
        this.f15386 = "";
        this.f15387 = 0;
        this.f15384 = "";
        this.f15376 = false;
        this.f15385 = (byte) -1;
        this.f15378 = "";
        this.f15381 = 1;
        this.f15377 = 1;
        this.f15379 = "";
        this.f15375 = "";
        this.f15386 = "";
        this.f15384 = "";
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46326;
        c6956.m18696(C4259.class, C2848.class);
        return c6956;
    }

    public final boolean hasName() {
        return (this.f15383 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f15378;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f15378 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m12053() {
        return (this.f15383 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m12046() {
        return this.f15380;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m12041() {
        return (this.f15383 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final EnumC22605 m12055() {
        EnumC22605 enumC22605M50106 = EnumC22605.m50106(this.f15381);
        return enumC22605M50106 == null ? EnumC22605.LABEL_OPTIONAL : enumC22605M50106;
    }

    public final boolean hasType() {
        return (this.f15383 & 8) != 0;
    }

    public final EnumC13433 getType() {
        EnumC13433 enumC13433M32925 = EnumC13433.m32925(this.f15377);
        return enumC13433M32925 == null ? EnumC13433.TYPE_DOUBLE : enumC13433M32925;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m12048() {
        return (this.f15383 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m12042() {
        Object obj = this.f15379;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f15379 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m12043() {
        return (this.f15383 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m12039() {
        Object obj = this.f15375;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f15375 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m12051() {
        return (this.f15383 & 64) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m12045() {
        Object obj = this.f15386;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f15386 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m12047() {
        return (this.f15383 & 128) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m12054() {
        return this.f15387;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m12044() {
        return (this.f15383 & 256) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m12040() {
        Object obj = this.f15384;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f15384 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m12052() {
        return (this.f15383 & 512) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12727 m12049() {
        C12727 c12727 = this.f15382;
        return c12727 == null ? C12727.getDefaultInstance() : c12727;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m12038() {
        return (this.f15383 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m12050() {
        return this.f15376;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f15385;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m12052() && !m12049().isInitialized()) {
            this.f15385 = (byte) 0;
            return false;
        }
        this.f15385 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f15383 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.f15378);
        }
        if ((this.f15383 & 32) != 0) {
            AbstractC18245.m42405(abstractC22044, 2, this.f15375);
        }
        if ((this.f15383 & 2) != 0) {
            abstractC22044.mo14252(3, this.f15380);
        }
        if ((this.f15383 & 4) != 0) {
            abstractC22044.mo14252(4, this.f15381);
        }
        if ((this.f15383 & 8) != 0) {
            abstractC22044.mo14252(5, this.f15377);
        }
        if ((this.f15383 & 16) != 0) {
            AbstractC18245.m42405(abstractC22044, 6, this.f15379);
        }
        if ((this.f15383 & 64) != 0) {
            AbstractC18245.m42405(abstractC22044, 7, this.f15386);
        }
        if ((this.f15383 & 512) != 0) {
            abstractC22044.mo14254(8, m12049());
        }
        if ((this.f15383 & 128) != 0) {
            abstractC22044.mo14252(9, this.f15387);
        }
        if ((this.f15383 & 256) != 0) {
            AbstractC18245.m42405(abstractC22044, 10, this.f15384);
        }
        if ((this.f15383 & 1024) != 0) {
            abstractC22044.mo14240(17, this.f15376);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.f15383 & 1) != 0 ? AbstractC18245.m42390(1, this.f15378) : 0;
        if ((this.f15383 & 32) != 0) {
            iM42390 += AbstractC18245.m42390(2, this.f15375);
        }
        if ((this.f15383 & 2) != 0) {
            iM42390 += AbstractC22044.m48974(3, this.f15380);
        }
        if ((this.f15383 & 4) != 0) {
            iM42390 += AbstractC22044.m48966(4, this.f15381);
        }
        if ((this.f15383 & 8) != 0) {
            iM42390 += AbstractC22044.m48966(5, this.f15377);
        }
        if ((this.f15383 & 16) != 0) {
            iM42390 += AbstractC18245.m42390(6, this.f15379);
        }
        if ((this.f15383 & 64) != 0) {
            iM42390 += AbstractC18245.m42390(7, this.f15386);
        }
        if ((this.f15383 & 512) != 0) {
            iM42390 += AbstractC22044.m48963(8, m12049());
        }
        if ((this.f15383 & 128) != 0) {
            iM42390 += AbstractC22044.m48974(9, this.f15387);
        }
        if ((this.f15383 & 256) != 0) {
            iM42390 += AbstractC18245.m42390(10, this.f15384);
        }
        if ((this.f15383 & 1024) != 0) {
            iM42390 += AbstractC22044.m48961(17);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM42390;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4259)) {
            return super.equals(obj);
        }
        C4259 c4259 = (C4259) obj;
        if (hasName() != c4259.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c4259.getName())) || m12053() != c4259.m12053()) {
            return false;
        }
        if ((m12053() && this.f15380 != c4259.f15380) || m12041() != c4259.m12041()) {
            return false;
        }
        if ((m12041() && this.f15381 != c4259.f15381) || hasType() != c4259.hasType()) {
            return false;
        }
        if ((hasType() && this.f15377 != c4259.f15377) || m12048() != c4259.m12048()) {
            return false;
        }
        if ((m12048() && !m12042().equals(c4259.m12042())) || m12043() != c4259.m12043()) {
            return false;
        }
        if ((m12043() && !m12039().equals(c4259.m12039())) || m12051() != c4259.m12051()) {
            return false;
        }
        if ((m12051() && !m12045().equals(c4259.m12045())) || m12047() != c4259.m12047()) {
            return false;
        }
        if ((m12047() && this.f15387 != c4259.f15387) || m12044() != c4259.m12044()) {
            return false;
        }
        if ((m12044() && !m12040().equals(c4259.m12040())) || m12052() != c4259.m12052()) {
            return false;
        }
        if ((!m12052() || m12049().equals(c4259.m12049())) && m12038() == c4259.m12038()) {
            return (!m12038() || this.f15376 == c4259.f15376) && getUnknownFields().equals(c4259.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46292.hashCode() + 779;
        if (hasName()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m12053()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + this.f15380;
        }
        if (m12041()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + this.f15381;
        }
        if (hasType()) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + this.f15377;
        }
        if (m12048()) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + m12042().hashCode();
        }
        if (m12043()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + m12039().hashCode();
        }
        if (m12051()) {
            iHashCode = C17922.m41614(iHashCode, 37, 7, 53) + m12045().hashCode();
        }
        if (m12047()) {
            iHashCode = C17922.m41614(iHashCode, 37, 9, 53) + this.f15387;
        }
        if (m12044()) {
            iHashCode = C17922.m41614(iHashCode, 37, 10, 53) + m12040().hashCode();
        }
        if (m12052()) {
            iHashCode = C17922.m41614(iHashCode, 37, 8, 53) + m12049().hashCode();
        }
        if (m12038()) {
            iHashCode = C17922.m41614(iHashCode, 37, 17, 53) + C9779.m24888(this.f15376);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C2848 newBuilder() {
        return f15374.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f15374.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f15374.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C2848 toBuilder() {
        int i = 0;
        if (this == f15374) {
            return new C2848(i);
        }
        C2848 c2848 = new C2848(i);
        c2848.m8617(this);
        return c2848;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C2848(interfaceC6790, 0);
    }

    public static C4259 getDefaultInstance() {
        return f15374;
    }

    public static InterfaceC6271 parser() {
        return f15373;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f15373;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f15374;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f15374;
    }
}
