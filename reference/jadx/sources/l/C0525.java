package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.List;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.֡ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9YE */
/* JADX INFO: loaded from: classes3.dex */
public final class C0525 extends AbstractC19170 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f2218 = C16980.m40038(C0525.class.getName());

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean f2219 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final char[] f2220 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DatagramPacket f2221;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18424 f2222;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f2223;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f2224;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0525(DatagramPacket datagramPacket) {
        super(0, 0, datagramPacket.getPort() == C3137.f10166);
        InterfaceC25186 interfaceC25186 = f2218;
        this.f2221 = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        C18424 c18424 = new C18424(datagramPacket.getData(), datagramPacket.getLength());
        this.f2222 = c18424;
        this.f2223 = System.currentTimeMillis();
        this.f2224 = 1460;
        try {
            try {
                m44435(c18424.m42951());
                m44425(c18424.m42951());
                if (m44433() > 0) {
                    throw new IOException("Received a message with a non standard operation code. Currently unsupported in the specification.");
                }
                int iM42951 = c18424.m42951();
                int iM42952 = c18424.m42951();
                int iM42953 = c18424.m42951();
                int iM42954 = c18424.m42951();
                interfaceC25186.mo13725("DNSIncoming() questions:{} answers:{} authorities:{} additionals:{}", Integer.valueOf(iM42951), Integer.valueOf(iM42952), Integer.valueOf(iM42953), Integer.valueOf(iM42954));
                if (((iM42952 + iM42953 + iM42954) * 11) + (iM42951 * 5) > datagramPacket.getLength()) {
                    throw new IOException("questions:" + iM42951 + " answers:" + iM42952 + " authorities:" + iM42953 + " additionals:" + iM42954);
                }
                if (iM42951 > 0) {
                    for (int i = 0; i < iM42951; i++) {
                        this.f62024.add(m2490());
                    }
                }
                if (iM42952 > 0) {
                    for (int i2 = 0; i2 < iM42952; i2++) {
                        AbstractC17152 abstractC17152M2489 = m2489(address);
                        if (abstractC17152M2489 != null) {
                            this.f62027.add(abstractC17152M2489);
                        }
                    }
                }
                if (iM42953 > 0) {
                    for (int i3 = 0; i3 < iM42953; i3++) {
                        AbstractC17152 abstractC17152M24810 = m2489(address);
                        if (abstractC17152M24810 != null) {
                            this.f62023.add(abstractC17152M24810);
                        }
                    }
                }
                if (iM42954 > 0) {
                    for (int i4 = 0; i4 < iM42954; i4++) {
                        AbstractC17152 abstractC17152M24811 = m2489(address);
                        if (abstractC17152M24811 != null) {
                            this.f62022.add(abstractC17152M24811);
                        }
                    }
                }
                if (this.f2222.available() > 0) {
                    throw new IOException("Received a message with the wrong length.");
                }
                try {
                    this.f2222.close();
                } catch (Exception unused) {
                    interfaceC25186.mo13729("MessageInputStream close error");
                }
            } catch (Throwable th) {
                try {
                    this.f2222.close();
                } catch (Exception unused2) {
                    interfaceC25186.mo13729("MessageInputStream close error");
                }
                throw th;
            }
        } catch (Exception e) {
            interfaceC25186.mo13702("DNSIncoming() dump " + m2491() + "\n exception ", (Throwable) e);
            IOException iOException = new IOException("DNSIncoming corrupted message");
            iOException.initCause(e);
            throw iOException;
        }
    }

    public C0525(int i, int i2, boolean z, DatagramPacket datagramPacket, long j) {
        super(i, i2, z);
        this.f2221 = datagramPacket;
        this.f2222 = new C18424(datagramPacket.getData(), datagramPacket.getLength());
        this.f2223 = j;
    }

    public final C0525 clone() {
        C0525 c0525 = new C0525(m44427(), m44436(), this.f62025, this.f2221, this.f2223);
        c0525.f2224 = this.f2224;
        c0525.f62024.addAll(this.f62024);
        c0525.f62027.addAll(this.f62027);
        c0525.f62023.addAll(this.f62023);
        c0525.f62022.addAll(this.f62022);
        return c0525;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C23120 m2490() {
        C18424 c18424 = this.f2222;
        String strM42949 = c18424.m42949();
        EnumC24021 enumC24021M53576 = EnumC24021.m53576(c18424.m42951());
        if (enumC24021M53576 == EnumC24021.TYPE_IGNORE) {
            f2218.mo13728(m2491(), "Could not find record type: {}");
        }
        int iM42951 = c18424.m42951();
        EnumC6121 enumC6121M17674 = EnumC6121.m17674(iM42951);
        return C23120.m52051(strM42949, enumC24021M53576, enumC6121M17674, enumC6121M17674.m17676(iM42951));
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0202  */
    /* JADX WARN: Code duplicated, block: B:88:0x0207  */
    /* JADX WARN: Code duplicated, block: B:90:0x020b  */
    /* JADX WARN: Code duplicated, block: B:91:0x020e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0212  */
    /* JADX WARN: Code duplicated, block: B:94:0x0217  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC17152 m2489(InetAddress inetAddress) throws IOException {
        byte b;
        char c;
        char c2;
        byte b2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        String str;
        String strM2488;
        String str2;
        String strM2489;
        AbstractC17152 abstractC17152;
        C18424 c18424 = this.f2222;
        String strM42949 = c18424.m42949();
        EnumC24021 enumC24021M53576 = EnumC24021.m53576(c18424.m42951());
        EnumC24021 enumC24021 = EnumC24021.TYPE_IGNORE;
        InterfaceC25186 interfaceC25186 = f2218;
        if (enumC24021M53576 == enumC24021) {
            interfaceC25186.mo13710("Could not find record type. domain: {}\n{}", strM42949, m2491());
        }
        int iM42951 = c18424.m42951();
        EnumC24021 enumC24022 = EnumC24021.TYPE_OPT;
        EnumC6121 enumC6121M17674 = enumC24021M53576 == enumC24022 ? EnumC6121.CLASS_UNKNOWN : EnumC6121.m17674(iM42951);
        int i = 2;
        if (enumC6121M17674 == EnumC6121.CLASS_UNKNOWN && enumC24021M53576 != enumC24022) {
            interfaceC25186.mo13703("Could not find record class. domain: {} type: {}\n{}", strM42949, enumC24021M53576, m2491());
        }
        boolean zM17676 = enumC6121M17674.m17676(iM42951);
        int iM42952 = (c18424.m42951() << 16) | c18424.m42951();
        int iM42953 = c18424.m42951();
        char c3 = 11;
        char c4 = 7;
        AbstractC17152 c13423 = null;
        int i2 = 4;
        switch (C21408.f68204[enumC24021M53576.ordinal()]) {
            case 1:
                byte[] bArr4 = new byte[iM42953];
                c18424.read(bArr4, 0, iM42953);
                c13423 = new C13423(strM42949, EnumC24021.TYPE_A, enumC6121M17674, zM17676, iM42952, bArr4);
                abstractC17152 = c13423;
                break;
            case 2:
                byte[] bArr5 = new byte[iM42953];
                c18424.read(bArr5, 0, iM42953);
                if (bArr5[0] == 0 && bArr5[1] == 0 && bArr5[2] == 0 && bArr5[3] == 0 && bArr5[4] == 0 && bArr5[5] == 0 && bArr5[6] == 0 && bArr5[7] == 0 && bArr5[8] == 0 && bArr5[9] == 0 && bArr5[10] == -1 && bArr5[11] == -1) {
                    interfaceC25186.mo13728(strM42949, "AAAA record with IPv4-mapped address for {}");
                } else {
                    c13423 = new C5966(strM42949, EnumC24021.TYPE_AAAA, enumC6121M17674, zM17676, iM42952, bArr5);
                }
                abstractC17152 = c13423;
                break;
            case 3:
            case 4:
                String strM429410 = c18424.m42949();
                if (strM429410.length() > 0) {
                    c13423 = new C2237(strM42949, enumC6121M17674, zM17676, iM42952, strM429410);
                } else {
                    interfaceC25186.mo13710("PTR record of class: {}, there was a problem reading the service name of the answer for domain: {}", enumC6121M17674, strM42949);
                }
                abstractC17152 = c13423;
                break;
            case 5:
                byte[] bArr6 = new byte[iM42953];
                c18424.read(bArr6, 0, iM42953);
                c13423 = new C25358(strM42949, enumC6121M17674, zM17676, iM42952, bArr6);
                abstractC17152 = c13423;
                break;
            case 6:
                c13423 = new C11931(strM42949, enumC6121M17674, zM17676, iM42952, c18424.m42951(), c18424.m42951(), c18424.m42951(), f2219 ? c18424.m42949() : c18424.m42950(c18424.m42952()));
                abstractC17152 = c13423;
                break;
            case 7:
                StringBuilder sb = new StringBuilder();
                sb.append(c18424.m42950(iM42953));
                int iIndexOf = sb.indexOf(" ");
                String strTrim = (iIndexOf > 0 ? sb.substring(0, iIndexOf) : sb.toString()).trim();
                String strTrim2 = (iIndexOf > 0 ? sb.substring(iIndexOf + 1) : "").trim();
                C15660 c15660 = new C15660(strM42949, EnumC24021.TYPE_HINFO, enumC6121M17674, zM17676, iM42952);
                c15660.f50893 = strTrim;
                c15660.f50894 = strTrim2;
                abstractC17152 = c15660;
                break;
            case 8:
                EnumC3883 enumC3883M12518 = EnumC3883.m12518(m44427(), iM42952);
                int i3 = (16711680 & iM42952) >> 16;
                if (i3 == 0) {
                    this.f2224 = iM42951;
                    int i4 = 3;
                    while (c18424.available() > 0) {
                        if (c18424.available() >= i) {
                            int iM42954 = c18424.m42951();
                            EnumC12086 enumC12086M30265 = EnumC12086.m30265(iM42954);
                            if (c18424.available() >= i) {
                                int iM42955 = c18424.m42951();
                                byte[] bArr7 = new byte[0];
                                if (c18424.available() >= iM42955) {
                                    bArr7 = new byte[iM42955];
                                    c18424.read(bArr7, 0, iM42955);
                                }
                                int i5 = C21408.f68205[enumC12086M30265.ordinal()];
                                if (i5 == 1) {
                                    try {
                                        b = bArr7[0];
                                        try {
                                            b2 = bArr7[1];
                                            try {
                                                bArr2 = new byte[6];
                                                bArr2[0] = bArr7[i];
                                                bArr2[1] = bArr7[i4];
                                                bArr2[i] = bArr7[i2];
                                                bArr2[i4] = bArr7[5];
                                                bArr2[i2] = bArr7[6];
                                                bArr2[5] = bArr7[c4];
                                                try {
                                                    if (bArr7.length > 8) {
                                                        try {
                                                            bArr3 = new byte[6];
                                                            bArr3[0] = bArr7[8];
                                                            bArr3[1] = bArr7[9];
                                                            bArr3[i] = bArr7[10];
                                                            bArr3[i4] = bArr7[c3];
                                                            bArr3[i2] = bArr7[12];
                                                            bArr3[5] = bArr7[13];
                                                        } catch (Exception unused) {
                                                            bArr3 = bArr2;
                                                            bArr = null;
                                                            c = 3;
                                                            c2 = 2;
                                                            interfaceC25186.mo13728(m2488(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                            if (interfaceC25186.mo13707()) {
                                                                Integer numValueOf = Integer.valueOf(b);
                                                                Integer numValueOf2 = Integer.valueOf(b2);
                                                                String strM24810 = m2488(bArr2);
                                                                if (bArr3 != bArr2) {
                                                                    str = " wakeup MAC address: ";
                                                                } else {
                                                                    str = "";
                                                                }
                                                                if (bArr3 != bArr2) {
                                                                    strM2488 = m2488(bArr3);
                                                                } else {
                                                                    strM2488 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    str2 = " password: ";
                                                                } else {
                                                                    str2 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    strM2489 = m2488(bArr);
                                                                } else {
                                                                    strM2489 = "";
                                                                }
                                                                Object[] objArr = new Object[7];
                                                                objArr[0] = numValueOf;
                                                                objArr[1] = numValueOf2;
                                                                objArr[c2] = strM24810;
                                                                objArr[c] = str;
                                                                objArr[4] = strM2488;
                                                                objArr[5] = str2;
                                                                objArr[6] = strM2489;
                                                                interfaceC25186.mo13725("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr);
                                                            }
                                                            i4 = 3;
                                                            i = 2;
                                                            c4 = 7;
                                                            i2 = 4;
                                                            c3 = 11;
                                                        }
                                                    } else {
                                                        bArr3 = bArr2;
                                                    }
                                                    try {
                                                        c = 3;
                                                        if (bArr7.length == 18) {
                                                            try {
                                                                bArr = new byte[i2];
                                                                bArr[0] = bArr7[14];
                                                                bArr[1] = bArr7[15];
                                                                bArr[i] = bArr7[16];
                                                                bArr[3] = bArr7[17];
                                                            } catch (Exception unused2) {
                                                                bArr = null;
                                                                c2 = 2;
                                                                interfaceC25186.mo13728(m2488(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                                if (interfaceC25186.mo13707()) {
                                                                    Integer numValueOf3 = Integer.valueOf(b);
                                                                    Integer numValueOf4 = Integer.valueOf(b2);
                                                                    String strM24811 = m2488(bArr2);
                                                                    if (bArr3 != bArr2) {
                                                                        str = " wakeup MAC address: ";
                                                                    } else {
                                                                        str = "";
                                                                    }
                                                                    if (bArr3 != bArr2) {
                                                                        strM2488 = m2488(bArr3);
                                                                    } else {
                                                                        strM2488 = "";
                                                                    }
                                                                    if (bArr != null) {
                                                                        str2 = " password: ";
                                                                    } else {
                                                                        str2 = "";
                                                                    }
                                                                    if (bArr != null) {
                                                                        strM2489 = m2488(bArr);
                                                                    } else {
                                                                        strM2489 = "";
                                                                    }
                                                                    Object[] objArr2 = new Object[7];
                                                                    objArr2[0] = numValueOf3;
                                                                    objArr2[1] = numValueOf4;
                                                                    objArr2[c2] = strM24811;
                                                                    objArr2[c] = str;
                                                                    objArr2[4] = strM2488;
                                                                    objArr2[5] = str2;
                                                                    objArr2[6] = strM2489;
                                                                    interfaceC25186.mo13725("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr2);
                                                                }
                                                                i4 = 3;
                                                                i = 2;
                                                                c4 = 7;
                                                                i2 = 4;
                                                                c3 = 11;
                                                            }
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        try {
                                                            c2 = 2;
                                                            if (bArr7.length == 22) {
                                                                try {
                                                                    byte[] bArr8 = new byte[8];
                                                                    bArr8[0] = bArr7[14];
                                                                    bArr8[1] = bArr7[15];
                                                                    bArr8[2] = bArr7[16];
                                                                    bArr8[3] = bArr7[17];
                                                                    bArr8[4] = bArr7[18];
                                                                    bArr8[5] = bArr7[19];
                                                                    bArr8[6] = bArr7[20];
                                                                    bArr8[c4] = bArr7[21];
                                                                    bArr = bArr8;
                                                                } catch (Exception unused3) {
                                                                    interfaceC25186.mo13728(m2488(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                                }
                                                            }
                                                        } catch (Exception unused4) {
                                                            c2 = 2;
                                                            interfaceC25186.mo13728(m2488(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                            if (interfaceC25186.mo13707()) {
                                                                Integer numValueOf5 = Integer.valueOf(b);
                                                                Integer numValueOf6 = Integer.valueOf(b2);
                                                                String strM24812 = m2488(bArr2);
                                                                if (bArr3 != bArr2) {
                                                                    str = " wakeup MAC address: ";
                                                                } else {
                                                                    str = "";
                                                                }
                                                                if (bArr3 != bArr2) {
                                                                    strM2488 = m2488(bArr3);
                                                                } else {
                                                                    strM2488 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    str2 = " password: ";
                                                                } else {
                                                                    str2 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    strM2489 = m2488(bArr);
                                                                } else {
                                                                    strM2489 = "";
                                                                }
                                                                Object[] objArr3 = new Object[7];
                                                                objArr3[0] = numValueOf5;
                                                                objArr3[1] = numValueOf6;
                                                                objArr3[c2] = strM24812;
                                                                objArr3[c] = str;
                                                                objArr3[4] = strM2488;
                                                                objArr3[5] = str2;
                                                                objArr3[6] = strM2489;
                                                                interfaceC25186.mo13725("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr3);
                                                            }
                                                            i4 = 3;
                                                            i = 2;
                                                            c4 = 7;
                                                            i2 = 4;
                                                            c3 = 11;
                                                        }
                                                    } catch (Exception unused5) {
                                                        c = 3;
                                                        c2 = 2;
                                                        bArr = null;
                                                        interfaceC25186.mo13728(m2488(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                        if (interfaceC25186.mo13707()) {
                                                            Integer numValueOf7 = Integer.valueOf(b);
                                                            Integer numValueOf8 = Integer.valueOf(b2);
                                                            String strM24813 = m2488(bArr2);
                                                            if (bArr3 != bArr2) {
                                                                str = " wakeup MAC address: ";
                                                            } else {
                                                                str = "";
                                                            }
                                                            if (bArr3 != bArr2) {
                                                                strM2488 = m2488(bArr3);
                                                            } else {
                                                                strM2488 = "";
                                                            }
                                                            if (bArr != null) {
                                                                str2 = " password: ";
                                                            } else {
                                                                str2 = "";
                                                            }
                                                            if (bArr != null) {
                                                                strM2489 = m2488(bArr);
                                                            } else {
                                                                strM2489 = "";
                                                            }
                                                            Object[] objArr4 = new Object[7];
                                                            objArr4[0] = numValueOf7;
                                                            objArr4[1] = numValueOf8;
                                                            objArr4[c2] = strM24813;
                                                            objArr4[c] = str;
                                                            objArr4[4] = strM2488;
                                                            objArr4[5] = str2;
                                                            objArr4[6] = strM2489;
                                                            interfaceC25186.mo13725("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr4);
                                                        }
                                                        i4 = 3;
                                                        i = 2;
                                                        c4 = 7;
                                                        i2 = 4;
                                                        c3 = 11;
                                                    }
                                                } catch (Exception unused6) {
                                                    bArr3 = bArr2;
                                                }
                                            } catch (Exception unused7) {
                                                c = 3;
                                                c2 = 2;
                                                bArr = null;
                                                bArr2 = null;
                                                bArr3 = null;
                                                interfaceC25186.mo13728(m2488(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                if (interfaceC25186.mo13707()) {
                                                    Integer numValueOf9 = Integer.valueOf(b);
                                                    Integer numValueOf10 = Integer.valueOf(b2);
                                                    String strM24814 = m2488(bArr2);
                                                    if (bArr3 != bArr2) {
                                                        str = " wakeup MAC address: ";
                                                    } else {
                                                        str = "";
                                                    }
                                                    if (bArr3 != bArr2) {
                                                        strM2488 = m2488(bArr3);
                                                    } else {
                                                        strM2488 = "";
                                                    }
                                                    if (bArr != null) {
                                                        str2 = " password: ";
                                                    } else {
                                                        str2 = "";
                                                    }
                                                    if (bArr != null) {
                                                        strM2489 = m2488(bArr);
                                                    } else {
                                                        strM2489 = "";
                                                    }
                                                    Object[] objArr5 = new Object[7];
                                                    objArr5[0] = numValueOf9;
                                                    objArr5[1] = numValueOf10;
                                                    objArr5[c2] = strM24814;
                                                    objArr5[c] = str;
                                                    objArr5[4] = strM2488;
                                                    objArr5[5] = str2;
                                                    objArr5[6] = strM2489;
                                                    interfaceC25186.mo13725("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr5);
                                                }
                                                i4 = 3;
                                                i = 2;
                                                c4 = 7;
                                                i2 = 4;
                                                c3 = 11;
                                            }
                                        } catch (Exception unused8) {
                                            c = 3;
                                            c2 = 2;
                                            b2 = 0;
                                            bArr = null;
                                            bArr2 = null;
                                            bArr3 = null;
                                            interfaceC25186.mo13728(m2488(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                            if (interfaceC25186.mo13707()) {
                                                Integer numValueOf11 = Integer.valueOf(b);
                                                Integer numValueOf12 = Integer.valueOf(b2);
                                                String strM24815 = m2488(bArr2);
                                                if (bArr3 != bArr2) {
                                                    str = " wakeup MAC address: ";
                                                } else {
                                                    str = "";
                                                }
                                                if (bArr3 != bArr2) {
                                                    strM2488 = m2488(bArr3);
                                                } else {
                                                    strM2488 = "";
                                                }
                                                if (bArr != null) {
                                                    str2 = " password: ";
                                                } else {
                                                    str2 = "";
                                                }
                                                if (bArr != null) {
                                                    strM2489 = m2488(bArr);
                                                } else {
                                                    strM2489 = "";
                                                }
                                                Object[] objArr6 = new Object[7];
                                                objArr6[0] = numValueOf11;
                                                objArr6[1] = numValueOf12;
                                                objArr6[c2] = strM24815;
                                                objArr6[c] = str;
                                                objArr6[4] = strM2488;
                                                objArr6[5] = str2;
                                                objArr6[6] = strM2489;
                                                interfaceC25186.mo13725("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr6);
                                            }
                                            i4 = 3;
                                            i = 2;
                                            c4 = 7;
                                            i2 = 4;
                                            c3 = 11;
                                        }
                                    } catch (Exception unused9) {
                                        b = 0;
                                    }
                                    if (interfaceC25186.mo13707()) {
                                        Integer numValueOf13 = Integer.valueOf(b);
                                        Integer numValueOf14 = Integer.valueOf(b2);
                                        String strM24816 = m2488(bArr2);
                                        if (bArr3 != bArr2) {
                                            str = " wakeup MAC address: ";
                                        } else {
                                            str = "";
                                        }
                                        if (bArr3 != bArr2) {
                                            strM2488 = m2488(bArr3);
                                        } else {
                                            strM2488 = "";
                                        }
                                        if (bArr != null) {
                                            str2 = " password: ";
                                        } else {
                                            str2 = "";
                                        }
                                        if (bArr != null) {
                                            strM2489 = m2488(bArr);
                                        } else {
                                            strM2489 = "";
                                        }
                                        Object[] objArr7 = new Object[7];
                                        objArr7[0] = numValueOf13;
                                        objArr7[1] = numValueOf14;
                                        objArr7[c2] = strM24816;
                                        objArr7[c] = str;
                                        objArr7[4] = strM2488;
                                        objArr7[5] = str2;
                                        objArr7[6] = strM2489;
                                        interfaceC25186.mo13725("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr7);
                                    }
                                    break;
                                } else if (i5 == i || i5 == i4 || i5 == i2) {
                                    if (interfaceC25186.mo13707()) {
                                        interfaceC25186.mo13701("There was an OPT answer. Option code: {} data: {}", enumC12086M30265, m2488(bArr7));
                                    }
                                } else if (i5 == 5) {
                                    if (iM42954 < 65001 || iM42954 > 65534) {
                                        interfaceC25186.mo13710("There was an OPT answer. Not currently handled. Option code: {} data: {}", Integer.valueOf(iM42954), m2488(bArr7));
                                    } else {
                                        interfaceC25186.mo13701("There was an OPT answer using an experimental/local option code: {} data: {}", Integer.valueOf(iM42954), m2488(bArr7));
                                    }
                                }
                                i4 = 3;
                                i = 2;
                                c4 = 7;
                                i2 = 4;
                                c3 = 11;
                            } else {
                                interfaceC25186.mo13729("There was a problem reading the OPT record. Ignoring.");
                            }
                        } else {
                            interfaceC25186.mo13729("There was a problem reading the OPT record. Ignoring.");
                        }
                    }
                } else {
                    interfaceC25186.mo13710("There was an OPT answer. Wrong version number: {} result code: {}", Integer.valueOf(i3), enumC3883M12518);
                }
                abstractC17152 = c13423;
                break;
            default:
                interfaceC25186.mo13716(enumC24021M53576, "DNSIncoming() unknown type: {}");
                c18424.skip(iM42953);
                abstractC17152 = c13423;
                break;
        }
        if (abstractC17152 != null) {
            abstractC17152.m40296(inetAddress);
        }
        return abstractC17152;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m2491() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append(toString());
        sb2.append("\n");
        for (C23120 c23120 : this.f62024) {
            sb2.append("\tquestion:      ");
            sb2.append(c23120);
            sb2.append("\n");
        }
        for (AbstractC17152 abstractC17152 : this.f62027) {
            sb2.append("\tanswer:        ");
            sb2.append(abstractC17152);
            sb2.append("\n");
        }
        for (AbstractC17152 abstractC17153 : this.f62023) {
            sb2.append("\tauthoritative: ");
            sb2.append(abstractC17153);
            sb2.append("\n");
        }
        for (AbstractC17152 abstractC17154 : this.f62022) {
            sb2.append("\tadditional:    ");
            sb2.append(abstractC17154);
            sb2.append("\n");
        }
        sb.append(sb2.toString());
        DatagramPacket datagramPacket = this.f2221;
        int length = datagramPacket.getLength();
        byte[] bArr = new byte[length];
        System.arraycopy(datagramPacket.getData(), 0, bArr, 0, length);
        StringBuilder sb3 = new StringBuilder(OpenAuthTask.SYS_ERR);
        int i = 0;
        while (i < length) {
            int iMin = Math.min(32, length - i);
            if (i < 16) {
                sb3.append(' ');
            }
            if (i < 256) {
                sb3.append(' ');
            }
            if (i < 4096) {
                sb3.append(' ');
            }
            sb3.append(Integer.toHexString(i));
            sb3.append(':');
            int i2 = 0;
            while (i2 < iMin) {
                if (i2 % 8 == 0) {
                    sb3.append(' ');
                }
                int i3 = i + i2;
                sb3.append(Integer.toHexString((bArr[i3] & 240) >> 4));
                sb3.append(Integer.toHexString(bArr[i3] & 15));
                i2++;
            }
            if (i2 < 32) {
                while (i2 < 32) {
                    if (i2 % 8 == 0) {
                        sb3.append(' ');
                    }
                    sb3.append(EnumC7687.f25319);
                    i2++;
                }
            }
            sb3.append(ASN1Dump.TAB);
            for (int i4 = 0; i4 < iMin; i4++) {
                if (i4 % 8 == 0) {
                    sb3.append(' ');
                }
                int i5 = bArr[i + i4] & 255;
                sb3.append((i5 <= 32 || i5 >= 127) ? '.' : (char) i5);
            }
            sb3.append("\n");
            i += 32;
            if (i >= 2048) {
                sb3.append("....\n");
                break;
            }
        }
        sb.append(sb3.toString());
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m44428() ? "dns[query," : "dns[response,");
        DatagramPacket datagramPacket = this.f2221;
        if (datagramPacket.getAddress() != null) {
            sb.append(datagramPacket.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(datagramPacket.getPort());
        sb.append(", length=");
        sb.append(datagramPacket.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(m44436()));
        if (m44427() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(m44427()));
            if ((m44427() & 32768) != 0) {
                sb.append(":r");
            }
            if ((m44427() & 1024) != 0) {
                sb.append(":aa");
            }
            if ((m44427() & 512) != 0) {
                sb.append(":tc");
            }
        }
        List<C23120> list = this.f62024;
        if (list.size() > 0) {
            sb.append(", questions=");
            sb.append(list.size());
        }
        List<AbstractC17152> list2 = this.f62027;
        if (list2.size() > 0) {
            sb.append(", answers=");
            sb.append(list2.size());
        }
        List<AbstractC17152> list3 = this.f62023;
        if (list3.size() > 0) {
            sb.append(", authorities=");
            sb.append(list3.size());
        }
        List<AbstractC17152> list4 = this.f62022;
        if (list4.size() > 0) {
            sb.append(", additionals=");
            sb.append(list4.size());
        }
        if (list.size() > 0) {
            sb.append("\nquestions:");
            for (C23120 c23120 : list) {
                sb.append("\n\t");
                sb.append(c23120);
            }
        }
        if (list2.size() > 0) {
            sb.append("\nanswers:");
            for (AbstractC17152 abstractC17152 : list2) {
                sb.append("\n\t");
                sb.append(abstractC17152);
            }
        }
        if (list3.size() > 0) {
            sb.append("\nauthorities:");
            for (AbstractC17152 abstractC17153 : list3) {
                sb.append("\n\t");
                sb.append(abstractC17153);
            }
        }
        if (list4.size() > 0) {
            sb.append("\nadditionals:");
            for (AbstractC17152 abstractC17154 : list4) {
                sb.append("\n\t");
                sb.append(abstractC17154);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2492(C0525 c0525) {
        if (m44428() && m44431() && c0525.m44428()) {
            this.f62024.addAll(c0525.f62024);
            this.f62027.addAll(c0525.f62027);
            this.f62023.addAll(c0525.f62023);
            this.f62022.addAll(c0525.f62022);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m2493() {
        return (int) (System.currentTimeMillis() - this.f2223);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m2494() {
        return this.f2224;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m2488(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            char[] cArr = f2220;
            sb.append(cArr[i / 16]);
            sb.append(cArr[i % 16]);
        }
        return sb.toString();
    }
}
