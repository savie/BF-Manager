package l;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19511 extends AbstractC11164 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f62959;

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ֫ */
    public final int mo5246() {
        return 0;
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo5259() {
        return null;
    }

    public C19511(C16549 c16549, int[] iArr) {
        super(c16549, iArr);
        this.f62959 = m28108(c16549.m39194(iArr[0]));
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۙ */
    public final void mo5250(long j, long j2, long j3, List list, InterfaceC18272[] interfaceC18272Arr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (mo5252(this.f62959, jElapsedRealtime)) {
            int i = this.f35158;
            do {
                i--;
                if (i < 0) {
                    throw new IllegalStateException();
                }
            } while (mo5252(i, jElapsedRealtime));
            this.f62959 = i;
        }
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۙ */
    public final int mo5247() {
        return this.f62959;
    }
}
