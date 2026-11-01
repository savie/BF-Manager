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

/* JADX INFO: renamed from: l.ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: E55J */
/* JADX INFO: loaded from: classes3.dex */
public final class C6897 extends C8309 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Constructor f23219;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Method f23220;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Class f23221;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Method f23222;

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
        f23219 = constructor;
        f23221 = cls;
        f23220 = method2;
        f23222 = method;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18511() {
        return f23220 != null;
    }

    @Override // l.C8309
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11608(Context context, C6752 c6752, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f23219.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (C22981 c22981 : c6752.m18254()) {
                int iM50829 = c22981.m50829();
                File fileM44692 = C19598.m44692(context);
                if (fileM44692 == null) {
                    map = null;
                } else {
                    try {
                        if (C19598.m44695(fileM44692, resources, iM50829)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileM44692);
                                try {
                                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C6001.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                                    map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                                    fileInputStream.close();
                                    fileM44692.delete();
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
                            fileM44692.delete();
                            map = null;
                        }
                    } catch (Throwable th3) {
                        fileM44692.delete();
                        throw th3;
                    }
                }
                if (map != null && m18512(objNewInstance, map, c22981.m50828(), c22981.m50827(), c22981.m50830())) {
                }
            }
            return m18510(objNewInstance);
        }
        return null;
    }

    @Override // l.C8309
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11609(Context context, C5300[] c5300Arr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = f23219.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C12274 c12274 = new C12274();
            for (C5300 c5300 : c5300Arr) {
                Uri uriM14696 = c5300.m14696();
                ByteBuffer byteBufferM44693 = (ByteBuffer) c12274.getOrDefault(uriM14696, null);
                if (byteBufferM44693 == null) {
                    byteBufferM44693 = C19598.m44693(context, uriM14696);
                    c12274.put(uriM14696, byteBufferM44693);
                }
                if (byteBufferM44693 != null && m18512(objNewInstance, byteBufferM44693, c5300.m14697(), c5300.m14693(), c5300.m14695())) {
                }
            }
            Typeface typefaceM18510 = m18510(objNewInstance);
            if (typefaceM18510 != null) {
                return Typeface.create(typefaceM18510, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18512(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f23220.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m18510(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f23221, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f23222.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
