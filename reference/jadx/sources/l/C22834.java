package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩸۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22834 implements InterfaceC21146 {
    public volatile /* synthetic */ Object _exceptionsHolder$volatile;
    public volatile /* synthetic */ int _isCompleting$volatile = 0;
    public volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1951 f74014;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f74012 = AtomicIntegerFieldUpdater.newUpdater(C22834.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f74011 = AtomicReferenceFieldUpdater.newUpdater(C22834.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f74013 = AtomicReferenceFieldUpdater.newUpdater(C22834.class, Object.class, "_exceptionsHolder$volatile");

    @Override // l.InterfaceC21146
    /* JADX INFO: renamed from: ۙ */
    public final C1951 mo6734() {
        return this.f74014;
    }

    public C22834(C1951 c1951, Throwable th) {
        this.f74014 = c1951;
        this._rootCause$volatile = th;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m51538() {
        return f74012.get(this) != 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m51536() {
        f74012.set(this, 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Throwable m51539() {
        return (Throwable) f74011.get(this);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m51537() {
        return f74013.get(this) == C13137.f42025;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m51540(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f74013;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj != null) {
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            } else {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            }
        } else {
            arrayList = new ArrayList(4);
        }
        Throwable thM51539 = m51539();
        if (thM51539 != null) {
            arrayList.add(0, thM51539);
        }
        if (th != null && !th.equals(thM51539)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, C13137.f42025);
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m51541() {
        return m51539() != null;
    }

    @Override // l.InterfaceC21146
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo6735() {
        return m51539() == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51535(Throwable th) {
        Throwable thM51539 = m51539();
        if (thM51539 == null) {
            f74011.set(this, th);
            return;
        }
        if (th == thM51539) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f74013;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final String toString() {
        return "Finishing[cancelling=" + m51541() + ", completing=" + m51538() + ", rootCause=" + m51539() + ", exceptions=" + f74013.get(this) + ", list=" + this.f74014 + ']';
    }
}
