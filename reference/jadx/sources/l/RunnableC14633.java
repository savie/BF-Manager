package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14633 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f47863;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1931 f47864;

    public RunnableC14633(C1931 c1931, HashMap map) {
        this.f47864 = c1931;
        this.f47863 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1931 c1931 = this.f47864;
        try {
            InterfaceC16894 interfaceC16894M2992 = C0665.m2989().m2992(this.f47863, "https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf");
            String strA = interfaceC16894M2992.a();
            C23099.m51113("openSDK_LOG.OpenConfig", "update: get config statusCode " + interfaceC16894M2992.d());
            C1931.m6270(c1931, C2761.m8423(strA));
        } catch (Exception e) {
            C23099.m51111("openSDK_LOG.OpenConfig", "get config error ", e);
        }
        c1931.f7309 = 0;
    }
}
