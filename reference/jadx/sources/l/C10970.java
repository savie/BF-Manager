package l;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: renamed from: l.ۧۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB1K */
/* JADX INFO: loaded from: classes4.dex */
public final class C10970 extends C6030 {
    @Override // l.C17319
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Signature[] mo27725(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
