package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB82 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5804 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f19944;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C5804 m16929(String str) throws IOException {
        if (str == null || str.isEmpty()) {
            return new C5804();
        }
        InputStream inputStreamMo4290 = C14584.m35193(str, new String[0]).mo4290();
        try {
            C5804 c5804 = new C5804(inputStreamMo4290);
            if (inputStreamMo4290 != null) {
                inputStreamMo4290.close();
            }
            return c5804;
        } catch (Throwable th) {
            if (inputStreamMo4290 != null) {
                try {
                    inputStreamMo4290.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C5804(InputStream inputStream) {
        this.f19944 = C6798.m18980(inputStream).m18981();
    }

    public C5804() {
        this.f19944 = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m16930(String str) {
        return (String) C11392.getOrDefault(this.f19944, str, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C1170.stream(this.f19944.entrySet()).sorted(new C15498()).forEach(new C13261(0, sb));
        return sb.toString();
    }
}
