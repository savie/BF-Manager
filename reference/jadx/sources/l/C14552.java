package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܳ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6ASH */
/* JADX INFO: loaded from: classes4.dex */
public final class C14552 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23724 f47643;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7766 f47644;

    public C14552(C23724 c23724, InterfaceC7766 interfaceC7766) {
        this.f47643 = c23724;
        this.f47644 = interfaceC7766;
    }

    public final String toString() {
        if (this.f47643.f76772 != null) {
            StringBuilder sb = new StringBuilder();
            ArrayList<C9613> arrayList = new ArrayList(this.f47643.f76774.keySet());
            Collections.sort(arrayList, new C11024());
            for (C9613 c9613 : arrayList) {
                C9613[] c9613Arr = c9613.f32386;
                int length = c9613Arr != null ? c9613Arr.length : 0;
                for (int i = 0; i < length; i++) {
                    C9613 c9614 = c9613.f32386[i];
                    if (c9614 != null && c9614.f32385 != Integer.MAX_VALUE) {
                        sb.append(m35017(c9613));
                        String strM47629 = ((C21171) this.f47644).m47629(i - 1);
                        sb.append("-");
                        sb.append(strM47629);
                        sb.append("->");
                        sb.append(m35017(c9614));
                        sb.append('\n');
                    }
                }
            }
            String string = sb.toString();
            if (string.length() != 0) {
                return string;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35017(C9613 c9613) {
        int i = c9613.f32385;
        StringBuilder sb = new StringBuilder();
        sb.append(c9613.f32384 ? ":" : "");
        sb.append(am.aB);
        sb.append(i);
        sb.append(c9613.f32380 ? "^" : "");
        String string = sb.toString();
        if (!c9613.f32384) {
            return string;
        }
        if (c9613.f32383 != null) {
            StringBuilder sbM8976 = C3012.m8976(string, "=>");
            sbM8976.append(Arrays.toString(c9613.f32383));
            return sbM8976.toString();
        }
        StringBuilder sbM8977 = C3012.m8976(string, "=>");
        sbM8977.append(c9613.f32387);
        return sbM8977.toString();
    }
}
