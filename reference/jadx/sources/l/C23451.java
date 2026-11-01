package l;

import java.nio.ByteOrder;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩻ۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08IU */
/* JADX INFO: loaded from: classes.dex */
public final class C23451 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f75948;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f75949;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f75950;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f75951;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f75952;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f75953;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f75954;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f75955;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f75956;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f75957;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0987 f75958;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C10751 f75959;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51683(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m51684(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public C23451(byte[] bArr, int i) {
        C11634 c11634 = new C11634(bArr, bArr.length);
        c11634.m29029(i * 8);
        this.f75948 = c11634.m29039(16);
        this.f75949 = c11634.m29039(16);
        this.f75955 = c11634.m29039(24);
        this.f75952 = c11634.m29039(24);
        int iM29039 = c11634.m29039(20);
        this.f75950 = iM29039;
        this.f75953 = m51684(iM29039);
        this.f75954 = c11634.m29039(3) + 1;
        int iM290310 = c11634.m29039(5) + 1;
        this.f75951 = iM290310;
        this.f75956 = m51683(iM290310);
        this.f75957 = c11634.m29037(36);
        this.f75959 = null;
        this.f75958 = null;
    }

    public C23451(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C10751 c10751, C0987 c0987) {
        this.f75948 = i;
        this.f75949 = i2;
        this.f75955 = i3;
        this.f75952 = i4;
        this.f75950 = i5;
        this.f75953 = m51684(i5);
        this.f75954 = i6;
        this.f75951 = i7;
        this.f75956 = m51683(i7);
        this.f75957 = j;
        this.f75959 = c10751;
        this.f75958 = c0987;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m51685() {
        long j = this.f75957;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f75950);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648 m51686(byte[] bArr, C0987 c0987) {
        bArr[4] = GCMSIVBlockCipher.MASK;
        int i = this.f75952;
        if (i <= 0) {
            i = -1;
        }
        C0987 c0988 = this.f75958;
        if (c0988 != null) {
            c0987 = c0988.m3791(c0987);
        }
        C10471 c10471 = new C10471();
        c10471.m26533("audio/flac");
        c10471.m26531(i);
        c10471.m26494(this.f75954);
        c10471.m26511(this.f75950);
        String str = C17983.f57504;
        c10471.m26512(C17983.m41816(this.f75951, ByteOrder.LITTLE_ENDIAN));
        c10471.m26503(Collections.singletonList(bArr));
        c10471.m26504(c0987);
        return c10471.m26497();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23451 m51688(C10751 c10751) {
        return new C23451(this.f75948, this.f75949, this.f75955, this.f75952, this.f75950, this.f75954, this.f75951, this.f75957, c10751, this.f75958);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23451 m51689(List list) {
        C0987 c0987M37513 = C15773.m37513(list);
        C0987 c0987 = this.f75958;
        if (c0987 != null) {
            c0987M37513 = c0987.m3791(c0987M37513);
        }
        C0987 c0988 = c0987M37513;
        return new C23451(this.f75948, this.f75949, this.f75955, this.f75952, this.f75950, this.f75954, this.f75951, this.f75957, this.f75959, c0988);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23451 m51687(List list) {
        C0987 c0987 = new C0987(list);
        C0987 c0988 = this.f75958;
        if (c0988 != null) {
            c0987 = c0988.m3791(c0987);
        }
        C0987 c0989 = c0987;
        return new C23451(this.f75948, this.f75949, this.f75955, this.f75952, this.f75950, this.f75954, this.f75951, this.f75957, this.f75959, c0989);
    }
}
