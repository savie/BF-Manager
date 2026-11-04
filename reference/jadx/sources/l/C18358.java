package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܿ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18358 extends AbstractC0459 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C18358 f59836;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f59837;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Handler f59838;

    @Override // l.AbstractC0459, l.AbstractC18951
    public final String toString() {
        AbstractC0459 abstractC0459Mo2274;
        String str;
        int i = C1755.f5987;
        AbstractC0459 abstractC0459 = C18593.f60391;
        if (this == abstractC0459) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC0459Mo2274 = abstractC0459.mo2274();
            } catch (UnsupportedOperationException unused) {
                abstractC0459Mo2274 = null;
            }
            str = this == abstractC0459Mo2274 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f59838.toString();
        return this.f59837 ? C14483.m34972(string, ".immediate") : string;
    }

    public C18358(Handler handler, boolean z) {
        super(0);
        this.f59838 = handler;
        this.f59837 = z;
        this.f59836 = z ? this : new C18358(handler, true);
    }

    public C18358(Handler handler) {
        this(handler, false);
    }

    @Override // l.AbstractC0459
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC0459 mo2274() {
        return this.f59836;
    }

    @Override // l.AbstractC18951
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo42813() {
        return (this.f59837 && C15243.m36589(Looper.myLooper(), this.f59838.getLooper())) ? false : true;
    }

    @Override // l.AbstractC18951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11210(InterfaceC11536 interfaceC11536, Runnable runnable) {
        if (this.f59838.post(runnable)) {
            return;
        }
        C13686.m33478(interfaceC11536, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C1755.m6200().mo11210(interfaceC11536, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18358)) {
            return false;
        }
        C18358 c18358 = (C18358) obj;
        return c18358.f59838 == this.f59838 && c18358.f59837 == this.f59837;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f59838) ^ (this.f59837 ? 1231 : 1237);
    }
}
