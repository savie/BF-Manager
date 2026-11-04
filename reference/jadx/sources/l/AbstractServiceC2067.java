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

/* JADX INFO: renamed from: l.֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class AbstractServiceC2067 extends Service {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Object f6877 = new Object();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f6878 = new HashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f6879 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public JobServiceEngineC15490 f6880;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6881;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AsyncTaskC5050 f6882;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC5796 f6883;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo7142(Intent intent);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7140(Application application, Intent intent) {
        ComponentName componentName = new ComponentName(application, (Class<?>) ServiceC18703.class);
        synchronized (f6877) {
            AbstractC5796 abstractC5796M7139 = m7139(application, componentName, true, 100);
            abstractC5796M7139.m16911(100);
            abstractC5796M7139.mo16912(intent);
        }
    }

    public AbstractServiceC2067() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6881 = null;
        } else {
            this.f6881 = new ArrayList();
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6880 = new JobServiceEngineC15490(this);
            this.f6883 = null;
        } else {
            this.f6880 = null;
            this.f6883 = m7139(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.f6881 == null) {
            return 2;
        }
        this.f6883.mo16913();
        synchronized (this.f6881) {
            ArrayList arrayList = this.f6881;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C11015(this, intent, i2));
            m7143(true);
        }
        return 3;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineC15490 jobServiceEngineC15490 = this.f6880;
        if (jobServiceEngineC15490 != null) {
            return jobServiceEngineC15490.m37055();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f6881;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f6879 = true;
                this.f6883.mo16910();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC5796 m7139(ContextWrapper contextWrapper, ComponentName componentName, boolean z, int i) {
        AbstractC5796 c22204;
        HashMap map = f6878;
        AbstractC5796 abstractC5796 = (AbstractC5796) map.get(componentName);
        if (abstractC5796 != null) {
            return abstractC5796;
        }
        if (Build.VERSION.SDK_INT < 26) {
            c22204 = new C22204(contextWrapper, componentName);
        } else {
            if (!z) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            c22204 = new C13253(contextWrapper, componentName, i);
        }
        map.put(componentName, c22204);
        return c22204;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7143(boolean z) {
        if (this.f6882 == null) {
            this.f6882 = new AsyncTaskC5050(this);
            AbstractC5796 abstractC5796 = this.f6883;
            if (abstractC5796 != null && z) {
                abstractC5796.mo16914();
            }
            this.f6882.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7141() {
        ArrayList arrayList = this.f6881;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f6882 = null;
                ArrayList arrayList2 = this.f6881;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m7143(false);
                } else if (!this.f6879) {
                    this.f6883.mo16910();
                }
            }
        }
    }
}
