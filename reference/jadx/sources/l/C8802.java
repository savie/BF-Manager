package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۠ᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36FV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8802 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f28676;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f28677;

    public /* synthetic */ C8802(int i) {
        this();
    }

    public C8802() {
        this.f28677 = new ConcurrentMapC17249();
        this.f28676 = new HashSet();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC4043 m23633(Object obj) {
        return (InterfaceC4043) this.f28677.get(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23630(Object obj, C17467 c17467) {
        HashSet hashSet = this.f28676;
        boolean zContains = hashSet.contains(obj);
        ConcurrentMapC17249 concurrentMapC17249 = this.f28677;
        if (zContains) {
            concurrentMapC17249.remove(obj);
        } else if (((InterfaceC4043) concurrentMapC17249.put(obj, c17467)) != null) {
            concurrentMapC17249.remove(obj);
            hashSet.add(obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23632(Object obj) {
        return this.f28676.contains(obj) || this.f28677.containsKey(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23631(C24927 c24927) {
        C1170.removeIf(this.f28677.entrySet(), new C22602(1, c24927));
    }
}
