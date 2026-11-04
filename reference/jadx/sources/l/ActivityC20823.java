package l;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import bin.mt.plus.Main;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8V2 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC20823 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public boolean f66691;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "MusicPlayerActivity";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40412();
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("fromService", false);
        this.f66691 = booleanExtra;
        if (booleanExtra) {
            C23807 c23807M11951 = C3669.m11951();
            if (c23807M11951 == null || c23807M11951.f77115.mo2982()) {
                finish();
                return;
            }
            Main mainM18052 = C6331.m18052();
            if (mainM18052 != null && mainM18052.getLifecycle().mo23076().m8762(EnumC2619.STARTED) && C3669.m11949()) {
                finish();
                return;
            }
            if (C3669.m11949() && !ApplicationC17729.f58258.getBoolean("mbp", false) && C3669.m11949()) {
                List<ActivityManager.AppTask> appTasks = ((ActivityManager) getSystemService("activity")).getAppTasks();
                if (!appTasks.isEmpty()) {
                    int size = appTasks.size();
                    for (int i = 0; i < size; i++) {
                        ActivityManager.AppTask appTask = appTasks.get(i);
                        if (ActivityC19683.m45355(appTask)) {
                            appTask.moveToFront();
                            finish();
                            return;
                        }
                    }
                }
            }
            new C3669(this);
            return;
        }
        if ("bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction()) && "tool-music-player".equals(intent.getStringExtra("operation"))) {
            C3669.m11959(this);
            return;
        }
        C12184 c12184M30457 = C12184.m30457(this, "audio/");
        if (c12184M30457 == null) {
            finish();
            return;
        }
        C3669 c3669 = new C3669(this);
        C3669.m11936(c12184M30457.m30459(), c12184M30457.m30460(), c12184M30457.m30458());
        c3669.m11962();
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ۡ */
    public final void mo113() {
        C6544.m18428();
        C9501.m24882();
        C2930.m9577(this);
        this.f56055 = C3296.m10878();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (isFinishing()) {
            return;
        }
        finish();
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47631() {
        return this.f66691;
    }
}
