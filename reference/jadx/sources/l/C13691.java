package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܰ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BB */
/* JADX INFO: loaded from: classes3.dex */
public final class C13691 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC9180 f45160 = new C3415(206, "Partial Content");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC9180 f45161 = new C3415(416, "Requested Range Not Satisfiable");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m33397(C15530 c15530) {
        C4517 c4517M12619;
        int iIndexOf;
        EnumC18351 enumC18351M37142 = c15530.m37142();
        if (!EnumC18351.GET.equals(enumC18351M37142) && !EnumC18351.HEAD.equals(enumC18351M37142)) {
            return C12610.m31384(EnumC10591.METHOD_NOT_ALLOWED, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        String strM14444 = C5244.m14444(c15530, MotionUtils.EASING_TYPE_PATH);
        if (TextUtils.isEmpty(strM14444)) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        String strM14445 = C5244.m14444(c15530, "disposition");
        if (!"inline".equals(strM14445) && !"attachment".equals(strM14445)) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "disposition"));
        }
        C6794 c6794M32110 = C12985.m32110(strM14444);
        if (c6794M32110 == null || !c6794M32110.mo7989().mo33975()) {
            return C12610.m31384(EnumC10591.NOT_FOUND, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        if (c6794M32110.isDirectory()) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        long jMax = Math.max(c6794M32110.getSize(), 0L);
        String strM14439 = C5244.m14439(c15530, "range");
        if (TextUtils.isEmpty(strM14439)) {
            c4517M12619 = C4517.m12620(jMax);
        } else {
            String strTrim = strM14439.trim();
            if (strTrim.startsWith("bytes=")) {
                String strTrim2 = strTrim.substring(6).trim();
                if (TextUtils.isEmpty(strTrim2) || strTrim2.contains(",") || (iIndexOf = strTrim2.indexOf(45)) < 0) {
                    c4517M12619 = C4517.m12619();
                } else {
                    String strTrim3 = strTrim2.substring(0, iIndexOf).trim();
                    String strTrim4 = strTrim2.substring(iIndexOf + 1).trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        try {
                            long j = Long.parseLong(strTrim3);
                            if (j < 0 || j >= jMax) {
                                c4517M12619 = C4517.m12619();
                            } else {
                                long j2 = jMax - 1;
                                if (TextUtils.isEmpty(strTrim4)) {
                                    c4517M12619 = C4517.m12621(j, j2);
                                } else {
                                    try {
                                        long j3 = Long.parseLong(strTrim4);
                                        if (j3 < j) {
                                            c4517M12619 = C4517.m12619();
                                        } else {
                                            if (j3 < jMax) {
                                                j2 = j3;
                                            }
                                            c4517M12619 = C4517.m12621(j, j2);
                                        }
                                    } catch (NumberFormatException unused) {
                                        c4517M12619 = C4517.m12619();
                                    }
                                }
                            }
                        } catch (NumberFormatException unused2) {
                            c4517M12619 = C4517.m12619();
                        }
                    } else if (TextUtils.isEmpty(strTrim4)) {
                        c4517M12619 = C4517.m12619();
                    } else {
                        try {
                            long j4 = Long.parseLong(strTrim4);
                            c4517M12619 = (j4 <= 0 || jMax <= 0) ? C4517.m12619() : C4517.m12621(Math.max(jMax - j4, 0L), jMax - 1);
                        } catch (NumberFormatException unused3) {
                            c4517M12619 = C4517.m12619();
                        }
                    }
                }
            } else {
                c4517M12619 = C4517.m12619();
            }
        }
        boolean z = c4517M12619.f16079;
        long j5 = c4517M12619.f16077;
        long j6 = c4517M12619.f16078;
        if (!c4517M12619.f16076) {
            C7768 c7768M39639 = AbstractC16940.m39639(f45161, "text/plain", "");
            c7768M39639.m20448("Accept-Ranges", "bytes");
            c7768M39639.m20448("Content-Range", "bytes */" + jMax);
            c7768M39639.m20449(enumC18351M37142);
            return c7768M39639;
        }
        long j7 = (j5 - j6) + 1;
        try {
            EnumC18351 enumC18351 = EnumC18351.HEAD;
            InputStream byteArrayInputStream = enumC18351.equals(enumC18351M37142) ? new ByteArrayInputStream(new byte[0]) : new C9767(j7, m33395(c6794M32110, j6));
            String strMo7967 = TextUtils.isEmpty(c6794M32110.mo7967()) ? "application/octet-stream" : c6794M32110.mo7967();
            C7768 c7768M39638 = AbstractC16940.m39638(z ? f45160 : EnumC10591.OK, strMo7967, byteArrayInputStream, j7);
            c7768M39638.m20449(enumC18351M37142);
            c7768M39638.m20448("Accept-Ranges", "bytes");
            c7768M39638.m20448("Referrer-Policy", "no-referrer");
            c7768M39638.m20448("Content-Disposition", m33396(c6794M32110.getName(), strM14445));
            if (enumC18351.equals(enumC18351M37142) && strMo7967.startsWith("image/")) {
                long time = c6794M32110.getTime();
                try {
                    InputStream inputStreamMo15073 = C21611.f70098.mo15073((AbstractActivityC12483) null, c6794M32110);
                    if (inputStreamMo15073 != null) {
                        try {
                            Long lM14996 = C5422.m14996(new C3021(inputStreamMo15073, 0));
                            if (lM14996 != null) {
                                time = lM14996.longValue();
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamMo15073.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (inputStreamMo15073 != null) {
                        inputStreamMo15073.close();
                    }
                } catch (IOException | RuntimeException unused4) {
                }
                c7768M39638.m20448("X-MT-Preview-Time", C5319.m14744(time));
            }
            if (z) {
                StringBuilder sbM39970 = C17114.m39970("bytes ", "-", j6);
                sbM39970.append(j5);
                sbM39970.append("/");
                sbM39970.append(jMax);
                c7768M39638.m20448("Content-Range", sbM39970.toString());
            }
            return c7768M39638;
        } catch (IOException unused5) {
            return C12610.m31384(EnumC10591.NOT_FOUND, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m33395(C6794 c6794, long j) throws IOException {
        InputStream inputStreamMo15073 = C21611.f70098.mo15073((AbstractActivityC12483) null, c6794);
        if (inputStreamMo15073 == null) {
            throw new IOException("file stream is not available");
        }
        try {
            byte[] bArr = new byte[8192];
            while (j > 0) {
                long jSkip = inputStreamMo15073.skip(j);
                if (jSkip > 0) {
                    j -= jSkip;
                } else {
                    int i = inputStreamMo15073.read(bArr, 0, (int) Math.min(8192, j));
                    if (i == -1) {
                        throw new IOException("unexpected eof");
                    }
                    j -= (long) i;
                }
            }
            return inputStreamMo15073;
        } catch (IOException e) {
            try {
                inputStreamMo15073.close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m33396(String str, String str2) {
        String string;
        if (TextUtils.isEmpty(str)) {
            str = "download";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127 || cCharAt == '\"' || cCharAt == '\\') {
                sb.append('_');
            } else {
                sb.append(cCharAt);
            }
        }
        try {
            string = C17290.encode(str, StandardCharsets.UTF_8.name()).replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20");
        } catch (Exception unused) {
            string = sb.toString();
        }
        return str2 + "; filename=\"" + ((Object) sb) + "\"; filename*=UTF-8''" + string;
    }
}
