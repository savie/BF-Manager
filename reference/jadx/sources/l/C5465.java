package l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D2TL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5465 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f18832;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f18833;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Intent f18834;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f18835;

    public C5465(AbstractActivityC12483 abstractActivityC12483) {
        Activity activity;
        abstractActivityC12483.getClass();
        this.f18835 = abstractActivityC12483;
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.f18834 = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", abstractActivityC12483.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", abstractActivityC12483.getPackageName());
        action.addFlags(524288);
        Context baseContext = abstractActivityC12483;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            this.f18834.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            this.f18834.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15132() {
        ArrayList arrayList = this.f18832;
        Intent intent = this.f18834;
        if (arrayList == null || arrayList.size() <= 1) {
            intent.setAction("android.intent.action.SEND");
            ArrayList arrayList2 = this.f18832;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) this.f18832.get(0));
                C22399.m49673(intent, this.f18832);
            } else {
                intent.removeExtra("android.intent.extra.STREAM");
                intent.setClipData(null);
                intent.setFlags(intent.getFlags() & (-2));
            }
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f18832);
            C22399.m49673(intent, this.f18832);
        }
        this.f18835.startActivity(Intent.createChooser(intent, this.f18833));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15129() {
        this.f18833 = this.f18835.getText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15133(String str) {
        this.f18834.setType(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15130(Uri uri) {
        if (this.f18832 == null) {
            this.f18832 = new ArrayList();
        }
        this.f18832.add(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15131(String str) {
        this.f18834.putExtra("android.intent.extra.SUBJECT", str);
    }
}
