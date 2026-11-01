package l;

/* JADX INFO: renamed from: l.۫ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: LCAX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12143 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m30216(AbstractC2450 abstractC2450, Character ch, Object obj) {
        char cCharValue = ch.charValue();
        boolean zMo15965 = abstractC2450.mo15965(cCharValue);
        Object objMo7435 = abstractC2450.mo7435(cCharValue, obj);
        if (zMo15965) {
            return objMo7435;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m30217(AbstractC2450 abstractC2450, Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        Object objMo15966 = abstractC2450.mo15966(cCharValue);
        if (objMo15966 != abstractC2450.mo7437() || abstractC2450.mo15965(cCharValue)) {
            return objMo15966;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m30218(AbstractC2450 abstractC2450, Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        if (abstractC2450.mo15965(cCharValue)) {
            return abstractC2450.mo7436(cCharValue);
        }
        return null;
    }
}
