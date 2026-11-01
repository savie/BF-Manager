package l;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.֨ܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C1161 extends AbstractC1805 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C2572 f5191;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f5192;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f5193;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean f5194;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f5195;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C5395 f5196;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C20039 f5197;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C0282 f5198;

    public C1161(InterfaceC18095 interfaceC18095, boolean z) {
        super(interfaceC18095);
        this.f5194 = z && interfaceC18095.mo5893();
        this.f5198 = new C0282();
        this.f5197 = new C20039();
        AbstractC16511 abstractC16511Mo5887 = interfaceC18095.mo5887();
        if (abstractC16511Mo5887 != null) {
            this.f5196 = C5395.m14958(abstractC16511Mo5887, (Object) null, (Object) null);
            this.f5195 = true;
        } else {
            this.f5196 = C5395.m14957(interfaceC18095.mo4106());
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 m4269() {
        return this.f5196;
    }

    @Override // l.AbstractC1805, l.AbstractC6537, l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final void mo4109(C13689 c13689) {
        if (this.f5195) {
            this.f5196 = this.f5196.m14961((AbstractC16511) new C10979(this.f5196.f31719, c13689));
        } else {
            this.f5196 = C5395.m14957(c13689);
        }
        this.f6959.mo4109(c13689);
    }

    @Override // l.AbstractC1805
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void mo4270() {
        if (this.f5194) {
            return;
        }
        this.f5192 = true;
        m5892();
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final C2572 mo4105(C15274 c15274, InterfaceC15732 interfaceC15732, long j) {
        C2572 c2572 = new C2572(c15274, interfaceC15732, j);
        c2572.m8025(this.f6959);
        if (this.f5193) {
            Object obj = c15274.f49778;
            if (this.f5196.f18627 != null && obj.equals(C5395.f18625)) {
                obj = this.f5196.f18627;
            }
            c2572.m8024(c15274.m36575(obj));
            return c2572;
        }
        this.f5191 = c2572;
        if (!this.f5192) {
            this.f5192 = true;
            m5892();
        }
        return c2572;
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final void mo4108(InterfaceC6806 interfaceC6806) {
        ((C2572) interfaceC6806).m8023();
        if (interfaceC6806 == this.f5191) {
            this.f5191 = null;
        }
    }

    @Override // l.AbstractC15711, l.AbstractC6537
    /* JADX INFO: renamed from: ۘ */
    public final void mo4104() {
        this.f5193 = false;
        this.f5192 = false;
        super.mo4104();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // l.AbstractC1805
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo4268(AbstractC16511 abstractC16511) {
        long j;
        C5395 c5395M14958;
        C15274 c15274M36575;
        C5395 c5395M14959;
        if (this.f5193) {
            this.f5196 = this.f5196.m14961(abstractC16511);
            C2572 c2572 = this.f5191;
            if (c2572 != null) {
                m4266(c2572.m8022());
            }
        } else if (abstractC16511.m38828()) {
            if (this.f5195) {
                c5395M14959 = this.f5196.m14961(abstractC16511);
            } else {
                c5395M14959 = C5395.m14958(abstractC16511, C0282.f1577, C5395.f18625);
            }
            this.f5196 = c5395M14959;
        } else {
            C0282 c0282 = this.f5198;
            abstractC16511.m38827(0, c0282);
            long j2 = c0282.f1582;
            Object obj = c0282.f1591;
            C2572 c2573 = this.f5191;
            if (c2573 != null) {
                long jM8027 = c2573.m8027();
                C5395 c5395 = this.f5196;
                Object obj2 = this.f5191.f10136.f49778;
                C20039 c20039 = this.f5197;
                c5395.mo38826(obj2, c20039);
                long j3 = c20039.f64171 + jM8027;
                this.f5196.mo14810(0, c0282, 0L);
                if (j3 != c0282.f1582) {
                    j = j3;
                } else {
                    j = j2;
                }
            } else {
                j = j2;
            }
            Pair pairM38824 = abstractC16511.m38824(this.f5198, this.f5197, 0, j);
            Object obj3 = pairM38824.first;
            long jLongValue = ((Long) pairM38824.second).longValue();
            if (this.f5195) {
                c5395M14958 = this.f5196.m14961(abstractC16511);
            } else {
                c5395M14958 = C5395.m14958(abstractC16511, obj, obj3);
            }
            this.f5196 = c5395M14958;
            C2572 c2574 = this.f5191;
            if (c2574 != null && m4266(jLongValue)) {
                C15274 c15274 = c2574.f10136;
                Object obj4 = c15274.f49778;
                if (this.f5196.f18627 != null && obj4.equals(C5395.f18625)) {
                    obj4 = this.f5196.f18627;
                }
                c15274M36575 = c15274.m36575(obj4);
            }
            this.f5195 = true;
            this.f5193 = true;
            m17759(this.f5196);
            if (c15274M36575 != null) {
                C2572 c2575 = this.f5191;
                c2575.getClass();
                c2575.m8024(c15274M36575);
            }
        }
        c15274M36575 = null;
        this.f5195 = true;
        this.f5193 = true;
        m17759(this.f5196);
        if (c15274M36575 != null) {
            C2572 c2576 = this.f5191;
            c2576.getClass();
            c2576.m8024(c15274M36575);
        }
    }

    @Override // l.AbstractC1805
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15274 mo4267(C15274 c15274) {
        Object obj = c15274.f49778;
        if (this.f5196.f18627 != null && this.f5196.f18627.equals(obj)) {
            obj = C5395.f18625;
        }
        return c15274.m36575(obj);
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m4266(long j) {
        C2572 c2572 = this.f5191;
        int iMo14959 = this.f5196.mo14959(c2572.f10136.f49778);
        if (iMo14959 == -1) {
            return false;
        }
        C5395 c5395 = this.f5196;
        C20039 c20039 = this.f5197;
        c5395.mo5920(iMo14959, c20039, false);
        long j2 = c20039.f64173;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c2572.m8026(j);
        return true;
    }
}
