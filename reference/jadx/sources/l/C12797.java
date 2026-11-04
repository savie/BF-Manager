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

/* JADX INFO: renamed from: l.۫ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12797 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f40928 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f40930 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int f40932 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static IBinder f40933 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static IShizukuService f40935 = null;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int f40939 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final IShizukuApplication f40934 = new BinderC4594();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C2552 f40937 = new C2552();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f40936 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f40929 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ArrayList f40938 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Handler f40931 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m31704(IBinder iBinder, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("shizuku:attach-api-version", 13);
        bundle.putString("shizuku:attach-package-name", str);
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IShizukuService.Stub.DESCRIPTOR);
            parcelObtain.writeStrongBinder(f40934.asBinder());
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
    public static boolean m31692(IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IShizukuService.Stub.DESCRIPTOR);
            parcelObtain.writeStrongBinder(f40934.asBinder());
            parcelObtain.writeString(str);
            boolean zTransact = iBinder.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m31696(IBinder iBinder, String str) {
        IBinder iBinder2 = f40933;
        if (iBinder2 == iBinder) {
            return;
        }
        if (iBinder == null) {
            f40933 = null;
            f40935 = null;
            f40939 = -1;
            f40932 = -1;
            synchronized (f40936) {
                for (C21748 c21748 : f40929) {
                    c21748.getClass();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((InterfaceC10559) c21748.f69359).m27009();
                    } else {
                        Handler handler = f40931;
                        InterfaceC10559 interfaceC10559 = (InterfaceC10559) c21748.f69359;
                        C17359.requireNonNull(interfaceC10559);
                        handler.post(new RunnableC8518(0, interfaceC10559));
                    }
                }
            }
            return;
        }
        if (iBinder2 != null) {
            iBinder2.unlinkToDeath(f40937, 0);
        }
        f40933 = iBinder;
        f40935 = IShizukuService.Stub.asInterface(iBinder);
        try {
            f40933.linkToDeath(f40937, 0);
        } catch (Throwable unused) {
        }
        try {
            if (!m31704(f40933, str) && !m31692(f40933, str)) {
                f40928 = true;
            }
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
        if (f40928) {
            m31684();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31684() {
        ArrayList<C21748> arrayList = f40936;
        synchronized (arrayList) {
            for (C21748 c21748 : arrayList) {
                c21748.getClass();
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((InterfaceC22494) c21748.f69359).m50722();
                } else {
                    Handler handler = f40931;
                    InterfaceC22494 interfaceC22494 = (InterfaceC22494) c21748.f69359;
                    C17359.requireNonNull(interfaceC22494);
                    handler.post(new RunnableC9263(0, interfaceC22494));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31690(InterfaceC19510 interfaceC19510) {
        synchronized (f40936) {
            f40938.add(new C21748(interfaceC19510));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m31703(final InterfaceC19510 interfaceC19510) {
        synchronized (f40936) {
            C1170.removeIf(f40938, new Predicate() { // from class: l.۬ۡۘ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C21748) obj).f69359 == interfaceC19510;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31688(final int i, final int i2) {
        synchronized (f40936) {
            for (final C21748 c21748 : f40938) {
                c21748.getClass();
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((InterfaceC19510) c21748.f69359).mo14218(i, i2);
                } else {
                    f40931.post(new Runnable() { // from class: l.ۜۡۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC19510) c21748.f69359).mo14218(i, i2);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static IShizukuService m31693() {
        IShizukuService iShizukuService = f40935;
        if (iShizukuService != null) {
            return iShizukuService;
        }
        throw new IllegalStateException("binder haven't been received");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static IBinder m31694() {
        return f40933;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m31697() {
        IBinder iBinder = f40933;
        return iBinder != null && iBinder.pingBinder();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m31705() {
        int i = f40939;
        if (i != -1) {
            return i;
        }
        try {
            int uid = m31693().getUid();
            f40939 = uid;
            return uid;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m31699() {
        int i = f40932;
        if (i != -1) {
            return i;
        }
        try {
            int version = m31693().getVersion();
            f40932 = version;
            return version;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m31698() {
        return f40928;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31689(C15034 c15034, ServiceConnection serviceConnection) {
        BinderC17272 binderC17272M37716 = C15780.m37716(c15034);
        binderC17272M37716.m40568(serviceConnection);
        try {
            m31693().addUserService(binderC17272M37716, C15034.m36188(c15034));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31685(C15034 c15034) {
        BinderC17272 binderC17272M37716 = C15780.m37716(c15034);
        try {
            Bundle bundleM36188 = C15034.m36188(c15034);
            bundleM36188.putBoolean("shizuku:user-service-arg-no-create", true);
            int iAddUserService = m31693().addUserService(binderC17272M37716, bundleM36188);
            if (f40928 || m31699() < 13) {
                return iAddUserService == 0 ? 0 : -1;
            }
            return iAddUserService;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m31702(C15034 c15034) {
        try {
            IShizukuService iShizukuServiceM31693 = m31693();
            c15034.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("shizuku:user-service-arg-component", c15034.f49074);
            bundle.putBoolean("shizuku:user-service-remove", true);
            iShizukuServiceM31693.removeUserService(null, bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m31695(int i) {
        try {
            m31693().requestPermission(i);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m31700() {
        if (f40930) {
            return 0;
        }
        try {
            boolean zCheckSelfPermission = m31693().checkSelfPermission();
            f40930 = zCheckSelfPermission;
            return zCheckSelfPermission ? 0 : -1;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
