package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۨܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12512 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f40173;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f40174;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f40175;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f40176;

    public C12512(long j, AbstractC22044 abstractC22044, String str, boolean z) {
        this.f40175 = abstractC22044;
        this.f40173 = z;
        this.f40174 = j;
        this.f40176 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m31067() throws IOException {
        if (!this.f40173) {
            throw new IOException("The source file does not exist");
        }
        return this.f40175.mo4290();
    }
}
