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

/* JADX INFO: renamed from: l.ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D2TL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16457 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f53350;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Intent f53351;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context f53352;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f53353;

    public C16457(AbstractActivityC17204 abstractActivityC17204) {
        Activity activity;
        abstractActivityC17204.getClass();
        this.f53352 = abstractActivityC17204;
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.f53351 = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", abstractActivityC17204.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", abstractActivityC17204.getPackageName());
        action.addFlags(524288);
        Context baseContext = abstractActivityC17204;
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
            this.f53351.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            this.f53351.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39008() {
        ArrayList arrayList = this.f53353;
        Intent intent = this.f53351;
        if (arrayList == null || arrayList.size() <= 1) {
            intent.setAction("android.intent.action.SEND");
            ArrayList arrayList2 = this.f53353;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) this.f53353.get(0));
                C17203.m40382(intent, this.f53353);
            } else {
                intent.removeExtra("android.intent.extra.STREAM");
                intent.setClipData(null);
                intent.setFlags(intent.getFlags() & (-2));
            }
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f53353);
            C17203.m40382(intent, this.f53353);
        }
        this.f53352.startActivity(Intent.createChooser(intent, this.f53350));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39005() {
        this.f53350 = this.f53352.getText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39009(String str) {
        this.f53351.setType(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39006(Uri uri) {
        if (this.f53353 == null) {
            this.f53353 = new ArrayList();
        }
        this.f53353.add(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39007(String str) {
        this.f53351.putExtra("android.intent.extra.SUBJECT", str);
    }
}
