package l;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R6M7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14470 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Map f47441 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f47442;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char f47443 = 0;

    public C14470(StringBuilder sb) {
        this.f47442 = sb;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34876(String str) {
        m34873(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m34871(String str) {
        m34873(C6270.m17349(str));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34875(String str) {
        m34874(str, f47441, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34874(String str, Map map, boolean z) {
        m34873("<");
        m34873(str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                m34873(" ");
                m34873(C6270.m17349((String) entry.getKey()));
                if (entry.getValue() != null) {
                    m34873("=\"");
                    m34873(C6270.m17349((String) entry.getValue()));
                    m34873("\"");
                }
            }
        }
        if (z) {
            m34873(" /");
        }
        m34873(">");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34872() {
        char c = this.f47443;
        if (c == 0 || c == '\n') {
            return;
        }
        m34873("\n");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34873(String str) {
        try {
            this.f47442.append((CharSequence) str);
            int length = str.length();
            if (length != 0) {
                this.f47443 = str.charAt(length - 1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
