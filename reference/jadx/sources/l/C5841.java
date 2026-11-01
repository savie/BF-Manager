package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.ۛۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C5841 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974(b.k) && c21422.m47970().m28814("zip");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963(b.k);
        c11545M47970.m28775("zip");
        C13810 c13810 = (C13810) c11545M47970.m28817();
        if (c13810.m33621()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        String strM33624 = c13810.m33624();
        AbstractC20745 abstractC20745M15313 = C5553.m15313(strM33624, new String[0]);
        if (abstractC20745M15313.mo8447()) {
            AbstractC20745 abstractC20745M46689 = abstractC20745M15313.m46689();
            C13638.requireNonNull(abstractC20745M46689);
            if (!abstractC20745M46689.mo8447()) {
                if (!C6696.m18084()) {
                    c21422.m47980().m31000(C16737.m39264(R.string.MT_Protector, strM33624), false);
                    return;
                }
            }
        } else if (!C6696.m18084()) {
            c21422.m47980().m31000(C16737.m39264(R.string.MT_Protector, strM33624), false);
            return;
        }
        String strM45747 = c13810.m33623() ? C20240.m45747(abstractC20745M15313) : null;
        new C19953(this, c21422.m47965(), strM33624, c13810.m33623(), strM45747, c13810, c21422, strM45747);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16055(C5841 c5841, C21422 c21422, int i, int i2, C14558 c14558, boolean z) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963(b.k);
        c11545M47970.m28775("zip");
        int i3 = C20725.f67443;
        C10142 c10142 = new C10142(C17130.class);
        c10142.m25779(c21422.m47979());
        c10142.m25780(c21422);
        c10142.m25773(c21422.m47960());
        c10142.m25770("ARG_STATELESS_VISITOR2", c21422.m47970().m28827().m24619());
        c10142.m25768("ARG_MSG_FROM", c21422.m47972());
        c10142.m25768("ARG_MSG_TO", C16737.m39288(R.string.MT_Protector).toLowerCase());
        c10142.m25768("targetPath", c11545M47970.m28798());
        c10142.m25764(i, "level");
        c10142.m25764(i2, "update");
        c10142.m25766(c21422.m47980(), c14558);
        c10142.m25769("keepApkSigBlock", z);
        c10142.m25763();
    }
}
