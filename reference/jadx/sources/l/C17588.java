package l;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V742 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17588 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C8417 f55896;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16178 f55897;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC15785 f55898;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Uri f55899;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14767 f55900;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f55901;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f55902;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f55903;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C12257 f55904;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f55905;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f55906;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f55907;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f55908 = false;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C2065 f55909;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f55910;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f55911;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f55912;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f55913;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f55914;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C12257 f55915;

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        interfaceC19706.getClass();
        this.f55914.mo11161(interfaceC19706);
        this.f55902.mo11161(interfaceC19706);
    }

    public C17588(InterfaceC16178 interfaceC16178, InterfaceC15785 interfaceC15785, InterfaceC15785 interfaceC15786, C16883 c16883, InterfaceC14767 interfaceC14767, int i, boolean z) {
        this.f55897 = interfaceC16178;
        this.f55914 = interfaceC15786;
        this.f55900 = interfaceC14767;
        this.f55911 = (i & 2) != 0;
        this.f55910 = false;
        this.f55903 = z;
        if (interfaceC15785 != null) {
            this.f55902 = interfaceC15785;
            this.f55896 = c16883 != null ? new C8417(interfaceC15785, c16883) : null;
        } else {
            this.f55902 = C15473.f50422;
            this.f55896 = null;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC16178 m40887() {
        return this.f55897;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC14767 m40886() {
        return this.f55900;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) {
        try {
            String strMo7576 = this.f55900.mo7576(c12257);
            C16490 c16490M30477 = c12257.m30477();
            long j = c12257.f41009;
            long j2 = c12257.f41017;
            c16490M30477.m38757(strMo7576);
            C12257 c12257M38753 = c16490M30477.m38753();
            Uri uri = c12257M38753.f41015;
            this.f55904 = c12257M38753;
            boolean z = this.f55903;
            InterfaceC16178 interfaceC16178 = this.f55897;
            if (z) {
                String strM32699 = interfaceC16178.mo36698(strMo7576).m32699("exo_redir");
                Uri uri2 = strM32699 == null ? null : Uri.parse(strM32699);
                if (uri2 != null) {
                    uri = uri2;
                }
            }
            this.f55899 = uri;
            this.f55912 = j;
            boolean z2 = (this.f55911 && this.f55905) || (this.f55910 && j2 == -1);
            this.f55913 = z2;
            if (z2) {
                this.f55906 = -1L;
            } else {
                long jM40151 = C17214.m40151(interfaceC16178.mo36698(strMo7576));
                this.f55906 = jM40151;
                if (jM40151 != -1) {
                    long j3 = jM40151 - j;
                    this.f55906 = j3;
                    if (j3 < 0) {
                        throw new C20018(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.f55906;
                this.f55906 = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.f55906;
            if (j5 > 0 || j5 == -1) {
                m40884(c12257M38753, false);
            }
            return j2 != -1 ? j2 : this.f55906;
        } catch (Throwable th) {
            if (this.f55898 == this.f55914 || (th instanceof C7711)) {
                this.f55905 = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:9:0x001f, B:11:0x0027, B:12:0x002a, B:14:0x003b, B:16:0x004c, B:18:0x0050, B:23:0x0059, B:25:0x005f, B:27:0x0065, B:31:0x0072, B:33:0x0082, B:39:0x0090), top: B:48:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) {
        long j;
        InterfaceC15785 interfaceC15785 = this.f55914;
        if (i2 == 0) {
            return 0;
        }
        if (this.f55906 == 0) {
            return -1;
        }
        C12257 c12257 = this.f55904;
        c12257.getClass();
        C12257 c12258 = this.f55915;
        c12258.getClass();
        try {
            if (this.f55912 >= this.f55907) {
                m40884(c12257, true);
            }
            InterfaceC15785 interfaceC15786 = this.f55898;
            interfaceC15786.getClass();
            int i3 = interfaceC15786.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = i3;
                this.f55912 += j2;
                this.f55901 += j2;
                long j3 = this.f55906;
                if (j3 != -1) {
                    this.f55906 = j3 - j2;
                    return i3;
                }
            } else {
                InterfaceC15785 interfaceC15787 = this.f55898;
                if (!(interfaceC15787 == interfaceC15785)) {
                    long j4 = c12258.f41017;
                    if (j4 == -1 || this.f55901 < j4) {
                        String str = c12257.f41013;
                        String str2 = C17983.f57504;
                        this.f55906 = 0L;
                        if (interfaceC15787 == this.f55896) {
                            C1214 c1214 = new C1214();
                            C1214.m4405(c1214, this.f55912);
                            this.f55897.mo36701(str, c1214);
                            return i3;
                        }
                    } else {
                        j = this.f55906;
                        if (j <= 0) {
                            if (j == -1) {
                            }
                        }
                        m40885();
                        m40884(c12257, false);
                        return read(bArr, i, i2);
                    }
                } else {
                    j = this.f55906;
                    if (j <= 0) {
                        if (j == -1) {
                        }
                    }
                    m40885();
                    m40884(c12257, false);
                    return read(bArr, i, i2);
                }
            }
            return i3;
        } catch (Throwable th) {
            if (this.f55898 == interfaceC15785 || (th instanceof C7711)) {
                this.f55905 = true;
            }
            throw th;
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f55899;
    }

    @Override // l.InterfaceC15785
    public final void close() {
        this.f55904 = null;
        this.f55899 = null;
        this.f55912 = 0L;
        try {
            m40885();
        } catch (Throwable th) {
            if (this.f55898 == this.f55914 || (th instanceof C7711)) {
                this.f55905 = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40884(C12257 c12257, boolean z) throws InterruptedIOException {
        C2065 c2065Mo36703;
        InterfaceC15785 interfaceC15785;
        InterfaceC15785 interfaceC15786;
        long j;
        C12257 c12257M38753;
        InterfaceC15785 interfaceC15787;
        long j2;
        long jMo9272;
        C1214 c1214;
        Uri uriMo9274;
        Uri uri;
        boolean z2;
        String str = c12257.f41013;
        String str2 = C17983.f57504;
        boolean z3 = this.f55913;
        InterfaceC16178 interfaceC16178 = this.f55897;
        if (z3) {
            c2065Mo36703 = null;
        } else if (this.f55908) {
            try {
                c2065Mo36703 = interfaceC16178.mo36703(str, this.f55912, this.f55906);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            c2065Mo36703 = interfaceC16178.mo36704(str, this.f55912, this.f55906);
        }
        C8417 c8417 = this.f55896;
        InterfaceC15785 interfaceC15788 = this.f55914;
        InterfaceC15785 interfaceC15789 = this.f55902;
        if (c2065Mo36703 != null) {
            long jMin = c2065Mo36703.f7657;
            if (c2065Mo36703.f7661) {
                Uri uriFromFile = Uri.fromFile(c2065Mo36703.f7658);
                long j3 = c2065Mo36703.f7660;
                long j4 = this.f55912 - j3;
                long jMin2 = jMin - j4;
                interfaceC15785 = interfaceC15788;
                interfaceC15786 = interfaceC15789;
                long j5 = this.f55906;
                if (j5 != -1) {
                    jMin2 = Math.min(jMin2, j5);
                }
                C16490 c16490M30477 = c12257.m30477();
                c16490M30477.m38756(uriFromFile);
                c16490M30477.m38760(j3);
                c16490M30477.m38762(j4);
                c16490M30477.m38755(jMin2);
                c12257M38753 = c16490M30477.m38753();
                j = -1;
                interfaceC15789 = interfaceC15785;
            } else {
                interfaceC15785 = interfaceC15788;
                interfaceC15786 = interfaceC15789;
                j = -1;
                if (jMin == -1) {
                    jMin = this.f55906;
                } else {
                    long j6 = this.f55906;
                    if (j6 != -1) {
                        jMin = Math.min(jMin, j6);
                    }
                }
                C16490 c16490M30478 = c12257.m30477();
                c16490M30478.m38762(this.f55912);
                c16490M30478.m38755(jMin);
                c12257M38753 = c16490M30478.m38753();
                if (c8417 != null) {
                    interfaceC15789 = c8417;
                } else {
                    interfaceC16178.mo36702(c2065Mo36703);
                    c2065Mo36703 = null;
                    interfaceC15789 = interfaceC15786;
                }
            }
        } else {
            C16490 c16490M30479 = c12257.m30477();
            c16490M30479.m38762(this.f55912);
            c16490M30479.m38755(this.f55906);
            c12257M38753 = c16490M30479.m38753();
            j = -1;
            interfaceC15785 = interfaceC15788;
            interfaceC15786 = interfaceC15789;
        }
        if (!this.f55913) {
            interfaceC15787 = interfaceC15786;
            if (interfaceC15789 == interfaceC15787) {
                j2 = this.f55912 + 102400;
            }
            this.f55907 = j2;
            if (z) {
                if (this.f55898 == interfaceC15787) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C2023.m6510(z2);
                if (interfaceC15789 == interfaceC15787) {
                    return;
                }
                try {
                    m40885();
                } catch (Throwable th) {
                    if (!c2065Mo36703.f7661) {
                        interfaceC16178.mo36702(c2065Mo36703);
                        throw th;
                    }
                    throw th;
                }
            }
            if (c2065Mo36703 != null && !c2065Mo36703.f7661) {
                this.f55909 = c2065Mo36703;
            }
            this.f55898 = interfaceC15789;
            this.f55915 = c12257M38753;
            this.f55901 = 0L;
            jMo9272 = interfaceC15789.mo9272(c12257M38753);
            c1214 = new C1214();
            if (c12257M38753.f41017 == j && jMo9272 != j) {
                this.f55906 = jMo9272;
                C1214.m4405(c1214, this.f55912 + jMo9272);
            }
            if (!(this.f55898 == interfaceC15785)) {
                uriMo9274 = interfaceC15789.mo9274();
                this.f55899 = uriMo9274;
                if (this.f55903) {
                    if (c12257.f41015.equals(uriMo9274)) {
                        uri = null;
                    } else {
                        uri = this.f55899;
                    }
                    C1214.m4406(c1214, uri);
                }
            }
            if (this.f55898 == c8417) {
                interfaceC16178.mo36701(str, c1214);
            }
        }
        interfaceC15787 = interfaceC15786;
        j2 = C17492.FOREVER_NS;
        this.f55907 = j2;
        if (z) {
            if (this.f55898 == interfaceC15787) {
                z2 = true;
            } else {
                z2 = false;
            }
            C2023.m6510(z2);
            if (interfaceC15789 == interfaceC15787) {
                return;
            } else {
                m40885();
            }
        }
        if (c2065Mo36703 != null) {
            this.f55909 = c2065Mo36703;
        }
        this.f55898 = interfaceC15789;
        this.f55915 = c12257M38753;
        this.f55901 = 0L;
        jMo9272 = interfaceC15789.mo9272(c12257M38753);
        c1214 = new C1214();
        if (c12257M38753.f41017 == j) {
            this.f55906 = jMo9272;
            C1214.m4405(c1214, this.f55912 + jMo9272);
        }
        if (!(this.f55898 == interfaceC15785)) {
            uriMo9274 = interfaceC15789.mo9274();
            this.f55899 = uriMo9274;
            if (this.f55903) {
                if (c12257.f41015.equals(uriMo9274)) {
                    uri = this.f55899;
                } else {
                    uri = null;
                }
                C1214.m4406(c1214, uri);
            }
        }
        if (this.f55898 == c8417) {
            interfaceC16178.mo36701(str, c1214);
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        if (!(this.f55898 == this.f55914)) {
            return this.f55902.mo9273();
        }
        return Collections.EMPTY_MAP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m40885() {
        InterfaceC16178 interfaceC16178 = this.f55897;
        InterfaceC15785 interfaceC15785 = this.f55898;
        if (interfaceC15785 == null) {
            return;
        }
        try {
            interfaceC15785.close();
        } finally {
            this.f55915 = null;
            this.f55898 = null;
            C2065 c2065 = this.f55909;
            if (c2065 != null) {
                interfaceC16178.mo36702(c2065);
                this.f55909 = null;
            }
        }
    }
}
