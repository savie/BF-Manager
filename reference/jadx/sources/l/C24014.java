package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8ET */
/* JADX INFO: loaded from: classes.dex */
public final class C24014 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m53568(String str) throws IOException {
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException unused) {
            throw new IOException(C25272.m56409("Unable to parse int from string value: ", str));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m53569(String str) throws IOException {
        try {
            return Long.parseLong(str, 10);
        } catch (NumberFormatException unused) {
            throw new IOException(C25272.m56409("Unable to parse long from string value: ", str));
        }
    }
}
