package l;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.connect.common.AssistActivity;
import com.tencent.tauth.AuthActivity;

/* JADX INFO: renamed from: l.֡ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C0375 implements InterfaceC9323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AuthActivity f1906;

    public C0375(AuthActivity authActivity) {
        this.f1906 = authActivity;
    }

    @Override // l.InterfaceC9323
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2173(Intent intent, Bundle bundle) {
        C21587.m49113("openSDK_LOG.AuthActivity", "-->handleActionUri--common channel. ");
        AuthActivity authActivity = this.f1906;
        Intent intent2 = new Intent(authActivity, (Class<?>) AssistActivity.class);
        intent2.putExtras(bundle);
        intent2.putExtra("key_request_code", 10114);
        intent2.setFlags(603979776);
        authActivity.startActivity(intent2);
    }
}
