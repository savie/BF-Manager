package l;

import android.media.MediaDrmResetException;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: l.ܽ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: NJN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16523 implements InterfaceC7359 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38890(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38891(String str, String str2) {
        C0303.m1848(str + str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m38892(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m38893(InterfaceC5939 interfaceC5939, Object obj, BiFunction biFunction) {
        C13638.requireNonNull(biFunction);
        Object obj2 = interfaceC5939.get(obj);
        if (obj2 == null && !interfaceC5939.containsKey(obj)) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply == null) {
            interfaceC5939.remove(obj);
            return null;
        }
        interfaceC5939.put(obj, objApply);
        return objApply;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m38889(InterfaceC5939 interfaceC5939, Object obj, BiFunction biFunction) {
        C13638.requireNonNull(biFunction);
        Object obj2 = interfaceC5939.get(obj);
        boolean z = obj2 != null || interfaceC5939.containsKey(obj);
        if (!z) {
            obj2 = null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply != null) {
            interfaceC5939.put(obj, objApply);
            return objApply;
        }
        if (z) {
            interfaceC5939.remove(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m38888(InterfaceC5939 interfaceC5939, Object obj, Object obj2, BiFunction biFunction) {
        C13638.requireNonNull(biFunction);
        C13638.requireNonNull(obj2);
        Object obj3 = interfaceC5939.get(obj);
        if ((obj3 != null || interfaceC5939.containsKey(obj)) && (obj2 = biFunction.apply(obj3, obj2)) == null) {
            interfaceC5939.remove(obj);
            return null;
        }
        interfaceC5939.put(obj, obj2);
        return obj2;
    }
}
