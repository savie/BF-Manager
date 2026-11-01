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

/* JADX INFO: renamed from: l.۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC12046 implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Handler f40313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Context f40316;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f40315 = new HashMap();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Set f40314 = new HashSet();

    public ServiceConnectionC12046(Context context) {
        this.f40316 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f40313 = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29942(C19807 c19807) {
        this.f40313.obtainMessage(0, c19807).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Context context = this.f40316;
        HashMap map = this.f40315;
        if (i == 0) {
            InterfaceC16984 interfaceC16984 = (InterfaceC16984) message.obj;
            Set setM15708 = C5695.m15708(context);
            if (!setM15708.equals(this.f40314)) {
                this.f40314 = setM15708;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (((HashSet) setM15708).contains(resolveInfo.serviceInfo.packageName)) {
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
                            C13638.toString(componentName2);
                        }
                        map.put(componentName2, new C16279(componentName2));
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            C13638.toString(entry.getKey());
                        }
                        C16279 c16279 = (C16279) entry.getValue();
                        if (c16279.f52446) {
                            context.unbindService(this);
                            c16279.f52446 = false;
                        }
                        c16279.f52445 = null;
                        it.remove();
                    }
                }
            }
            for (C16279 c162710 : map.values()) {
                c162710.f52447.add(interfaceC16984);
                m29940(c162710);
            }
        } else if (i == 1) {
            C0050 c0050 = (C0050) message.obj;
            ComponentName componentName3 = c0050.f913;
            IBinder iBinder = c0050.f914;
            C16279 c162711 = (C16279) map.get(componentName3);
            if (c162711 != null) {
                c162711.f52445 = AbstractBinderC13456.m32938(iBinder);
                c162711.f52448 = 0;
                m29940(c162711);
                return true;
            }
        } else if (i == 2) {
            C16279 c162712 = (C16279) map.get((ComponentName) message.obj);
            if (c162712 != null) {
                if (c162712.f52446) {
                    context.unbindService(this);
                    c162712.f52446 = false;
                }
                c162712.f52445 = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            C16279 c162713 = (C16279) map.get((ComponentName) message.obj);
            if (c162713 != null) {
                m29940(c162713);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            C13638.toString(componentName);
        }
        this.f40313.obtainMessage(1, new C0050(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            C13638.toString(componentName);
        }
        this.f40313.obtainMessage(2, componentName).sendToTarget();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m29941(C16279 c16279) {
        ComponentName componentName = c16279.f52449;
        ArrayDeque arrayDeque = c16279.f52447;
        Handler handler = this.f40313;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c16279.f52448;
        int i2 = i + 1;
        c16279.f52448 = i2;
        if (i2 > 6) {
            arrayDeque.size();
            C13638.toString(componentName);
            arrayDeque.clear();
        } else {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i) * 1000);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29940(C16279 c16279) {
        boolean z;
        ArrayDeque arrayDeque = c16279.f52447;
        ComponentName componentName = c16279.f52449;
        if (Log.isLoggable("NotifManCompat", 3)) {
            C13638.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c16279.f52446) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f40316;
            boolean zBindService = context.bindService(component, this, 33);
            c16279.f52446 = zBindService;
            if (zBindService) {
                c16279.f52448 = 0;
            } else {
                C13638.toString(componentName);
                context.unbindService(this);
            }
            z = c16279.f52446;
        }
        if (!z || c16279.f52445 == null) {
            m29941(c16279);
            return;
        }
        while (true) {
            InterfaceC16984 interfaceC16984 = (InterfaceC16984) arrayDeque.peek();
            if (interfaceC16984 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    interfaceC16984.toString();
                }
                interfaceC16984.mo39770(c16279.f52445);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    C13638.toString(componentName);
                }
            } catch (RemoteException unused2) {
                C13638.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        m29941(c16279);
    }
}
