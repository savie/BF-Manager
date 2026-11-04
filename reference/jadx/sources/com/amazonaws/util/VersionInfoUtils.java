package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import l.C0703;

/* JADX INFO: loaded from: classes.dex */
public class VersionInfoUtils {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f839 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static volatile String f840;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Log f841 = LogFactory.m296(VersionInfoUtils.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m792() {
        if (f840 == null) {
            synchronized (VersionInfoUtils.class) {
                if (f840 == null) {
                    m793();
                }
            }
        }
        return f840;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m793() {
        StringBuilder sbM3018 = C0703.m3018(128, "aws-sdk-");
        sbM3018.append(StringUtils.m783("android"));
        sbM3018.append("/2.81.1 ");
        String property = System.getProperty("os.name");
        if (property != null) {
            property = property.replace(' ', '_');
        }
        sbM3018.append(property);
        sbM3018.append("/");
        String property2 = System.getProperty("os.version");
        if (property2 != null) {
            property2 = property2.replace(' ', '_');
        }
        sbM3018.append(property2);
        sbM3018.append(" ");
        String property3 = System.getProperty("java.vm.name");
        if (property3 != null) {
            property3 = property3.replace(' ', '_');
        }
        sbM3018.append(property3);
        sbM3018.append("/");
        String property4 = System.getProperty("java.vm.version");
        if (property4 != null) {
            property4 = property4.replace(' ', '_');
        }
        sbM3018.append(property4);
        sbM3018.append("/");
        String property5 = System.getProperty("java.version");
        if (property5 != null) {
            property5 = property5.replace(' ', '_');
        }
        sbM3018.append(property5);
        String property6 = System.getProperty("user.language");
        String property7 = System.getProperty("user.region");
        if (property6 != null && property7 != null) {
            sbM3018.append(" ");
            sbM3018.append(property6.replace(' ', '_'));
            sbM3018.append("_");
            sbM3018.append(property7.replace(' ', '_'));
        }
        f840 = sbM3018.toString();
    }
}
