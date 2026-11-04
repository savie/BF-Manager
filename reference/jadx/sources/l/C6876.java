package l;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۜۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 675F */
/* JADX INFO: loaded from: classes3.dex */
public final class C6876 extends C3147 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f22836 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f22834 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f22835 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static File m19139(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, C2764.m9137(sb, j2, ".v3.exo"));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6876 m19140(File file, long j, long j2, C21047 c21047) {
        File file2;
        long j3;
        String strGroup;
        File fileM19139;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = f22834.matcher(name2);
            if (matcher.matches()) {
                String strGroup2 = matcher.group(1);
                strGroup2.getClass();
                strGroup = C7116.m19501(strGroup2);
            } else {
                matcher = f22836.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileM19139 = null;
            } else {
                File parentFile = file.getParentFile();
                C20782.m47566(parentFile);
                int i = c21047.m48105(strGroup).f20941;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j4 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileM19139 = m19139(parentFile, i, j4, Long.parseLong(strGroup4));
                if (!file.renameTo(fileM19139)) {
                    fileM19139 = null;
                }
            }
            if (fileM19139 != null) {
                file2 = fileM19139;
                name = fileM19139.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher2 = f22835.matcher(name);
        if (matcher2.matches()) {
            String strGroup5 = matcher2.group(1);
            strGroup5.getClass();
            String strM48098 = c21047.m48098(Integer.parseInt(strGroup5));
            if (strM48098 != null) {
                long length = j == -1 ? file2.length() : j;
                if (length != 0) {
                    String strGroup6 = matcher2.group(2);
                    strGroup6.getClass();
                    long j5 = Long.parseLong(strGroup6);
                    if (j2 == -9223372036854775807L) {
                        String strGroup7 = matcher2.group(3);
                        strGroup7.getClass();
                        j3 = Long.parseLong(strGroup7);
                    } else {
                        j3 = j2;
                    }
                    return new C6876(strM48098, j5, length, j3, file2);
                }
            }
        }
        return null;
    }
}
