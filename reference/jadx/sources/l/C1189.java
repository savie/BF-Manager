package l;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֨۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1189 extends C17671 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f4336;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f4337;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7901 f4338;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0443 f4339;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f4340;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22367 f4341;

    @Override // l.C17671
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo4380() {
        return true;
    }

    public C1189(AbstractC11629 abstractC11629, C0443 c0443) {
        super(abstractC11629, abstractC11629.mo6669(), c0443.f2021, c0443);
        this.f4339 = c0443;
    }

    @Override // l.C17671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5783 mo4371(boolean z) {
        return new C5783(z, true);
    }

    @Override // l.C17671
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo4378(C5783 c5783) {
        if (this.f4341 == null) {
            this.f4341 = new C22367();
        }
        return this.f4341.m50443(m41340(), c5783);
    }

    @Override // l.C17671
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BitSet mo4379(C5783 c5783) {
        return c5783.m16887();
    }

    @Override // l.C17671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo4368(int i, C3523 c3523, C7998 c7998) {
        C10137 c10137;
        int iM29200;
        int iM29212;
        int i2;
        int iM29215;
        C7155.m19727();
        C0443 c0443 = this.f4339;
        int i3 = c0443.f2016;
        AbstractC0540 abstractC0540 = this.f58073;
        if (i != i3 || !(c7998 instanceof C17047) || !((AbstractC11629) abstractC0540).m29206()) {
            if (i == c0443.f2019 && (c7998 instanceof C18539)) {
                int iMo11537 = c3523.mo11537(1);
                if (iMo11537 != 93) {
                    if (iMo11537 != -1 && ((AbstractC11629) abstractC0540).m29210()) {
                        return 3;
                    }
                    if (i == c0443.f2014) {
                    }
                    if (i != c0443.f2017) {
                    }
                    c10137 = c0443.f2020;
                    if (c10137 == null) {
                    }
                    if (i != c0443.f2024) {
                    }
                    if (c0443.f2022 == 0) {
                        c0443.m2261();
                    }
                    c0443.f2022++;
                    return m4367(i, c3523, c7998);
                }
            } else if (i == c0443.f2014 || !(c7998 instanceof C10334) || c3523.mo11537(1) != 91) {
                if (i != c0443.f2017 && (c7998 instanceof C22883) && (iM29215 = ((AbstractC11629) abstractC0540).m29215()) != 0) {
                    return iM29215;
                }
                c10137 = c0443.f2020;
                if (c10137 == null && i == c10137.f32434 && (c7998 instanceof C6475) && (iM29212 = ((AbstractC11629) abstractC0540).m29212()) >= 0 && (i2 = c10137.f32433[iM29212]) != 0) {
                    return i2;
                }
                if (i != c0443.f2024 && (c7998 instanceof C19899) && !(c7998.f9157 instanceof C14809) && (iM29200 = ((AbstractC11629) abstractC0540).m29200()) != 0) {
                    return iM29200;
                }
                if (c0443.f2022 == 0 && (c0443.f2023 >= 65536 || c0443.m18318() >= 65536)) {
                    c0443.m2261();
                }
                c0443.f2022++;
                try {
                    return m4367(i, c3523, c7998);
                } finally {
                    c0443.f2022--;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m4367(int i, C3523 c3523, C7998 c7998) {
        this.f4336 = c3523.index();
        this.f4340 = 0;
        this.f4337 = 0;
        if (!this.f4339.f2015[i]) {
            try {
                return super.mo4368(i, c3523, c7998);
            } catch (C19088 unused) {
                if (this.f58067[i].f81862 == null) {
                    this.f4339.f2015[i] = true;
                }
            }
        }
        int iMo11529 = c3523.mo11529();
        this.f58071 = c3523;
        this.f58069 = this.f4336;
        this.f58070 = c7998;
        this.f4340 = 0;
        this.f4337 = 0;
        C25351 c25351 = this.f58067[i];
        try {
            return mo4369(c25351, (C16399) null, m41336((AbstractC17715) c25351.f81858, c7998, true), c3523, this.f4336, c7998);
        } finally {
            c3523.mo11530(this.f4336);
            c3523.mo11533(iMo11529);
            this.f58066 = null;
        }
    }

    @Override // l.C17671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5783 mo4370(C5783 c5783, int i, boolean z) {
        if (z) {
            this.f4340 = 0;
            this.f58066 = null;
        }
        return super.mo4370(c5783, i, z);
    }

    @Override // l.C17671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16399 mo4373(int i, C16399 c16399) {
        C0443 c0443 = this.f4339;
        BitSet bitSet = (BitSet) c0443.f2018.get(c16399);
        if (bitSet != null && bitSet.get(i + 1)) {
            throw C19088.f61804;
        }
        if (this.f58071.index() - this.f4336 < 128) {
            return super.mo4373(i, c16399);
        }
        ((BitSet) C11392.computeIfAbsent(c0443.f2018, c16399, new C19297(3))).set(i + 1);
        throw C19088.f61804;
    }

    @Override // l.C17671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16399 mo4375(C25351 c25351, C16399 c16399, int i) {
        try {
            return super.mo4375(c25351, c16399, i);
        } catch (C19088 unused) {
            ((BitSet) C11392.computeIfAbsent(this.f4339.f2018, c16399, new C19297(3))).set(i + 1);
            throw C19088.f61804;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[SYNTHETIC] */
    @Override // l.C17671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo4369(C25351 c25351, C16399 c16399, C5783 c5783, C3523 c3523, int i, C7998 c7998) {
        int i2;
        int iM35335;
        c3523.mo11530(i);
        while (true) {
            int iMo11537 = c3523.mo11537(1);
            C5783 c5783Mo4370 = mo4370(c5783, iMo11537, true);
            if (c5783Mo4370 == null) {
                C18439 c18439M41341 = m41341(i, c3523, c7998);
                c3523.mo11530(i);
                int iM41332 = m41332(c5783, c7998);
                if (iM41332 != 0) {
                    return iM41332;
                }
                throw c18439M41341;
            }
            int iM41330 = C17671.m41330(c5783Mo4370);
            c5783Mo4370.f19858 = iM41330;
            if (iM41330 != 0) {
                m41339(c25351, iM41330, c5783Mo4370, i, c3523.index());
                return c5783Mo4370.f19858;
            }
            boolean z = m41340() == EnumC14687.LL_EXACT_AMBIG_DETECTION;
            if (!z) {
                if (this.f4338 == null) {
                    this.f4338 = new C7901();
                }
                iM35335 = this.f4338.m21440(c5783Mo4370);
            } else {
                Collection collectionM35327 = EnumC14687.m35327(c5783Mo4370);
                if (EnumC14687.m35321(collectionM35327) && EnumC14687.m35334(collectionM35327)) {
                    iM35335 = EnumC14687.m35335(collectionM35327);
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    m41338(c25351, i, c3523.index(), z, c5783Mo4370.m16887(), c5783Mo4370);
                    return i2;
                }
                if (iMo11537 != -1) {
                    c3523.mo11538();
                }
                c5783 = c5783Mo4370;
            }
            i2 = iM35335;
            if (i2 != 0) {
                m41338(c25351, i, c3523.index(), z, c5783Mo4370.m16887(), c5783Mo4370);
                return i2;
            }
            if (iMo11537 != -1) {
                c3523.mo11538();
            }
            c5783 = c5783Mo4370;
        }
    }

    @Override // l.C17671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4376(C22937 c22937, C5783 c5783, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        m4366(c5783, hashSet, z2);
        super.mo4376(c22937, c5783, hashSet, z, z2, i, z3);
    }

    @Override // l.C17671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4377(C22937 c22937, AbstractC17715 abstractC17715, C5783 c5783, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        m4366(c5783, hashSet, z2);
        super.mo4377(c22937, abstractC17715, c5783, hashSet, z, z2, i, z3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4366(C5783 c5783, HashSet hashSet, boolean z) {
        int i = this.f4337 + 1;
        this.f4337 = i;
        if ((i & 255) == 0) {
            C7155.m19727();
        }
        if (!z && this.f4337 > 4096) {
            throw C19088.f61804;
        }
        if (z) {
            int i2 = this.f4340 + 1;
            this.f4340 = i2;
            if (i2 > 65536 || c5783.f19856.size() >= 4096 || hashSet.size() >= 4096) {
                throw new IllegalArgumentException("Parser prediction exceeds formatter limit");
            }
        }
    }

    @Override // l.AbstractC16969
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12450 mo4372(AbstractC12450 abstractC12450) {
        AbstractC12450 abstractC12450M18319;
        if (abstractC12450.mo30922()) {
            return abstractC12450;
        }
        synchronized (this.f4339) {
            abstractC12450M18319 = this.f4339.m18319(abstractC12450);
            if (abstractC12450M18319 == null) {
                abstractC12450M18319 = super.mo4372(abstractC12450);
            }
        }
        return abstractC12450M18319;
    }

    @Override // l.C17671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16399 mo4374(C25351 c25351, C16399 c16399) {
        HashMap map = c25351.f81860;
        int size = map.size();
        C16399 c16399Mo4374 = super.mo4374(c25351, c16399);
        if (map.size() != size) {
            C0443 c0443 = this.f4339;
            c0443.f2023 = c16399Mo4374.f53210.f19856.size() + c0443.f2023;
        }
        return c16399Mo4374;
    }
}
