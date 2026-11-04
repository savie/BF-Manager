package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩺֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BB */
/* JADX INFO: loaded from: classes.dex */
public final class C23947 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC14953 f77513 = new C12012(206, "Partial Content");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC14953 f77514 = new C12012(416, "Requested Range Not Satisfiable");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m53474(C3767 c3767) {
        C6047 c6047M17554;
        int iIndexOf;
        EnumC12716 enumC12716M12226 = c3767.m12226();
        if (!EnumC12716.GET.equals(enumC12716M12226) && !EnumC12716.HEAD.equals(enumC12716M12226)) {
            return C12802.m31751(EnumC21667.METHOD_NOT_ALLOWED, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        String strM53547 = C23991.m53547(c3767, MotionUtils.EASING_TYPE_PATH);
        if (TextUtils.isEmpty(strM53547)) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        String strM53548 = C23991.m53547(c3767, "disposition");
        if (!"inline".equals(strM53548) && !"attachment".equals(strM53548)) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "disposition"));
        }
        C6004 c6004M1142 = C0080.m1142(strM53547);
        if (c6004M1142 == null || !c6004M1142.mo8093().mo2934()) {
            return C12802.m31751(EnumC21667.NOT_FOUND, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        if (c6004M1142.isDirectory()) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        long jMax = Math.max(c6004M1142.getSize(), 0L);
        String strM53541 = C23991.m53541(c3767, "range");
        if (TextUtils.isEmpty(strM53541)) {
            c6047M17554 = C6047.m17555(jMax);
        } else {
            String strTrim = strM53541.trim();
            if (strTrim.startsWith("bytes=")) {
                String strTrim2 = strTrim.substring(6).trim();
                if (TextUtils.isEmpty(strTrim2) || strTrim2.contains(",") || (iIndexOf = strTrim2.indexOf(45)) < 0) {
                    c6047M17554 = C6047.m17554();
                } else {
                    String strTrim3 = strTrim2.substring(0, iIndexOf).trim();
                    String strTrim4 = strTrim2.substring(iIndexOf + 1).trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        try {
                            long j = Long.parseLong(strTrim3);
                            if (j < 0 || j >= jMax) {
                                c6047M17554 = C6047.m17554();
                            } else {
                                long j2 = jMax - 1;
                                if (TextUtils.isEmpty(strTrim4)) {
                                    c6047M17554 = C6047.m17556(j, j2);
                                } else {
                                    try {
                                        long j3 = Long.parseLong(strTrim4);
                                        if (j3 < j) {
                                            c6047M17554 = C6047.m17554();
                                        } else {
                                            if (j3 < jMax) {
                                                j2 = j3;
                                            }
                                            c6047M17554 = C6047.m17556(j, j2);
                                        }
                                    } catch (NumberFormatException unused) {
                                        c6047M17554 = C6047.m17554();
                                    }
                                }
                            }
                        } catch (NumberFormatException unused2) {
                            c6047M17554 = C6047.m17554();
                        }
                    } else if (TextUtils.isEmpty(strTrim4)) {
                        c6047M17554 = C6047.m17554();
                    } else {
                        try {
                            long j4 = Long.parseLong(strTrim4);
                            c6047M17554 = (j4 <= 0 || jMax <= 0) ? C6047.m17554() : C6047.m17556(Math.max(jMax - j4, 0L), jMax - 1);
                        } catch (NumberFormatException unused3) {
                            c6047M17554 = C6047.m17554();
                        }
                    }
                }
            } else {
                c6047M17554 = C6047.m17554();
            }
        }
        boolean z = c6047M17554.f20692;
        long j5 = c6047M17554.f20690;
        long j6 = c6047M17554.f20691;
        if (!c6047M17554.f20693) {
            C18683 c18683M5422 = AbstractC1530.m5422(f77514, "text/plain", "");
            c18683M5422.m43440("Accept-Ranges", "bytes");
            c18683M5422.m43440("Content-Range", "bytes */" + jMax);
            c18683M5422.m43441(enumC12716M12226);
            return c18683M5422;
        }
        long j7 = (j5 - j6) + 1;
        try {
            EnumC12716 enumC12716 = EnumC12716.HEAD;
            InputStream byteArrayInputStream = enumC12716.equals(enumC12716M12226) ? new ByteArrayInputStream(new byte[0]) : new C20217(j7, m53472(c6004M1142, j6));
            String strMo8114 = TextUtils.isEmpty(c6004M1142.mo8114()) ? "application/octet-stream" : c6004M1142.mo8114();
            C18683 c18683M5421 = AbstractC1530.m5421(z ? f77513 : EnumC21667.OK, strMo8114, byteArrayInputStream, j7);
            c18683M5421.m43441(enumC12716M12226);
            c18683M5421.m43440("Accept-Ranges", "bytes");
            c18683M5421.m43440("Referrer-Policy", "no-referrer");
            c18683M5421.m43440("Content-Disposition", m53473(c6004M1142.getName(), strM53548));
            if (enumC12716.equals(enumC12716M12226) && strMo8114.startsWith("image/")) {
                long time = c6004M1142.getTime();
                try {
                    InputStream inputStreamMo20829 = C11969.f38536.mo20829((AbstractActivityC17204) null, c6004M1142);
                    if (inputStreamMo20829 != null) {
                        try {
                            Long lM37477 = C15701.m37477(new C8826(inputStreamMo20829, 0));
                            if (lM37477 != null) {
                                time = lM37477.longValue();
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamMo20829.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (inputStreamMo20829 != null) {
                        inputStreamMo20829.close();
                    }
                } catch (IOException | RuntimeException unused4) {
                }
                c18683M5421.m43440("X-MT-Preview-Time", C22482.m50718(time));
            }
            if (z) {
                StringBuilder sbM8289 = C2458.m8289("bytes ", "-", j6);
                sbM8289.append(j5);
                sbM8289.append("/");
                sbM8289.append(jMax);
                c18683M5421.m43440("Content-Range", sbM8289.toString());
            }
            return c18683M5421;
        } catch (IOException unused5) {
            return C12802.m31751(EnumC21667.NOT_FOUND, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m53472(C6004 c6004, long j) throws IOException {
        InputStream inputStreamMo20829 = C11969.f38536.mo20829((AbstractActivityC17204) null, c6004);
        if (inputStreamMo20829 == null) {
            throw new IOException("file stream is not available");
        }
        try {
            byte[] bArr = new byte[8192];
            while (j > 0) {
                long jSkip = inputStreamMo20829.skip(j);
                if (jSkip > 0) {
                    j -= jSkip;
                } else {
                    int i = inputStreamMo20829.read(bArr, 0, (int) Math.min(8192, j));
                    if (i == -1) {
                        throw new IOException("unexpected eof");
                    }
                    j -= (long) i;
                }
            }
            return inputStreamMo20829;
        } catch (IOException e) {
            try {
                inputStreamMo20829.close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m53473(String str, String str2) {
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
            string = C22837.encode(str, StandardCharsets.UTF_8.name()).replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20");
        } catch (Exception unused) {
            string = sb.toString();
        }
        return str2 + "; filename=\"" + ((Object) sb) + "\"; filename*=UTF-8''" + string;
    }
}
