package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.᩶ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26HN */
/* JADX INFO: loaded from: classes.dex */
public final class C21507 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9572 f68739;

    public C21507(ActivityC9572 activityC9572) {
        this.f68739 = activityC9572;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        ActivityC9572 activityC9572 = this.f68739;
        activityC9572.f30984 = false;
        activityC9572.m24998();
        if (!"bin.mt.mcp.ACTION_FAILED_TO_START".equals(intent.getAction()) || (stringExtra = intent.getStringExtra(d.O)) == null || stringExtra.isEmpty()) {
            return;
        }
        C22673.m51154((CharSequence) stringExtra);
    }
}
