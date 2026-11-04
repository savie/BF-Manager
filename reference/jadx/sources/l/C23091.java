package l;

/* JADX INFO: renamed from: l.᩸᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes.dex */
public final class C23091 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13788 f74879;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11156 f74880;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f74881 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC3699 f74882;

    public C23091(C11156 c11156, C13788 c13788) {
        AbstractC3699 abstractC3699M14139;
        this.f74880 = c11156;
        this.f74879 = c13788;
        if (c11156.m28106(EnumC22345.CONTENT_CHECKSUM)) {
            C4445.m14138();
            abstractC3699M14139 = C4445.m14139();
        } else {
            abstractC3699M14139 = null;
        }
        this.f74882 = abstractC3699M14139;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51993(EnumC22345 enumC22345) {
        return this.f74880.m28106(enumC22345);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11156 m51997() {
        return this.f74880;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C13788 m51994() {
        return this.f74879;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51992(int i, byte[] bArr) {
        this.f74882.mo12020(i, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51991() {
        return this.f74882.mo12019();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51996() {
        this.f74881 = true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m51995() {
        return this.f74881;
    }
}
