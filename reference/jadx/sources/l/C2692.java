package l;

import android.content.Context;
import android.webkit.CookieSyncManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۖ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C2692 extends C7833 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8658 f8567;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Context f8568;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19020 f8569;

    public C2692(C8658 c8658, Context context, InterfaceC19020 interfaceC19020) {
        this.f8567 = c8658;
        this.f8568 = context;
        this.f8569 = interfaceC19020;
        C21587.m49111("openSDK_LOG.AuthAgent", "OpenUi, TokenListener()");
    }

    @Override // l.InterfaceC19020
    /* JADX INFO: renamed from: ۙ */
    public final void mo2048(JSONObject jSONObject) {
        C8658 c8658 = this.f8567;
        C21587.m49111("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete");
        try {
            String string = jSONObject.getString("access_token");
            String string2 = jSONObject.getString("expires_in");
            String string3 = jSONObject.getString("openid");
            Context context = this.f8568;
            if (string != null) {
                C13878 unused = c8658.f21019;
                if (string3 != null) {
                    c8658.f21019.m33820(string, string2);
                    c8658.f21019.m33819(string3);
                    C21338.m48568(context, c8658.f21019);
                }
            }
            String string4 = jSONObject.getString("pf");
            if (string4 != null) {
                try {
                    context.getSharedPreferences("pfStore", 0).edit().putString("pf", string4).commit();
                } catch (Exception e) {
                    C21587.m49112("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e);
                }
            }
            CookieSyncManager.getInstance().sync();
        } catch (JSONException e2) {
            C21587.m49112("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e2);
        }
        this.f8569.mo2048(jSONObject);
        c8658.m23309();
        C21587.m49115();
    }

    @Override // l.InterfaceC19020
    /* JADX INFO: renamed from: ۙ */
    public final void mo2047(C1121 c1121) {
        C21587.m49111("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onError");
        this.f8569.mo2047(c1121);
        C21587.m49115();
    }

    @Override // l.InterfaceC19020
    /* JADX INFO: renamed from: ۙ */
    public final void mo2046() {
        C21587.m49111("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onCancel");
        this.f8569.mo2046();
        C21587.m49115();
    }
}
