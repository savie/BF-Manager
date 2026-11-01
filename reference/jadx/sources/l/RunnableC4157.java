package l;

import android.app.Activity;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: l.ۘ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: U5Z7 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4157 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15185;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f15186;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f15187;

    public RunnableC4157(Activity activity, String[] strArr, int i) {
        this.f15187 = strArr;
        this.f15186 = activity;
        this.f15185 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = this.f15187;
        int[] iArr = new int[strArr.length];
        Activity activity = this.f15186;
        PackageManager packageManager = activity.getPackageManager();
        String packageName = activity.getPackageName();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(strArr[i], packageName);
        }
        ((InterfaceC21797) activity).onRequestPermissionsResult(this.f15185, strArr, iArr);
    }
}
