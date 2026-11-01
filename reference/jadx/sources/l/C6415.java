package l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alipay.sdk.m.n.b;

/* JADX INFO: renamed from: l.ۜ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8XW */
/* JADX INFO: loaded from: classes3.dex */
public class C6415 implements InterfaceC3592 {
    @Override // l.InterfaceC3592
    /* JADX INFO: renamed from: ۙ */
    public void mo10671(View view, String str) {
        Uri uriBuild = Uri.parse(str);
        if (TextUtils.isEmpty(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme(b.a).build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
