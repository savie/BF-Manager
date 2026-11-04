package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩷ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7W4 */
/* JADX INFO: loaded from: classes.dex */
public class C22106 extends AbstractC8375 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f71246;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f71247 = "127.0.0.1";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f71248 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f71249;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f71250;

    static {
        byte[] bArr = C9011.f29358;
        f71246 = C9011.m24055("direct-tcpip", StandardCharsets.UTF_8);
    }

    public C22106() {
        this.f27474 = f71246;
        this.f27468 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f27471 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f27475 = 16384;
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ۚ */
    public final void mo13414() {
        this.f27476 = new C8878();
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ۙ */
    public final void mo22538(int i) {
        this.f27482 = 0;
        try {
            C15723 c15723M22542 = m22542();
            if (!c15723M22542.m37620()) {
                throw new C2079("session is down");
            }
            if (this.f27476.f29002 != null) {
                ThreadFactoryC11248 threadFactoryC11248M37621 = c15723M22542.m37621();
                Runnable runnable = new Runnable() { // from class: l.ۙܰܶ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17240.mo6777();
                    }
                };
                threadFactoryC11248M37621.getClass();
                Thread thread = new Thread(runnable);
                this.f27481 = thread;
                thread.setName("DirectTCPIP thread " + c15723M22542.f51092);
                this.f27481.start();
                return;
            }
            m22545();
        } catch (Exception e) {
            this.f27476.m23757();
            this.f27476 = null;
            C15723 c15723 = this.f27469;
            if (c15723 != null) {
                c15723.m37612(this);
            }
            if (e instanceof C2079) {
                throw ((C2079) e);
            }
        }
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ᩻ */
    public final void mo6777() {
        C8878 c8878;
        InputStream inputStream;
        try {
            m22545();
            C9866 c9866 = new C9866(this.f27477);
            C14010 c14010 = new C14010(c9866);
            C15723 c15723M22542 = m22542();
            while (m22541() && this.f27481 != null && (c8878 = this.f27476) != null && (inputStream = c8878.f29002) != null) {
                byte[] bArr = c9866.f31750;
                int i = inputStream.read(bArr, 14, (bArr.length - 14) - c15723M22542.m37618());
                if (i <= 0) {
                    m22540();
                    break;
                }
                c14010.m34100();
                c9866.m25651((byte) 94);
                c9866.m25669(this.f27478);
                c9866.m25669(i);
                c9866.m25659(i);
                synchronized (this) {
                    if (!this.f27470) {
                        c15723M22542.m37615(c14010, this, i);
                    }
                }
                break;
            }
            m22540();
            m22548();
        } catch (Exception unused) {
            if (!this.f27472) {
                this.f27472 = true;
            }
            m22548();
        }
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ᩴ */
    public C14010 mo22547() {
        C9866 c9866 = new C9866(this.f71247.length() + this.f71250.length() + 50 + this.f27469.m37618());
        C14010 c14010 = new C14010(c9866);
        c14010.m34100();
        c9866.m25651((byte) 90);
        c9866.m25673(this.f27474);
        c9866.m25669(this.f27480);
        c9866.m25669(this.f27471);
        c9866.m25669(this.f27475);
        String str = this.f71250;
        Charset charset = StandardCharsets.UTF_8;
        c9866.m25673(C9011.m24055(str, charset));
        c9866.m25669(this.f71249);
        c9866.m25673(C9011.m24055(this.f71247, charset));
        c9866.m25669(this.f71248);
        return c14010;
    }
}
