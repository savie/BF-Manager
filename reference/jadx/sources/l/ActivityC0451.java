package l;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.֡۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJ0 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC0451 extends ActivityC8896 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C17930 f2030 = new C17930();

    @Override // l.ActivityC8896, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        f2030.mo40348(Long.valueOf(SystemClock.uptimeMillis()));
        Intent intent = new Intent(this, (Class<?>) Main.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        startActivity(intent);
    }
}
