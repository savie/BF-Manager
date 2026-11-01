package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9099 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974("local") && c21422.m47970().m28814("zip");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963("local");
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
        new C18270(this, c21422.m47965(), strM33624, c13810.m33623(), strM45747, c21422, c13810, strM45747, abstractC20745M15313).m30499(c21422.m47975());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23440(C9099 c9099, C21422 c21422, AbstractC20745 abstractC20745, int i, int i2, boolean z, String str, C14558 c14558, boolean z2) {
        int i3 = C20725.f67443;
        C10142 c10142 = new C10142(C19682.class);
        c10142.m25768("zipPath", abstractC20745.mo33986());
        c10142.m25768("rename", str);
        c10142.m25780(c21422);
        c10142.m25772(c21422.m47979());
        c10142.m25764(i, "level");
        c10142.m25764(i2, "update");
        c10142.m25769("deleteSources", z);
        c10142.m25768("basePath", c21422.m47970().m28798().substring(1));
        c10142.m25766(c21422.m47980(), c14558);
        c10142.m25769("keepApkSigBlock", z2);
        c10142.m25763();
    }
}
