package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܶܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D9YD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15310 implements InterfaceC13193, AutoCloseable {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49880 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f49881 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f49882;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC19067 f49883;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14420 f49884;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1197 f49885;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f49886;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f49887;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC9481 f49888;

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    public C15310(String str, InterfaceC19067 interfaceC19067) throws C6842 {
        String strTrim;
        int iIndexOf;
        char[] charArray = str.toCharArray();
        int length = 0;
        char c = 0;
        int i = 0;
        String strTrim2 = null;
        C1197 c1197 = null;
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
                            if (c1197 != null) {
                                c1197.m4381(strTrim2, strTrim3);
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
                        c1197 = new C1197(str2, strTrim);
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
                        c1197 = new C1197(str2, strTrim);
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
        if (c1197 == null || c1197.m4380() == null) {
            throw new C6842("Invalid binding URL: ".concat(str));
        }
        this.f49886 = 4280;
        this.f49882 = 4280;
        this.f49887 = 0;
        this.f49883 = interfaceC19067;
        this.f49885 = c1197;
        String str3 = "smb://" + c1197.m4378() + "/IPC$/" + c1197.m4380().substring(6);
        String str4 = (String) c1197.m4379("server");
        String strConcat = str4 != null ? "&server=".concat(str4) : "";
        String str5 = (String) c1197.m4379("address");
        strConcat = str5 != null ? C1679.m5594(strConcat, "&address=", str5) : strConcat;
        C14420 c14420 = new C14420(strConcat.length() > 0 ? C0242.m1616(1, strConcat, C3012.m8976(str3, "?")) : str3, interfaceC19067);
        this.f49884 = c14420;
        InterfaceC9481 interfaceC9481M34689 = c14420.m34689();
        interfaceC9481M34689.mo5724();
        this.f49888 = interfaceC9481M34689;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36666(int i, int i2, byte[] bArr, byte[] bArr2) throws IOException {
        InterfaceC9481 interfaceC9481 = this.f49888;
        if (interfaceC9481.mo5726()) {
            throw new IOException("DCERPC pipe is no longer open");
        }
        int iMo5718 = interfaceC9481.mo5718(i, bArr, i2, bArr2, this.f49882);
        short sM30667 = C12344.m30667(8, bArr2);
        if (sM30667 > this.f49882) {
            throw new IOException(C8479.m22141(sM30667, "Unexpected fragment length: "));
        }
        while (iMo5718 < sM30667) {
            int iMo5721 = interfaceC9481.mo5721(iMo5718, sM30667 - iMo5718, bArr2);
            if (iMo5721 == 0) {
                throw new IOException("Unexpected EOF");
            }
            iMo5718 += iMo5721;
        }
        return iMo5718;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m36663(AbstractC23071 abstractC23071, byte[] bArr, C17426 c17426) throws IOException {
        int i = c17426.f55444.f55440 - 24;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            int i4 = i3 + 24;
            int i5 = this.f49886;
            if (i4 > i5) {
                abstractC23071.f74952 &= -3;
                i3 = i5 - 24;
            } else {
                abstractC23071.f74952 |= 2;
                abstractC23071.f74954 = i3;
            }
            abstractC23071.f74955 = i3 + 24;
            if (i2 > 0) {
                abstractC23071.f74952 &= -2;
            }
            if ((abstractC23071.f74952 & 3) != 3) {
                c17426.f55442 = i2;
                c17426.f55443 = i2;
                c17426.f55440 = 0;
                c17426.f55444 = c17426;
                abstractC23071.m51047(c17426);
                c17426.m40622(abstractC23071.f74954);
                c17426.m40627(0);
                c17426.m40627(abstractC23071.mo37991());
            }
            if ((abstractC23071.f74952 & 2) == 2) {
                return i2;
            }
            int i6 = abstractC23071.f74955;
            InterfaceC9481 interfaceC9481 = this.f49888;
            if (interfaceC9481.mo5726()) {
                throw new IOException("DCERPC pipe is no longer open");
            }
            interfaceC9481.mo5720(i2, i6, bArr);
            i2 += i3;
        }
        throw new IOException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36665() {
        return this.f49882;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C14420 c14420 = this.f49884;
        this.f49887 = 0;
        try {
            this.f49888.close();
        } finally {
            c14420.close();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m36668() {
        return this.f49886;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:17:0x0032, B:19:0x0051, B:21:0x006d, B:26:0x0077, B:28:0x0086, B:27:0x0081), top: B:36:0x0032 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36667(AbstractC23071 abstractC23071) throws C6842 {
        C17426 c17426;
        boolean z = true;
        if (this.f49887 == 0) {
            synchronized (this) {
                try {
                    try {
                        this.f49887 = 1;
                        m36667(new C22365(this.f49885, this));
                    } catch (IOException e) {
                        this.f49887 = 0;
                        throw e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        byte[] bArrM28137 = this.f49883.mo29448().m28137();
        byte[] bArrM28138 = this.f49883.mo29448().m28137();
        try {
            C17426 c17427 = new C17426(bArrM28138, 0);
            abstractC23071.f74952 = 3;
            abstractC23071.f74957 = f49881.incrementAndGet();
            abstractC23071.mo2371(c17427);
            int iM36666 = m36666(m36663(abstractC23071, bArrM28138, c17427), abstractC23071.f74955, bArrM28138, bArrM28137);
            if (iM36666 != 0) {
                C17426 c17428 = new C17426(bArrM28137, 0);
                c17428.f55440 = 0;
                c17428.f55444 = c17428;
                c17428.f55443 = 8;
                c17428.f55444.f55440 = c17428.m40630();
                c17428.f55443 = 0;
                abstractC23071.m51048(c17428);
            }
            if (iM36666 != 0) {
                if ((abstractC23071.f74952 & 2) != 2) {
                    z = false;
                }
                if (!z) {
                    c17426 = new C17426(m36664(abstractC23071, bArrM28137), 0);
                } else {
                    c17426 = new C17426(bArrM28137, 0);
                }
            } else {
                c17426 = new C17426(bArrM28137, 0);
            }
            abstractC23071.mo2370(c17426);
            this.f49883.mo29448().m28136(bArrM28137);
            this.f49883.mo29448().m28136(bArrM28138);
            C6842 c6842Mo49597 = abstractC23071.mo49597();
            if (c6842Mo49597 != null) {
                throw c6842Mo49597;
            }
        } catch (Throwable th2) {
            this.f49883.mo29448().m28136(bArrM28137);
            this.f49883.mo29448().m28136(bArrM28138);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m36664(AbstractC23071 abstractC23071, byte[] bArr) throws IOException {
        int i = abstractC23071.f74953 == 2 ? abstractC23071.f74955 : 24;
        int i2 = this.f49882;
        byte[] bArr2 = new byte[i2];
        C17426 c17426 = new C17426(bArr2, 0);
        while ((abstractC23071.f74952 & 2) != 2) {
            InterfaceC9481 interfaceC9481 = this.f49888;
            int iMo5721 = interfaceC9481.mo5721(0, i2, bArr2);
            if (bArr2[0] != 5 || bArr2[1] != 0) {
                throw new IOException("Unexpected DCERPC PDU header");
            }
            short sM30667 = C12344.m30667(8, bArr2);
            if (sM30667 > i2) {
                throw new IOException(C8479.m22141(sM30667, "Unexpected fragment length: "));
            }
            while (iMo5721 < sM30667) {
                int iMo5722 = interfaceC9481.mo5721(iMo5721, sM30667 - iMo5721, bArr2);
                if (iMo5722 == 0) {
                    throw new IOException("Unexpected EOF");
                }
                iMo5721 += iMo5722;
            }
            c17426.f55440 = 0;
            c17426.f55444 = c17426;
            c17426.f55443 = 8;
            c17426.f55444.f55440 = c17426.m40630();
            c17426.f55443 = c17426.f55442;
            c17426.f55440 = 0;
            c17426.f55444 = c17426;
            abstractC23071.m51048(c17426);
            int i3 = abstractC23071.f74955 - 24;
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
        return this.f49885.toString();
    }
}
