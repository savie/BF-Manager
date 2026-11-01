package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.ܿ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17574 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f55860;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f55861;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f55862;

    public C17574(ActivityC3588 activityC3588, boolean z) {
        this.f55860 = activityC3588;
        this.f55861 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f55860, R.string.MT_Protector);
        this.f12806.m40697((Runnable) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        ActivityC3588 activityC3588 = this.f55860;
        Runnable runnable = new Runnable() { // from class: l.۫᩶ۨ
            @Override // java.lang.Runnable
            public final void run() {
                C17574.m40878(this.f42218);
            }
        };
        this.f55862 = 0;
        try {
            C12063 c12063 = new C12063();
            int size = activityC3588.f13204.f7902.size();
            Iterator it = activityC3588.f13204.f7902.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                ((C13929) it.next()).m33766(c12063);
                i += 100;
                int i2 = i / size;
                if (i2 != this.f55862) {
                    this.f55862 = i2;
                    activityC3588.runOnUiThread(runnable);
                }
                if (this.f12806.m40693()) {
                    return;
                }
            }
            c12063.m29981();
            this.f55862 = -1;
            activityC3588.runOnUiThread(runnable);
            int iM29979 = c12063.m29979();
            byte[] bArr = new byte[iM29979];
            c12063.m29977(new C4651(bArr));
            C12063.m29974(bArr);
            Adler32 adler32 = new Adler32();
            adler32.update(bArr, 12, iM29979 - 12);
            int value = (int) adler32.getValue();
            bArr[8] = (byte) value;
            bArr[9] = (byte) (value >> 8);
            bArr[10] = (byte) (value >> 16);
            bArr[11] = (byte) (value >> 24);
            AbstractC20745 abstractC20745 = activityC3588.f13204.f7905;
            abstractC20745.getClass();
            abstractC20745.m46698(new C21450(0, bArr));
            ActivityC3588.f13200 = false;
        } finally {
            System.gc();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40878(C17574 c17574) {
        if (c17574.f55862 == -1) {
            c17574.f12806.m40699();
            return;
        }
        c17574.f12806.m40696((CharSequence) (c17574.f55860.getString(R.string.MT_Protector) + ' ' + c17574.f55862 + '%'));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f55861) {
            this.f55860.finish();
        } else {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f55860.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
