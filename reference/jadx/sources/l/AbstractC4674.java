package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L4NY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4674 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f16536;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f16537;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f16538;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC4674 f16539;

    /* JADX INFO: renamed from: ۖ */
    public boolean mo1960(C21422 c21422) {
        return !(this instanceof C20780);
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo1962(C21422 c21422);

    public AbstractC4674(int i, int i2) {
        this.f16538 = i;
        this.f16537 = i2;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC4674 mo1961(AbstractC4674 abstractC4674) {
        this.f16539 = abstractC4674;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12944() {
        this.f16536 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12945(C21422 c21422) {
        if (this.f16536 && c21422.m47970().m28800()) {
            return false;
        }
        return mo1960(c21422);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m12949(C21422 c21422) {
        AbstractC4674 abstractC4674 = this.f16539;
        if (abstractC4674 == null) {
            return false;
        }
        if (abstractC4674.f16536 && c21422.m47970().m28800()) {
            return false;
        }
        return this.f16539.mo1960(c21422);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m12947() {
        return this.f16536;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m12942() {
        return this.f16538;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m12948() {
        return this.f16537;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12946(C21422 c21422, boolean z) {
        if (z) {
            if (!m12949(c21422)) {
                return false;
            }
            this.f16539.mo1962(c21422);
            return true;
        }
        if (!m12945(c21422)) {
            return false;
        }
        mo1962(c21422);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 m12943(final C21422 c21422, int i, CharSequence charSequence) {
        C8067 c8067BuildDialog = c21422.m47980().buildDialog();
        c8067BuildDialog.m21274(i);
        c8067BuildDialog.m21261(charSequence);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗ֨᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f10959.mo6949(c21422);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        return c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۚ */
    public void mo6949(C21422 c21422) {
        throw new RuntimeException("Please override method onQueryOK()");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m12941(C21422 c21422) {
        int iM47975 = c21422.m47975();
        if (iM47975 == 1) {
            return C16737.m39264(R.string.MT_Protector, C16737.m39288(R.string.MT_Protector).toLowerCase(), c21422.m47981().mo7963());
        }
        return C16737.m39264(R.string.MT_Protector, C16737.m39288(R.string.MT_Protector).toLowerCase(), Integer.valueOf(iM47975));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12940(C21422 c21422, int i) {
        int iM47975 = c21422.m47975();
        if (iM47975 == 1) {
            return C16737.m39264(R.string.MT_Protector, C16737.m39288(i).toLowerCase(), c21422.m47981().mo7963(), c21422.m47970().m28759());
        }
        return C16737.m39264(R.string.MT_Protector, C16737.m39288(i).toLowerCase(), Integer.valueOf(iM47975), c21422.m47970().m28759());
    }
}
