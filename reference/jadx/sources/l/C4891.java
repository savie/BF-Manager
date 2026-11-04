package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۙۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9YD */
/* JADX INFO: loaded from: classes3.dex */
public final class C4891 implements InterfaceC2894, AutoCloseable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f17088 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f17089 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f17090;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14760 f17091;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC23032 f17092;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9605 f17093;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f17094;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f17095;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC18490 f17096;

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    public C4891(String str, InterfaceC23032 interfaceC23032) throws C7369 {
        String strTrim;
        int iIndexOf;
        char[] charArray = str.toCharArray();
        int length = 0;
        char c = 0;
        int i = 0;
        String strTrim2 = null;
        C9605 c9605 = null;
        String str2 = null;
        do {
            char c2 = charArray[length];
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 5) {
                            length = charArray.length;
                        } else if (c2 == '=') {
                            strTrim2 = str.substring(i, length).trim();
                            i = length + 1;
                        } else if (c2 == ',' || c2 == ']') {
                            String strTrim3 = str.substring(i, length).trim();
                            int i2 = length + 1;
                            strTrim2 = strTrim2 == null ? "endpoint" : strTrim2;
                            if (c9605 != null) {
                                c9605.m25081(strTrim2, strTrim3);
                            }
                            strTrim2 = null;
                            i = i2;
                        }
                    } else if (c2 == '[') {
                        strTrim = str.substring(i, length).trim();
                        if (strTrim.length() == 0) {
                            iIndexOf = str.indexOf(91, length + 1);
                            int iIndexOf2 = str.indexOf(93, length);
                            if (iIndexOf >= 0 || iIndexOf2 < 0 || iIndexOf2 != iIndexOf - 1) {
                                strTrim = "127.0.0.1";
                            } else {
                                strTrim = str.substring(length, iIndexOf2 + 1);
                                length = iIndexOf;
                            }
                        }
                        c9605 = new C9605(str2, strTrim);
                        i = length + 1;
                        c = 5;
                    }
                } else if (c2 == '\\') {
                    i = length + 1;
                } else {
                    c = 2;
                    if (c2 == '[') {
                        strTrim = str.substring(i, length).trim();
                        if (strTrim.length() == 0) {
                            iIndexOf = str.indexOf(91, length + 1);
                            int iIndexOf3 = str.indexOf(93, length);
                            if (iIndexOf >= 0) {
                                strTrim = "127.0.0.1";
                            } else {
                                strTrim = "127.0.0.1";
                            }
                        }
                        c9605 = new C9605(str2, strTrim);
                        i = length + 1;
                        c = 5;
                    }
                }
            } else if (c2 == ':') {
                String strSubstring = str.substring(i, length);
                i = length + 1;
                str2 = strSubstring;
                c = 1;
            }
            length++;
        } while (length < charArray.length);
        if (c9605 == null || c9605.m25080() == null) {
            throw new C7369("Invalid binding URL: ".concat(str));
        }
        this.f17090 = 4280;
        this.f17094 = 4280;
        this.f17095 = 0;
        this.f17092 = interfaceC23032;
        this.f17093 = c9605;
        String str3 = "smb://" + c9605.m25085() + "/IPC$/" + c9605.m25080().substring(6);
        String str4 = (String) c9605.m25079("server");
        String strConcat = str4 != null ? "&server=".concat(str4) : "";
        String str5 = (String) c9605.m25079("address");
        strConcat = str5 != null ? C20196.m46451(strConcat, "&address=", str5) : strConcat;
        C14760 c14760 = new C14760(strConcat.length() > 0 ? ExternalValue$$ExternalSyntheticOutline0.m(1, strConcat, C3188.m10405(str3, "?")) : str3, interfaceC23032);
        this.f17091 = c14760;
        InterfaceC18490 interfaceC18490M35493 = c14760.m35493();
        interfaceC18490M35493.mo43083();
        this.f17096 = interfaceC18490M35493;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15014(int i, int i2, byte[] bArr, byte[] bArr2) throws IOException {
        InterfaceC18490 interfaceC18490 = this.f17096;
        if (interfaceC18490.mo43081()) {
            throw new IOException("DCERPC pipe is no longer open");
        }
        int iMo43079 = interfaceC18490.mo43079(i, bArr, i2, bArr2, this.f17094);
        short sM46472 = C20203.m46472(8, bArr2);
        if (sM46472 > this.f17094) {
            throw new IOException(C13645.m33382(sM46472, "Unexpected fragment length: "));
        }
        while (iMo43079 < sM46472) {
            int iMo43082 = interfaceC18490.mo43082(iMo43079, sM46472 - iMo43079, bArr2);
            if (iMo43082 == 0) {
                throw new IOException("Unexpected EOF");
            }
            iMo43079 += iMo43082;
        }
        return iMo43079;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m15011(AbstractC14080 abstractC14080, byte[] bArr, C3399 c3399) throws IOException {
        int i = c3399.f11057.f11058 - 24;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            int i4 = i3 + 24;
            int i5 = this.f17090;
            if (i4 > i5) {
                abstractC14080.f44581 &= -3;
                i3 = i5 - 24;
            } else {
                abstractC14080.f44581 |= 2;
                abstractC14080.f44580 = i3;
            }
            abstractC14080.f44578 = i3 + 24;
            if (i2 > 0) {
                abstractC14080.f44581 &= -2;
            }
            if ((abstractC14080.f44581 & 3) != 3) {
                c3399.f11056 = i2;
                c3399.f11055 = i2;
                c3399.f11058 = 0;
                c3399.f11057 = c3399;
                abstractC14080.m34247(c3399);
                c3399.m11138(abstractC14080.f44580);
                c3399.m11134(0);
                c3399.m11134(abstractC14080.mo5132());
            }
            if ((abstractC14080.f44581 & 2) == 2) {
                return i2;
            }
            int i6 = abstractC14080.f44578;
            InterfaceC18490 interfaceC18490 = this.f17096;
            if (interfaceC18490.mo43081()) {
                throw new IOException("DCERPC pipe is no longer open");
            }
            interfaceC18490.mo43080(i2, i6, bArr);
            i2 += i3;
        }
        throw new IOException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15013() {
        return this.f17094;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C14760 c14760 = this.f17091;
        this.f17095 = 0;
        try {
            this.f17096.close();
        } finally {
            c14760.close();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m15016() {
        return this.f17090;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:17:0x0032, B:19:0x0051, B:21:0x006d, B:26:0x0077, B:28:0x0086, B:27:0x0081), top: B:36:0x0032 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15015(AbstractC14080 abstractC14080) throws C7369 {
        C3399 c3399;
        boolean z = true;
        if (this.f17095 == 0) {
            synchronized (this) {
                try {
                    try {
                        this.f17095 = 1;
                        m15015(new C1403(this.f17093, this));
                    } catch (IOException e) {
                        this.f17095 = 0;
                        throw e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        byte[] bArrM18585 = this.f17092.mo2870().m18585();
        byte[] bArrM18586 = this.f17092.mo2870().m18585();
        try {
            C3399 c33910 = new C3399(bArrM18586, 0);
            abstractC14080.f44581 = 3;
            abstractC14080.f44583 = f17089.incrementAndGet();
            abstractC14080.mo6571(c33910);
            int iM15014 = m15014(m15011(abstractC14080, bArrM18586, c33910), abstractC14080.f44578, bArrM18586, bArrM18585);
            if (iM15014 != 0) {
                C3399 c33911 = new C3399(bArrM18585, 0);
                c33911.f11058 = 0;
                c33911.f11057 = c33911;
                c33911.f11055 = 8;
                c33911.f11057.f11058 = c33911.m11135();
                c33911.f11055 = 0;
                abstractC14080.m34246(c33911);
            }
            if (iM15014 != 0) {
                if ((abstractC14080.f44581 & 2) != 2) {
                    z = false;
                }
                if (!z) {
                    c3399 = new C3399(m15012(abstractC14080, bArrM18585), 0);
                } else {
                    c3399 = new C3399(bArrM18585, 0);
                }
            } else {
                c3399 = new C3399(bArrM18585, 0);
            }
            abstractC14080.mo6570(c3399);
            this.f17092.mo2870().m18584(bArrM18585);
            this.f17092.mo2870().m18584(bArrM18586);
            C7369 c7369Mo5134 = abstractC14080.mo5134();
            if (c7369Mo5134 != null) {
                throw c7369Mo5134;
            }
        } catch (Throwable th2) {
            this.f17092.mo2870().m18584(bArrM18585);
            this.f17092.mo2870().m18584(bArrM18586);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m15012(AbstractC14080 abstractC14080, byte[] bArr) throws IOException {
        int i = abstractC14080.f44579 == 2 ? abstractC14080.f44578 : 24;
        int i2 = this.f17094;
        byte[] bArr2 = new byte[i2];
        C3399 c3399 = new C3399(bArr2, 0);
        while ((abstractC14080.f44581 & 2) != 2) {
            InterfaceC18490 interfaceC18490 = this.f17096;
            int iMo43082 = interfaceC18490.mo43082(0, i2, bArr2);
            if (bArr2[0] != 5 || bArr2[1] != 0) {
                throw new IOException("Unexpected DCERPC PDU header");
            }
            short sM46472 = C20203.m46472(8, bArr2);
            if (sM46472 > i2) {
                throw new IOException(C13645.m33382(sM46472, "Unexpected fragment length: "));
            }
            while (iMo43082 < sM46472) {
                int iMo43083 = interfaceC18490.mo43082(iMo43082, sM46472 - iMo43082, bArr2);
                if (iMo43083 == 0) {
                    throw new IOException("Unexpected EOF");
                }
                iMo43082 += iMo43083;
            }
            c3399.f11058 = 0;
            c3399.f11057 = c3399;
            c3399.f11055 = 8;
            c3399.f11057.f11058 = c3399.m11135();
            c3399.f11055 = c3399.f11056;
            c3399.f11058 = 0;
            c3399.f11057 = c3399;
            abstractC14080.m34246(c3399);
            int i3 = abstractC14080.f44578 - 24;
            int i4 = i + i3;
            if (i4 > bArr.length) {
                byte[] bArr3 = new byte[i4];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                bArr = bArr3;
            }
            System.arraycopy(bArr2, 24, bArr, i, i3);
            i = i4;
        }
        return bArr;
    }

    public final String toString() {
        return this.f17093.toString();
    }
}
