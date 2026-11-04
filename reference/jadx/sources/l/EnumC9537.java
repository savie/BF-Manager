package l;

/* JADX INFO: renamed from: l.ۡܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC9537 implements InterfaceC23425 {
    DECLARATION(0),
    UNVERIFIED(1);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f30879 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1818 f30880;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC9537[] f30882;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f30884 = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f30886;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC9537.class.getName());
        f30880 = new C1335();
        f30882 = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.f30886;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC9537 m24956(int i) {
        return m24952(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9537 m24952(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i != 1) {
            return null;
        }
        return UNVERIFIED;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1818 m24954() {
        return f30880;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1357 m24958() {
        return (C1357) m24955().m21965().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8069 m24957() {
        return m24955();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8069 m24955() {
        int i = C2826.f9278;
        return (C8069) C12543.f40255.m54743().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9537 m24953(C1357 c1357) {
        if (c1357.getType() != m24955()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f30882[c1357.m5001()];
    }

    EnumC9537(int i) {
        this.f30886 = i;
    }
}
