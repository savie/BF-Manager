package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ᩳۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A774 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17763 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] f56343;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f56344;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f56345;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f56346;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f56347;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f56348;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f56349;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f56350;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f56351;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f56352;

    public C17763(int i, String str, byte[] bArr, byte[] bArr2, String str2, String str3, byte[] bArr3, String str4, String str5) {
        this.f56352 = i;
        this.f56348 = str;
        this.f56345 = str4;
        this.f56351 = str5;
        this.f56343 = Arrays.copyOf(bArr, bArr.length);
        this.f56350 = C22253.m49424(bArr);
        this.f56347 = str2;
        this.f56344 = str3;
        this.f56346 = Arrays.copyOf(bArr2, bArr2.length);
        this.f56349 = Arrays.copyOf(bArr3, bArr3.length);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17763 m41326(int i, String str, String str2, String str3, byte[] bArr) {
        return new C17763(i, str, m41324(i, str), C22253.m49421().digest(bArr), str2, str3, bArr, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17763 m41320(int i, String str, String str2, String str3, byte[] bArr) {
        return new C17763(i, str, m41324(i, str), C22253.m49421().digest(bArr), "missing", C1098.m4099(bArr), bArr, str2, str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17763 m41328(String str, byte[] bArr, String str2) {
        return new C17763(this.f56352, this.f56348, this.f56343, C22253.m49421().digest(bArr), str, str2, bArr, this.f56345, this.f56351);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41330() {
        return this.f56345 != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17763 m41327(AbstractC20745 abstractC20745) throws C12731 {
        String str;
        String str2;
        String name = abstractC20745.getName();
        if (!m41323(name)) {
            throw C12731.m31630("RESOURCE_PATCH_CORRUPT", "Invalid resource patch file name.");
        }
        try {
            byte[] bArrM46727 = abstractC20745.m46727();
            C17367 c17367 = new C17367(bArrM46727);
            if (c17367.readInt() != 1297240144) {
                throw new IOException("Unsupported resource patch format");
            }
            int i = c17367.readInt();
            if (i != 1 && i != 2) {
                throw new IOException("Unsupported resource patch format");
            }
            int i2 = c17367.readInt();
            String strM40458 = c17367.m40458();
            if (i < 2 || !c17367.m40461()) {
                str = null;
                str2 = null;
            } else {
                String strM40442 = c17367.m40442();
                String strM40443 = c17367.m40442();
                if (strM40442.isEmpty() || strM40443.isEmpty()) {
                    throw new IOException("Invalid resource patch identity");
                }
                str = strM40442;
                str2 = strM40443;
            }
            String strM40459 = c17367.m40458();
            String strM404510 = c17367.m40458();
            byte[] bArr = new byte[32];
            c17367.m40446(32, bArr);
            int length = c17367.readInt();
            if (length < 0 || length > c17367.available() - 4) {
                throw new IOException("Invalid resource patch payload length");
            }
            byte[] bArr2 = new byte[length];
            c17367.m40446(length, bArr2);
            int i3 = c17367.readInt();
            if (c17367.available() != 0) {
                throw new IOException("Trailing resource patch bytes");
            }
            CRC32 crc32 = new CRC32();
            byte[] bArr3 = i == 1 ? bArr2 : bArrM46727;
            if (i != 1) {
                length = bArrM46727.length - 4;
            }
            crc32.update(bArr3, 0, length);
            if (((int) crc32.getValue()) != i3) {
                throw new IOException("Resource patch CRC mismatch");
            }
            if (!Arrays.equals(bArr, C22253.m49421().digest(bArr2))) {
                throw new IOException("Resource patch entry hash mismatch");
            }
            String strM4099 = C1098.m4099(bArr2);
            if (!strM4099.equals(strM404510) && !"sha256:".concat(C22253.m49424(bArr)).equals(strM404510) && (strM404510.length() != 40 || !C22253.m49424(C22253.m49425().digest(bArr2)).equals(strM404510))) {
                throw new IOException("Resource patch targetVersion mismatch");
            }
            byte[] bArrM41324 = m41324(i2, strM40458);
            if (!name.equals(C22253.m49424(bArrM41324).concat(".bin"))) {
                throw new IOException("Resource patch target hash mismatch");
            }
            return new C17763(i2, strM40458, bArrM41324, bArr, strM40459, strM4099, bArr2, str, str2);
        } catch (Exception e) {
            throw C12731.m31630("RESOURCE_PATCH_CORRUPT", e.getMessage() == null ? "Resource patch is corrupt." : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41329(AbstractC20745 abstractC20745) {
        AbstractC20745 abstractC20745M41321 = m41321(abstractC20745, this.f56350);
        abstractC20745M41321.mo46720();
        AbstractC20745 abstractC20745M46733 = abstractC20745M41321.m46733(".resource_patch");
        try {
            OutputStream outputStreamMo33976 = abstractC20745M46733.mo33976(false);
            try {
                m41322(outputStreamMo33976);
                outputStreamMo33976.close();
                abstractC20745M46733.m46702(abstractC20745M41321, false, true, null);
                if (abstractC20745M46733.mo33975()) {
                    abstractC20745M46733.mo24647();
                }
            } catch (Throwable th) {
                if (outputStreamMo33976 != null) {
                    try {
                        outputStreamMo33976.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC20745M46733.mo33975()) {
                abstractC20745M46733.mo24647();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m41321(AbstractC20745 abstractC20745, String str) {
        return abstractC20745.m46690(str + ".bin");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41323(String str) {
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
    public static byte[] m41324(int i, String str) {
        C11018 c11018 = new C11018(64);
        c11018.writeInt(1);
        c11018.writeInt(i);
        c11018.m27786(str);
        return c11018.m27785(C22253.m49421());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m41325(ArrayList arrayList, byte[] bArr) {
        ArrayList<C17763> arrayListM41319 = m41319(arrayList);
        C11018 c11018 = new C11018((arrayListM41319.size() * 64) + 64);
        c11018.writeInt(2);
        c11018.write(bArr, 0, bArr.length);
        c11018.writeInt(arrayListM41319.size());
        for (C17763 c17763 : arrayListM41319) {
            c11018.write(c17763.f56343);
            c11018.write(c17763.f56346);
            c11018.m27784(c17763.m41330());
            if (c17763.m41330()) {
                c11018.m27782((CharSequence) c17763.f56345);
                c11018.m27782((CharSequence) c17763.f56351);
            }
            c11018.m27786(c17763.f56344);
        }
        return c11018.m27785(C22253.m49421());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41319(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        C23846.sort(arrayList2, C7618.comparing(new C23590(4)));
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41322(OutputStream outputStream) throws IOException {
        C11018 c11018 = new C11018(96);
        c11018.writeInt(1297240144);
        c11018.writeInt(2);
        c11018.writeInt(this.f56352);
        c11018.m27786(this.f56348);
        c11018.m27784(m41330());
        if (m41330()) {
            c11018.m27782((CharSequence) this.f56345);
            c11018.m27782((CharSequence) this.f56351);
        }
        c11018.m27786(this.f56347);
        c11018.m27786(this.f56344);
        c11018.write(this.f56346);
        byte[] bArr = this.f56349;
        c11018.writeInt(bArr.length);
        CRC32 crc32 = new CRC32();
        crc32.update(c11018.m27788(), 0, c11018.size());
        crc32.update(bArr, 0, bArr.length);
        c11018.m27780(outputStream);
        outputStream.write(bArr);
        c11018.m27774();
        c11018.writeInt((int) crc32.getValue());
        c11018.m27780(outputStream);
    }
}
