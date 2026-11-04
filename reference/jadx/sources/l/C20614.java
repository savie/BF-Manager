package l;

import com.umeng.analytics.pro.cb;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: renamed from: l.᩵ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20614 extends C1969 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f66119;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Charset f66120;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C9866 f66121;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f66122;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f66123;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f66124;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Hashtable f66125;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f66126;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C14010 f66127;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C3568 f66128;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InputStream f66129;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9866 f66131;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C14010 f66133;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C3460 f66134;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f66132 = 1;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f66130 = 3;

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ۚ */
    public final void mo13414() {
    }

    static {
        String str = File.separator;
        char c = File.separatorChar;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47229(boolean z) {
        this.f66122 = z;
    }

    public C20614() {
        String.valueOf(3);
        this.f66125 = null;
        this.f66129 = null;
        this.f66119 = false;
        this.f66120 = StandardCharsets.UTF_8;
        this.f66124 = true;
        this.f66122 = true;
        this.f66134 = new C3460(this);
        this.f27468 = 2097152;
        this.f27471 = 2097152;
        this.f27475 = 32768;
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ᩹ */
    public final void mo13415() throws C2079 {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            this.f27476.f29003 = pipedOutputStream;
            C0918 c0918 = new C0918(pipedOutputStream, this.f66134.f11953.length * this.f27477);
            this.f27476.f29002 = c0918;
            this.f66129 = c0918;
            C12740 c12740 = new C12740();
            c12740.m50587(true);
            c12740.mo15880(m22542(), this);
            C9866 c9866 = new C9866(this.f27475);
            this.f66131 = c9866;
            this.f66127 = new C14010(c9866);
            C9866 c9867 = new C9866(this.f27477);
            this.f66121 = c9867;
            this.f66133 = new C14010(c9867);
            this.f66127.m34100();
            m47196((byte) 1, 5);
            this.f66131.m25669(3);
            m22542().m37615(this.f66127, this, 9);
            C9866 c9868 = this.f66131;
            c9868.f31751 = 0;
            m47192(0, 9, c9868.f31750);
            int iM25658 = c9868.m25658() - 5;
            c9868.m25650();
            int iM25659 = c9868.m25658();
            if (iM25658 > 262144) {
                throw new C20199(4, "Received message is too long: " + iM25658);
            }
            this.f66130 = iM25659;
            this.f66125 = new Hashtable();
            if (iM25658 > 0) {
                m47198(this.f66131, iM25658);
                while (iM25658 > 0) {
                    byte[] bArrM25649 = this.f66131.m25649();
                    int length = iM25658 - (bArrM25649.length + 4);
                    byte[] bArrM256410 = this.f66131.m25649();
                    iM25658 = length - (bArrM256410.length + 4);
                    Hashtable hashtable = this.f66125;
                    int length2 = bArrM25649.length;
                    Charset charset = StandardCharsets.UTF_8;
                    hashtable.put(new String(bArrM25649, 0, length2, charset), new String(bArrM256410, 0, bArrM256410.length, charset));
                }
            }
            if (this.f66125.get("posix-rename@openssh.com") != null && ((String) this.f66125.get("posix-rename@openssh.com")).equals("1")) {
                this.f66119 = true;
            }
            if (this.f66125.get("statvfs@openssh.com") != null) {
                ((String) this.f66125.get("statvfs@openssh.com")).equals("2");
            }
            if (this.f66125.get("hardlink@openssh.com") != null) {
                ((String) this.f66125.get("hardlink@openssh.com")).equals("1");
            }
            new File(".").getCanonicalPath();
        } catch (Exception e) {
            if (e instanceof C2079) {
                throw ((C2079) e);
            }
            throw new C2079(e.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m47199(C9866 c9866, C16884 c16884) throws IOException {
        c9866.f31751 = 0;
        m47192(0, 9, c9866.f31750);
        c16884.f55231 = c9866.m25658() - 5;
        c16884.f55232 = c9866.m25650() & 255;
        c16884.f55233 = c9866.m25658();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final OutputStream m47234(String str) throws C20199 {
        try {
            ((C0918) this.f66129).m3715();
            String strM47191 = m47191(m47215(str));
            if (m47212(strM47191)) {
                throw new C20199(4, strM47191 + " is a directory");
            }
            m47197(26, C9011.m24055(strM47191, this.f66120));
            C9866 c9866 = this.f66131;
            c9866.f31751 = 0;
            m47192(0, 9, c9866.f31750);
            int iM25658 = c9866.m25658() - 5;
            int iM25650 = c9866.m25650() & 255;
            c9866.m25658();
            m47198(this.f66131, iM25658);
            if (iM25650 != 101 && iM25650 != 102) {
                throw new C20199(4, "");
            }
            if (iM25650 == 101) {
                m47221(this.f66131, this.f66131.m25658());
                throw null;
            }
            return new C11663(this, this.f66131.m25649(), new long[]{0});
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m47224(long j, String str) throws C20199 {
        try {
            ((C0918) this.f66129).m3715();
            byte[] bArrM24055 = C9011.m24055(m47191(m47215(str)), this.f66120);
            m47195(bArrM24055);
            m47197(1, bArrM24055);
            C9866 c9866 = this.f66131;
            c9866.f31751 = 0;
            m47192(0, 9, c9866.f31750);
            int iM25658 = c9866.m25658() - 5;
            int iM25650 = c9866.m25650() & 255;
            c9866.m25658();
            m47198(this.f66131, iM25658);
            if (iM25650 != 101 && iM25650 != 102) {
                throw new C20199(4, "");
            }
            if (iM25650 == 101) {
                m47221(this.f66131, this.f66131.m25658());
                throw null;
            }
            byte[] bArrM25649 = this.f66131.m25649();
            C3460 c3460 = this.f66134;
            c3460.f11952 = 0;
            c3460.f11954 = 0;
            return new C25090(this, j, bArrM25649);
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int[], java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Vector m47225(String str) throws C20199 {
        byte[] bArrM24055;
        byte[] bytes;
        String str2;
        boolean zM24060;
        String str3;
        String str4;
        Vector vector = new Vector();
        try {
            ((C0918) this.f66129).m3715();
            String strM47215 = m47215(str);
            new Vector();
            int iLastIndexOf = strM47215.lastIndexOf(47);
            int i = 1;
            String strSubstring = strM47215.substring(0, iLastIndexOf == 0 ? 1 : iLastIndexOf);
            String strSubstring2 = strM47215.substring(iLastIndexOf + 1);
            String strM24058 = C9011.m24058(strSubstring);
            byte[][] bArr = new byte[1][];
            boolean zM47211 = m47211(strSubstring2, bArr);
            ?? r9 = 0;
            if (zM47211) {
                bArrM24055 = bArr[0];
            } else {
                String strM24059 = C9011.m24058(strM47215);
                if (m47195(C9011.m24055(strM24059, this.f66120)).m52108()) {
                    strM24058 = strM24059;
                    bArrM24055 = null;
                } else if (this.f66124) {
                    bArrM24055 = C9011.m24066(bArr[0]);
                } else {
                    bArrM24055 = C9011.m24055(C9011.m24058(strSubstring2), this.f66120);
                }
            }
            m47207(C9011.m24055(strM24058, this.f66120), (byte) 11);
            C16884 c16884 = new C16884();
            m47199(this.f66131, c16884);
            int i2 = c16884.f55231;
            int i3 = c16884.f55232;
            m47198(this.f66131, i2);
            byte b = 4;
            int i4 = 101;
            if (i3 != 101 && i3 != 102) {
                throw new C20199(4, "");
            }
            if (i3 == 101) {
                m47221(this.f66131, this.f66131.m25658());
                throw null;
            }
            byte[] bArrM25649 = this.f66131.m25649();
            while (true) {
                m47207(bArrM25649, (byte) 12);
                m47199(this.f66131, c16884);
                int i5 = c16884.f55231;
                int i6 = c16884.f55232;
                if (i6 != i4 && i6 != 104) {
                    throw new C20199(b, "");
                }
                if (i6 == i4) {
                    m47198(this.f66131, i5);
                    int iM25658 = this.f66131.m25658();
                    if (iM25658 != i) {
                        m47221(this.f66131, iM25658);
                        throw r9;
                    }
                    m47207(bArrM25649, b);
                    m47210((int[]) r9, c16884);
                    return vector;
                }
                C9866 c9866 = this.f66131;
                c9866.f31751 = 0;
                m47192(0, b, c9866.f31750);
                int i7 = i5 - 4;
                int iM25659 = this.f66131.m25658();
                this.f66131.m25674();
                while (iM25659 > 0) {
                    if (i7 > 0) {
                        C9866 c9867 = this.f66131;
                        int i8 = c9867.f31751;
                        if (i8 != 0) {
                            byte[] bArr2 = c9867.f31750;
                            System.arraycopy(bArr2, i8, bArr2, 0, c9867.f31752 - i8);
                            c9867.f31752 -= c9867.f31751;
                            c9867.f31751 = 0;
                        }
                        C9866 c9868 = this.f66131;
                        byte[] bArr3 = c9868.f31750;
                        int length = bArr3.length;
                        int i9 = c9868.f31752;
                        int iM47192 = m47192(i9, length > i9 + i7 ? i7 : bArr3.length - i9, bArr3);
                        this.f66131.f31752 += iM47192;
                        i7 -= iM47192;
                    }
                    byte[] bArrM256410 = this.f66131.m25649();
                    byte[] bArrM256411 = this.f66130 <= 3 ? this.f66131.m25649() : r9;
                    C23183 c23183M52099 = C23183.m52099(this.f66131);
                    if (bArrM24055 == null) {
                        zM24060 = true;
                    } else if (!zM47211) {
                        zM24060 = C9011.m24054(bArrM24055, bArrM256410);
                    } else {
                        if (this.f66124) {
                            bytes = bArrM256410;
                            str2 = null;
                        } else {
                            String str5 = new String(bArrM256410, 0, bArrM256410.length, this.f66120);
                            bytes = str5.getBytes(StandardCharsets.UTF_8);
                            str2 = str5;
                        }
                        zM24060 = C9011.m24060(bArrM24055, bytes);
                        str3 = str2;
                    }
                    if (zM24060) {
                        if (str3 == 0) {
                            str3 = new String(bArrM256410, 0, bArrM256410.length, this.f66120);
                        }
                        if (bArrM256411 != 0) {
                            str4 = new String(bArrM256411, 0, bArrM256411.length, this.f66120);
                        } else {
                            str4 = c23183M52099.toString() + " " + str3;
                        }
                        vector.addElement(new C17630(str3, str4, c23183M52099));
                    }
                    str3 = r9;
                    str3 = r9;
                    iM25659--;
                    i = 1;
                    b = 4;
                    i4 = 101;
                    r9 = 0;
                }
            }
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m47230(String str) throws C20199 {
        try {
            if (this.f66130 < 3) {
                throw new C20199(8, "The remote sshd is too old to support symlink operation.");
            }
            ((C0918) this.f66129).m3715();
            m47207(C9011.m24055(m47191(m47215(str)), this.f66120), (byte) 19);
            C9866 c9866 = this.f66131;
            c9866.f31751 = 0;
            m47192(0, 9, c9866.f31750);
            int iM25658 = c9866.m25658() - 5;
            int iM25650 = c9866.m25650() & 255;
            c9866.m25658();
            m47198(this.f66131, iM25658);
            if (iM25650 != 101 && iM25650 != 104) {
                throw new C20199(4, "");
            }
            byte[] bArrM25649 = null;
            if (iM25650 == 104) {
                int iM25659 = this.f66131.m25658();
                for (int i = 0; i < iM25659; i++) {
                    bArrM25649 = this.f66131.m25649();
                    if (this.f66130 <= 3) {
                        this.f66131.m25649();
                    }
                    C23183.m52099(this.f66131);
                }
                return new String(bArrM25649, 0, bArrM25649.length, this.f66120);
            }
            m47221(this.f66131, this.f66131.m25658());
            throw null;
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47226(String str, String str2) throws C20199 {
        String strM24058;
        if (this.f66130 < 2) {
            throw new C20199(8, "The remote sshd is too old to support rename operation.");
        }
        try {
            ((C0918) this.f66129).m3715();
            String strM47215 = m47215(str);
            String strM47216 = m47215(str2);
            String strM47191 = m47191(strM47215);
            Vector vectorM47217 = m47217(strM47216);
            int size = vectorM47217.size();
            if (size >= 2) {
                throw new C20199(4, vectorM47217.toString());
            }
            if (size == 1) {
                strM24058 = (String) vectorM47217.elementAt(0);
            } else {
                if (m47211(strM47216, (byte[][]) null)) {
                    throw new C20199(4, strM47216);
                }
                strM24058 = C9011.m24058(strM47216);
            }
            m47209(C9011.m24055(strM47191, this.f66120), C9011.m24055(strM24058, this.f66120));
            C9866 c9866 = this.f66131;
            c9866.f31751 = 0;
            m47192(0, 9, c9866.f31750);
            int iM25658 = c9866.m25658() - 5;
            int iM25650 = c9866.m25650() & 255;
            c9866.m25658();
            m47198(this.f66131, iM25658);
            if (iM25650 != 101) {
                throw new C20199(4, "");
            }
            int iM25659 = this.f66131.m25658();
            if (iM25659 == 0) {
                return;
            }
            m47221(this.f66131, iM25659);
            throw null;
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m47236(String str) throws C20199 {
        try {
            ((C0918) this.f66129).m3715();
            Vector vectorM47217 = m47217(m47215(str));
            int size = vectorM47217.size();
            for (int i = 0; i < size; i++) {
                m47207(C9011.m24055((String) vectorM47217.elementAt(i), this.f66120), cb.k);
                C9866 c9866 = this.f66131;
                c9866.f31751 = 0;
                m47192(0, 9, c9866.f31750);
                int iM25658 = c9866.m25658() - 5;
                int iM25650 = c9866.m25650() & 255;
                c9866.m25658();
                m47198(this.f66131, iM25658);
                if (iM25650 != 101) {
                    throw new C20199(4, "");
                }
                int iM25659 = this.f66131.m25658();
                if (iM25659 != 0) {
                    m47221(this.f66131, iM25659);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m47212(String str) {
        try {
            m47207(C9011.m24055(str, this.f66120), (byte) 17);
            C9866 c9866 = this.f66131;
            c9866.f31751 = 0;
            m47192(0, 9, c9866.f31750);
            int iM25658 = c9866.m25658() - 5;
            int iM25650 = c9866.m25650() & 255;
            c9866.m25658();
            m47198(this.f66131, iM25658);
            if (iM25650 == 105) {
                return C23183.m52099(this.f66131).m52108();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m47232(String str) throws C20199 {
        try {
            ((C0918) this.f66129).m3715();
            Vector vectorM47217 = m47217(m47215(str));
            int size = vectorM47217.size();
            for (int i = 0; i < size; i++) {
                m47207(C9011.m24055((String) vectorM47217.elementAt(i), this.f66120), (byte) 15);
                C9866 c9866 = this.f66131;
                c9866.f31751 = 0;
                m47192(0, 9, c9866.f31750);
                int iM25658 = c9866.m25658() - 5;
                int iM25650 = c9866.m25650() & 255;
                c9866.m25658();
                m47198(this.f66131, iM25658);
                if (iM25650 != 101) {
                    throw new C20199(4, "");
                }
                int iM25659 = this.f66131.m25658();
                if (iM25659 != 0) {
                    m47221(this.f66131, iM25659);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47227(String str, C23183 c23183) throws C20199 {
        try {
            ((C0918) this.f66129).m3715();
            m47208(C9011.m24055(m47215(str), this.f66120), c23183);
            C9866 c9866 = this.f66131;
            c9866.f31751 = 0;
            m47192(0, 9, c9866.f31750);
            int iM25658 = c9866.m25658() - 5;
            int iM25650 = c9866.m25650() & 255;
            c9866.m25658();
            m47198(this.f66131, iM25658);
            if (iM25650 != 101) {
                throw new C20199(4, "");
            }
            int iM25659 = this.f66131.m25658();
            if (iM25659 == 0) {
                return;
            }
            m47221(this.f66131, iM25659);
            throw null;
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23183 m47231(String str) {
        try {
            ((C0918) this.f66129).m3715();
            return m47195(C9011.m24055(m47191(m47215(str)), this.f66120));
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private byte[] m47216() throws IOException {
        Charset charset = this.f66120;
        byte[] bArr = C9011.f29358;
        m47207("".getBytes(charset), (byte) 16);
        C9866 c9866 = this.f66131;
        c9866.f31751 = 0;
        m47192(0, 9, c9866.f31750);
        int iM25658 = c9866.m25658() - 5;
        int iM25650 = c9866.m25650() & 255;
        c9866.m25658();
        m47198(this.f66131, iM25658);
        if (iM25650 != 101 && iM25650 != 104) {
            throw new C20199(4, "");
        }
        byte[] bArrM25649 = null;
        if (iM25650 == 101) {
            m47221(this.f66131, this.f66131.m25658());
            throw null;
        }
        int iM25659 = this.f66131.m25658();
        while (true) {
            int i = iM25659 - 1;
            if (iM25659 <= 0) {
                return bArrM25649;
            }
            bArrM25649 = this.f66131.m25649();
            if (this.f66130 <= 3) {
                this.f66131.m25649();
            }
            C23183.m52099(this.f66131);
            iM25659 = i;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47235(String str, C23183 c23183) throws C20199 {
        try {
            ((C0918) this.f66129).m3715();
            Vector vectorM47217 = m47217(m47215(str));
            int size = vectorM47217.size();
            for (int i = 0; i < size; i++) {
                m47214((String) vectorM47217.elementAt(i), c23183);
            }
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m47214(String str, C23183 c23183) throws C20199 {
        try {
            m47222(C9011.m24055(str, this.f66120), c23183);
            C9866 c9866 = this.f66131;
            c9866.f31751 = 0;
            m47192(0, 9, c9866.f31750);
            int iM25658 = c9866.m25658() - 5;
            int iM25650 = c9866.m25650() & 255;
            c9866.m25658();
            m47198(this.f66131, iM25658);
            if (iM25650 != 101) {
                throw new C20199(4, "");
            }
            int iM25659 = this.f66131.m25658();
            if (iM25659 == 0) {
                return;
            }
            m47221(this.f66131, iM25659);
            throw null;
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m47233() throws C20199 {
        if (this.f66123 == null) {
            try {
                ((C0918) this.f66129).m3715();
                byte[] bArrM47216 = m47216();
                this.f66123 = new String(bArrM47216, 0, bArrM47216.length, this.f66120);
            } catch (Exception e) {
                if (e instanceof C20199) {
                    throw ((C20199) e);
                }
                throw new C20199(e.toString(), e);
            }
        }
        return this.f66123;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m47210(int[] iArr, C16884 c16884) throws IOException {
        m47199(this.f66131, c16884);
        int i = c16884.f55231;
        int i2 = c16884.f55232;
        if (iArr != null) {
            iArr[0] = c16884.f55233;
        }
        m47198(this.f66131, i);
        if (i2 != 101) {
            throw new C20199(4, "");
        }
        int iM25658 = this.f66131.m25658();
        if (iM25658 == 0) {
            return;
        }
        m47221(this.f66131, iM25658);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23183 m47195(byte[] bArr) throws C20199 {
        try {
            m47207(bArr, (byte) 17);
            C9866 c9866 = this.f66131;
            c9866.f31751 = 0;
            m47192(0, 9, c9866.f31750);
            int iM25658 = c9866.m25658() - 5;
            int iM25650 = c9866.m25650() & 255;
            c9866.m25658();
            m47198(this.f66131, iM25658);
            if (iM25650 == 105) {
                return C23183.m52099(this.f66131);
            }
            if (iM25650 == 101) {
                m47221(this.f66131, this.f66131.m25658());
                throw null;
            }
            throw new C20199(4, "");
        } catch (Exception e) {
            if (e instanceof C20199) {
                throw ((C20199) e);
            }
            throw new C20199(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m47222(byte[] bArr, C23183 c23183) throws IOException {
        this.f66127.m34100();
        m47196((byte) 9, bArr.length + 9 + c23183.m52106());
        C9866 c9866 = this.f66131;
        int i = this.f66132;
        this.f66132 = i + 1;
        c9866.m25669(i);
        C9866 c9867 = this.f66131;
        c9867.getClass();
        c9867.m25660(0, bArr.length, bArr);
        c23183.m52104(this.f66131);
        m22542().m37615(this.f66127, this, bArr.length + 9 + c23183.m52106() + 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47208(byte[] bArr, C23183 c23183) throws IOException {
        this.f66127.m34100();
        m47196(cb.f82047l, bArr.length + 9 + c23183.m52106());
        C9866 c9866 = this.f66131;
        int i = this.f66132;
        this.f66132 = i + 1;
        c9866.m25669(i);
        C9866 c9867 = this.f66131;
        c9867.getClass();
        c9867.m25660(0, bArr.length, bArr);
        c23183.m52104(this.f66131);
        m22542().m37615(this.f66127, this, bArr.length + 9 + c23183.m52106() + 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47209(byte[] bArr, byte[] bArr2) throws IOException {
        String str = this.f66119 ? "posix-rename@openssh.com" : null;
        this.f66127.m34100();
        int length = bArr.length + 13 + bArr2.length;
        if (str == null) {
            m47196((byte) 18, length);
            C9866 c9866 = this.f66131;
            int i = this.f66132;
            this.f66132 = i + 1;
            c9866.m25669(i);
        } else {
            length += str.length() + 4;
            m47196((byte) -56, length);
            C9866 c9867 = this.f66131;
            int i2 = this.f66132;
            this.f66132 = i2 + 1;
            c9867.m25669(i2);
            C9866 c9868 = this.f66131;
            byte[] bArr3 = C9011.f29358;
            c9868.m25673(str.getBytes(StandardCharsets.UTF_8));
        }
        C9866 c9869 = this.f66131;
        c9869.getClass();
        c9869.m25660(0, bArr.length, bArr);
        C9866 c98610 = this.f66131;
        c98610.getClass();
        c98610.m25660(0, bArr2.length, bArr2);
        m22542().m37615(this.f66127, this, length + 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47205(C20614 c20614, byte[] bArr, C16884 c16884) throws IOException {
        c20614.m47207(bArr, (byte) 4);
        c20614.m47210((int[]) null, c16884);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47197(int i, byte[] bArr) throws IOException {
        this.f66127.m34100();
        m47196((byte) 3, bArr.length + 17);
        C9866 c9866 = this.f66131;
        int i2 = this.f66132;
        this.f66132 = i2 + 1;
        c9866.m25669(i2);
        C9866 c9867 = this.f66131;
        c9867.getClass();
        c9867.m25660(0, bArr.length, bArr);
        this.f66131.m25669(i);
        this.f66131.m25669(0);
        m22542().m37615(this.f66127, this, bArr.length + 21);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47207(byte[] bArr, byte b) throws IOException {
        this.f66127.m34100();
        int length = bArr.length;
        m47196(b, length + 9);
        C9866 c9866 = this.f66131;
        int i = this.f66132;
        this.f66132 = i + 1;
        c9866.m25669(i);
        C9866 c9867 = this.f66131;
        c9867.getClass();
        c9867.m25660(0, bArr.length, bArr);
        m22542().m37615(this.f66127, this, length + 13);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47193(C20614 c20614, byte[] bArr, long j, byte[] bArr2, int i, int i2) throws IOException {
        c20614.f66133.m34100();
        C15723 c15723M22542 = c20614.m22542();
        int iM37618 = c15723M22542.m37618();
        C9866 c9866 = c20614.f66121;
        byte[] bArr3 = c9866.f31750;
        int length = bArr3.length;
        int i3 = c9866.f31752 + 34;
        if (length < C24579.m54897(i3, bArr.length, i2, iM37618)) {
            i2 = bArr3.length - ((i3 + bArr.length) + iM37618);
        }
        int length2 = bArr.length + 21 + i2;
        c9866.m25651((byte) 94);
        c9866.m25669(c20614.f27478);
        c9866.m25669(length2 + 4);
        c9866.m25669(length2);
        c9866.m25651((byte) 6);
        C9866 c9867 = c20614.f66121;
        int i4 = c20614.f66132;
        c20614.f66132 = i4 + 1;
        c9867.m25669(i4);
        C9866 c9868 = c20614.f66121;
        c9868.getClass();
        c9868.m25660(0, bArr.length, bArr);
        c20614.f66121.m25654(j);
        C9866 c9869 = c20614.f66121;
        if (c9869.f31750 != bArr2) {
            c9869.m25660(i, i2, bArr2);
        } else {
            c9869.m25669(i2);
            c20614.f66121.m25659(i2);
        }
        c15723M22542.m37615(c20614.f66133, c20614, C24579.m54897(bArr.length, 21, i2, 4));
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47204(C20614 c20614, byte[] bArr, long j, int i, C3460 c3460) throws IOException {
        c20614.f66127.m34100();
        c20614.m47196((byte) 5, bArr.length + 21);
        C9866 c9866 = c20614.f66131;
        int i2 = c20614.f66132;
        c20614.f66132 = i2 + 1;
        c9866.m25669(i2);
        C9866 c9867 = c20614.f66131;
        c9867.getClass();
        c9867.m25660(0, bArr.length, bArr);
        c20614.f66131.m25654(j);
        c20614.f66131.m25669(i);
        c20614.m22542().m37615(c20614.f66127, c20614, bArr.length + 25);
        if (c3460 != null) {
            int i3 = c20614.f66132 - 1;
            int i4 = c3460.f11952;
            if (i4 == 0) {
                c3460.f11954 = 0;
            }
            int length = c3460.f11954 + i4;
            C23598[] c23598Arr = c3460.f11953;
            if (length >= c23598Arr.length) {
                length -= c23598Arr.length;
            }
            C23598 c23598 = c23598Arr[length];
            c23598.f76609 = i3;
            c23598.f76610 = j;
            c23598.f76611 = i;
            c3460.f11952 = i4 + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47196(byte b, int i) {
        C9866 c9866 = this.f66131;
        c9866.m25651((byte) 94);
        c9866.m25669(this.f27478);
        c9866.m25669(i + 4);
        c9866.m25669(i);
        c9866.m25651(b);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private Vector m47217(String str) throws IOException {
        byte[] bytes;
        String str2;
        Vector vector = new Vector();
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            vector.addElement(C9011.m24058(str));
            return vector;
        }
        String strSubstring = str.substring(0, iLastIndexOf == 0 ? 1 : iLastIndexOf);
        String strSubstring2 = str.substring(iLastIndexOf + 1);
        String strM24058 = C9011.m24058(strSubstring);
        byte[][] bArr = new byte[1][];
        if (!m47211(strSubstring2, bArr)) {
            if (!strM24058.equals("/")) {
                strM24058 = strM24058.concat("/");
            }
            StringBuilder sbM27333 = C10732.m27333(strM24058);
            sbM27333.append(C9011.m24058(strSubstring2));
            vector.addElement(sbM27333.toString());
            return vector;
        }
        byte[] bArr2 = bArr[0];
        m47207(C9011.m24055(strM24058, this.f66120), (byte) 11);
        C16884 c16884 = new C16884();
        m47199(this.f66131, c16884);
        int i = c16884.f55231;
        int i2 = c16884.f55232;
        m47198(this.f66131, i);
        byte b = 4;
        int i3 = 101;
        if (i2 != 101 && i2 != 102) {
            throw new C20199(4, "");
        }
        int[] iArr = null;
        if (i2 == 101) {
            m47221(this.f66131, this.f66131.m25658());
            throw null;
        }
        byte[] bArrM25649 = this.f66131.m25649();
        String strConcat = null;
        while (true) {
            m47207(bArrM25649, (byte) 12);
            m47199(this.f66131, c16884);
            int i4 = c16884.f55231;
            int i5 = c16884.f55232;
            if (i5 != i3 && i5 != 104) {
                throw new C20199(b, "");
            }
            if (i5 == i3) {
                m47198(this.f66131, i4);
                m47207(bArrM25649, b);
                m47210(iArr, c16884);
                return vector;
            }
            C9866 c9866 = this.f66131;
            c9866.f31751 = 0;
            m47192(0, b, c9866.f31750);
            int i6 = i4 - 4;
            this.f66131.m25674();
            for (int iM25658 = this.f66131.m25658(); iM25658 > 0; iM25658--) {
                if (i6 > 0) {
                    C9866 c9867 = this.f66131;
                    int i7 = c9867.f31751;
                    if (i7 != 0) {
                        byte[] bArr3 = c9867.f31750;
                        System.arraycopy(bArr3, i7, bArr3, 0, c9867.f31752 - i7);
                        c9867.f31752 -= c9867.f31751;
                        c9867.f31751 = 0;
                    }
                    C9866 c9868 = this.f66131;
                    byte[] bArr4 = c9868.f31750;
                    int length = bArr4.length;
                    int i8 = c9868.f31752;
                    int i9 = this.f66129.read(bArr4, i8, length > i8 + i6 ? i6 : bArr4.length - i8);
                    if (i9 <= 0) {
                        break;
                    }
                    this.f66131.f31752 += i9;
                    i6 -= i9;
                }
                byte[] bArrM256410 = this.f66131.m25649();
                if (this.f66130 <= 3) {
                    this.f66131.m25649();
                }
                C23183.m52099(this.f66131);
                if (this.f66124) {
                    bytes = bArrM256410;
                    str2 = null;
                } else {
                    str2 = new String(bArrM256410, 0, bArrM256410.length, this.f66120);
                    bytes = str2.getBytes(StandardCharsets.UTF_8);
                }
                if (C9011.m24060(bArr2, bytes)) {
                    if (str2 == null) {
                        str2 = new String(bArrM256410, 0, bArrM256410.length, this.f66120);
                    }
                    if (strConcat == null) {
                        strConcat = !strM24058.endsWith("/") ? strM24058.concat("/") : strM24058;
                    }
                    vector.addElement(strConcat + str2);
                }
            }
            b = 4;
            i3 = 101;
            iArr = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m47221(C9866 c9866, int i) throws C20199 {
        if (this.f66130 >= 3 && c9866.m25672() >= 4) {
            byte[] bArrM25649 = c9866.m25649();
            Charset charset = StandardCharsets.UTF_8;
            byte[] bArr = C9011.f29358;
            throw new C20199(i, new String(bArrM25649, 0, bArrM25649.length, charset));
        }
        throw new C20199(i, "Failure");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47211(String str, byte[][] bArr) {
        int i;
        byte[] bArrM24055 = C9011.m24055(str, StandardCharsets.UTF_8);
        if (bArr != null) {
            bArr[0] = bArrM24055;
        }
        int length = bArrM24055.length;
        int i2 = 0;
        while (i2 < length) {
            byte b = bArrM24055[i2];
            if (b == 42 || b == 63) {
                return true;
            }
            if (b == 92 && (i = i2 + 1) < length) {
                i2 = i;
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m47198(C9866 c9866, int i) throws IOException {
        c9866.m25674();
        m47192(0, i, c9866.f31750);
        c9866.m25659(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m47192(int i, int i2, byte[] bArr) throws IOException {
        int i3 = i;
        while (i2 > 0) {
            int i4 = this.f66129.read(bArr, i3, i2);
            if (i4 <= 0) {
                throw new IOException("inputstream is closed");
            }
            i3 += i4;
            i2 -= i4;
        }
        return i3 - i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47200(C20614 c20614, long j) throws IOException {
        while (j > 0) {
            long jSkip = c20614.f66129.skip(j);
            if (jSkip <= 0) {
                return;
            } else {
                j -= jSkip;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private String m47215(String str) {
        if (str.charAt(0) == '/') {
            return str;
        }
        if (this.f66126 == null) {
            this.f66126 = m47233();
        }
        String str2 = this.f66126;
        return str2.endsWith("/") ? str2.concat(str) : C20196.m46451(str2, "/", str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m47191(String str) throws IOException {
        Vector vectorM47217 = m47217(str);
        if (vectorM47217.size() == 1) {
            return (String) vectorM47217.elementAt(0);
        }
        StringBuilder sbM10405 = C3188.m10405(str, " is not unique: ");
        sbM10405.append(vectorM47217.toString());
        throw new C20199(4, sbM10405.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47228(Charset charset) {
        this.f66120 = charset;
        this.f66124 = charset.equals(StandardCharsets.UTF_8);
    }
}
