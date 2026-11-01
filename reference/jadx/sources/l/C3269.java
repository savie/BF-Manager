package l;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C3269 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f12130 = new ThreadLocal();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9621 f12133;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12274 f12134 = new C12274();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12132 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11032 f12135 = new C11032(this);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f12131 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14560 m9748() {
        if (this.f12133 == null) {
            this.f12133 = new C9621(this.f12135);
        }
        return this.f12133;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9750(AbstractC10264 abstractC10264) {
        this.f12134.remove(abstractC10264);
        ArrayList arrayList = this.f12132;
        int iIndexOf = arrayList.indexOf(abstractC10264);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            this.f12131 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9749(long j) {
        ArrayList arrayList;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = 0;
        while (true) {
            arrayList = this.f12132;
            if (i >= arrayList.size()) {
                break;
            }
            InterfaceC23732 interfaceC23732 = (InterfaceC23732) arrayList.get(i);
            if (interfaceC23732 != null) {
                C12274 c12274 = this.f12134;
                Long l2 = (Long) c12274.getOrDefault(interfaceC23732, null);
                if (l2 == null) {
                    interfaceC23732.mo26051(j);
                } else if (l2.longValue() < jUptimeMillis) {
                    c12274.remove(interfaceC23732);
                    interfaceC23732.mo26051(j);
                }
            }
            i++;
        }
        if (!this.f12131) {
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
                this.f12131 = false;
                return;
            }
        }
    }
}
