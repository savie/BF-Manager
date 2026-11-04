package l;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۨ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12624 implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SidecarInterface.SidecarCallback f40486;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f40487;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23813 f40488;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public SidecarDeviceState f40489;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f40490;

    public C12624(C23813 c23813, SidecarInterface.SidecarCallback sidecarCallback) {
        C15243.m36590(c23813, "sidecarAdapter");
        this.f40488 = c23813;
        this.f40486 = sidecarCallback;
        this.f40487 = new ReentrantLock();
        this.f40490 = new WeakHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (l.C11878.m29761(r2) == l.C11878.m29761(r4)) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m31334(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            java.lang.String r0 = "newDeviceState"
            l.C15243.m36590(r4, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r3.f40487
            r0.lock()
            l.᩹᩷ۤ r1 = r3.f40488     // Catch: java.lang.Throwable -> L36
            androidx.window.sidecar.SidecarDeviceState r2 = r3.f40489     // Catch: java.lang.Throwable -> L36
            r1.getClass()     // Catch: java.lang.Throwable -> L36
            boolean r1 = l.C15243.m36589(r2, r4)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L18
            goto L25
        L18:
            if (r2 != 0) goto L1b
            goto L29
        L1b:
            int r1 = l.C11878.m29761(r2)     // Catch: java.lang.Throwable -> L36
            int r2 = l.C11878.m29761(r4)     // Catch: java.lang.Throwable -> L36
            if (r1 != r2) goto L29
        L25:
            r0.unlock()
            return
        L29:
            r3.f40489 = r4     // Catch: java.lang.Throwable -> L36
            androidx.window.sidecar.SidecarInterface$SidecarCallback r1 = r3.f40486     // Catch: java.lang.Throwable -> L36
            r1.onDeviceStateChanged(r4)     // Catch: java.lang.Throwable -> L36
            l.ۧ۟᩵ r4 = l.C11471.f36082     // Catch: java.lang.Throwable -> L36
            r0.unlock()
            return
        L36:
            r4 = move-exception
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12624.m31334(androidx.window.sidecar.SidecarDeviceState):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31333(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C15243.m36590(iBinder, "token");
        C15243.m36590(sidecarWindowLayoutInfo, "newLayout");
        synchronized (this.f40487) {
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f40490.get(iBinder);
            this.f40488.getClass();
            if (C23813.m53135(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                return;
            }
            this.f40486.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
        }
    }
}
