package l;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۜ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes3.dex */
public final class C7089 implements InterfaceC23650 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14146 f23764;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f23765 = new HashSet();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18961(C14146 c14146) {
        this.f23765.add(c14146);
        if (this.f23764 != null) {
            return;
        }
        this.f23764 = c14146;
        c14146.m34219();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18958() {
        this.f23764 = null;
        HashSet hashSet = this.f23765;
        AbstractC22433 abstractC22433CopyOf = AbstractC22433.copyOf((Collection) hashSet);
        hashSet.clear();
        AbstractC16706 abstractC16706ListIterator = abstractC22433CopyOf.listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            ((C14146) abstractC16706ListIterator.next()).m34215();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18959(Exception exc, boolean z) {
        this.f23764 = null;
        HashSet hashSet = this.f23765;
        AbstractC22433 abstractC22433CopyOf = AbstractC22433.copyOf((Collection) hashSet);
        hashSet.clear();
        AbstractC16706 abstractC16706ListIterator = abstractC22433CopyOf.listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            ((C14146) abstractC16706ListIterator.next()).m34217(exc, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18960(C14146 c14146) {
        HashSet hashSet = this.f23765;
        hashSet.remove(c14146);
        if (this.f23764 == c14146) {
            this.f23764 = null;
            if (hashSet.isEmpty()) {
                return;
            }
            C14146 c14147 = (C14146) hashSet.iterator().next();
            this.f23764 = c14147;
            c14147.m34219();
        }
    }
}
