package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: S737 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7319 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f24109;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f24110;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f24111;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f24112;

    public C7319(long j, String str, String str2, String str3) {
        this.f24110 = j;
        this.f24109 = str;
        this.f24111 = str2;
        this.f24112 = str3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m20071() {
        return this.f24110;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20069() {
        return this.f24109;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m20072() {
        return this.f24111;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m20074() {
        return this.f24112;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7319 m20073(String str) {
        return new C7319(this.f24110, this.f24109, this.f24111, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20070(String str) throws IOException {
        String str2 = this.f24112;
        if (str2 != null && !str2.equals(str)) {
            throw new IOException("Remote payload metadata changed since it was opened");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20068(C7319 c7319, C7319 c73110) throws IOException {
        String str = c7319.f24111;
        String str2 = c7319.f24109;
        long j = c7319.f24110;
        long j2 = c73110.f24110;
        String str3 = c73110.f24109;
        if (j != j2) {
            throw new IOException("Remote resource length changed since it was opened");
        }
        if (C14030.m34159(str2)) {
            if (!str2.equals(str3)) {
                throw new IOException("Remote resource ETag changed since it was opened");
            }
        } else {
            if (str != null && !str.equals(c73110.f24111)) {
                throw new IOException("Remote resource Last-Modified changed since it was opened");
            }
            if (str == null && str2 != null && !str2.equals(str3)) {
                throw new IOException("Remote resource ETag changed since it was opened");
            }
        }
    }
}
