package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;

/* JADX INFO: renamed from: l.᩹۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7WV */
/* JADX INFO: loaded from: classes.dex */
public final class C22310 extends AbstractC7848 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static Hashtable f72852 = new Hashtable();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Hashtable f72853 = new Hashtable();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72856 = true;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Socket f72855 = null;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public byte[] f72854 = new byte[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49475(C3073 c3073) {
        Hashtable hashtable = f72853;
        synchronized (hashtable) {
            hashtable.remove(c3073);
            f72852.remove(c3073);
        }
    }

    public C22310() {
        this.f25812 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f25819 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f25810 = 16384;
        byte[] bArr = C8491.f29422;
        this.f25817 = C8491.m22175("x11", StandardCharsets.UTF_8);
        this.f25818 = true;
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ᩺ */
    public final void mo19047() {
        C7930 c7930;
        InputStream inputStream;
        try {
            Socket socketM22172 = C8491.m22172(6000, 10000, "127.0.0.1");
            this.f72855 = socketM22172;
            socketM22172.setTcpNoDelay(true);
            C7930 c7931 = new C7930();
            this.f25826 = c7931;
            c7931.f26044 = this.f72855.getInputStream();
            this.f25826.f26045 = this.f72855.getOutputStream();
            m20742();
            this.f25824 = Thread.currentThread();
            C14904 c14904 = new C14904(this.f25822);
            C7307 c7307 = new C7307(c14904);
            try {
                C3073 c3073M20728 = m20728();
                while (this.f25824 != null && (c7930 = this.f25826) != null && (inputStream = c7930.f26044) != null) {
                    byte[] bArr = c14904.f48679;
                    int i = inputStream.read(bArr, 14, (bArr.length - 14) - c3073M20728.m9243());
                    if (i <= 0) {
                        m20736();
                        break;
                    }
                    if (this.f25813) {
                        break;
                    }
                    c7307.m19501();
                    c14904.m35630((byte) 94);
                    c14904.m35644(this.f25821);
                    c14904.m35644(i);
                    c14904.m35639(i);
                    c3073M20728.m9237(c7307, this, i);
                }
            } catch (Exception unused) {
            }
            m20737();
        } catch (Exception unused2) {
            m20741();
            this.f25813 = true;
            m20737();
        }
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ۙ */
    public final void mo20734(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        if (this.f72856) {
            try {
                C3073 c3073M20728 = m20728();
                byte[] bArr3 = this.f72854;
                int length = bArr3.length + i2;
                byte[] bArr4 = new byte[length];
                System.arraycopy(bArr, i, bArr4, bArr3.length, i2);
                byte[] bArr5 = this.f72854;
                if (bArr5.length > 0) {
                    System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
                }
                this.f72854 = bArr4;
                if (length < 9) {
                    return;
                }
                int i3 = ((bArr4[6] & 255) * 256) + (bArr4[7] & 255);
                int i4 = ((bArr4[8] & 255) * 256) + (bArr4[9] & 255);
                int i5 = bArr4[0] & 255;
                if (i5 != 66 && i5 == 108) {
                    i3 = ((i3 << 8) & 65280) | ((i3 >>> 8) & 255);
                    i4 = ((i4 << 8) & 65280) | ((i4 >>> 8) & 255);
                }
                int i6 = i4;
                int i7 = i3 + 12 + ((-i3) & 3);
                if (length < i7 + i6) {
                    return;
                }
                byte[] bArr6 = new byte[i6];
                System.arraycopy(bArr4, i7, bArr6, 0, i6);
                Hashtable hashtable = f72852;
                synchronized (hashtable) {
                    bArr2 = (byte[]) hashtable.get(c3073M20728);
                }
                if (i6 != bArr2.length) {
                    this.f25824 = null;
                    m20736();
                    this.f25826.m20932();
                    m20737();
                    break;
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    if (bArr6[i8] != bArr2[i8]) {
                        this.f25824 = null;
                        m20736();
                        this.f25826.m20932();
                        m20737();
                        break;
                    }
                }
                this.f72856 = false;
                C7930 c7930 = this.f25826;
                c7930.f26045.write(bArr4, 0, length);
                c7930.f26045.flush();
                this.f72854 = null;
                return;
            } catch (C5813 e) {
                throw new IOException(e.toString(), e);
            }
        }
        C7930 c7931 = this.f25826;
        c7931.f26045.write(bArr, i, i2);
        c7931.f26045.flush();
    }
}
