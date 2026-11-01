package l;

import android.app.Activity;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܽܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16683 implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17388 f53457;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39149(SidecarDeviceState sidecarDeviceState) {
        SidecarInterface sidecarInterfaceM40505;
        Window window;
        WindowManager.LayoutParams attributes;
        C13465.m32966(sidecarDeviceState, "newDeviceState");
        Collection<Activity> collectionValues = this.f53457.f55348.values();
        C17388 c17388 = this.f53457;
        for (Activity activity : collectionValues) {
            SidecarWindowLayoutInfo windowLayoutInfo = null;
            IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            if (iBinder != null && (sidecarInterfaceM40505 = c17388.m40505()) != null) {
                windowLayoutInfo = sidecarInterfaceM40505.getWindowLayoutInfo(iBinder);
            }
            InterfaceC9359 interfaceC9359 = c17388.f55350;
            if (interfaceC9359 != null) {
                ((C15978) interfaceC9359).m37957(activity, c17388.f55346.m20010(windowLayoutInfo, sidecarDeviceState));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39148(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C13465.m32966(iBinder, "windowToken");
        C13465.m32966(sidecarWindowLayoutInfo, "newLayout");
        Activity activity = (Activity) this.f53457.f55348.get(iBinder);
        if (activity == null) {
            return;
        }
        C7510 c7510 = this.f53457.f55346;
        SidecarInterface sidecarInterfaceM40505 = this.f53457.m40505();
        SidecarDeviceState deviceState = sidecarInterfaceM40505 == null ? null : sidecarInterfaceM40505.getDeviceState();
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        C5331 c5331M20010 = c7510.m20010(sidecarWindowLayoutInfo, deviceState);
        InterfaceC9359 interfaceC9359 = this.f53457.f55350;
        if (interfaceC9359 == null) {
            return;
        }
        ((C15978) interfaceC9359).m37957(activity, c5331M20010);
    }

    public C16683(C17388 c17388) {
        this.f53457 = c17388;
    }
}
