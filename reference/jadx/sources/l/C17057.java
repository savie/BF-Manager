package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܿۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261X */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17057 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54465;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f54465) {
            case 0:
                return ((InterfaceC12783) obj).mo31757().compareTo(((InterfaceC12783) obj2).mo31757());
            default:
                return ((String) obj2).length() - ((String) obj).length();
        }
    }
}
