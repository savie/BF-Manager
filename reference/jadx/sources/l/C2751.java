package l;

import java.io.IOException;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.ۖܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z75Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C2751 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile SoftReference f9107;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f9108;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f9109;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f9110 = new Object();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f9111;

    public C2751(long j, AbstractC22044 abstractC22044, String str) throws IOException {
        if (str != null && str.length() == 64) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.digit(str.charAt(i), 16) != -1) {
                }
            }
            if (j >= 0) {
                if (!abstractC22044.mo4304()) {
                    throw new IOException("Resource table is unavailable");
                }
                if (abstractC22044.mo4285() != j) {
                    throw new IOException("Resource table metadata length mismatch");
                }
                this.f9108 = abstractC22044;
                this.f9109 = str;
                this.f9111 = j;
                return;
            }
        }
        throw new IOException("Invalid resource table metadata");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24296 m9101() {
        C24296 c24296;
        C24296 c24297;
        if (this.f9107 != null && (c24297 = (C24296) this.f9107.get()) != null) {
            return c24297;
        }
        synchronized (this.f9110) {
            if (this.f9107 != null && (c24296 = (C24296) this.f9107.get()) != null) {
                return c24296;
            }
            try {
                C24296 c24298 = new C24296(this.f9108);
                c24298.m54313();
                this.f9107 = new SoftReference(c24298);
                return c24298;
            } catch (Exception e) {
                throw C10186.m26305("RESOURCE_TABLE_PARSE_FAILED", e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m9099() throws C10186 {
        try {
            byte[] bArrM36180 = C15022.m36180(this.f9109);
            if (bArrM36180.length == 32) {
                return bArrM36180;
            }
            throw new IllegalArgumentException("Invalid SHA-256 length");
        } catch (RuntimeException unused) {
            throw C10186.m26305("RESOURCE_TABLE_PARSE_FAILED", "Resource table metadata is invalid.");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m9100() {
        return this.f9111;
    }
}
