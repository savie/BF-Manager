package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;

/* JADX INFO: renamed from: l.ܰܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7WV */
/* JADX INFO: loaded from: classes5.dex */
public final class C14646 extends AbstractC8375 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Hashtable f47916 = new Hashtable();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Hashtable f47917 = new Hashtable();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f47918 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Socket f47919 = null;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f47920 = new byte[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35276(C15723 c15723) {
        Hashtable hashtable = f47917;
        synchronized (hashtable) {
            hashtable.remove(c15723);
            f47916.remove(c15723);
        }
    }

    public C14646() {
        this.f27468 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f27471 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f27475 = 16384;
        byte[] bArr = C9011.f29358;
        this.f27474 = C9011.m24055("x11", StandardCharsets.UTF_8);
        this.f27472 = true;
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ᩻ */
    public final void mo6777() {
        C8878 c8878;
        InputStream inputStream;
        try {
            Socket socketM24052 = C9011.m24052(6000, 10000, "127.0.0.1");
            this.f47919 = socketM24052;
            socketM24052.setTcpNoDelay(true);
            C8878 c8879 = new C8878();
            this.f27476 = c8879;
            c8879.f29002 = this.f47919.getInputStream();
            this.f27476.f29003 = this.f47919.getOutputStream();
            m22546();
            this.f27481 = Thread.currentThread();
            C9866 c9866 = new C9866(this.f27477);
            C14010 c14010 = new C14010(c9866);
            try {
                C15723 c15723M22542 = m22542();
                while (this.f27481 != null && (c8878 = this.f27476) != null && (inputStream = c8878.f29002) != null) {
                    byte[] bArr = c9866.f31750;
                    int i = inputStream.read(bArr, 14, (bArr.length - 14) - c15723M22542.m37618());
                    if (i <= 0) {
                        m22540();
                        break;
                    }
                    if (this.f27470) {
                        break;
                    }
                    c14010.m34100();
                    c9866.m25651((byte) 94);
                    c9866.m25669(this.f27478);
                    c9866.m25669(i);
                    c9866.m25659(i);
                    c15723M22542.m37615(c14010, this, i);
                }
            } catch (Exception unused) {
            }
            m22548();
        } catch (Exception unused2) {
            m22544();
            this.f27470 = true;
            m22548();
        }
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ۙ */
    public final void mo19148(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        if (this.f47918) {
            try {
                C15723 c15723M22542 = m22542();
                byte[] bArr3 = this.f47920;
                int length = bArr3.length + i2;
                byte[] bArr4 = new byte[length];
                System.arraycopy(bArr, i, bArr4, bArr3.length, i2);
                byte[] bArr5 = this.f47920;
                if (bArr5.length > 0) {
                    System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
                }
                this.f47920 = bArr4;
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
                Hashtable hashtable = f47916;
                synchronized (hashtable) {
                    bArr2 = (byte[]) hashtable.get(c15723M22542);
                }
                if (i6 != bArr2.length) {
                    this.f27481 = null;
                    m22540();
                    this.f27476.m23757();
                    m22548();
                    break;
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    if (bArr6[i8] != bArr2[i8]) {
                        this.f27481 = null;
                        m22540();
                        this.f27476.m23757();
                        m22548();
                        break;
                    }
                }
                this.f47918 = false;
                C8878 c8878 = this.f27476;
                c8878.f29003.write(bArr4, 0, length);
                c8878.f29003.flush();
                this.f47920 = null;
                return;
            } catch (C2079 e) {
                throw new IOException(e.toString(), e);
            }
        }
        C8878 c8879 = this.f27476;
        c8879.f29003.write(bArr, i, i2);
        c8879.f29003.flush();
    }
}
