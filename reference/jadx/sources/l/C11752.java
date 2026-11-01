package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۨܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11752 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39479;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f39479) {
            case 0:
                return ((Integer) obj).compareTo((Integer) obj2);
            default:
                return Integer.compare(((InterfaceC14551) obj).mo17726(), ((InterfaceC14551) obj2).mo17726());
        }
    }
}
