package l;

import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9505 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f30780;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IBinder f30781;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10953 f30782;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30783;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19904 f30784;

    public RunnableC9505(C10953 c10953, C19904 c19904, String str, IBinder iBinder, Bundle bundle) {
        this.f30782 = c10953;
        this.f30784 = c19904;
        this.f30783 = str;
        this.f30781 = iBinder;
        this.f30780 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f30784.f64055.getBinder();
        C10953 c10953 = this.f30782;
        C23678 c23678 = (C23678) c10953.f34619.f42128.get(binder);
        if (c23678 == null) {
            return;
        }
        HashMap map = c23678.f76781;
        AbstractServiceC13191 abstractServiceC13191 = c10953.f34619;
        String str = this.f30783;
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            IBinder iBinder = this.f30781;
            Bundle bundle = this.f30780;
            if (!zHasNext) {
                arrayList.add(new C2310(iBinder, bundle));
                map.put(str, arrayList);
                C2049 c2049 = new C2049(abstractServiceC13191, str, c23678, str, bundle);
                if (bundle == null) {
                    abstractServiceC13191.m32708();
                } else {
                    c2049.m21880(1);
                    abstractServiceC13191.m32708();
                }
                if (!c2049.m21884()) {
                    throw new IllegalStateException(C12669.m31438(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), c23678.f76777, " id=", str));
                }
                return;
            }
            C2310 c2310 = (C2310) it.next();
            if (iBinder == c2310.f7473 && C18856.m43748(bundle, (Bundle) c2310.f7474)) {
                return;
            }
        }
    }
}
