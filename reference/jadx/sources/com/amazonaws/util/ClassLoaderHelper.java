package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public enum ClassLoaderHelper {
    ;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static URL m754(String str, Class... clsArr) {
        return m753(str, false, clsArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static URL m753(String str, boolean z, Class... clsArr) {
        URL urlM752;
        if (z) {
            urlM752 = m757(str, clsArr);
            if (urlM752 == null) {
                urlM752 = m752(str);
            }
        } else {
            urlM752 = m752(str);
            if (urlM752 == null) {
                urlM752 = m757(str, clsArr);
            }
        }
        return urlM752 == null ? ClassLoaderHelper.class.getResource(str) : urlM752;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static URL m757(String str, Class[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        for (Class cls : clsArr) {
            URL resource = cls.getResource(str);
            if (resource != null) {
                return resource;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static URL m752(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        return contextClassLoader.getResource(str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Class m755(String str, Class[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        for (Class cls : clsArr) {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                try {
                    return classLoader.loadClass(str);
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Class m760(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        try {
            return contextClassLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Class m751(String str, Class... clsArr) {
        return m756(str, true, clsArr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Class m756(String str, boolean z, Class... clsArr) {
        Class clsM760;
        if (z) {
            clsM760 = m755(str, clsArr);
            if (clsM760 == null) {
                clsM760 = m760(str);
            }
        } else {
            clsM760 = m760(str);
            if (clsM760 == null) {
                clsM760 = m755(str, clsArr);
            }
        }
        return clsM760 == null ? Class.forName(str) : clsM760;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InputStream m759(String str, Class... clsArr) {
        return m758(str, false, clsArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InputStream m758(String str, boolean z, Class... clsArr) {
        URL urlM753 = m753(str, z, clsArr);
        if (urlM753 != null) {
            try {
                return urlM753.openStream();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
