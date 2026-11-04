package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۨ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261X */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12646 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40561;

    public /* synthetic */ C12646(int i) {
        this.f40561 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f40561) {
            case 0:
                return ((InterfaceC2731) obj).mo9074().compareToIgnoreCase(((InterfaceC2731) obj2).mo9074());
            default:
                C12971 c12971 = (C12971) obj;
                C12971 c12972 = (C12971) obj2;
                if (c12971 == c12972) {
                    return 0;
                }
                return c12971.m32383() == c12972 ? 1 : -1;
        }
    }
}
