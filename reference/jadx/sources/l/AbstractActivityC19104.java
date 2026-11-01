package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩵֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 194I */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractActivityC19104 extends AbstractActivityC12483 {
    /* JADX INFO: renamed from: ֫ */
    public boolean mo18997() {
        return true;
    }

    /* JADX INFO: renamed from: ܳ */
    public abstract void mo19000();

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31022();
        mo19000();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (!mo18997() || isFinishing()) {
            return;
        }
        finish();
    }
}
