package l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB1K */
/* JADX INFO: loaded from: classes3.dex */
public class C6030 extends C17319 {
    @Override // l.C17319
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo16353(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentContentProviders(intent, 0);
    }

    @Override // l.C17319
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ProviderInfo mo16352(ResolveInfo resolveInfo) {
        return resolveInfo.providerInfo;
    }
}
