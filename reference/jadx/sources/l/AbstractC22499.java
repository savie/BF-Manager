package l;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩸ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22499 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19515 f72792;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f72793;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile LinkedHashMap f72794;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f72795 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f72791 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f72790 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile long f72796 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo19355();

    public AbstractC22499(C19515 c19515, String str, LinkedHashMap linkedHashMap) {
        this.f72792 = c19515;
        this.f72793 = str;
        this.f72794 = new LinkedHashMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50726(AbstractC22499 abstractC22499) {
        boolean z;
        try {
            abstractC22499.mo19355();
            if (z) {
                return;
            }
        } catch (RuntimeException unused) {
            if (z) {
                return;
            }
        } finally {
            if (!abstractC22499.f72790 && !abstractC22499.f72791) {
                abstractC22499.m50727();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50730(int i, int i2, long j, boolean z) {
        if (this.f72790) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f72794);
        linkedHashMap.put("sizeBytes", Long.valueOf(j));
        linkedHashMap.put("fileCount", Integer.valueOf(i));
        linkedHashMap.put("folderCount", Integer.valueOf(i2));
        this.f72794 = linkedHashMap;
        if (z) {
            m50727();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m50727() {
        this.f72791 = true;
        this.f72796 = SystemClock.uptimeMillis();
        C5261.m15835(this.f72795, 300000L, new Runnable() { // from class: l.ۤۖۧ
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22499 abstractC22499 = this.f33575;
                abstractC22499.f72792.f62967.remove(abstractC22499.f72793, abstractC22499);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50733() {
        this.f72790 = true;
        C5261.m15834(this.f72795);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m50729() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("taskId", this.f72793);
        linkedHashMap.put("done", Boolean.valueOf(this.f72791));
        linkedHashMap.put("property", this.f72794);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m50732() {
        return this.f72790;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50731(long j) {
        return this.f72791 && this.f72796 > 0 && j - this.f72796 >= 300000;
    }
}
