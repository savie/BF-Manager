package l;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۫ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC13039 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41723;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41724;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41725;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41726;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f41727;

    public /* synthetic */ RunnableC13039(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i) {
        this.f41725 = i;
        this.f41727 = callback;
        this.f41726 = obj;
        this.f41723 = obj2;
        this.f41724 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f41725;
        Object obj = this.f41724;
        Object obj2 = this.f41723;
        Object obj3 = this.f41726;
        KeyEvent.Callback callback = this.f41727;
        switch (i) {
            case 0:
                C6679.m18680((C1626) callback, (C23255) obj3, (AbstractActivityC17204) obj2, (DialogInterfaceC8327) obj);
                break;
            default:
                final ActivityC15913 activityC15913 = (ActivityC15913) callback;
                final ArrayList arrayList = (ArrayList) obj3;
                final AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                final C13511 c13511 = (C13511) obj;
                int i2 = ActivityC15913.f51685;
                try {
                    final C23149 c23149M46386 = C20165.m46386(arrayList, new C11438(atomicBoolean));
                    activityC15913.runOnUiThread(new Runnable() { // from class: l.۬۠ۚ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC15913.m37896(activityC15913, c13511, atomicBoolean, c23149M46386, arrayList);
                        }
                    });
                } catch (Exception e) {
                    activityC15913.runOnUiThread(new RunnableC21163(activityC15913, c13511, atomicBoolean, e));
                }
                break;
        }
    }
}
