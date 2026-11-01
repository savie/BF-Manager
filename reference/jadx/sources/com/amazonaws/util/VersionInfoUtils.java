package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import l.C17214;

/* JADX INFO: loaded from: classes.dex */
public class VersionInfoUtils {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f849 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static volatile String f850;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Log f851 = LogFactory.m302(VersionInfoUtils.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m798() {
        if (f850 == null) {
            synchronized (VersionInfoUtils.class) {
                if (f850 == null) {
                    m799();
                }
            }
        }
        return f850;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m799() {
        StringBuilder sbM40152 = C17214.m40152(128, "aws-sdk-");
        sbM40152.append(StringUtils.m789("android"));
        sbM40152.append("/2.81.1 ");
        String property = System.getProperty("os.name");
        if (property != null) {
            property = property.replace(' ', '_');
        }
        sbM40152.append(property);
        sbM40152.append("/");
        String property2 = System.getProperty("os.version");
        if (property2 != null) {
            property2 = property2.replace(' ', '_');
        }
        sbM40152.append(property2);
        sbM40152.append(" ");
        String property3 = System.getProperty("java.vm.name");
        if (property3 != null) {
            property3 = property3.replace(' ', '_');
        }
        sbM40152.append(property3);
        sbM40152.append("/");
        String property4 = System.getProperty("java.vm.version");
        if (property4 != null) {
            property4 = property4.replace(' ', '_');
        }
        sbM40152.append(property4);
        sbM40152.append("/");
        String property5 = System.getProperty("java.version");
        if (property5 != null) {
            property5 = property5.replace(' ', '_');
        }
        sbM40152.append(property5);
        String property6 = System.getProperty("user.language");
        String property7 = System.getProperty("user.region");
        if (property6 != null && property7 != null) {
            sbM40152.append(" ");
            sbM40152.append(property6.replace(' ', '_'));
            sbM40152.append("_");
            sbM40152.append(property7.replace(' ', '_'));
        }
        f850 = sbM40152.toString();
    }
}
