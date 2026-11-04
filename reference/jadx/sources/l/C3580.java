package l;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14P2 */
/* JADX INFO: loaded from: classes3.dex */
public class C3580 extends C16258 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method f12262;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Method f12263;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Class f12264;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Method f12265;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f12266;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Method f12267;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Constructor f12268;

    public C3580() throws NoSuchMethodException {
        Method methodMo11640;
        Constructor<?> constructor;
        Method methodM11634;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM11634 = m11634((Class) cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo11640 = mo11640((Class) cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodMo11640 = null;
            constructor = null;
            methodM11634 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f12264 = cls;
        this.f12268 = constructor;
        this.f12265 = methodM11634;
        this.f12263 = method;
        this.f12267 = method2;
        this.f12266 = method3;
        this.f12262 = methodMo11640;
    }

    @Override // l.C4326
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Typeface mo11636(Context context, Resources resources, int i, String str, int i2) {
        Object objNewInstance;
        if (this.f12265 != null) {
            try {
                objNewInstance = this.f12268.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!m11633(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f12266.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (m11635(objNewInstance)) {
                    return mo11639(objNewInstance);
                }
            }
            return null;
        }
        return super.mo11636(context, resources, i, str, i2);
    }

    @Override // l.C16258, l.C4326
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Typeface mo11637(Context context, C3252 c3252, Resources resources, int i) {
        Object objNewInstance;
        if (this.f12265 != null) {
            try {
                objNewInstance = this.f12268.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                for (C20406 c20406 : c3252.m10611()) {
                    if (!m11633(context, objNewInstance, c20406.m46802(), c20406.m46803(), c20406.m46805(), c20406.m46804() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c20406.m46807()))) {
                        try {
                            this.f12266.invoke(objNewInstance, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
                if (m11635(objNewInstance)) {
                    return mo11639(objNewInstance);
                }
            }
            return null;
        }
        return super.mo11637(context, c3252, resources, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m11633(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f12265.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Typeface mo11639(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f12264, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f12262.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m11635(Object obj) {
        try {
            return ((Boolean) this.f12267.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.C16258, l.C4326
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Typeface mo11638(Context context, C11258[] c11258Arr, int i) {
        Object objNewInstance;
        Typeface typefaceMo11639;
        boolean zBooleanValue;
        Object[] objArr = null;
        if (c11258Arr.length >= 1) {
            if (this.f12265 != null) {
                HashMap map = new HashMap();
                for (C11258 c11258 : c11258Arr) {
                    if (c11258.m28498() == 0) {
                        Uri uriM28499 = c11258.m28499();
                        if (!map.containsKey(uriM28499)) {
                            map.put(uriM28499, C14766.m35534(context, uriM28499));
                        }
                    }
                }
                Map mapUnmodifiableMap = C4681.unmodifiableMap(map);
                try {
                    objNewInstance = this.f12268.newInstance(null);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                    objNewInstance = null;
                }
                if (objNewInstance != null) {
                    int length = c11258Arr.length;
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        Method method = this.f12266;
                        if (i2 < length) {
                            C11258 c11259 = c11258Arr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c11259.m28499());
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f12263.invoke(objNewInstance, byteBuffer, Integer.valueOf(c11259.m28501()), null, Integer.valueOf(c11259.m28502()), Integer.valueOf(c11259.m28500() ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    objArr = null;
                                    method.invoke(objNewInstance, null);
                                    break;
                                }
                                objArr = null;
                                z = true;
                            }
                            try {
                                i2++;
                            } catch (IllegalAccessException | InvocationTargetException unused3) {
                            }
                        } else if (!z) {
                            method.invoke(objNewInstance, objArr);
                        } else if (m11635(objNewInstance) && (typefaceMo11639 = mo11639(objNewInstance)) != null) {
                            return Typeface.create(typefaceMo11639, i);
                        }
                    }
                }
            } else {
                C11258 c11258Mo13822 = mo13822(i, c11258Arr);
                try {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c11258Mo13822.m28499(), "r", null);
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            try {
                                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c11258Mo13822.m28502()).setItalic(c11258Mo13822.m28500()).build();
                                parcelFileDescriptorOpenFileDescriptor.close();
                                return typefaceBuild;
                            } catch (Throwable th) {
                                try {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return null;
                        }
                    } catch (IOException unused4) {
                    }
                    return null;
                } catch (IOException unused5) {
                }
            }
            return null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Method m11634(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Method mo11640(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
