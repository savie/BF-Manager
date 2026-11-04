package l;

/* JADX INFO: renamed from: l.ܺۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6GW */
/* JADX INFO: loaded from: classes5.dex */
public class C16743 extends AbstractC9284 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f54053;

    public C16743(EnumC24203 enumC24203, int i, int i2) {
        super(enumC24203, i2);
        this.f54053 = i;
    }

    public C16743(int i) {
        this(EnumC24203.GOTO, i, 0);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int mo39519() {
        return this.f54053;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public C18959 mo4072() {
        C16743 c16743 = new C16743(this.f54053);
        m44033(c16743);
        return c16743;
    }

    @Override // l.C18959
    public String toString() {
        return super.toString() + "-> " + C8314.m22396(this.f54053);
    }
}
