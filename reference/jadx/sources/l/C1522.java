package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.֫֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1522 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6219;

    public /* synthetic */ C1522(int i) {
        this.f6219 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6219) {
            case 0:
                return -Long.compare(((C12107) obj).getSize(), ((C12107) obj2).getSize());
            case 1:
                return Integer.compare(((C10971) obj2).f37386, ((C10971) obj).f37386);
            case 2:
                return Integer.compare(((C0093) obj).f1015, ((C0093) obj2).f1015);
            default:
                return ((String) obj).compareToIgnoreCase((String) obj2);
        }
    }
}
