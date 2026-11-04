package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩺ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6J0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24493 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f79467;

    public /* synthetic */ C24493(int i) {
        this.f79467 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f79467) {
            case 0:
                return Integer.compare(((C23747) obj).mo35833(), ((C23747) obj2).mo35833());
            case 1:
                return ((Double) obj).compareTo((Double) obj2);
            default:
                return Integer.compare(((InterfaceC5903) obj).mo3870(), ((InterfaceC5903) obj2).mo3870());
        }
    }
}
