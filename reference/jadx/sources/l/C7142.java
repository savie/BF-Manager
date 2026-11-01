package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۟֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7W4 */
/* JADX INFO: loaded from: classes3.dex */
public class C7142 extends AbstractC7848 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f23877;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f23878;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23880;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f23881 = "127.0.0.1";

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f23879 = 0;

    static {
        byte[] bArr = C8491.f29422;
        f23877 = C8491.m22175("direct-tcpip", StandardCharsets.UTF_8);
    }

    public C7142() {
        this.f25817 = f23877;
        this.f25812 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f25819 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f25810 = 16384;
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ۬ */
    public final void mo12933() {
        this.f25826 = new C7930();
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19045(int i) throws C5813 {
        this.f25820 = 0;
        try {
            C3073 c3073M20728 = m20728();
            if (!c3073M20728.m9242()) {
                throw new C5813("session is down");
            }
            if (this.f25826.f26044 != null) {
                ThreadFactoryC23536 threadFactoryC23536M9227 = c3073M20728.m9227();
                Runnable runnable = new Runnable() { // from class: l.ۤ֨ᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34070.mo19047();
                    }
                };
                threadFactoryC23536M9227.getClass();
                Thread thread = new Thread(runnable);
                this.f25824 = thread;
                thread.setName("DirectTCPIP thread " + c3073M20728.f11611);
                this.f25824.start();
                return;
            }
            m20740();
        } catch (Exception e) {
            this.f25826.m20932();
            this.f25826 = null;
            C3073 c3073 = this.f25816;
            if (c3073 != null) {
                c3073.m9238(this);
            }
            if (e instanceof C5813) {
                throw ((C5813) e);
            }
        }
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void mo19047() {
        C7930 c7930;
        InputStream inputStream;
        try {
            m20740();
            C14904 c14904 = new C14904(this.f25822);
            C7307 c7307 = new C7307(c14904);
            C3073 c3073M20728 = m20728();
            while (m20735() && this.f25824 != null && (c7930 = this.f25826) != null && (inputStream = c7930.f26044) != null) {
                byte[] bArr = c14904.f48679;
                int i = inputStream.read(bArr, 14, (bArr.length - 14) - c3073M20728.m9243());
                if (i <= 0) {
                    m20736();
                    break;
                }
                c7307.m19501();
                c14904.m35630((byte) 94);
                c14904.m35644(this.f25821);
                c14904.m35644(i);
                c14904.m35639(i);
                synchronized (this) {
                    if (!this.f25813) {
                        c3073M20728.m9237(c7307, this, i);
                    }
                }
                break;
            }
            m20736();
            m20737();
        } catch (Exception unused) {
            if (!this.f25818) {
                this.f25818 = true;
            }
            m20737();
        }
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7307 mo19046() {
        C14904 c14904 = new C14904(this.f23881.length() + this.f23878.length() + 50 + this.f25816.m9243());
        C7307 c7307 = new C7307(c14904);
        c7307.m19501();
        c14904.m35630((byte) 90);
        c14904.m35627(this.f25817);
        c14904.m35644(this.f25814);
        c14904.m35644(this.f25819);
        c14904.m35644(this.f25810);
        String str = this.f23878;
        Charset charset = StandardCharsets.UTF_8;
        c14904.m35627(C8491.m22175(str, charset));
        c14904.m35644(this.f23880);
        c14904.m35627(C8491.m22175(this.f23881, charset));
        c14904.m35644(this.f23879);
        return c7307;
    }
}
