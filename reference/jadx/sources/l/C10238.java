package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۢܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10238 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32710;

    public /* synthetic */ C10238(int i) {
        this.f32710 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f32710) {
            case 0:
                return ((C8002) obj).getName().compareToIgnoreCase(((C8002) obj2).getName());
            default:
                C25042 c25042 = (C25042) obj;
                C25042 c25043 = (C25042) obj2;
                int iCompare = Integer.compare(c25042.f81016, c25043.f81016);
                return iCompare != 0 ? iCompare : Integer.compare(c25043.f81014, c25042.f81014);
        }
    }
}
