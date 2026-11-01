package l;

/* JADX INFO: renamed from: l.᩻ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V1YC */
/* JADX INFO: loaded from: classes.dex */
public final class C23540 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f76230;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f76231;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f76232;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f76233;

    public C23540(C17367 c17367) {
        this.f76230 = c17367.m40458();
        this.f76233 = c17367.m40458();
        this.f76231 = C5553.m15313(c17367.m40458(), new String[0]);
        this.f76232 = c17367.readLong();
    }

    public C23540(AbstractC20745 abstractC20745, String str, String str2) {
        this.f76230 = str;
        this.f76233 = str2;
        this.f76231 = abstractC20745;
        this.f76232 = abstractC20745.mo33991();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m51889() {
        this.f76232 = this.f76231.mo33991();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m51887() {
        return this.f76232;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m51886() {
        AbstractC20745 abstractC20745 = this.f76231;
        return abstractC20745.mo33975() && abstractC20745.mo33991() != this.f76232;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m51883() {
        return this.f76230;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m51888() {
        return this.f76233;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m51884() {
        return this.f76231;
    }

    public final String toString() {
        return this.f76230;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51885(C11018 c11018) {
        c11018.m27786(this.f76230);
        c11018.m27786(this.f76233);
        c11018.m27786(this.f76231.mo33986());
        c11018.m27791(this.f76232);
    }
}
