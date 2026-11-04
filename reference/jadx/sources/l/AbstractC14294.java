package l;

import com.umeng.analytics.pro.bo;

/* JADX INFO: renamed from: l.ܰۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 855A */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14294 implements Comparable {
    /* JADX INFO: renamed from: ۙ */
    public abstract int mo1280(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1281(C24166 c24166);

    /* JADX INFO: renamed from: ܽ */
    public abstract EnumC6837 mo1282();

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo1283(AbstractC14294 abstractC14294);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14294 m34702(C24738 c24738, C4028 c4028) {
        byte bM13000 = c4028.m13000();
        EnumC6837 enumC6837M19053 = EnumC6837.m19053((byte) (bM13000 & bo.j));
        byte b = (byte) ((bM13000 & 255) >> 5);
        switch (C3854.f13167[enumC6837M19053.ordinal()]) {
            case 1:
                return new C12057(c4028);
            case 2:
                return new C9073(c4028, b);
            case 3:
                return new C6092(c4028, b);
            case 4:
                return new C7583(c4028, b);
            case 5:
                return new C18770(c4028, b);
            case 6:
                return new C0125(c4028, b);
            case 7:
                return new C23992(c4028, b);
            case 8:
                return new C2362(c24738, c4028, b);
            case 9:
                return new C8328(c24738, c4028, b);
            case 10:
                return new C18024(c24738, c4028, b);
            case 11:
                return new C9819(c24738, c4028, b);
            case 12:
                return new C21008(c24738, c4028, b);
            case 13:
                return new C3108(c24738, c4028);
            case 14:
                return new C15786(c24738, c4028);
            case 15:
                return C0871.f3256;
            case 16:
                if (b == 0) {
                    return C20262.f65067;
                }
                if (b == 1) {
                    return C20262.f65066;
                }
                C20262 c20262 = C20262.f65066;
                throw new RuntimeException("valueArg must be either 0 or 1");
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14294 m34703(C24738 c24738, AbstractC14294 abstractC14294) {
        int i = 0;
        C3282[] c3282Arr = null;
        switch (C3854.f13167[abstractC14294.mo1282().ordinal()]) {
            case 1:
                return new C12057(((C12057) abstractC14294).f38840);
            case 2:
                return new C9073(((C9073) abstractC14294).f29500);
            case 3:
                return new C6092(((C6092) abstractC14294).f20821);
            case 4:
                return new C7583(((C7583) abstractC14294).f25052);
            case 5:
                return new C18770(((C18770) abstractC14294).f60970);
            case 6:
                return new C0125(((C0125) abstractC14294).f1078);
            case 7:
                return new C23992(((C23992) abstractC14294).f77637);
            case 8:
                return new C2362(C3282.m10820(((C2362) abstractC14294).f7616.m10827(), c24738));
            case 9:
                return new C8328(C20436.m46859(((C8328) abstractC14294).f27317.m46860(), c24738));
            case 10:
                return new C18024(((C18024) abstractC14294).f59021.m33265(c24738));
            case 11:
                return new C9819(((C9819) abstractC14294).f31630.m16436(c24738));
            case 12:
                return new C21008(((C21008) abstractC14294).f67177.m33265(c24738));
            case 13:
                AbstractC14294[] abstractC14294Arr = ((C3108) abstractC14294).f75324;
                int length = abstractC14294Arr.length;
                AbstractC14294[] abstractC14294Arr2 = new AbstractC14294[length];
                while (i < length) {
                    abstractC14294Arr2[i] = m34703(c24738, abstractC14294Arr[i]);
                    i++;
                }
                return new C3108(abstractC14294Arr2);
            case 14:
                C15786 c15786 = (C15786) abstractC14294;
                C20436 c20436M46859 = C20436.m46859(c15786.f56275.m46860(), c24738);
                C3282[] c3282Arr2 = c15786.f56276;
                if (c3282Arr2 != null) {
                    int length2 = c3282Arr2.length;
                    C3282[] c3282Arr3 = new C3282[length2];
                    while (i < length2) {
                        c3282Arr3[i] = C3282.m10820(c3282Arr2[i].m10827(), c24738);
                        i++;
                    }
                    c3282Arr = c3282Arr3;
                }
                return new C15786(c20436M46859, c3282Arr, c15786.m40569(c24738));
            case 15:
                return C0871.f3256;
            case 16:
                if (((C20262) abstractC14294).f65068) {
                    return C20262.f65066;
                }
                return C20262.f65067;
            default:
                return null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC14294 abstractC14294) {
        int iCompareTo = mo1282().compareTo(abstractC14294.mo1282());
        return iCompareTo == 0 ? mo1283(abstractC14294) : iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof AbstractC14294) && compareTo((AbstractC14294) obj) == 0;
    }
}
