package l;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S8QT */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11164 implements InterfaceC1470 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f35155;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16549 f35156;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f35157;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f35158;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15648[] f35159;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f35160;

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۙ */
    public void mo5249(float f) {
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۙ */
    public final void mo5251(boolean z) {
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ boolean mo5253(long j, AbstractC24240 abstractC24240, List list) {
        return false;
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo5255() {
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo5256() {
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ܳ */
    public void mo5258() {
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ᩸ */
    public void mo5261() {
    }

    public AbstractC11164(C16549 c16549, int[] iArr) {
        int i = 0;
        C20782.m47568(iArr.length > 0);
        c16549.getClass();
        this.f35156 = c16549;
        int length = iArr.length;
        this.f35158 = length;
        this.f35159 = new C15648[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f35159[i2] = c16549.m39194(iArr[i2]);
        }
        Arrays.sort(this.f35159, new C22353());
        this.f35157 = new int[this.f35158];
        while (true) {
            int i3 = this.f35158;
            if (i < i3) {
                this.f35157[i] = c16549.m39193(this.f35159[i]);
                i++;
            } else {
                this.f35155 = new long[i3];
                return;
            }
        }
    }

    @Override // l.InterfaceC14147
    /* JADX INFO: renamed from: ᩴ */
    public final C16549 mo17236() {
        return this.f35156;
    }

    @Override // l.InterfaceC14147
    public final int length() {
        return this.f35157.length;
    }

    @Override // l.InterfaceC14147
    /* JADX INFO: renamed from: ۙ */
    public final C15648 mo17235(int i) {
        return this.f35159[i];
    }

    @Override // l.InterfaceC14147
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9649(int i) {
        return this.f35157[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28108(C15648 c15648) {
        for (int i = 0; i < this.f35158; i++) {
            if (this.f35159[i] == c15648) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC14147
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.f35158; i2++) {
            if (this.f35157[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۚ */
    public final C15648 mo5254() {
        return this.f35159[mo5247()];
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۫ */
    public final int mo5257() {
        return this.f35157[mo5247()];
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۙ */
    public int mo5248(long j, List list) {
        return list.size();
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo5260(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo5252 = mo5252(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f35158 && !zMo5252) {
            zMo5252 = (i2 == i || mo5252(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zMo5252) {
            return false;
        }
        long[] jArr = this.f35155;
        long j2 = jArr[i];
        String str = C7116.f23455;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = C25227.FOREVER_NS;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // l.InterfaceC1470
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5252(int i, long j) {
        return this.f35155[i] > j;
    }

    public final int hashCode() {
        if (this.f35160 == 0) {
            this.f35160 = Arrays.hashCode(this.f35157) + (System.identityHashCode(this.f35156) * 31);
        }
        return this.f35160;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC11164 abstractC11164 = (AbstractC11164) obj;
            if (this.f35156.equals(abstractC11164.f35156) && Arrays.equals(this.f35157, abstractC11164.f35157)) {
                return true;
            }
        }
        return false;
    }
}
