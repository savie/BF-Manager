package l;

import com.alipay.sdk.m.y.q;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩷ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9ZK */
/* JADX INFO: loaded from: classes.dex */
public final class C22045 extends AbstractC6383 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final char[] f71093 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte f71094;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f71095;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public short f71096;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f71097;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte f71098;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public short f71099;

    public C22045(String str) {
        char[] charArray = str.toCharArray();
        this.f71097 = m49883(charArray, 0, 8);
        this.f71096 = (short) (m49883(charArray, 9, 4) & 65535);
        this.f71099 = (short) (m49883(charArray, 14, 4) & 65535);
        this.f71094 = (byte) (m49883(charArray, 19, 2) & 255);
        this.f71098 = (byte) (m49883(charArray, 21, 2) & 255);
        byte[] bArr = new byte[6];
        this.f71095 = bArr;
        bArr[0] = (byte) (m49883(charArray, 24, 2) & 255);
        this.f71095[1] = (byte) (m49883(charArray, 26, 2) & 255);
        this.f71095[2] = (byte) (m49883(charArray, 28, 2) & 255);
        this.f71095[3] = (byte) (m49883(charArray, 30, 2) & 255);
        this.f71095[4] = (byte) (m49883(charArray, 32, 2) & 255);
        this.f71095[5] = (byte) (m49883(charArray, 34, 2) & 255);
    }

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6571(C3399 c3399) {
        c3399.m11136(4);
        c3399.m11138(this.f71097);
        c3399.m11134(this.f71096);
        c3399.m11134(this.f71099);
        c3399.m11133(this.f71094);
        c3399.m11133(this.f71098);
        int i = c3399.f11055;
        c3399.m11128(6);
        C3399 c3399M11132 = c3399.m11132(i);
        for (int i2 = 0; i2 < 6; i2++) {
            c3399M11132.m11133(this.f71095[i2]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49883(char[] cArr, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < cArr.length && i4 < i2; i6++) {
            int i7 = i5 << 4;
            char c = cArr[i6];
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                case '8':
                case '9':
                    i3 = c - '0';
                    break;
                default:
                    switch (c) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                            i3 = c - '7';
                            break;
                        default:
                            switch (c) {
                                case 'a':
                                case 'b':
                                case q.f /* 99 */:
                                case 'd':
                                case 'e':
                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    i3 = c - 'W';
                                    break;
                                default:
                                    throw new IllegalArgumentException(new String(cArr, i, i2));
                            }
                            break;
                    }
                    break;
            }
            i5 = i7 + i3;
            i4++;
        }
        return i5;
    }

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ۙ */
    public final void mo6570(C3399 c3399) {
        c3399.m11136(4);
        this.f71097 = c3399.m11127();
        this.f71096 = (short) c3399.m11135();
        this.f71099 = (short) c3399.m11135();
        this.f71094 = (byte) c3399.m11131();
        this.f71098 = (byte) c3399.m11131();
        int i = c3399.f11055;
        c3399.m11128(6);
        if (this.f71095 == null) {
            this.f71095 = new byte[6];
        }
        C3399 c3399M11132 = c3399.m11132(i);
        for (int i2 = 0; i2 < 6; i2++) {
            this.f71095[i2] = (byte) c3399M11132.m11131();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49884(int i, int i2) {
        char[] cArr = new char[i2];
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                cArr[i3] = f71093[i & 15];
                i >>>= 4;
                i2 = i3;
            } else {
                return new String(cArr);
            }
        }
    }

    public final String toString() {
        return m49884(this.f71097, 8) + '-' + m49884(this.f71096, 4) + '-' + m49884(this.f71099, 4) + '-' + m49884(this.f71094, 2) + m49884(this.f71098, 2) + '-' + m49884(this.f71095[0], 2) + m49884(this.f71095[1], 2) + m49884(this.f71095[2], 2) + m49884(this.f71095[3], 2) + m49884(this.f71095[4], 2) + m49884(this.f71095[5], 2);
    }
}
