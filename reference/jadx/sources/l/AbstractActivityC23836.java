package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩹᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 194I */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractActivityC23836 extends AbstractActivityC17204 {
    /* JADX INFO: renamed from: ۤۙ */
    public boolean mo12016() {
        return true;
    }

    /* JADX INFO: renamed from: ᩷ۙ */
    public abstract void mo12017();

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40412();
        mo12017();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (!mo12016() || isFinishing()) {
            return;
        }
        finish();
    }
}
