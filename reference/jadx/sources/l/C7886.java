package l;

import java.io.IOException;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.۠ۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Z75Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7886 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f25929;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile SoftReference f25930;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f25931;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f25932;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f25933 = new Object();

    public C7886(long j, AbstractC20745 abstractC20745, String str) throws IOException {
        if (str != null && str.length() == 64) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.digit(str.charAt(i), 16) != -1) {
                }
            }
            if (j >= 0) {
                if (!abstractC20745.mo33971()) {
                    throw new IOException("Resource table is unavailable");
                }
                if (abstractC20745.mo33964() != j) {
                    throw new IOException("Resource table metadata length mismatch");
                }
                this.f25932 = abstractC20745;
                this.f25931 = str;
                this.f25929 = j;
                return;
            }
        }
        throw new IOException("Invalid resource table metadata");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1493 m20809() {
        C1493 c1493;
        C1493 c1494;
        if (this.f25930 != null && (c1494 = (C1493) this.f25930.get()) != null) {
            return c1494;
        }
        synchronized (this.f25933) {
            if (this.f25930 != null && (c1493 = (C1493) this.f25930.get()) != null) {
                return c1493;
            }
            try {
                C1493 c1495 = new C1493(this.f25932);
                c1495.m5142();
                this.f25930 = new SoftReference(c1495);
                return c1495;
            } catch (Exception e) {
                throw C12731.m31630("RESOURCE_TABLE_PARSE_FAILED", e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m20807() throws C12731 {
        try {
            byte[] bArrM49422 = C22253.m49422(this.f25931);
            if (bArrM49422.length == 32) {
                return bArrM49422;
            }
            throw new IllegalArgumentException("Invalid SHA-256 length");
        } catch (RuntimeException unused) {
            throw C12731.m31630("RESOURCE_TABLE_PARSE_FAILED", "Resource table metadata is invalid.");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m20808() {
        return this.f25929;
    }
}
