package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import bin.mt.plus.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1F */
/* JADX INFO: loaded from: classes2.dex */
public final class C1078 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static volatile C1078 f4936;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Object f4937 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f4938;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f4940 = new HashSet();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f4939 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m4058() {
        Object objM4056;
        synchronized (f4937) {
            objM4056 = this.f4939.get(C21179.class);
            if (objM4056 == null) {
                objM4056 = m4056(C21179.class, new HashSet());
            }
        }
        return objM4056;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m4060() {
        return this.f4940.contains(C21179.class);
    }

    public C1078(Context context) {
        this.f4938 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1078 m4057(Context context) {
        if (f4936 == null) {
            synchronized (f4937) {
                if (f4936 == null) {
                    f4936 = new C1078(context);
                }
            }
        }
        return f4936;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m4056(Class cls, HashSet hashSet) {
        Object objMo10668;
        HashMap map = this.f4939;
        if (C10958.m27712()) {
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
                InterfaceC3900 interfaceC3900 = (InterfaceC3900) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo10669 = interfaceC3900.mo10669();
                if (!listMo10669.isEmpty()) {
                    for (Class cls2 : listMo10669) {
                        if (!map.containsKey(cls2)) {
                            m4056(cls2, hashSet);
                        }
                    }
                }
                objMo10668 = interfaceC3900.mo10668(this.f4938);
                hashSet.remove(cls);
                map.put(cls, objMo10668);
            } catch (Throwable th2) {
                throw new C6723(th2);
            }
        } else {
            objMo10668 = map.get(cls);
        }
        Trace.endSection();
        return objMo10668;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4059(Bundle bundle) {
        HashSet hashSet;
        String string = this.f4938.getString(R.string.MT_Protector);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f4940;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC3900.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m4056((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C6723(e);
            }
        }
    }
}
