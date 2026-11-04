package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11561 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f36347;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24988 f36348;

    public RunnableC11561(C24988 c24988, HashMap map) {
        this.f36348 = c24988;
        this.f36347 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C24988 c24988 = this.f36348;
        try {
            InterfaceC11144 interfaceC11144M50401 = C22333.m50398().m50401(this.f36347, "https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf");
            String strA = interfaceC11144M50401.a();
            C21587.m49113("openSDK_LOG.OpenConfig", "update: get config statusCode " + interfaceC11144M50401.d());
            C24988.m55834(c24988, C20512.m47044(strA));
        } catch (Exception e) {
            C21587.m49112("openSDK_LOG.OpenConfig", "get config error ", e);
        }
        c24988.f80924 = 0;
    }
}
