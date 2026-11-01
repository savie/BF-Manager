package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L541 */
/* JADX INFO: loaded from: classes3.dex */
public class C4074 extends C8309 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Constructor f14982;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method f14983;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f14984;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Class f14985;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Method f14986;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11606() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f14984) {
            return;
        }
        f14984 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f14982 = constructor;
        f14985 = cls;
        f14983 = method2;
        f14986 = method;
    }

    @Override // l.C8309
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Typeface mo11608(Context context, C6752 c6752, Resources resources, int i) throws NoSuchMethodException {
        m11606();
        try {
            Object objNewInstance = f14982.newInstance(null);
            for (C22981 c22981 : c6752.m18254()) {
                File fileM44692 = C19598.m44692(context);
                if (fileM44692 == null) {
                    return null;
                }
                try {
                    if (!C19598.m44695(fileM44692, resources, c22981.m50829())) {
                        return null;
                    }
                    if (!m11607(objNewInstance, fileM44692.getPath(), c22981.m50827(), c22981.m50830())) {
                        return null;
                    }
                    fileM44692.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM44692.delete();
                }
            }
            m11606();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f14985, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f14986.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11607(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m11606();
        try {
            return ((Boolean) f14983.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.C8309
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Typeface mo11609(Context context, C5300[] c5300Arr, int i) {
        File file;
        if (c5300Arr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo21737(i, c5300Arr).m14696(), "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (ErrnoException unused) {
                        }
                        if (file != null && file.canRead()) {
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            Typeface typefaceMo21736 = mo21736(context, fileInputStream);
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceMo21736;
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
