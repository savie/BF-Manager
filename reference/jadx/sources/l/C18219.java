package l;

import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ᩳᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38J0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18219 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f58186;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f58187;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC21041 f58188;

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        try {
            return m42341(interfaceC7222);
        } catch (C22861 unused) {
            return false;
        }
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f58186 = interfaceC15690;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        AbstractC21041 abstractC21041 = this.f58188;
        if (abstractC21041 != null) {
            abstractC21041.m47444(j, j2);
        }
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        C2023.m6508(this.f58186);
        if (this.f58188 == null) {
            if (!m42341(interfaceC7222)) {
                throw C22861.m50610("Failed to determine bitstream type", (Throwable) null);
            }
            interfaceC7222.mo19217();
        }
        if (!this.f58187) {
            InterfaceC8011 interfaceC8011Mo7684 = this.f58186.mo7684(0, 1);
            this.f58186.mo7696();
            this.f58188.m47445(this.f58186, interfaceC8011Mo7684);
            this.f58187 = true;
        }
        return this.f58188.m47442(interfaceC7222, c0954);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m42341(InterfaceC7222 interfaceC7222) {
        boolean zM37515;
        C8342 c8342 = new C8342();
        if (c8342.m21791(interfaceC7222, true) && (c8342.f28880 & 2) == 2) {
            int iMin = Math.min(c8342.f28882, 8);
            C2460 c2460 = new C2460(iMin);
            interfaceC7222.mo19210(0, iMin, c2460.m7518());
            c2460.m7510(0);
            if (c2460.m7503() >= 5 && c2460.m7516() == 127 && c2460.m7532() == 1179402563) {
                this.f58188 = new C21747();
                return true;
            }
            c2460.m7510(0);
            try {
                zM37515 = C15773.m37515(1, c2460, true);
            } catch (C22861 unused) {
                zM37515 = false;
            }
            if (zM37515) {
                this.f58188 = new C20336();
            } else {
                c2460.m7510(0);
                if (C9048.m23374(c2460)) {
                    this.f58188 = new C9048();
                }
            }
            return true;
        }
        return false;
    }
}
