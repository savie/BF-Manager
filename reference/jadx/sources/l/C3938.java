package l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3938 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f13439;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f13442;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f13443;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[][] f13441 = new byte[16][];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f13440 = new int[4];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m12655(int i, byte[] bArr) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f13439;
            if (i2 >= iArr.length) {
                int i3 = this.f13443;
                iArr[i3] = i;
                this.f13441[i3] = bArr;
                this.f13443 = (i3 + 1) % iArr.length;
                return;
            }
            if (iArr[i2] == i) {
                this.f13441[i2] = bArr;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m12656(int i) {
        byte[] bArr;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f13439;
            if (i2 >= iArr.length) {
                bArr = null;
                break;
            }
            if (iArr[i2] == i && (bArr = this.f13441[i2]) != null) {
                break;
            }
            i2++;
        }
        return bArr;
    }

    public C3938() {
        int[] iArr = new int[16];
        this.f13439 = iArr;
        Arrays.fill(iArr, -1);
        Arrays.fill(this.f13440, -1);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0024 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0006, B:9:0x000b, B:11:0x000f, B:20:0x001f, B:22:0x0024, B:30:0x0034, B:32:0x0039, B:33:0x0049), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x002c A[LOOP:1: B:20:0x001f->B:25:0x002c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0032 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:30:0x0034 A[Catch: all -> 0x0055, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0006, B:9:0x000b, B:11:0x000f, B:20:0x001f, B:22:0x0024, B:30:0x0034, B:32:0x0039, B:33:0x0049), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0039 A[Catch: all -> 0x0055, TryCatch #0 {, blocks: (B:7:0x0006, B:9:0x000b, B:11:0x000f, B:20:0x001f, B:22:0x0024, B:30:0x0034, B:32:0x0039, B:33:0x0049), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x002f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x002a A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12653(C3938 c3938, int i, boolean z) {
        int i2;
        int i3;
        boolean z2;
        int[] iArr;
        byte[] bArr;
        synchronized (c3938) {
            if (z) {
                i2 = 0;
                while (true) {
                    i3 = c3938.f13442;
                    if (i2 < i3) {
                        z2 = false;
                        break;
                    }
                    if (c3938.f13440[i2] == i) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                if (z2) {
                    return false;
                }
                iArr = c3938.f13440;
                if (i3 == iArr.length) {
                    int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
                    c3938.f13440 = iArrCopyOf;
                    Arrays.fill(iArrCopyOf, c3938.f13442, iArrCopyOf.length, -1);
                }
                int[] iArr2 = c3938.f13440;
                int i4 = c3938.f13442;
                c3938.f13442 = i4 + 1;
                iArr2[i4] = i;
                return true;
            }
            int i5 = 0;
            while (true) {
                int[] iArr3 = c3938.f13439;
                if (i5 >= iArr3.length) {
                    bArr = null;
                    break;
                }
                if (iArr3[i5] == i && (bArr = c3938.f13441[i5]) != null) {
                    break;
                }
                i5++;
            }
            if (bArr != null) {
                return false;
            }
            i2 = 0;
            while (true) {
                i3 = c3938.f13442;
                if (i2 < i3) {
                    z2 = false;
                    break;
                }
                if (c3938.f13440[i2] == i) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return false;
            }
            iArr = c3938.f13440;
            if (i3 == iArr.length) {
                int[] iArrCopyOf2 = Arrays.copyOf(iArr, iArr.length * 2);
                c3938.f13440 = iArrCopyOf2;
                Arrays.fill(iArrCopyOf2, c3938.f13442, iArrCopyOf2.length, -1);
            }
            int[] iArr4 = c3938.f13440;
            int i6 = c3938.f13442;
            c3938.f13442 = i6 + 1;
            iArr4[i6] = i;
            return true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12652(C3938 c3938) {
        synchronized (c3938) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12651(int i, C3938 c3938) {
        synchronized (c3938) {
            int i2 = 0;
            while (true) {
                int i3 = c3938.f13442;
                if (i2 >= i3) {
                    break;
                }
                int[] iArr = c3938.f13440;
                if (iArr[i2] == i) {
                    int i4 = i3 - 1;
                    c3938.f13442 = i4;
                    iArr[i2] = iArr[i4];
                    iArr[i4] = -1;
                    break;
                }
                i2++;
            }
            c3938.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m12654(int i, C3938 c3938) {
        synchronized (c3938) {
            while (true) {
                boolean z = false;
                for (int i2 = 0; i2 < c3938.f13442; i2++) {
                    try {
                        if (c3938.f13440[i2] == i) {
                            z = true;
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    try {
                        c3938.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Interrupted while reading smali cache data", e);
                    }
                }
            }
        }
    }
}
