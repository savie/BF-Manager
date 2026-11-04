package l;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܶ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZA */
/* JADX INFO: loaded from: classes5.dex */
public class C16406 extends ReentrantLock implements InterfaceC23866 {
    public static final long serialVersionUID = -3264781576883412227L;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f53240 = C16980.m40038(C16406.class.getName());

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile C14168 f53244 = null;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile AbstractC18053 f53242 = null;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile EnumC21037 f53241 = EnumC21037.f67241;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17898 f53243 = new C17898("Announce");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17898 f53245 = new C17898("Cancel");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14168 m38974() {
        return this.f53244;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo38970(C14168 c14168) {
        this.f53244 = c14168;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38969(AbstractC8357 abstractC8357, EnumC21037 enumC21037) {
        if (this.f53242 == null && this.f53241 == enumC21037) {
            lock();
            try {
                if (this.f53242 == null && this.f53241 == enumC21037) {
                    mo38975(abstractC8357);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38968(AbstractC8357 abstractC8357) {
        if (this.f53242 == abstractC8357) {
            lock();
            try {
                if (this.f53242 == abstractC8357) {
                    mo38975(null);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo38975(AbstractC8357 abstractC8357) {
        this.f53242 = abstractC8357;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38971(EnumC21037 enumC21037) {
        lock();
        try {
            this.f53241 = enumC21037;
            if (this.f53241.m48088()) {
                this.f53243.m41750();
            }
            if (this.f53241.m48085()) {
                this.f53245.m41750();
                this.f53243.m41750();
            }
        } finally {
            unlock();
        }
    }

    @Override // l.InterfaceC23866
    /* JADX INFO: renamed from: ۙ */
    public final void mo34430(AbstractC18053 abstractC18053) {
        if (this.f53242 == abstractC18053) {
            lock();
            try {
                if (this.f53242 == abstractC18053) {
                    m38971(this.f53241.m48083());
                } else {
                    f53240.mo13710("Trying to advance state whhen not the owner. owner: {} perpetrator: {}", this.f53242, abstractC18053);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m38973() {
        if (m38967()) {
            return;
        }
        lock();
        try {
            if (!m38967()) {
                m38971(this.f53241.m48089());
                mo38975(null);
            }
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38972() {
        boolean z = false;
        if (m38967()) {
            return false;
        }
        lock();
        try {
            if (!m38967()) {
                m38971(EnumC21037.f67233);
                mo38975(null);
                z = true;
            }
            return z;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m38976() {
        if (!this.f53241.m48085()) {
            this.f53245.m41751(5000L);
        }
        if (!this.f53241.m48085()) {
            this.f53245.m41751(10L);
            if (!this.f53241.m48085() && !this.f53241.m48084() && !this.f53241.m48090()) {
                f53240.mo13728(this, "Wait for canceled timed out: {}");
            }
        }
        return this.f53241.m48085();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m38967() {
        return this.f53241.m48085() || this.f53241.m48082();
    }

    @Override // java.util.concurrent.locks.ReentrantLock
    public final String toString() {
        String str;
        String str2 = "NO DNS";
        try {
            StringBuilder sb = new StringBuilder();
            if (this.f53244 != null) {
                str = "DNS: " + this.f53244.getName() + " [" + this.f53244.m34448() + "]";
            } else {
                str = "NO DNS";
            }
            sb.append(str);
            sb.append(" state: ");
            sb.append(this.f53241);
            sb.append(" task: ");
            sb.append(this.f53242);
            return sb.toString();
        } catch (IOException unused) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f53244 != null) {
                str2 = "DNS: " + this.f53244.getName();
            }
            sb2.append(str2);
            sb2.append(" state: ");
            sb2.append(this.f53241);
            sb2.append(" task: ");
            sb2.append(this.f53242);
            return sb2.toString();
        }
    }
}
