package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7269 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f23951;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23952;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10953 f23953;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23954;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19904 f23955;

    public RunnableC7269(int i, int i2, Bundle bundle, C10953 c10953, C19904 c19904, String str) {
        this.f23953 = c10953;
        this.f23955 = c19904;
        this.f23952 = i;
        this.f23951 = str;
        this.f23954 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23678 c23678;
        C19904 c19904 = this.f23955;
        IBinder binder = c19904.f64055.getBinder();
        C10953 c10953 = this.f23953;
        c10953.f34619.f42128.remove(binder);
        AbstractServiceC13191 abstractServiceC13191 = c10953.f34619;
        Iterator it = abstractServiceC13191.f42126.iterator();
        while (true) {
            c23678 = null;
            if (!it.hasNext()) {
                break;
            }
            C23678 c23679 = (C23678) it.next();
            if (c23679.f76778 == this.f23952) {
                c23678 = (TextUtils.isEmpty(this.f23951) || this.f23954 <= 0) ? new C23678(abstractServiceC13191, c23679.f76777, c23679.f76780, c23679.f76778, c19904) : null;
                it.remove();
                break;
            }
        }
        if (c23678 == null) {
            c23678 = new C23678(abstractServiceC13191, this.f23951, this.f23954, this.f23952, c19904);
        }
        abstractServiceC13191.f42128.put(binder, c23678);
        try {
            binder.linkToDeath(c23678, 0);
        } catch (RemoteException unused) {
        }
    }
}
