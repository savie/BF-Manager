package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13630 implements InterfaceC0553 {
    public volatile /* synthetic */ Object _rootCause;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0928 f44966;
    public volatile /* synthetic */ int _isCompleting = 0;
    public volatile /* synthetic */ Object _exceptionsHolder = null;

    @Override // l.InterfaceC0553
    /* JADX INFO: renamed from: ۖ */
    public final C0928 mo2638() {
        return this.f44966;
    }

    public C13630(C0928 c0928, Throwable th) {
        this.f44966 = c0928;
        this._rootCause = th;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m33334() {
        return this._isCompleting;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m33331() {
        this._isCompleting = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m33332() {
        return (Throwable) this._rootCause;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33333(Throwable th) {
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 == null) {
            this._rootCause = th;
            return;
        }
        if (th == th2) {
            return;
        }
        Object obj = this._exceptionsHolder;
        if (obj == null) {
            this._exceptionsHolder = th;
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
        this._exceptionsHolder = arrayList;
    }

    @Override // l.InterfaceC0553
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo2639() {
        return ((Throwable) this._rootCause) == null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m33336() {
        return ((Throwable) this._rootCause) != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList m33335(Throwable th) {
        ArrayList arrayList;
        Object obj = this._exceptionsHolder;
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
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 != null) {
            arrayList.add(0, th2);
        }
        if (th != null && !th.equals(th2)) {
            arrayList.add(th);
        }
        this._exceptionsHolder = C5162.f17920;
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m33337() {
        return this._exceptionsHolder == C5162.f17920;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    public final String toString() {
        return "Finishing[cancelling=" + m33336() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f44966 + ']';
    }
}
