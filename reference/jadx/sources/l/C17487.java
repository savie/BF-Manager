package l;

import android.content.res.Configuration;
import android.os.Build;

/* JADX INFO: renamed from: l.ܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: G3C1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17487 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12266 m40989(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C12266.m30635(C16741.m39518(configuration)) : C12266.m30637(configuration.locale);
    }
}
