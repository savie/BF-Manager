package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.᩷֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J942 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC20515 extends AbstractActivityC19104 {
    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "RemoteManageActivity";
    }

    @Override // l.AbstractActivityC19104
    /* JADX INFO: renamed from: ܳ */
    public final void mo19000() {
        Intent intent = getIntent();
        if (intent.hasExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL")) {
            C15745.m37478(this, intent.getIntExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 0));
        } else {
            int i = C15745.f51045;
            C15745.m37478(this, ApplicationC0716.f2988.getInt("remote_manager_last_protocol", 0) == 1 ? 1 : 0);
        }
    }
}
