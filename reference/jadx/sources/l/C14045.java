package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14045 implements InterfaceC14852 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19881 f44493;

    public final String toString() {
        return "unnamedModule Completer";
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean mo11630() {
        return false;
    }

    public C14045(C19881 c19881) {
        this.f44493 = c19881;
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public final void mo11629(AbstractC11781 abstractC11781) {
        C19881 c19881 = this.f44493;
        if (c19881.f63979) {
            abstractC11781.f38070 = this;
            return;
        }
        C2920 c2920 = (C2920) abstractC11781;
        HashSet hashSet = new HashSet(c19881.m45782());
        hashSet.remove(c19881.f63964.f48308);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C2920) it.next()).mo29590();
        }
        c19881.m45743(c2920, hashSet);
    }
}
