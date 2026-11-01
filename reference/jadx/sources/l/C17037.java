package l;

import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ܿ֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P6N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17037 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12099 m39812(ArrayList arrayList, C13364 c13364) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Image export must run in the background");
        }
        File file = new File(C11904.f39941.mo33986());
        ExecutorService executorService = C4716.f16636;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C13638.requireNonNull(executorService);
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.isEmpty()) {
                throw new IllegalArgumentException("No images selected for export");
            }
            File fileM39815 = null;
            try {
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int i = 0;
                long j = 0;
                while (i < arrayList2.size()) {
                    AbstractC1886.m6135(c13364);
                    AbstractC1886 abstractC1886 = (AbstractC1886) arrayList2.get(i);
                    C13638.requireNonNull(abstractC1886);
                    if (abstractC1886 instanceof C23388) {
                        throw new IOException("Sharing requires the original image source");
                    }
                    C14588 c14588Mo5283 = abstractC1886.mo5283();
                    File fileMo5284 = abstractC1886.mo5284();
                    if (fileMo5284 != null && fileMo5284.isFile() && fileMo5284.canRead()) {
                        abstractC1886.m6137(c14588Mo5283);
                        String str = C14396.f47198;
                        arrayList3.add(C14396.m34656(fileMo5284.getPath()));
                    } else {
                        long j2 = c14588Mo5283.f47739;
                        long j3 = 536870912 - j;
                        if (j2 <= 268435456 && j2 <= j3) {
                            if (fileM39815 == null) {
                                fileM39815 = m39815(file);
                            }
                            File file2 = new File(fileM39815, Integer.toString(i));
                            if (!file2.mkdir()) {
                                throw new IOException("Cannot create image export directory");
                            }
                            File file3 = new File(file2, ".partial");
                            C16332 c16332 = new C16332(file3, Math.min(268435456L, j3), c13364);
                            try {
                                abstractC1886.mo6136((OutputStream) c16332, true, (InterfaceC5614) c13364);
                                AbstractC1886.m6135(c13364);
                                long j4 = c16332.f52618;
                                c16332.close();
                                abstractC1886.m6137(c14588Mo5283);
                                long j5 = c14588Mo5283.f47739;
                                if (j5 >= 0 && j4 != j5) {
                                    throw new C23760("Image export size differs from source snapshot");
                                }
                                File file4 = new File(file2, m39811(abstractC1886.mo5282()));
                                if (!file3.renameTo(file4)) {
                                    throw new IOException("Cannot publish image export file");
                                }
                                j += j4;
                                String str2 = C14396.f47198;
                                arrayList3.add(C14396.m34656(file4.getPath()));
                            } catch (Throwable th) {
                                try {
                                    c16332.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } else {
                            throw new IOException("Image export exceeds byte limit");
                        }
                    }
                    i++;
                    executorService = executorService;
                    arrayList2 = arrayList2;
                }
                ExecutorService executorService2 = executorService;
                AbstractC1886.m6135(c13364);
                if (fileM39815 != null && !fileM39815.setLastModified(System.currentTimeMillis())) {
                    throw new IOException("Cannot timestamp image export directory");
                }
                return new C12099(arrayList3, fileM39815, executorService2);
            } catch (Throwable th3) {
                m39814(fileM39815);
                throw th3;
            }
        }
        throw new IllegalStateException("Image export must run in the background");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static File m39815(File file) throws IOException {
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new IOException("Cannot create image export parent");
        }
        for (int i = 0; i < 8; i++) {
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            File file2 = new File(file, "temp_" + Integer.toString(Math.abs(new Random().nextInt() + 1817260513), 36) + "_" + Integer.toString(iCurrentTimeMillis, 36));
            if (file2.mkdir()) {
                return file2;
            }
        }
        throw new IOException("Cannot create unique image export batch");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39811(String str) {
        String strSubstring;
        int i;
        if (str != null && !str.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int iCharCount = 0;
            while (iCharCount < str.length()) {
                int iCodePointAt = str.codePointAt(iCharCount);
                iCharCount += Character.charCount(iCodePointAt);
                if (iCodePointAt == 47 || iCodePointAt == 92 || Character.isISOControl(iCodePointAt)) {
                    iCodePointAt = 95;
                }
                sb.appendCodePoint(iCodePointAt);
            }
            String string = sb.toString();
            if (!string.equals(".") && !string.equals("..")) {
                int iLastIndexOf = string.lastIndexOf(46);
                if (string.endsWith(".9.png")) {
                    iLastIndexOf = string.length() - 6;
                }
                if (iLastIndexOf <= 0 || string.length() - iLastIndexOf > 20) {
                    strSubstring = "";
                } else {
                    strSubstring = string.substring(iLastIndexOf);
                    string = string.substring(0, iLastIndexOf);
                }
                int iCharCount2 = 0;
                int i2 = 0;
                while (iCharCount2 < string.length()) {
                    int iCodePointAt2 = string.codePointAt(iCharCount2);
                    if (iCodePointAt2 < 128) {
                        i = 1;
                    } else if (iCodePointAt2 < 2048) {
                        i = 2;
                    } else {
                        i = iCodePointAt2 < 65536 ? 3 : 4;
                    }
                    i2 += i;
                    if (i2 > 160) {
                        break;
                    }
                    iCharCount2 += Character.charCount(iCodePointAt2);
                }
                return string.substring(0, iCharCount2) + strSubstring;
            }
        }
        return "image";
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m39814(File file) {
        if (file == null) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                File[] fileArrListFiles2 = file2.listFiles();
                if (fileArrListFiles2 != null) {
                    for (File file3 : fileArrListFiles2) {
                        file3.delete();
                    }
                }
                file2.delete();
            }
        }
        file.delete();
    }
}
