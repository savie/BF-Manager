package l;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: renamed from: l.֨ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB1K */
/* JADX INFO: loaded from: classes3.dex */
public final class C1106 extends C10054 {
    @Override // l.C10054
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Signature[] mo4113(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
