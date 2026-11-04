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

/* JADX INFO: renamed from: l.ۜۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6XW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6877 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19144(C12512 c12512, ArrayList arrayList) throws C10186, IOException {
        boolean z = c12512.f40173;
        AbstractC22044 abstractC22044 = c12512.f40175;
        if (!z) {
            throw C10186.m26302("FILE_NOT_FOUND", "The requested file path does not exist.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, abstractC22044.mo4294()).add("operation", "patch_validate"));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8368 c8368 = (C8368) it.next();
            if (c8368.f27454 > c12512.f40174) {
                throw m19141(c12512, c8368);
            }
        }
        InputStream inputStreamM31067 = c12512.m31067();
        try {
            Iterator it2 = arrayList.iterator();
            long j = 0;
            while (it2.hasNext()) {
                C8368 c8369 = (C8368) it2.next();
                long j2 = c8369.f27451;
                byte[] bArr = c8369.f27452;
                m19142(j2 - j, inputStreamM31067);
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                int i = 0;
                while (i < length) {
                    int i2 = inputStreamM31067.read(bArr2, i, length - i);
                    if (i2 >= 0) {
                        if (i2 == 0) {
                            int i3 = inputStreamM31067.read();
                            if (i3 >= 0) {
                                bArr2[i] = (byte) i3;
                                i++;
                            }
                        } else {
                            i += i2;
                        }
                    }
                    throw m19141(c12512, c8369);
                }
                if (!Arrays.equals(bArr2, bArr)) {
                    throw C10186.m26302("FILE_PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, abstractC22044.mo4294()).add("operation", "patch_validate").add("backendReason", "expected_bytes_mismatch").add("failedPatchIndex", c8369.f27455).add("byteOffset", c8369.f27451).add("expectedHex", C16973.m40022(bArr)).add("actualHex", C16973.m40022(bArr2)));
                }
                j = c8369.f27454;
            }
            if (inputStreamM31067 != null) {
                inputStreamM31067.close();
            }
        } catch (Throwable th) {
            if (inputStreamM31067 != null) {
                try {
                    inputStreamM31067.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19143(C12512 c12512, BufferedOutputStream bufferedOutputStream, ArrayList arrayList) throws IOException {
        long j;
        InputStream inputStreamM31067 = c12512.m31067();
        try {
            byte[] bArr = new byte[65536];
            Iterator it = arrayList.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                C8368 c8368 = (C8368) it.next();
                long j3 = c8368.f27451 - j2;
                while (j3 > 0) {
                    int i = inputStreamM31067.read(bArr, 0, (int) Math.min(65536, j3));
                    if (i < 0) {
                        throw new IOException("Unexpected end of file before patch window");
                    }
                    if (i == 0) {
                        int i2 = inputStreamM31067.read();
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
                m19142(c8368.f27452.length, inputStreamM31067);
                bufferedOutputStream.write(c8368.f27453);
                j2 = c8368.f27454;
            }
            while (true) {
                int i3 = inputStreamM31067.read(bArr);
                if (i3 < 0) {
                    break;
                }
                if (i3 == 0) {
                    int i4 = inputStreamM31067.read();
                    if (i4 < 0) {
                        break;
                    } else {
                        bufferedOutputStream.write(i4);
                    }
                } else {
                    bufferedOutputStream.write(bArr, 0, i3);
                }
            }
            inputStreamM31067.close();
        } catch (Throwable th) {
            if (inputStreamM31067 != null) {
                try {
                    inputStreamM31067.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m19141(C12512 c12512, C8368 c8368) {
        return C10186.m26302("FILE_OFFSET_OUT_OF_RANGE", "A byte patch range is outside the file.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, c12512.f40175.mo4294()).add("operation", "patch_validate").add("backendReason", "patch_after_end").add("failedPatchIndex", c8368.f27455).add("byteOffset", c8368.f27451).add("endByteOffset", c8368.f27454).add("totalBytes", c12512.f40174));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19142(long j, InputStream inputStream) throws IOException {
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
