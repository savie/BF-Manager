package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8LG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18866 implements InterfaceC9060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f61252;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f61253;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long[] f61254;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f61255;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long[] f61256;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long[] f61257;

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return true;
    }

    public C18866(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f61255 = iArr;
        this.f61257 = jArr;
        this.f61256 = jArr2;
        this.f61254 = jArr3;
        int length = iArr.length;
        this.f61253 = length;
        if (length > 0) {
            this.f61252 = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f61252 = 0L;
        }
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        long[] jArr = this.f61254;
        int iM19505 = C7116.m19505(jArr, j, true);
        long j2 = jArr[iM19505];
        long[] jArr2 = this.f61257;
        C2349 c2349 = new C2349(j2, jArr2[iM19505]);
        if (j2 >= j || iM19505 == this.f61253 - 1) {
            return new C9805(c2349, c2349);
        }
        int i = iM19505 + 1;
        return new C9805(c2349, new C2349(jArr[i], jArr2[i]));
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f61252;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f61253 + ", sizes=" + Arrays.toString(this.f61255) + ", offsets=" + Arrays.toString(this.f61257) + ", timeUs=" + Arrays.toString(this.f61254) + ", durationsUs=" + Arrays.toString(this.f61256) + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
