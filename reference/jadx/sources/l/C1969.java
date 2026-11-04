package l;

import com.umeng.analytics.pro.d;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.֫ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7UY */
/* JADX INFO: loaded from: classes3.dex */
public class C1969 extends AbstractC8375 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static byte[] f6605;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f6611 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f6609 = "vt100";

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f6607 = 80;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6610 = 24;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f6606 = 640;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f6608 = 480;

    static {
        byte[] bArr = C9011.f29358;
        f6605 = C9011.m24055(d.aw, StandardCharsets.UTF_8);
    }

    public C1969() {
        this.f27474 = f6605;
        this.f27476 = new C8878();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m6776() {
        C15723 c15723M22542 = m22542();
        if (this.f6611) {
            C14977 c14977 = new C14977();
            c14977.m36039(this.f6609);
            c14977.m36038(this.f6607, this.f6610, this.f6606, this.f6608);
            c14977.mo15880(c15723M22542, this);
        }
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo6777() {
        C8878 c8878;
        InputStream inputStream;
        C9866 c9866 = new C9866(this.f27477);
        C14010 c14010 = new C14010(c9866);
        try {
            C15723 c15723M22542 = m22542();
            while (m22541() && this.f27481 != null && (c8878 = this.f27476) != null && (inputStream = c8878.f29002) != null) {
                byte[] bArr = c9866.f31750;
                int i = inputStream.read(bArr, 14, (bArr.length - 14) - c15723M22542.m37618());
                if (i != 0) {
                    if (i == -1) {
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
            }
        } catch (Exception unused) {
        }
        Thread thread = this.f27481;
        if (thread != null) {
            synchronized (thread) {
                thread.notifyAll();
            }
        }
        this.f27481 = null;
    }
}
