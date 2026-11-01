package l;

import android.util.Base64DataException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Base32Encoder;

/* JADX INFO: renamed from: l.ܽۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16367 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f52673;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f52674;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence f52675;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f52676;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5614 f52677;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f52678;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52679;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f52680;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C16367(CharSequence charSequence, InterfaceC5614 interfaceC5614) {
        this.f52675 = charSequence;
        this.f52677 = interfaceC5614;
        this.f52673 = charSequence.length();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws C1105, Base64DataException {
        int i3;
        int i4;
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i5 = 0;
        while (i5 < i2) {
            int i6 = this.f52678;
            if (i6 > 0) {
                i3 = i5 + 1;
                bArr[i5 + i] = Base32Encoder.DEFAULT_PADDING;
                this.f52678 = i6 - 1;
                this.f52679 = (this.f52679 + 1) & 3;
            } else {
                int i7 = this.f52676;
                if (i7 < this.f52673) {
                    C23423.m51588(i7, this.f52677);
                    int i8 = this.f52676;
                    this.f52676 = i8 + 1;
                    char cCharAt = this.f52675.charAt(i8);
                    if ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '+' || cCharAt == '/' || cCharAt == '='))) {
                        i3 = i5 + 1;
                        bArr[i5 + i] = (byte) cCharAt;
                        this.f52679 = (this.f52679 + 1) & 3;
                        this.f52674 |= cCharAt == '=';
                    }
                } else {
                    if (this.f52680) {
                        break;
                    }
                    this.f52680 = true;
                    if (this.f52674 || (i4 = this.f52679) == 0) {
                        break;
                    }
                    if (i4 == 1) {
                        throw new Base64DataException("Invalid Base64 input length");
                    }
                    this.f52678 = 4 - i4;
                }
            }
            i5 = i3;
        }
        if (i5 == 0) {
            return -1;
        }
        return i5;
    }
}
