package l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB1K */
/* JADX INFO: loaded from: classes4.dex */
public final class C19005 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10054 f61564;

    public C19005() {
        this.f61564 = Build.VERSION.SDK_INT >= 28 ? new C1106() : new C10054();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19356 m44096(Context context) {
        ProviderInfo providerInfo;
        C21701 c21701;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        C11293.m28552(packageManager, "Package manager required to locate emoji font provider");
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        C10054 c10054 = this.f61564;
        c10054.getClass();
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c21701 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo4113 = c10054.mo4113(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo4113) {
                    arrayList.add(signature.toByteArray());
                }
                c21701 = new C21701(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException unused) {
                c21701 = null;
            }
        }
        if (c21701 == null) {
            return null;
        }
        return new C19356(context, c21701);
    }
}
