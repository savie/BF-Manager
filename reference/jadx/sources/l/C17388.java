package l;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܿܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes5.dex */
public final class C17388 implements InterfaceC3007 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7510 f55346;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f55347;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f55348;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final SidecarInterface f55349;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC9359 f55350;

    @Override // l.InterfaceC3007
    /* JADX INFO: renamed from: ܰ */
    public final void mo8972(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        C13465.m32966(activity, "activity");
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f55349;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.f55347;
        activity.unregisterComponentCallbacks((ComponentCallbacks) linkedHashMap.get(activity));
        linkedHashMap.remove(activity);
        LinkedHashMap linkedHashMap2 = this.f55348;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.f55349) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SidecarInterface m40505() {
        return this.f55349;
    }

    public C17388(Context context) {
        SidecarInterface sidecarInterfaceM47017 = C20916.m47017(context);
        C7510 c7510 = new C7510(0);
        this.f55349 = sidecarInterfaceM47017;
        this.f55346 = c7510;
        this.f55348 = new LinkedHashMap();
        this.f55347 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40507(C6099 c6099) {
        this.f55350 = new C15978(c6099);
        SidecarInterface sidecarInterface = this.f55349;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new C20211(this.f55346, new C16683(this)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40506(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f55348;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f55349;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f55349) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        InterfaceC9359 interfaceC9359 = this.f55350;
        if (interfaceC9359 != null) {
            ((C15978) interfaceC9359).m37957(activity, m40508(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f55347;
        if (linkedHashMap2.get(activity) == null) {
            ComponentCallbacksC12450 componentCallbacksC12450 = new ComponentCallbacksC12450(this, activity);
            linkedHashMap2.put(activity, componentCallbacksC12450);
            activity.registerComponentCallbacks(componentCallbacksC12450);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m40509() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f55349;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method == null ? null : method.getReturnType();
            Class cls5 = Void.TYPE;
            if (!C13465.m32965(returnType, cls5)) {
                throw new NoSuchMethodException(C13465.m32959(returnType, "Illegal return type for 'setSidecarCallback': "));
            }
            SidecarInterface sidecarInterface2 = this.f55349;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f55349;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f55349;
            Method method2 = (sidecarInterface4 == null || (cls4 = sidecarInterface4.getClass()) == null) ? null : cls4.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 == null ? null : method2.getReturnType();
            if (!C13465.m32965(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(C13465.m32959(returnType2, "Illegal return type for 'getWindowLayoutInfo': "));
            }
            SidecarInterface sidecarInterface5 = this.f55349;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 == null ? null : method3.getReturnType();
            if (!C13465.m32965(returnType3, cls5)) {
                throw new NoSuchMethodException(C13465.m32959(returnType3, "Illegal return type for 'onWindowLayoutChangeListenerAdded': "));
            }
            SidecarInterface sidecarInterface6 = this.f55349;
            Method method4 = (sidecarInterface6 == null || (cls3 = sidecarInterface6.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 == null ? null : method4.getReturnType();
            if (!C13465.m32965(returnType4, cls5)) {
                throw new NoSuchMethodException(C13465.m32959(returnType4, "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            C13465.m32967(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (objInvoke2 != null) {
                    if (!arrayList.equals((List) objInvoke2)) {
                        throw new Exception("Invalid display feature getter/setter");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    @Override // l.InterfaceC3007
    /* JADX INFO: renamed from: ۙ */
    public final void mo8971(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder != null) {
            m40506(iBinder, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0454(this, activity));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5331 m40508(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new C5331(C23238.f75405);
        }
        SidecarInterface sidecarInterface = this.f55349;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinder);
        SidecarInterface sidecarInterface2 = this.f55349;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return this.f55346.m20010(windowLayoutInfo, deviceState);
    }
}
