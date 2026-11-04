package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L8NY */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14324 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45201;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f45201) {
            case 0:
                return Long.compare(((C17308) obj).f56369, ((C17308) obj2).f56369);
            default:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
        }
    }
}
