package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۫ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC12930 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f41414;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f41415;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15913 f41416;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Uri f41417;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f41418;

    public /* synthetic */ RunnableC12930(ActivityC15913 activityC15913, boolean z, Uri uri, ArrayList arrayList, AtomicBoolean atomicBoolean) {
        this.f41416 = activityC15913;
        this.f41418 = z;
        this.f41417 = uri;
        this.f41414 = arrayList;
        this.f41415 = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12184 c12184M22369;
        ArrayList arrayList = this.f41414;
        int i = ActivityC15913.f51685;
        ActivityC15913 activityC15913 = this.f41416;
        boolean z = this.f41418;
        Uri uri = this.f41417;
        AtomicBoolean atomicBoolean = this.f41415;
        try {
            if (z) {
                C17359.requireNonNull(atomicBoolean);
                c12184M22369 = C8281.m22367(uri, arrayList, new C11438(atomicBoolean));
            } else {
                C17359.requireNonNull(atomicBoolean);
                c12184M22369 = C8281.m22369(uri, new C11438(atomicBoolean));
            }
            activityC15913.runOnUiThread(new RunnableC2532(activityC15913, atomicBoolean, c12184M22369, 0));
        } catch (Exception e) {
            activityC15913.runOnUiThread(new RunnableC8498(activityC15913, atomicBoolean, e));
        }
    }
}
