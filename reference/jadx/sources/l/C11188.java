package l;

/* JADX INFO: renamed from: l.ۤ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: LCAX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11188 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m28189(AbstractC3555 abstractC3555, Character ch, Object obj) {
        char cCharValue = ch.charValue();
        boolean zMo19857 = abstractC3555.mo19857(cCharValue);
        Object objMo11584 = abstractC3555.mo11584(cCharValue, obj);
        if (zMo19857) {
            return objMo11584;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m28190(AbstractC3555 abstractC3555, Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        Object objMo19863 = abstractC3555.mo19863(cCharValue);
        if (objMo19863 != abstractC3555.mo11586() || abstractC3555.mo19857(cCharValue)) {
            return objMo19863;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m28191(AbstractC3555 abstractC3555, Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        if (abstractC3555.mo19857(cCharValue)) {
            return abstractC3555.mo11585(cCharValue);
        }
        return null;
    }
}
