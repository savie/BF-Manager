package l;

import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23150 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f75148;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19622 f75149;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IBinder f75150;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10450 f75151;

    public RunnableC23150(C19622 c19622, C10450 c10450, String str, IBinder iBinder) {
        this.f75149 = c19622;
        this.f75151 = c10450;
        this.f75148 = str;
        this.f75150 = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11260 c11260 = (C11260) this.f75149.f62983.f68499.getOrDefault(this.f75151.f35674.getBinder(), null);
        if (c11260 == null) {
            return;
        }
        HashMap map = c11260.f38062;
        String str = this.f75148;
        IBinder iBinder = this.f75150;
        if (iBinder == null) {
            map.remove(str);
            return;
        }
        List list = (List) map.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == ((C10946) it.next()).f37217) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                map.remove(str);
            }
        }
    }
}
