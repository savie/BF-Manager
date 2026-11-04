package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.ܰ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14839 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f48529;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f48530;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48531;

    public C14839(ActivityC22957 activityC22957, boolean z) {
        this.f48530 = activityC22957;
        this.f48529 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f48530, R.string.MT_Protector);
        this.f7780.m33188((Runnable) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ActivityC22957 activityC22957 = this.f48530;
        Runnable runnable = new Runnable() { // from class: l.ۘ᩶ۤ
            @Override // java.lang.Runnable
            public final void run() {
                C14839.m35758(this.f15827);
            }
        };
        this.f48531 = 0;
        try {
            C24738 c24738 = new C24738();
            int size = activityC22957.f74569.f24316.size();
            Iterator it = activityC22957.f74569.f24316.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                ((C4072) it.next()).m13152(c24738);
                i += 100;
                int i2 = i / size;
                if (i2 != this.f48531) {
                    this.f48531 = i2;
                    activityC22957.runOnUiThread(runnable);
                }
                if (this.f7780.m33196()) {
                    return;
                }
            }
            c24738.m55244();
            this.f48531 = -1;
            activityC22957.runOnUiThread(runnable);
            int iM55243 = c24738.m55243();
            byte[] bArr = new byte[iM55243];
            c24738.m55242(new C24166(bArr));
            C24738.m55240(bArr);
            Adler32 adler32 = new Adler32();
            adler32.update(bArr, 12, iM55243 - 12);
            int value = (int) adler32.getValue();
            bArr[8] = (byte) value;
            bArr[9] = (byte) (value >> 8);
            bArr[10] = (byte) (value >> 16);
            bArr[11] = (byte) (value >> 24);
            AbstractC22044 abstractC22044 = activityC22957.f74569.f24299;
            abstractC22044.getClass();
            abstractC22044.m49843(new C10350(0, bArr));
            ActivityC22957.f74567 = false;
        } finally {
            System.gc();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35758(C14839 c14839) {
        if (c14839.f48531 == -1) {
            c14839.f7780.m33193();
            return;
        }
        c14839.f7780.m33187((CharSequence) (c14839.f48530.getString(R.string.MT_Protector) + ' ' + c14839.f48531 + '%'));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f48529) {
            this.f48530.finish();
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f48530.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
