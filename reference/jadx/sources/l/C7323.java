package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C7323 extends AbstractC18154 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashSet f24319 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f24320;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        AbstractC16579 abstractC16579M52423;
        AbstractC16579 abstractC16579M52424;
        AbstractC23903 abstractC23903 = (AbstractC23903) obj;
        C23800 c23800 = this.f24320;
        AbstractC0618 abstractC0618 = c0309.f53222;
        if (abstractC0618 == abstractC23903) {
            return c0309;
        }
        HashSet hashSet = this.f24319;
        if (!hashSet.add(abstractC0618)) {
            return null;
        }
        try {
            AbstractC16579 abstractC16579M52432 = c23800.m52432(c0309);
            if ((abstractC16579M52432.m39001(EnumC6617.CLASS) || abstractC16579M52432.m39001(EnumC6617.TYPEVAR)) && (abstractC16579M52423 = c23800.m52423(abstractC23903, abstractC16579M52432)) != null) {
                return abstractC16579M52423;
            }
            if ((abstractC23903.mo20276() & 512) != 0) {
                for (C21825 c21825M52439 = c23800.m52439(c0309); c21825M52439.m48595(); c21825M52439 = c21825M52439.f70877) {
                    if (!((AbstractC16579) c21825M52439.f70876).m39001(EnumC6617.ERROR) && (abstractC16579M52424 = c23800.m52423(abstractC23903, (AbstractC16579) c21825M52439.f70876)) != null) {
                        return abstractC16579M52424;
                    }
                }
            }
            return null;
        } finally {
            hashSet.remove(abstractC0618);
        }
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4812(C5954 c5954, Object obj) {
        return c5954;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        AbstractC23903 abstractC23903 = (AbstractC23903) obj;
        if (this.f24320.m52413((AbstractC16579) c8777, abstractC23903.f77449, true)) {
            return abstractC23903.f77449;
        }
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        AbstractC23903 abstractC23903 = (AbstractC23903) obj;
        return c22929.f53222 == abstractC23903 ? c22929 : this.f24320.m52423(abstractC23903, c22929.mo18112());
    }

    public C7323(C23800 c23800) {
        this.f24320 = c23800;
    }
}
