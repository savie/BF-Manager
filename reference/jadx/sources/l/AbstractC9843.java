package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4NY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9843 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f31679;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31680;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f31681;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC9843 f31682;

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo2016(C12915 c12915);

    /* JADX INFO: renamed from: ᩸ */
    public boolean mo2481(C12915 c12915) {
        return !(this instanceof C3591);
    }

    public AbstractC9843(int i, int i2) {
        this.f31679 = i;
        this.f31680 = i2;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC9843 mo2725(AbstractC9843 abstractC9843) {
        this.f31682 = abstractC9843;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25621() {
        this.f31681 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25622(C12915 c12915) {
        if (this.f31681 && c12915.m31974().m23193()) {
            return false;
        }
        return mo2481(c12915);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m25626(C12915 c12915) {
        AbstractC9843 abstractC9843 = this.f31682;
        if (abstractC9843 == null) {
            return false;
        }
        if (abstractC9843.f31681 && c12915.m31974().m23193()) {
            return false;
        }
        return this.f31682.mo2481(c12915);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m25625() {
        return this.f31681;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m25627() {
        return this.f31679;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m25624() {
        return this.f31680;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25623(C12915 c12915, boolean z) {
        if (z) {
            if (!m25626(c12915)) {
                return false;
            }
            this.f31682.mo2016(c12915);
            return true;
        }
        if (!m25622(c12915)) {
            return false;
        }
        mo2016(c12915);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 m25620(final C12915 c12915, int i, CharSequence charSequence) {
        C2361 c2361BuildDialog = c12915.m31979().buildDialog();
        c2361BuildDialog.m8021(i);
        c2361BuildDialog.m8008(charSequence);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳۗܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f61031.mo2480(c12915);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        return c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo2480(C12915 c12915) {
        throw new RuntimeException("Please override method onQueryOK()");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m25619(C12915 c12915) {
        int iM31981 = c12915.m31981();
        if (iM31981 == 1) {
            return C21576.m49059(R.string.MT_Protector, C21576.m49088(R.string.MT_Protector).toLowerCase(), c12915.m31989().mo8100());
        }
        return C21576.m49059(R.string.MT_Protector, C21576.m49088(R.string.MT_Protector).toLowerCase(), Integer.valueOf(iM31981));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m25618(C12915 c12915, int i) {
        int iM31981 = c12915.m31981();
        if (iM31981 == 1) {
            return C21576.m49059(R.string.MT_Protector, C21576.m49088(i).toLowerCase(), c12915.m31989().mo8100(), c12915.m31974().m23217());
        }
        return C21576.m49059(R.string.MT_Protector, C21576.m49088(i).toLowerCase(), Integer.valueOf(iM31981), c12915.m31974().m23217());
    }
}
