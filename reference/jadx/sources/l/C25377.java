package l;

/* JADX INFO: renamed from: l.᩻᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BBU */
/* JADX INFO: loaded from: classes.dex */
public final class C25377 extends C12763 {
    static {
        new C25377(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25377 m56737(C9933 c9933) {
        C9012 c9012 = C9012.f29360;
        int size = c9933.size();
        C11950[] c11950Arr = new C11950[size];
        int i = 0;
        C9012 c9013 = c9012;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC18884 abstractC18884M31618get = c9933.m31618get(i2);
            if (!(abstractC18884M31618get instanceof C21122)) {
                C9012 c9012M43799 = abstractC18884M31618get.m43799();
                if (!c9012M43799.equals(c9012) && !c9012M43799.m24068(c9013)) {
                    c11950Arr[i] = new C11950(abstractC18884M31618get.m43804(), c9012M43799);
                    i++;
                    c9013 = c9012M43799;
                }
            }
        }
        C25377 c25377 = new C25377(i);
        for (int i3 = 0; i3 < i; i3++) {
            c25377.m31596(i3, c11950Arr[i3]);
        }
        c25377.mo15005();
        return c25377;
    }
}
