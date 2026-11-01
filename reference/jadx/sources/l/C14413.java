package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S737 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14413 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f47248;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f47249;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f47250;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f47251;

    public C14413(long j, String str, String str2, String str3) {
        this.f47250 = j;
        this.f47249 = str;
        this.f47251 = str2;
        this.f47248 = str3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m34682() {
        return this.f47250;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m34680() {
        return this.f47249;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m34683() {
        return this.f47251;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m34679() {
        return this.f47248;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14413 m34684(String str) {
        return new C14413(this.f47250, this.f47249, this.f47251, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34681(String str) throws IOException {
        String str2 = this.f47248;
        if (str2 != null && !str2.equals(str)) {
            throw new IOException("Remote payload metadata changed since it was opened");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34678(C14413 c14413, C14413 c14414) throws IOException {
        String str = c14413.f47251;
        String str2 = c14413.f47249;
        long j = c14413.f47250;
        long j2 = c14414.f47250;
        String str3 = c14414.f47249;
        if (j != j2) {
            throw new IOException("Remote resource length changed since it was opened");
        }
        if (C1711.m5707(str2)) {
            if (!str2.equals(str3)) {
                throw new IOException("Remote resource ETag changed since it was opened");
            }
        } else {
            if (str != null && !str.equals(c14414.f47251)) {
                throw new IOException("Remote resource Last-Modified changed since it was opened");
            }
            if (str == null && str2 != null && !str2.equals(str3)) {
                throw new IOException("Remote resource ETag changed since it was opened");
            }
        }
    }
}
