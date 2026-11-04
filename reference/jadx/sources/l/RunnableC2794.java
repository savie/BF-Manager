package l;

import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2794 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IBinder f9195;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10953 f9196;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f9197;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19904 f9198;

    public RunnableC2794(C10953 c10953, C19904 c19904, String str, IBinder iBinder) {
        this.f9196 = c10953;
        this.f9198 = c19904;
        this.f9197 = str;
        this.f9195 = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23678 c23678 = (C23678) this.f9196.f34619.f42128.get(this.f9198.f64055.getBinder());
        if (c23678 == null) {
            return;
        }
        HashMap map = c23678.f76781;
        String str = this.f9197;
        IBinder iBinder = this.f9195;
        if (iBinder == null) {
            map.remove(str);
            return;
        }
        List list = (List) map.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == ((C2310) it.next()).f7473) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                map.remove(str);
            }
        }
    }
}
