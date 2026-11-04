package l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.widget.EditText;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AM9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1826 {

    /* JADX INFO: renamed from: ۚ᩻᩵, reason: not valid java name and contains not printable characters */
    public static int f6190;

    /* JADX INFO: renamed from: ֨֨۟, reason: not valid java name and contains not printable characters */
    public static int m6301() {
        return -1113864760;
    }

    /* JADX INFO: renamed from: ֫᩶֨, reason: not valid java name and contains not printable characters */
    public static Looper m6302() {
        return Looper.myLooper();
    }

    /* JADX INFO: renamed from: ۖܿ֡, reason: not valid java name and contains not printable characters */
    public static boolean m6303(Object obj) {
        return ((AbstractC22044) obj).mo2934();
    }

    /* JADX INFO: renamed from: ۟۫ᩴ, reason: not valid java name and contains not printable characters */
    public static int m6305(Object obj) {
        return ((SpannableStringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ۟᩺֫, reason: not valid java name and contains not printable characters */
    public static C13778 m6306(Object obj) {
        return ((C2592) obj).m8688();
    }

    /* JADX INFO: renamed from: ۡۜᩳ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m6307(Object obj, Object obj2, Object obj3) {
        return ObjectAnimator.ofFloat(obj, (String) obj2, (float[]) obj3);
    }

    /* JADX INFO: renamed from: ۨ᩷֨, reason: not valid java name and contains not printable characters */
    public static Context m6308(Object obj) {
        return ((View) obj).getContext();
    }

    /* JADX INFO: renamed from: ۫۫᩷, reason: not valid java name and contains not printable characters */
    public static Editable m6309(Object obj) {
        return ((EditText) obj).getText();
    }

    /* JADX INFO: renamed from: ۬ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m6310(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܺۜܿ, reason: not valid java name and contains not printable characters */
    public static String m6311(Object obj) {
        return ((AbstractC22044) obj).getName();
    }

    /* JADX INFO: renamed from: ᩴۙ᩻, reason: not valid java name and contains not printable characters */
    public static void m6312(Object obj) {
        ((ReentrantLock) obj).unlock();
    }

    /* JADX INFO: renamed from: ᩴۛۜ, reason: not valid java name and contains not printable characters */
    public static boolean m6313(Object obj, Object obj2) {
        return ((C8614) obj).m23228((String) obj2);
    }

    /* JADX INFO: renamed from: ᩴۤۜ, reason: not valid java name and contains not printable characters */
    public static boolean m6314(Object obj) {
        return C18282.m42583((String) obj);
    }

    /* JADX INFO: renamed from: ᩵֫۠, reason: not valid java name and contains not printable characters */
    public static void m6315(Object obj, Object obj2) {
        ((C25227) obj).setAdapter((AbstractC12964) obj2);
    }

    /* JADX INFO: renamed from: ᩷۠ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m6316(Object obj, Object obj2) {
        return C17359.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: ᩷ۤ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m6317(Object obj) {
        return ((Iterator) obj).hasNext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Bundle m6304(C21914... c21914Arr) {
        Bundle bundle = new Bundle(c21914Arr.length);
        for (C21914 c21914 : c21914Arr) {
            String str = (String) c21914.m49600();
            Object objM49602 = c21914.m49602();
            if (objM49602 == null) {
                bundle.putString(str, null);
            } else if (objM49602 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objM49602).booleanValue());
            } else if (objM49602 instanceof Byte) {
                bundle.putByte(str, ((Number) objM49602).byteValue());
            } else if (objM49602 instanceof Character) {
                bundle.putChar(str, ((Character) objM49602).charValue());
            } else if (objM49602 instanceof Double) {
                bundle.putDouble(str, ((Number) objM49602).doubleValue());
            } else if (objM49602 instanceof Float) {
                bundle.putFloat(str, ((Number) objM49602).floatValue());
            } else if (objM49602 instanceof Integer) {
                bundle.putInt(str, ((Number) objM49602).intValue());
            } else if (objM49602 instanceof Long) {
                bundle.putLong(str, ((Number) objM49602).longValue());
            } else if (objM49602 instanceof Short) {
                bundle.putShort(str, ((Number) objM49602).shortValue());
            } else if (objM49602 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objM49602);
            } else if (objM49602 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objM49602);
            } else if (objM49602 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objM49602);
            } else if (objM49602 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objM49602);
            } else if (objM49602 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objM49602);
            } else if (objM49602 instanceof char[]) {
                bundle.putCharArray(str, (char[]) objM49602);
            } else if (objM49602 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objM49602);
            } else if (objM49602 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objM49602);
            } else if (objM49602 instanceof int[]) {
                bundle.putIntArray(str, (int[]) objM49602);
            } else if (objM49602 instanceof long[]) {
                bundle.putLongArray(str, (long[]) objM49602);
            } else if (objM49602 instanceof short[]) {
                bundle.putShortArray(str, (short[]) objM49602);
            } else if (objM49602 instanceof Object[]) {
                Class<?> componentType = objM49602.getClass().getComponentType();
                C15243.m36586(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) objM49602);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) objM49602);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) objM49602);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) objM49602);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (objM49602 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objM49602);
            } else if (objM49602 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objM49602);
            } else if (objM49602 instanceof Size) {
                C5555.m16471(bundle, str, (Size) objM49602);
            } else if (objM49602 instanceof SizeF) {
                C5555.m16472(bundle, str, (SizeF) objM49602);
            } else {
                throw new IllegalArgumentException("Illegal value type " + objM49602.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }
}
