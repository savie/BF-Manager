package l;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAVZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18533 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15275 f58998;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class f58999;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Enum[] f59000;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long[] f59001;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo7044(C14265 c14265, Object obj, Type type, Map map);

    public AbstractC18533(Class cls, C15275 c15275) {
        this.f58999 = cls;
        this.f58998 = c15275;
        if (c15275 == null) {
            return;
        }
        Class cls2 = c15275.f49790;
        if (cls2.isEnum()) {
            Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
            int length = enumArr.length;
            long[] jArr = new long[length];
            this.f59001 = new long[enumArr.length];
            for (int i = 0; i < enumArr.length; i++) {
                String strName = enumArr[i].name();
                long jCharAt = -3750763034362895579L;
                for (int i2 = 0; i2 < strName.length(); i2++) {
                    jCharAt = (jCharAt ^ ((long) strName.charAt(i2))) * 1099511628211L;
                }
                jArr[i] = jCharAt;
                this.f59001[i] = jCharAt;
            }
            Arrays.sort(this.f59001);
            this.f59000 = new Enum[enumArr.length];
            for (int i3 = 0; i3 < this.f59001.length; i3++) {
                for (int i4 = 0; i4 < length; i4++) {
                    if (this.f59001[i3] == jArr[i4]) {
                        this.f59000[i3] = enumArr[i4];
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Enum m42932(long j) {
        int iBinarySearch;
        Enum[] enumArr = this.f59000;
        if (enumArr != null && (iBinarySearch = Arrays.binarySearch(this.f59001, j)) >= 0) {
            return enumArr[iBinarySearch];
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo31963(Object obj, Object obj2) {
        C15275 c15275 = this.f58998;
        if (obj2 == null && c15275.f49790.isPrimitive()) {
            return;
        }
        Field field = c15275.f49783;
        Method method = c15275.f49784;
        try {
            if (c15275.f49794) {
                if (c15275.f49797) {
                    if (Map.class.isAssignableFrom(c15275.f49790)) {
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
            if (c15275.f49797) {
                if (Map.class.isAssignableFrom(c15275.f49790)) {
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
            throw new C20614("set property error, " + c15275.f49788, (Throwable) e);
        }
    }
}
