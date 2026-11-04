package l;

/* JADX INFO: renamed from: l.ܿۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BEJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18050 extends AbstractC5875 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4383 f59107;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f59108;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f59109;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13836 f59110;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8112 f59111;

    public C18050(int i, int i2, C8112 c8112, C4383 c4383, C13836 c13836) {
        super("Code");
        if (i < 0) {
            throw new IllegalArgumentException("maxStack < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxLocals < 0");
        }
        try {
            if (c4383.m46489()) {
                throw new C12017("catches.isMutable()", null);
            }
            try {
                if (c13836.m46489()) {
                    throw new C12017("attributes.isMutable()", null);
                }
                this.f59108 = i;
                this.f59109 = i2;
                this.f59111 = c8112;
                this.f59107 = c4383;
                this.f59110 = c13836;
            } catch (NullPointerException unused) {
                throw new NullPointerException("attributes == null");
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("catches == null");
        }
    }

    @Override // l.InterfaceC1159
    /* JADX INFO: renamed from: ۙ */
    public final int mo1345() {
        return this.f59110.m33787() + (this.f59107.size() * 8) + 2 + this.f59111.m21997() + 10;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m42068() {
        return this.f59108;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m42069() {
        return this.f59109;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8112 m42071() {
        return this.f59111;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4383 m42067() {
        return this.f59107;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13836 m42070() {
        return this.f59110;
    }
}
