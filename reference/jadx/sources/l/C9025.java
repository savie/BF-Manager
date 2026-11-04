package l;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۡ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes4.dex */
public final class C9025 implements InterfaceC3059 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14245 f29377;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f29378 = new HashSet();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24081(C14245 c14245) {
        this.f29378.add(c14245);
        if (this.f29377 != null) {
            return;
        }
        this.f29377 = c14245;
        c14245.m34587();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24078() {
        this.f29377 = null;
        HashSet hashSet = this.f29378;
        AbstractC1928 abstractC1928CopyOf = AbstractC1928.copyOf((Collection) hashSet);
        hashSet.clear();
        AbstractC14956 abstractC14956ListIterator = abstractC1928CopyOf.listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            ((C14245) abstractC14956ListIterator.next()).m34588();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24079(Exception exc, boolean z) {
        this.f29377 = null;
        HashSet hashSet = this.f29378;
        AbstractC1928 abstractC1928CopyOf = AbstractC1928.copyOf((Collection) hashSet);
        hashSet.clear();
        AbstractC14956 abstractC14956ListIterator = abstractC1928CopyOf.listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            ((C14245) abstractC14956ListIterator.next()).m34585(exc, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24080(C14245 c14245) {
        HashSet hashSet = this.f29378;
        hashSet.remove(c14245);
        if (this.f29377 == c14245) {
            this.f29377 = null;
            if (hashSet.isEmpty()) {
                return;
            }
            C14245 c14246 = (C14245) hashSet.iterator().next();
            this.f29377 = c14246;
            c14246.m34587();
        }
    }
}
