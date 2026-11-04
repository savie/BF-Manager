package l;

import android.os.Bundle;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۜܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 36NN */
/* JADX INFO: loaded from: classes3.dex */
public final class C7239 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CharSequence f23871;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13950 f23872;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f23873;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19304 f23874;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f23875;

    public C7239(C13950 c13950, int i, CharSequence charSequence, C19304 c19304) {
        this.f23872 = c13950;
        this.f23873 = i;
        this.f23871 = charSequence;
        this.f23874 = c19304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19855(Writer writer) {
        int i = 0;
        while (true) {
            C13950 c13950 = this.f23872;
            if (i >= c13950.m34016()) {
                return;
            }
            if (i == this.f23873) {
                m19852(writer, this.f23871);
            } else {
                C15508 c15508M34010 = c13950.m34010(i, this.f23874);
                try {
                    m19852(writer, c15508M34010);
                    c15508M34010.close();
                } catch (Throwable th) {
                    try {
                        c15508M34010.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19856() {
        for (int i = 0; i < this.f23872.m34016(); i++) {
            if (i != this.f23873) {
                synchronized (this.f23872) {
                    if (this.f23872.f44238[i]) {
                        InterfaceC24329 interfaceC24329M34020 = this.f23872.m34020(i);
                        C19304 c19304 = this.f23874;
                        C16320 c16320M38711 = C16320.m38711(interfaceC24329M34020, c19304.f62382, c19304.f62383, c19304.f62384, 8388608, new C8730(), (String) null);
                        try {
                            c16320M38711.f52980.mo11051(false);
                            Bundle bundleM11509 = c16320M38711.f52984.f63046.f41124.m11509();
                            bundleM11509.putBoolean("changed", false);
                            C7305 c7305M41121 = c16320M38711.f52980.mo11043().m41121();
                            try {
                                C19547 c19547 = c16320M38711.f52984;
                                C10596 c10596M31877 = c19547.f63046.m31877(c7305M41121, bundleM11509, c19547.f63045, this.f23872.m34021(), true);
                                c7305M41121.close();
                                this.f23872.m34020(i);
                                c16320M38711.m38733(bundleM11509, c16320M38711.f52984.f63045, c10596M31877, this.f23874, new C8730());
                                c16320M38711.m38730(c16320M38711.f52980.mo11043().m41105()).m52947();
                                c16320M38711.m38744().m52947();
                            } catch (Throwable th) {
                                try {
                                    c7305M41121.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            c16320M38711.m38744().m52947();
                            throw th3;
                        }
                    }
                }
            }
        }
        synchronized (this.f23872.f44244) {
            synchronized (this.f23872) {
                for (int i2 = 0; i2 < this.f23872.m34016(); i2++) {
                    if (i2 != this.f23873) {
                        this.f23872.f44238[i2] = false;
                    }
                }
                this.f23872.f44240.putBoolean("changed", this.f23872.f44238[this.f23873]);
            }
            this.f23872.m34003();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m19853() {
        return this.f23873;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15508 m19854(int i) {
        if (i == this.f23873) {
            throw new IllegalArgumentException("Active page already has a captured read");
        }
        return this.f23872.m34010(i, this.f23874);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19852(Writer writer, CharSequence charSequence) throws IOException {
        char[] cArr = new char[32768];
        int i = 0;
        while (i < charSequence.length()) {
            int iMin = Math.min(32768, charSequence.length() - i);
            for (int i2 = 0; i2 < iMin; i2++) {
                cArr[i2] = charSequence.charAt(i + i2);
            }
            writer.write(cArr, 0, iMin);
            i += iMin;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f23872) {
            if (this.f23875) {
                return;
            }
            this.f23875 = true;
            this.f23872.f44241--;
            if (this.f23872.f44241 == 0) {
                this.f23872.f44245.m52935((Object) null);
            }
        }
    }
}
