package l;

/* JADX INFO: renamed from: l.۫ᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QN */
/* JADX INFO: loaded from: classes4.dex */
public class C12569 extends C6218 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f42032;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f42033;

    public C12569(C18213 c18213, char[] cArr, int i) {
        super(c18213, cArr, cArr.length);
        this.f42033 = i;
        this.f42032 = 0;
    }

    @Override // l.C6218
    /* JADX INFO: renamed from: ۬ */
    public final char mo17251() {
        super.mo17251();
        if (m17249('\n') || m17249('\r') || m17249('\f')) {
            this.f42032 = 0;
        } else if (m17249('\t')) {
            this.f42032 = ((this.f42032 / 8) * 8) + 8;
        } else {
            this.f42032++;
        }
        return m17241();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m31289() {
        return m17240() + this.f42033;
    }
}
