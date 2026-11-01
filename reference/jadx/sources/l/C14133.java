package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I6XW */
/* JADX INFO: loaded from: classes3.dex */
public final class C14133 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34175(C21145 c21145, ArrayList arrayList) throws C12731, IOException {
        boolean z = c21145.f68867;
        AbstractC20745 abstractC20745 = c21145.f68869;
        if (!z) {
            throw C12731.m31627("FILE_NOT_FOUND", "The requested file path does not exist.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, abstractC20745.mo33986()).add("operation", "patch_validate"));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4959 c4959 = (C4959) it.next();
            if (c4959.f17310 > c21145.f68868) {
                throw m34172(c21145, c4959);
            }
        }
        InputStream inputStreamM47580 = c21145.m47580();
        try {
            Iterator it2 = arrayList.iterator();
            long j = 0;
            while (it2.hasNext()) {
                C4959 c49510 = (C4959) it2.next();
                long j2 = c49510.f17307;
                byte[] bArr = c49510.f17309;
                m34173(j2 - j, inputStreamM47580);
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                int i = 0;
                while (i < length) {
                    int i2 = inputStreamM47580.read(bArr2, i, length - i);
                    if (i2 >= 0) {
                        if (i2 == 0) {
                            int i3 = inputStreamM47580.read();
                            if (i3 >= 0) {
                                bArr2[i] = (byte) i3;
                                i++;
                            }
                        } else {
                            i += i2;
                        }
                    }
                    throw m34172(c21145, c49510);
                }
                if (!Arrays.equals(bArr2, bArr)) {
                    throw C12731.m31627("FILE_PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, abstractC20745.mo33986()).add("operation", "patch_validate").add("backendReason", "expected_bytes_mismatch").add("failedPatchIndex", c49510.f17306).add("byteOffset", c49510.f17307).add("expectedHex", C9754.m24738(bArr)).add("actualHex", C9754.m24738(bArr2)));
                }
                j = c49510.f17310;
            }
            if (inputStreamM47580 != null) {
                inputStreamM47580.close();
            }
        } catch (Throwable th) {
            if (inputStreamM47580 != null) {
                try {
                    inputStreamM47580.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34174(C21145 c21145, BufferedOutputStream bufferedOutputStream, ArrayList arrayList) throws IOException {
        long j;
        InputStream inputStreamM47580 = c21145.m47580();
        try {
            byte[] bArr = new byte[65536];
            Iterator it = arrayList.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                C4959 c4959 = (C4959) it.next();
                long j3 = c4959.f17307 - j2;
                while (j3 > 0) {
                    int i = inputStreamM47580.read(bArr, 0, (int) Math.min(65536, j3));
                    if (i < 0) {
                        throw new IOException("Unexpected end of file before patch window");
                    }
                    if (i == 0) {
                        int i2 = inputStreamM47580.read();
                        if (i2 < 0) {
                            throw new IOException("Unexpected end of file before patch window");
                        }
                        bufferedOutputStream.write(i2);
                        j = 1;
                    } else {
                        bufferedOutputStream.write(bArr, 0, i);
                        j = i;
                    }
                    j3 -= j;
                }
                m34173(c4959.f17309.length, inputStreamM47580);
                bufferedOutputStream.write(c4959.f17308);
                j2 = c4959.f17310;
            }
            while (true) {
                int i3 = inputStreamM47580.read(bArr);
                if (i3 < 0) {
                    break;
                }
                if (i3 == 0) {
                    int i4 = inputStreamM47580.read();
                    if (i4 < 0) {
                        break;
                    } else {
                        bufferedOutputStream.write(i4);
                    }
                } else {
                    bufferedOutputStream.write(bArr, 0, i3);
                }
            }
            inputStreamM47580.close();
        } catch (Throwable th) {
            if (inputStreamM47580 != null) {
                try {
                    inputStreamM47580.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m34172(C21145 c21145, C4959 c4959) {
        return C12731.m31627("FILE_OFFSET_OUT_OF_RANGE", "A byte patch range is outside the file.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, c21145.f68869.mo33986()).add("operation", "patch_validate").add("backendReason", "patch_after_end").add("failedPatchIndex", c4959.f17306).add("byteOffset", c4959.f17307).add("endByteOffset", c4959.f17310).add("totalBytes", c21145.f68868));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34173(long j, InputStream inputStream) throws IOException {
        byte[] bArr = null;
        while (j > 0) {
            long jSkip = inputStream.skip(j);
            if (jSkip > 0) {
                j -= jSkip;
            } else {
                if (bArr == null) {
                    bArr = new byte[65536];
                }
                int i = inputStream.read(bArr, 0, (int) Math.min(bArr.length, j));
                if (i < 0) {
                    throw new IOException("Unexpected end of file while seeking patch window");
                }
                if (i == 0) {
                    if (inputStream.read() < 0) {
                        throw new IOException("Unexpected end of file while seeking patch window");
                    }
                    i = 1;
                }
                j -= (long) i;
            }
        }
    }
}
