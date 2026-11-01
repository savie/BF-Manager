package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes5.dex */
public final class C19607 extends C22220 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21017 f62955;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashSet f62957 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62956 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f62958 = false;

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        mo7248(c23570.f76357);
        m44698(c23570.f76355, c23570);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44698(AbstractC23903 abstractC23903, AbstractC8774 abstractC8774) {
        if (abstractC23903 != null) {
            EnumC10477 enumC10477 = abstractC23903.f77452;
            EnumC10477 enumC10478 = EnumC10477.f35865;
            if (enumC10477 == enumC10478) {
                C21017 c21017 = this.f62955;
                C4603 c4603M28678 = c21017.f68436.f31863.m28678((AbstractC0618) abstractC23903);
                if (c4603M28678 != null) {
                    C22137 c22137M48186 = c21017.f68429.m48186();
                    try {
                        c21017.f68429.m48202(c4603M28678.f16295.f34725);
                        mo7248(c4603M28678.f16296);
                        return;
                    } finally {
                        c21017.f68429.m48202(c22137M48186.m49095());
                    }
                }
                if (abstractC23903.f77452 == enumC10478) {
                    m44699(abstractC23903, abstractC8774, C21825.m48588());
                    return;
                }
                return;
            }
        }
        if (abstractC23903 == null || abstractC23903.f77452 != EnumC10477.f35867) {
            this.f62958 = true;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        m44698(c3107.f11716, c3107);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3937(C11596 c11596) {
        mo7248(c11596.f38963);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3915(C0990 c0990) {
        mo7248(c0990.f4638);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        C21825 c21825M48588 = C21825.m48588();
        AbstractC5930 abstractC5930 = c8753.f30092;
        if (abstractC5930 != null) {
            c21825M48588 = c21825M48588.m48597(abstractC5930);
        }
        C21825 c21825 = c8753.f30087;
        if (c21825 != null) {
            Iterator it = c21825.iterator();
            while (it.hasNext()) {
                c21825M48588 = c21825M48588.m48597((AbstractC8774) it.next());
            }
        }
        m44699(c8753.f30086, c8753, c21825M48588);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44699(AbstractC23903 abstractC23903, AbstractC8774 abstractC8774, C21825 c21825) {
        if ((abstractC23903.f77447 & 1073741824) != 0) {
            return;
        }
        HashSet hashSet = this.f62957;
        if (hashSet.contains(abstractC23903)) {
            this.f62956 = true;
            this.f62955.m47241((C22492) abstractC23903, (InterfaceC12260) abstractC8774);
            return;
        }
        if (abstractC23903.f77449.mo1926()) {
            return;
        }
        try {
            hashSet.add(abstractC23903);
            if (abstractC23903.f77449.m39001(EnumC6617.CLASS)) {
                if (c21825.m48595()) {
                    m49334(c21825);
                } else {
                    C0309 c0309 = (C0309) abstractC23903.f77449;
                    AbstractC16579 abstractC16579 = c0309.f1654;
                    if (abstractC16579 != null && c0309.f1658 != null) {
                        m44698(abstractC16579.f53222, abstractC8774);
                        Iterator it = c0309.f1658.iterator();
                        while (it.hasNext()) {
                            m44698(((AbstractC16579) it.next()).f53222, abstractC8774);
                        }
                    }
                    this.f62958 = true;
                    return;
                }
                AbstractC23903 abstractC23904 = abstractC23903.f77448;
                if (abstractC23904.f77452 == EnumC10477.f35865) {
                    m44698(abstractC23904, abstractC8774);
                }
            }
        } finally {
            hashSet.remove(abstractC23903);
        }
    }

    public C19607(C21017 c21017) {
        this.f62955 = c21017;
    }
}
