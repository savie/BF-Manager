package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8QA */
/* JADX INFO: loaded from: classes4.dex */
public final class C20307 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20039 f65782;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15274 f65783;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C15274 f65784;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15274 f65787;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f65786 = AbstractC22433.of();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC6910 f65785 = AbstractC6910.of();

    public C20307(C20039 c20039) {
        this.f65782 = c20039;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15274 m45832() {
        return this.f65783;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15274 m45836() {
        return this.f65784;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15274 m45831() {
        return this.f65787;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15274 m45837() {
        if (this.f65786.isEmpty()) {
            return null;
        }
        return (C15274) C22808.m50475(this.f65786);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 m45833(C15274 c15274) {
        return (AbstractC16511) this.f65785.get(c15274);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45835(InterfaceC10161 interfaceC10161) {
        this.f65783 = m45826(interfaceC10161, this.f65786, this.f65784, this.f65782);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45838(InterfaceC10161 interfaceC10161) {
        this.f65783 = m45826(interfaceC10161, this.f65786, this.f65784, this.f65782);
        m45829(interfaceC10161.mo25828());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45834(List list, C15274 c15274, InterfaceC10161 interfaceC10161) {
        this.f65786 = AbstractC22433.copyOf((Collection) list);
        if (!list.isEmpty()) {
            this.f65784 = (C15274) list.get(0);
            c15274.getClass();
            this.f65787 = c15274;
        }
        if (this.f65783 == null) {
            this.f65783 = m45826(interfaceC10161, this.f65786, this.f65784, this.f65782);
        }
        m45829(interfaceC10161.mo25828());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45829(AbstractC16511 abstractC16511) {
        C13261 c13261M18530 = AbstractC6910.m18530();
        if (this.f65786.isEmpty()) {
            m45828(c13261M18530, this.f65784, abstractC16511);
            if (!C13638.equals(this.f65787, this.f65784)) {
                m45828(c13261M18530, this.f65787, abstractC16511);
            }
            if (!C13638.equals(this.f65783, this.f65784) && !C13638.equals(this.f65783, this.f65787)) {
                m45828(c13261M18530, this.f65783, abstractC16511);
            }
        } else {
            for (int i = 0; i < this.f65786.size(); i++) {
                m45828(c13261M18530, (C15274) this.f65786.get(i), abstractC16511);
            }
            if (!this.f65786.contains(this.f65783)) {
                m45828(c13261M18530, this.f65783, abstractC16511);
            }
        }
        this.f65785 = c13261M18530.mo32742();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45828(C13261 c13261, C15274 c15274, AbstractC16511 abstractC16511) {
        if (c15274 == null) {
            return;
        }
        if (abstractC16511.mo14959(c15274.f49778) != -1) {
            c13261.mo32741(c15274, abstractC16511);
            return;
        }
        AbstractC16511 abstractC16512 = (AbstractC16511) this.f65785.get(c15274);
        if (abstractC16512 != null) {
            c13261.mo32741(c15274, abstractC16512);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15274 m45826(InterfaceC10161 interfaceC10161, AbstractC22433 abstractC22433, C15274 c15274, C20039 c20039) {
        AbstractC16511 abstractC16511Mo25828 = interfaceC10161.mo25828();
        int iMo25824 = interfaceC10161.mo25824();
        Object objMo14960 = abstractC16511Mo25828.m38828() ? null : abstractC16511Mo25828.mo14960(iMo25824);
        int iM45385 = (interfaceC10161.mo25811() || abstractC16511Mo25828.m38828()) ? -1 : abstractC16511Mo25828.mo5920(iMo25824, c20039, false).m45385(C17983.m41827(interfaceC10161.getCurrentPosition()) - c20039.f64171);
        for (int i = 0; i < abstractC22433.size(); i++) {
            C15274 c15275 = (C15274) abstractC22433.get(i);
            if (m45830(c15275, objMo14960, interfaceC10161.mo25811(), interfaceC10161.mo25827(), interfaceC10161.mo25856(), iM45385)) {
                return c15275;
            }
        }
        if (abstractC22433.isEmpty() && c15274 != null) {
            if (m45830(c15274, objMo14960, interfaceC10161.mo25811(), interfaceC10161.mo25827(), interfaceC10161.mo25856(), iM45385)) {
                return c15274;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45830(C15274 c15274, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = c15274.f49778;
        int i4 = c15274.f49779;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && c15274.f49782 == i2) {
            return true;
        }
        return !z && i4 == -1 && c15274.f49781 == i3;
    }
}
