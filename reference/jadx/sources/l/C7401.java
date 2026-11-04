package l;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C7401 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f24380 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C8892 f24383;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9086 f24382 = new C9086();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f24381 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10383 f24384 = new C10383(this);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f24385 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9637 m20312() {
        if (this.f24383 == null) {
            this.f24383 = new C8892(this.f24384);
        }
        return this.f24383;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20314(AbstractC12292 abstractC12292) {
        this.f24382.remove(abstractC12292);
        ArrayList arrayList = this.f24381;
        int iIndexOf = arrayList.indexOf(abstractC12292);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            this.f24385 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20313(long j) {
        ArrayList arrayList;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = 0;
        while (true) {
            arrayList = this.f24381;
            if (i >= arrayList.size()) {
                break;
            }
            InterfaceC1435 interfaceC1435 = (InterfaceC1435) arrayList.get(i);
            if (interfaceC1435 != null) {
                C9086 c9086 = this.f24382;
                Long l2 = (Long) c9086.get(interfaceC1435);
                if (l2 == null) {
                    interfaceC1435.mo5173(j);
                } else if (l2.longValue() < jUptimeMillis) {
                    c9086.remove(interfaceC1435);
                    interfaceC1435.mo5173(j);
                }
            }
            i++;
        }
        if (!this.f24385) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                this.f24385 = false;
                return;
            }
        }
    }
}
