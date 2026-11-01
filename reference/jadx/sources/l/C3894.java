package l;

/* JADX INFO: renamed from: l.ۘۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16QA */
/* JADX INFO: loaded from: classes3.dex */
public final class C3894 implements InterfaceC1623 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f14561;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence f14562;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f14563;

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo11328() {
        return -1;
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo11331(int i) {
    }

    public C3894(CharSequence charSequence) {
        this.f14562 = charSequence;
        m11326();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence m11330() {
        return this.f14562;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m11326() {
        if (Thread.currentThread().isInterrupted()) {
            throw new C13068();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11327(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if ((i & 1023) == 0) {
                m11326();
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

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11333() {
        if (this.f14561 >= this.f14562.length()) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f14561 + 1;
        this.f14561 = i;
        if ((i & 1023) == 0) {
            m11326();
        }
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo11332(int i) {
        int i2 = this.f14563 + 1;
        this.f14563 = i2;
        if ((i2 & 1023) == 0) {
            m11326();
        }
        if (i == 0) {
            return 0;
        }
        long j = this.f14561;
        if (i > 0) {
            i--;
        }
        long j2 = j + ((long) i);
        if (j2 < 0) {
            return -1;
        }
        CharSequence charSequence = this.f14562;
        if (j2 >= charSequence.length()) {
            return -1;
        }
        return charSequence.charAt((int) j2);
    }

    @Override // l.InterfaceC22583
    public final int index() {
        return this.f14561;
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11329(int i) {
        this.f14561 = i;
    }

    @Override // l.InterfaceC22583
    public final int size() {
        return this.f14562.length();
    }

    @Override // l.InterfaceC1623
    /* JADX INFO: renamed from: ۙ */
    public final String mo5499(C22043 c22043) {
        int i = c22043.f71443;
        CharSequence charSequence = this.f14562;
        return C21460.m48081(i, Math.min(charSequence.length(), c22043.f71444 + 1), charSequence);
    }
}
