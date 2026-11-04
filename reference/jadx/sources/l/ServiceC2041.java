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

/* JADX INFO: renamed from: l.֫ܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC2041 extends Service {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f6786 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C13921 f6787;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    @SuppressLint({"HandlerLeak"})
    public static Handler f6788;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C13921 f6789;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Application f6792;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f6793;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19041 f6796;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Throwable f6797;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10090 f6798;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC17249 f6794 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Set f6790 = Collections.newSetFromMap(new ConcurrentMapC17249());

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f6791 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractBinderC25162 f6795 = new BinderC19940(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m7018(ServiceC2041 serviceC2041, InterfaceC13227 interfaceC13227) {
        serviceC2041.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        C10090 c10090 = serviceC2041.f6798;
        if (c10090 != null) {
            threadCurrentThread.setContextClassLoader(c10090);
        }
        try {
            return interfaceC13227.call();
        } finally {
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        }
    }

    static {
        C13921 c13921 = new C13921(1);
        C13921 c13922 = new C13921(1);
        f6787 = c13921;
        f6789 = c13922;
        f6788 = new HandlerC15464(Looper.getMainLooper());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f6795;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7027(ServiceC2041 serviceC2041, boolean z) {
        String str = serviceC2041.f6796.getApplicationInfo().className;
        Application application = new Application();
        serviceC2041.f6792 = application;
        serviceC2041.f6796.m44149(application);
        try {
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(serviceC2041.f6792, serviceC2041.f6796);
        } catch (Throwable unused) {
        }
        serviceC2041.m7037();
        if (!z || Application.class.getName().equals(serviceC2041.f6796.getApplicationInfo().className)) {
            return;
        }
        try {
            String str2 = serviceC2041.f6796.getApplicationInfo().className;
            if (!TextUtils.isEmpty(serviceC2041.f6796.getApplicationInfo().className)) {
                serviceC2041.f6792 = (Application) serviceC2041.f6798.loadClass(serviceC2041.f6796.getApplicationInfo().className).newInstance();
            } else {
                serviceC2041.f6792 = (Application) Application.class.newInstance();
            }
            serviceC2041.f6796.m44149(serviceC2041.f6792);
            serviceC2041.m7037();
            Method declaredMethod2 = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(serviceC2041.f6792, serviceC2041.f6796);
            serviceC2041.f6792.onCreate();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m7037() {
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null).invoke(null, null);
            ApplicationInfo applicationInfo = this.f6796.getApplicationInfo();
            Object objM7016 = m7016(objInvoke, applicationInfo, this.f6796.getDataDir(), this.f6796.m44151(), this.f6796.m44148());
            m7040("mInitialApplication", objInvoke, this.f6792);
            try {
                List list = (List) m7017(objInvoke, "mAllApplications");
                list.clear();
                list.add(this.f6792);
            } catch (Exception unused) {
            }
            try {
                Object objM7017 = m7017(objInvoke, "mBoundApplication");
                m7040("appInfo", objM7017, applicationInfo);
                m7040("processName", objM7017, this.f6796.getPackageName());
                m7032("info", objM7017, objM7016);
                List list2 = (List) m7017(objM7017, "providers");
                if (list2 != null) {
                    list2.clear();
                }
            } catch (Exception unused2) {
            }
            try {
                m7022("mPackages", objInvoke, objM7016);
                m7022("mResourcePackages", objInvoke, objM7016);
            } catch (Exception unused3) {
            }
            try {
                Map map = (Map) m7017(objInvoke, "mServices");
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
                ((Map) m7017(objInvoke, "mActivities")).clear();
            } catch (Exception unused5) {
            }
            Field declaredField = Application.class.getDeclaredField("mLoadedApk");
            declaredField.setAccessible(true);
            declaredField.set(this.f6792, objM7016);
        } catch (Exception unused6) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m7016(Object obj, ApplicationInfo applicationInfo, File file, File file2, File file3) {
        try {
            Object objM7015 = m7015(obj, applicationInfo);
            if (objM7015 != null) {
                m7032("mActivityThread", objM7015, null);
                m7040("mPackageName", objM7015, this.f6796.getPackageName());
                m7040("mApplicationInfo", objM7015, applicationInfo);
                m7040("mAppDir", objM7015, this.f6796.getPackageResourcePath());
                m7040("mResDir", objM7015, this.f6796.getPackageResourcePath());
                m7040("mDataDir", objM7015, file.getPath());
                m7040("mLibDir", objM7015, applicationInfo.nativeLibraryDir);
                m7040("mDataDirFile", objM7015, file);
                m7040("mBaseClassLoader", objM7015, this.f6798);
                m7040("mResources", objM7015, this.f6796.getResources());
                m7040("mApplication", objM7015, this.f6792);
                m7040("mClassLoader", objM7015, this.f6798);
                m7032("mDefaultClassLoader", objM7015, this.f6798);
                m7032("mSecurityViolation", objM7015, Boolean.FALSE);
                m7032("mIncludeCode", objM7015, Boolean.TRUE);
                m7032("mDeviceProtectedDataDirFile", objM7015, file2);
                m7032("mCredentialProtectedDataDirFile", objM7015, file3);
                m7032("mDeviceProtectedDataDir", objM7015, file2.getPath());
                m7032("mCredentialProtectedDataDir", objM7015, file3.getPath());
                return objM7015;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m7015(Object obj, ApplicationInfo applicationInfo) {
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
                    C10090 c10090 = this.f6798;
                    Boolean bool = Boolean.FALSE;
                    return declaredConstructor.newInstance(obj3, applicationInfo2, obj2, c10090, bool, Boolean.TRUE, bool);
                } catch (Throwable unused2) {
                    for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                        Object[] objArrM7028 = m7028(constructor.getParameterTypes(), obj3, new ApplicationInfo(applicationInfo), obj2);
                        if (objArrM7028 != null) {
                            try {
                                constructor.setAccessible(true);
                                return constructor.newInstance(objArrM7028);
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
    private void m7022(String str, Object obj, Object obj2) {
        try {
            Map map = (Map) m7017(obj, str);
            if (map == null) {
                return;
            }
            WeakReference weakReference = obj2 == null ? null : new WeakReference(obj2);
            String packageName = getPackageName();
            String packageName2 = this.f6796.getPackageName();
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
    private Object[] m7028(Class[] clsArr, Object obj, ApplicationInfo applicationInfo, Object obj2) {
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
                objArr[i2] = this.f6798;
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
                objArr[i2] = this.f6796.getPackageName();
            } else {
                if (cls.isPrimitive()) {
                    return null;
                }
                objArr[i2] = null;
            }
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m7040(String str, Object obj, Object obj2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m7032(String str, Object obj, Object obj2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m7017(Object obj, String str) throws NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7023(ServiceC2041 serviceC2041, int i) {
        serviceC2041.f6791 = i;
        if (i == 0) {
            C8398.m22559(i);
            return;
        }
        C8398.m22559(i);
        throw new IllegalStateException("Seccomp fatal: " + C8398.m22559(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7014(ServiceC2041 serviceC2041) {
        serviceC2041.f6791 = 1;
        C8398.m22559(1);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m7033(ServiceC2041 serviceC2041, boolean z) {
        serviceC2041.f6798 = null;
        serviceC2041.f6792 = null;
        serviceC2041.f6796 = null;
        serviceC2041.f6794 = new ConcurrentMapC17249();
        serviceC2041.f6790 = Collections.newSetFromMap(new ConcurrentMapC17249());
        serviceC2041.f6793 = false;
        if (z) {
            serviceC2041.f6791 = Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m7041(ServiceC2041 serviceC2041, boolean z) {
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        C10090 c10090 = serviceC2041.f6798;
        if (c10090 != null) {
            threadCurrentThread.setContextClassLoader(c10090);
        }
        try {
            m7027(serviceC2041, z);
        } finally {
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m7019(InterfaceC13227 interfaceC13227) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return interfaceC13227.call();
        }
        return new C5770(interfaceC13227).m16851();
    }
}
