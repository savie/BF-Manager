package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public enum ClassLoaderHelper {
    ;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static URL m747(String str, Class... clsArr) {
        return m746(str, false, clsArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static URL m746(String str, boolean z, Class... clsArr) {
        URL urlM745;
        if (z) {
            urlM745 = m749(str, clsArr);
            if (urlM745 == null) {
                urlM745 = m745(str);
            }
        } else {
            urlM745 = m745(str);
            if (urlM745 == null) {
                urlM745 = m749(str, clsArr);
            }
        }
        return urlM745 == null ? ClassLoaderHelper.class.getResource(str) : urlM745;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static URL m749(String str, Class[] clsArr) {
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
    public static URL m745(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        return contextClassLoader.getResource(str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Class m750(String str, Class[] clsArr) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Class m753(String str) {
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Class m754(String str, Class... clsArr) {
        return m748(str, true, clsArr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Class m748(String str, boolean z, Class... clsArr) {
        Class clsM753;
        if (z) {
            clsM753 = m750(str, clsArr);
            if (clsM753 == null) {
                clsM753 = m753(str);
            }
        } else {
            clsM753 = m753(str);
            if (clsM753 == null) {
                clsM753 = m750(str, clsArr);
            }
        }
        return clsM753 == null ? Class.forName(str) : clsM753;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InputStream m752(String str, Class... clsArr) {
        return m751(str, false, clsArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InputStream m751(String str, boolean z, Class... clsArr) {
        URL urlM746 = m746(str, z, clsArr);
        if (urlM746 != null) {
            try {
                return urlM746.openStream();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
