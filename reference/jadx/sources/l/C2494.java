package l;

/* JADX INFO: renamed from: l.ۖۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M60I */
/* JADX INFO: loaded from: classes3.dex */
public final class C2494 extends C13352 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7991 = 0;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C8002 f7992;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C4273 f7993;

    @Override // l.C13352
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8381() {
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2494(C8002 c8002) {
        String strM21843 = c8002.m21843();
        String parent = c8002.getParent();
        super(strM21843, parent != null ? "/".concat(parent) : "/", null, c8002.getSize(), c8002.getTime(), !c8002.isDirectory());
        this.f7992 = c8002;
        C4273 c4273M21836 = c8002.m21836();
        this.f7993 = c4273M21836;
        if (c4273M21836 == null || !c4273M21836.m13622()) {
            return;
        }
        m32931(c4273M21836.m13623());
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo8113() {
        return this.f7992.m21856();
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ۛ᩷ */
    public final C9097 mo5155() {
        C4273 c4273 = this.f7993;
        if (c4273 == null || !c4273.m13624()) {
            return null;
        }
        return new C9097(c4273.m13621(), (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8002 m8382() {
        return this.f7992;
    }
}
