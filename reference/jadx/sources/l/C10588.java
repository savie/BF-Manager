package l;

/* JADX INFO: renamed from: l.ۤ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SLZ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10588 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Float m26762(AbstractC21378 abstractC21378, Integer num, Float f) {
        int iIntValue = num.intValue();
        boolean zMo10713 = abstractC21378.mo10713(iIntValue);
        float fMo10711 = abstractC21378.mo10711(f.floatValue(), iIntValue);
        if (zMo10713) {
            return Float.valueOf(fMo10711);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Float m26763(AbstractC21378 abstractC21378, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        float f = abstractC21378.get(iIntValue);
        if (f != abstractC21378.mo20437() || abstractC21378.mo10713(iIntValue)) {
            return Float.valueOf(f);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Float m26764(AbstractC21378 abstractC21378, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (abstractC21378.mo10713(iIntValue)) {
            return Float.valueOf(abstractC21378.remove(iIntValue));
        }
        return null;
    }
}
