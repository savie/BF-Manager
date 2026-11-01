package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩷᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21145 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f68866;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f68867;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f68868;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f68869;

    public C21145(long j, AbstractC20745 abstractC20745, String str, boolean z) {
        this.f68869 = abstractC20745;
        this.f68867 = z;
        this.f68868 = j;
        this.f68866 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m47580() throws IOException {
        if (!this.f68867) {
            throw new IOException("The source file does not exist");
        }
        return this.f68869.mo33970();
    }
}
