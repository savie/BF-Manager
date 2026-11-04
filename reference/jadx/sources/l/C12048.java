package l;

import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X960 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12048 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float[] f38815 = new float[20];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long[] f38814 = new long[20];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f38817 = 0.0f;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f38816 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38813 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30227(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        int i = this.f38816;
        long[] jArr = this.f38814;
        if (i != 0 && eventTime - jArr[this.f38813] > 40) {
            this.f38816 = 0;
            this.f38817 = 0.0f;
        }
        int i2 = (this.f38813 + 1) % 20;
        this.f38813 = i2;
        int i3 = this.f38816;
        if (i3 != 20) {
            this.f38816 = i3 + 1;
        }
        this.f38815[i2] = motionEvent.getAxisValue(26);
        jArr[this.f38813] = eventTime;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m30225(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.f38817;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30226() {
        long j;
        int i = this.f38816;
        float fSqrt = 0.0f;
        if (i >= 2) {
            int i2 = this.f38813;
            int i3 = ((i2 + 20) - (i - 1)) % 20;
            long[] jArr = this.f38814;
            long j2 = jArr[i2];
            while (true) {
                j = jArr[i3];
                if (j2 - j <= 100) {
                    break;
                }
                this.f38816--;
                i3 = (i3 + 1) % 20;
            }
            int i4 = this.f38816;
            if (i4 >= 2) {
                float[] fArr = this.f38815;
                if (i4 == 2) {
                    int i5 = (i3 + 1) % 20;
                    long j3 = jArr[i5];
                    if (j != j3) {
                        fSqrt = fArr[i5] / (j3 - j);
                    }
                } else {
                    int i6 = 0;
                    int i7 = 0;
                    float fAbs = 0.0f;
                    while (true) {
                        if (i6 >= this.f38816 - 1) {
                            break;
                        }
                        int i8 = i6 + i3;
                        long j4 = jArr[i8 % 20];
                        int i9 = (i8 + 1) % 20;
                        if (jArr[i9] != j4) {
                            i7++;
                            float fSqrt2 = (fAbs < fSqrt ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f = fArr[i9] / (jArr[i9] - j4);
                            fAbs += Math.abs(f) * (f - fSqrt2);
                            if (i7 == 1) {
                                fAbs *= 0.5f;
                            }
                        }
                        i6++;
                        fSqrt = 0.0f;
                    }
                    fSqrt = (fAbs < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
        }
        float f2 = fSqrt * 1000;
        this.f38817 = f2;
        if (f2 < (-Math.abs(Float.MAX_VALUE))) {
            this.f38817 = -Math.abs(Float.MAX_VALUE);
        } else if (this.f38817 > Math.abs(Float.MAX_VALUE)) {
            this.f38817 = Math.abs(Float.MAX_VALUE);
        }
    }
}
