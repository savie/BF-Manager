package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QB */
/* JADX INFO: loaded from: classes4.dex */
public final class C18378 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6236 f58620;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21906 f58621;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f58622 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16967 m42661(C13689 c13689) {
        C21906 c21906;
        c13689.f45157.getClass();
        C6236 c6236 = c13689.f45157.f48031;
        if (c6236 == null) {
            return InterfaceC16967.f54298;
        }
        synchronized (this.f58622) {
            if (!c6236.equals(this.f58620)) {
                this.f58620 = c6236;
                this.f58621 = m42660(c6236);
            }
            c21906 = this.f58621;
            c21906.getClass();
        }
        return c21906;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21906 m42660(C6236 c6236) {
        C10846 c10846 = new C10846();
        Uri uri = c6236.f21160;
        C5407 c5407 = new C5407(uri == null ? null : uri.toString(), c6236.f21159, c10846);
        AbstractC0477 it = c6236.f21158.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c5407.m14976((String) entry.getKey(), (String) entry.getValue());
        }
        C12029 c12029 = new C12029();
        c12029.m29926(c6236.f21162);
        c12029.m29927(c6236.f21164);
        c12029.m29929(c6236.f21157);
        c12029.m29928(C17039.m39821(c6236.f21163));
        C21906 c21906M29925 = c12029.m29925(c5407);
        c21906M29925.m48726(c6236.m17291());
        return c21906M29925;
    }
}
