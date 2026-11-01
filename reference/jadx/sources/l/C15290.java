package l;

import com.alipay.sdk.m.y.q;
import java.io.DataInputStream;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܶܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7CX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15290 extends AbstractC22428 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18111 f49823;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15290(C18111 c18111, DataInputStream dataInputStream) {
        super(dataInputStream);
        this.f49823 = c18111;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m36609() {
        try {
            return this.f73191.charAt(this.f73192);
        } catch (StringIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m36608() {
        String str = this.f73191;
        long j = ((long) this.f73194) << 32;
        int i = this.f73192;
        this.f73193 = j | ((long) i);
        try {
            char cCharAt = str.charAt(i);
            int i2 = this.f73192 + 1;
            this.f73192 = i2;
            if (cCharAt == '\n') {
                this.f73194++;
                return cCharAt;
            }
            if (cCharAt != '\r') {
                return cCharAt;
            }
            if (str.charAt(i2) == '\n') {
                this.f73192++;
            }
            this.f73194++;
            return cCharAt;
        } catch (StringIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36607() {
        char cCharAt;
        C18111 c18111 = this.f49823;
        String str = this.f73191;
        while (true) {
            try {
                cCharAt = str.charAt(this.f73192);
                if (cCharAt != 'u') {
                    break;
                }
                this.f73192++;
            } catch (StringIndexOutOfBoundsException unused) {
                c18111.mo2149(this.f73193, "Invalid escape character", new Object[0]);
                return -1;
            }
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            switch (cCharAt) {
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
                    i = ((i << 4) + cCharAt) - 48;
                    continue;
                    int i3 = this.f73192 + 1;
                    this.f73192 = i3;
                    cCharAt = str.charAt(i3);
                    break;
                default:
                    switch (cCharAt) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                            i = (((i << 4) + 10) + cCharAt) - 65;
                            continue;
                            int i4 = this.f73192 + 1;
                            this.f73192 = i4;
                            cCharAt = str.charAt(i4);
                            break;
                        default:
                            switch (cCharAt) {
                                case 'a':
                                case 'b':
                                case q.f /* 99 */:
                                case 'd':
                                case 'e':
                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    i = (((i << 4) + 10) + cCharAt) - 97;
                                    continue;
                                    continue;
                                    continue;
                                    int i5 = this.f73192 + 1;
                                    this.f73192 = i5;
                                    cCharAt = str.charAt(i5);
                                    break;
                                default:
                                    c18111.mo2149(this.f73193, "Invalid escape character", new Object[0]);
                                    return i;
                            }
                            break;
                    }
                    break;
            }
            c18111.mo2149(this.f73193, "Invalid escape character", new Object[0]);
            return -1;
        }
        return i;
    }
}
