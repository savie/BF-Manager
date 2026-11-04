package l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۘۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DU */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4053 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19715 f13794;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f13795;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C15745 f13796;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f13798 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f13797 = true;

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo2017();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13040(C21953 c21953) {
        c21953.m49677(this);
        this.f13798.put(c21953.m49675().toLowerCase(), c21953);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13037(C13508 c13508, String str) {
        c13508.m49676(str);
        m13040(c13508);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21953 mo13034(String str) {
        return (C21953) this.f13798.get(str.toLowerCase());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13042() {
        C15745 c15745 = this.f13796;
        if (c15745 == null) {
            throw new RuntimeException("This " + getClass().getName() + " was not add()ed to a Synthesizer.");
        }
        c15745.m37664(this);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15745 m13046() {
        return this.f13796;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15745 m13045() {
        return this.f13796;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13038(C15745 c15745) {
        C15745 c15746 = this.f13796;
        if (c15746 != null && c15746 != c15745) {
            throw new RuntimeException("Unit synthesisEngine already set.");
        }
        this.f13796 = c15745;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13035() {
        for (C21953 c21953 : this.f13798.values()) {
            if (c21953 instanceof C4799) {
                ((C4799) c21953).m14826();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13039(C19715 c19715) {
        if (this.f13794 != null) {
            throw new RuntimeException("Unit is already in a circuit.");
        }
        this.f13794 = c19715;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19715 m13043() {
        return this.f13794;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13036(long j) {
        if (!this.f13797 || j <= this.f13795) {
            return;
        }
        this.f13795 = j;
        for (Object obj : this.f13798.values()) {
            if (obj instanceof InterfaceC12016) {
                ((InterfaceC12016) obj).mo30206(j);
            }
        }
        mo2017();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m13044() {
        return this.f13797;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13041(boolean z) {
        this.f13797 = z;
        if (z) {
            return;
        }
        mo13035();
    }
}
