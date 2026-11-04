package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩷ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes.dex */
public final class C22015 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71041 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C4060 f71042 = new C4060();

    static {
        String[] strArrMo7905 = ApplicationC17729.f58258.mo7905("psort", (String[]) null);
        if (strArrMo7905 != null) {
            for (int i = 0; i < strArrMo7905.length; i++) {
                f71042.mo7845(i, (Object) strArrMo7905[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49800(String[] strArr) {
        ApplicationC17729.f58258.edit().mo3490("psort", strArr).apply();
        synchronized (C22015.class) {
            f71042.clear();
            for (int i = 0; i < strArr.length; i++) {
                f71042.mo7845(i, (Object) strArr[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m49797(AbstractC22044... abstractC22044Arr) {
        List list;
        synchronized (C22015.class) {
            list = (List) C13847.stream(abstractC22044Arr).flatMap(new C9714(3)).distinct().filter(new C2340(0)).map(new C8306()).sorted().map(new C6815()).collect(C2025.toList());
        }
        return list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20670 m49799(AbstractC22044 abstractC22044) {
        return C1170.stream(abstractC22044.mo4299(true));
    }
}
