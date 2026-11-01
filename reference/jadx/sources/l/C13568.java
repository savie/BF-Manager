package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.List;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ܰۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J9YE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13568 extends AbstractC2277 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final DatagramPacket f44761;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f44762;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C4394 f44763;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f44764;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f44759 = C13488.m32998(C13568.class.getName());

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean f44758 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final char[] f44760 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13568(DatagramPacket datagramPacket) {
        super(0, 0, datagramPacket.getPort() == C17178.f54759);
        InterfaceC4314 interfaceC4314 = f44759;
        this.f44761 = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        C4394 c4394 = new C4394(datagramPacket.getData(), datagramPacket.getLength());
        this.f44763 = c4394;
        this.f44762 = System.currentTimeMillis();
        this.f44764 = 1460;
        try {
            try {
                m6983(c4394.m12254());
                m6977(c4394.m12254());
                if (m6978() > 0) {
                    throw new IOException("Received a message with a non standard operation code. Currently unsupported in the specification.");
                }
                int iM12254 = c4394.m12254();
                int iM12255 = c4394.m12254();
                int iM12256 = c4394.m12254();
                int iM12257 = c4394.m12254();
                interfaceC4314.mo12139("DNSIncoming() questions:{} answers:{} authorities:{} additionals:{}", Integer.valueOf(iM12254), Integer.valueOf(iM12255), Integer.valueOf(iM12256), Integer.valueOf(iM12257));
                if (((iM12255 + iM12256 + iM12257) * 11) + (iM12254 * 5) > datagramPacket.getLength()) {
                    throw new IOException("questions:" + iM12254 + " answers:" + iM12255 + " authorities:" + iM12256 + " additionals:" + iM12257);
                }
                if (iM12254 > 0) {
                    for (int i = 0; i < iM12254; i++) {
                        this.f8126.add(m33162());
                    }
                }
                if (iM12255 > 0) {
                    for (int i2 = 0; i2 < iM12255; i2++) {
                        AbstractC19918 abstractC19918M33161 = m33161(address);
                        if (abstractC19918M33161 != null) {
                            this.f8131.add(abstractC19918M33161);
                        }
                    }
                }
                if (iM12256 > 0) {
                    for (int i3 = 0; i3 < iM12256; i3++) {
                        AbstractC19918 abstractC19918M33162 = m33161(address);
                        if (abstractC19918M33162 != null) {
                            this.f8130.add(abstractC19918M33162);
                        }
                    }
                }
                if (iM12257 > 0) {
                    for (int i4 = 0; i4 < iM12257; i4++) {
                        AbstractC19918 abstractC19918M33163 = m33161(address);
                        if (abstractC19918M33163 != null) {
                            this.f8128.add(abstractC19918M33163);
                        }
                    }
                }
                if (this.f44763.available() > 0) {
                    throw new IOException("Received a message with the wrong length.");
                }
                try {
                    this.f44763.close();
                } catch (Exception unused) {
                    interfaceC4314.mo12116("MessageInputStream close error");
                }
            } catch (Throwable th) {
                try {
                    this.f44763.close();
                } catch (Exception unused2) {
                    interfaceC4314.mo12116("MessageInputStream close error");
                }
                throw th;
            }
        } catch (Exception e) {
            interfaceC4314.mo12122("DNSIncoming() dump " + m33164() + "\n exception ", (Throwable) e);
            IOException iOException = new IOException("DNSIncoming corrupted message");
            iOException.initCause(e);
            throw iOException;
        }
    }

    public C13568(int i, int i2, boolean z, DatagramPacket datagramPacket, long j) {
        super(i, i2, z);
        this.f44761 = datagramPacket;
        this.f44763 = new C4394(datagramPacket.getData(), datagramPacket.getLength());
        this.f44762 = j;
    }

    public final C13568 clone() {
        C13568 c13568 = new C13568(m6980(), m6974(), this.f8132, this.f44761, this.f44762);
        c13568.f44764 = this.f44764;
        c13568.f8126.addAll(this.f8126);
        c13568.f8131.addAll(this.f8131);
        c13568.f8130.addAll(this.f8130);
        c13568.f8128.addAll(this.f8128);
        return c13568;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C18506 m33162() {
        C4394 c4394 = this.f44763;
        String strM12255 = c4394.m12255();
        EnumC14357 enumC14357M34594 = EnumC14357.m34594(c4394.m12254());
        if (enumC14357M34594 == EnumC14357.TYPE_IGNORE) {
            f44759.mo12115(m33164(), "Could not find record type: {}");
        }
        int iM12254 = c4394.m12254();
        EnumC23529 enumC23529M51839 = EnumC23529.m51839(iM12254);
        return C18506.m42898(strM12255, enumC14357M34594, enumC23529M51839, enumC23529M51839.m51841(iM12254));
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [l.᩶ۘ۠] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
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
    private AbstractC19918 m33161(InetAddress inetAddress) throws IOException {
        byte b;
        char c;
        char c2;
        byte b2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        String str;
        String strM33160;
        String str2;
        String strM33161;
        ?? r10;
        C4394 c4394 = this.f44763;
        String strM12255 = c4394.m12255();
        EnumC14357 enumC14357M34594 = EnumC14357.m34594(c4394.m12254());
        EnumC14357 enumC14357 = EnumC14357.TYPE_IGNORE;
        InterfaceC4314 interfaceC4314 = f44759;
        if (enumC14357M34594 == enumC14357) {
            interfaceC4314.mo12132("Could not find record type. domain: {}\n{}", strM12255, m33164());
        }
        int iM12254 = c4394.m12254();
        EnumC14357 enumC14358 = EnumC14357.TYPE_OPT;
        EnumC23529 enumC23529M51839 = enumC14357M34594 == enumC14358 ? EnumC23529.CLASS_UNKNOWN : EnumC23529.m51839(iM12254);
        int i = 2;
        if (enumC23529M51839 == EnumC23529.CLASS_UNKNOWN && enumC14357M34594 != enumC14358) {
            interfaceC4314.mo12123("Could not find record class. domain: {} type: {}\n{}", strM12255, enumC14357M34594, m33164());
        }
        boolean zM51841 = enumC23529M51839.m51841(iM12254);
        int iM12255 = (c4394.m12254() << 16) | c4394.m12254();
        int iM12256 = c4394.m12254();
        char c3 = 11;
        char c4 = 7;
        Object c8629 = null;
        int i2 = 4;
        switch (C3252.f12092[enumC14357M34594.ordinal()]) {
            case 1:
                byte[] bArr4 = new byte[iM12256];
                c4394.read(bArr4, 0, iM12256);
                c8629 = new C8629(strM12255, EnumC14357.TYPE_A, enumC23529M51839, zM51841, iM12255, bArr4);
                r10 = c8629;
                break;
            case 2:
                byte[] bArr5 = new byte[iM12256];
                c4394.read(bArr5, 0, iM12256);
                if (bArr5[0] == 0 && bArr5[1] == 0 && bArr5[2] == 0 && bArr5[3] == 0 && bArr5[4] == 0 && bArr5[5] == 0 && bArr5[6] == 0 && bArr5[7] == 0 && bArr5[8] == 0 && bArr5[9] == 0 && bArr5[10] == -1 && bArr5[11] == -1) {
                    interfaceC4314.mo12115(strM12255, "AAAA record with IPv4-mapped address for {}");
                } else {
                    c8629 = new C10040(strM12255, EnumC14357.TYPE_AAAA, enumC23529M51839, zM51841, iM12255, bArr5);
                }
                r10 = c8629;
                break;
            case 3:
            case 4:
                String strM12256 = c4394.m12255();
                if (strM12256.length() > 0) {
                    c8629 = new C7217(strM12255, enumC23529M51839, zM51841, iM12255, strM12256);
                } else {
                    interfaceC4314.mo12132("PTR record of class: {}, there was a problem reading the service name of the answer for domain: {}", enumC23529M51839, strM12255);
                }
                r10 = c8629;
                break;
            case 5:
                byte[] bArr6 = new byte[iM12256];
                c4394.read(bArr6, 0, iM12256);
                c8629 = new C15685(strM12255, enumC23529M51839, zM51841, iM12255, bArr6);
                r10 = c8629;
                break;
            case 6:
                c8629 = new C20623(strM12255, enumC23529M51839, zM51841, iM12255, c4394.m12254(), c4394.m12254(), c4394.m12254(), f44758 ? c4394.m12255() : c4394.m12256(c4394.m12257()));
                r10 = c8629;
                break;
            case 7:
                StringBuilder sb = new StringBuilder();
                sb.append(c4394.m12256(iM12256));
                int iIndexOf = sb.indexOf(" ");
                String strTrim = (iIndexOf > 0 ? sb.substring(0, iIndexOf) : sb.toString()).trim();
                String strTrim2 = (iIndexOf > 0 ? sb.substring(iIndexOf + 1) : "").trim();
                C19212 c19212 = new C19212(strM12255, EnumC14357.TYPE_HINFO, enumC23529M51839, zM51841, iM12255);
                c19212.f62038 = strTrim;
                c19212.f62039 = strTrim2;
                r10 = c19212;
                break;
            case 8:
                EnumC1655 enumC1655M5558 = EnumC1655.m5558(m6980(), iM12255);
                int i3 = (16711680 & iM12255) >> 16;
                if (i3 == 0) {
                    this.f44764 = iM12254;
                    int i4 = 3;
                    while (c4394.available() > 0) {
                        if (c4394.available() >= i) {
                            int iM12257 = c4394.m12254();
                            EnumC10829 enumC10829M27148 = EnumC10829.m27148(iM12257);
                            if (c4394.available() >= i) {
                                int iM12258 = c4394.m12254();
                                byte[] bArr7 = new byte[0];
                                if (c4394.available() >= iM12258) {
                                    bArr7 = new byte[iM12258];
                                    c4394.read(bArr7, 0, iM12258);
                                }
                                int i5 = C3252.f12093[enumC10829M27148.ordinal()];
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
                                                            interfaceC4314.mo12115(m33160(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                            if (interfaceC4314.mo12125()) {
                                                                Integer numValueOf = Integer.valueOf(b);
                                                                Integer numValueOf2 = Integer.valueOf(b2);
                                                                String strM33162 = m33160(bArr2);
                                                                if (bArr3 != bArr2) {
                                                                    str = " wakeup MAC address: ";
                                                                } else {
                                                                    str = "";
                                                                }
                                                                if (bArr3 != bArr2) {
                                                                    strM33160 = m33160(bArr3);
                                                                } else {
                                                                    strM33160 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    str2 = " password: ";
                                                                } else {
                                                                    str2 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    strM33161 = m33160(bArr);
                                                                } else {
                                                                    strM33161 = "";
                                                                }
                                                                Object[] objArr = new Object[7];
                                                                objArr[0] = numValueOf;
                                                                objArr[1] = numValueOf2;
                                                                objArr[c2] = strM33162;
                                                                objArr[c] = str;
                                                                objArr[4] = strM33160;
                                                                objArr[5] = str2;
                                                                objArr[6] = strM33161;
                                                                interfaceC4314.mo12139("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr);
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
                                                                interfaceC4314.mo12115(m33160(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                                if (interfaceC4314.mo12125()) {
                                                                    Integer numValueOf3 = Integer.valueOf(b);
                                                                    Integer numValueOf4 = Integer.valueOf(b2);
                                                                    String strM33163 = m33160(bArr2);
                                                                    if (bArr3 != bArr2) {
                                                                        str = " wakeup MAC address: ";
                                                                    } else {
                                                                        str = "";
                                                                    }
                                                                    if (bArr3 != bArr2) {
                                                                        strM33160 = m33160(bArr3);
                                                                    } else {
                                                                        strM33160 = "";
                                                                    }
                                                                    if (bArr != null) {
                                                                        str2 = " password: ";
                                                                    } else {
                                                                        str2 = "";
                                                                    }
                                                                    if (bArr != null) {
                                                                        strM33161 = m33160(bArr);
                                                                    } else {
                                                                        strM33161 = "";
                                                                    }
                                                                    Object[] objArr2 = new Object[7];
                                                                    objArr2[0] = numValueOf3;
                                                                    objArr2[1] = numValueOf4;
                                                                    objArr2[c2] = strM33163;
                                                                    objArr2[c] = str;
                                                                    objArr2[4] = strM33160;
                                                                    objArr2[5] = str2;
                                                                    objArr2[6] = strM33161;
                                                                    interfaceC4314.mo12139("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr2);
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
                                                                    interfaceC4314.mo12115(m33160(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                                }
                                                            }
                                                        } catch (Exception unused4) {
                                                            c2 = 2;
                                                            interfaceC4314.mo12115(m33160(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                            if (interfaceC4314.mo12125()) {
                                                                Integer numValueOf5 = Integer.valueOf(b);
                                                                Integer numValueOf6 = Integer.valueOf(b2);
                                                                String strM33164 = m33160(bArr2);
                                                                if (bArr3 != bArr2) {
                                                                    str = " wakeup MAC address: ";
                                                                } else {
                                                                    str = "";
                                                                }
                                                                if (bArr3 != bArr2) {
                                                                    strM33160 = m33160(bArr3);
                                                                } else {
                                                                    strM33160 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    str2 = " password: ";
                                                                } else {
                                                                    str2 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    strM33161 = m33160(bArr);
                                                                } else {
                                                                    strM33161 = "";
                                                                }
                                                                Object[] objArr3 = new Object[7];
                                                                objArr3[0] = numValueOf5;
                                                                objArr3[1] = numValueOf6;
                                                                objArr3[c2] = strM33164;
                                                                objArr3[c] = str;
                                                                objArr3[4] = strM33160;
                                                                objArr3[5] = str2;
                                                                objArr3[6] = strM33161;
                                                                interfaceC4314.mo12139("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr3);
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
                                                        interfaceC4314.mo12115(m33160(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                        if (interfaceC4314.mo12125()) {
                                                            Integer numValueOf7 = Integer.valueOf(b);
                                                            Integer numValueOf8 = Integer.valueOf(b2);
                                                            String strM33165 = m33160(bArr2);
                                                            if (bArr3 != bArr2) {
                                                                str = " wakeup MAC address: ";
                                                            } else {
                                                                str = "";
                                                            }
                                                            if (bArr3 != bArr2) {
                                                                strM33160 = m33160(bArr3);
                                                            } else {
                                                                strM33160 = "";
                                                            }
                                                            if (bArr != null) {
                                                                str2 = " password: ";
                                                            } else {
                                                                str2 = "";
                                                            }
                                                            if (bArr != null) {
                                                                strM33161 = m33160(bArr);
                                                            } else {
                                                                strM33161 = "";
                                                            }
                                                            Object[] objArr4 = new Object[7];
                                                            objArr4[0] = numValueOf7;
                                                            objArr4[1] = numValueOf8;
                                                            objArr4[c2] = strM33165;
                                                            objArr4[c] = str;
                                                            objArr4[4] = strM33160;
                                                            objArr4[5] = str2;
                                                            objArr4[6] = strM33161;
                                                            interfaceC4314.mo12139("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr4);
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
                                                interfaceC4314.mo12115(m33160(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                if (interfaceC4314.mo12125()) {
                                                    Integer numValueOf9 = Integer.valueOf(b);
                                                    Integer numValueOf10 = Integer.valueOf(b2);
                                                    String strM33166 = m33160(bArr2);
                                                    if (bArr3 != bArr2) {
                                                        str = " wakeup MAC address: ";
                                                    } else {
                                                        str = "";
                                                    }
                                                    if (bArr3 != bArr2) {
                                                        strM33160 = m33160(bArr3);
                                                    } else {
                                                        strM33160 = "";
                                                    }
                                                    if (bArr != null) {
                                                        str2 = " password: ";
                                                    } else {
                                                        str2 = "";
                                                    }
                                                    if (bArr != null) {
                                                        strM33161 = m33160(bArr);
                                                    } else {
                                                        strM33161 = "";
                                                    }
                                                    Object[] objArr5 = new Object[7];
                                                    objArr5[0] = numValueOf9;
                                                    objArr5[1] = numValueOf10;
                                                    objArr5[c2] = strM33166;
                                                    objArr5[c] = str;
                                                    objArr5[4] = strM33160;
                                                    objArr5[5] = str2;
                                                    objArr5[6] = strM33161;
                                                    interfaceC4314.mo12139("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr5);
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
                                            interfaceC4314.mo12115(m33160(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                            if (interfaceC4314.mo12125()) {
                                                Integer numValueOf11 = Integer.valueOf(b);
                                                Integer numValueOf12 = Integer.valueOf(b2);
                                                String strM33167 = m33160(bArr2);
                                                if (bArr3 != bArr2) {
                                                    str = " wakeup MAC address: ";
                                                } else {
                                                    str = "";
                                                }
                                                if (bArr3 != bArr2) {
                                                    strM33160 = m33160(bArr3);
                                                } else {
                                                    strM33160 = "";
                                                }
                                                if (bArr != null) {
                                                    str2 = " password: ";
                                                } else {
                                                    str2 = "";
                                                }
                                                if (bArr != null) {
                                                    strM33161 = m33160(bArr);
                                                } else {
                                                    strM33161 = "";
                                                }
                                                Object[] objArr6 = new Object[7];
                                                objArr6[0] = numValueOf11;
                                                objArr6[1] = numValueOf12;
                                                objArr6[c2] = strM33167;
                                                objArr6[c] = str;
                                                objArr6[4] = strM33160;
                                                objArr6[5] = str2;
                                                objArr6[6] = strM33161;
                                                interfaceC4314.mo12139("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr6);
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
                                    if (interfaceC4314.mo12125()) {
                                        Integer numValueOf13 = Integer.valueOf(b);
                                        Integer numValueOf14 = Integer.valueOf(b2);
                                        String strM33168 = m33160(bArr2);
                                        if (bArr3 != bArr2) {
                                            str = " wakeup MAC address: ";
                                        } else {
                                            str = "";
                                        }
                                        if (bArr3 != bArr2) {
                                            strM33160 = m33160(bArr3);
                                        } else {
                                            strM33160 = "";
                                        }
                                        if (bArr != null) {
                                            str2 = " password: ";
                                        } else {
                                            str2 = "";
                                        }
                                        if (bArr != null) {
                                            strM33161 = m33160(bArr);
                                        } else {
                                            strM33161 = "";
                                        }
                                        Object[] objArr7 = new Object[7];
                                        objArr7[0] = numValueOf13;
                                        objArr7[1] = numValueOf14;
                                        objArr7[c2] = strM33168;
                                        objArr7[c] = str;
                                        objArr7[4] = strM33160;
                                        objArr7[5] = str2;
                                        objArr7[6] = strM33161;
                                        interfaceC4314.mo12139("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr7);
                                    }
                                    break;
                                } else if (i5 == i || i5 == i4 || i5 == i2) {
                                    if (interfaceC4314.mo12125()) {
                                        interfaceC4314.mo12121("There was an OPT answer. Option code: {} data: {}", enumC10829M27148, m33160(bArr7));
                                    }
                                } else if (i5 == 5) {
                                    if (iM12257 < 65001 || iM12257 > 65534) {
                                        interfaceC4314.mo12132("There was an OPT answer. Not currently handled. Option code: {} data: {}", Integer.valueOf(iM12257), m33160(bArr7));
                                    } else {
                                        interfaceC4314.mo12121("There was an OPT answer using an experimental/local option code: {} data: {}", Integer.valueOf(iM12257), m33160(bArr7));
                                    }
                                }
                                i4 = 3;
                                i = 2;
                                c4 = 7;
                                i2 = 4;
                                c3 = 11;
                            } else {
                                interfaceC4314.mo12116("There was a problem reading the OPT record. Ignoring.");
                            }
                        } else {
                            interfaceC4314.mo12116("There was a problem reading the OPT record. Ignoring.");
                        }
                    }
                } else {
                    interfaceC4314.mo12132("There was an OPT answer. Wrong version number: {} result code: {}", Integer.valueOf(i3), enumC1655M5558);
                }
                r10 = c8629;
                break;
            default:
                interfaceC4314.mo12126(enumC14357M34594, "DNSIncoming() unknown type: {}");
                c4394.skip(iM12256);
                r10 = c8629;
                break;
        }
        if (r10 != 0) {
            r10.m45203(inetAddress);
        }
        return r10;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m33164() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append(toString());
        sb2.append("\n");
        for (C18506 c18506 : this.f8126) {
            sb2.append("\tquestion:      ");
            sb2.append(c18506);
            sb2.append("\n");
        }
        for (AbstractC19918 abstractC19918 : this.f8131) {
            sb2.append("\tanswer:        ");
            sb2.append(abstractC19918);
            sb2.append("\n");
        }
        for (AbstractC19918 abstractC19919 : this.f8130) {
            sb2.append("\tauthoritative: ");
            sb2.append(abstractC19919);
            sb2.append("\n");
        }
        for (AbstractC19918 abstractC199110 : this.f8128) {
            sb2.append("\tadditional:    ");
            sb2.append(abstractC199110);
            sb2.append("\n");
        }
        sb.append(sb2.toString());
        DatagramPacket datagramPacket = this.f44761;
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
                    sb3.append(EnumC19730.f63352);
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
        sb.append(m6979() ? "dns[query," : "dns[response,");
        DatagramPacket datagramPacket = this.f44761;
        if (datagramPacket.getAddress() != null) {
            sb.append(datagramPacket.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(datagramPacket.getPort());
        sb.append(", length=");
        sb.append(datagramPacket.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(m6974()));
        if (m6980() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(m6980()));
            if ((m6980() & 32768) != 0) {
                sb.append(":r");
            }
            if ((m6980() & 1024) != 0) {
                sb.append(":aa");
            }
            if ((m6980() & 512) != 0) {
                sb.append(":tc");
            }
        }
        List<C18506> list = this.f8126;
        if (list.size() > 0) {
            sb.append(", questions=");
            sb.append(list.size());
        }
        List<AbstractC19918> list2 = this.f8131;
        if (list2.size() > 0) {
            sb.append(", answers=");
            sb.append(list2.size());
        }
        List<AbstractC19918> list3 = this.f8130;
        if (list3.size() > 0) {
            sb.append(", authorities=");
            sb.append(list3.size());
        }
        List<AbstractC19918> list4 = this.f8128;
        if (list4.size() > 0) {
            sb.append(", additionals=");
            sb.append(list4.size());
        }
        if (list.size() > 0) {
            sb.append("\nquestions:");
            for (C18506 c18506 : list) {
                sb.append("\n\t");
                sb.append(c18506);
            }
        }
        if (list2.size() > 0) {
            sb.append("\nanswers:");
            for (AbstractC19918 abstractC19918 : list2) {
                sb.append("\n\t");
                sb.append(abstractC19918);
            }
        }
        if (list3.size() > 0) {
            sb.append("\nauthorities:");
            for (AbstractC19918 abstractC19919 : list3) {
                sb.append("\n\t");
                sb.append(abstractC19919);
            }
        }
        if (list4.size() > 0) {
            sb.append("\nadditionals:");
            for (AbstractC19918 abstractC199110 : list4) {
                sb.append("\n\t");
                sb.append(abstractC199110);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33163(C13568 c13568) {
        if (m6979() && m6984() && c13568.m6979()) {
            this.f8126.addAll(c13568.f8126);
            this.f8131.addAll(c13568.f8131);
            this.f8130.addAll(c13568.f8130);
            this.f8128.addAll(c13568.f8128);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m33165() {
        return (int) (System.currentTimeMillis() - this.f44762);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m33166() {
        return this.f44764;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m33160(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            char[] cArr = f44760;
            sb.append(cArr[i / 16]);
            sb.append(cArr[i % 16]);
        }
        return sb.toString();
    }
}
