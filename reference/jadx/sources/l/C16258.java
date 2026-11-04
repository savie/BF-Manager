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

/* JADX INFO: renamed from: l.ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L541 */
/* JADX INFO: loaded from: classes5.dex */
public class C16258 extends C4326 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method f52837;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Class f52838;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean f52839;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Method f52840;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Constructor f52841;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38591() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f52839) {
            return;
        }
        f52839 = true;
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
        f52841 = constructor;
        f52838 = cls;
        f52837 = method2;
        f52840 = method;
    }

    @Override // l.C4326
    /* JADX INFO: renamed from: ۙ */
    public Typeface mo11637(Context context, C3252 c3252, Resources resources, int i) throws NoSuchMethodException {
        m38591();
        try {
            Object objNewInstance = f52841.newInstance(null);
            for (C20406 c20406 : c3252.m10611()) {
                File fileM35533 = C14766.m35533(context);
                if (fileM35533 == null) {
                    return null;
                }
                try {
                    if (!C14766.m35536(fileM35533, resources, c20406.m46806())) {
                        return null;
                    }
                    if (!m38592(objNewInstance, fileM35533.getPath(), c20406.m46805(), c20406.m46804())) {
                        return null;
                    }
                    fileM35533.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM35533.delete();
                }
            }
            m38591();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f52838, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f52840.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38592(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m38591();
        try {
            return ((Boolean) f52837.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.C4326
    /* JADX INFO: renamed from: ۙ */
    public Typeface mo11638(Context context, C11258[] c11258Arr, int i) {
        File file;
        if (c11258Arr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo13822(i, c11258Arr).m28499(), "r", null);
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
                            Typeface typefaceMo13821 = mo13821(context, fileInputStream);
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceMo13821;
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
