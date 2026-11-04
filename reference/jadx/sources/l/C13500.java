package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.۬֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13500 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16394 f42923;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C6789 f42924;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f42925 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24929 m33171(C14902 c14902) {
        C6789 c6789;
        c14902.f48681.getClass();
        C16394 c16394 = c14902.f48681.f66800;
        if (c16394 == null) {
            return InterfaceC24929.f80694;
        }
        synchronized (this.f42925) {
            if (!c16394.equals(this.f42923)) {
                this.f42923 = c16394;
                this.f42924 = m33170(c16394);
            }
            c6789 = this.f42924;
            c6789.getClass();
        }
        return c6789;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6789 m33170(C16394 c16394) {
        C16416 c16416 = new C16416();
        Uri uri = c16394.f53203;
        C0316 c0316 = new C0316(uri == null ? null : uri.toString(), c16394.f53198, c16416);
        AbstractC4516 it = c16394.f53205.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c0316.m1989((String) entry.getKey(), (String) entry.getValue());
        }
        C20959 c20959 = new C20959();
        c20959.m47911(c16394.f53199);
        c20959.m47912(c16394.f53202);
        c20959.m47914(c16394.f53201);
        c20959.m47913(C18444.m42973(c16394.f53204));
        C6789 c6789M47910 = c20959.m47910(c0316);
        c6789M47910.m18951(c16394.m38920());
        return c6789M47910;
    }
}
