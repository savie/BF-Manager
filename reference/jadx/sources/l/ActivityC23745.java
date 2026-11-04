package l;

import android.app.Activity;

/* JADX INFO: renamed from: l.᩹ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UITY */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityC23745 extends Activity {
    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        C25303.m56558(getIntent().getStringExtra("requestId"), this);
        finish();
    }
}
