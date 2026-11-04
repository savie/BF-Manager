package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3566 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3041 f12215;

    public C3566(ActivityC3041 activityC3041) {
        this.f12215 = activityC3041;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b;
        String action = intent.getAction();
        C17359.requireNonNull(action);
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
        ActivityC3041 activityC3041 = this.f12215;
        switch (b) {
            case 0:
                String stringExtra = intent.getStringExtra("taskID");
                int intExtra = intent.getIntExtra("id", -1);
                C6025 c6025M9890 = ActivityC3041.m9890(activityC3041, stringExtra);
                if (c6025M9890 != null) {
                    c6025M9890.f20606 = intExtra;
                    c6025M9890.f20612 = 0;
                    ArrayList arrayList = new ArrayList(activityC3041.f9848);
                    ArrayList arrayList2 = new ArrayList(activityC3041.f9853);
                    arrayList.remove(c6025M9890);
                    arrayList2.add(0, c6025M9890);
                    activityC3041.f9848 = C4681.unmodifiableList(arrayList);
                    activityC3041.f9853 = C4681.unmodifiableList(arrayList2);
                    new RunnableC14006(activityC3041);
                }
                activityC3041.f9857.notifyDataSetChanged();
                break;
            case 1:
                String stringExtra2 = intent.getStringExtra("taskID");
                TextView textView = (TextView) activityC3041.f9854.findViewWithTag(stringExtra2);
                C6025 c6025M9891 = ActivityC3041.m9890(activityC3041, stringExtra2);
                if (textView != null && c6025M9891 != null) {
                    c6025M9891.f20612 = -1;
                    ActivityC3041.m9882(activityC3041, c6025M9891, textView);
                    break;
                }
                break;
            case 2:
                String stringExtra3 = intent.getStringExtra("taskID");
                if (!ServiceC18703.f60801.contains(stringExtra3)) {
                    Bundle extras = intent.getExtras();
                    C17359.requireNonNull(extras);
                    if (extras.containsKey("message")) {
                        C22673.m51160(intent.getStringExtra("message"));
                    }
                }
                TextView textView2 = (TextView) activityC3041.f9854.findViewWithTag(stringExtra3);
                C6025 c6025M9892 = ActivityC3041.m9890(activityC3041, stringExtra3);
                if (textView2 != null && c6025M9892 != null) {
                    c6025M9892.f20612 = -3;
                    activityC3041.f9857.notifyDataSetChanged();
                    break;
                }
                break;
        }
    }
}
