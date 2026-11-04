package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩶ᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C21500 extends AbstractC5313 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashSet f68723 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f68724;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22665 = (AbstractC22664) obj;
        if (abstractC22665.m51067(EnumC21172.WILDCARD)) {
            return (Boolean) m34207(abstractC22664, abstractC22665);
        }
        return Boolean.valueOf(m48909(abstractC22664, abstractC22665) || m48909(abstractC22665, abstractC22664));
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        boolean zM55130;
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        if (c10729.mo27319()) {
            return Boolean.FALSE;
        }
        if (!abstractC22664.m51067(EnumC21172.WILDCARD)) {
            if (c10729.mo27317()) {
                return Boolean.valueOf(m48909(abstractC22664, c10729.f34074));
            }
            return Boolean.valueOf(m48909(c10729.f34074, abstractC22664));
        }
        if (abstractC22664.mo27319()) {
            return Boolean.FALSE;
        }
        boolean zMo27317 = c10729.mo27317();
        C24705 c24705 = this.f68724;
        if (zMo27317) {
            if (abstractC22664.mo27317()) {
                AbstractC22664 abstractC22665 = c10729.f34074;
                AbstractC22664 abstractC22664M55123 = c24705.m55123(abstractC22664);
                C4567 c4567 = new C4567(abstractC22665, abstractC22664M55123, c24705);
                HashSet hashSet = this.f68723;
                if (hashSet.add(c4567)) {
                    try {
                        zM55130 = c24705.m55130(abstractC22665, abstractC22664M55123, c24705.f79958);
                    } finally {
                        hashSet.remove(c4567);
                    }
                } else {
                    zM55130 = true;
                }
                return Boolean.valueOf(!zM55130);
            }
            if (abstractC22664.mo27320()) {
                return Boolean.valueOf(m48909(c24705.m55084(abstractC22664), c10729.f34074));
            }
        } else if (c10729.mo27320() && abstractC22664.mo27317()) {
            return Boolean.valueOf(m48909(c10729.f34074, c24705.m55123(abstractC22664)));
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m48909(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        C24705 c24705 = this.f68724;
        C4567 c4567 = new C4567(abstractC22664, abstractC22665, c24705);
        HashSet hashSet = this.f68723;
        if (!hashSet.add(c4567)) {
            return false;
        }
        try {
            return c24705.m55136(abstractC22664, abstractC22665);
        } finally {
            hashSet.remove(c4567);
        }
    }

    public C21500(C24705 c24705) {
        this.f68724 = c24705;
    }
}
