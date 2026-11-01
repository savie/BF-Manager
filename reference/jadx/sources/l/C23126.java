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

/* JADX INFO: renamed from: l.᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14P2 */
/* JADX INFO: loaded from: classes.dex */
public class C23126 extends C4074 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Method f75103;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Method f75104;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Class f75105;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Method f75106;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Method f75107;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Method f75108;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Constructor f75109;

    public C23126() throws NoSuchMethodException {
        Method methodMo36804;
        Constructor<?> constructor;
        Method methodM51128;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM51128 = m51128((Class) cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo36804 = mo36804((Class) cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodMo36804 = null;
            constructor = null;
            methodM51128 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f75105 = cls;
        this.f75109 = constructor;
        this.f75103 = methodM51128;
        this.f75106 = method;
        this.f75107 = method2;
        this.f75108 = method3;
        this.f75104 = methodMo36804;
    }

    @Override // l.C8309
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo21735(Context context, Resources resources, int i, String str, int i2) {
        Object objNewInstance;
        if (this.f75103 != null) {
            try {
                objNewInstance = this.f75109.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!m51127(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f75108.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (m51129(objNewInstance)) {
                    return mo36803(objNewInstance);
                }
            }
            return null;
        }
        return super.mo21735(context, resources, i, str, i2);
    }

    @Override // l.C4074, l.C8309
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11608(Context context, C6752 c6752, Resources resources, int i) {
        Object objNewInstance;
        if (this.f75103 != null) {
            try {
                objNewInstance = this.f75109.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                for (C22981 c22981 : c6752.m18254()) {
                    if (!m51127(context, objNewInstance, c22981.m50826(), c22981.m50828(), c22981.m50827(), c22981.m50830() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c22981.m50825()))) {
                        try {
                            this.f75108.invoke(objNewInstance, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
                if (m51129(objNewInstance)) {
                    return mo36803(objNewInstance);
                }
            }
            return null;
        }
        return super.mo11608(context, c6752, resources, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m51127(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f75103.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public Typeface mo36803(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f75105, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f75104.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m51129(Object obj) {
        try {
            return ((Boolean) this.f75107.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.C4074, l.C8309
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11609(Context context, C5300[] c5300Arr, int i) {
        Object objNewInstance;
        Typeface typefaceMo36803;
        boolean zBooleanValue;
        Object[] objArr = null;
        if (c5300Arr.length >= 1) {
            if (this.f75103 != null) {
                HashMap map = new HashMap();
                for (C5300 c5300 : c5300Arr) {
                    if (c5300.m14694() == 0) {
                        Uri uriM14696 = c5300.m14696();
                        if (!map.containsKey(uriM14696)) {
                            map.put(uriM14696, C19598.m44693(context, uriM14696));
                        }
                    }
                }
                Map mapUnmodifiableMap = C0561.unmodifiableMap(map);
                try {
                    objNewInstance = this.f75109.newInstance(null);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                    objNewInstance = null;
                }
                if (objNewInstance != null) {
                    int length = c5300Arr.length;
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        Method method = this.f75108;
                        if (i2 < length) {
                            C5300 c5301 = c5300Arr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c5301.m14696());
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f75106.invoke(objNewInstance, byteBuffer, Integer.valueOf(c5301.m14697()), null, Integer.valueOf(c5301.m14693()), Integer.valueOf(c5301.m14695() ? 1 : 0))).booleanValue();
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
                        } else if (m51129(objNewInstance) && (typefaceMo36803 = mo36803(objNewInstance)) != null) {
                            return Typeface.create(typefaceMo36803, i);
                        }
                    }
                }
            } else {
                C5300 c5300Mo21737 = mo21737(i, c5300Arr);
                try {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c5300Mo21737.m14696(), "r", null);
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            try {
                                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c5300Mo21737.m14693()).setItalic(c5300Mo21737.m14695()).build();
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Method m51128(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: ۙ */
    public Method mo36804(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
