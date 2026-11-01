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

/* JADX INFO: renamed from: l.ۙ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4670 extends C17020 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C8351 f16519;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f16520;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C2908 f16521;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InputStream f16522;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C14904 f16523;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f16525;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f16526;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f16527;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C7307 f16528;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16529;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C7307 f16530;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Charset f16531;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14904 f16532;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Hashtable f16534;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f16524 = 1;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f16533 = 3;

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo12933() {
    }

    static {
        String str = File.separator;
        char c = File.separatorChar;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12930(boolean z) {
        this.f16529 = z;
    }

    public C4670() {
        String.valueOf(3);
        this.f16534 = null;
        this.f16522 = null;
        this.f16527 = false;
        this.f16531 = StandardCharsets.UTF_8;
        this.f16520 = true;
        this.f16529 = true;
        this.f16521 = new C2908(this);
        this.f25812 = 2097152;
        this.f25819 = 2097152;
        this.f25810 = 32768;
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo12936() throws C5813 {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            this.f25826.f26045 = pipedOutputStream;
            C21253 c21253 = new C21253(pipedOutputStream, this.f16521.f10957.length * this.f25822);
            this.f25826.f26044 = c21253;
            this.f16522 = c21253;
            C17185 c17185 = new C17185();
            c17185.m1690(true);
            c17185.mo1688(m20728(), this);
            C14904 c14904 = new C14904(this.f25810);
            this.f16532 = c14904;
            this.f16528 = new C7307(c14904);
            C14904 c14905 = new C14904(this.f25822);
            this.f16523 = c14905;
            this.f16530 = new C7307(c14905);
            this.f16528.m19501();
            m12898((byte) 1, 5);
            this.f16532.m35644(3);
            m20728().m9237(this.f16528, this, 9);
            C14904 c14906 = this.f16532;
            c14906.f48680 = 0;
            m12894(0, 9, c14906.f48679);
            int iM35638 = c14906.m35638() - 5;
            c14906.m35629();
            int iM35639 = c14906.m35638();
            if (iM35638 > 262144) {
                throw new C12019(4, "Received message is too long: " + iM35638);
            }
            this.f16533 = iM35639;
            this.f16534 = new Hashtable();
            if (iM35638 > 0) {
                m12907(this.f16532, iM35638);
                while (iM35638 > 0) {
                    byte[] bArrM35628 = this.f16532.m35628();
                    int length = iM35638 - (bArrM35628.length + 4);
                    byte[] bArrM35629 = this.f16532.m35628();
                    iM35638 = length - (bArrM35629.length + 4);
                    Hashtable hashtable = this.f16534;
                    int length2 = bArrM35628.length;
                    Charset charset = StandardCharsets.UTF_8;
                    hashtable.put(new String(bArrM35628, 0, length2, charset), new String(bArrM35629, 0, bArrM35629.length, charset));
                }
            }
            if (this.f16534.get("posix-rename@openssh.com") != null && ((String) this.f16534.get("posix-rename@openssh.com")).equals("1")) {
                this.f16527 = true;
            }
            if (this.f16534.get("statvfs@openssh.com") != null) {
                ((String) this.f16534.get("statvfs@openssh.com")).equals("2");
            }
            if (this.f16534.get("hardlink@openssh.com") != null) {
                ((String) this.f16534.get("hardlink@openssh.com")).equals("1");
            }
            new File(".").getCanonicalPath();
        } catch (Exception e) {
            if (e instanceof C5813) {
                throw ((C5813) e);
            }
            throw new C5813(e.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m12908(C14904 c14904, C23371 c23371) throws IOException {
        c14904.f48680 = 0;
        m12894(0, 9, c14904.f48679);
        c23371.f75717 = c14904.m35638() - 5;
        c23371.f75718 = c14904.m35629() & 255;
        c23371.f75719 = c14904.m35638();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final OutputStream m12934(String str) throws C12019 {
        try {
            ((C21253) this.f16522).m47727();
            String strM12893 = m12893(m12915(str));
            if (m12919(strM12893)) {
                throw new C12019(4, strM12893 + " is a directory");
            }
            m12899(26, C8491.m22175(strM12893, this.f16531));
            C14904 c14904 = this.f16532;
            c14904.f48680 = 0;
            m12894(0, 9, c14904.f48679);
            int iM35638 = c14904.m35638() - 5;
            int iM35629 = c14904.m35629() & 255;
            c14904.m35638();
            m12907(this.f16532, iM35638);
            if (iM35629 != 101 && iM35629 != 102) {
                throw new C12019(4, "");
            }
            if (iM35629 == 101) {
                m12921(this.f16532, this.f16532.m35638());
                throw null;
            }
            return new C5731(this, this.f16532.m35628(), new long[]{0});
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m12925(long j, String str) {
        try {
            ((C21253) this.f16522).m47727();
            byte[] bArrM22175 = C8491.m22175(m12893(m12915(str)), this.f16531);
            m12896(bArrM22175);
            m12899(1, bArrM22175);
            C14904 c14904 = this.f16532;
            c14904.f48680 = 0;
            m12894(0, 9, c14904.f48679);
            int iM35638 = c14904.m35638() - 5;
            int iM35629 = c14904.m35629() & 255;
            c14904.m35638();
            m12907(this.f16532, iM35638);
            if (iM35629 != 101 && iM35629 != 102) {
                throw new C12019(4, "");
            }
            if (iM35629 == 101) {
                m12921(this.f16532, this.f16532.m35638());
                throw null;
            }
            byte[] bArrM35628 = this.f16532.m35628();
            C2908 c2908 = this.f16521;
            c2908.f10956 = 0;
            c2908.f10958 = 0;
            return new C10671(this, j, bArrM35628);
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int[], java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Vector m12926(String str) throws C12019 {
        byte[] bArrM22175;
        byte[] bytes;
        String str2;
        boolean zM22180;
        String str3;
        String str4;
        Vector vector = new Vector();
        try {
            ((C21253) this.f16522).m47727();
            String strM12915 = m12915(str);
            new Vector();
            int iLastIndexOf = strM12915.lastIndexOf(47);
            int i = 1;
            String strSubstring = strM12915.substring(0, iLastIndexOf == 0 ? 1 : iLastIndexOf);
            String strSubstring2 = strM12915.substring(iLastIndexOf + 1);
            String strM22178 = C8491.m22178(strSubstring);
            byte[][] bArr = new byte[1][];
            boolean zM12913 = m12913(strSubstring2, bArr);
            ?? r9 = 0;
            if (zM12913) {
                bArrM22175 = bArr[0];
            } else {
                String strM22179 = C8491.m22178(strM12915);
                if (m12896(C8491.m22175(strM22179, this.f16531)).m13760()) {
                    strM22178 = strM22179;
                    bArrM22175 = null;
                } else if (this.f16520) {
                    bArrM22175 = C8491.m22166(bArr[0]);
                } else {
                    bArrM22175 = C8491.m22175(C8491.m22178(strSubstring2), this.f16531);
                }
            }
            m12909(C8491.m22175(strM22178, this.f16531), (byte) 11);
            C23371 c23371 = new C23371();
            m12908(this.f16532, c23371);
            int i2 = c23371.f75717;
            int i3 = c23371.f75718;
            m12907(this.f16532, i2);
            byte b = 4;
            int i4 = 101;
            if (i3 != 101 && i3 != 102) {
                throw new C12019(4, "");
            }
            if (i3 == 101) {
                m12921(this.f16532, this.f16532.m35638());
                throw null;
            }
            byte[] bArrM35628 = this.f16532.m35628();
            while (true) {
                m12909(bArrM35628, (byte) 12);
                m12908(this.f16532, c23371);
                int i5 = c23371.f75717;
                int i6 = c23371.f75718;
                if (i6 != i4 && i6 != 104) {
                    throw new C12019(b, "");
                }
                if (i6 == i4) {
                    m12907(this.f16532, i5);
                    int iM35638 = this.f16532.m35638();
                    if (iM35638 != i) {
                        m12921(this.f16532, iM35638);
                        throw r9;
                    }
                    m12909(bArrM35628, b);
                    m12912((int[]) r9, c23371);
                    return vector;
                }
                C14904 c14904 = this.f16532;
                c14904.f48680 = 0;
                m12894(0, b, c14904.f48679);
                int i7 = i5 - 4;
                int iM35639 = this.f16532.m35638();
                this.f16532.m35650();
                while (iM35639 > 0) {
                    if (i7 > 0) {
                        C14904 c14905 = this.f16532;
                        int i8 = c14905.f48680;
                        if (i8 != 0) {
                            byte[] bArr2 = c14905.f48679;
                            System.arraycopy(bArr2, i8, bArr2, 0, c14905.f48681 - i8);
                            c14905.f48681 -= c14905.f48680;
                            c14905.f48680 = 0;
                        }
                        C14904 c14906 = this.f16532;
                        byte[] bArr3 = c14906.f48679;
                        int length = bArr3.length;
                        int i9 = c14906.f48681;
                        int iM12894 = m12894(i9, length > i9 + i7 ? i7 : bArr3.length - i9, bArr3);
                        this.f16532.f48681 += iM12894;
                        i7 -= iM12894;
                    }
                    byte[] bArrM35629 = this.f16532.m35628();
                    byte[] bArrM356210 = this.f16533 <= 3 ? this.f16532.m35628() : r9;
                    C4962 c4962M13750 = C4962.m13750(this.f16532);
                    if (bArrM22175 == null) {
                        zM22180 = true;
                    } else if (!zM12913) {
                        zM22180 = C8491.m22174(bArrM22175, bArrM35629);
                    } else {
                        if (this.f16520) {
                            bytes = bArrM35629;
                            str2 = null;
                        } else {
                            String str5 = new String(bArrM35629, 0, bArrM35629.length, this.f16531);
                            bytes = str5.getBytes(StandardCharsets.UTF_8);
                            str2 = str5;
                        }
                        zM22180 = C8491.m22180(bArrM22175, bytes);
                        str3 = str2;
                    }
                    if (zM22180) {
                        if (str3 == 0) {
                            str3 = new String(bArrM35629, 0, bArrM35629.length, this.f16531);
                        }
                        if (bArrM356210 != 0) {
                            str4 = new String(bArrM356210, 0, bArrM356210.length, this.f16531);
                        } else {
                            str4 = c4962M13750.toString() + " " + str3;
                        }
                        vector.addElement(new C14199(str3, str4, c4962M13750));
                    }
                    str3 = r9;
                    str3 = r9;
                    iM35639--;
                    i = 1;
                    b = 4;
                    i4 = 101;
                    r9 = 0;
                }
            }
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m12932(String str) throws C12019 {
        try {
            if (this.f16533 < 3) {
                throw new C12019(8, "The remote sshd is too old to support symlink operation.");
            }
            ((C21253) this.f16522).m47727();
            m12909(C8491.m22175(m12893(m12915(str)), this.f16531), (byte) 19);
            C14904 c14904 = this.f16532;
            c14904.f48680 = 0;
            m12894(0, 9, c14904.f48679);
            int iM35638 = c14904.m35638() - 5;
            int iM35629 = c14904.m35629() & 255;
            c14904.m35638();
            m12907(this.f16532, iM35638);
            if (iM35629 != 101 && iM35629 != 104) {
                throw new C12019(4, "");
            }
            byte[] bArrM35628 = null;
            if (iM35629 == 104) {
                int iM35639 = this.f16532.m35638();
                for (int i = 0; i < iM35639; i++) {
                    bArrM35628 = this.f16532.m35628();
                    if (this.f16533 <= 3) {
                        this.f16532.m35628();
                    }
                    C4962.m13750(this.f16532);
                }
                return new String(bArrM35628, 0, bArrM35628.length, this.f16531);
            }
            m12921(this.f16532, this.f16532.m35638());
            throw null;
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12927(String str, String str2) throws C12019 {
        String strM22178;
        if (this.f16533 < 2) {
            throw new C12019(8, "The remote sshd is too old to support rename operation.");
        }
        try {
            ((C21253) this.f16522).m47727();
            String strM12915 = m12915(str);
            String strM12916 = m12915(str2);
            String strM12893 = m12893(strM12915);
            Vector vectorM12891 = m12891(strM12916);
            int size = vectorM12891.size();
            if (size >= 2) {
                throw new C12019(4, vectorM12891.toString());
            }
            if (size == 1) {
                strM22178 = (String) vectorM12891.elementAt(0);
            } else {
                if (m12913(strM12916, (byte[][]) null)) {
                    throw new C12019(4, strM12916);
                }
                strM22178 = C8491.m22178(strM12916);
            }
            m12911(C8491.m22175(strM12893, this.f16531), C8491.m22175(strM22178, this.f16531));
            C14904 c14904 = this.f16532;
            c14904.f48680 = 0;
            m12894(0, 9, c14904.f48679);
            int iM35638 = c14904.m35638() - 5;
            int iM35629 = c14904.m35629() & 255;
            c14904.m35638();
            m12907(this.f16532, iM35638);
            if (iM35629 != 101) {
                throw new C12019(4, "");
            }
            int iM35639 = this.f16532.m35638();
            if (iM35639 == 0) {
                return;
            }
            m12921(this.f16532, iM35639);
            throw null;
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m12924(String str) throws C12019 {
        try {
            ((C21253) this.f16522).m47727();
            Vector vectorM12891 = m12891(m12915(str));
            int size = vectorM12891.size();
            for (int i = 0; i < size; i++) {
                m12909(C8491.m22175((String) vectorM12891.elementAt(i), this.f16531), cb.k);
                C14904 c14904 = this.f16532;
                c14904.f48680 = 0;
                m12894(0, 9, c14904.f48679);
                int iM35638 = c14904.m35638() - 5;
                int iM35629 = c14904.m35629() & 255;
                c14904.m35638();
                m12907(this.f16532, iM35638);
                if (iM35629 != 101) {
                    throw new C12019(4, "");
                }
                int iM35639 = this.f16532.m35638();
                if (iM35639 != 0) {
                    m12921(this.f16532, iM35639);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m12919(String str) {
        try {
            m12909(C8491.m22175(str, this.f16531), (byte) 17);
            C14904 c14904 = this.f16532;
            c14904.f48680 = 0;
            m12894(0, 9, c14904.f48679);
            int iM35638 = c14904.m35638() - 5;
            int iM35629 = c14904.m35629() & 255;
            c14904.m35638();
            m12907(this.f16532, iM35638);
            if (iM35629 == 105) {
                return C4962.m13750(this.f16532).m13760();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m12931(String str) throws C12019 {
        try {
            ((C21253) this.f16522).m47727();
            Vector vectorM12891 = m12891(m12915(str));
            int size = vectorM12891.size();
            for (int i = 0; i < size; i++) {
                m12909(C8491.m22175((String) vectorM12891.elementAt(i), this.f16531), (byte) 15);
                C14904 c14904 = this.f16532;
                c14904.f48680 = 0;
                m12894(0, 9, c14904.f48679);
                int iM35638 = c14904.m35638() - 5;
                int iM35629 = c14904.m35629() & 255;
                c14904.m35638();
                m12907(this.f16532, iM35638);
                if (iM35629 != 101) {
                    throw new C12019(4, "");
                }
                int iM35639 = this.f16532.m35638();
                if (iM35639 != 0) {
                    m12921(this.f16532, iM35639);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12928(String str, C4962 c4962) throws C12019 {
        try {
            ((C21253) this.f16522).m47727();
            m12910(C8491.m22175(m12915(str), this.f16531), c4962);
            C14904 c14904 = this.f16532;
            c14904.f48680 = 0;
            m12894(0, 9, c14904.f48679);
            int iM35638 = c14904.m35638() - 5;
            int iM35629 = c14904.m35629() & 255;
            c14904.m35638();
            m12907(this.f16532, iM35638);
            if (iM35629 != 101) {
                throw new C12019(4, "");
            }
            int iM35639 = this.f16532.m35638();
            if (iM35639 == 0) {
                return;
            }
            m12921(this.f16532, iM35639);
            throw null;
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4962 m12938(String str) {
        try {
            ((C21253) this.f16522).m47727();
            return m12896(C8491.m22175(m12893(m12915(str)), this.f16531));
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private byte[] m12916() throws IOException {
        Charset charset = this.f16531;
        byte[] bArr = C8491.f29422;
        m12909("".getBytes(charset), (byte) 16);
        C14904 c14904 = this.f16532;
        c14904.f48680 = 0;
        m12894(0, 9, c14904.f48679);
        int iM35638 = c14904.m35638() - 5;
        int iM35629 = c14904.m35629() & 255;
        c14904.m35638();
        m12907(this.f16532, iM35638);
        if (iM35629 != 101 && iM35629 != 104) {
            throw new C12019(4, "");
        }
        byte[] bArrM35628 = null;
        if (iM35629 == 101) {
            m12921(this.f16532, this.f16532.m35638());
            throw null;
        }
        int iM35639 = this.f16532.m35638();
        while (true) {
            int i = iM35639 - 1;
            if (iM35639 <= 0) {
                return bArrM35628;
            }
            bArrM35628 = this.f16532.m35628();
            if (this.f16533 <= 3) {
                this.f16532.m35628();
            }
            C4962.m13750(this.f16532);
            iM35639 = i;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m12935(String str, C4962 c4962) throws C12019 {
        try {
            ((C21253) this.f16522).m47727();
            Vector vectorM12891 = m12891(m12915(str));
            int size = vectorM12891.size();
            for (int i = 0; i < size; i++) {
                m12918((String) vectorM12891.elementAt(i), c4962);
            }
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m12918(String str, C4962 c4962) throws C12019 {
        try {
            m12922(C8491.m22175(str, this.f16531), c4962);
            C14904 c14904 = this.f16532;
            c14904.f48680 = 0;
            m12894(0, 9, c14904.f48679);
            int iM35638 = c14904.m35638() - 5;
            int iM35629 = c14904.m35629() & 255;
            c14904.m35638();
            m12907(this.f16532, iM35638);
            if (iM35629 != 101) {
                throw new C12019(4, "");
            }
            int iM35639 = this.f16532.m35638();
            if (iM35639 == 0) {
                return;
            }
            m12921(this.f16532, iM35639);
            throw null;
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m12937() throws C12019 {
        if (this.f16526 == null) {
            try {
                ((C21253) this.f16522).m47727();
                byte[] bArrM12916 = m12916();
                this.f16526 = new String(bArrM12916, 0, bArrM12916.length, this.f16531);
            } catch (Exception e) {
                if (e instanceof C12019) {
                    throw ((C12019) e);
                }
                throw new C12019(e.toString(), e);
            }
        }
        return this.f16526;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m12912(int[] iArr, C23371 c23371) throws IOException {
        m12908(this.f16532, c23371);
        int i = c23371.f75717;
        int i2 = c23371.f75718;
        if (iArr != null) {
            iArr[0] = c23371.f75719;
        }
        m12907(this.f16532, i);
        if (i2 != 101) {
            throw new C12019(4, "");
        }
        int iM35638 = this.f16532.m35638();
        if (iM35638 == 0) {
            return;
        }
        m12921(this.f16532, iM35638);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C4962 m12896(byte[] bArr) throws C12019 {
        try {
            m12909(bArr, (byte) 17);
            C14904 c14904 = this.f16532;
            c14904.f48680 = 0;
            m12894(0, 9, c14904.f48679);
            int iM35638 = c14904.m35638() - 5;
            int iM35629 = c14904.m35629() & 255;
            c14904.m35638();
            m12907(this.f16532, iM35638);
            if (iM35629 == 105) {
                return C4962.m13750(this.f16532);
            }
            if (iM35629 == 101) {
                m12921(this.f16532, this.f16532.m35638());
                throw null;
            }
            throw new C12019(4, "");
        } catch (Exception e) {
            if (e instanceof C12019) {
                throw ((C12019) e);
            }
            throw new C12019(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m12922(byte[] bArr, C4962 c4962) throws IOException {
        this.f16528.m19501();
        m12898((byte) 9, bArr.length + 9 + c4962.m13757());
        C14904 c14904 = this.f16532;
        int i = this.f16524;
        this.f16524 = i + 1;
        c14904.m35644(i);
        C14904 c14905 = this.f16532;
        c14905.getClass();
        c14905.m35640(0, bArr.length, bArr);
        c4962.m13756(this.f16532);
        m20728().m9237(this.f16528, this, bArr.length + 9 + c4962.m13757() + 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12910(byte[] bArr, C4962 c4962) throws IOException {
        this.f16528.m19501();
        m12898(cb.f77931l, bArr.length + 9 + c4962.m13757());
        C14904 c14904 = this.f16532;
        int i = this.f16524;
        this.f16524 = i + 1;
        c14904.m35644(i);
        C14904 c14905 = this.f16532;
        c14905.getClass();
        c14905.m35640(0, bArr.length, bArr);
        c4962.m13756(this.f16532);
        m20728().m9237(this.f16528, this, bArr.length + 9 + c4962.m13757() + 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12911(byte[] bArr, byte[] bArr2) throws IOException {
        String str = this.f16527 ? "posix-rename@openssh.com" : null;
        this.f16528.m19501();
        int length = bArr.length + 13 + bArr2.length;
        if (str == null) {
            m12898((byte) 18, length);
            C14904 c14904 = this.f16532;
            int i = this.f16524;
            this.f16524 = i + 1;
            c14904.m35644(i);
        } else {
            length += str.length() + 4;
            m12898((byte) -56, length);
            C14904 c14905 = this.f16532;
            int i2 = this.f16524;
            this.f16524 = i2 + 1;
            c14905.m35644(i2);
            C14904 c14906 = this.f16532;
            byte[] bArr3 = C8491.f29422;
            c14906.m35627(str.getBytes(StandardCharsets.UTF_8));
        }
        C14904 c14907 = this.f16532;
        c14907.getClass();
        c14907.m35640(0, bArr.length, bArr);
        C14904 c14908 = this.f16532;
        c14908.getClass();
        c14908.m35640(0, bArr2.length, bArr2);
        m20728().m9237(this.f16528, this, length + 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12905(C4670 c4670, byte[] bArr, C23371 c23371) throws IOException {
        c4670.m12909(bArr, (byte) 4);
        c4670.m12912((int[]) null, c23371);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12899(int i, byte[] bArr) throws IOException {
        this.f16528.m19501();
        m12898((byte) 3, bArr.length + 17);
        C14904 c14904 = this.f16532;
        int i2 = this.f16524;
        this.f16524 = i2 + 1;
        c14904.m35644(i2);
        C14904 c14905 = this.f16532;
        c14905.getClass();
        c14905.m35640(0, bArr.length, bArr);
        this.f16532.m35644(i);
        this.f16532.m35644(0);
        m20728().m9237(this.f16528, this, bArr.length + 21);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12909(byte[] bArr, byte b) throws IOException {
        this.f16528.m19501();
        int length = bArr.length;
        m12898(b, length + 9);
        C14904 c14904 = this.f16532;
        int i = this.f16524;
        this.f16524 = i + 1;
        c14904.m35644(i);
        C14904 c14905 = this.f16532;
        c14905.getClass();
        c14905.m35640(0, bArr.length, bArr);
        m20728().m9237(this.f16528, this, length + 13);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12895(C4670 c4670, byte[] bArr, long j, byte[] bArr2, int i, int i2) throws IOException {
        c4670.f16530.m19501();
        C3073 c3073M20728 = c4670.m20728();
        int iM9243 = c3073M20728.m9243();
        C14904 c14904 = c4670.f16523;
        byte[] bArr3 = c14904.f48679;
        int length = bArr3.length;
        int i3 = c14904.f48681 + 34;
        if (length < C8015.m21118(i3, bArr.length, i2, iM9243)) {
            i2 = bArr3.length - ((i3 + bArr.length) + iM9243);
        }
        int length2 = bArr.length + 21 + i2;
        c14904.m35630((byte) 94);
        c14904.m35644(c4670.f25821);
        c14904.m35644(length2 + 4);
        c14904.m35644(length2);
        c14904.m35630((byte) 6);
        C14904 c14905 = c4670.f16523;
        int i4 = c4670.f16524;
        c4670.f16524 = i4 + 1;
        c14905.m35644(i4);
        C14904 c14906 = c4670.f16523;
        c14906.getClass();
        c14906.m35640(0, bArr.length, bArr);
        c4670.f16523.m35633(j);
        C14904 c14907 = c4670.f16523;
        if (c14907.f48679 != bArr2) {
            c14907.m35640(i, i2, bArr2);
        } else {
            c14907.m35644(i2);
            c4670.f16523.m35639(i2);
        }
        c3073M20728.m9237(c4670.f16530, c4670, C8015.m21118(bArr.length, 21, i2, 4));
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12904(C4670 c4670, byte[] bArr, long j, int i, C2908 c2908) throws IOException {
        c4670.f16528.m19501();
        c4670.m12898((byte) 5, bArr.length + 21);
        C14904 c14904 = c4670.f16532;
        int i2 = c4670.f16524;
        c4670.f16524 = i2 + 1;
        c14904.m35644(i2);
        C14904 c14905 = c4670.f16532;
        c14905.getClass();
        c14905.m35640(0, bArr.length, bArr);
        c4670.f16532.m35633(j);
        c4670.f16532.m35644(i);
        c4670.m20728().m9237(c4670.f16528, c4670, bArr.length + 25);
        if (c2908 != null) {
            int i3 = c4670.f16524 - 1;
            int i4 = c2908.f10956;
            if (i4 == 0) {
                c2908.f10958 = 0;
            }
            int length = c2908.f10958 + i4;
            C9260[] c9260Arr = c2908.f10957;
            if (length >= c9260Arr.length) {
                length -= c9260Arr.length;
            }
            C9260 c9260 = c9260Arr[length];
            c9260.f31481 = i3;
            c9260.f31482 = j;
            c9260.f31483 = i;
            c2908.f10956 = i4 + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12898(byte b, int i) {
        C14904 c14904 = this.f16532;
        c14904.m35630((byte) 94);
        c14904.m35644(this.f25821);
        c14904.m35644(i + 4);
        c14904.m35644(i);
        c14904.m35630(b);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private Vector m12891(String str) throws IOException {
        byte[] bytes;
        String str2;
        Vector vector = new Vector();
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            vector.addElement(C8491.m22178(str));
            return vector;
        }
        String strSubstring = str.substring(0, iLastIndexOf == 0 ? 1 : iLastIndexOf);
        String strSubstring2 = str.substring(iLastIndexOf + 1);
        String strM22178 = C8491.m22178(strSubstring);
        byte[][] bArr = new byte[1][];
        if (!m12913(strSubstring2, bArr)) {
            if (!strM22178.equals("/")) {
                strM22178 = strM22178.concat("/");
            }
            StringBuilder sbM23356 = C9023.m23356(strM22178);
            sbM23356.append(C8491.m22178(strSubstring2));
            vector.addElement(sbM23356.toString());
            return vector;
        }
        byte[] bArr2 = bArr[0];
        m12909(C8491.m22175(strM22178, this.f16531), (byte) 11);
        C23371 c23371 = new C23371();
        m12908(this.f16532, c23371);
        int i = c23371.f75717;
        int i2 = c23371.f75718;
        m12907(this.f16532, i);
        byte b = 4;
        int i3 = 101;
        if (i2 != 101 && i2 != 102) {
            throw new C12019(4, "");
        }
        int[] iArr = null;
        if (i2 == 101) {
            m12921(this.f16532, this.f16532.m35638());
            throw null;
        }
        byte[] bArrM35628 = this.f16532.m35628();
        String strConcat = null;
        while (true) {
            m12909(bArrM35628, (byte) 12);
            m12908(this.f16532, c23371);
            int i4 = c23371.f75717;
            int i5 = c23371.f75718;
            if (i5 != i3 && i5 != 104) {
                throw new C12019(b, "");
            }
            if (i5 == i3) {
                m12907(this.f16532, i4);
                m12909(bArrM35628, b);
                m12912(iArr, c23371);
                return vector;
            }
            C14904 c14904 = this.f16532;
            c14904.f48680 = 0;
            m12894(0, b, c14904.f48679);
            int i6 = i4 - 4;
            this.f16532.m35650();
            for (int iM35638 = this.f16532.m35638(); iM35638 > 0; iM35638--) {
                if (i6 > 0) {
                    C14904 c14905 = this.f16532;
                    int i7 = c14905.f48680;
                    if (i7 != 0) {
                        byte[] bArr3 = c14905.f48679;
                        System.arraycopy(bArr3, i7, bArr3, 0, c14905.f48681 - i7);
                        c14905.f48681 -= c14905.f48680;
                        c14905.f48680 = 0;
                    }
                    C14904 c14906 = this.f16532;
                    byte[] bArr4 = c14906.f48679;
                    int length = bArr4.length;
                    int i8 = c14906.f48681;
                    int i9 = this.f16522.read(bArr4, i8, length > i8 + i6 ? i6 : bArr4.length - i8);
                    if (i9 <= 0) {
                        break;
                    }
                    this.f16532.f48681 += i9;
                    i6 -= i9;
                }
                byte[] bArrM35629 = this.f16532.m35628();
                if (this.f16533 <= 3) {
                    this.f16532.m35628();
                }
                C4962.m13750(this.f16532);
                if (this.f16520) {
                    bytes = bArrM35629;
                    str2 = null;
                } else {
                    str2 = new String(bArrM35629, 0, bArrM35629.length, this.f16531);
                    bytes = str2.getBytes(StandardCharsets.UTF_8);
                }
                if (C8491.m22180(bArr2, bytes)) {
                    if (str2 == null) {
                        str2 = new String(bArrM35629, 0, bArrM35629.length, this.f16531);
                    }
                    if (strConcat == null) {
                        strConcat = !strM22178.endsWith("/") ? strM22178.concat("/") : strM22178;
                    }
                    vector.addElement(strConcat + str2);
                }
            }
            b = 4;
            i3 = 101;
            iArr = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m12921(C14904 c14904, int i) throws C12019 {
        if (this.f16533 >= 3 && c14904.m35626() >= 4) {
            byte[] bArrM35628 = c14904.m35628();
            Charset charset = StandardCharsets.UTF_8;
            byte[] bArr = C8491.f29422;
            throw new C12019(i, new String(bArrM35628, 0, bArrM35628.length, charset));
        }
        throw new C12019(i, "Failure");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12913(String str, byte[][] bArr) {
        int i;
        byte[] bArrM22175 = C8491.m22175(str, StandardCharsets.UTF_8);
        if (bArr != null) {
            bArr[0] = bArrM22175;
        }
        int length = bArrM22175.length;
        int i2 = 0;
        while (i2 < length) {
            byte b = bArrM22175[i2];
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
    public void m12907(C14904 c14904, int i) throws IOException {
        c14904.m35650();
        m12894(0, i, c14904.f48679);
        c14904.m35639(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m12894(int i, int i2, byte[] bArr) throws IOException {
        int i3 = i;
        while (i2 > 0) {
            int i4 = this.f16522.read(bArr, i3, i2);
            if (i4 <= 0) {
                throw new IOException("inputstream is closed");
            }
            i3 += i4;
            i2 -= i4;
        }
        return i3 - i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12900(C4670 c4670, long j) throws IOException {
        while (j > 0) {
            long jSkip = c4670.f16522.skip(j);
            if (jSkip <= 0) {
                return;
            } else {
                j -= jSkip;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private String m12915(String str) {
        if (str.charAt(0) == '/') {
            return str;
        }
        if (this.f16525 == null) {
            this.f16525 = m12937();
        }
        String str2 = this.f16525;
        return str2.endsWith("/") ? str2.concat(str) : C1679.m5594(str2, "/", str);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private String m12893(String str) throws IOException {
        Vector vectorM12891 = m12891(str);
        if (vectorM12891.size() == 1) {
            return (String) vectorM12891.elementAt(0);
        }
        StringBuilder sbM8976 = C3012.m8976(str, " is not unique: ");
        sbM8976.append(vectorM12891.toString());
        throw new C12019(4, sbM8976.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12929(Charset charset) {
        this.f16531 = charset;
        this.f16520 = charset.equals(StandardCharsets.UTF_8);
    }
}
