package l;

/* JADX INFO: renamed from: l.ᩳۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 16QA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18870 implements InterfaceC17693 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61267;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence f61268;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f61269;

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۙ */
    public final int mo11529() {
        return -1;
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۤ */
    public final void mo11533(int i) {
    }

    public C18870(CharSequence charSequence) {
        this.f61268 = charSequence;
        m43769();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence m43770() {
        return this.f61268;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m43769() {
        if (Thread.currentThread().isInterrupted()) {
            throw new C7683();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43768(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if ((i & 1023) == 0) {
                m43769();
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\n') {
                return "\n";
            }
            if (cCharAt == '\r') {
                int i2 = i + 1;
                return (i2 >= charSequence.length() || charSequence.charAt(i2) != '\n') ? "\r" : "\r\n";
            }
        }
        return "\n";
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11538() {
        if (this.f61267 >= this.f61268.length()) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f61267 + 1;
        this.f61267 = i;
        if ((i & 1023) == 0) {
            m43769();
        }
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ᩷ */
    public final int mo11537(int i) {
        int i2 = this.f61269 + 1;
        this.f61269 = i2;
        if ((i2 & 1023) == 0) {
            m43769();
        }
        if (i == 0) {
            return 0;
        }
        long j = this.f61267;
        if (i > 0) {
            i--;
        }
        long j2 = j + ((long) i);
        if (j2 < 0) {
            return -1;
        }
        CharSequence charSequence = this.f61268;
        if (j2 >= charSequence.length()) {
            return -1;
        }
        return charSequence.charAt((int) j2);
    }

    @Override // l.InterfaceC4269
    public final int index() {
        return this.f61267;
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۙ */
    public final void mo11530(int i) {
        this.f61267 = i;
    }

    @Override // l.InterfaceC4269
    public final int size() {
        return this.f61268.length();
    }

    @Override // l.InterfaceC17693
    /* JADX INFO: renamed from: ۙ */
    public final String mo19728(C4467 c4467) {
        int i = c4467.f15984;
        CharSequence charSequence = this.f61268;
        return C18856.m43743(i, Math.min(charSequence.length(), c4467.f15985 + 1), charSequence);
    }
}
