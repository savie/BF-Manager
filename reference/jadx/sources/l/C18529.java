package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܿᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18529 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60228;

    public /* synthetic */ C18529(int i) {
        this.f60228 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f60228) {
            case 0:
                return ((Integer) obj).compareTo((Integer) obj2);
            default:
                return C7972.m21739(C10208.m26337((InterfaceC2731) obj), C10208.m26337((InterfaceC2731) obj2));
        }
    }
}
