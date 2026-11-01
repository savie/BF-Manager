package l;

import java.util.Date;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩴܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18803 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Date f60938;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f60939;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f60940;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC10068 f60941;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f60942;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final UUID f60943;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5089 f60944;

    public C18803() {
        throw null;
    }

    public C18803(AbstractC10068 abstractC10068, long j, UUID uuid, boolean z) {
        this.f60941 = abstractC10068;
        this.f60939 = j;
        this.f60943 = uuid;
        this.f60942 = z;
        this.f60938 = new Date();
        String strValueOf = String.valueOf(j);
        InterfaceC11440 interfaceC11440 = C13865.f45706;
        this.f60944 = new C5089(strValueOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m43365() {
        return this.f60940;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43367(long j) {
        this.f60940 = j;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5089 m43368() {
        return this.f60944;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m43369() {
        return this.f60939;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13557 m43366(InterfaceC4383 interfaceC4383) {
        C5089 c5089 = this.f60944;
        c5089.getClass();
        return new C13557(new C22023(c5089), interfaceC4383);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final UUID m43370() {
        return this.f60943;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Date m43371() {
        return this.f60938;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC10068 m43364() {
        return this.f60941;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m43363() {
        return this.f60942;
    }
}
