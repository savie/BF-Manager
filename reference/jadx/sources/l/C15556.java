package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܶ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15556 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50609 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C6644 f50610 = new C6644();

    static {
        String[] strArrMo16349 = ApplicationC0716.f2992.mo16349("psort", (String[]) null);
        if (strArrMo16349 != null) {
            for (int i = 0; i < strArrMo16349.length; i++) {
                f50610.mo18019(i, (Object) strArrMo16349[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37197(String[] strArr) {
        ApplicationC0716.f2992.edit().mo4069("psort", strArr).apply();
        synchronized (C15556.class) {
            f50610.clear();
            for (int i = 0; i < strArr.length; i++) {
                f50610.mo18019(i, (Object) strArr[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m37194(AbstractC20745... abstractC20745Arr) {
        List list;
        synchronized (C15556.class) {
            list = (List) C20318.stream(abstractC20745Arr).flatMap(new C1443(0)).distinct().filter(new C13439(0)).map(new C4265()).sorted().map(new C7088()).collect(C1890.toList());
        }
        return list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5046 m37195(AbstractC20745 abstractC20745) {
        return C9030.stream(abstractC20745.mo33983(true));
    }
}
