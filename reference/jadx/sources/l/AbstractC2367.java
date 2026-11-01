package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۖۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7WW */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2367 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final byte[] f8360;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC4484 f8361;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC21335 f8362;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC1142 f8364;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C19925 f8365;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC21335 f8366;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f8371 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f8368 = "no comment";

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f8367 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f8369 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f8370 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f8363 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m7190(int i) {
        int i2 = 1;
        if (i <= 127) {
            return 1;
        }
        while (i > 0) {
            i >>>= 8;
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract byte[] mo7202();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo7203() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract byte[] mo7206(String str, byte[] bArr);

    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[Catch: all -> 0x012b, TryCatch #2 {, blocks: (B:4:0x0002, B:7:0x0007, B:10:0x002e, B:11:0x0032, B:13:0x0036, B:14:0x003c, B:18:0x0056, B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a, B:51:0x011f, B:9:0x0024), top: B:60:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[Catch: Exception -> 0x011f, all -> 0x012b, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[Catch: Exception -> 0x011f, all -> 0x012b, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[Catch: Exception -> 0x011f, all -> 0x012b, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: Exception -> 0x011f, all -> 0x012b, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[Catch: Exception -> 0x011f, all -> 0x012b, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a A[Catch: Exception -> 0x011f, all -> 0x012b, TRY_LEAVE, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m7207(byte[] bArr, byte[] bArr2) {
        int blockSize;
        byte[] bArr3;
        int blockSize2;
        int i;
        int i2;
        byte[] bArr4;
        int i3;
        int length;
        int length2;
        int length3;
        byte[] bArrMo3066 = null;
        if (this.f8364 == null) {
            try {
                this.f8364 = (InterfaceC1142) Class.forName(C0168.m1327("3des-cbc")).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Exception | LinkageError unused) {
                this.f8365.getClass();
                C0168.f1257.getClass();
            }
            this.f8364 = this.f8364;
            if (this.f8362 == null) {
                this.f8362 = m7201();
            }
            blockSize = this.f8364.getBlockSize();
            bArr3 = new byte[blockSize];
            blockSize2 = this.f8362.getBlockSize();
            int i4 = (blockSize / blockSize2) * blockSize2;
            if (blockSize % blockSize2 == 0) {
                i = 0;
            } else {
                i = blockSize2;
            }
            i2 = i4 + i;
            bArr4 = new byte[i2];
            try {
                i3 = this.f8371;
                if (i3 == 0) {
                    length2 = 0;
                    while (length2 + blockSize2 <= i2) {
                        if (bArrMo3066 != null) {
                            this.f8362.mo3065(bArrMo3066.length, bArrMo3066);
                        }
                        this.f8362.mo3065(bArr.length, bArr);
                        InterfaceC21335 interfaceC21335 = this.f8362;
                        length3 = 8;
                        if (bArr2.length > 8) {
                            length3 = bArr2.length;
                        }
                        interfaceC21335.mo3065(length3, bArr2);
                        bArrMo3066 = this.f8362.mo3066();
                        System.arraycopy(bArrMo3066, 0, bArr4, length2, bArrMo3066.length);
                        length2 += bArrMo3066.length;
                    }
                    System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
                } else if (i3 == 4) {
                    byte[] bArrMo12512 = this.f8361.mo12512(bArr2.length + blockSize, bArr);
                    System.arraycopy(bArrMo12512, 0, bArr3, 0, blockSize);
                    System.arraycopy(bArrMo12512, blockSize, bArr2, 0, bArr2.length);
                    C8491.m22182(bArrMo12512);
                } else if (i3 == 1) {
                    length = 0;
                    while (length + blockSize2 <= i2) {
                        if (bArrMo3066 != null) {
                            this.f8362.mo3065(bArrMo3066.length, bArrMo3066);
                        }
                        this.f8362.mo3065(bArr.length, bArr);
                        bArrMo3066 = this.f8362.mo3066();
                        System.arraycopy(bArrMo3066, 0, bArr4, length, bArrMo3066.length);
                        length += bArrMo3066.length;
                    }
                    System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
                } else if (i3 == 2) {
                    byte[] bArr5 = new byte[4];
                    this.f8366.mo3065(4, bArr5);
                    this.f8366.mo3065(bArr.length, bArr);
                    byte[] bArrMo3067 = this.f8366.mo3066();
                    System.arraycopy(bArrMo3067, 0, bArr3, 0, bArrMo3067.length);
                    C8491.m22182(bArrMo3067);
                    bArr5[3] = 1;
                    this.f8366.mo3065(4, bArr5);
                    this.f8366.mo3065(bArr.length, bArr);
                    byte[] bArrMo3068 = this.f8366.mo3066();
                    System.arraycopy(bArrMo3068, 0, bArr3, bArrMo3068.length, blockSize - bArrMo3068.length);
                    C8491.m22182(bArrMo3068);
                } else if (i3 == 5) {
                    byte[] bArrMo12513 = this.f8361.mo12512(bArr2.length + blockSize + 32, bArr);
                    System.arraycopy(bArrMo12513, 0, bArr3, 0, blockSize);
                    System.arraycopy(bArrMo12513, blockSize, bArr2, 0, bArr2.length);
                    C8491.m22182(bArrMo12513);
                }
            } catch (Exception unused2) {
                this.f8365.getClass();
                C0168.f1257.getClass();
            }
        } else {
            if (this.f8362 == null) {
                this.f8362 = m7201();
            }
            blockSize = this.f8364.getBlockSize();
            bArr3 = new byte[blockSize];
            blockSize2 = this.f8362.getBlockSize();
            int i5 = (blockSize / blockSize2) * blockSize2;
            if (blockSize % blockSize2 == 0) {
                i = 0;
            } else {
                i = blockSize2;
            }
            i2 = i5 + i;
            bArr4 = new byte[i2];
            i3 = this.f8371;
            if (i3 == 0) {
                length2 = 0;
                while (length2 + blockSize2 <= i2) {
                    if (bArrMo3066 != null) {
                        this.f8362.mo3065(bArrMo3066.length, bArrMo3066);
                    }
                    this.f8362.mo3065(bArr.length, bArr);
                    InterfaceC21335 interfaceC21336 = this.f8362;
                    length3 = 8;
                    if (bArr2.length > 8) {
                        length3 = bArr2.length;
                    }
                    interfaceC21336.mo3065(length3, bArr2);
                    bArrMo3066 = this.f8362.mo3066();
                    System.arraycopy(bArrMo3066, 0, bArr4, length2, bArrMo3066.length);
                    length2 += bArrMo3066.length;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
            } else if (i3 == 4) {
                byte[] bArrMo12514 = this.f8361.mo12512(bArr2.length + blockSize, bArr);
                System.arraycopy(bArrMo12514, 0, bArr3, 0, blockSize);
                System.arraycopy(bArrMo12514, blockSize, bArr2, 0, bArr2.length);
                C8491.m22182(bArrMo12514);
            } else if (i3 == 1) {
                length = 0;
                while (length + blockSize2 <= i2) {
                    if (bArrMo3066 != null) {
                        this.f8362.mo3065(bArrMo3066.length, bArrMo3066);
                    }
                    this.f8362.mo3065(bArr.length, bArr);
                    bArrMo3066 = this.f8362.mo3066();
                    System.arraycopy(bArrMo3066, 0, bArr4, length, bArrMo3066.length);
                    length += bArrMo3066.length;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
            } else if (i3 == 2) {
                byte[] bArr6 = new byte[4];
                this.f8366.mo3065(4, bArr6);
                this.f8366.mo3065(bArr.length, bArr);
                byte[] bArrMo3069 = this.f8366.mo3066();
                System.arraycopy(bArrMo3069, 0, bArr3, 0, bArrMo3069.length);
                C8491.m22182(bArrMo3069);
                bArr6[3] = 1;
                this.f8366.mo3065(4, bArr6);
                this.f8366.mo3065(bArr.length, bArr);
                byte[] bArrMo30610 = this.f8366.mo3066();
                System.arraycopy(bArrMo30610, 0, bArr3, bArrMo30610.length, blockSize - bArrMo30610.length);
                C8491.m22182(bArrMo30610);
            } else if (i3 == 5) {
                byte[] bArrMo12515 = this.f8361.mo12512(bArr2.length + blockSize + 32, bArr);
                System.arraycopy(bArrMo12515, 0, bArr3, 0, blockSize);
                System.arraycopy(bArrMo12515, blockSize, bArr2, 0, bArr2.length);
                C8491.m22182(bArrMo12515);
            }
        }
        throw th;
        return bArr3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract int mo7209();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo7210(byte[] bArr);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract byte[] mo7211();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract byte[] mo7212(byte[] bArr);

    static {
        byte[] bArr = C8491.f29422;
        Charset charset = StandardCharsets.UTF_8;
        f8360 = "openssh-key-v1\u0000".getBytes(charset);
        C8491.m22185("\n");
        C8491.m22185("-----BEGIN OPENSSH PRIVATE KEY-----");
        C8491.m22185("-----END OPENSSH PRIVATE KEY-----");
        C8491.m22185("none");
        "Proc-Type: 4,ENCRYPTED".getBytes(charset);
        "DEK-Info: DES-EDE3-CBC,".getBytes(charset);
        C8491.m22185(" ");
    }

    public AbstractC2367(C19925 c19925) {
        this.f8365 = c19925;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] mo7208() {
        return this.f8363;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m7198(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] bArrM7207 = m7207(bArr2, bArr3);
            this.f8364.mo2386(1, bArrM7207, bArr3);
            C8491.m22182(bArrM7207);
            byte[] bArr4 = new byte[bArr.length - this.f8364.mo2391()];
            if (this.f8364.mo2390()) {
                this.f8364.mo2384(0);
                InterfaceC1142 interfaceC1142 = this.f8364;
                interfaceC1142.mo2392(-4, bArr, bArr.length - interfaceC1142.mo2391(), bArr4, 0);
                return bArr4;
            }
            if (this.f8364.mo2389()) {
                this.f8364.mo2392(0, bArr, bArr.length, bArr4, 0);
                return bArr4;
            }
            this.f8364.mo2385(0, bArr, bArr.length, bArr4, 0);
            return bArr4;
        } catch (Exception unused) {
            this.f8365.getClass();
            C0168.f1257.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m7191(int i, byte[] bArr, byte[] bArr2) {
        bArr[i] = 2;
        int iM7199 = m7199(i + 1, bArr2.length, bArr);
        System.arraycopy(bArr2, 0, bArr, iM7199, bArr2.length);
        return iM7199 + bArr2.length;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m7199(int i, int i2, byte[] bArr) {
        int iM7190 = m7190(i2) - 1;
        if (iM7190 == 0) {
            int i3 = i + 1;
            bArr[i] = (byte) i2;
            return i3;
        }
        int i4 = i + 1;
        bArr[i] = (byte) (iM7190 | 128);
        int i5 = i4 + iM7190;
        while (iM7190 > 0) {
            bArr[(i4 + iM7190) - 1] = (byte) (i2 & 255);
            i2 >>>= 8;
            iM7190--;
        }
        return i5;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private InterfaceC21335 m7201() {
        try {
            InterfaceC21335 interfaceC21335 = (InterfaceC21335) Class.forName(C0168.m1327("md5")).asSubclass(InterfaceC21335.class).getDeclaredConstructor(null).newInstance(null);
            this.f8362 = interfaceC21335;
            interfaceC21335.init();
        } catch (Exception | LinkageError unused) {
            this.f8365.getClass();
            C0168.f1257.getClass();
        }
        return this.f8362;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo7205(byte[] bArr) {
        boolean z = this.f8367;
        if (!z) {
            return true;
        }
        if (bArr == null) {
            return !z;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        byte[] bArrM7198 = null;
        try {
            bArrM7198 = m7198(this.f8369, bArr2, this.f8370);
            if (mo7210(bArrM7198)) {
                this.f8367 = false;
                C8491.m22182(this.f8369);
            }
            return !this.f8367;
        } finally {
            C8491.m22182(bArr2);
            C8491.m22182(bArrM7198);
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x01ee A[Catch: LinkageError -> 0x00b3, Exception -> 0x00b6, TryCatch #11 {Exception -> 0x00b6, LinkageError -> 0x00b3, blocks: (B:48:0x00ac, B:56:0x00bb, B:61:0x00c3, B:63:0x00c8, B:65:0x00cc, B:67:0x00d3, B:69:0x00d9, B:71:0x00df, B:80:0x00f3, B:82:0x00fd, B:84:0x0101, B:86:0x0109, B:88:0x0111, B:90:0x0117, B:92:0x011d, B:94:0x0123, B:96:0x012b, B:160:0x01f9, B:101:0x0137, B:103:0x013f, B:108:0x014b, B:114:0x015c, B:116:0x0162, B:119:0x016c, B:122:0x0174, B:124:0x017c, B:126:0x0182, B:128:0x018c, B:130:0x0194, B:132:0x019c, B:135:0x01a8, B:139:0x01b0, B:141:0x01b8, B:143:0x01be, B:145:0x01c6, B:147:0x01ce, B:149:0x01d6, B:151:0x01dc, B:153:0x01e4, B:156:0x01ee, B:161:0x0203, B:162:0x0208, B:163:0x0209, B:164:0x020e, B:171:0x021d, B:173:0x0225, B:175:0x022d, B:177:0x0235, B:179:0x023d, B:181:0x0245, B:183:0x024d, B:185:0x0253, B:187:0x025f, B:188:0x027d, B:189:0x0284, B:193:0x028b, B:195:0x028f, B:197:0x0297, B:199:0x029f, B:201:0x02a7, B:203:0x02af, B:205:0x02b7, B:207:0x02bf, B:209:0x02c5, B:211:0x02d1, B:213:0x02f3, B:214:0x02fa, B:218:0x0302, B:220:0x0306, B:222:0x030e, B:224:0x0316, B:226:0x031e, B:228:0x0326, B:230:0x032e, B:232:0x0336, B:234:0x033c, B:236:0x0348), top: B:605:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:158:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:165:0x020f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0217  */
    /* JADX WARN: Code duplicated, block: B:190:0x0285  */
    /* JADX WARN: Code duplicated, block: B:193:0x028b A[Catch: LinkageError -> 0x00b3, Exception -> 0x00b6, TryCatch #11 {Exception -> 0x00b6, LinkageError -> 0x00b3, blocks: (B:48:0x00ac, B:56:0x00bb, B:61:0x00c3, B:63:0x00c8, B:65:0x00cc, B:67:0x00d3, B:69:0x00d9, B:71:0x00df, B:80:0x00f3, B:82:0x00fd, B:84:0x0101, B:86:0x0109, B:88:0x0111, B:90:0x0117, B:92:0x011d, B:94:0x0123, B:96:0x012b, B:160:0x01f9, B:101:0x0137, B:103:0x013f, B:108:0x014b, B:114:0x015c, B:116:0x0162, B:119:0x016c, B:122:0x0174, B:124:0x017c, B:126:0x0182, B:128:0x018c, B:130:0x0194, B:132:0x019c, B:135:0x01a8, B:139:0x01b0, B:141:0x01b8, B:143:0x01be, B:145:0x01c6, B:147:0x01ce, B:149:0x01d6, B:151:0x01dc, B:153:0x01e4, B:156:0x01ee, B:161:0x0203, B:162:0x0208, B:163:0x0209, B:164:0x020e, B:171:0x021d, B:173:0x0225, B:175:0x022d, B:177:0x0235, B:179:0x023d, B:181:0x0245, B:183:0x024d, B:185:0x0253, B:187:0x025f, B:188:0x027d, B:189:0x0284, B:193:0x028b, B:195:0x028f, B:197:0x0297, B:199:0x029f, B:201:0x02a7, B:203:0x02af, B:205:0x02b7, B:207:0x02bf, B:209:0x02c5, B:211:0x02d1, B:213:0x02f3, B:214:0x02fa, B:218:0x0302, B:220:0x0306, B:222:0x030e, B:224:0x0316, B:226:0x031e, B:228:0x0326, B:230:0x032e, B:232:0x0336, B:234:0x033c, B:236:0x0348), top: B:605:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0302 A[Catch: LinkageError -> 0x00b3, Exception -> 0x00b6, TryCatch #11 {Exception -> 0x00b6, LinkageError -> 0x00b3, blocks: (B:48:0x00ac, B:56:0x00bb, B:61:0x00c3, B:63:0x00c8, B:65:0x00cc, B:67:0x00d3, B:69:0x00d9, B:71:0x00df, B:80:0x00f3, B:82:0x00fd, B:84:0x0101, B:86:0x0109, B:88:0x0111, B:90:0x0117, B:92:0x011d, B:94:0x0123, B:96:0x012b, B:160:0x01f9, B:101:0x0137, B:103:0x013f, B:108:0x014b, B:114:0x015c, B:116:0x0162, B:119:0x016c, B:122:0x0174, B:124:0x017c, B:126:0x0182, B:128:0x018c, B:130:0x0194, B:132:0x019c, B:135:0x01a8, B:139:0x01b0, B:141:0x01b8, B:143:0x01be, B:145:0x01c6, B:147:0x01ce, B:149:0x01d6, B:151:0x01dc, B:153:0x01e4, B:156:0x01ee, B:161:0x0203, B:162:0x0208, B:163:0x0209, B:164:0x020e, B:171:0x021d, B:173:0x0225, B:175:0x022d, B:177:0x0235, B:179:0x023d, B:181:0x0245, B:183:0x024d, B:185:0x0253, B:187:0x025f, B:188:0x027d, B:189:0x0284, B:193:0x028b, B:195:0x028f, B:197:0x0297, B:199:0x029f, B:201:0x02a7, B:203:0x02af, B:205:0x02b7, B:207:0x02bf, B:209:0x02c5, B:211:0x02d1, B:213:0x02f3, B:214:0x02fa, B:218:0x0302, B:220:0x0306, B:222:0x030e, B:224:0x0316, B:226:0x031e, B:228:0x0326, B:230:0x032e, B:232:0x0336, B:234:0x033c, B:236:0x0348), top: B:605:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:245:0x0375  */
    /* JADX WARN: Code duplicated, block: B:247:0x037a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0386 A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x03cd A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:278:0x03da  */
    /* JADX WARN: Code duplicated, block: B:280:0x03de A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:288:0x03f0 A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:293:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:296:0x0402 A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x040e A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, LOOP:15: B:294:0x03ff->B:302:0x040e, LOOP_END, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x0414 A[EDGE_INSN: B:305:0x0414->B:311:0x0430 BREAK  A[LOOP:1: B:77:0x00ed->B:309:0x041f, LOOP_LABEL: LOOP:1: B:77:0x00ed->B:309:0x041f]] */
    /* JADX WARN: Code duplicated, block: B:306:0x0417  */
    /* JADX WARN: Code duplicated, block: B:312:0x0432 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:313:0x0434  */
    /* JADX WARN: Code duplicated, block: B:346:0x048e A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:353:0x049b A[PHI: r2
      0x049b: PHI (r2v4 byte[] A[IMMUTABLE_TYPE]) = (r2v3 byte[]), (r2v9 byte[]) binds: [B:311:0x0430, B:342:0x0484] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:355:0x049e A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TRY_ENTER, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:361:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ab A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:375:0x04e9 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TRY_ENTER, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:377:0x04f1 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:378:0x0505 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:380:0x051d A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TRY_LEAVE, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:391:0x0555 A[Catch: LinkageError -> 0x04a3, Exception -> 0x06eb, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:453:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:456:0x05f9 A[Catch: LinkageError -> 0x04a3, Exception -> 0x06ed, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:511:0x0681 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:512:0x0683 A[Catch: LinkageError -> 0x04a3, Exception -> 0x06ed, TRY_ENTER, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:554:0x06e9 A[PHI: r16
      0x06e9: PHI (r16v8 ??) = (r16v6 ??), (r16v6 ??), (r16v6 ??), (r16v6 ??), (r16v10 ??) binds: [B:511:0x0681, B:513:0x0687, B:515:0x068d, B:517:0x0694, B:440:0x05cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:559:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:562:0x0700 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:563:0x0706  */
    /* JADX WARN: Code duplicated, block: B:565:0x0709 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:566:0x070f  */
    /* JADX WARN: Code duplicated, block: B:568:0x0712 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:569:0x0718  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb A[Catch: LinkageError -> 0x00b3, Exception -> 0x00b6, TryCatch #11 {Exception -> 0x00b6, LinkageError -> 0x00b3, blocks: (B:48:0x00ac, B:56:0x00bb, B:61:0x00c3, B:63:0x00c8, B:65:0x00cc, B:67:0x00d3, B:69:0x00d9, B:71:0x00df, B:80:0x00f3, B:82:0x00fd, B:84:0x0101, B:86:0x0109, B:88:0x0111, B:90:0x0117, B:92:0x011d, B:94:0x0123, B:96:0x012b, B:160:0x01f9, B:101:0x0137, B:103:0x013f, B:108:0x014b, B:114:0x015c, B:116:0x0162, B:119:0x016c, B:122:0x0174, B:124:0x017c, B:126:0x0182, B:128:0x018c, B:130:0x0194, B:132:0x019c, B:135:0x01a8, B:139:0x01b0, B:141:0x01b8, B:143:0x01be, B:145:0x01c6, B:147:0x01ce, B:149:0x01d6, B:151:0x01dc, B:153:0x01e4, B:156:0x01ee, B:161:0x0203, B:162:0x0208, B:163:0x0209, B:164:0x020e, B:171:0x021d, B:173:0x0225, B:175:0x022d, B:177:0x0235, B:179:0x023d, B:181:0x0245, B:183:0x024d, B:185:0x0253, B:187:0x025f, B:188:0x027d, B:189:0x0284, B:193:0x028b, B:195:0x028f, B:197:0x0297, B:199:0x029f, B:201:0x02a7, B:203:0x02af, B:205:0x02b7, B:207:0x02bf, B:209:0x02c5, B:211:0x02d1, B:213:0x02f3, B:214:0x02fa, B:218:0x0302, B:220:0x0306, B:222:0x030e, B:224:0x0316, B:226:0x031e, B:228:0x0326, B:230:0x032e, B:232:0x0336, B:234:0x033c, B:236:0x0348), top: B:605:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:571:0x071b A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:572:0x0721  */
    /* JADX WARN: Code duplicated, block: B:574:0x0724 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:575:0x072a  */
    /* JADX WARN: Code duplicated, block: B:577:0x072d A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:578:0x0733  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:580:0x0736 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:582:0x0744 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:583:0x074c A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:585:0x0752 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:586:0x0756 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:600:0x054f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3 A[Catch: LinkageError -> 0x00b3, Exception -> 0x00b6, TryCatch #11 {Exception -> 0x00b6, LinkageError -> 0x00b3, blocks: (B:48:0x00ac, B:56:0x00bb, B:61:0x00c3, B:63:0x00c8, B:65:0x00cc, B:67:0x00d3, B:69:0x00d9, B:71:0x00df, B:80:0x00f3, B:82:0x00fd, B:84:0x0101, B:86:0x0109, B:88:0x0111, B:90:0x0117, B:92:0x011d, B:94:0x0123, B:96:0x012b, B:160:0x01f9, B:101:0x0137, B:103:0x013f, B:108:0x014b, B:114:0x015c, B:116:0x0162, B:119:0x016c, B:122:0x0174, B:124:0x017c, B:126:0x0182, B:128:0x018c, B:130:0x0194, B:132:0x019c, B:135:0x01a8, B:139:0x01b0, B:141:0x01b8, B:143:0x01be, B:145:0x01c6, B:147:0x01ce, B:149:0x01d6, B:151:0x01dc, B:153:0x01e4, B:156:0x01ee, B:161:0x0203, B:162:0x0208, B:163:0x0209, B:164:0x020e, B:171:0x021d, B:173:0x0225, B:175:0x022d, B:177:0x0235, B:179:0x023d, B:181:0x0245, B:183:0x024d, B:185:0x0253, B:187:0x025f, B:188:0x027d, B:189:0x0284, B:193:0x028b, B:195:0x028f, B:197:0x0297, B:199:0x029f, B:201:0x02a7, B:203:0x02af, B:205:0x02b7, B:207:0x02bf, B:209:0x02c5, B:211:0x02d1, B:213:0x02f3, B:214:0x02fa, B:218:0x0302, B:220:0x0306, B:222:0x030e, B:224:0x0316, B:226:0x031e, B:228:0x0326, B:230:0x032e, B:232:0x0336, B:234:0x033c, B:236:0x0348), top: B:605:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:622:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0411 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x040d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Instruction removed from duplicated block: B:378:0x0505, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2367 m7194(C19925 c19925, byte[] bArr, byte[] bArr2) throws Throwable {
        byte[] bArr3;
        int length;
        int i;
        char c;
        char c2;
        int i2;
        char c3;
        boolean z;
        InterfaceC1142 interfaceC1142;
        char c4;
        ?? r16;
        char c5;
        InterfaceC1142 interfaceC1143;
        byte[] bArrM22184;
        boolean z2;
        boolean z3;
        byte[] bArrM22185;
        char c6;
        byte b;
        String strM22168;
        ?? r17;
        ?? r18;
        ?? r3;
        ?? r5;
        AbstractC2367 c21418;
        C14904 c14904;
        String strM22171;
        int i3;
        int i4;
        boolean z4;
        byte b2;
        byte b3;
        int i5;
        byte b4;
        int i6;
        byte b5;
        int i7;
        int i8;
        boolean z5;
        int i9;
        byte[] bArr4;
        int i10;
        InterfaceC1142 interfaceC1144;
        int i11;
        int i12;
        int i13;
        char c7;
        int i14;
        byte b6;
        byte[] bArr5 = new byte[8];
        if (bArr2 == null && bArr != null && bArr.length > 11 && bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && ((b6 = bArr[3]) == 7 || b6 == 9 || b6 == 11 || b6 == 19)) {
            C14904 c14905 = new C14904(bArr);
            c14905.m35639(bArr.length);
            String strM22172 = C8491.m22171(c14905.m35628());
            c14905.m35647();
            if (strM22172.equals(OpenSSHPublicKeyUtil.RSA)) {
                return C17890.m41517(c19925, c14905);
            }
            if (strM22172.equals(OpenSSHPublicKeyUtil.DSS)) {
                return C5190.m14350(c19925, c14905);
            }
            if (strM22172.equals("ecdsa-sha2-nistp256") || strM22172.equals("ecdsa-sha2-nistp384") || strM22172.equals("ecdsa-sha2-nistp521")) {
                return C12952.m32087(c19925, c14905);
            }
            if (strM22172.equals(OpenSSHPublicKeyUtil.ED_25519)) {
                return C3778.m11021(c19925, c14905);
            }
            if (strM22172.equals("ssh-ed448")) {
                return C6601.m17904(c19925, c14905);
            }
            throw new C5813("privatekey: invalid key ".concat(strM22172));
        }
        if (bArr == null) {
            if (bArr != null) {
                length = bArr.length;
            } else {
                length = 0;
            }
            i = 0;
            while (true) {
                if (i < length) {
                    c = 2;
                    c2 = 1;
                    break;
                }
                c = 2;
                if (bArr[i] != 45) {
                }
                i++;
            }
            i2 = 0;
            c3 = 0;
            z = true;
            interfaceC1142 = null;
            loop1: while (true) {
                if (i < length) {
                    c4 = c;
                    r16 = z ? 1 : 0;
                    c5 = c2;
                    interfaceC1143 = interfaceC1142;
                    bArrM22184 = null;
                    z2 = z;
                    break;
                }
                z4 = z ? 1 : 0;
                b2 = bArr[i];
                interfaceC1143 = interfaceC1142;
                if (b2 == 66) {
                    c4 = c;
                    if (b2 == 65) {
                        c5 = c2;
                        if (b2 != 65) {
                        }
                        if (b2 != 65) {
                            bArrM22184 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC1142 = interfaceC1143;
                        } else {
                            bArrM22184 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC1142 = interfaceC1143;
                        }
                    } else {
                        c5 = c2;
                        if (b2 != 65) {
                        }
                        if (b2 != 65) {
                            bArrM22184 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC1142 = interfaceC1143;
                        } else {
                            bArrM22184 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC1142 = interfaceC1143;
                        }
                    }
                    interfaceC1142 = interfaceC1144;
                    z5 = z4;
                } else {
                    c4 = c;
                    if (b2 == 65) {
                        c5 = c2;
                        if (b2 != 65) {
                        }
                        if (b2 != 65) {
                            bArrM22184 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC1142 = interfaceC1143;
                        } else {
                            bArrM22184 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC1142 = interfaceC1143;
                        }
                    } else {
                        c5 = c2;
                        if (b2 != 65) {
                        }
                        if (b2 != 65) {
                            bArrM22184 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC1142 = interfaceC1143;
                        } else {
                            bArrM22184 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC1142 = interfaceC1143;
                        }
                    }
                    interfaceC1142 = interfaceC1144;
                    z5 = z4;
                }
                c2 = c5;
                c = c4;
                z = z5;
                if (bArr != null) {
                    if (c3 != 0) {
                        throw new C5813("invalid privatekey");
                    }
                    i3 = i;
                    while (i3 < length) {
                        i3++;
                    }
                    if (length - i3 != 0) {
                    }
                    throw new C5813("invalid privatekey");
                }
                r16 = z4;
                z3 = z2;
                if (i2 == 4) {
                    return m7193(c19925, bArrM22184);
                }
                if (bArrM22184 != null) {
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    c14904 = new C14904(bArrM22184);
                    c14904.m35638();
                    c14904.m35638();
                    c14904.m35628();
                    strM22171 = C8491.m22171(c14904.m35628());
                    if (strM22171.equals("3des-cbc")) {
                        c14904.m35638();
                        bArr3 = new byte[bArrM22184.length - c14904.m35625()];
                        c14904.m35634(bArr3);
                        throw new C5813("cipher " + strM22171 + " is not supported for this privatekey format");
                    }
                    if (strM22171.equals("none")) {
                        c14904.m35638();
                        c14904.m35638();
                        byte[] bArr6 = new byte[bArrM22184.length - c14904.m35625()];
                        c14904.m35634(bArr6);
                        z3 = false;
                        bArrM22184 = bArr6;
                    } else {
                        throw new C5813("cipher " + strM22171 + " is not supported for this privatekey format");
                    }
                }
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                bArrM22185 = "";
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    if (bArr2.length <= 4) {
                        r16 = "";
                        b = bArr2[0];
                        if (b != 115) {
                            if (b != 101) {
                                bArrM22185 = 0;
                            } else {
                                bArrM22185 = 0;
                            }
                        } else if (b != 101) {
                            bArrM22185 = 0;
                        } else {
                            bArrM22185 = 0;
                        }
                    } else {
                        r16 = "";
                        b = bArr2[0];
                        if (b != 115) {
                            if (b != 101) {
                                bArrM22185 = 0;
                            } else {
                                bArrM22185 = 0;
                            }
                        } else if (b != 101) {
                            bArrM22185 = 0;
                        } else {
                            bArrM22185 = 0;
                        }
                    }
                    c6 = 1;
                    r3 = bArrM22185;
                    r18 = r16;
                } else {
                    r18 = "";
                    c6 = 1;
                    r3 = 0;
                }
                r5 = r18;
                if (c3 == c6) {
                    c21418 = new C5190(c19925);
                } else if (c3 == 2) {
                    c21418 = new C17890(c19925);
                } else if (c3 == 3) {
                    c21418 = new C12952(c19925, bArr2);
                } else if (c3 == 5) {
                    c21418 = new C3778(c19925, bArr2);
                } else if (c3 == 6) {
                    c21418 = new C6601(c19925, bArr2);
                } else if (i2 == 3) {
                    c21418 = new C21418(c19925);
                } else {
                    c21418 = null;
                }
                if (c21418 != null) {
                    c21418.f8367 = z3;
                    c21418.f8363 = r3;
                    c21418.f8371 = i2;
                    c21418.f8368 = r5;
                    c21418.f8364 = interfaceC1143;
                    if (z3) {
                        c21418.f8367 = true;
                        c21418.f8370 = bArr5;
                        c21418.f8369 = bArrM22184;
                    } else if (c21418.mo7210(bArrM22184)) {
                        c21418.f8367 = false;
                    } else {
                        throw new C5813("invalid privatekey");
                    }
                }
                return c21418;
            }
        }
        try {
            AbstractC2367 abstractC2367M7200 = m7200(c19925, bArr);
            if (abstractC2367M7200 != null) {
                return abstractC2367M7200;
            }
            if (bArr != null) {
                length = bArr.length;
            } else {
                length = 0;
            }
            i = 0;
            while (true) {
                if (i < length) {
                    c = 2;
                    c2 = 1;
                    break;
                }
                c = 2;
                if (bArr[i] != 45 && (i14 = i + 4) < length) {
                    c2 = 1;
                    if (bArr[i + 1] == 45 && bArr[i + 2] == 45 && bArr[i + 3] == 45 && bArr[i14] == 45) {
                        break;
                    }
                }
                i++;
            }
            i2 = 0;
            c3 = 0;
            z = true;
            interfaceC1142 = null;
            loop1: while (true) {
                if (i < length) {
                    c4 = c;
                    r16 = z ? 1 : 0;
                    c5 = c2;
                    interfaceC1143 = interfaceC1142;
                    bArrM22184 = null;
                    z2 = z;
                    break;
                }
                z4 = z ? 1 : 0;
                b2 = bArr[i];
                interfaceC1143 = interfaceC1142;
                if (b2 == 66 || (i13 = i + 3) >= length) {
                    c4 = c;
                } else {
                    c4 = c;
                    if (bArr[i + 1] == 69 && bArr[i + 2] == 71 && bArr[i13] == 73) {
                        int i15 = i + 6;
                        int i16 = i + 8;
                        if (i16 >= length) {
                            throw new C5813("invalid privatekey");
                        }
                        byte b7 = bArr[i15];
                        if (b7 == 68 && bArr[i + 7] == 83 && bArr[i16] == 65) {
                            c7 = 1;
                        } else if (b7 == 82 && bArr[i + 7] == 83 && bArr[i16] == 65) {
                            c7 = 2;
                        } else if (b7 == 69 && bArr[i + 7] == 67) {
                            c7 = 3;
                        } else {
                            if (b7 == 83 && bArr[i + 7] == 83 && bArr[i16] == 72) {
                                i2 = 1;
                            } else {
                                int i17 = i + 12;
                                if (i17 < length && b7 == 80 && bArr[i + 7] == 82 && bArr[i16] == 73) {
                                    int i18 = i + 9;
                                    if (bArr[i18] == 86 && bArr[i + 10] == 65 && bArr[i + 11] == 84 && bArr[i17] == 69) {
                                        i2 = 3;
                                        c7 = 4;
                                        z5 = false;
                                        i15 = i18;
                                    }
                                    c3 = c7;
                                    c5 = c2;
                                    interfaceC1142 = interfaceC1143;
                                    i = i15 + 3;
                                }
                                int i19 = i + 14;
                                if (i19 < length && b7 == 69 && bArr[i + 7] == 78 && bArr[i16] == 67 && bArr[i + 9] == 82 && bArr[i + 10] == 89) {
                                    int i20 = i + 11;
                                    if (bArr[i20] == 80 && bArr[i17] == 84 && bArr[i + 13] == 69 && bArr[i19] == 68) {
                                        i15 = i20;
                                        i2 = 3;
                                    } else {
                                        if (m7195(i15, length, bArr)) {
                                            throw new C5813("invalid privatekey");
                                        }
                                        i2 = 4;
                                    }
                                } else {
                                    if (m7195(i15, length, bArr)) {
                                        throw new C5813("invalid privatekey");
                                    }
                                    i2 = 4;
                                }
                            }
                            c7 = 4;
                        }
                        z5 = z4;
                        c3 = c7;
                        c5 = c2;
                        interfaceC1142 = interfaceC1143;
                        i = i15 + 3;
                    }
                    c2 = c5;
                    c = c4;
                    z = z5;
                }
                if (b2 == 65 || (i12 = i + 7) >= length) {
                    c5 = c2;
                } else {
                    c5 = c2;
                    if (bArr[i + 1] == 69 && bArr[i + 2] == 83 && bArr[i + 3] == 45 && bArr[i + 4] == 50 && bArr[i + 5] == 53 && bArr[i + 6] == 54 && bArr[i12] == 45) {
                        i += 8;
                        if (C3073.m9213(C0168.m1327("aes256-cbc"))) {
                            interfaceC1144 = (InterfaceC1142) Class.forName(C0168.m1327("aes256-cbc")).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null);
                            bArr5 = new byte[interfaceC1144.mo2383()];
                        } else {
                            throw new C5813("privatekey: aes256-cbc is not available");
                        }
                    }
                    interfaceC1142 = interfaceC1144;
                    z5 = z4;
                    c2 = c5;
                    c = c4;
                    z = z5;
                }
                if (b2 != 65 && (i11 = i + 7) < length && bArr[i + 1] == 69 && bArr[i + 2] == 83 && bArr[i + 3] == 45 && bArr[i + 4] == 49 && bArr[i + 5] == 57 && bArr[i + 6] == 50 && bArr[i11] == 45) {
                    i += 8;
                    if (C3073.m9213(C0168.m1327("aes192-cbc"))) {
                        interfaceC1144 = (InterfaceC1142) Class.forName(C0168.m1327("aes192-cbc")).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null);
                        bArr5 = new byte[interfaceC1144.mo2383()];
                    } else {
                        throw new C5813("privatekey: aes192-cbc is not available");
                    }
                } else {
                    if (b2 != 65 && (i10 = i + 7) < length && bArr[i + 1] == 69 && bArr[i + 2] == 83 && bArr[i + 3] == 45 && bArr[i + 4] == 49 && bArr[i + 5] == 50 && bArr[i + 6] == 56 && bArr[i10] == 45) {
                        i += 8;
                        if (C3073.m9213(C0168.m1327("aes128-cbc"))) {
                            bArr4 = null;
                            try {
                                interfaceC1144 = (InterfaceC1142) Class.forName(C0168.m1327("aes128-cbc")).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null);
                                bArr5 = new byte[interfaceC1144.mo2383()];
                            } catch (Exception e) {
                                e = e;
                            } catch (LinkageError e2) {
                                e = e2;
                            }
                        } else {
                            bArr4 = null;
                            throw new C5813("privatekey: aes128-cbc is not available");
                        }
                    } else {
                        bArrM22184 = null;
                        if (b2 == 67 && (i9 = i + 3) < length) {
                            try {
                                if (bArr[i + 1] != 66 && bArr[i + 2] == 67 && bArr[i9] == 44) {
                                    i += 4;
                                    for (int i21 = 0; i21 < bArr5.length; i21++) {
                                        int i22 = i + 1;
                                        byte b8 = bArr[i];
                                        int i23 = (((byte) ((48 > b8 || b8 > 57) ? b8 - 87 : b8 - 48)) << 4) & 240;
                                        i += 2;
                                        byte b9 = bArr[i22];
                                        bArr5[i21] = (byte) (i23 + (((byte) ((48 > b9 || b9 > 57) ? b9 - 87 : b9 - 48)) & 15));
                                    }
                                }
                                z5 = z4;
                                interfaceC1142 = interfaceC1143;
                                c2 = c5;
                                c = c4;
                                z = z5;
                            } catch (Exception | LinkageError e3) {
                                e = e3;
                                bArr4 = null;
                                bArr3 = bArr4;
                            }
                        }
                        if (b2 == 13 || (i8 = i + 1) >= bArr.length) {
                            b3 = 10;
                        } else {
                            b3 = 10;
                            if (bArr[i8] == 10) {
                                i = i8;
                            }
                            z5 = z4;
                            interfaceC1142 = interfaceC1143;
                            c2 = c5;
                            c = c4;
                            z = z5;
                        }
                        if (b2 == b3 && (i5 = i + 1) < bArr.length) {
                            b4 = bArr[i5];
                            if (b4 == b3) {
                                i += 2;
                            } else if (b4 == 13 || (i7 = i + 2) >= bArr.length || bArr[i7] != 10) {
                                i6 = i5;
                                while (true) {
                                    if (i6 >= bArr.length && (b5 = bArr[i6]) != 10) {
                                        if (b5 != 58) {
                                            i6++;
                                        }
                                    }
                                    if (i2 != 3) {
                                        z2 = false;
                                        i = i5;
                                        break loop1;
                                    }
                                    i = i5;
                                }
                            } else {
                                i += 3;
                            }
                            z2 = z4;
                            r16 = z4;
                            break;
                        }
                        i++;
                        z5 = z4;
                        interfaceC1142 = interfaceC1143;
                        c2 = c5;
                        c = c4;
                        z = z5;
                    }
                    bArr3 = bArr4;
                }
                interfaceC1142 = interfaceC1144;
                z5 = z4;
                c2 = c5;
                c = c4;
                z = z5;
            }
            if (bArr != null) {
                r16 = z4;
                z3 = z2;
                if (i2 == 4) {
                    return m7193(c19925, bArrM22184);
                }
                if (bArrM22184 != null && bArrM22184.length > 4 && bArrM22184[0] == 63 && bArrM22184[c5] == 111 && bArrM22184[c4] == -7 && bArrM22184[3] == -21) {
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    c14904 = new C14904(bArrM22184);
                    c14904.m35638();
                    c14904.m35638();
                    c14904.m35628();
                    strM22171 = C8491.m22171(c14904.m35628());
                    if (strM22171.equals("3des-cbc")) {
                        c14904.m35638();
                        bArr3 = new byte[bArrM22184.length - c14904.m35625()];
                        c14904.m35634(bArr3);
                        try {
                            throw new C5813("cipher " + strM22171 + " is not supported for this privatekey format");
                        } catch (Exception e4) {
                            e = e4;
                        } catch (LinkageError e5) {
                            e = e5;
                        }
                    } else if (strM22171.equals("none")) {
                        c14904.m35638();
                        c14904.m35638();
                        byte[] bArr7 = new byte[bArrM22184.length - c14904.m35625()];
                        c14904.m35634(bArr7);
                        z3 = false;
                        bArrM22184 = bArr7;
                    } else {
                        throw new C5813("cipher " + strM22171 + " is not supported for this privatekey format");
                    }
                }
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                bArrM22185 = "";
                if (bArr2 != null) {
                    try {
                        int length3 = bArr2.length;
                        try {
                            try {
                                if (bArr2.length <= 4 && bArr2[0] == 45 && bArr2[c5] == 45 && bArr2[c4] == 45 && bArr2[3] == 45) {
                                    int i24 = 0;
                                    do {
                                        i24++;
                                        if (bArr2.length <= i24) {
                                            break;
                                        }
                                    } while (bArr2[i24] != 10);
                                    boolean z6 = bArr2.length > i24;
                                    loop6: while (true) {
                                        if (!z6) {
                                            r16 = bArrM22185;
                                            break;
                                        }
                                        if (bArr2[i24] == 10) {
                                            int i25 = i24 + 1;
                                            int i26 = i25;
                                            ?? r4 = bArrM22185;
                                            while (true) {
                                                if (i26 < bArr2.length) {
                                                    byte b10 = bArr2[i26];
                                                    r17 = r4;
                                                    if (b10 != 10) {
                                                        if (b10 != 58) {
                                                            i26++;
                                                            r4 = r17;
                                                        }
                                                    }
                                                } else {
                                                    r17 = r4;
                                                }
                                                i24 = i25;
                                                r16 = r17;
                                                break loop6;
                                            }
                                        }
                                        r17 = bArrM22185;
                                        i24++;
                                        bArrM22185 = r17;
                                    }
                                    if (bArr2.length <= i24) {
                                        z6 = false;
                                    }
                                    int i27 = i24;
                                    while (z6 && i27 < length3) {
                                        byte b11 = bArr2[i27];
                                        if (b11 == 10) {
                                            System.arraycopy(bArr2, i27 + 1, bArr2, i27, (length3 - i27) - 1);
                                            length3--;
                                        } else {
                                            if (b11 == 45) {
                                                break;
                                            }
                                            i27++;
                                        }
                                    }
                                    if (z6) {
                                        bArrM22185 = C8491.m22184(i24, i27 - i24, bArr2);
                                        if (bArr == null || c3 == 4) {
                                            char c8 = bArrM22185[8];
                                            if (c8 == 'd') {
                                                c3 = 1;
                                            } else if (c8 == 'r') {
                                                c3 = 2;
                                            }
                                        }
                                    } else {
                                        bArrM22185 = 0;
                                    }
                                } else {
                                    r16 = "";
                                    b = bArr2[0];
                                    if (b != 115 && bArr2[c5] == 115 && bArr2[c4] == 104 && bArr2[3] == 45) {
                                        if (bArr == null && bArr2.length > 7) {
                                            byte b12 = bArr2[4];
                                            if (b12 == 100) {
                                                c3 = 1;
                                            } else if (b12 == 114) {
                                                c3 = 2;
                                            } else if (b12 == 101 && bArr2[6] == 50) {
                                                c3 = 5;
                                            } else if (b12 == 101 && bArr2[6] == 52) {
                                                c3 = 6;
                                            }
                                        }
                                        int i28 = 0;
                                        while (i28 < length3 && bArr2[i28] != 32) {
                                            i28++;
                                        }
                                        int i29 = i28 + 1;
                                        if (i29 < length3) {
                                            int i30 = i29;
                                            while (i30 < length3 && bArr2[i30] != 32) {
                                                i30++;
                                            }
                                            int i31 = i30;
                                            bArrM22185 = C8491.m22184(i29, i30 - i29, bArr2);
                                            i29 = i31;
                                        } else {
                                            bArrM22185 = 0;
                                        }
                                        int i32 = i29 + 1;
                                        if (i29 < length3) {
                                            int i33 = i32;
                                            while (i33 < length3 && bArr2[i33] != 10) {
                                                i33++;
                                            }
                                            if (i33 > 0 && bArr2[i33 - 1] == 13) {
                                                i33--;
                                            }
                                            if (i32 < i33) {
                                                strM22168 = C8491.m22168(i32, i33 - i32, bArr2);
                                                bArrM22185 = bArrM22185;
                                                r16 = strM22168;
                                            }
                                        }
                                    } else if (b != 101 && bArr2[c5] == 99 && bArr2[c4] == 100 && bArr2[3] == 115) {
                                        if (bArr == null && bArr2.length > 7) {
                                            c3 = 3;
                                        }
                                        int i34 = 0;
                                        while (i34 < length3 && bArr2[i34] != 32) {
                                            i34++;
                                        }
                                        int i35 = i34 + 1;
                                        if (i35 < length3) {
                                            int i36 = i35;
                                            while (i36 < length3 && bArr2[i36] != 32) {
                                                i36++;
                                            }
                                            int i37 = i36;
                                            bArrM22185 = C8491.m22184(i35, i36 - i35, bArr2);
                                            i35 = i37;
                                        } else {
                                            bArrM22185 = 0;
                                        }
                                        int i38 = i35 + 1;
                                        if (i35 < length3) {
                                            int i39 = i38;
                                            while (i39 < length3 && bArr2[i39] != 10) {
                                                i39++;
                                            }
                                            if (i39 > 0 && bArr2[i39 - 1] == 13) {
                                                i39--;
                                            }
                                            if (i38 < i39) {
                                                strM22168 = C8491.m22168(i38, i39 - i38, bArr2);
                                                bArrM22185 = bArrM22185;
                                                r16 = strM22168;
                                            }
                                        }
                                    } else {
                                        bArrM22185 = 0;
                                    }
                                }
                            } catch (Exception unused) {
                                c19925.getClass();
                                C0168.f1257.getClass();
                            }
                        } catch (Exception unused2) {
                            bArrM22185 = 0;
                            c19925.getClass();
                            C0168.f1257.getClass();
                        }
                    } catch (Exception unused3) {
                        r16 = bArrM22185;
                    }
                    c6 = 1;
                    r3 = bArrM22185;
                    r18 = r16;
                } else {
                    r18 = "";
                    c6 = 1;
                    r3 = 0;
                }
                r5 = r18;
                if (c3 == c6) {
                    c21418 = new C5190(c19925);
                } else if (c3 == 2) {
                    c21418 = new C17890(c19925);
                } else if (c3 == 3) {
                    c21418 = new C12952(c19925, bArr2);
                } else if (c3 == 5) {
                    c21418 = new C3778(c19925, bArr2);
                } else if (c3 == 6) {
                    c21418 = new C6601(c19925, bArr2);
                } else if (i2 == 3) {
                    c21418 = new C21418(c19925);
                } else {
                    c21418 = null;
                }
                if (c21418 != null) {
                    c21418.f8367 = z3;
                    c21418.f8363 = r3;
                    c21418.f8371 = i2;
                    c21418.f8368 = r5;
                    c21418.f8364 = interfaceC1143;
                    if (z3) {
                        c21418.f8367 = true;
                        c21418.f8370 = bArr5;
                        c21418.f8369 = bArrM22184;
                    } else if (c21418.mo7210(bArrM22184)) {
                        c21418.f8367 = false;
                    } else {
                        throw new C5813("invalid privatekey");
                    }
                }
                return c21418;
            }
            if (c3 != 0) {
                throw new C5813("invalid privatekey");
            }
            i3 = i;
            while (i3 < length && bArr[i3] != 45) {
                i3++;
            }
            if (length - i3 != 0 || (i4 = i3 - i) == 0) {
                throw new C5813("invalid privatekey");
            }
            byte[] bArr8 = new byte[i4];
            System.arraycopy(bArr, i, bArr8, 0, i4);
            int i40 = 0;
            while (i40 < i4) {
                byte b13 = bArr8[i40];
                if (b13 == 10) {
                    int i41 = (i40 <= 0 || bArr8[i40 + (-1)] != 13) ? 0 : 1;
                    int i42 = i40 + 1;
                    System.arraycopy(bArr8, i42, bArr8, i40 - i41, i4 - i42);
                    if (i41 != 0) {
                        i4--;
                        i40--;
                    }
                    i4--;
                } else {
                    if (b13 == 45) {
                        break;
                    }
                    i40++;
                }
            }
            if (i40 > 0) {
                bArrM22184 = C8491.m22184(0, i40, bArr8);
            }
            try {
                try {
                    C8491.m22182(bArr8);
                    r16 = z4;
                    z3 = z2;
                    if (i2 == 4) {
                        return m7193(c19925, bArrM22184);
                    }
                    if (bArrM22184 != null) {
                        z3 = z2;
                        z3 = z2;
                        z3 = z2;
                        z3 = z2;
                        z3 = z2;
                        c14904 = new C14904(bArrM22184);
                        c14904.m35638();
                        c14904.m35638();
                        c14904.m35628();
                        strM22171 = C8491.m22171(c14904.m35628());
                        if (strM22171.equals("3des-cbc")) {
                            c14904.m35638();
                            bArr3 = new byte[bArrM22184.length - c14904.m35625()];
                            c14904.m35634(bArr3);
                            throw new C5813("cipher " + strM22171 + " is not supported for this privatekey format");
                        }
                        if (strM22171.equals("none")) {
                            c14904.m35638();
                            c14904.m35638();
                            byte[] bArr9 = new byte[bArrM22184.length - c14904.m35625()];
                            c14904.m35634(bArr9);
                            z3 = false;
                            bArrM22184 = bArr9;
                        } else {
                            throw new C5813("cipher " + strM22171 + " is not supported for this privatekey format");
                        }
                    }
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    bArrM22185 = "";
                    if (bArr2 != null) {
                        int length4 = bArr2.length;
                        if (bArr2.length <= 4) {
                            r16 = "";
                            b = bArr2[0];
                            if (b != 115) {
                                if (b != 101) {
                                    bArrM22185 = 0;
                                } else {
                                    bArrM22185 = 0;
                                }
                            } else if (b != 101) {
                                bArrM22185 = 0;
                            } else {
                                bArrM22185 = 0;
                            }
                        } else {
                            r16 = "";
                            b = bArr2[0];
                            if (b != 115) {
                                if (b != 101) {
                                    bArrM22185 = 0;
                                } else {
                                    bArrM22185 = 0;
                                }
                            } else if (b != 101) {
                                bArrM22185 = 0;
                            } else {
                                bArrM22185 = 0;
                            }
                        }
                        c6 = 1;
                        r3 = bArrM22185;
                        r18 = r16;
                    } else {
                        r18 = "";
                        c6 = 1;
                        r3 = 0;
                    }
                    r5 = r18;
                    if (c3 == c6) {
                        c21418 = new C5190(c19925);
                    } else if (c3 == 2) {
                        c21418 = new C17890(c19925);
                    } else if (c3 == 3) {
                        c21418 = new C12952(c19925, bArr2);
                    } else if (c3 == 5) {
                        c21418 = new C3778(c19925, bArr2);
                    } else if (c3 == 6) {
                        c21418 = new C6601(c19925, bArr2);
                    } else if (i2 == 3) {
                        c21418 = new C21418(c19925);
                    } else {
                        c21418 = null;
                    }
                    if (c21418 != null) {
                        c21418.f8367 = z3;
                        c21418.f8363 = r3;
                        c21418.f8371 = i2;
                        c21418.f8368 = r5;
                        c21418.f8364 = interfaceC1143;
                        if (z3) {
                            c21418.f8367 = true;
                            c21418.f8370 = bArr5;
                            c21418.f8369 = bArrM22184;
                        } else if (c21418.mo7210(bArrM22184)) {
                            c21418.f8367 = false;
                        } else {
                            throw new C5813("invalid privatekey");
                        }
                    }
                    return c21418;
                } catch (LinkageError e6) {
                    e = e6;
                    bArr3 = bArrM22184;
                }
            } catch (Exception e7) {
                e = e7;
                bArr3 = bArrM22184;
            }
        } catch (Exception e8) {
            e = e8;
            bArr3 = null;
        } catch (LinkageError e9) {
            e = e9;
            bArr3 = null;
        }
        C8491.m22182(bArr3);
        if (e instanceof C5813) {
            throw ((C5813) e);
        }
        throw new C5813(e.toString(), e);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010c A[Catch: Exception -> 0x0075, TryCatch #2 {Exception -> 0x0075, blocks: (B:10:0x005d, B:12:0x0069, B:14:0x006f, B:15:0x0074, B:30:0x00e9, B:32:0x00ed, B:33:0x00ef, B:34:0x00f0, B:35:0x0104, B:39:0x0108, B:41:0x010c, B:42:0x010e, B:43:0x010f, B:44:0x0123), top: B:53:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x010f A[Catch: Exception -> 0x0075, TryCatch #2 {Exception -> 0x0075, blocks: (B:10:0x005d, B:12:0x0069, B:14:0x006f, B:15:0x0074, B:30:0x00e9, B:32:0x00ed, B:33:0x00ef, B:34:0x00f0, B:35:0x0104, B:39:0x0108, B:41:0x010c, B:42:0x010e, B:43:0x010f, B:44:0x0123), top: B:53:0x005b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x010f, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2367 m7193(C19925 c19925, byte[] bArr) throws Exception {
        if (bArr == null) {
            throw new C5813("invalid privatekey");
        }
        C14904 c14904 = new C14904(bArr);
        byte[] bArr2 = f8360;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        c14904.m35632(0, length, bArr3);
        if (!C8491.m22183(bArr2, bArr3)) {
            throw new C5813("Invalid openssh v1 format.");
        }
        byte[] bArrM35628 = c14904.m35628();
        int length2 = bArrM35628.length;
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArrM35628, 0, length2, charset);
        byte[] bArrM35629 = c14904.m35628();
        String str2 = new String(bArrM35629, 0, bArrM35629.length, charset);
        byte[] bArrM356210 = c14904.m35628();
        if (c14904.m35638() != 1) {
            throw new C5813("We don't support having more than 1 key in the file (yet).");
        }
        byte[] bArrM356211 = c14904.m35628();
        AbstractC2367 abstractC2367M7192 = m7192(c19925, (String) null, bArrM356211);
        boolean zEquals = "none".equals(str);
        abstractC2367M7192.f8367 = !zEquals;
        abstractC2367M7192.f8363 = bArrM356211;
        abstractC2367M7192.f8371 = 4;
        abstractC2367M7192.f8368 = "";
        try {
            if (zEquals) {
                byte[] bArrM356212 = c14904.m35628();
                abstractC2367M7192.f8369 = bArrM356212;
                if (!abstractC2367M7192.mo7210(bArrM356212)) {
                    throw new C5813("invalid privatekey");
                }
                C8491.m22182(abstractC2367M7192.f8369);
                return abstractC2367M7192;
            }
            try {
                InterfaceC1142 interfaceC1142 = (InterfaceC1142) Class.forName(C0168.m1327(str)).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null);
                abstractC2367M7192.f8364 = interfaceC1142;
                int iMo2383 = interfaceC1142.mo2383();
                if (abstractC2367M7192.f8364.mo2390()) {
                    iMo2383 = 0;
                } else if (abstractC2367M7192.f8364.mo2389()) {
                    iMo2383 = 12;
                }
                abstractC2367M7192.f8370 = new byte[iMo2383];
                byte[] bArrM356213 = c14904.m35628();
                int length3 = bArrM356213.length + abstractC2367M7192.f8364.mo2391();
                byte[] bArr4 = new byte[length3];
                System.arraycopy(bArrM356213, 0, bArr4, 0, bArrM356213.length);
                c14904.m35632(bArrM356213.length, length3 - bArrM356213.length, bArr4);
                abstractC2367M7192.f8369 = bArr4;
                try {
                    InterfaceC4484 interfaceC4484 = (InterfaceC4484) Class.forName(C0168.m1327(str2)).asSubclass(InterfaceC4484.class).getDeclaredConstructor(null).newInstance(null);
                    abstractC2367M7192.f8361 = interfaceC4484;
                    interfaceC4484.mo12511(bArrM356210);
                    return abstractC2367M7192;
                } catch (Exception | LinkageError e) {
                    if (e instanceof C5813) {
                        throw ((C5813) e);
                    }
                    throw new C5813("kdf " + str2 + " is not available", e);
                }
            } catch (Exception e2) {
                e = e2;
                if (e instanceof C5813) {
                    throw ((C5813) e);
                }
                throw new C5813("cipher " + str + " is not available", e);
            } catch (LinkageError e3) {
                e = e3;
                if (e instanceof C5813) {
                    throw ((C5813) e);
                }
                throw new C5813("cipher " + str + " is not available", e);
            }
        } catch (Exception e4) {
            C8491.m22182(abstractC2367M7192.f8369);
            throw e4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7195(int i, int i2, byte[] bArr) {
        int i3 = i + 24;
        return i3 < i2 && "OPENSSH PRIVATE KEY-----".equals(C8491.m22171(Arrays.copyOfRange(bArr, i, i3)));
    }

    public final void finalize() {
        mo7203();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0110 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:16:0x0050, B:18:0x0056, B:19:0x005c, B:21:0x0089, B:23:0x00af, B:36:0x0106, B:34:0x00e1, B:35:0x00e9, B:40:0x010c, B:42:0x0110, B:43:0x0112, B:44:0x0113, B:45:0x012e, B:28:0x00d2, B:30:0x00d6, B:31:0x00d8, B:32:0x00d9, B:33:0x00e0, B:55:0x0141, B:57:0x0149, B:60:0x0150, B:61:0x0157, B:49:0x0132, B:51:0x0136, B:52:0x0138, B:53:0x0139, B:54:0x0140, B:70:0x0161, B:71:0x0164), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0113 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:16:0x0050, B:18:0x0056, B:19:0x005c, B:21:0x0089, B:23:0x00af, B:36:0x0106, B:34:0x00e1, B:35:0x00e9, B:40:0x010c, B:42:0x0110, B:43:0x0112, B:44:0x0113, B:45:0x012e, B:28:0x00d2, B:30:0x00d6, B:31:0x00d8, B:32:0x00d9, B:33:0x00e0, B:55:0x0141, B:57:0x0149, B:60:0x0150, B:61:0x0157, B:49:0x0132, B:51:0x0136, B:52:0x0138, B:53:0x0139, B:54:0x0140, B:70:0x0161, B:71:0x0164), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0136 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:16:0x0050, B:18:0x0056, B:19:0x005c, B:21:0x0089, B:23:0x00af, B:36:0x0106, B:34:0x00e1, B:35:0x00e9, B:40:0x010c, B:42:0x0110, B:43:0x0112, B:44:0x0113, B:45:0x012e, B:28:0x00d2, B:30:0x00d6, B:31:0x00d8, B:32:0x00d9, B:33:0x00e0, B:55:0x0141, B:57:0x0149, B:60:0x0150, B:61:0x0157, B:49:0x0132, B:51:0x0136, B:52:0x0138, B:53:0x0139, B:54:0x0140, B:70:0x0161, B:71:0x0164), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0139 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:16:0x0050, B:18:0x0056, B:19:0x005c, B:21:0x0089, B:23:0x00af, B:36:0x0106, B:34:0x00e1, B:35:0x00e9, B:40:0x010c, B:42:0x0110, B:43:0x0112, B:44:0x0113, B:45:0x012e, B:28:0x00d2, B:30:0x00d6, B:31:0x00d8, B:32:0x00d9, B:33:0x00e0, B:55:0x0141, B:57:0x0149, B:60:0x0150, B:61:0x0157, B:49:0x0132, B:51:0x0136, B:52:0x0138, B:53:0x0139, B:54:0x0140, B:70:0x0161, B:71:0x0164), top: B:76:0x002a }] */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0113, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0166: MOVE (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:73:0x0166 */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC2367 m7200(C19925 c19925, byte[] bArr) throws Throwable {
        int i;
        byte[] bArr2;
        C14904 c14904 = new C14904(bArr);
        HashMap map = new HashMap();
        while (m7196(c14904, map)) {
        }
        String str = (String) map.get("PuTTY-User-Key-File-2");
        byte[] bArr3 = null;
        if (str == null) {
            str = (String) map.get("PuTTY-User-Key-File-3");
            if (str == null) {
                return null;
            }
            i = 5;
        } else {
            i = 2;
        }
        try {
            try {
                byte[] bArrM7197 = m7197(c14904, Integer.parseInt((String) map.get("Public-Lines")));
                while (m7196(c14904, map)) {
                }
                byte[] bArrM7198 = m7197(c14904, Integer.parseInt((String) map.get("Private-Lines")));
                do {
                    try {
                    } catch (Exception e) {
                        e = e;
                    }
                } while (m7196(c14904, map));
                byte[] bArrM22184 = C8491.m22184(0, bArrM7198.length, bArrM7198);
                try {
                    byte[] bArrM22185 = C8491.m22184(0, bArrM7197.length, bArrM7197);
                    AbstractC2367 abstractC2367M7192 = m7192(c19925, str, bArrM22185);
                    abstractC2367M7192.f8367 = !((String) map.get("Encryption")).equals("none");
                    abstractC2367M7192.f8363 = bArrM22185;
                    abstractC2367M7192.f8371 = i;
                    abstractC2367M7192.f8368 = (String) map.get("Comment");
                    if (abstractC2367M7192.f8367) {
                        try {
                            InterfaceC1142 interfaceC1142 = (InterfaceC1142) Class.forName(C0168.m1327("aes256-cbc")).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null);
                            abstractC2367M7192.f8364 = interfaceC1142;
                            abstractC2367M7192.f8370 = new byte[interfaceC1142.mo2383()];
                            if (i == 2) {
                                try {
                                    InterfaceC21335 interfaceC21335 = (InterfaceC21335) Class.forName(C0168.m1327("sha-1")).asSubclass(InterfaceC21335.class).getDeclaredConstructor(null).newInstance(null);
                                    interfaceC21335.init();
                                    abstractC2367M7192.f8366 = interfaceC21335;
                                } catch (Exception | LinkageError e2) {
                                    if (e2 instanceof C5813) {
                                        throw ((C5813) e2);
                                    }
                                    throw new C5813("hash sha-1 is not available", e2);
                                }
                            } else {
                                String str2 = (String) map.get("Key-Derivation");
                                try {
                                    InterfaceC4484 interfaceC4484 = (InterfaceC4484) Class.forName(C0168.m1327(str2)).asSubclass(InterfaceC4484.class).getDeclaredConstructor(null).newInstance(null);
                                    abstractC2367M7192.f8361 = interfaceC4484;
                                    interfaceC4484.mo12510(map);
                                } catch (Exception e3) {
                                    e = e3;
                                    if (e instanceof C5813) {
                                        throw ((C5813) e);
                                    }
                                    throw new C5813("kdf " + str2 + " is not available", e);
                                } catch (LinkageError e4) {
                                    e = e4;
                                    if (e instanceof C5813) {
                                        throw ((C5813) e);
                                    }
                                    throw new C5813("kdf " + str2 + " is not available", e);
                                }
                            }
                            abstractC2367M7192.f8369 = bArrM22184;
                        } catch (Exception e5) {
                            e = e5;
                            if (e instanceof C5813) {
                                throw ((C5813) e);
                            }
                            throw new C5813("cipher aes256-cbc is not available", e);
                        } catch (LinkageError e6) {
                            e = e6;
                            if (e instanceof C5813) {
                                throw ((C5813) e);
                            }
                            throw new C5813("cipher aes256-cbc is not available", e);
                        }
                    } else {
                        abstractC2367M7192.f8369 = bArrM22184;
                        if (!abstractC2367M7192.mo7210(bArrM22184)) {
                            throw new C5813("invalid privatekey");
                        }
                        C8491.m22182(bArrM22184);
                    }
                    C8491.m22182(bArrM7198);
                    return abstractC2367M7192;
                } catch (Exception e7) {
                    e = e7;
                    bArr3 = bArrM22184;
                    C8491.m22182(bArr3);
                    throw e;
                }
            } catch (Throwable th) {
                th = th;
                bArr3 = bArr2;
                C8491.m22182(bArr3);
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
        } catch (Throwable th2) {
            th = th2;
            C8491.m22182(bArr3);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2367 m7192(C19925 c19925, String str, byte[] bArr) throws C5813 {
        C14904 c14904 = new C14904(bArr);
        c14904.m35639(bArr.length);
        byte[] bArrM35628 = c14904.m35628();
        byte[] bArr2 = C8491.f29422;
        String str2 = new String(bArrM35628, 0, bArrM35628.length, StandardCharsets.UTF_8);
        if (str == null || str.equals("")) {
            str = str2;
        } else if (!str.equals(str2)) {
            throw new C5813(C0242.m1617("pubkeyblob type [", str2, "] does not match expected type [", str, "]"));
        }
        if (str.equals(OpenSSHPublicKeyUtil.RSA)) {
            int iM35638 = c14904.m35638();
            byte[] bArr3 = new byte[iM35638];
            c14904.m35632(0, iM35638, bArr3);
            int iM35639 = c14904.m35638();
            byte[] bArr4 = new byte[iM35639];
            c14904.m35632(0, iM35639, bArr4);
            return new C17890(c19925, bArr4, bArr3, null);
        }
        if (str.equals(OpenSSHPublicKeyUtil.DSS)) {
            int iM356310 = c14904.m35638();
            byte[] bArr5 = new byte[iM356310];
            c14904.m35632(0, iM356310, bArr5);
            int iM356311 = c14904.m35638();
            byte[] bArr6 = new byte[iM356311];
            c14904.m35632(0, iM356311, bArr6);
            int iM356312 = c14904.m35638();
            byte[] bArr7 = new byte[iM356312];
            c14904.m35632(0, iM356312, bArr7);
            int iM356313 = c14904.m35638();
            byte[] bArr8 = new byte[iM356313];
            c14904.m35632(0, iM356313, bArr8);
            return new C5190(c19925, bArr5, bArr6, bArr7, bArr8, null);
        }
        if (!str.equals("ecdsa-sha2-nistp256") && !str.equals("ecdsa-sha2-nistp384") && !str.equals("ecdsa-sha2-nistp521")) {
            if (!str.equals(OpenSSHPublicKeyUtil.ED_25519) && !str.equals("ssh-ed448")) {
                throw new C5813(C16523.m38890("key type ", str, " is not supported"));
            }
            int iM356314 = c14904.m35638();
            byte[] bArr9 = new byte[iM356314];
            c14904.m35632(0, iM356314, bArr9);
            return str.equals(OpenSSHPublicKeyUtil.ED_25519) ? new C3778(c19925, bArr9, null) : new C6601(c19925, bArr9, null);
        }
        byte[] bArrM35629 = c14904.m35628();
        int iM356315 = c14904.m35638();
        c14904.m35629();
        int i = (iM356315 - 1) / 2;
        byte[] bArr10 = new byte[i];
        byte[] bArr11 = new byte[i];
        c14904.m35632(0, i, bArr10);
        c14904.m35632(0, i, bArr11);
        return new C12952(c19925, bArrM35629, bArr10, bArr11, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m7197(C14904 c14904, int i) {
        byte[] bArr = c14904.f48679;
        int i2 = c14904.f48681;
        byte[] bArr2 = null;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                break;
            }
            int i4 = i2;
            while (bArr.length > i4) {
                int i5 = i4 + 1;
                byte b = bArr[i4];
                if (b == 13 || b == 10) {
                    int i6 = (i5 - i2) - 1;
                    if (bArr2 != null) {
                        if (i6 > 0) {
                            byte[] bArr3 = new byte[bArr2.length + i6];
                            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                            System.arraycopy(bArr, i2, bArr3, bArr2.length, i6);
                            C8491.m22182(bArr2);
                            i4 = i5;
                            bArr2 = bArr3;
                            break;
                        }
                    } else {
                        bArr2 = new byte[i6];
                        System.arraycopy(bArr, i2, bArr2, 0, i6);
                    }
                    i4 = i5;
                    break;
                }
                i4 = i5;
            }
            if (i4 < bArr.length && bArr[i4] == 10) {
                i4++;
            }
            i2 = i4;
            i = i3;
        }
        if (bArr2 != null) {
            c14904.f48681 = i2;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7196(C14904 c14904, HashMap map) {
        String strM22168;
        int i;
        String strM22169;
        byte[] bArr = c14904.f48679;
        int i2 = c14904.f48681;
        int i3 = i2;
        while (true) {
            strM22168 = null;
            if (i3 < bArr.length) {
                byte b = bArr[i3];
                if (b == 13 || b == 10) {
                    int i4 = i3 + 1;
                    if (i4 < bArr.length) {
                        byte b2 = bArr[i4];
                    }
                } else {
                    if (b == 58) {
                        strM22169 = C8491.m22168(i2, i3 - i2, bArr);
                        int i5 = i3 + 1;
                        if (i5 < bArr.length && bArr[i5] == 32) {
                            i = i3 + 2;
                            break;
                        }
                        i = i5;
                        break;
                    }
                    i3++;
                }
            }
            i = i2;
            strM22169 = null;
            break;
        }
        if (strM22169 == null) {
            return false;
        }
        for (int i6 = i; i6 < bArr.length; i6++) {
            byte b3 = bArr[i6];
            if (b3 == 13 || b3 == 10) {
                strM22168 = C8491.m22168(i, i6 - i, bArr);
                i = i6 + 1;
                if (i >= bArr.length || bArr[i] != 10) {
                    break;
                    break;
                }
                i = i6 + 2;
                break;
            }
        }
        if (strM22168 != null) {
            map.put(strM22169, strM22168);
            c14904.f48681 = i;
        }
        return strM22168 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7204(AbstractC2367 abstractC2367) {
        this.f8363 = abstractC2367.f8363;
        this.f8371 = abstractC2367.f8371;
        this.f8368 = abstractC2367.f8368;
        this.f8364 = abstractC2367.f8364;
    }
}
