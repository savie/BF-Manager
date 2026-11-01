package l;

import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractServiceC13457 extends Service {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Object f44508 = new Object();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final HashMap f44509 = new HashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AsyncTaskC6274 f44510;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public JobServiceEngineC9803 f44511;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44512;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f44513 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC4283 f44514;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo32942(Intent intent);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32940(Application application, Intent intent) {
        ComponentName componentName = new ComponentName(application, (Class<?>) ServiceC23069.class);
        synchronized (f44508) {
            AbstractC4283 abstractC4283M32939 = m32939(application, componentName, true, 100);
            abstractC4283M32939.m12088(100);
            abstractC4283M32939.mo10161(intent);
        }
    }

    public AbstractServiceC13457() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f44512 = null;
        } else {
            this.f44512 = new ArrayList();
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f44511 = new JobServiceEngineC9803(this);
            this.f44514 = null;
        } else {
            this.f44511 = null;
            this.f44514 = m32939(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.f44512 == null) {
            return 2;
        }
        this.f44514.mo12089();
        synchronized (this.f44512) {
            ArrayList arrayList = this.f44512;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C23914(this, intent, i2));
            m32943(true);
        }
        return 3;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineC9803 jobServiceEngineC9803 = this.f44511;
        if (jobServiceEngineC9803 != null) {
            return jobServiceEngineC9803.m24908();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f44512;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f44513 = true;
                this.f44514.mo12087();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC4283 m32939(ContextWrapper contextWrapper, ComponentName componentName, boolean z, int i) {
        AbstractC4283 c11214;
        HashMap map = f44509;
        AbstractC4283 abstractC4283 = (AbstractC4283) map.get(componentName);
        if (abstractC4283 != null) {
            return abstractC4283;
        }
        if (Build.VERSION.SDK_INT < 26) {
            c11214 = new C11214(contextWrapper, componentName);
        } else {
            if (!z) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            c11214 = new C3451(contextWrapper, componentName, i);
        }
        map.put(componentName, c11214);
        return c11214;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32943(boolean z) {
        if (this.f44510 == null) {
            this.f44510 = new AsyncTaskC6274(this);
            AbstractC4283 abstractC4283 = this.f44514;
            if (abstractC4283 != null && z) {
                abstractC4283.mo12090();
            }
            this.f44510.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32941() {
        ArrayList arrayList = this.f44512;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f44510 = null;
                ArrayList arrayList2 = this.f44512;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m32943(false);
                } else if (!this.f44513) {
                    this.f44514.mo12087();
                }
            }
        }
    }
}
