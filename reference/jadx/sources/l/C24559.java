package l;

import android.app.Activity;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩺᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes.dex */
public final class C24559 implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14861 f79602;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m54840(SidecarDeviceState sidecarDeviceState) {
        SidecarInterface sidecarInterfaceM35798;
        Window window;
        WindowManager.LayoutParams attributes;
        C15243.m36590(sidecarDeviceState, "newDeviceState");
        Collection<Activity> collectionValues = this.f79602.f48578.values();
        C14861 c14861 = this.f79602;
        for (Activity activity : collectionValues) {
            SidecarWindowLayoutInfo windowLayoutInfo = null;
            IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            if (iBinder != null && (sidecarInterfaceM35798 = c14861.m35798()) != null) {
                windowLayoutInfo = sidecarInterfaceM35798.getWindowLayoutInfo(iBinder);
            }
            InterfaceC9883 interfaceC9883 = c14861.f48579;
            if (interfaceC9883 != null) {
                ((C20829) interfaceC9883).m47633(activity, c14861.f48580.m53139(windowLayoutInfo, sidecarDeviceState));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m54839(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C15243.m36590(iBinder, "windowToken");
        C15243.m36590(sidecarWindowLayoutInfo, "newLayout");
        Activity activity = (Activity) this.f79602.f48578.get(iBinder);
        if (activity == null) {
            return;
        }
        C23813 c23813 = this.f79602.f48580;
        SidecarInterface sidecarInterfaceM35798 = this.f79602.m35798();
        SidecarDeviceState deviceState = sidecarInterfaceM35798 == null ? null : sidecarInterfaceM35798.getDeviceState();
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        C14115 c14115M53139 = c23813.m53139(sidecarWindowLayoutInfo, deviceState);
        InterfaceC9883 interfaceC9883 = this.f79602.f48579;
        if (interfaceC9883 == null) {
            return;
        }
        ((C20829) interfaceC9883).m47633(activity, c14115M53139);
    }

    public C24559(C14861 c14861) {
        this.f79602 = c14861;
    }
}
