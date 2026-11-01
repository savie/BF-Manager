package l;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import bin.mt.plus.Main;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: J8V2 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6412 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public boolean f21729;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "MusicPlayerActivity";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31022();
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("fromService", false);
        this.f21729 = booleanExtra;
        if (booleanExtra) {
            C12763 c12763M10654 = C3589.m10654();
            if (c12763M10654 == null || c12763M10654.f42565.mo20296()) {
                finish();
                return;
            }
            Main mainM47527 = C21094.m47527();
            if (mainM47527 != null && mainM47527.getLifecycle().mo9170().m24173(EnumC9414.STARTED) && C3589.m10666()) {
                finish();
                return;
            }
            if (C3589.m10666() && !ApplicationC0716.f2992.getBoolean("mbp", false) && C3589.m10666()) {
                List<ActivityManager.AppTask> appTasks = ((ActivityManager) getSystemService("activity")).getAppTasks();
                if (!appTasks.isEmpty()) {
                    int size = appTasks.size();
                    for (int i = 0; i < size; i++) {
                        ActivityManager.AppTask appTask = appTasks.get(i);
                        if (ActivityC5947.m16219(appTask)) {
                            appTask.moveToFront();
                            finish();
                            return;
                        }
                    }
                }
            }
            new C3589(this);
            return;
        }
        if ("bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction()) && "tool-music-player".equals(intent.getStringExtra("operation"))) {
            C3589.m10664(this);
            return;
        }
        C21830 c21830M48599 = C21830.m48599(this, "audio/");
        if (c21830M48599 == null) {
            finish();
            return;
        }
        C3589 c3589 = new C3589(this);
        C3589.m10646(c21830M48599.m48600(), c21830M48599.m48602(), c21830M48599.m48601());
        c3589.m10667();
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ܽ */
    public final void mo135() {
        C9927.m25128();
        C17605.m40925();
        C9682.m24640(this);
        this.f41631 = C20368.m45991();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (isFinishing()) {
            return;
        }
        finish();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m17555() {
        return this.f21729;
    }
}
