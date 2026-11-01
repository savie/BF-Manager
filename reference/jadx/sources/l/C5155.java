package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۚۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AM9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5155 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Bundle m14302(C15083... c15083Arr) {
        Bundle bundle = new Bundle(c15083Arr.length);
        for (C15083 c15083 : c15083Arr) {
            String str = (String) c15083.m36157();
            Object objM36159 = c15083.m36159();
            if (objM36159 == null) {
                bundle.putString(str, null);
            } else if (objM36159 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objM36159).booleanValue());
            } else if (objM36159 instanceof Byte) {
                bundle.putByte(str, ((Number) objM36159).byteValue());
            } else if (objM36159 instanceof Character) {
                bundle.putChar(str, ((Character) objM36159).charValue());
            } else if (objM36159 instanceof Double) {
                bundle.putDouble(str, ((Number) objM36159).doubleValue());
            } else if (objM36159 instanceof Float) {
                bundle.putFloat(str, ((Number) objM36159).floatValue());
            } else if (objM36159 instanceof Integer) {
                bundle.putInt(str, ((Number) objM36159).intValue());
            } else if (objM36159 instanceof Long) {
                bundle.putLong(str, ((Number) objM36159).longValue());
            } else if (objM36159 instanceof Short) {
                bundle.putShort(str, ((Number) objM36159).shortValue());
            } else if (objM36159 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objM36159);
            } else if (objM36159 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objM36159);
            } else if (objM36159 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objM36159);
            } else if (objM36159 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objM36159);
            } else if (objM36159 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objM36159);
            } else if (objM36159 instanceof char[]) {
                bundle.putCharArray(str, (char[]) objM36159);
            } else if (objM36159 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objM36159);
            } else if (objM36159 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objM36159);
            } else if (objM36159 instanceof int[]) {
                bundle.putIntArray(str, (int[]) objM36159);
            } else if (objM36159 instanceof long[]) {
                bundle.putLongArray(str, (long[]) objM36159);
            } else if (objM36159 instanceof short[]) {
                bundle.putShortArray(str, (short[]) objM36159);
            } else if (objM36159 instanceof Object[]) {
                Class<?> componentType = objM36159.getClass().getComponentType();
                C13465.m32962(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) objM36159);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) objM36159);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) objM36159);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) objM36159);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (objM36159 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objM36159);
            } else if (objM36159 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objM36159);
            } else if (objM36159 instanceof Size) {
                C2332.m7073(bundle, str, (Size) objM36159);
            } else if (objM36159 instanceof SizeF) {
                C2332.m7074(bundle, str, (SizeF) objM36159);
            } else {
                throw new IllegalArgumentException("Illegal value type " + objM36159.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }
}
