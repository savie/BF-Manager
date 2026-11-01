package l;

import com.alipay.sdk.m.y.q;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩸ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X9ZK */
/* JADX INFO: loaded from: classes5.dex */
public final class C21659 extends AbstractC23777 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final char[] f70215 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public short f70216;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte f70217;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f70218;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f70219;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f70220;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public short f70221;

    public C21659(String str) {
        char[] charArray = str.toCharArray();
        this.f70218 = m48369(charArray, 0, 8);
        this.f70221 = (short) (m48369(charArray, 9, 4) & 65535);
        this.f70216 = (short) (m48369(charArray, 14, 4) & 65535);
        this.f70217 = (byte) (m48369(charArray, 19, 2) & 255);
        this.f70220 = (byte) (m48369(charArray, 21, 2) & 255);
        byte[] bArr = new byte[6];
        this.f70219 = bArr;
        bArr[0] = (byte) (m48369(charArray, 24, 2) & 255);
        this.f70219[1] = (byte) (m48369(charArray, 26, 2) & 255);
        this.f70219[2] = (byte) (m48369(charArray, 28, 2) & 255);
        this.f70219[3] = (byte) (m48369(charArray, 30, 2) & 255);
        this.f70219[4] = (byte) (m48369(charArray, 32, 2) & 255);
        this.f70219[5] = (byte) (m48369(charArray, 34, 2) & 255);
    }

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ܰ */
    public final void mo2371(C17426 c17426) {
        c17426.m40631(4);
        c17426.m40622(this.f70218);
        c17426.m40627(this.f70221);
        c17426.m40627(this.f70216);
        c17426.m40632(this.f70217);
        c17426.m40632(this.f70220);
        int i = c17426.f55443;
        c17426.m40624(6);
        C17426 c17426M40629 = c17426.m40629(i);
        for (int i2 = 0; i2 < 6; i2++) {
            c17426M40629.m40632(this.f70219[i2]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48369(char[] cArr, int i, int i2) {
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

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ۙ */
    public final void mo2370(C17426 c17426) {
        c17426.m40631(4);
        this.f70218 = c17426.m40623();
        this.f70221 = (short) c17426.m40630();
        this.f70216 = (short) c17426.m40630();
        this.f70217 = (byte) c17426.m40628();
        this.f70220 = (byte) c17426.m40628();
        int i = c17426.f55443;
        c17426.m40624(6);
        if (this.f70219 == null) {
            this.f70219 = new byte[6];
        }
        C17426 c17426M40629 = c17426.m40629(i);
        for (int i2 = 0; i2 < 6; i2++) {
            this.f70219[i2] = (byte) c17426M40629.m40628();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48370(int i, int i2) {
        char[] cArr = new char[i2];
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                cArr[i3] = f70215[i & 15];
                i >>>= 4;
                i2 = i3;
            } else {
                return new String(cArr);
            }
        }
    }

    public final String toString() {
        return m48370(this.f70218, 8) + '-' + m48370(this.f70221, 4) + '-' + m48370(this.f70216, 4) + '-' + m48370(this.f70217, 2) + m48370(this.f70220, 2) + '-' + m48370(this.f70219[0], 2) + m48370(this.f70219[1], 2) + m48370(this.f70219[2], 2) + m48370(this.f70219[3], 2) + m48370(this.f70219[4], 2) + m48370(this.f70219[5], 2);
    }
}
