package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۟᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8172 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26955;

    public /* synthetic */ C8172(int i) {
        this.f26955 = i;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f26955) {
            case 0:
                C25042 c25042 = (C25042) obj;
                C25042 c25043 = (C25042) obj2;
                int iCompare = Integer.compare(c25042.f81016, c25043.f81016);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Integer.compare(c25043.f81014, c25042.f81014);
                return iCompare2 != 0 ? iCompare2 : c25042.f81015.compareTo(c25043.f81015);
            default:
                AbstractC6662 abstractC6662 = (AbstractC6662) obj;
                AbstractC6662 abstractC6663 = (AbstractC6662) obj2;
                if (abstractC6662.m18625() != abstractC6663.m18625()) {
                    if (abstractC6662.m18625()) {
                        return -1;
                    }
                    return 1;
                }
                if (abstractC6662.m18625()) {
                    return abstractC6662.m18624().compareTo(abstractC6663.m18624());
                }
                if (abstractC6662.m18630() != abstractC6663.m18630()) {
                    if (abstractC6662.m18630()) {
                        return 1;
                    }
                    return -1;
                }
                if (!abstractC6662.m18630()) {
                    return abstractC6662.m18624().compareTo(abstractC6663.m18624());
                }
                if (abstractC6662.m18639() == abstractC6663.m18639()) {
                    return abstractC6662.m18624().compareTo(abstractC6663.m18624());
                }
                if (abstractC6662.m18639()) {
                    return 1;
                }
                return -1;
        }
    }
}
