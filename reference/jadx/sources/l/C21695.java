package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩷֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09UO */
/* JADX INFO: loaded from: classes.dex */
public final class C21695 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10506 f69243;

    public C21695(C10506 c10506) {
        this.f69243 = c10506;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = 0;
        ConcurrentMapC17249 concurrentMapC17249 = this.f69243.f33428;
        Integer num2 = (Integer) concurrentMapC17249.get(((InterfaceC11097) obj).mo28041());
        Integer num3 = (Integer) concurrentMapC17249.get(((InterfaceC11097) obj2).mo28041());
        if (num2 == null) {
            num2 = num;
        }
        return Integer.compare(num2.intValue(), (num3 != null ? num3 : 0).intValue());
    }
}
