package l;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩶ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes4.dex */
public final class C20211 implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f65573;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SidecarInterface.SidecarCallback f65574;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7510 f65575;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f65576;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public SidecarDeviceState f65577;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (l.C18799.m43359(r2) == l.C18799.m43359(r4)) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m45665(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            java.lang.String r0 = "newDeviceState"
            l.C13465.m32966(r4, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r3.f65576
            r0.lock()
            l.۟ܰۨ r1 = r3.f65575     // Catch: java.lang.Throwable -> L36
            androidx.window.sidecar.SidecarDeviceState r2 = r3.f65577     // Catch: java.lang.Throwable -> L36
            r1.getClass()     // Catch: java.lang.Throwable -> L36
            boolean r1 = l.C13465.m32965(r2, r4)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L18
            goto L25
        L18:
            if (r2 != 0) goto L1b
            goto L29
        L1b:
            int r1 = l.C18799.m43359(r2)     // Catch: java.lang.Throwable -> L36
            int r2 = l.C18799.m43359(r4)     // Catch: java.lang.Throwable -> L36
            if (r1 != r2) goto L29
        L25:
            r0.unlock()
            return
        L29:
            r3.f65577 = r4     // Catch: java.lang.Throwable -> L36
            androidx.window.sidecar.SidecarInterface$SidecarCallback r1 = r3.f65574     // Catch: java.lang.Throwable -> L36
            r1.onDeviceStateChanged(r4)     // Catch: java.lang.Throwable -> L36
            l.۟۟۠ r4 = l.C7321.f24318     // Catch: java.lang.Throwable -> L36
            r0.unlock()
            return
        L36:
            r4 = move-exception
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20211.m45665(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public C20211(C7510 c7510, SidecarInterface.SidecarCallback sidecarCallback) {
        C13465.m32966(c7510, "sidecarAdapter");
        this.f65575 = c7510;
        this.f65574 = sidecarCallback;
        this.f65576 = new ReentrantLock();
        this.f65573 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m45664(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C13465.m32966(iBinder, "token");
        C13465.m32966(sidecarWindowLayoutInfo, "newLayout");
        synchronized (this.f65576) {
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f65573.get(iBinder);
            this.f65575.getClass();
            if (C7510.m20007(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                return;
            }
            this.f65574.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
        }
    }
}
