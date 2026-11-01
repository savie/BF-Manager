package l;

import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۚۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: J416 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5286 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C16576 f18290 = new C16576();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3836 f18291;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2463 f18292;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10164 f18293;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f18294;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23942 f18295;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23800 f18296;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5286 m14576(C12343 c12343) {
        C16576 c16576 = f18290;
        C5286 c5286 = (C5286) c12343.m30656(c16576);
        if (c5286 != null) {
            return c5286;
        }
        C5286 c5287 = new C5286();
        c5287.f18294 = -1;
        c5287.f18292 = new C2463(c5287);
        c12343.m30659(c16576, c5287);
        c5287.f18294 = -1;
        c5287.f18293 = null;
        c5287.f18295 = C23942.m52776(c12343);
        c5287.f18291 = C3836.m11131(c12343);
        c5287.f18296 = C23800.m52336(c12343);
        return c5287;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5286 m14592(C10164 c10164) {
        C23942 c23942 = this.f18295;
        C23800 c23800 = this.f18296;
        C3836 c3836 = this.f18291;
        C5286 c5286 = new C5286();
        c5286.f18292 = new C2463(c5286);
        c5286.f18294 = 0;
        c5286.f18293 = c10164;
        c5286.f18295 = c23942;
        c5286.f18296 = c23800;
        c5286.f18291 = c3836;
        return c5286;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14628(int i) {
        this.f18294 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14629(InterfaceC12260 interfaceC12260) {
        this.f18294 = interfaceC12260 == null ? -1 : interfaceC12260.mo9279();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10164 m14579(C21825 c21825) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            final AbstractC8774 abstractC8774 = (AbstractC8774) it.next();
            C6171.m17177((abstractC8774 instanceof C8753) || (abstractC8774 instanceof C7672) || (abstractC8774 instanceof C14023) || (abstractC8774 instanceof C18255) || (abstractC8774 instanceof C23900) || (abstractC8774 instanceof C12281) || ((abstractC8774 instanceof C10870) && (((C10870) abstractC8774).f36960 instanceof C12281)), new Supplier() { // from class: l.ۙۤ۟
                @Override // java.util.function.Supplier
                public final Object get() {
                    return abstractC8774.getClass().getSimpleName();
                }
            });
        }
        C10164 c10164 = new C10164();
        c10164.f34726 = null;
        c10164.f34729 = null;
        c10164.f34724 = null;
        c10164.f34727 = c21825;
        c10164.f30189 = this.f18294;
        return c10164;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8753 m14601(C21783 c21783, AbstractC11242 abstractC11242, C21825 c21825, AbstractC5930 abstractC5930, C21825 c21826, C21825 c21827) {
        return m14602(c21783, abstractC11242, c21825, abstractC5930, c21826, C21825.m48588(), c21827);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8753 m14602(C21783 c21783, AbstractC11242 abstractC11242, C21825 c21825, AbstractC5930 abstractC5930, C21825 c21826, C21825 c21827, C21825 c21828) {
        C8753 c8753 = new C8753();
        c8753.f30089 = c21783;
        c8753.f30093 = abstractC11242;
        c8753.f30088 = c21825;
        c8753.f30092 = abstractC5930;
        c8753.f30087 = c21826;
        c8753.f30091 = c21827;
        c8753.f30090 = c21828;
        c8753.f30086 = null;
        c8753.f30189 = this.f18294;
        return c8753;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23195 m14624(C21783 c21783, AbstractC11242 abstractC11242, AbstractC5930 abstractC5930, C21825 c21825, C6656 c6656, C21825 c21826, C21825 c21827, C21452 c21452, AbstractC5930 abstractC5931) {
        C23195 c23195 = new C23195(c21783, abstractC11242, abstractC5930, c21825, c6656, c21826, c21827, c21452, abstractC5931, null);
        c23195.f30189 = this.f18294;
        return c23195;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6656 m14596(C21783 c21783, AbstractC11242 abstractC11242, AbstractC5930 abstractC5930, AbstractC5930 abstractC5931) {
        C6656 c6656 = new C6656(c21783, abstractC11242, abstractC5930, abstractC5931, null, false);
        c6656.f30189 = this.f18294;
        return c6656;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6656 m14597(C21783 c21783, AbstractC11242 abstractC11242, AbstractC5930 abstractC5930, AbstractC5930 abstractC5931, boolean z) {
        C6656 c6656 = new C6656(c21783, abstractC11242, abstractC5930, abstractC5931, null, z);
        c6656.f30189 = this.f18294;
        return c6656;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6656 m14595(C21783 c21783, AbstractC5930 abstractC5930, AbstractC5930 abstractC5931) {
        C6656 c6656 = new C6656(c21783, null, abstractC5931, null, null, false);
        c6656.f22482 = abstractC5930;
        if (abstractC5930.m22847(EnumC18651.f60465)) {
            c6656.f22478 = ((C3107) abstractC5930).f11715;
        } else {
            c6656.f22478 = ((C23570) abstractC5930).f76356;
        }
        c6656.f30189 = this.f18294;
        return c6656;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23900 m14638() {
        C23900 c23900 = new C23900();
        c23900.f30189 = this.f18294;
        return c23900;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21452 m14617(long j, C21825 c21825) {
        C21452 c21452 = new C21452();
        c21452.f69738 = -1;
        c21452.f69737 = c21825;
        c21452.f69739 = j;
        c21452.f30189 = this.f18294;
        return c21452;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14398 m14607(C21825 c21825, AbstractC5930 abstractC5930, C21825 c21826, AbstractC14728 abstractC14728) {
        C14398 c14398 = new C14398();
        c14398.f47204 = c21825;
        c14398.f47207 = abstractC5930;
        c14398.f47205 = c21826;
        c14398.f47206 = abstractC14728;
        c14398.f30189 = this.f18294;
        return c14398;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2026 m14577(AbstractC5930 abstractC5930, C21825 c21825) {
        C2026 c2026 = new C2026();
        c2026.f7569 = -1;
        c2026.f7570 = abstractC5930;
        c2026.f7568 = c21825;
        c2026.f30189 = this.f18294;
        return c2026;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18630 m14615(EnumC13425 enumC13425, C21825 c21825, C21825 c21826, AbstractC8774 abstractC8774) {
        C18630 c18630 = new C18630(enumC13425, c21825, c21826, abstractC8774);
        c18630.f30189 = this.f18294;
        return c18630;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9789 m14631(AbstractC5930 abstractC5930, C21825 c21825) {
        C9789 c9789 = new C9789();
        c9789.f33502 = -1;
        c9789.f33504 = abstractC5930;
        c9789.f33505 = c21825;
        c9789.f30189 = this.f18294;
        return c9789;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13713 m14606(C21825 c21825, C21452 c21452, C21825 c21826, C21452 c21453) {
        C13713 c13713 = new C13713();
        c13713.f45220 = c21452;
        c13713.f45221 = c21826;
        c13713.f45218 = c21453;
        c13713.f45222 = c21825;
        c13713.f30189 = this.f18294;
        return c13713;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19336 m14616(C6656 c6656, C21452 c21452) {
        C19336 c19336 = new C19336();
        c19336.f62363 = c6656;
        c19336.f62362 = c21452;
        c19336.f30189 = this.f18294;
        return c19336;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7341 m14598(AbstractC5930 abstractC5930, AbstractC5930 abstractC5931, AbstractC5930 abstractC5932) {
        C7341 c7341 = new C7341();
        c7341.f24394 = abstractC5930;
        c7341.f24393 = abstractC5931;
        c7341.f24392 = abstractC5932;
        c7341.f30189 = this.f18294;
        return c7341;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4849 m14588(AbstractC5930 abstractC5930, AbstractC14728 abstractC14728, AbstractC14728 abstractC14729) {
        C4849 c4849 = new C4849();
        c4849.f17076 = abstractC5930;
        c4849.f17075 = abstractC14728;
        c4849.f17077 = abstractC14729;
        c4849.f30189 = this.f18294;
        return c4849;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10870 m14642(AbstractC5930 abstractC5930) {
        C10870 c10870 = new C10870();
        c10870.f36960 = abstractC5930;
        c10870.f30189 = this.f18294;
        return c10870;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17924 m14612(AbstractC11242 abstractC11242) {
        C17924 c17924 = new C17924();
        c17924.f56926 = abstractC11242;
        c17924.f56927 = null;
        c17924.f30189 = this.f18294;
        return c17924;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21473 m14652(AbstractC5930 abstractC5930) {
        C21473 c21473 = new C21473();
        c21473.f69790 = abstractC5930;
        c21473.f69789 = null;
        c21473.f30189 = this.f18294;
        return c21473;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11200 m14635(AbstractC5930 abstractC5930) {
        C11200 c11200 = new C11200();
        c11200.f37914 = abstractC5930;
        c11200.f30189 = this.f18294;
        return c11200;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4539 m14578(AbstractC5930 abstractC5930) {
        C4539 c4539 = new C4539();
        c4539.f16146 = abstractC5930;
        c4539.f30189 = this.f18294;
        return c4539;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15434 m14610(AbstractC5930 abstractC5930, C21825 c21825, C21825 c21826) {
        C15434 c15434 = new C15434();
        if (c21825 == null) {
            c21825 = C21825.m48588();
        }
        c15434.f50297 = c21825;
        c15434.f50296 = abstractC5930;
        c15434.f50298 = c21826;
        c15434.f30189 = this.f18294;
        return c15434;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8378 m14600(AbstractC5930 abstractC5930, C21825 c21825, AbstractC5930 abstractC5931, C21825 c21826, C8753 c8753, boolean z) {
        C8378 c8378;
        if (z) {
            c8378 = new C13754(abstractC5930, c21825, abstractC5931, c21826, c8753);
        } else {
            c8378 = new C8378(abstractC5930, c21825, abstractC5931, c21826, c8753);
        }
        c8378.f30189 = this.f18294;
        return c8378;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18961 m14647(AbstractC5930 abstractC5930, C21825 c21825, C21825 c21826) {
        C18961 c18961 = new C18961();
        c18961.f61402 = abstractC5930;
        c18961.f61398 = c21825;
        c18961.f61400 = C21825.m48588();
        c18961.f61401 = C21825.m48588();
        c18961.f61399 = c21826;
        c18961.f30189 = this.f18294;
        return c18961;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22489 m14650(AbstractC8774 abstractC8774, C21825 c21825) {
        C22489 c22489 = new C22489();
        c22489.f73409 = true;
        c22489.f73410 = c21825;
        c22489.f73408 = abstractC8774;
        if (c21825.isEmpty() || ((C6656) c21825.f70876).f22477 != null) {
            c22489.f73411 = EnumC5555.EXPLICIT;
        } else {
            c22489.f73411 = EnumC5555.IMPLICIT;
        }
        c22489.f30189 = this.f18294;
        return c22489;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3812 m14587(AbstractC5930 abstractC5930, AbstractC5930 abstractC5931) {
        C3812 c3812 = new C3812();
        c3812.f14145 = abstractC5930;
        c3812.f14146 = abstractC5931;
        c3812.f30189 = this.f18294;
        return c3812;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6635 m14593(EnumC18651 enumC18651, AbstractC8774 abstractC8774, AbstractC8774 abstractC8775) {
        C6635 c6635 = new C6635();
        c6635.f35956 = enumC18651;
        c6635.f22412 = (AbstractC5930) abstractC8774;
        c6635.f22413 = (AbstractC5930) abstractC8775;
        c6635.f35957 = null;
        c6635.f30189 = this.f18294;
        return c6635;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13007 m14605(EnumC18651 enumC18651, AbstractC5930 abstractC5930) {
        C13007 c13007 = new C13007();
        c13007.f35956 = enumC18651;
        c13007.f43378 = abstractC5930;
        c13007.f30189 = this.f18294;
        return c13007;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22864 m14622(EnumC18651 enumC18651, AbstractC5930 abstractC5930, AbstractC5930 abstractC5931) {
        C22864 c22864 = new C22864();
        c22864.f35956 = enumC18651;
        c22864.f74367 = abstractC5930;
        c22864.f74368 = abstractC5931;
        c22864.f35957 = null;
        c22864.f30189 = this.f18294;
        return c22864;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2422 m14583(AbstractC8774 abstractC8774, AbstractC5930 abstractC5930) {
        C2422 c2422 = new C2422();
        c2422.f9707 = abstractC8774;
        c2422.f9708 = abstractC5930;
        c2422.f30189 = this.f18294;
        return c2422;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15809 m14611() {
        C15809 c15809 = new C15809();
        c15809.f30189 = this.f18294;
        return c15809;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22158 m14649(AbstractC5930 abstractC5930, AbstractC5930 abstractC5931) {
        C22158 c22158 = new C22158(abstractC5930, abstractC5931);
        c22158.f30189 = this.f18294;
        return c22158;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23570 m14625(AbstractC5930 abstractC5930, AbstractC11242 abstractC11242) {
        C23570 c23570 = new C23570(abstractC5930, abstractC11242, null);
        c23570.f30189 = this.f18294;
        return c23570;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3107 m14639(AbstractC11242 abstractC11242) {
        C3107 c3107 = new C3107(abstractC11242, null);
        c3107.f30189 = this.f18294;
        return c3107;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1321 m14581(EnumC6617 enumC6617, Object obj) {
        C1321 c1321 = new C1321();
        c1321.f5611 = enumC6617;
        c1321.f5612 = obj;
        c1321.f30189 = this.f18294;
        return c1321;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12611 m14604(EnumC6617 enumC6617) {
        C12611 c12611 = new C12611();
        c12611.f42127 = enumC6617;
        c12611.f30189 = this.f18294;
        return c12611;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0990 m14630(AbstractC5930 abstractC5930) {
        C0990 c0990 = new C0990();
        c0990.f4638 = abstractC5930;
        c0990.f30189 = this.f18294;
        return c0990;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11596 m14651(AbstractC5930 abstractC5930, C21825 c21825) {
        C11596 c11596 = new C11596();
        c11596.f38963 = abstractC5930;
        c11596.f38962 = c21825;
        c11596.f30189 = this.f18294;
        return c11596;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15124 m14608(C8068 c8068, AbstractC8774 abstractC8774) {
        C15124 c15124 = new C15124();
        C6171.m17171(c8068);
        c15124.f49399 = c8068;
        c15124.f49398 = abstractC8774;
        c15124.f30189 = this.f18294;
        return c15124;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8068 m14599(EnumC15395 enumC15395) {
        C8068 c8068 = new C8068();
        c8068.f28284 = enumC15395;
        c8068.f30189 = this.f18294;
        return c8068;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5224 m14589(AbstractC8774 abstractC8774, C21825 c21825) {
        C5224 c5224 = new C5224(EnumC18651.f60516, abstractC8774, c21825);
        c5224.f30189 = this.f18294;
        return c5224;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5224 m14633(AbstractC8774 abstractC8774, C21825 c21825) {
        C5224 c5224 = new C5224(EnumC18651.f60508, abstractC8774, c21825);
        c5224.f30189 = this.f18294;
        return c5224;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21783 m14648(long j, C21825 c21825) {
        C21783 c21783 = new C21783();
        c21783.f70567 = j;
        c21783.f70566 = c21825;
        c21783.f30189 = ((j & (-4611677222334353921L)) == 0 && c21825.isEmpty()) ? -1 : this.f18294;
        return c21783;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21783 m14618(long j) {
        return m14648(j, C21825.m48588());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18255 m14614(C21783 c21783, EnumC13195 enumC13195, AbstractC5930 abstractC5930, C21825 c21825) {
        C18255 c18255 = new C18255(c21783, enumC13195, abstractC5930, c21825);
        c18255.f30189 = this.f18294;
        return c18255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2401 m14582(AbstractC5930 abstractC5930, C21825 c21825) {
        C2401 c2401 = new C2401();
        C6171.m17176(c21825 != null && c21825.m48595());
        c2401.f9658 = c21825;
        c2401.f9659 = abstractC5930;
        c2401.f30189 = this.f18294;
        return c2401;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12281 m14644() {
        return m14645(C21825.m48588());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12281 m14645(C21825 c21825) {
        C12281 c12281 = new C12281();
        c12281.f41061 = c21825;
        c12281.f30189 = this.f18294;
        return c12281;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17945 m14636(AbstractC5930 abstractC5930, C21825 c21825) {
        C17945 c17945 = new C17945(abstractC5930, c21825);
        c17945.f30189 = this.f18294;
        return c17945;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8753 m14603(C21783 c21783, C21825 c21825) {
        return m14601(c21783, this.f18295.f77594, C21825.m48588(), (AbstractC5930) null, C21825.m48588(), c21825);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17945 m14613(C6656 c6656, AbstractC5930 abstractC5930) {
        C17945 c17945 = new C17945(abstractC5930, C21825.of((Object) c6656));
        c17945.f30189 = this.f18294;
        return c17945;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3107 m14586(AbstractC23903 abstractC23903) {
        AbstractC11242 abstractC11242Mo50003 = abstractC23903.f77453;
        if (abstractC11242Mo50003 == this.f18295.f77594) {
            abstractC11242Mo50003 = abstractC23903.mo50003();
        }
        C3107 c3107 = new C3107(abstractC11242Mo50003, abstractC23903);
        c3107.f30189 = this.f18294;
        c3107.f30190 = abstractC23903.f77449;
        return c3107;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23570 m14626(AbstractC5930 abstractC5930, AbstractC23903 abstractC23903) {
        C23570 c23570 = new C23570(abstractC5930, abstractC23903.f77453, abstractC23903);
        c23570.f30189 = this.f18294;
        c23570.f30190 = abstractC23903.f77449;
        return c23570;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21825 m14637(C21825 c21825) {
        C19003 c19003 = new C19003();
        while (c21825.m48595()) {
            c19003.m43723(m14586((AbstractC23903) ((C6656) c21825.f70876).f22475));
            c21825 = c21825.f70877;
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3107 m14640(AbstractC16579 abstractC16579) {
        return m14586((AbstractC23903) new C6263(16L, this.f18295.f77533, abstractC16579, abstractC16579.f53222));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23570 m14627(AbstractC16579 abstractC16579) {
        return m14626(m14634(abstractC16579), new C6263(16L, this.f18295.f77533, abstractC16579, abstractC16579.f53222));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3107 m14585(C22492 c22492, AbstractC16579 abstractC16579) {
        return m14586((AbstractC23903) new C6263(16L, this.f18295.f77638, abstractC16579, c22492));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15434 m14646(AbstractC5930 abstractC5930, C21825 c21825) {
        C15434 c15434M14610 = m14610(abstractC5930, (C21825) null, c21825);
        c15434M14610.f30190 = abstractC5930.f30190.mo16235();
        return c15434M14610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15434 m14609(AbstractC5930 abstractC5930) {
        C15434 c15434M14610 = m14610(abstractC5930, (C21825) null, C21825.m48588());
        c15434M14610.f30190 = abstractC5930.f30190.mo16235();
        return c15434M14610;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m14634(AbstractC16579 abstractC16579) {
        AbstractC5930 abstractC5930;
        AbstractC5930 abstractC5930M14604;
        AbstractC5930 abstractC5930M14641;
        if (abstractC16579 == null) {
            return null;
        }
        switch (C11637.f39092[abstractC16579.mo1933().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                abstractC5930M14604 = m14604(abstractC16579.mo1933());
                break;
            case 10:
                abstractC5930M14604 = m14586((AbstractC23903) abstractC16579.f53222);
                break;
            case 11:
                C0350 c0350 = (C0350) abstractC16579;
                EnumC15395 enumC15395 = c0350.f1776;
                abstractC5930M14604 = m14608(m14599(enumC15395), (AbstractC8774) (enumC15395 != EnumC15395.UNBOUND ? m14634(c0350.f1774) : null));
                break;
            case 12:
                int i = C11637.f39093[abstractC16579.mo1931().ordinal()];
                if (i == 1) {
                    C19003 c19003 = new C19003();
                    Iterator it = ((C7406) abstractC16579).m19753().iterator();
                    while (it.hasNext()) {
                        c19003.m43723(m14634((AbstractC16579) it.next()));
                    }
                    C21825 c21825M43726 = c19003.m43726();
                    C1011 c1011 = new C1011();
                    c1011.f4699 = c21825M43726;
                    c1011.f30189 = this.f18294;
                    abstractC5930 = c1011;
                } else if (i == 2) {
                    C19003 c19004 = new C19003();
                    Iterator it2 = ((C23594) abstractC16579).m52021().iterator();
                    while (it2.hasNext()) {
                        c19004.m43723(m14634((AbstractC16579) it2.next()));
                    }
                    C21825 c21825M43727 = c19004.m43726();
                    C5245 c5245 = new C5245();
                    c5245.f18177 = c21825M43727;
                    c5245.f30189 = this.f18294;
                    abstractC5930 = c5245;
                } else {
                    AbstractC16579 abstractC16579Mo1934 = abstractC16579.mo1934();
                    if (abstractC16579Mo1934.m39001(EnumC6617.CLASS) && abstractC16579.f53222.f77448.f77452 == EnumC10477.f35865) {
                        abstractC5930M14641 = m14626(m14634(abstractC16579Mo1934), abstractC16579.f53222);
                    } else {
                        abstractC5930M14641 = m14641(abstractC16579.f53222);
                    }
                    abstractC5930M14604 = abstractC5930M14641;
                    if (!abstractC16579.mo1938().isEmpty()) {
                        abstractC5930M14604 = m14651(abstractC5930M14641, m14632(abstractC16579.mo1938()));
                    }
                }
                abstractC5930M14604 = abstractC5930;
                break;
            case 13:
                abstractC5930M14604 = m14630(m14634(this.f18296.m52416(abstractC16579)));
                break;
            case 14:
                abstractC5930M14604 = m14604(EnumC6617.ERROR);
                break;
            default:
                throw new AssertionError("unexpected type: " + abstractC16579);
        }
        return abstractC5930M14604.mo4719(abstractC16579);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21825 m14632(C21825 c21825) {
        C19003 c19003 = new C19003();
        while (c21825.m48595()) {
            c19003.m43723(m14634((AbstractC16579) c21825.f70876));
            c21825 = c21825.f70877;
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6656 m14594(C6263 c6263, AbstractC5930 abstractC5930) {
        C6656 c6656 = new C6656(m14648(c6263.f77447, m14619(c6263.mo20271())), c6263.f77453, m14634(c6263.f77449), abstractC5930, c6263, false);
        c6656.f30189 = this.f18294;
        c6656.f30190 = c6263.f77449;
        return c6656;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m14619(C21825 c21825) {
        if (c21825 == null) {
            return C21825.m48588();
        }
        C19003 c19003 = new C19003();
        while (c21825.m48595()) {
            c19003.m43723(m14591((AbstractC23156) c21825.f70876));
            c21825 = c21825.f70877;
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1321 m14580(Object obj) {
        C1321 c1321M14581;
        AbstractC16579 abstractC16579Mo1930;
        C3836 c3836 = this.f18291;
        if (obj instanceof String) {
            c1321M14581 = m14581(EnumC6617.CLASS, obj);
            abstractC16579Mo1930 = c3836.f14220.mo1930(obj);
        } else if (obj instanceof Integer) {
            c1321M14581 = m14581(EnumC6617.INT, obj);
            abstractC16579Mo1930 = c3836.f14232.mo1930(obj);
        } else if (obj instanceof Long) {
            c1321M14581 = m14581(EnumC6617.LONG, obj);
            abstractC16579Mo1930 = c3836.f14264.mo1930(obj);
        } else if (obj instanceof Byte) {
            c1321M14581 = m14581(EnumC6617.BYTE, obj);
            abstractC16579Mo1930 = c3836.f14271.mo1930(obj);
        } else if (obj instanceof Character) {
            char cCharAt = ((Character) obj).toString().charAt(0);
            c1321M14581 = m14581(EnumC6617.CHAR, Integer.valueOf(cCharAt));
            abstractC16579Mo1930 = c3836.f14294.mo1930(Integer.valueOf(cCharAt));
        } else if (obj instanceof Double) {
            c1321M14581 = m14581(EnumC6617.DOUBLE, obj);
            abstractC16579Mo1930 = c3836.f14291.mo1930(obj);
        } else if (obj instanceof Float) {
            c1321M14581 = m14581(EnumC6617.FLOAT, obj);
            abstractC16579Mo1930 = c3836.f14256.mo1930(obj);
        } else if (obj instanceof Short) {
            c1321M14581 = m14581(EnumC6617.SHORT, obj);
            abstractC16579Mo1930 = c3836.f14225.mo1930(obj);
        } else if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            c1321M14581 = m14581(EnumC6617.BOOLEAN, Integer.valueOf(zBooleanValue ? 1 : 0));
            abstractC16579Mo1930 = c3836.f14263.mo1930(Integer.valueOf(zBooleanValue ? 1 : 0));
        } else {
            throw new AssertionError(obj);
        }
        c1321M14581.f30190 = abstractC16579Mo1930;
        return c1321M14581;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5224 m14591(AbstractC23156 abstractC23156) {
        return this.f18292.m7553((C11867) abstractC23156);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5224 m14590(C13278 c13278) {
        return this.f18292.m7546(c13278);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23195 m14623(C18258 c18258, AbstractC16579 abstractC16579, C21452 c21452) {
        C21783 c21783M14648 = m14648(c18258.f77447, m14619(c18258.mo20271()));
        AbstractC11242 abstractC11242 = c18258.f77453;
        AbstractC5930 abstractC5930M14634 = abstractC11242 != this.f18295.f77632 ? m14634(abstractC16579.mo16235()) : null;
        C19003 c19003 = new C19003();
        for (C21825 c21825Mo1938 = abstractC16579.mo1938(); c21825Mo1938.m48595(); c21825Mo1938 = c21825Mo1938.f70877) {
            Object obj = c21825Mo1938.f70876;
            AbstractC11242 abstractC11243 = ((AbstractC16579) obj).f53222.f77453;
            C22929 c22929 = (C22929) obj;
            C21825 c21825M14632 = m14632(this.f18296.m52381(c22929));
            C21825 c21825M48588 = C21825.m48588();
            C22179 c22179 = new C22179();
            c22179.f72545 = abstractC11243;
            c22179.f72547 = c21825M14632;
            c22179.f72546 = c21825M48588;
            c22179.f30189 = this.f18294;
            c22179.f30190 = c22929;
            c19003.m43723(c22179);
        }
        C23195 c23195 = new C23195(c21783M14648, abstractC11242, abstractC5930M14634, c19003.m43726(), null, m14620(abstractC16579.mo33523(), c18258), m14632(abstractC16579.mo33524()), c21452, null, c18258);
        c23195.f30189 = this.f18294;
        c23195.f30190 = abstractC16579;
        return c23195;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m14620(C21825 c21825, C18258 c18258) {
        C19003 c19003 = new C19003();
        C18258 c18259 = c18258.f77452 == EnumC10477.f35879 ? c18258 : null;
        if (c18259 != null && c18259.f58259 != null && c21825.m48596() == c18259.f58259.m48596()) {
            Iterator it = c18258.f58259.iterator();
            while (it.hasNext()) {
                c19003.m43723(m14594((C6263) it.next(), (AbstractC5930) null));
            }
        } else {
            int i = 0;
            while (c21825.m48595()) {
                c19003.m43723(m14594(new C6263(8589934592L, m14643(i), (AbstractC16579) c21825.f70876, c18258), (AbstractC5930) null));
                c21825 = c21825.f70877;
                i++;
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22158 m14621(C6263 c6263, C15434 c15434) {
        C22158 c22158 = new C22158(m14641(c6263), c15434);
        c22158.f30190 = ((C8777) c6263.f77449).f30194;
        return c22158;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2422 m14584(AbstractC16579 abstractC16579, AbstractC5930 abstractC5930) {
        C2422 c2422M14583 = m14583((AbstractC8774) m14634(abstractC16579), abstractC5930);
        c2422M14583.f30190 = abstractC16579;
        return c2422M14583;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r1.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r1.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r0.hasNext() == false) goto L39;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC5930 m14641(l.AbstractC23903 r5) {
        /*
            r4 = this;
            l.ۤ۠۟ r0 = r4.f18293
            l.ۧ᩷۟ r1 = r5.f77453
            l.᩻᩷۟ r2 = r4.f18295
            l.ۧ᩷۟ r2 = r2.f77594
            if (r1 == r2) goto L99
            l.᩻᩵ۤ r2 = r5.f77448
            if (r2 == 0) goto L99
            l.ۘۡۤ r3 = r4.f18291
            l.᩶᩵ۤ r3 = r3.f14227
            if (r2 == r3) goto L99
            l.ۤᩴۤ r2 = r2.f77452
            l.ۤᩴۤ r3 = l.EnumC10477.f35879
            if (r2 == r3) goto L99
            l.ۤᩴۤ r3 = l.EnumC10477.f35878
            if (r2 != r3) goto L20
            goto L99
        L20:
            l.ۤᩴۤ r2 = r5.f77452
            l.ۤᩴۤ r3 = l.EnumC10477.f35865
            if (r2 != r3) goto L8e
            if (r0 == 0) goto L8e
            l.᩶۠ۤ r2 = r0.f34728
            java.lang.Iterable r1 = r2.m9327(r1)
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r0 = r1.next()
            l.᩻᩵ۤ r0 = (l.AbstractC23903) r0
            if (r0 != r5) goto L8e
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L8e
            goto L99
        L47:
            l.۟᩵ۤ r1 = r0.f34721
            r1.mo49994()
            l.ۢ۠ۤ r1 = r1.f25395
            l.ۧ᩷۟ r2 = r5.f77453
            java.lang.Iterable r1 = r1.m9327(r2)
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r0 = r1.next()
            l.᩻᩵ۤ r0 = (l.AbstractC23903) r0
            if (r0 != r5) goto L8e
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L8e
            goto L99
        L6d:
            l.֫۠ۤ r0 = r0.f34722
            l.ۧ᩷۟ r1 = r5.f77453
            java.lang.Iterable r0 = r0.m9327(r1)
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r0.next()
            l.᩻᩵ۤ r1 = (l.AbstractC23903) r1
            if (r1 != r5) goto L8e
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L8e
            goto L99
        L8e:
            l.᩻᩵ۤ r0 = r5.f77448
            l.ۛ۠۟ r0 = r4.m14641(r0)
            l.᩻۠۟ r5 = r4.m14626(r0, r5)
            return r5
        L99:
            l.ۗ۠۟ r5 = r4.m14586(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5286.m14641(l.᩻᩵ۤ):l.ۛ۠۟");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 m14643(int i) {
        C23942 c23942 = this.f18295;
        return c23942.f77631.m17389(C8479.m22141(i, "x"));
    }
}
