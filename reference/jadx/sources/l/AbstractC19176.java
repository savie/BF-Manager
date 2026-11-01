package l;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8QT */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19176 implements InterfaceC6558 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f61923;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f61924;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f61925;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17216 f61926;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7648[] f61927;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f61928;

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۖ */
    public void mo17784() {
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۙ */
    public void mo17788(float f) {
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۙ */
    public final void mo17790(boolean z) {
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ boolean mo17792(long j, AbstractC3216 abstractC3216, List list) {
        return false;
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ void mo17793() {
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ void mo17794() {
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ᩹ */
    public void mo17798() {
    }

    public AbstractC19176(C17216 c17216, int[] iArr) {
        int i = 0;
        C2023.m6510(iArr.length > 0);
        c17216.getClass();
        this.f61926 = c17216;
        int length = iArr.length;
        this.f61925 = length;
        this.f61927 = new C7648[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f61927[i2] = c17216.m40159(iArr[i2]);
        }
        Arrays.sort(this.f61927, new C7887());
        this.f61928 = new int[this.f61925];
        while (true) {
            int i3 = this.f61925;
            if (i < i3) {
                this.f61928[i] = c17216.m40158(this.f61927[i]);
                i++;
            } else {
                this.f61924 = new long[i3];
                return;
            }
        }
    }

    @Override // l.InterfaceC18553
    /* JADX INFO: renamed from: ۚ */
    public final C17216 mo37959() {
        return this.f61926;
    }

    @Override // l.InterfaceC18553
    public final int length() {
        return this.f61928.length;
    }

    @Override // l.InterfaceC18553
    /* JADX INFO: renamed from: ۙ */
    public final C7648 mo37958(int i) {
        return this.f61927[i];
    }

    @Override // l.InterfaceC18553
    /* JADX INFO: renamed from: ܰ */
    public final int mo36012(int i) {
        return this.f61928[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44003(C7648 c7648) {
        for (int i = 0; i < this.f61925; i++) {
            if (this.f61927[i] == c7648) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC18553
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.f61925; i2++) {
            if (this.f61928[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۬ */
    public final C7648 mo17795() {
        return this.f61927[mo17786()];
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ֨ */
    public final int mo17783() {
        return this.f61928[mo17786()];
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۙ */
    public int mo17787(long j, List list) {
        return list.size();
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo17797(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo17791 = mo17791(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f61925 && !zMo17791) {
            zMo17791 = (i2 == i || mo17791(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zMo17791) {
            return false;
        }
        long[] jArr = this.f61924;
        long j2 = jArr[i];
        String str = C17983.f57504;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = C17492.FOREVER_NS;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // l.InterfaceC6558
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo17791(int i, long j) {
        return this.f61924[i] > j;
    }

    public final int hashCode() {
        if (this.f61923 == 0) {
            this.f61923 = Arrays.hashCode(this.f61928) + (System.identityHashCode(this.f61926) * 31);
        }
        return this.f61923;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC19176 abstractC19176 = (AbstractC19176) obj;
            if (this.f61926.equals(abstractC19176.f61926) && Arrays.equals(this.f61928, abstractC19176.f61928)) {
                return true;
            }
        }
        return false;
    }
}
