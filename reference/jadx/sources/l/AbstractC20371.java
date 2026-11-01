package l;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩶᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20371 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0614 f66037;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile LinkedHashMap f66040;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f66043;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f66042 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66041 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66039 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile long f66038 = 0;

    /* JADX INFO: renamed from: ۖ */
    public abstract void mo23414();

    public AbstractC20371(C0614 c0614, String str, LinkedHashMap linkedHashMap) {
        this.f66037 = c0614;
        this.f66043 = str;
        this.f66040 = new LinkedHashMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46025(AbstractC20371 abstractC20371) {
        boolean z;
        try {
            abstractC20371.mo23414();
            if (z) {
                return;
            }
        } catch (RuntimeException unused) {
            if (z) {
                return;
            }
        } finally {
            if (!abstractC20371.f66039 && !abstractC20371.f66041) {
                abstractC20371.m46026();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46029(int i, int i2, long j, boolean z) {
        if (this.f66039) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f66040);
        linkedHashMap.put("sizeBytes", Long.valueOf(j));
        linkedHashMap.put("fileCount", Integer.valueOf(i));
        linkedHashMap.put("folderCount", Integer.valueOf(i2));
        this.f66040 = linkedHashMap;
        if (z) {
            m46026();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m46026() {
        this.f66041 = true;
        this.f66038 = SystemClock.uptimeMillis();
        C4716.m13050(this.f66042, 300000L, new Runnable() { // from class: l.ܺ᩵ۜ
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20371 abstractC20371 = this.f52148;
                abstractC20371.f66037.f2668.remove(abstractC20371.f66043, abstractC20371);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46032() {
        this.f66039 = true;
        C4716.m13053().removeCallbacksAndMessages(this.f66042);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m46028() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("taskId", this.f66043);
        linkedHashMap.put("done", Boolean.valueOf(this.f66041));
        linkedHashMap.put("property", this.f66040);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m46031() {
        return this.f66039;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46030(long j) {
        return this.f66041 && this.f66038 > 0 && j - this.f66038 >= 300000;
    }
}
