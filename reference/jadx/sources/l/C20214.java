package l;

/* JADX INFO: renamed from: l.᩶ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BEJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20214 extends AbstractC1100 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C16624 f65588;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f65589;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7451 f65590;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9300 f65591;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f65592;

    public C20214(int i, int i2, C16624 c16624, C7451 c7451, C9300 c9300) {
        super("Code");
        if (i < 0) {
            throw new IllegalArgumentException("maxStack < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxLocals < 0");
        }
        try {
            if (c7451.m43640()) {
                throw new C8364("catches.isMutable()", null);
            }
            try {
                if (c9300.m43640()) {
                    throw new C8364("attributes.isMutable()", null);
                }
                this.f65592 = i;
                this.f65589 = i2;
                this.f65588 = c16624;
                this.f65590 = c7451;
                this.f65591 = c9300;
            } catch (NullPointerException unused) {
                throw new NullPointerException("attributes == null");
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("catches == null");
        }
    }

    @Override // l.InterfaceC5771
    /* JADX INFO: renamed from: ۙ */
    public final int mo2281() {
        return this.f65591.m23872() + (this.f65590.size() * 8) + 2 + this.f65588.m39088() + 10;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m45671() {
        return this.f65592;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m45668() {
        return this.f65589;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C16624 m45667() {
        return this.f65588;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7451 m45669() {
        return this.f65590;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9300 m45670() {
        return this.f65591;
    }
}
