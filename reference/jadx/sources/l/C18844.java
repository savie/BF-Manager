package l;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ᩳۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 68QN */
/* JADX INFO: loaded from: classes5.dex */
public final class C18844 extends AbstractC12305 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f61211;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f61212;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C0199 f61213;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f61214;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C11328 f61215;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean f61216;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C1634 f61217;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C18098 f61218;

    public C18844(InterfaceC13622 interfaceC13622, boolean z) {
        super(interfaceC13622);
        this.f61216 = z && interfaceC13622.mo24731();
        this.f61215 = new C11328();
        this.f61217 = new C1634();
        AbstractC24755 abstractC24755Mo24736 = interfaceC13622.mo24736();
        if (abstractC24755Mo24736 != null) {
            this.f61213 = C0199.m1587(abstractC24755Mo24736, (Object) null, (Object) null);
            this.f61212 = true;
        } else {
            this.f61213 = C0199.m1586(interfaceC13622.mo30717());
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 m43739() {
        return this.f61213;
    }

    @Override // l.AbstractC12305, l.AbstractC9395, l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final void mo24727(C14902 c14902) {
        if (this.f61212) {
            this.f61213 = this.f61213.m1590((AbstractC24755) new C23494(this.f61213.f21004, c14902));
        } else {
            this.f61213 = C0199.m1586(c14902);
        }
        this.f39569.mo24727(c14902);
    }

    @Override // l.AbstractC12305
    /* JADX INFO: renamed from: ᩻ */
    public final void mo30721() {
        if (this.f61216) {
            return;
        }
        this.f61214 = true;
        m30719();
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final C18098 mo33371(C8402 c8402, InterfaceC13314 interfaceC13314, long j) {
        C18098 c18098 = new C18098(c8402, interfaceC13314, j);
        c18098.m42208(this.f39569);
        if (this.f61211) {
            Object obj = c8402.f27520;
            if (this.f61213.f1336 != null && obj.equals(C0199.f1335)) {
                obj = this.f61213.f1336;
            }
            c18098.m42207(c8402.m22580(obj));
            return c18098;
        }
        this.f61218 = c18098;
        if (!this.f61214) {
            this.f61214 = true;
            m30719();
        }
        return c18098;
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final void mo33372(InterfaceC9147 interfaceC9147) {
        ((C18098) interfaceC9147).m42206();
        if (interfaceC9147 == this.f61218) {
            this.f61218 = null;
        }
    }

    @Override // l.AbstractC5420, l.AbstractC9395
    /* JADX INFO: renamed from: ֫ */
    public final void mo16145() {
        this.f61211 = false;
        this.f61214 = false;
        super.mo16145();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // l.AbstractC12305
    /* JADX INFO: renamed from: ᩷ */
    public final void mo30720(AbstractC24755 abstractC24755) {
        long j;
        C0199 c0199M1587;
        C8402 c8402M22580;
        C0199 c0199M1588;
        if (this.f61211) {
            this.f61213 = this.f61213.m1590(abstractC24755);
            C18098 c18098 = this.f61218;
            if (c18098 != null) {
                m43738(c18098.m42211());
            }
        } else if (abstractC24755.m55264()) {
            if (this.f61212) {
                c0199M1588 = this.f61213.m1590(abstractC24755);
            } else {
                c0199M1588 = C0199.m1587(abstractC24755, C11328.f35682, C0199.f1335);
            }
            this.f61213 = c0199M1588;
        } else {
            C11328 c11328 = this.f61215;
            abstractC24755.m55263(0, c11328);
            long j2 = c11328.f35686;
            Object obj = c11328.f35698;
            C18098 c18099 = this.f61218;
            if (c18099 != null) {
                long jM42210 = c18099.m42210();
                C0199 c0199 = this.f61213;
                Object obj2 = this.f61218.f59231.f27520;
                C1634 c1634 = this.f61217;
                c0199.mo15535(obj2, c1634);
                long j3 = c1634.f5659 + jM42210;
                this.f61213.mo1592(0, c11328, 0L);
                if (j3 != c11328.f35686) {
                    j = j3;
                } else {
                    j = j2;
                }
            } else {
                j = j2;
            }
            Pair pairM55261 = abstractC24755.m55261(this.f61215, this.f61217, 0, j);
            Object obj3 = pairM55261.first;
            long jLongValue = ((Long) pairM55261.second).longValue();
            if (this.f61212) {
                c0199M1587 = this.f61213.m1590(abstractC24755);
            } else {
                c0199M1587 = C0199.m1587(abstractC24755, obj, obj3);
            }
            this.f61213 = c0199M1587;
            C18098 c180910 = this.f61218;
            if (c180910 != null && m43738(jLongValue)) {
                C8402 c8402 = c180910.f59231;
                Object obj4 = c8402.f27520;
                if (this.f61213.f1336 != null && obj4.equals(C0199.f1335)) {
                    obj4 = this.f61213.f1336;
                }
                c8402M22580 = c8402.m22580(obj4);
            }
            this.f61212 = true;
            this.f61211 = true;
            m24728(this.f61213);
            if (c8402M22580 != null) {
                C18098 c180911 = this.f61218;
                c180911.getClass();
                c180911.m42207(c8402M22580);
            }
        }
        c8402M22580 = null;
        this.f61212 = true;
        this.f61211 = true;
        m24728(this.f61213);
        if (c8402M22580 != null) {
            C18098 c180912 = this.f61218;
            c180912.getClass();
            c180912.m42207(c8402M22580);
        }
    }

    @Override // l.AbstractC12305
    /* JADX INFO: renamed from: ۤ */
    public final C8402 mo30718(C8402 c8402) {
        Object obj = c8402.f27520;
        if (this.f61213.f1336 != null && this.f61213.f1336.equals(obj)) {
            obj = C0199.f1335;
        }
        return c8402.m22580(obj);
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m43738(long j) {
        C18098 c18098 = this.f61218;
        int iMo1588 = this.f61213.mo1588(c18098.f59231.f27520);
        if (iMo1588 == -1) {
            return false;
        }
        C0199 c0199 = this.f61213;
        C1634 c1634 = this.f61217;
        c0199.mo1591(iMo1588, c1634, false);
        long j2 = c1634.f5660;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c18098.m42209(j);
        return true;
    }
}
