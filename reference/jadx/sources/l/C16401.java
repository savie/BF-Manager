package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final class C16401 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۗܰܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f52761 = {9505, -13861, -13863, -13884, -13887, -13874, -13880, -13857, -13836, -13874, -13869, -13878, -13880, -13857, -13881, -13870, -13836, -13882, -13878, -13857, -13880, -13885, -13874, -13883, -13878, -13879, -13881, -13874, -13836, -13879, -13886, -13883, -13836, -13880, -13884, -13883, -13859, -13874, -13863, -13857, -13878, -13876, -13863, -13874, -13874, -13882, -13874, -13883, -13857, -13947, -13857, -13869, -13857, -27531, -22637, -26408, -30939, -23170, -27104, -21772, -28518, -13880, -13879, -13874, -13875, -13876, -13885, -13887, -13881, -13848, -13847, -13842, -13843, -13844, -13853, -13855, -13849};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f52762;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f52763;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f52764;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f52765;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11462 f52766;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C13662 f52767;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f52768;

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public void mo1159() {
        /*
            Method dump skipped, instruction units count: 4072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16401.mo1159():void");
    }

    public C16401(C11545 c11545, AbstractC11462 abstractC11462, boolean z, boolean z2, Runnable runnable) {
        this.f52765 = c11545;
        this.f52766 = abstractC11462;
        this.f52764 = z;
        this.f52768 = z2;
        this.f52763 = runnable;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f52767 = this.f52765.m28770(true, this.f52766.mo28619(this.f52764));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C11545 c11545 = this.f52765;
        C5900 c5900 = c11545.f38826;
        AbstractC11462 abstractC11462 = c11545.f38817;
        AbstractC11462 abstractC11463 = this.f52766;
        if (abstractC11462 != abstractC11463) {
            return;
        }
        if (this.f52767.m33367()) {
            if (this.f52768) {
                c11545.m28731(Collections.EMPTY_LIST, false);
                c5900.m16166();
                return;
            }
            return;
        }
        c11545.m28731(this.f52762, false);
        if (this.f52762.size() == 3 && (abstractC11463 instanceof C11672) && c11545.m28798().equals("/data/data/")) {
            Set set = (Set) C9030.stream(this.f52762).filter(new C15696(0)).map(new C19929(0)).collect(C1890.toSet());
            if (set.contains(C16737.m39293()) && set.contains("com.google.android.gms")) {
                C8067 c8067BuildDialog = c11545.m28824().buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ۘ᩹
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f1277.f52765.m28824().m31020("https://mt.cc/download");
                    }
                });
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog.m21269();
            }
        }
        c5900.m16166();
        Runnable runnable = this.f52763;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f52767.m33367()) {
            return;
        }
        boolean z = exc instanceof C4987;
        C11545 c11545 = this.f52765;
        if (z || (exc instanceof C8142)) {
            C15829.m37612(0, exc.getMessage()).m37622();
        } else {
            c11545.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
        }
        c11545.m28745();
        if (this.f52768) {
            c11545.m28731(Collections.EMPTY_LIST, false);
            c11545.f38826.m16166();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f52767.m33365();
    }
}
