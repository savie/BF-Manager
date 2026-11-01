package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶ۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB82 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19999 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f64015;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C19999 m45285(String str) throws IOException {
        if (str == null || str.isEmpty()) {
            return new C19999();
        }
        InputStream inputStreamMo33970 = C5553.m15313(str, new String[0]).mo33970();
        try {
            C19999 c19999 = new C19999(inputStreamMo33970);
            if (inputStreamMo33970 != null) {
                inputStreamMo33970.close();
            }
            return c19999;
        } catch (Throwable th) {
            if (inputStreamMo33970 != null) {
                try {
                    inputStreamMo33970.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C19999(InputStream inputStream) {
        this.f64015 = C11186.m28126(inputStream).m28127();
    }

    public C19999() {
        this.f64015 = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m45286(String str) {
        return (String) C9735.getOrDefault(this.f64015, str, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C9030.stream(this.f64015.entrySet()).sorted(new C20704()).forEach(new C15766(0, sb));
        return sb.toString();
    }
}
