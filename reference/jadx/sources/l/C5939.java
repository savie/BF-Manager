package l;

import android.util.Base64DataException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Base32Encoder;

/* JADX INFO: renamed from: l.ۚ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5939 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f20289;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CharSequence f20290;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f20291;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f20292;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7509 f20293;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f20294;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f20295;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f20296;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C5939(CharSequence charSequence, InterfaceC7509 interfaceC7509) {
        this.f20290 = charSequence;
        this.f20293 = interfaceC7509;
        this.f20294 = charSequence.length();
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
    public final int read(byte[] bArr, int i, int i2) throws Base64DataException, C9446 {
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
            int i6 = this.f20289;
            if (i6 > 0) {
                i3 = i5 + 1;
                bArr[i5 + i] = Base32Encoder.DEFAULT_PADDING;
                this.f20289 = i6 - 1;
                this.f20295 = (this.f20295 + 1) & 3;
            } else {
                int i7 = this.f20291;
                if (i7 < this.f20294) {
                    C17871.m41725(i7, this.f20293);
                    int i8 = this.f20291;
                    this.f20291 = i8 + 1;
                    char cCharAt = this.f20290.charAt(i8);
                    if ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '+' || cCharAt == '/' || cCharAt == '='))) {
                        i3 = i5 + 1;
                        bArr[i5 + i] = (byte) cCharAt;
                        this.f20295 = (this.f20295 + 1) & 3;
                        this.f20292 |= cCharAt == '=';
                    }
                } else {
                    if (this.f20296) {
                        break;
                    }
                    this.f20296 = true;
                    if (this.f20292 || (i4 = this.f20295) == 0) {
                        break;
                    }
                    if (i4 == 1) {
                        throw new Base64DataException("Invalid Base64 input length");
                    }
                    this.f20289 = 4 - i4;
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
