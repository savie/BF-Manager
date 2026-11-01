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

/* JADX INFO: renamed from: l.۫ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB1K */
/* JADX INFO: loaded from: classes3.dex */
public final class C12381 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17319 f41383;

    public C12381() {
        this.f41383 = Build.VERSION.SDK_INT >= 28 ? new C10970() : new C6030();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17050 m30802(Context context) {
        ProviderInfo providerInfoMo16352;
        C14329 c14329;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        C9535.m24383(packageManager, "Package manager required to locate emoji font provider");
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        C17319 c17319 = this.f41383;
        Iterator it = c17319.mo16353(packageManager, intent).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfoMo16352 = null;
                break;
            }
            providerInfoMo16352 = c17319.mo16352((ResolveInfo) it.next());
            if (providerInfoMo16352 != null && (applicationInfo = providerInfoMo16352.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfoMo16352 == null) {
            c14329 = null;
        } else {
            try {
                String str = providerInfoMo16352.authority;
                String str2 = providerInfoMo16352.packageName;
                Signature[] signatureArrMo27725 = c17319.mo27725(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo27725) {
                    arrayList.add(signature.toByteArray());
                }
                c14329 = new C14329(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException unused) {
                c14329 = null;
            }
        }
        if (c14329 == null) {
            return null;
        }
        return new C17050(context, c14329);
    }
}
