package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۨ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J942 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC12647 extends AbstractActivityC23836 {
    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "RemoteManageActivity";
    }

    @Override // l.AbstractActivityC23836
    /* JADX INFO: renamed from: ᩷ۙ */
    public final void mo12017() {
        Intent intent = getIntent();
        if (intent.hasExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL")) {
            C2564.m8621(this, intent.getIntExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 0));
        } else {
            int i = C2564.f8237;
            C2564.m8621(this, ApplicationC17729.f58262.getInt("remote_manager_last_protocol", 0) == 1 ? 1 : 0);
        }
    }
}
