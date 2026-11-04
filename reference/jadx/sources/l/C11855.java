package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۧ᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11855 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method f38193;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f38194;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static Object f38195;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Constructor f38196;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Class f38197;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Field f38198;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f38199;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m29708() {
        if (f38199) {
            return true;
        }
        if (f38194) {
            return false;
        }
        try {
            Method declaredMethod = Class.forName("miui.content.res.IconCustomizer").getDeclaredMethod("clearCache", String.class);
            declaredMethod.setAccessible(true);
            f38193 = declaredMethod;
        } catch (Exception unused) {
        }
        try {
            Class<?> cls = Class.forName("android.app.ApplicationPackageManager");
            for (Class<?> cls2 : cls.getDeclaredClasses()) {
                if (cls2.getSimpleName().equals("ResourceName")) {
                    f38197 = cls2;
                    break;
                }
            }
            Class cls3 = f38197;
            if (cls3 == null) {
                throw new NoSuchFieldException("ResourceName class not found");
            }
            Constructor declaredConstructor = cls3.getDeclaredConstructor(String.class, Integer.TYPE);
            f38196 = declaredConstructor;
            declaredConstructor.setAccessible(true);
            Field declaredField = cls.getDeclaredField("sSync");
            declaredField.setAccessible(true);
            f38195 = declaredField.get(null);
            Field declaredField2 = cls.getDeclaredField("sIconCache");
            f38198 = declaredField2;
            declaredField2.setAccessible(true);
            f38199 = true;
            return true;
        } catch (Exception unused2) {
            f38194 = true;
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29706(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m29704(List list, Object obj, int i) {
        int iCompare;
        if (i >= list.size()) {
            i = list.size() - 1;
        }
        Object obj2 = list.get(i);
        Comparator comparator = C8609.f28109;
        int iCompare2 = comparator.compare(obj2, obj);
        if (iCompare2 == 0) {
            return i;
        }
        if (iCompare2 < 0) {
            do {
                i++;
                if (i < list.size()) {
                    iCompare = comparator.compare(list.get(i), obj);
                    if (iCompare == 0) {
                        return i;
                    }
                } else {
                    return -(list.size() + 1);
                }
            } while (iCompare <= 0);
            return -(i + 1);
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int iCompare3 = comparator.compare(list.get(i2), obj);
            if (iCompare3 == 0) {
                return i2;
            }
            if (iCompare3 < 0) {
                return -(i2 + 2);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29707(int i, String str) {
        if (str == null || str.isEmpty() || !m29708()) {
            return;
        }
        Method method = f38193;
        if (method != null) {
            try {
                method.invoke(null, str);
            } catch (Exception unused) {
            }
        }
        try {
            Object objNewInstance = f38196.newInstance(str, Integer.valueOf(i));
            synchronized (f38195) {
                try {
                    Map map = (Map) f38198.get(null);
                    if (map != null) {
                        map.remove(objNewInstance);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29705(int i) {
        switch (i) {
            case 1:
                return "nop";
            case 2:
                return "move";
            case 3:
                return "move-param";
            case 4:
                return "move-exception";
            case 5:
                return "const";
            case 6:
                return "goto";
            case 7:
                return "if-eq";
            case 8:
                return "if-ne";
            case 9:
                return "if-lt";
            case 10:
                return "if-ge";
            case 11:
                return "if-le";
            case 12:
                return "if-gt";
            case 13:
                return "switch";
            case 14:
                return "add";
            case 15:
                return "sub";
            case 16:
                return "mul";
            case 17:
                return "div";
            case 18:
                return "rem";
            case 19:
                return "neg";
            case 20:
                return "and";
            case 21:
                return "or";
            case 22:
                return "xor";
            case 23:
                return "shl";
            case 24:
                return "shr";
            case 25:
                return "ushr";
            case 26:
                return "not";
            case 27:
                return "cmpl";
            case 28:
                return "cmpg";
            case 29:
                return "conv";
            case 30:
                return "to-byte";
            case 31:
                return "to-char";
            case 32:
                return "to-short";
            case 33:
                return "return";
            case 34:
                return "array-length";
            case 35:
                return "throw";
            case 36:
                return "monitor-enter";
            case 37:
                return "monitor-exit";
            case 38:
                return "aget";
            case 39:
                return "aput";
            case 40:
                return "new-instance";
            case 41:
                return "new-array";
            case 42:
                return "filled-new-array";
            case 43:
                return "check-cast";
            case 44:
                return "instance-of";
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                return "get-field";
            case 46:
                return "get-static";
            case 47:
                return "put-field";
            case 48:
                return "put-static";
            case 49:
                return "invoke-static";
            case 50:
                return "invoke-virtual";
            case 51:
                return "invoke-super";
            case 52:
                return "invoke-direct";
            case 53:
                return "invoke-interface";
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
            default:
                return "unknown-".concat(C5306.m15936(i));
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                return "move-result";
            case 56:
                return "move-result-pseudo";
            case 57:
                return "fill-array-data";
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                return "invoke-polymorphic";
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return "invoke-custom";
        }
    }
}
