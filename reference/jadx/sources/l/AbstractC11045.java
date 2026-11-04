package l;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۤᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5C6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11045 extends AbstractRunnableC15257 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract String mo27932(AbstractC22044 abstractC22044);

    public AbstractC11045(C5563 c5563, String str) {
        super(c5563);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27930(AbstractC22044 abstractC22044, StringBuilder sb) {
        if (!abstractC22044.mo4281()) {
            return "500 Internal error, listDirectory on non-directory\r\n";
        }
        List listMo4299 = abstractC22044.mo4299(true);
        Collections.sort(listMo4299, new C22234());
        Iterator it = listMo4299.iterator();
        while (it.hasNext()) {
            String strMo27932 = mo27932((AbstractC22044) it.next());
            if (strMo27932 != null) {
                sb.append(strMo27932);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m27931(String str) {
        C5563 c5563 = this.f49894;
        if (!c5563.m16499()) {
            c5563.m16477();
            return "425 Error opening data socket\r\n";
        }
        c5563.m16486("150 Opening " + (c5563.m16491() ? "BINARY" : "ASCII") + " mode data connection for file list\r\n");
        boolean zM16483 = false;
        try {
            byte[] bytes = str.getBytes(c5563.f19321);
            zM16483 = c5563.m16483(0, bytes.length, bytes);
        } catch (UnsupportedEncodingException unused) {
        }
        if (!zM16483) {
            c5563.m16477();
            return "426 Data socket or network error\r\n";
        }
        c5563.m16477();
        c5563.m16486("226 Data transmission OK\r\n");
        return null;
    }
}
