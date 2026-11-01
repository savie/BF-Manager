package l;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.function.Predicate;
import moe.shizuku.server.IShizukuApplication;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes2.dex */
public final class C1468 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static IBinder f5974 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean f5976 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int f5979 = -1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean f5981 = false;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static IShizukuService f5983 = null;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static int f5985 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final IShizukuApplication f5984 = new BinderC12053();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C15581 f5982 = new C15581();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f5978 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f5977 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f5975 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Handler f5980 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m5113(IBinder iBinder, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("shizuku:attach-api-version", 13);
        bundle.putString("shizuku:attach-package-name", str);
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IShizukuService.Stub.DESCRIPTOR);
            parcelObtain.writeStrongBinder(f5984.asBinder());
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            boolean zTransact = iBinder.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5103(IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IShizukuService.Stub.DESCRIPTOR);
            parcelObtain.writeStrongBinder(f5984.asBinder());
            parcelObtain.writeString(str);
            boolean zTransact = iBinder.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m5107(IBinder iBinder, String str) {
        IBinder iBinder2 = f5974;
        if (iBinder2 == iBinder) {
            return;
        }
        if (iBinder == null) {
            f5974 = null;
            f5983 = null;
            f5985 = -1;
            f5979 = -1;
            synchronized (f5978) {
                for (C16991 c16991 : f5977) {
                    c16991.getClass();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((InterfaceC5702) c16991.f54329).m15730();
                    } else {
                        Handler handler = f5980;
                        InterfaceC5702 interfaceC5702 = (InterfaceC5702) c16991.f54329;
                        C13638.requireNonNull(interfaceC5702);
                        handler.post(new RunnableC19814(0, interfaceC5702));
                    }
                }
            }
            return;
        }
        if (iBinder2 != null) {
            iBinder2.unlinkToDeath(f5982, 0);
        }
        f5974 = iBinder;
        f5983 = IShizukuService.Stub.asInterface(iBinder);
        try {
            f5974.linkToDeath(f5982, 0);
        } catch (Throwable unused) {
        }
        try {
            if (!m5113(f5974, str) && !m5103(f5974, str)) {
                f5976 = true;
            }
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
        if (f5976) {
            m5095();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m5095() {
        ArrayList<C16991> arrayList = f5978;
        synchronized (arrayList) {
            for (C16991 c16991 : arrayList) {
                c16991.getClass();
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((InterfaceC10642) c16991.f54329).m26831();
                } else {
                    Handler handler = f5980;
                    InterfaceC10642 interfaceC10642 = (InterfaceC10642) c16991.f54329;
                    C13638.requireNonNull(interfaceC10642);
                    handler.post(new RunnableC20519(0, interfaceC10642));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5101(InterfaceC23342 interfaceC23342) {
        synchronized (f5978) {
            f5975.add(new C16991(interfaceC23342));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m5112(final InterfaceC23342 interfaceC23342) {
        synchronized (f5978) {
            C9030.removeIf(f5975, new Predicate() { // from class: l.ܽ֡۟
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C16991) obj).f54329 == interfaceC23342;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5099(final int i, final int i2) {
        synchronized (f5978) {
            for (final C16991 c16991 : f5975) {
                c16991.getClass();
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((InterfaceC23342) c16991.f54329).mo7537(i, i2);
                } else {
                    f5980.post(new Runnable() { // from class: l.֡֡۟
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC23342) c16991.f54329).mo7537(i, i2);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static IShizukuService m5108() {
        IShizukuService iShizukuService = f5983;
        if (iShizukuService != null) {
            return iShizukuService;
        }
        throw new IllegalStateException("binder haven't been received");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static IBinder m5105() {
        return f5974;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m5093() {
        IBinder iBinder = f5974;
        return iBinder != null && iBinder.pingBinder();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m5094() {
        int i = f5985;
        if (i != -1) {
            return i;
        }
        try {
            int uid = m5108().getUid();
            f5985 = uid;
            return uid;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m5104() {
        int i = f5979;
        if (i != -1) {
            return i;
        }
        try {
            int version = m5108().getVersion();
            f5979 = version;
            return version;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m5114() {
        return f5976;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5100(C14170 c14170, ServiceConnection serviceConnection) {
        BinderC2649 binderC2649M15138 = C5472.m15138(c14170);
        binderC2649M15138.m8175(serviceConnection);
        try {
            m5108().addUserService(binderC2649M15138, C14170.m34254(c14170));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m5096(C14170 c14170) {
        BinderC2649 binderC2649M15138 = C5472.m15138(c14170);
        try {
            Bundle bundleM34254 = C14170.m34254(c14170);
            bundleM34254.putBoolean("shizuku:user-service-arg-no-create", true);
            int iAddUserService = m5108().addUserService(binderC2649M15138, bundleM34254);
            if (f5976 || m5104() < 13) {
                return iAddUserService == 0 ? 0 : -1;
            }
            return iAddUserService;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m5111(C14170 c14170) {
        try {
            IShizukuService iShizukuServiceM5108 = m5108();
            c14170.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("shizuku:user-service-arg-component", c14170.f46504);
            bundle.putBoolean("shizuku:user-service-remove", true);
            iShizukuServiceM5108.removeUserService(null, bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m5106(int i) {
        try {
            m5108().requestPermission(i);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m5109() {
        if (f5981) {
            return 0;
        }
        try {
            boolean zCheckSelfPermission = m5108().checkSelfPermission();
            f5981 = zCheckSelfPermission;
            return zCheckSelfPermission ? 0 : -1;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
