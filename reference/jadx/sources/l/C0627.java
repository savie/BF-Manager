package l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.BaseAdapter;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֡ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0627 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f2445;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f2446;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f2447;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19272 f2448;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f2449 = false;

    public C0627(C19272 c19272, AbstractActivityC17204 abstractActivityC17204, AbstractC22044 abstractC22044, String str) {
        this.f2448 = c19272;
        this.f2446 = abstractActivityC17204;
        this.f2445 = abstractC22044;
        this.f2447 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        final AbstractActivityC17204 abstractActivityC17204 = this.f2446;
        C21576.m49062(200L, new Runnable() { // from class: l.ܿᩴۧ
            @Override // java.lang.Runnable
            public final void run() {
                C0627.m2775(this.f60221, abstractActivityC17204);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2775(C0627 c0627, AbstractActivityC17204 abstractActivityC17204) {
        if (c0627.f2449) {
            return;
        }
        c0627.m8191(abstractActivityC17204, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException, C13464 {
        AbstractC22044 abstractC22044 = this.f2445;
        boolean zM49870 = abstractC22044.m49870();
        String strM49874 = null;
        C19272 c19272 = this.f2448;
        if (zM49870) {
            Typeface typefaceCreateFromFile = Typeface.createFromFile(this.f2447);
            if (typefaceCreateFromFile == null || typefaceCreateFromFile == Typeface.DEFAULT) {
                throw new C13464(R.string.MT_Protector);
            }
            abstractC22044.m49847(c19272.f62318.f26738, (C24523) null, (InterfaceC23711) null);
            c19272.f62318.f26742 = true;
        } else {
            abstractC22044.m49847(c19272.f62318.f26738, (C24523) null, (InterfaceC23711) null);
            c19272.f62318.f26742 = true;
            Typeface typefaceCreateFromFile2 = Typeface.createFromFile(c19272.f62318.f26738.mo4294());
            if (typefaceCreateFromFile2 == null || typefaceCreateFromFile2 == Typeface.DEFAULT) {
                throw new C13464(R.string.MT_Protector);
            }
        }
        try {
            InputStream inputStreamMo4290 = c19272.f62318.f26738.mo4290();
            try {
                String strM20845 = C7630.m20844(inputStreamMo4290).m20845(4, c19272.m12560().getResources().getConfiguration().locale);
                if (!TextUtils.isEmpty(strM20845)) {
                    if (inputStreamMo4290 != null) {
                        inputStreamMo4290.close();
                    }
                    strM49874 = strM20845;
                } else if (inputStreamMo4290 != null) {
                    inputStreamMo4290.close();
                }
            } catch (Throwable th) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
        }
        if (strM49874 == null) {
            strM49874 = abstractC22044.m49874();
        }
        c19272.f62318.f26744 = strM49874;
        c19272.f62318.f26746 = C1599.m5611(c19272.f62318.f26738, "MD5");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C19272 c19272 = this.f2448;
        c19272.f62318.m21975();
        String[] strArr = c19272.f62318.f26739;
        int i = c19272.f62318.f26741;
        String strM49088 = c19272.f62318.f26744;
        if (strM49088 == null) {
            strM49088 = C21576.m49088(R.string.MT_Protector);
        }
        strArr[i] = C21576.m49059(R.string.MT_Protector, strM49088);
        ((BaseAdapter) c19272.f62318.f26743.m22437().getAdapter()).notifyDataSetChanged();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (!(exc instanceof IOException)) {
            C22673.m51159(R.string.MT_Protector);
        } else {
            this.f2446.m40401(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f2449 = true;
        m8196();
    }
}
