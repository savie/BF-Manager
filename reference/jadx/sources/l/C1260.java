package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֨ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A774 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1260 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f4542;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f4543;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f4544;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f4545;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f4546;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f4547;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f4548;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f4549;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f4550;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f4551;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f4552;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f4553;

    public C1260(int i, String str, byte[] bArr, byte[] bArr2, String str2, String str3, byte[] bArr3, String str4, String str5, int i2, int i3) {
        this.f4548 = i2;
        this.f4547 = i;
        this.f4549 = str;
        this.f4553 = str4;
        this.f4551 = str5;
        this.f4546 = i3;
        this.f4544 = Arrays.copyOf(bArr, bArr.length);
        this.f4542 = C15022.m36182(bArr);
        this.f4550 = str2;
        this.f4552 = str3;
        this.f4543 = Arrays.copyOf(bArr2, bArr2.length);
        this.f4545 = Arrays.copyOf(bArr3, bArr3.length);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1260 m4574(int i, String str, String str2, String str3, byte[] bArr) {
        return new C1260(i, str, m4572(i, str), C15022.m36179().digest(bArr), str2, str3, bArr, null, null, 0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1260 m4566(int i, String str, String str2, String str3, byte[] bArr) {
        return new C1260(i, str, m4572(i, str), C15022.m36179().digest(bArr), "missing", C4287.m13663(bArr), bArr, str2, str3, 0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1260 m4576(String str, byte[] bArr, String str2) {
        return new C1260(this.f4547, this.f4549, this.f4544, C15022.m36179().digest(bArr), str, str2, bArr, this.f4553, this.f4551, 0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4578() {
        return this.f4548 == 0 && this.f4553 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1260 m4567(String str, int i, int i2, String str2) {
        if (i2 < 0 || i2 > 65536) {
            throw new IllegalArgumentException("Invalid resource type entry count");
        }
        byte[] bArr = new byte[0];
        C6178 c6178 = new C6178(64);
        c6178.writeInt(1);
        c6178.writeInt(i);
        c6178.m17800(str);
        c6178.writeInt(2);
        return new C1260(i, str, c6178.m17791(C15022.m36179()), C15022.m36179().digest(bArr), "missing", "missing", bArr, str2, null, 2, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1260 m4568(String str, int i, String str2, String str3) {
        byte[] bArr = new byte[0];
        C6178 c6178 = new C6178(64);
        c6178.writeInt(1);
        c6178.writeInt(i);
        c6178.m17800(str);
        c6178.writeInt(1);
        return new C1260(i, str, c6178.m17791(C15022.m36179()), C15022.m36179().digest(bArr), "missing", "missing", bArr, str2, str3, 1, 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m4580() {
        return this.f4548 != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m4579() {
        return this.f4548 == 2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1260 m4575(AbstractC22044 abstractC22044) throws C10186 {
        String str;
        String str2;
        byte[] bArrM17791;
        String name = abstractC22044.getName();
        if (!m4571(name)) {
            throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Invalid resource patch file name.");
        }
        try {
            byte[] bArrM49865 = abstractC22044.m49865();
            C20348 c20348 = new C20348(bArrM49865);
            try {
                if (c20348.readInt() != 1297240144) {
                    throw new IOException("Unsupported resource patch format");
                }
                int i = c20348.readInt();
                if (i < 1 || i > 4) {
                    throw new IOException("Unsupported resource patch format");
                }
                int i2 = i >= 3 ? c20348.readByte() & 255 : 0;
                if (i2 < 0 || i2 > 2) {
                    throw new IOException("Invalid resource patch operation");
                }
                int i3 = c20348.readInt();
                String strM46758 = c20348.m46758();
                String strM46756 = null;
                if (i < 2 || !c20348.m46753()) {
                    str = null;
                    str2 = null;
                } else {
                    String strM46757 = c20348.m46756();
                    if (i2 != 2) {
                        strM46756 = c20348.m46756();
                    }
                    if (i2 == 0 && (strM46757.isEmpty() || strM46756.isEmpty())) {
                        throw new IOException("Invalid resource patch identity");
                    }
                    str2 = strM46756;
                    str = strM46757;
                }
                int i4 = (i < 4 || i2 != 2) ? 0 : c20348.readInt();
                if (i4 < 0 || i4 > 65536) {
                    throw new IOException("Invalid resource type entry count");
                }
                String strM46759 = c20348.m46758();
                String strM467510 = c20348.m46758();
                byte[] bArr = new byte[32];
                c20348.m46745(32, bArr);
                int i5 = c20348.readInt();
                if (i5 < 0 || i5 > c20348.available() - 4) {
                    throw new IOException("Invalid resource patch payload length");
                }
                byte[] bArr2 = new byte[i5];
                c20348.m46745(i5, bArr2);
                int i6 = c20348.readInt();
                if (c20348.available() != 0) {
                    throw new IOException("Trailing resource patch bytes");
                }
                CRC32 crc32 = new CRC32();
                crc32.update(i == 1 ? bArr2 : bArrM49865, 0, i == 1 ? i5 : bArrM49865.length - 4);
                if (((int) crc32.getValue()) != i6) {
                    throw new IOException("Resource patch CRC mismatch");
                }
                if (!Arrays.equals(bArr, C15022.m36179().digest(bArr2))) {
                    throw new IOException("Resource patch entry hash mismatch");
                }
                if (i2 != 0 && (str == null || i5 != 0 || !"missing".equals(strM46759) || !"missing".equals(strM467510) || (i2 == 2 && (65535 & i3) != 0))) {
                    throw new IOException("Invalid resource deletion patch");
                }
                String strM13663 = i2 == 0 ? C4287.m13663(bArr2) : "missing";
                if (!strM13663.equals(strM467510) && !"sha256:".concat(C15022.m36182(bArr)).equals(strM467510) && (strM467510.length() != 40 || !C15022.m36182(C15022.m36183().digest(bArr2)).equals(strM467510))) {
                    throw new IOException("Resource patch targetVersion mismatch");
                }
                if (i2 != 0) {
                    C6178 c6178 = new C6178(64);
                    c6178.writeInt(1);
                    c6178.writeInt(i3);
                    c6178.m17800(strM46758);
                    c6178.writeInt(i2);
                    bArrM17791 = c6178.m17791(C15022.m36179());
                } else {
                    bArrM17791 = m4572(i3, strM46758);
                }
                byte[] bArr3 = bArrM17791;
                if (!name.equals(C15022.m36182(bArr3).concat(".bin"))) {
                    throw new IOException("Resource patch target hash mismatch");
                }
                return new C1260(i3, strM46758, bArr3, bArr, strM46759, strM13663, bArr2, str, str2, i2, i4);
            } catch (Exception e) {
                e = e;
                throw C10186.m26305("RESOURCE_PATCH_CORRUPT", e.getMessage() == null ? "Resource patch is corrupt." : e.getMessage());
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4577(AbstractC22044 abstractC22044) {
        AbstractC22044 abstractC22044M4569 = m4569(abstractC22044, this.f4542);
        abstractC22044M4569.mo49834();
        AbstractC22044 abstractC22044M49862 = abstractC22044M4569.m49862(".resource_patch");
        try {
            OutputStream outputStreamMo4289 = abstractC22044M49862.mo4289(false);
            try {
                m4570(outputStreamMo4289);
                outputStreamMo4289.close();
                abstractC22044M49862.m49848(abstractC22044M4569, false, true, null);
                if (abstractC22044M49862.mo2934()) {
                    abstractC22044M49862.mo4296();
                }
            } catch (Throwable th) {
                if (outputStreamMo4289 != null) {
                    try {
                        outputStreamMo4289.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC22044M49862.mo2934()) {
                abstractC22044M49862.mo4296();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m4569(AbstractC22044 abstractC22044, String str) {
        return abstractC22044.m49876(str + ".bin");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4571(String str) {
        if (str == null || str.length() != 68 || !str.endsWith(".bin")) {
            return false;
        }
        for (int i = 0; i < 64; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m4572(int i, String str) {
        C6178 c6178 = new C6178(64);
        c6178.writeInt(1);
        c6178.writeInt(i);
        c6178.m17800(str);
        return c6178.m17791(C15022.m36179());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m4573(ArrayList arrayList, byte[] bArr) {
        ArrayList<C1260> arrayListM4565 = m4565(arrayList);
        C6178 c6178 = new C6178((arrayListM4565.size() * 64) + 64);
        c6178.writeInt(4);
        c6178.write(bArr, 0, bArr.length);
        c6178.writeInt(arrayListM4565.size());
        for (C1260 c1260 : arrayListM4565) {
            byte[] bArr2 = c1260.f4544;
            String str = c1260.f4553;
            c6178.write(bArr2);
            c6178.write(c1260.f4543);
            c6178.writeByte(c1260.f4548);
            c6178.writeInt(c1260.f4546);
            c6178.m17789(str != null);
            if (str != null) {
                c6178.m17786((CharSequence) str);
                String str2 = c1260.f4551;
                if (str2 != null) {
                    c6178.m17786((CharSequence) str2);
                }
            }
            c6178.m17800(c1260.f4552);
        }
        return c6178.m17791(C15022.m36179());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4565(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        C12884.sort(arrayList2, C2661.comparing(new C10558(1)));
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4570(OutputStream outputStream) throws IOException {
        C6178 c6178 = new C6178(96);
        c6178.writeInt(1297240144);
        c6178.writeInt(4);
        c6178.writeByte(this.f4548);
        c6178.writeInt(this.f4547);
        c6178.m17800(this.f4549);
        String str = this.f4553;
        c6178.m17789(str != null);
        if (str != null) {
            c6178.m17786((CharSequence) str);
            String str2 = this.f4551;
            if (str2 != null) {
                c6178.m17786((CharSequence) str2);
            }
        }
        if (m4579()) {
            c6178.writeInt(this.f4546);
        }
        c6178.m17800(this.f4550);
        c6178.m17800(this.f4552);
        c6178.write(this.f4543);
        byte[] bArr = this.f4545;
        c6178.writeInt(bArr.length);
        CRC32 crc32 = new CRC32();
        crc32.update(c6178.m17808(), 0, c6178.size());
        crc32.update(bArr, 0, bArr.length);
        c6178.m17784(outputStream);
        outputStream.write(bArr);
        c6178.m17793();
        c6178.writeInt((int) crc32.getValue());
        c6178.m17784(outputStream);
    }
}
