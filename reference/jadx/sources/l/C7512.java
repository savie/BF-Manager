package l;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.۟ܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8T9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7512 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f24995;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f24996;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15274 f24997;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20013(Handler handler, InterfaceC20918 interfaceC20918) {
        handler.getClass();
        C10335 c10335 = new C10335();
        c10335.f35440 = handler;
        c10335.f35441 = interfaceC20918;
        this.f24995.add(c10335);
    }

    public C7512() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C7512(CopyOnWriteArrayList copyOnWriteArrayList, int i, C15274 c15274) {
        this.f24995 = copyOnWriteArrayList;
        this.f24996 = i;
        this.f24997 = c15274;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7512 m20012(int i, C15274 c15274) {
        return new C7512(this.f24995, i, c15274);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20018(InterfaceC20918 interfaceC20918) {
        CopyOnWriteArrayList<C10335> copyOnWriteArrayList = this.f24995;
        for (C10335 c10335 : copyOnWriteArrayList) {
            if (c10335.f35441 == interfaceC20918) {
                copyOnWriteArrayList.remove(c10335);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20016(C13863 c13863, int i, int i2, C7648 c7648, int i3, Object obj, long j, long j2, int i4) {
        m20014(new C8924(this, c13863, new C13157(i, i2, c7648, i3, obj, C17983.m41856(j), C17983.m41856(j2)), i4));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20019(C13863 c13863, int i, int i2, C7648 c7648, int i3, Object obj, long j, long j2) {
        m20014(new C19507(this, c13863, new C13157(i, i2, c7648, i3, obj, C17983.m41856(j), C17983.m41856(j2))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20015(C13863 c13863, int i, int i2, C7648 c7648, int i3, Object obj, long j, long j2) {
        m20014(new C8218(this, c13863, new C13157(i, i2, c7648, i3, obj, C17983.m41856(j), C17983.m41856(j2))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20017(C13863 c13863, int i, int i2, C7648 c7648, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        m20014(new C18801(this, c13863, new C13157(i, i2, c7648, i3, obj, C17983.m41856(j), C17983.m41856(j2)), iOException, z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20014(InterfaceC1008 interfaceC1008) {
        for (C10335 c10335 : this.f24995) {
            C17983.m41836(c10335.f35440, new RunnableC12217(2, interfaceC1008, c10335.f35441));
        }
    }
}
