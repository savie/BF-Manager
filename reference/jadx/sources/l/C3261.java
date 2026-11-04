package l;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6M7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3261 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Map f10600 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f10601;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public char f10602 = 0;

    public C3261(StringBuilder sb) {
        this.f10601 = sb;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10651(String str) {
        m10648(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m10652(String str) {
        m10648(C16991.m40050(str));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m10650(String str) {
        m10649(str, f10600, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10649(String str, Map map, boolean z) {
        m10648("<");
        m10648(str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                m10648(" ");
                m10648(C16991.m40050((String) entry.getKey()));
                if (entry.getValue() != null) {
                    m10648("=\"");
                    m10648(C16991.m40050((String) entry.getValue()));
                    m10648("\"");
                }
            }
        }
        if (z) {
            m10648(" /");
        }
        m10648(">");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10647() {
        char c = this.f10602;
        if (c == 0 || c == '\n') {
            return;
        }
        m10648("\n");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10648(String str) {
        try {
            this.f10601.append((CharSequence) str);
            int length = str.length();
            if (length != 0) {
                this.f10602 = str.charAt(length - 1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
