package l;

import android.os.Bundle;
import android.os.SystemClock;
import com.rosan.dhizuku.shared.DhizukuVariables;

/* JADX INFO: renamed from: l.ۚ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6D5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5961 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bundle f20409;

    static {
        ApplicationC23172.m52091(67);
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f20409 == null) {
            return;
        }
        this.f20409 = null;
        mo17345();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo17343(Bundle bundle);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final native synchronized C15655 m17344();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract void mo17345();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m17346() {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = this.f20409 != null;
        Bundle bundle = new Bundle();
        if (z) {
            Bundle bundle2 = this.f20409;
            bundle.putInt(DhizukuVariables.PARAM_CLIENT_UID, bundle2.getInt(DhizukuVariables.PARAM_CLIENT_UID));
            if (bundle2.containsKey("server_pid")) {
                bundle.putInt("server_pid", bundle2.getInt("server_pid"));
            }
        } else {
            try {
                mo17347(bundle);
                this.f20409 = new Bundle(bundle);
            } catch (Exception e) {
                this.f20409 = null;
                try {
                    mo17345();
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        }
        bundle.putBoolean("session_reused", z);
        bundle.putDouble("session_open_ms", m17342(jElapsedRealtimeNanos));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo17347(Bundle bundle);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static double m17342(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) / 1000000.0d;
    }
}
