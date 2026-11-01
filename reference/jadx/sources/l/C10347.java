package l;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.ۤܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10347 extends AbstractC19176 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f35482;

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۘ */
    public final int mo17785() {
        return 0;
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ܰ */
    public final Object mo17796() {
        return null;
    }

    public C10347(C17216 c17216, int[] iArr) {
        super(c17216, iArr);
        this.f35482 = m44003(c17216.m40159(iArr[0]));
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۙ */
    public final void mo17789(long j, long j2, long j3, List list, InterfaceC2241[] interfaceC2241Arr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (mo17791(this.f35482, jElapsedRealtime)) {
            int i = this.f61925;
            do {
                i--;
                if (i < 0) {
                    throw new IllegalStateException();
                }
            } while (mo17791(i, jElapsedRealtime));
            this.f35482 = i;
        }
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۙ */
    public final int mo17786() {
        return this.f35482;
    }
}
