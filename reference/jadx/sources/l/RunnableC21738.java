package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21738 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70460;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70461;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19622 f70462;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f70463;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10450 f70464;

    public RunnableC21738(int i, int i2, Bundle bundle, C19622 c19622, C10450 c10450, String str) {
        this.f70462 = c19622;
        this.f70464 = c10450;
        this.f70461 = i;
        this.f70463 = str;
        this.f70460 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11260 c11260;
        C10450 c10450 = this.f70464;
        IBinder binder = c10450.f35674.getBinder();
        C19622 c19622 = this.f70462;
        c19622.f62983.f68499.remove(binder);
        AbstractServiceC21032 abstractServiceC21032 = c19622.f62983;
        Iterator it = abstractServiceC21032.f68500.iterator();
        while (true) {
            c11260 = null;
            if (!it.hasNext()) {
                break;
            }
            C11260 c11261 = (C11260) it.next();
            if (c11261.f38067 == this.f70461) {
                c11260 = (TextUtils.isEmpty(this.f70463) || this.f70460 <= 0) ? new C11260(abstractServiceC21032, c11261.f38065, c11261.f38066, c11261.f38067, c10450) : null;
                it.remove();
                break;
            }
        }
        if (c11260 == null) {
            c11260 = new C11260(abstractServiceC21032, this.f70463, this.f70460, this.f70461, c10450);
        }
        abstractServiceC21032.f68499.put(binder, c11260);
        try {
            binder.linkToDeath(c11260, 0);
        } catch (RemoteException unused) {
        }
    }
}
