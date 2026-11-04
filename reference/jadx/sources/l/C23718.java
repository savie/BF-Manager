package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E55J */
/* JADX INFO: loaded from: classes.dex */
public final class C23718 extends C4326 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Method f76868;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Class f76869;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Method f76870;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Constructor f76871;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        f76871 = constructor;
        f76869 = cls;
        f76868 = method2;
        f76870 = method;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52969() {
        return f76868 != null;
    }

    @Override // l.C4326
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11637(Context context, C3252 c3252, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f76871.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (C20406 c20406 : c3252.m10611()) {
                int iM46806 = c20406.m46806();
                File fileM35533 = C14766.m35533(context);
                if (fileM35533 == null) {
                    map = null;
                } else {
                    try {
                        if (C14766.m35536(fileM35533, resources, iM46806)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileM35533);
                                try {
                                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C19853.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                                    map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                                    fileInputStream.close();
                                    fileM35533.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileM35533.delete();
                            map = null;
                        }
                    } catch (Throwable th3) {
                        fileM35533.delete();
                        throw th3;
                    }
                }
                if (map != null && m52970(objNewInstance, map, c20406.m46803(), c20406.m46805(), c20406.m46804())) {
                }
            }
            return m52968(objNewInstance);
        }
        return null;
    }

    @Override // l.C4326
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11638(Context context, C11258[] c11258Arr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = f76871.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C9086 c9086 = new C9086();
            for (C11258 c11258 : c11258Arr) {
                Uri uriM28499 = c11258.m28499();
                ByteBuffer byteBufferM35534 = (ByteBuffer) c9086.get(uriM28499);
                if (byteBufferM35534 == null) {
                    byteBufferM35534 = C14766.m35534(context, uriM28499);
                    c9086.put(uriM28499, byteBufferM35534);
                }
                if (byteBufferM35534 != null && m52970(objNewInstance, byteBufferM35534, c11258.m28501(), c11258.m28502(), c11258.m28500())) {
                }
            }
            Typeface typefaceM52968 = m52968(objNewInstance);
            if (typefaceM52968 != null) {
                return Typeface.create(typefaceM52968, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52970(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f76868.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m52968(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f76869, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f76870.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
