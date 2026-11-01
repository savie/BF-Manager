package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6QN */
/* JADX INFO: loaded from: classes4.dex */
public final class C18271 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m42457(Object obj) {
        long length;
        if (obj instanceof C7605) {
            length = ((C7605) obj).f25156;
        } else {
            if (obj instanceof C13625) {
                return ((C13625) obj).m33308() + 48;
            }
            if (!(obj instanceof C1337)) {
                if (obj instanceof C16155) {
                    return 112L;
                }
                if (obj instanceof C14744) {
                    return 88L;
                }
                throw new IllegalArgumentException("Unsupported text budget object");
            }
            length = ((long) ((C1337) obj).f5650.length) * 8;
        }
        return length + 112;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42458(Object obj, Consumer consumer) {
        if (obj instanceof C14744) {
            consumer.accept(((C14744) obj).f48222);
            return;
        }
        if (obj instanceof C1337) {
            for (AbstractC0631 abstractC0631 : ((C1337) obj).f5650) {
                consumer.accept(abstractC0631);
            }
            return;
        }
        if (obj instanceof C16155) {
            consumer.accept(((C16155) obj).m38241());
        }
    }
}
