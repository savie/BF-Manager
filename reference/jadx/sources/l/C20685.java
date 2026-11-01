package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩷ۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20685 extends AbstractC15747 {
    public volatile C20685 _immediate;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Handler f67277;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f67278;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20685 f67279;

    @Override // l.AbstractC15747, l.AbstractC12405
    public final String toString() {
        AbstractC15747 abstractC15747Mo37488;
        String str;
        int i = C6904.f23232;
        AbstractC15747 abstractC15747 = C18381.f58625;
        if (this == abstractC15747) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC15747Mo37488 = abstractC15747.mo37488();
            } catch (UnsupportedOperationException unused) {
                abstractC15747Mo37488 = null;
            }
            str = this == abstractC15747Mo37488 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f67277.toString();
        return this.f67278 ? C15489.m37076(string, ".immediate") : string;
    }

    public C20685(Handler handler, boolean z) {
        super(0);
        this.f67277 = handler;
        this.f67278 = z;
        this._immediate = z ? this : null;
        C20685 c20685 = this._immediate;
        if (c20685 == null) {
            c20685 = new C20685(handler, true);
            this._immediate = c20685;
        }
        this.f67279 = c20685;
    }

    public C20685(Handler handler) {
        this(handler, false);
    }

    @Override // l.AbstractC15747
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC15747 mo37488() {
        return this.f67279;
    }

    @Override // l.AbstractC12405
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo30859() {
        return (this.f67278 && C13465.m32965(Looper.myLooper(), this.f67277.getLooper())) ? false : true;
    }

    @Override // l.AbstractC12405
    /* JADX INFO: renamed from: ۙ */
    public final void mo8623(InterfaceC22386 interfaceC22386, Runnable runnable) {
        if (this.f67277.post(runnable)) {
            return;
        }
        C9727.m24682(interfaceC22386, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C6904.m18522().mo8623(interfaceC22386, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C20685) && ((C20685) obj).f67277 == this.f67277;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f67277);
    }
}
