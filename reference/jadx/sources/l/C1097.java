package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import bin.mt.plus.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1F */
/* JADX INFO: loaded from: classes2.dex */
public final class C1097 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Object f3905 = new Object();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static volatile C1097 f3906;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f3907;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f3909 = new HashSet();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f3908 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m4097() {
        Object objM4095;
        synchronized (f3905) {
            objM4095 = this.f3908.get(C3760.class);
            if (objM4095 == null) {
                objM4095 = m4095(C3760.class, new HashSet());
            }
        }
        return objM4095;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m4099() {
        return this.f3909.contains(C3760.class);
    }

    public C1097(Context context) {
        this.f3907 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1097 m4096(Context context) {
        if (f3906 == null) {
            synchronized (f3905) {
                if (f3906 == null) {
                    f3906 = new C1097(context);
                }
            }
        }
        return f3906;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m4095(Class cls, HashSet hashSet) {
        Object objMo8653;
        HashMap map = this.f3908;
        if (C20226.m46501()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (!map.containsKey(cls)) {
            hashSet.add(cls);
            try {
                InterfaceC2588 interfaceC2588 = (InterfaceC2588) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo8654 = interfaceC2588.mo8654();
                if (!listMo8654.isEmpty()) {
                    for (Class cls2 : listMo8654) {
                        if (!map.containsKey(cls2)) {
                            m4095(cls2, hashSet);
                        }
                    }
                }
                objMo8653 = interfaceC2588.mo8653(this.f3907);
                hashSet.remove(cls);
                map.put(cls, objMo8653);
            } catch (Throwable th2) {
                throw new C8554(th2);
            }
        } else {
            objMo8653 = map.get(cls);
        }
        Trace.endSection();
        return objMo8653;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4098(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3907.getString(R.string.MT_Protector);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f3909;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC2588.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m4095((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C8554(e);
            }
        }
    }
}
