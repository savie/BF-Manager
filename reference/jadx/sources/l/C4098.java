package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7JN */
/* JADX INFO: loaded from: classes2.dex */
public final class C4098 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f13959;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f13960;

    public C4098() {
        try {
            InputStream resourceAsStream = C14538.class.getResourceAsStream("/assets/icons");
            try {
                C20348 c20348 = new C20348(C4515.m14239(resourceAsStream));
                int i = c20348.readInt();
                this.f13960 = new HashMap(i);
                for (int i2 = 0; i2 < i; i2++) {
                    this.f13960.put(c20348.m46758(), new int[]{c20348.readInt(), c20348.readInt()});
                }
                this.f13959 = c20348.m46748();
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
    public final String m13189(String str, boolean z) {
        int i;
        int[] iArr = (int[]) this.f13960.get(str);
        if (iArr == null || (i = iArr[!z ? 1 : 0]) == -1) {
            return null;
        }
        byte[] bArr = this.f13959;
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
