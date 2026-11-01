package l;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܽۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZA */
/* JADX INFO: loaded from: classes4.dex */
public class C16390 extends ReentrantLock implements InterfaceC12157 {
    public static final long serialVersionUID = -3264781576883412227L;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f52740 = C13488.m32998(C16390.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile C22823 f52741 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile AbstractC4955 f52742 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile EnumC3066 f52744 = EnumC3066.f11545;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0161 f52743 = new C0161("Announce");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0161 f52745 = new C0161("Cancel");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22823 m38598() {
        return this.f52741;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo38595(C22823 c22823) {
        this.f52741 = c22823;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38594(AbstractC4249 abstractC4249, EnumC3066 enumC3066) {
        if (this.f52742 == null && this.f52744 == enumC3066) {
            lock();
            try {
                if (this.f52742 == null && this.f52744 == enumC3066) {
                    mo38599(abstractC4249);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38593(AbstractC4249 abstractC4249) {
        if (this.f52742 == abstractC4249) {
            lock();
            try {
                if (this.f52742 == abstractC4249) {
                    mo38599(null);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo38599(AbstractC4249 abstractC4249) {
        this.f52742 = abstractC4249;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38592(EnumC3066 enumC3066) {
        lock();
        try {
            this.f52744 = enumC3066;
            if (this.f52744.m9202()) {
                this.f52743.m1269();
            }
            if (this.f52744.m9197()) {
                this.f52745.m1269();
                this.f52743.m1269();
            }
        } finally {
            unlock();
        }
    }

    @Override // l.InterfaceC12157
    /* JADX INFO: renamed from: ۙ */
    public final void mo1648(AbstractC4955 abstractC4955) {
        if (this.f52742 == abstractC4955) {
            lock();
            try {
                if (this.f52742 == abstractC4955) {
                    m38592(this.f52744.m9199());
                } else {
                    f52740.mo12132("Trying to advance state whhen not the owner. owner: {} perpetrator: {}", this.f52742, abstractC4955);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38597() {
        if (m38590()) {
            return;
        }
        lock();
        try {
            if (!m38590()) {
                m38592(this.f52744.m9204());
                mo38599(null);
            }
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38596() {
        boolean z = false;
        if (m38590()) {
            return false;
        }
        lock();
        try {
            if (!m38590()) {
                m38592(EnumC3066.f11549);
                mo38599(null);
                z = true;
            }
            return z;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m38591() {
        if (!this.f52744.m9197()) {
            this.f52745.m1270(5000L);
        }
        if (!this.f52744.m9197()) {
            this.f52745.m1270(10L);
            if (!this.f52744.m9197() && !this.f52744.m9201() && !this.f52744.m9205()) {
                f52740.mo12115(this, "Wait for canceled timed out: {}");
            }
        }
        return this.f52744.m9197();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m38590() {
        return this.f52744.m9197() || this.f52744.m9198();
    }

    @Override // java.util.concurrent.locks.ReentrantLock
    public final String toString() {
        String str;
        String str2 = "NO DNS";
        try {
            StringBuilder sb = new StringBuilder();
            if (this.f52741 != null) {
                str = "DNS: " + this.f52741.getName() + " [" + this.f52741.m50565() + "]";
            } else {
                str = "NO DNS";
            }
            sb.append(str);
            sb.append(" state: ");
            sb.append(this.f52744);
            sb.append(" task: ");
            sb.append(this.f52742);
            return sb.toString();
        } catch (IOException unused) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f52741 != null) {
                str2 = "DNS: " + this.f52741.getName();
            }
            sb2.append(str2);
            sb2.append(" state: ");
            sb2.append(this.f52744);
            sb2.append(" task: ");
            sb2.append(this.f52742);
            return sb2.toString();
        }
    }
}
