package l;

/* JADX INFO: renamed from: l.ۜ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H6P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7155 implements InterfaceC17693 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f23654;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence f23655;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f23656;

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۙ */
    public final int mo11529() {
        return -1;
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۤ */
    public final void mo11533(int i) {
    }

    public C7155(CharSequence charSequence) {
        this.f23655 = charSequence;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char m19729(int i) {
        return this.f23655.charAt(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m19727() {
        if (Thread.currentThread().isInterrupted()) {
            throw new C8646();
        }
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11538() {
        if (this.f23654 >= this.f23655.length()) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f23654 + 1;
        this.f23654 = i;
        if ((i & 1023) == 0) {
            m19727();
        }
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ᩷ */
    public final int mo11537(int i) {
        int i2 = this.f23656 + 1;
        this.f23656 = i2;
        if ((i2 & 1023) == 0) {
            m19727();
        }
        if (i == 0) {
            return 0;
        }
        int i3 = this.f23654;
        if (i > 0) {
            i--;
        }
        int i4 = i3 + i;
        if (i4 < 0) {
            return -1;
        }
        CharSequence charSequence = this.f23655;
        if (i4 >= charSequence.length()) {
            return -1;
        }
        return charSequence.charAt(i4);
    }

    @Override // l.InterfaceC4269
    public final int index() {
        return this.f23654;
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۙ */
    public final void mo11530(int i) {
        this.f23654 = i;
    }

    @Override // l.InterfaceC4269
    public final int size() {
        return this.f23655.length();
    }

    @Override // l.InterfaceC17693
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo19728(C4467 c4467) {
        int i = c4467.f15984;
        CharSequence charSequence = this.f23655;
        return C18856.m43743(i, Math.min(charSequence.length(), c4467.f15985 + 1), charSequence);
    }
}
