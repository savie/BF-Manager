package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8LG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3693 implements InterfaceC6599 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long[] f13474;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f13475;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f13476;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f13477;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long[] f13478;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long[] f13479;

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return true;
    }

    public C3693(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f13476 = iArr;
        this.f13474 = jArr;
        this.f13478 = jArr2;
        this.f13479 = jArr3;
        int length = iArr.length;
        this.f13477 = length;
        if (length > 0) {
            this.f13475 = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f13475 = 0L;
        }
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        long[] jArr = this.f13479;
        int iM41855 = C17983.m41855(jArr, j, true);
        long j2 = jArr[iM41855];
        long[] jArr2 = this.f13474;
        C22828 c22828 = new C22828(j2, jArr2[iM41855]);
        if (j2 >= j || iM41855 == this.f13477 - 1) {
            return new C12950(c22828, c22828);
        }
        int i = iM41855 + 1;
        return new C12950(c22828, new C22828(jArr[i], jArr2[i]));
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f13475;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f13477 + ", sizes=" + Arrays.toString(this.f13476) + ", offsets=" + Arrays.toString(this.f13474) + ", timeUs=" + Arrays.toString(this.f13479) + ", durationsUs=" + Arrays.toString(this.f13478) + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
