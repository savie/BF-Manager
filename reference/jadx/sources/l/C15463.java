package l;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.connect.common.AssistActivity;
import com.tencent.tauth.AuthActivity;

/* JADX INFO: renamed from: l.ܶ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15463 implements InterfaceC19696 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AuthActivity f50384;

    public C15463(AuthActivity authActivity) {
        this.f50384 = authActivity;
    }

    @Override // l.InterfaceC19696
    /* JADX INFO: renamed from: ۙ */
    public final void mo23453(Intent intent, Bundle bundle) {
        C23099.m51113("openSDK_LOG.AuthActivity", "-->handleActionUri--common channel. ");
        AuthActivity authActivity = this.f50384;
        Intent intent2 = new Intent(authActivity, (Class<?>) AssistActivity.class);
        intent2.putExtras(bundle);
        intent2.putExtra("key_request_code", 10114);
        intent2.setFlags(603979776);
        authActivity.startActivity(intent2);
    }
}
