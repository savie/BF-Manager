package l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ܶܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes4.dex */
public class ServiceC15304 extends Service {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    @SuppressLint({"HandlerLeak"})
    public static Handler f49856;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static C0219 f49857;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C0219 f49858;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f49859 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23523 f49860;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Application f49863;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Throwable f49866;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14351 f49867;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f49868;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC13783 f49861 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Set f49865 = Collections.newSetFromMap(new ConcurrentMapC13783());

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f49862 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractBinderC18125 f49864 = new BinderC13187(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m36626(ServiceC15304 serviceC15304, InterfaceC6836 interfaceC6836) {
        serviceC15304.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        C14351 c14351 = serviceC15304.f49867;
        if (c14351 != null) {
            threadCurrentThread.setContextClassLoader(c14351);
        }
        try {
            return interfaceC6836.call();
        } finally {
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        }
    }

    static {
        C0219 c0219 = new C0219();
        C0219 c02110 = new C0219();
        f49858 = c0219;
        f49857 = c02110;
        f49856 = new HandlerC4013(Looper.getMainLooper());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f49864;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36634(ServiceC15304 serviceC15304, boolean z) {
        String str = serviceC15304.f49860.getApplicationInfo().className;
        Application application = new Application();
        serviceC15304.f49863 = application;
        serviceC15304.f49860.m51815(application);
        try {
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(serviceC15304.f49863, serviceC15304.f49860);
        } catch (Throwable unused) {
        }
        serviceC15304.m36637();
        if (!z || Application.class.getName().equals(serviceC15304.f49860.getApplicationInfo().className)) {
            return;
        }
        try {
            String str2 = serviceC15304.f49860.getApplicationInfo().className;
            if (!TextUtils.isEmpty(serviceC15304.f49860.getApplicationInfo().className)) {
                serviceC15304.f49863 = (Application) serviceC15304.f49867.loadClass(serviceC15304.f49860.getApplicationInfo().className).newInstance();
            } else {
                serviceC15304.f49863 = (Application) Application.class.newInstance();
            }
            serviceC15304.f49860.m51815(serviceC15304.f49863);
            serviceC15304.m36637();
            Method declaredMethod2 = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(serviceC15304.f49863, serviceC15304.f49860);
            serviceC15304.f49863.onCreate();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m36637() {
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null).invoke(null, null);
            ApplicationInfo applicationInfo = this.f49860.getApplicationInfo();
            Object objM36623 = m36623(objInvoke, applicationInfo, this.f49860.getDataDir(), this.f49860.m51817(), this.f49860.m51814());
            m36645("mInitialApplication", objInvoke, this.f49863);
            try {
                List list = (List) m36624(objInvoke, "mAllApplications");
                list.clear();
                list.add(this.f49863);
            } catch (Exception unused) {
            }
            try {
                Object objM36624 = m36624(objInvoke, "mBoundApplication");
                m36645("appInfo", objM36624, applicationInfo);
                m36645("processName", objM36624, this.f49860.getPackageName());
                m36640("info", objM36624, objM36623);
                List list2 = (List) m36624(objM36624, "providers");
                if (list2 != null) {
                    list2.clear();
                }
            } catch (Exception unused2) {
            }
            try {
                m36629("mPackages", objInvoke, objM36623);
                m36629("mResourcePackages", objInvoke, objM36623);
            } catch (Exception unused3) {
            }
            try {
                Map map = (Map) m36624(objInvoke, "mServices");
                if (map != null && !map.isEmpty()) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if ((next instanceof Map.Entry) && ((Map.Entry) next).getValue() == this) {
                            it.remove();
                        }
                    }
                }
            } catch (Exception unused4) {
            }
            try {
                ((Map) m36624(objInvoke, "mActivities")).clear();
            } catch (Exception unused5) {
            }
            Field declaredField = Application.class.getDeclaredField("mLoadedApk");
            declaredField.setAccessible(true);
            declaredField.set(this.f49863, objM36623);
        } catch (Exception unused6) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m36623(Object obj, ApplicationInfo applicationInfo, File file, File file2, File file3) {
        try {
            Object objM36622 = m36622(obj, applicationInfo);
            if (objM36622 != null) {
                m36640("mActivityThread", objM36622, null);
                m36645("mPackageName", objM36622, this.f49860.getPackageName());
                m36645("mApplicationInfo", objM36622, applicationInfo);
                m36645("mAppDir", objM36622, this.f49860.getPackageResourcePath());
                m36645("mResDir", objM36622, this.f49860.getPackageResourcePath());
                m36645("mDataDir", objM36622, file.getPath());
                m36645("mLibDir", objM36622, applicationInfo.nativeLibraryDir);
                m36645("mDataDirFile", objM36622, file);
                m36645("mBaseClassLoader", objM36622, this.f49867);
                m36645("mResources", objM36622, this.f49860.getResources());
                m36645("mApplication", objM36622, this.f49863);
                m36645("mClassLoader", objM36622, this.f49867);
                m36640("mDefaultClassLoader", objM36622, this.f49867);
                m36640("mSecurityViolation", objM36622, Boolean.FALSE);
                m36640("mIncludeCode", objM36622, Boolean.TRUE);
                m36640("mDeviceProtectedDataDirFile", objM36622, file2);
                m36640("mCredentialProtectedDataDirFile", objM36622, file3);
                m36640("mDeviceProtectedDataDir", objM36622, file2.getPath());
                m36640("mCredentialProtectedDataDir", objM36622, file3.getPath());
                return objM36622;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m36622(Object obj, ApplicationInfo applicationInfo) {
        Object obj2;
        Object obj3 = obj;
        try {
            Class<?> cls = Class.forName("android.app.LoadedApk");
            Class<?> cls2 = Class.forName("android.app.ActivityThread");
            Class<?> cls3 = Class.forName("android.content.res.CompatibilityInfo");
            try {
                Field field = cls3.getField("DEFAULT_COMPATIBILITY_INFO");
                field.setAccessible(true);
                obj2 = field.get(null);
            } catch (Throwable unused) {
                obj2 = null;
            }
            try {
                try {
                    Class<?> cls4 = Boolean.TYPE;
                    Constructor<?> declaredConstructor = cls.getDeclaredConstructor(cls2, ApplicationInfo.class, cls3, ClassLoader.class, cls4, cls4, cls4);
                    declaredConstructor.setAccessible(true);
                    ApplicationInfo applicationInfo2 = new ApplicationInfo(applicationInfo);
                    C14351 c14351 = this.f49867;
                    Boolean bool = Boolean.FALSE;
                    return declaredConstructor.newInstance(obj3, applicationInfo2, obj2, c14351, bool, Boolean.TRUE, bool);
                } catch (Throwable unused2) {
                    for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                        Object[] objArrM36635 = m36635(constructor.getParameterTypes(), obj3, new ApplicationInfo(applicationInfo), obj2);
                        if (objArrM36635 != null) {
                            try {
                                constructor.setAccessible(true);
                                return constructor.newInstance(objArrM36635);
                            } catch (Throwable unused3) {
                                continue;
                            }
                        }
                    }
                    return null;
                }
            } catch (Throwable unused4) {
                Constructor<?> declaredConstructor2 = cls.getDeclaredConstructor(cls2);
                declaredConstructor2.setAccessible(true);
                return declaredConstructor2.newInstance(obj3);
            }
        } catch (Throwable unused5) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36629(String str, Object obj, Object obj2) {
        try {
            Map map = (Map) m36624(obj, str);
            if (map == null) {
                return;
            }
            WeakReference weakReference = obj2 == null ? null : new WeakReference(obj2);
            String packageName = getPackageName();
            String packageName2 = this.f49860.getPackageName();
            if (weakReference == null) {
                map.remove(packageName);
                map.remove(packageName2);
            } else {
                map.put(packageName, weakReference);
                map.put(packageName2, weakReference);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object[] m36635(Class[] clsArr, Object obj, ApplicationInfo applicationInfo, Object obj2) {
        Object[] objArr = new Object[clsArr.length];
        int i = 0;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            Class cls = clsArr[i2];
            String name = cls.getName();
            if ("android.app.ActivityThread".equals(name)) {
                objArr[i2] = obj;
            } else if (cls == ApplicationInfo.class) {
                objArr[i2] = new ApplicationInfo(applicationInfo);
            } else if ("android.content.res.CompatibilityInfo".equals(name)) {
                objArr[i2] = obj2;
            } else if (cls == ClassLoader.class) {
                objArr[i2] = this.f49867;
            } else if (cls == Boolean.TYPE) {
                int i3 = i + 1;
                objArr[i2] = Boolean.valueOf(i == 1);
                i = i3;
            } else if (cls == Integer.TYPE) {
                objArr[i2] = 0;
            } else if (cls == Long.TYPE) {
                objArr[i2] = 0L;
            } else if (cls == Float.TYPE) {
                objArr[i2] = Float.valueOf(0.0f);
            } else if (cls == Double.TYPE) {
                objArr[i2] = Double.valueOf(0.0d);
            } else if (cls == Byte.TYPE) {
                objArr[i2] = (byte) 0;
            } else if (cls == Short.TYPE) {
                objArr[i2] = (short) 0;
            } else if (cls == Character.TYPE) {
                objArr[i2] = (char) 0;
            } else if (cls == String.class) {
                objArr[i2] = this.f49860.getPackageName();
            } else {
                if (cls.isPrimitive()) {
                    return null;
                }
                objArr[i2] = null;
            }
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m36645(String str, Object obj, Object obj2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m36640(String str, Object obj, Object obj2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m36624(Object obj, String str) throws NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36630(ServiceC15304 serviceC15304, int i) {
        serviceC15304.f49862 = i;
        if (i == 0) {
            C10336.m26218(i);
            return;
        }
        C10336.m26218(i);
        throw new IllegalStateException("Seccomp fatal: " + C10336.m26218(i));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m36621(ServiceC15304 serviceC15304) {
        serviceC15304.f49862 = 1;
        C10336.m26218(1);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m36641(ServiceC15304 serviceC15304, boolean z) {
        serviceC15304.f49867 = null;
        serviceC15304.f49863 = null;
        serviceC15304.f49860 = null;
        serviceC15304.f49861 = new ConcurrentMapC13783();
        serviceC15304.f49865 = Collections.newSetFromMap(new ConcurrentMapC13783());
        serviceC15304.f49868 = false;
        if (z) {
            serviceC15304.f49862 = Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m36646(ServiceC15304 serviceC15304, boolean z) {
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        C14351 c14351 = serviceC15304.f49867;
        if (c14351 != null) {
            threadCurrentThread.setContextClassLoader(c14351);
        }
        try {
            m36634(serviceC15304, z);
        } finally {
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m36625(InterfaceC6836 interfaceC6836) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return interfaceC6836.call();
        }
        return new C23065(interfaceC6836).m51037();
    }
}
