package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩺ۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 09UO */
/* JADX INFO: loaded from: classes.dex */
public final class C22927 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15166 f74522;

    public C22927(C15166 c15166) {
        this.f74522 = c15166;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = 0;
        ConcurrentMapC13783 concurrentMapC13783 = this.f74522.f49533;
        Integer num2 = (Integer) concurrentMapC13783.get(((InterfaceC18361) obj).mo36917());
        Integer num3 = (Integer) concurrentMapC13783.get(((InterfaceC18361) obj2).mo36917());
        if (num2 == null) {
            num2 = num;
        }
        return Integer.compare(num2.intValue(), (num3 != null ? num3 : 0).intValue());
    }
}
