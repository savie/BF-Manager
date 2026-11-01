package l;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩸ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 675F */
/* JADX INFO: loaded from: classes5.dex */
public final class C21676 extends C2065 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f70304 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f70305 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f70306 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static File m48409(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, C15037.m36023(sb, j2, ".v3.exo"));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21676 m48410(File file, long j, long j2, C5448 c5448) {
        File file2;
        long j3;
        String strGroup;
        File fileM48409;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = f70305.matcher(name2);
            if (matcher.matches()) {
                String strGroup2 = matcher.group(1);
                strGroup2.getClass();
                strGroup = C17983.m41865(strGroup2);
            } else {
                matcher = f70304.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileM48409 = null;
            } else {
                File parentFile = file.getParentFile();
                C2023.m6508(parentFile);
                int i = c5448.m15108(strGroup).f16689;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j4 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileM48409 = m48409(parentFile, i, j4, Long.parseLong(strGroup4));
                if (!file.renameTo(fileM48409)) {
                    fileM48409 = null;
                }
            }
            if (fileM48409 != null) {
                file2 = fileM48409;
                name = fileM48409.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher2 = f70306.matcher(name);
        if (matcher2.matches()) {
            String strGroup5 = matcher2.group(1);
            strGroup5.getClass();
            String strM15101 = c5448.m15101(Integer.parseInt(strGroup5));
            if (strM15101 != null) {
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
                    return new C21676(strM15101, j5, length, j3, file2);
                }
            }
        }
        return null;
    }
}
