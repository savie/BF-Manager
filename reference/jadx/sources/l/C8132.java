package l;

/* JADX INFO: renamed from: l.۠ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8132 extends AbstractC18715 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10955 f28470;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC8774 f28471;

    @Override // l.AbstractC18715
    /* JADX INFO: renamed from: ۖ */
    public final void mo11337() {
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1981(C18255 c18255) {
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m21430(AbstractC8774 abstractC8774) {
        AbstractC8774 abstractC8774M9467 = C3128.m9467(abstractC8774);
        if (abstractC8774M9467.m22847(EnumC18651.f60465) || abstractC8774M9467.m22847(EnumC18651.f60473)) {
            AbstractC23903 abstractC23903M9471 = C3128.m9471(abstractC8774M9467);
            AbstractC8774 abstractC8775 = this.f28471;
            if (abstractC8775 == null || abstractC23903M9471.f77452 != EnumC10477.f35878 || abstractC23903M9471.f77448.f77452 != EnumC10477.f35879 || ((C6263) abstractC23903M9471).f21226 >= C3128.m9453(abstractC8775)) {
                return;
            }
            switch (C13777.f45443[this.f28471.mo1803().ordinal()]) {
                case 8:
                    C10955 c10955 = this.f28470;
                    if (!c10955.f37251) {
                        C20414 c20414 = c10955.f37257;
                        C5909 c5909 = C23879.f77204;
                        c20414.m48199(abstractC8774M9467, new C5909("compiler", "local.var.accessed.from.icls.needs.final", abstractC23903M9471));
                        return;
                    }
                    break;
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
            m21431(abstractC23903M9471, abstractC8774M9467);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21431(AbstractC23903 abstractC23903, AbstractC8774 abstractC8774) {
        C14377 c14377;
        switch (C13777.f45443[this.f28471.mo1803().ordinal()]) {
            case 8:
                c14377 = C14707.f48109;
                break;
            case 9:
                c14377 = C14707.f48052;
                break;
            case 10:
                c14377 = C14707.f48099;
                break;
            default:
                throw new AssertionError("Unexpected tree kind: " + this.f28471.mo1803());
        }
        C10955 c10955 = this.f28470;
        C20414 c20414 = c10955.f37257;
        C11948 c11948M51910 = c10955.f37249.m51910(c14377);
        C5909 c5909 = C23879.f77204;
        c20414.m48199(abstractC8774, new C5909("compiler", "cant.ref.non.effectively.final.var", abstractC23903, c11948M51910));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        AbstractC8774 abstractC8774 = this.f28471;
        try {
            this.f28471 = c8753.f30086.m52728() ? c8753 : null;
            super.mo1065(c8753);
        } finally {
            this.f28471 = abstractC8774;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        AbstractC8774 abstractC8774 = this.f28471;
        try {
            this.f28471 = c22489;
            super.mo3959(c22489);
        } finally {
            this.f28471 = abstractC8774;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3933(C9459 c9459) {
        mo7248(c9459.f32014);
        AbstractC8774 abstractC8774 = this.f28471;
        try {
            this.f28471 = c9459;
            mo7248(c9459.f32013);
        } finally {
            this.f28471 = abstractC8774;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        AbstractC23903 abstractC23903 = c3107.f11716;
        if (abstractC23903.f77452 == EnumC10477.f35878) {
            C6263 c6263 = (C6263) abstractC23903;
            AbstractC8774 abstractC8774 = this.f28471;
            if (abstractC8774 == null || c6263.f77448.f77452 != EnumC10477.f35879 || c6263.f21226 >= C3128.m9453(abstractC8774)) {
                return;
            }
            switch (C13777.f45443[this.f28471.mo1803().ordinal()]) {
                case 8:
                    C10955 c10955 = this.f28470;
                    if (!c10955.f37251) {
                        if ((c6263.f77447 & 16) == 0) {
                            C20414 c20414 = c10955.f37257;
                            C5909 c5909 = C23879.f77204;
                            c20414.m48199(c3107, new C5909("compiler", "local.var.accessed.from.icls.needs.final", c6263));
                            return;
                        }
                        return;
                    }
                    break;
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
            if ((c6263.f77447 & 2199023255568L) == 0) {
                m21431(c6263, c3107);
            }
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3922(C3812 c3812) {
        AbstractC5930 abstractC5930M9461 = C3128.m9461(c3812.f14145);
        if (!(abstractC5930M9461 instanceof C3107)) {
            mo7248(abstractC5930M9461);
        }
        mo7248(c3812.f14146);
        m21430(abstractC5930M9461);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3927(C6635 c6635) {
        mo7248(c6635.f22412);
        mo7248(c6635.f22413);
        m21430(c6635.f22412);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1265(C13007 c13007) {
        int i = C13777.f45443[c13007.mo1803().ordinal()];
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            mo7248(c13007.f43378);
            m21430(c13007.f43378);
        } else {
            mo7248(c13007.f43378);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3942(C13713 c13713) {
        AbstractC23903 abstractC23903M9471;
        for (AbstractC8774 abstractC8774 : c13713.f45222) {
            if (!abstractC8774.m22847(EnumC18651.f60554) && (abstractC23903M9471 = C3128.m9471(abstractC8774)) != null && (abstractC23903M9471.mo20276() & 2199023255568L) == 0) {
                C20414 c20414 = this.f28470.f37257;
                C5909 c5909 = C23879.f77204;
                c20414.m48199(abstractC8774, new C5909("compiler", "try.with.resources.expr.effectively.final.var", abstractC23903M9471));
            }
        }
        super.mo3942(c13713);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1068(C21473 c21473) {
        mo7248(c21473.f69790);
    }

    public C8132(C10955 c10955) {
        this.f28470 = c10955;
    }
}
