package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C14355 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3541 f47024;

    public C14355(ActivityC3541 activityC3541) {
        this.f47024 = activityC3541;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b;
        String action = intent.getAction();
        C13638.requireNonNull(action);
        switch (action) {
            case "bin.mt.protect.ProtectUploadService.ACTION_SUCCESS":
                b = 0;
                break;
            case "bin.mt.protect.ProtectUploadService.ACTION_PROGRESS_CHANGED":
                b = 1;
                break;
            case "bin.mt.protect.ProtectUploadService.ACTION_FAIL":
                b = 2;
                break;
            default:
                b = -1;
                break;
        }
        ActivityC3541 activityC3541 = this.f47024;
        switch (b) {
            case 0:
                String stringExtra = intent.getStringExtra("taskID");
                int intExtra = intent.getIntExtra("id", -1);
                C11780 c11780M10455 = ActivityC3541.m10455(activityC3541, stringExtra);
                if (c11780M10455 != null) {
                    c11780M10455.f39571 = intExtra;
                    c11780M10455.f39566 = 0;
                    ArrayList arrayList = new ArrayList(activityC3541.f13040);
                    ArrayList arrayList2 = new ArrayList(activityC3541.f13045);
                    arrayList.remove(c11780M10455);
                    arrayList2.add(0, c11780M10455);
                    activityC3541.f13040 = C0561.unmodifiableList(arrayList);
                    activityC3541.f13045 = C0561.unmodifiableList(arrayList2);
                    new RunnableC8482(activityC3541);
                }
                activityC3541.f13039.notifyDataSetChanged();
                break;
            case 1:
                String stringExtra2 = intent.getStringExtra("taskID");
                TextView textView = (TextView) activityC3541.f13044.findViewWithTag(stringExtra2);
                C11780 c11780M10456 = ActivityC3541.m10455(activityC3541, stringExtra2);
                if (textView != null && c11780M10456 != null) {
                    c11780M10456.f39566 = -1;
                    ActivityC3541.m10450(activityC3541, c11780M10456, textView);
                    break;
                }
                break;
            case 2:
                String stringExtra3 = intent.getStringExtra("taskID");
                if (!ServiceC23069.f74949.contains(stringExtra3)) {
                    Bundle extras = intent.getExtras();
                    C13638.requireNonNull(extras);
                    if (extras.containsKey("message")) {
                        C15829.m37619(intent.getStringExtra("message"));
                    }
                }
                TextView textView2 = (TextView) activityC3541.f13044.findViewWithTag(stringExtra3);
                C11780 c11780M10457 = ActivityC3541.m10455(activityC3541, stringExtra3);
                if (textView2 != null && c11780M10457 != null) {
                    c11780M10457.f39566 = -3;
                    activityC3541.f13039.notifyDataSetChanged();
                    break;
                }
                break;
        }
    }
}
