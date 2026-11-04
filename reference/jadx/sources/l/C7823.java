package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.۟ۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R96D */
/* JADX INFO: loaded from: classes4.dex */
public final class C7823 implements InterfaceC1798, InterfaceC19010, InterfaceC6426 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26060 = AtomicReferenceFieldUpdater.newUpdater(C7823.class, Object.class, "state$volatile");
    public volatile /* synthetic */ Object state$volatile;

    @Override // l.InterfaceC6426
    /* JADX INFO: renamed from: ۙ */
    public final void mo18187(C10631 c10631, int i) {
    }

    @Override // l.InterfaceC19010
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo21307(C9407 c9407, Object obj) {
        return m21305(c9407) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC1111 m21306(C9407 c9407) {
        int iM21305 = m21305(c9407);
        if (iM21305 == 0) {
            return EnumC1111.SUCCESSFUL;
        }
        if (iM21305 == 1) {
            return EnumC1111.REREGISTER;
        }
        if (iM21305 == 2) {
            return EnumC1111.CANCELLED;
        }
        if (iM21305 == 3) {
            return EnumC1111.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + iM21305).toString());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final int m21305(C9407 c9407) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26060;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC11492)) {
                if (C15243.m36589(obj, C10059.f32248) ? true : obj instanceof C0365) {
                    return 3;
                }
                if (C15243.m36589(obj, C10059.f32246)) {
                    return 2;
                }
                boolean z = false;
                if (C15243.m36589(obj, C10059.f32247)) {
                    List listM21087 = C7743.m21087(c9407);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, listM21087)) {
                            z = true;
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                    if (z) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj).toString());
                    }
                    Collection collection = (Collection) obj;
                    ArrayList arrayList = new ArrayList(collection.size() + 1);
                    arrayList.addAll(collection);
                    arrayList.add(c9407);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, arrayList)) {
                            z = true;
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                    if (z) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // l.InterfaceC1798
    /* JADX INFO: renamed from: ۙ */
    public final void mo6276() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26060;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == C10059.f32248) {
                return;
            }
            C7406 c7406 = C10059.f32246;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7406)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }
}
