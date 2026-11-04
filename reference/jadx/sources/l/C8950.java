package l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.alipay.sdk.m.y.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J6S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8950 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final HashMap f29194 = new HashMap();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29195 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f29196;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile C8950 f29198;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f29200;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile String f29201;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f29203;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile C2239 f29204;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f29202 = new FutureC23690();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f29197 = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile WeakReference f29205 = new WeakReference(null);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f29199 = new FutureC23690();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23926(C8950 c8950, final FutureC23690 futureC23690) {
        C2239 c2239;
        c8950.getClass();
        if (futureC23690.isDone() || (c2239 = c8950.f29204) == null) {
            return;
        }
        try {
            C12679.m31461(c2239.f7329).m52931(new InterfaceC2017() { // from class: l.ܿ᩹᩸
                @Override // l.InterfaceC2017
                /* JADX INFO: renamed from: ᩷ */
                public final void mo1355(Object obj, Throwable th) {
                    if (th != null) {
                        futureC23690.m52937(th);
                    }
                }
            });
        } catch (Throwable th) {
            futureC23690.m52937(th);
        }
    }

    public C8950(InterfaceC24329 interfaceC24329, C8950 c8950, String str) {
        this.f29203 = interfaceC24329;
        this.f29201 = str;
        FutureC23690 futureC23690M52928 = c8950 == null ? FutureC23690.m52928(null) : c8950.f29202;
        this.f29196 = futureC23690M52928;
        this.f29198 = c8950;
        futureC23690M52928.m52931((InterfaceC2017) new C0747(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8950 m23922(InterfaceC24329 interfaceC24329) {
        return m23921("stored_text", interfaceC24329);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8950 m23921(String str, InterfaceC24329 interfaceC24329) {
        C8950 c8950;
        InterfaceC24329 interfaceC24329Normalize = interfaceC24329.toAbsolutePath().normalize();
        HashMap map = f29194;
        synchronized (map) {
            c8950 = new C8950(interfaceC24329Normalize, (C8950) map.get(interfaceC24329Normalize), str);
            map.put(interfaceC24329Normalize, c8950);
        }
        return c8950;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static FutureC23690 m23928(InterfaceC24329 interfaceC24329) {
        FutureC23690 futureC23690M52921;
        final InterfaceC24329 interfaceC24329Normalize = interfaceC24329.toAbsolutePath().normalize();
        HashMap map = f29194;
        synchronized (map) {
            futureC23690M52921 = FutureC23690.m52921((FutureC23690[]) C1170.stream(map.entrySet()).filter(new Predicate() { // from class: l.۟᩹᩸
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
                    return ((InterfaceC24329) ((Map.Entry) obj).getKey()).startsWith(interfaceC24329Normalize);
                }
            }).map(new C8195(2)).toArray(new C19392(0)));
        }
        return futureC23690M52921;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m23934() {
        return this.f29196.m52949((InterfaceC25138) new C10185());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m23933() {
        final C8950 c8950 = this.f29198;
        if (c8950 == null) {
            return m23934();
        }
        return c8950.m23933().m52943(new InterfaceC25138() { // from class: l.ۢ᩹᩸
            @Override // l.InterfaceC25138
            public final Object apply(Object obj) {
                return C8950.m23927(this.f33178);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static FutureC23690 m23927(C8950 c8950) {
        c8950.getClass();
        FutureC23690 futureC23690 = new FutureC23690();
        c8950.f29202.m52931((InterfaceC2017) new C13688(futureC23690));
        c8950.f29199.m52930((Runnable) new RunnableC1493(0, c8950, futureC23690));
        return futureC23690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23932(C2239 c2239) {
        this.f29204 = c2239;
        this.f29199.m52935((Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23930(String str, InterfaceC2984 interfaceC2984) {
        StringBuilder sbM10405 = C3188.m10405(str, "@");
        sbM10405.append(m23919(interfaceC2984));
        this.f29201 = sbM10405.toString();
        this.f29205 = new WeakReference(interfaceC2984);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m23919(Object obj) {
        return obj == null ? "null" : Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m23918(View view) {
        Activity activityM10534;
        StringBuilder sb = new StringBuilder();
        if (view == null) {
            activityM10534 = 0;
        } else {
            try {
                activityM10534 = C3200.m10534(view.getContext());
            } catch (RuntimeException e) {
                sb.append("\nviewActivityError=");
                sb.append(e.getClass().getName());
                sb.append('\n');
            }
        }
        if (activityM10534 == 0) {
            return "viewActivity=unavailable\n";
        }
        ComponentName componentName = activityM10534.getComponentName();
        Intent intent = activityM10534.getIntent();
        sb.append("viewActivity=");
        sb.append(m23919(activityM10534));
        sb.append("\nviewActivityClass=");
        sb.append(activityM10534.getClass().getName());
        sb.append("\nviewActivityComponent=");
        String hexString = "unavailable";
        sb.append(componentName == null ? "unavailable" : componentName.flattenToShortString());
        sb.append("\nviewActivityTaskId=");
        sb.append(activityM10534.getTaskId());
        sb.append("\nviewActivityFinishing=");
        sb.append(activityM10534.isFinishing());
        sb.append("\nviewActivityDestroyed=");
        sb.append(activityM10534.isDestroyed());
        sb.append("\nviewActivityChangingConfigurations=");
        sb.append(activityM10534.isChangingConfigurations());
        sb.append("\nviewActivityLifecycle=");
        sb.append(activityM10534 instanceof InterfaceC11217 ? ((InterfaceC11217) activityM10534).getLifecycle().mo23076() : "unavailable");
        sb.append("\nviewActivityIntentAction=");
        sb.append(intent == null ? "unavailable" : intent.getAction());
        sb.append("\nviewActivityIntentFlags=");
        if (intent != null) {
            hexString = Integer.toHexString(intent.getFlags());
        }
        sb.append(hexString);
        sb.append("\nviewWindowFocus=");
        sb.append(view.hasWindowFocus());
        sb.append("\nviewWindowVisibility=");
        sb.append(view.getWindowVisibility());
        sb.append("\nviewShown=");
        sb.append(view.isShown());
        sb.append('\n');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m23920(FutureC23690 futureC23690) {
        if (futureC23690 == null) {
            return "absent";
        }
        if (futureC23690.isDone()) {
            return futureC23690.m52954() ? k.j : "done";
        }
        return "pending";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m23929() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Lease diagnostics require the main thread");
        }
        StringBuilder sb = new StringBuilder("\n[sessionDirectoryLeases]\ndirectory=" + this.f29203 + "\n");
        int i = 0;
        C8950 c8950 = this;
        while (c8950 != null && i < 64) {
            C8950 c8951 = c8950.f29198;
            sb.append("[lease depth=");
            sb.append(i);
            sb.append("]\nid=");
            sb.append(m23919((Object) c8950));
            sb.append("\nholder=");
            sb.append(c8950.f29201);
            sb.append("\nageMs=");
            sb.append(SystemClock.uptimeMillis() - c8950.f29197);
            sb.append("\nready=");
            sb.append(m23920(c8950.f29196));
            sb.append("\nreleaseRequested=");
            sb.append(c8950.f29200);
            sb.append("\nfinished=");
            sb.append(m23920(c8950.f29202));
            sb.append("\npredecessor=");
            sb.append(m23919((Object) c8951));
            sb.append('\n');
            InterfaceC2984 interfaceC2984 = (InterfaceC2984) c8950.f29205.get();
            if (interfaceC2984 != null) {
                try {
                    sb.append(interfaceC2984.mo3661());
                    sb.append('\n');
                } catch (RuntimeException e) {
                    sb.append("diagnosticsError=");
                    sb.append(e);
                    sb.append('\n');
                }
            } else {
                sb.append("holderDetails=unavailable\n");
            }
            i++;
            c8950 = c8951;
        }
        if (c8950 != null) {
            sb.append("chainTruncated=true\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23931(final Throwable th) {
        synchronized (this) {
            if (this.f29200) {
                return;
            }
            this.f29200 = true;
            this.f29204 = null;
            this.f29196.m52931(new InterfaceC2017() { // from class: l.᩶᩹᩸
                @Override // l.InterfaceC2017
                /* JADX INFO: renamed from: ᩷ */
                public final void mo1355(Object obj, Throwable th2) {
                    C8950.m23925(this.f69067, th, th2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23925(C8950 c8950, Throwable th, Throwable th2) {
        HashMap map = f29194;
        synchronized (map) {
            C11392.remove(map, c8950.f29203, c8950);
        }
        c8950.f29205.clear();
        if (th2 != null) {
            th = th2;
        }
        if (th == null) {
            c8950.f29202.m52935((Object) null);
        } else {
            c8950.f29202.m52937(th);
        }
    }
}
