package l;

/* JADX INFO: renamed from: l.ۡ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: SLZ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9718 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Float m25304(AbstractC18144 abstractC18144, Integer num, Float f) {
        int iIntValue = num.intValue();
        boolean zMo9815 = abstractC18144.mo9815(iIntValue);
        float fMo9814 = abstractC18144.mo9814(f.floatValue(), iIntValue);
        if (zMo9815) {
            return Float.valueOf(fMo9814);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Float m25305(AbstractC18144 abstractC18144, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        float f = abstractC18144.get(iIntValue);
        if (f != abstractC18144.mo9816() || abstractC18144.mo9815(iIntValue)) {
            return Float.valueOf(f);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Float m25306(AbstractC18144 abstractC18144, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (abstractC18144.mo9815(iIntValue)) {
            return Float.valueOf(abstractC18144.remove(iIntValue));
        }
        return null;
    }
}
