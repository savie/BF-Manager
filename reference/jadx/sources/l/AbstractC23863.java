package l;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAVZ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23863 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class f77255;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Enum[] f77256;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long[] f77257;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16558 f77258;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4587(C2759 c2759, Object obj, Type type, Map map);

    public AbstractC23863(Class cls, C16558 c16558) {
        this.f77255 = cls;
        this.f77258 = c16558;
        if (c16558 == null) {
            return;
        }
        Class cls2 = c16558.f53586;
        if (cls2.isEnum()) {
            Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
            int length = enumArr.length;
            long[] jArr = new long[length];
            this.f77257 = new long[enumArr.length];
            for (int i = 0; i < enumArr.length; i++) {
                String strName = enumArr[i].name();
                long jCharAt = -3750763034362895579L;
                for (int i2 = 0; i2 < strName.length(); i2++) {
                    jCharAt = (jCharAt ^ ((long) strName.charAt(i2))) * 1099511628211L;
                }
                jArr[i] = jCharAt;
                this.f77257[i] = jCharAt;
            }
            Arrays.sort(this.f77257);
            this.f77256 = new Enum[enumArr.length];
            for (int i3 = 0; i3 < this.f77257.length; i3++) {
                for (int i4 = 0; i4 < length; i4++) {
                    if (this.f77257[i3] == jArr[i4]) {
                        this.f77256[i3] = enumArr[i4];
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Enum m53211(long j) {
        int iBinarySearch;
        Enum[] enumArr = this.f77256;
        if (enumArr != null && (iBinarySearch = Arrays.binarySearch(this.f77257, j)) >= 0) {
            return enumArr[iBinarySearch];
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo17349(Object obj, Object obj2) {
        C16558 c16558 = this.f77258;
        if (obj2 == null && c16558.f53586.isPrimitive()) {
            return;
        }
        Field field = c16558.f53592;
        Method method = c16558.f53587;
        try {
            if (c16558.f53581) {
                if (c16558.f53588) {
                    if (Map.class.isAssignableFrom(c16558.f53586)) {
                        Map map = (Map) field.get(obj);
                        if (map != null) {
                            map.putAll((Map) obj2);
                            return;
                        }
                        return;
                    }
                    Collection collection = (Collection) field.get(obj);
                    if (collection != null) {
                        collection.addAll((Collection) obj2);
                        return;
                    }
                    return;
                }
                field.set(obj, obj2);
                return;
            }
            if (c16558.f53588) {
                if (Map.class.isAssignableFrom(c16558.f53586)) {
                    Map map2 = (Map) method.invoke(obj, null);
                    if (map2 != null) {
                        map2.putAll((Map) obj2);
                        return;
                    }
                    return;
                }
                Collection collection2 = (Collection) method.invoke(obj, null);
                if (collection2 != null) {
                    collection2.addAll((Collection) obj2);
                    return;
                }
                return;
            }
            method.invoke(obj, obj2);
        } catch (Exception e) {
            throw new C4251("set property error, " + c16558.f53585, (Throwable) e);
        }
    }
}
