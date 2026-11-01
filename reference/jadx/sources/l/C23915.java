package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E1YX */
/* JADX INFO: loaded from: classes.dex */
public final class C23915 extends AbstractC4674 {
    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        c21422.m47963("zip");
        final C13810 c13810 = (C13810) c21422.m47960();
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
        final String strM45747 = c13810.m33623() ? C20240.m45747(abstractC20745M15313) : null;
        C8067 c8067BuildDialog = c21422.m47980().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(AbstractC4674.m12941(c21422));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽ᩶֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C23915.m52736(this.f53928, c13810, c21422, strM45747);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (c13810.m33623()) {
            C11545 c11545M47965 = c21422.m47965();
            c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            C11005.m27756(c11545M47965, c8067BuildDialog.m21269(), strM45747);
            return;
        }
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52736(final C23915 c23915, C13810 c13810, final C21422 c21422, String str) {
        if (c13810.m33623()) {
            C11005.m27761(new InterfaceC17354(c23915) { // from class: l.۫᩶֨
                @Override // l.InterfaceC17354
                public final /* synthetic */ void onCanceled() {
                }

                @Override // l.InterfaceC17354
                /* JADX INFO: renamed from: ۙ */
                public final void mo6536(C14558 c14558, boolean z) {
                    C23915.m52737(c21422, c14558, z);
                }

                @Override // l.InterfaceC17354
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ boolean mo6537(Exception exc) {
                    return false;
                }
            }, c21422.m47980(), str);
        } else {
            m52737(c21422, null, false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52737(C21422 c21422, C14558 c14558, boolean z) {
        C13810 c13810 = (C13810) c21422.m47960();
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C11215.class);
        c10142.m25779(c21422.m47979());
        c10142.m25768("zipPath", c13810.m33624());
        c10142.m25777(c21422);
        c10142.m25766(c21422.m47980(), c14558);
        c10142.m25769("keepApkSigBlock", z);
        c10142.m25763();
    }
}
