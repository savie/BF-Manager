package l;

import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6921 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f23287;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IBinder f23288;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19622 f23289;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f23290;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10450 f23291;

    public RunnableC6921(C19622 c19622, C10450 c10450, String str, IBinder iBinder, Bundle bundle) {
        this.f23289 = c19622;
        this.f23291 = c10450;
        this.f23287 = str;
        this.f23288 = iBinder;
        this.f23290 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f23291.f35674.getBinder();
        C19622 c19622 = this.f23289;
        C11260 c11260 = (C11260) c19622.f62983.f68499.getOrDefault(binder, null);
        if (c11260 == null) {
            return;
        }
        HashMap map = c11260.f38062;
        AbstractServiceC21032 abstractServiceC21032 = c19622.f62983;
        String str = this.f23287;
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            IBinder iBinder = this.f23288;
            Bundle bundle = this.f23290;
            if (!zHasNext) {
                arrayList.add(new C10946(iBinder, bundle));
                map.put(str, arrayList);
                C20432 c20432 = new C20432(abstractServiceC21032, str, c11260, str, bundle);
                if (bundle == null) {
                    abstractServiceC21032.m47411();
                } else {
                    c20432.m49804(1);
                    abstractServiceC21032.m47411();
                }
                if (!c20432.m49806()) {
                    throw new IllegalStateException(C1694.m5622(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), c11260.f38065, " id=", str));
                }
                return;
            }
            C10946 c10946 = (C10946) it.next();
            if (iBinder == c10946.f37217 && C14611.m35086(bundle, (Bundle) c10946.f37218)) {
                return;
            }
        }
    }
}
