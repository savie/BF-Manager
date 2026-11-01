package l;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5C6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10557 extends AbstractRunnableC16096 {
    /* JADX INFO: renamed from: ܰ */
    public abstract String mo24955(AbstractC20745 abstractC20745);

    public AbstractC10557(C0572 c0572, String str) {
        super(c0572);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m26708(AbstractC20745 abstractC20745, StringBuilder sb) {
        if (!abstractC20745.mo33974()) {
            return "500 Internal error, listDirectory on non-directory\r\n";
        }
        List listMo33983 = abstractC20745.mo33983(true);
        Collections.sort(listMo33983, new C10791(1));
        Iterator it = listMo33983.iterator();
        while (it.hasNext()) {
            String strMo24955 = mo24955((AbstractC20745) it.next());
            if (strMo24955 != null) {
                sb.append(strMo24955);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m26709(String str) {
        C0572 c0572 = this.f52046;
        if (!c0572.m2716()) {
            c0572.m2698();
            return "425 Error opening data socket\r\n";
        }
        c0572.m2708("150 Opening " + (c0572.m2714() ? "BINARY" : "ASCII") + " mode data connection for file list\r\n");
        boolean zM2704 = false;
        try {
            byte[] bytes = str.getBytes(c0572.f2370);
            zM2704 = c0572.m2704(0, bytes.length, bytes);
        } catch (UnsupportedEncodingException unused) {
        }
        if (!zM2704) {
            c0572.m2698();
            return "426 Data socket or network error\r\n";
        }
        c0572.m2698();
        c0572.m2708("226 Data transmission OK\r\n");
        return null;
    }
}
