package l;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۜ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJ0 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC7007 extends ActivityC3330 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C9186 f23575 = new C9186();

    @Override // l.ActivityC3330, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        f23575.mo23641(Long.valueOf(SystemClock.uptimeMillis()));
        Intent intent = new Intent(this, (Class<?>) Main.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        startActivity(intent);
    }
}
