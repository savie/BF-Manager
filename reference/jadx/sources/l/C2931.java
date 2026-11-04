package l;

/* JADX INFO: renamed from: l.ۖ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B964 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2931 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C7406 f9595 = new C7406("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.ۤۙۨ] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, l.ۡ᩷ۨ, l.۫᩷ۨ] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.᩺֨᩵] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m9578(C10631 c10631, long j, InterfaceC23955 interfaceC23955) {
        while (true) {
            long j2 = c10631.f31168;
            if (j2 >= j && !c10631.mo25155()) {
                return c10631;
            }
            Object objM32958 = AbstractC13372.m32958((AbstractC13372) c10631);
            C7406 c7406 = f9595;
            if (objM32958 == c7406) {
                return c7406;
            }
            AbstractC9642 abstractC9642 = (AbstractC9642) ((AbstractC13372) objM32958);
            if (abstractC9642 != null) {
                c10631 = abstractC9642;
            } else {
                AbstractC9642 abstractC9643 = (AbstractC9642) interfaceC23955.mo3124(Long.valueOf(j2 + 1), c10631);
                if (c10631.m32959(abstractC9643)) {
                    if (c10631.mo25155()) {
                        c10631.m32961();
                    }
                    c10631 = abstractC9643;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final boolean m9582(Object obj) {
        return obj == f9595;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC9642 m9580(Object obj) {
        if (obj != f9595) {
            return (AbstractC9642) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC13372 m9581(AbstractC13372 abstractC13372) {
        while (true) {
            Object objM32958 = AbstractC13372.m32958(abstractC13372);
            if (objM32958 == f9595) {
                break;
            }
            AbstractC13372 abstractC13373 = (AbstractC13372) objM32958;
            if (abstractC13373 != null) {
                abstractC13372 = abstractC13373;
            } else if (abstractC13372.m32962()) {
                break;
            }
        }
        return abstractC13372;
    }
}
