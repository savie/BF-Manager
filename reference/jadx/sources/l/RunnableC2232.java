package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB30 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2232 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f8013;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f8014;

    public RunnableC2232(List list, int i, Throwable th) {
        C9535.m24383(list, "initCallbacks cannot be null");
        this.f8013 = new ArrayList(list);
        this.f8014 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f8013;
        int size = arrayList.size();
        int i = 0;
        if (this.f8014 != 1) {
            while (i < size) {
                ((AbstractC11406) arrayList.get(i)).mo28509();
                i++;
            }
        } else {
            while (i < size) {
                ((AbstractC11406) arrayList.get(i)).mo28510();
                i++;
            }
        }
    }
}
