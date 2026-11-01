package l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩴ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC18986 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61450;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61451;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61452;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61453;

    public /* synthetic */ RunnableC18986(Object obj, Object obj2, Object obj3, int i) {
        this.f61451 = i;
        this.f61453 = obj;
        this.f61450 = obj2;
        this.f61452 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13929 c13929;
        switch (this.f61451) {
            case 0:
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f61453;
                Pattern pattern = (Pattern) this.f61450;
                C19112 c19112 = (C19112) this.f61452;
                while (!concurrentLinkedQueue.isEmpty() && (c13929 = (C13929) concurrentLinkedQueue.poll()) != null) {
                    C3489 c3489M33764 = c13929.m33764();
                    if (c3489M33764 != null) {
                        C9841[] c9841ArrM10236 = c3489M33764.m10236();
                        int length = c9841ArrM10236.length;
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                C9841[] c9841ArrM10232 = c3489M33764.m10232();
                                int length2 = c9841ArrM10232.length;
                                while (true) {
                                    if (i >= length2) {
                                        continue;
                                    } else if (!C8529.m22288(c9841ArrM10232[i], pattern)) {
                                        i++;
                                    }
                                }
                            } else if (!C8529.m22288(c9841ArrM10236[i2], pattern)) {
                                i2++;
                            }
                            synchronized (c19112) {
                                c19112.f61749.add(c13929);
                                break;
                            }
                        }
                    }
                }
                return;
            case 1:
                C20409.m46109((C20409) this.f61453, (C6111) this.f61452, (Runnable) this.f61450);
                return;
            default:
                C21444.m48048((String) this.f61453, (ViewOnClickListenerC23604) this.f61450, (C17232) this.f61452);
                return;
        }
    }
}
