package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC7287 implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f23998 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Set f23999 = new HashSet();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Handler f24000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Context f24001;

    public ServiceConnectionC7287(Context context) {
        this.f24001 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f24000 = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19951(C9523 c9523) {
        this.f24000.obtainMessage(0, c9523).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Context context = this.f24001;
        HashMap map = this.f23998;
        if (i == 0) {
            InterfaceC13998 interfaceC13998 = (InterfaceC13998) message.obj;
            Set setM14248 = C4525.m14248(context);
            if (!setM14248.equals(this.f23999)) {
                this.f23999 = setM14248;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (((HashSet) setM14248).contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            C17359.toString(componentName2);
                        }
                        map.put(componentName2, new C8778(componentName2));
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            C17359.toString(entry.getKey());
                        }
                        C8778 c8778 = (C8778) entry.getValue();
                        if (c8778.f28550) {
                            context.unbindService(this);
                            c8778.f28550 = false;
                        }
                        c8778.f28554 = null;
                        it.remove();
                    }
                }
            }
            for (C8778 c8779 : map.values()) {
                c8779.f28552.add(interfaceC13998);
                m19949(c8779);
            }
        } else if (i == 1) {
            C2812 c2812 = (C2812) message.obj;
            ComponentName componentName3 = c2812.f9241;
            IBinder iBinder = c2812.f9242;
            C8778 c87710 = (C8778) map.get(componentName3);
            if (c87710 != null) {
                c87710.f28554 = AbstractBinderC21678.m49219(iBinder);
                c87710.f28551 = 0;
                m19949(c87710);
                return true;
            }
        } else if (i == 2) {
            C8778 c87711 = (C8778) map.get((ComponentName) message.obj);
            if (c87711 != null) {
                if (c87711.f28550) {
                    context.unbindService(this);
                    c87711.f28550 = false;
                }
                c87711.f28554 = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            C8778 c87712 = (C8778) map.get((ComponentName) message.obj);
            if (c87712 != null) {
                m19949(c87712);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            C17359.toString(componentName);
        }
        this.f24000.obtainMessage(1, new C2812(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            C17359.toString(componentName);
        }
        this.f24000.obtainMessage(2, componentName).sendToTarget();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m19950(C8778 c8778) {
        ComponentName componentName = c8778.f28553;
        ArrayDeque arrayDeque = c8778.f28552;
        Handler handler = this.f24000;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c8778.f28551;
        int i2 = i + 1;
        c8778.f28551 = i2;
        if (i2 > 6) {
            arrayDeque.size();
            C17359.toString(componentName);
            arrayDeque.clear();
        } else {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i) * 1000);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19949(C8778 c8778) {
        boolean z;
        ArrayDeque arrayDeque = c8778.f28552;
        ComponentName componentName = c8778.f28553;
        if (Log.isLoggable("NotifManCompat", 3)) {
            C17359.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c8778.f28550) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f24001;
            boolean zBindService = context.bindService(component, this, 33);
            c8778.f28550 = zBindService;
            if (zBindService) {
                c8778.f28551 = 0;
            } else {
                C17359.toString(componentName);
                context.unbindService(this);
            }
            z = c8778.f28550;
        }
        if (!z || c8778.f28554 == null) {
            m19950(c8778);
            return;
        }
        while (true) {
            InterfaceC13998 interfaceC13998 = (InterfaceC13998) arrayDeque.peek();
            if (interfaceC13998 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    interfaceC13998.toString();
                }
                interfaceC13998.mo24916(c8778.f28554);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    C17359.toString(componentName);
                }
            } catch (RemoteException unused2) {
                C17359.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        m19950(c8778);
    }
}
