package l;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩺ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22801 extends C1499 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f74192;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f74193;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C12923 f74194;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20901 f74195;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f74196;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0927 f74197;

    @Override // l.C1499
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo5182() {
        return true;
    }

    public C22801(AbstractC12548 abstractC12548, C0927 c0927) {
        super(abstractC12548, abstractC12548.mo5091(), c0927.f3719, c0927);
        this.f74197 = c0927;
    }

    @Override // l.C1499
    /* JADX INFO: renamed from: ۙ */
    public final C17643 mo5171(boolean z) {
        return new C17643(z, true);
    }

    @Override // l.C1499
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo5178(C17643 c17643) {
        if (this.f74195 == null) {
            this.f74195 = new C20901();
        }
        return this.f74195.m47009(m5177(), c17643);
    }

    @Override // l.C1499
    /* JADX INFO: renamed from: ܰ */
    public final BitSet mo5179(C17643 c17643) {
        return c17643.m41117();
    }

    @Override // l.C1499
    /* JADX INFO: renamed from: ۙ */
    public final int mo5159(int i, C4943 c4943, C23289 c23289) {
        C6572 c6572;
        int iM31230;
        int iM31223;
        int i2;
        int iM31237;
        C18567.m42975();
        C0927 c0927 = this.f74197;
        int i3 = c0927.f3721;
        AbstractC7060 abstractC7060 = this.f6061;
        if (i != i3 || !(c23289 instanceof C6177) || !((AbstractC12548) abstractC7060).m31229()) {
            if (i == c0927.f3725 && (c23289 instanceof C22281)) {
                int iMo11332 = c4943.mo11332(1);
                if (iMo11332 != 93) {
                    if (iMo11332 != -1 && ((AbstractC12548) abstractC7060).m31228()) {
                        return 3;
                    }
                    if (i == c0927.f3718) {
                    }
                    if (i != c0927.f3720) {
                    }
                    c6572 = c0927.f3724;
                    if (c6572 == null) {
                    }
                    if (i != c0927.f3726) {
                    }
                    if (c0927.f3723 == 0) {
                        c0927.m3678();
                    }
                    c0927.f3723++;
                    return m50461(i, c4943, c23289);
                }
            } else if (i == c0927.f3718 || !(c23289 instanceof C6758) || c4943.mo11332(1) != 91) {
                if (i != c0927.f3720 && (c23289 instanceof C7464) && (iM31237 = ((AbstractC12548) abstractC7060).m31237()) != 0) {
                    return iM31237;
                }
                c6572 = c0927.f3724;
                if (c6572 == null && i == c6572.f22128 && (c23289 instanceof C4786) && (iM31223 = ((AbstractC12548) abstractC7060).m31223()) >= 0 && (i2 = c6572.f22127[iM31223]) != 0) {
                    return i2;
                }
                if (i != c0927.f3726 && (c23289 instanceof C20870) && !(c23289.f29378 instanceof C2524) && (iM31230 = ((AbstractC12548) abstractC7060).m31230()) != 0) {
                    return iM31230;
                }
                if (c0927.f3723 == 0 && (c0927.f3717 >= 65536 || c0927.m7961() >= 65536)) {
                    c0927.m3678();
                }
                c0927.f3723++;
                try {
                    return m50461(i, c4943, c23289);
                } finally {
                    c0927.f3723--;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m50461(int i, C4943 c4943, C23289 c23289) {
        this.f74192 = c4943.index();
        this.f74196 = 0;
        this.f74193 = 0;
        if (!this.f74197.f3722[i]) {
            try {
                return super.mo5159(i, c4943, c23289);
            } catch (C3749 unused) {
                if (this.f6059[i].f76772 == null) {
                    this.f74197.f3722[i] = true;
                }
            }
        }
        int iMo11328 = c4943.mo11328();
        this.f6057 = c4943;
        this.f6054 = this.f74192;
        this.f6060 = c23289;
        this.f74196 = 0;
        this.f74193 = 0;
        C23724 c23724 = this.f6059[i];
        try {
            return mo5162(c23724, (C9613) null, m5168((AbstractC2120) c23724.f76773, c23289, true), c4943, this.f74192, c23289);
        } finally {
            c4943.mo11329(this.f74192);
            c4943.mo11331(iMo11328);
            this.f6056 = null;
        }
    }

    @Override // l.C1499
    /* JADX INFO: renamed from: ۙ */
    public final C17643 mo5170(C17643 c17643, int i, boolean z) {
        if (z) {
            this.f74196 = 0;
            this.f6056 = null;
        }
        return super.mo5170(c17643, i, z);
    }

    @Override // l.C1499
    /* JADX INFO: renamed from: ۙ */
    public final C9613 mo5164(int i, C9613 c9613) {
        C0927 c0927 = this.f74197;
        BitSet bitSet = (BitSet) c0927.f3716.get(c9613);
        if (bitSet != null && bitSet.get(i + 1)) {
            throw C3749.f13594;
        }
        if (this.f6057.index() - this.f74192 < 128) {
            return super.mo5164(i, c9613);
        }
        ((BitSet) C9735.computeIfAbsent(c0927.f3716, c9613, new C16485(4))).set(i + 1);
        throw C3749.f13594;
    }

    @Override // l.C1499
    /* JADX INFO: renamed from: ۙ */
    public final C9613 mo5166(C23724 c23724, C9613 c9613, int i) {
        try {
            return super.mo5166(c23724, c9613, i);
        } catch (C3749 unused) {
            ((BitSet) C9735.computeIfAbsent(this.f74197.f3716, c9613, new C16485(4))).set(i + 1);
            throw C3749.f13594;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[SYNTHETIC] */
    @Override // l.C1499
    /* JADX INFO: renamed from: ۙ */
    public final int mo5162(C23724 c23724, C9613 c9613, C17643 c17643, C4943 c4943, int i, C23289 c23289) {
        int i2;
        int iM4177;
        c4943.mo11329(i);
        while (true) {
            int iMo11332 = c4943.mo11332(1);
            C17643 c17643Mo5170 = mo5170(c17643, iMo11332, true);
            if (c17643Mo5170 == null) {
                C4237 c4237M5180 = m5180(i, c4943, c23289);
                c4943.mo11329(i);
                int iM5160 = m5160(c17643, c23289);
                if (iM5160 != 0) {
                    return iM5160;
                }
                throw c4237M5180;
            }
            int iM5158 = C1499.m5158(c17643Mo5170);
            c17643Mo5170.f56082 = iM5158;
            if (iM5158 != 0) {
                m5176(c23724, iM5158, c17643Mo5170, i, c4943.index());
                return c17643Mo5170.f56082;
            }
            boolean z = m5177() == EnumC1144.LL_EXACT_AMBIG_DETECTION;
            if (!z) {
                if (this.f74194 == null) {
                    this.f74194 = new C12923();
                }
                iM4177 = this.f74194.m32008(c17643Mo5170);
            } else {
                Collection collectionM4186 = EnumC1144.m4186(c17643Mo5170);
                if (EnumC1144.m4179(collectionM4186) && EnumC1144.m4189(collectionM4186)) {
                    iM4177 = EnumC1144.m4177(collectionM4186);
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    m5175(c23724, i, c4943.index(), z, c17643Mo5170.m41117(), c17643Mo5170);
                    return i2;
                }
                if (iMo11332 != -1) {
                    c4943.mo11333();
                }
                c17643 = c17643Mo5170;
            }
            i2 = iM4177;
            if (i2 != 0) {
                m5175(c23724, i, c4943.index(), z, c17643Mo5170.m41117(), c17643Mo5170);
                return i2;
            }
            if (iMo11332 != -1) {
                c4943.mo11333();
            }
            c17643 = c17643Mo5170;
        }
    }

    @Override // l.C1499
    /* JADX INFO: renamed from: ۙ */
    public final void mo5174(C20466 c20466, C17643 c17643, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        m50460(c17643, hashSet, z2);
        super.mo5174(c20466, c17643, hashSet, z, z2, i, z3);
    }

    @Override // l.C1499
    /* JADX INFO: renamed from: ۙ */
    public final void mo5173(C20466 c20466, AbstractC2120 abstractC2120, C17643 c17643, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        m50460(c17643, hashSet, z2);
        super.mo5173(c20466, abstractC2120, c17643, hashSet, z, z2, i, z3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50460(C17643 c17643, HashSet hashSet, boolean z) {
        int i = this.f74193 + 1;
        this.f74193 = i;
        if ((i & 255) == 0) {
            C18567.m42975();
        }
        if (!z && this.f74193 > 4096) {
            throw C3749.f13594;
        }
        if (z) {
            int i2 = this.f74196 + 1;
            this.f74196 = i2;
            if (i2 > 65536 || c17643.f56084.size() >= 4096 || hashSet.size() >= 4096) {
                throw new IllegalArgumentException("Parser prediction exceeds formatter limit");
            }
        }
    }

    @Override // l.AbstractC14822
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11729 mo35507(AbstractC11729 abstractC11729) {
        AbstractC11729 abstractC11729M7962;
        if (abstractC11729.mo10719()) {
            return abstractC11729;
        }
        synchronized (this.f74197) {
            abstractC11729M7962 = this.f74197.m7962(abstractC11729);
            if (abstractC11729M7962 == null) {
                abstractC11729M7962 = super.mo35507(abstractC11729);
            }
        }
        return abstractC11729M7962;
    }

    @Override // l.C1499
    /* JADX INFO: renamed from: ۙ */
    public final C9613 mo5165(C23724 c23724, C9613 c9613) {
        HashMap map = c23724.f76774;
        int size = map.size();
        C9613 c9613Mo5165 = super.mo5165(c23724, c9613);
        if (map.size() != size) {
            C0927 c0927 = this.f74197;
            c0927.f3717 = c9613Mo5165.f32382.f56084.size() + c0927.f3717;
        }
        return c9613Mo5165;
    }
}
