package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֨᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1368 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Uri f5733;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f5734;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15481 f5735;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f5736;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f5737;

    public /* synthetic */ RunnableC1368(ActivityC15481 activityC15481, boolean z, Uri uri, ArrayList arrayList, AtomicBoolean atomicBoolean) {
        this.f5735 = activityC15481;
        this.f5737 = z;
        this.f5733 = uri;
        this.f5736 = arrayList;
        this.f5734 = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C21830 c21830M3844;
        ArrayList arrayList = this.f5736;
        int i = ActivityC15481.f50434;
        final ActivityC15481 activityC15481 = this.f5735;
        boolean z = this.f5737;
        Uri uri = this.f5733;
        final AtomicBoolean atomicBoolean = this.f5734;
        try {
            if (z) {
                C13638.requireNonNull(atomicBoolean);
                c21830M3844 = C1016.m3842(uri, arrayList, new C13364(atomicBoolean));
            } else {
                C13638.requireNonNull(atomicBoolean);
                c21830M3844 = C1016.m3844(uri, new C13364(atomicBoolean));
            }
            activityC15481.runOnUiThread(new Runnable() { // from class: l.ܳ۟۬
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC15481.m37039(activityC15481, atomicBoolean, c21830M3844);
                }
            });
        } catch (Exception e) {
            activityC15481.runOnUiThread(new RunnableC13667(activityC15481, atomicBoolean, e));
        }
    }
}
