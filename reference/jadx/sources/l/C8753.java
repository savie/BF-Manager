package l;

/* JADX INFO: renamed from: l.ۡ۠۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public final class C8753 extends AbstractC14728 implements InterfaceC23303 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22492 f30086;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C21825 f30087;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C21825 f30088;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21783 f30089;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21825 f30090;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21825 f30091;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f30092;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC11242 f30093;

    public C8753() {
        throw null;
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۙ */
    public final void mo1802(AbstractC19357 abstractC19357) {
        abstractC19357.mo1065(this);
    }

    @Override // l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final EnumC12490 mo1801() {
        long j = this.f30089.f70567;
        if ((8192 & j) != 0) {
            return EnumC12490.ANNOTATION_TYPE;
        }
        if ((512 & j) != 0) {
            return EnumC12490.INTERFACE;
        }
        if ((16384 & j) != 0) {
            return EnumC12490.ENUM;
        }
        if ((j & 2305843009213693952L) != 0) {
            return EnumC12490.RECORD;
        }
        return EnumC12490.CLASS;
    }

    @Override // l.AbstractC8774, l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1800(InterfaceC6139 interfaceC6139, Object obj) {
        return interfaceC6139.mo1879(this, obj);
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۨۙ */
    public final EnumC18651 mo1803() {
        return EnumC18651.f60468;
    }
}
