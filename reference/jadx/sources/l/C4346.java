package l;

/* JADX INFO: renamed from: l.ۘᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4346 extends AbstractC5313 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f15720;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22665 = (AbstractC22664) obj;
        boolean zMo18049 = abstractC22665.mo18049();
        C24705 c24705 = this.f15720;
        if (zMo18049) {
            return Boolean.valueOf(c24705.m55115(abstractC22665, abstractC22664));
        }
        return Boolean.valueOf(c24705.m55149(abstractC22664, abstractC22665));
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1125(C8274 c8274, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        if (!abstractC22664.m51067(EnumC21172.WILDCARD)) {
            return Boolean.valueOf(this.f15720.m55149(c8274, abstractC22664));
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        boolean z;
        EnumC18670 enumC18670 = c10729.f34073;
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        boolean zMo18049 = abstractC22664.mo18049();
        C24705 c24705 = this.f15720;
        if (zMo18049) {
            return Boolean.valueOf(c24705.m55115(abstractC22664, c10729));
        }
        EnumC21172 enumC21172 = EnumC21172.WILDCARD;
        if (!abstractC22664.m51067(enumC21172)) {
            if (abstractC22664.m51067(EnumC21172.TYPEVAR) || !((C17969) abstractC22664).mo34139()) {
                z = false;
                if ((c10729.mo27317() || c24705.m55131(c24705.m55084(c10729), c24705.m55084(abstractC22664), false)) && (c10729.mo27320() || c24705.m55131(c24705.m55123(abstractC22664), c24705.m55123(c10729), false))) {
                    z = true;
                }
            } else {
                C10729 c107210 = ((C14018) abstractC22664).f44410;
                if (c107210.m51067(enumC21172) && c107210.f34073 == enumC18670 && c107210.f34074 == c10729.f34074) {
                    z = true;
                } else {
                    z = false;
                    if (c10729.mo27317()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
            }
        } else {
            C10729 c107211 = (C10729) abstractC22664;
            if (c107211.f34073 == enumC18670 && c107211.f34074 == c10729.f34074) {
                z = true;
            } else if (abstractC22664.m51067(EnumC21172.TYPEVAR)) {
                z = false;
                if (c10729.mo27317()) {
                    z = true;
                } else {
                    z = true;
                }
            } else {
                z = false;
                if (c10729.mo27317()) {
                    z = true;
                } else {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo10772(C12748 c12748, Object obj) {
        return Boolean.TRUE;
    }

    public C4346(C24705 c24705) {
        this.f15720 = c24705;
    }
}
