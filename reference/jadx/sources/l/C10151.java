package l;

import android.content.Context;
import android.webkit.CookieSyncManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۤ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C10151 extends C21812 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7328 f34656;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Context f34657;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18284 f34658;

    public C10151(C7328 c7328, Context context, InterfaceC18284 interfaceC18284) {
        this.f34656 = c7328;
        this.f34657 = context;
        this.f34658 = interfaceC18284;
        C23099.m51110("openSDK_LOG.AuthAgent", "OpenUi, TokenListener()");
    }

    @Override // l.InterfaceC18284
    /* JADX INFO: renamed from: ۙ */
    public final void mo16215(JSONObject jSONObject) {
        C7328 c7328 = this.f34656;
        C23099.m51110("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete");
        try {
            String string = jSONObject.getString("access_token");
            String string2 = jSONObject.getString("expires_in");
            String string3 = jSONObject.getString("openid");
            Context context = this.f34657;
            if (string != null) {
                C15796 unused = c7328.f5744;
                if (string3 != null) {
                    c7328.f5744.m37567(string, string2);
                    c7328.f5744.m37566(string3);
                    C22851.m50587(context, c7328.f5744);
                }
            }
            String string4 = jSONObject.getString("pf");
            if (string4 != null) {
                try {
                    context.getSharedPreferences("pfStore", 0).edit().putString("pf", string4).commit();
                } catch (Exception e) {
                    C23099.m51111("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e);
                }
            }
            CookieSyncManager.getInstance().sync();
        } catch (JSONException e2) {
            C23099.m51111("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e2);
        }
        this.f34658.mo16215(jSONObject);
        c7328.m19596();
        C23099.m51114();
    }

    @Override // l.InterfaceC18284
    /* JADX INFO: renamed from: ۙ */
    public final void mo16214(C8407 c8407) {
        C23099.m51110("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onError");
        this.f34658.mo16214(c8407);
        C23099.m51114();
    }

    @Override // l.InterfaceC18284
    /* JADX INFO: renamed from: ۙ */
    public final void mo16213() {
        C23099.m51110("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onCancel");
        this.f34658.mo16213();
        C23099.m51114();
    }
}
