package l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.֨۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DU */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0998 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16831 f4665;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3403 f4666;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f4667;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f4664 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f4668 = true;

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo2809();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3818(C16126 c16126) {
        c16126.m38173(this);
        this.f4664.put(c16126.m38171().toLowerCase(), c16126);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3817(C7659 c7659, String str) {
        c7659.m38172(str);
        m3818(c7659);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16126 mo3813(String str) {
        return (C16126) this.f4664.get(str.toLowerCase());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3403 m3821() {
        return this.f4666;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m3823() {
        C3403 c3403 = this.f4666;
        if (c3403 == null) {
            throw new RuntimeException("This " + getClass().getName() + " was not add()ed to a Synthesizer.");
        }
        c3403.m10102(this);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3403 m3824() {
        return this.f4666;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3816(C3403 c3403) {
        C3403 c3404 = this.f4666;
        if (c3404 != null && c3404 != c3403) {
            throw new RuntimeException("Unit synthesisEngine already set.");
        }
        this.f4666 = c3403;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3814() {
        for (C16126 c16126 : this.f4664.values()) {
            if (c16126 instanceof C21064) {
                ((C21064) c16126).m47473();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3819(C16831 c16831) {
        if (this.f4665 != null) {
            throw new RuntimeException("Unit is already in a circuit.");
        }
        this.f4665 = c16831;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16831 m3822() {
        return this.f4665;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3815(long j) {
        if (!this.f4668 || j <= this.f4667) {
            return;
        }
        this.f4667 = j;
        for (Object obj : this.f4664.values()) {
            if (obj instanceof InterfaceC2719) {
                ((InterfaceC2719) obj).mo8298(j);
            }
        }
        mo2809();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m3812() {
        return this.f4668;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3820(boolean z) {
        this.f4668 = z;
        if (z) {
            return;
        }
        mo3814();
    }
}
