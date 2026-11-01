package l;

import com.umeng.analytics.pro.d;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܿ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7UY */
/* JADX INFO: loaded from: classes4.dex */
public class C17020 extends AbstractC7848 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static byte[] f54376;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f54378 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f54377 = "vt100";

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f54382 = 80;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f54381 = 24;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f54380 = 640;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f54379 = 480;

    static {
        byte[] bArr = C8491.f29422;
        f54376 = C8491.m22175(d.aw, StandardCharsets.UTF_8);
    }

    public C17020() {
        this.f25817 = f54376;
        this.f25826 = new C7930();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m39788() {
        C3073 c3073M20728 = m20728();
        if (this.f54378) {
            C12247 c12247 = new C12247();
            c12247.m30455(this.f54377);
            c12247.m30454(this.f54382, this.f54381, this.f54380, this.f54379);
            c12247.mo1688(c3073M20728, this);
        }
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ᩺ */
    public final void mo19047() {
        C7930 c7930;
        InputStream inputStream;
        C14904 c14904 = new C14904(this.f25822);
        C7307 c7307 = new C7307(c14904);
        try {
            C3073 c3073M20728 = m20728();
            while (m20735() && this.f25824 != null && (c7930 = this.f25826) != null && (inputStream = c7930.f26044) != null) {
                byte[] bArr = c14904.f48679;
                int i = inputStream.read(bArr, 14, (bArr.length - 14) - c3073M20728.m9243());
                if (i != 0) {
                    if (i == -1) {
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
            }
        } catch (Exception unused) {
        }
        Thread thread = this.f25824;
        if (thread != null) {
            synchronized (thread) {
                thread.notifyAll();
            }
        }
        this.f25824 = null;
    }
}
