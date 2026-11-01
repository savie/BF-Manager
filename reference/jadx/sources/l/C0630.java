package l;

import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0630 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        if (!c21422.m47974("zip") || !c11545M47970.m28814("zip")) {
            return false;
        }
        C13810 c13810 = (C13810) c21422.m47960();
        C13810 c13811 = (C13810) c11545M47970.m28817();
        if (c13810.m33624().equals(c13811.m33624())) {
            return !c13810.m28629().equals(c13811.m28629());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963("zip");
        c11545M47970.m28775("zip");
        C13810 c13810 = (C13810) c11545M47970.m28817();
        String strM33624 = c13810.m33624();
        AbstractC20745 abstractC20745M15313 = C5553.m15313(strM33624, new String[0]);
        if (c13810.m33621()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
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
        new C7687(this, c21422.m47965(), strM33624, c13810.m33623(), strM45747, c13810, c21422, strM45747).m30497();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2918(C0630 c0630, C21422 c21422, int i, C14558 c14558, boolean z) {
        C11545 c11545M47970 = c21422.m47970();
        C13810 c13810 = (C13810) c21422.m47960();
        C13810 c13811 = (C13810) c11545M47970.m28817();
        List listM47979 = c21422.m47979();
        int i2 = C20725.f67443;
        C10142 c10142 = new C10142(C20387.class);
        c10142.m25768("srcZipPath", c13810.m33624());
        c10142.m25768("tarZipPath", c13811.m33624());
        c10142.m25768("targetPath", c13811.m28629().substring(1));
        c10142.m25764(i, "update");
        c10142.m25779(listM47979);
        c10142.m25780(c21422);
        c10142.m25766(c21422.m47980(), c14558);
        c10142.m25769("keepApkSigBlock", z);
        c10142.m25763();
    }
}
