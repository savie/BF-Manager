package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K6QN */
/* JADX INFO: loaded from: classes.dex */
public final class C24460 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m54714(Object obj) {
        long length;
        if (obj instanceof C7810) {
            length = ((C7810) obj).f26018;
        } else {
            if (obj instanceof C5311) {
                return ((C5311) obj).m15952() + 48;
            }
            if (!(obj instanceof C17746)) {
                if (obj instanceof C19238) {
                    return 112L;
                }
                if (obj instanceof C21697) {
                    return 88L;
                }
                throw new IllegalArgumentException("Unsupported text budget object");
            }
            length = ((long) ((C17746) obj).f58291.length) * 8;
        }
        return length + 112;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54715(Object obj, Consumer consumer) {
        if (obj instanceof C21697) {
            consumer.accept(((C21697) obj).f69245);
            return;
        }
        if (obj instanceof C17746) {
            for (AbstractC1339 abstractC1339 : ((C17746) obj).f58291) {
                consumer.accept(abstractC1339);
            }
            return;
        }
        if (obj instanceof C19238) {
            consumer.accept(((C19238) obj).m44576());
        }
    }
}
