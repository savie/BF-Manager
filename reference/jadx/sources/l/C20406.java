package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7JN */
/* JADX INFO: loaded from: classes4.dex */
public final class C20406 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f66110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f66111;

    public C20406() {
        try {
            InputStream resourceAsStream = C0649.class.getResourceAsStream("/assets/icons");
            try {
                C17367 c17367 = new C17367(C7539.m20058(resourceAsStream));
                int i = c17367.readInt();
                this.f66111 = new HashMap(i);
                for (int i2 = 0; i2 < i; i2++) {
                    this.f66111.put(c17367.m40458(), new int[]{c17367.readInt(), c17367.readInt()});
                }
                this.f66110 = c17367.m40451();
                resourceAsStream.close();
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m46043(String str, boolean z) {
        int i;
        int[] iArr = (int[]) this.f66111.get(str);
        if (iArr == null || (i = iArr[!z ? 1 : 0]) == -1) {
            return null;
        }
        byte[] bArr = this.f66110;
        if (i >= bArr.length) {
            return "";
        }
        int i2 = i;
        while (i2 < bArr.length && bArr[i2] != 0) {
            i2++;
        }
        if (bArr[i2] != 0) {
            i2++;
        }
        return new String(bArr, i, i2 - i, StandardCharsets.UTF_8);
    }
}
