package l;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: renamed from: l.ۢۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB1K */
/* JADX INFO: loaded from: classes3.dex */
public class C10054 {
    /* JADX INFO: renamed from: ۙ */
    public Signature[] mo4113(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
