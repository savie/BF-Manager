package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes3.dex */
public final class C6378 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫ۙܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f21533 = {4598, -24890, -24892, -24871, -24868, -24877, -24875, -24894, -24855, -24877, -24882, -24873, -24875, -24894, -24870, -24881, -24855, -24869, -24873, -24894, -24875, -24866, -24877, -24872, -24873, -24876, -24870, -24877, -24855, -24876, -24865, -24872, -24855, -24875, -24871, -24872, -24896, -24877, -24892, -24894, -24873, -24879, -24892, -24877, -24877, -24869, -24877, -24872, -24894, -24936, -24894, -24882, -24894, -15512, -3954, -12347, -12232, -3485, -16067, -535, -14457, -24875, -24876, -24877, -24880, -24879, -24866, -24868, -24870, -24843, -24844, -24845, -24848, -24847, -24834, -24836, -24838};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f21534;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f21535;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f21536;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f21537;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2648 f21538;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7364 f21539;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f21540;

    public C6378(C8614 c8614, AbstractC7364 abstractC7364, boolean z, boolean z2, Runnable runnable) {
        this.f21535 = c8614;
        this.f21539 = abstractC7364;
        this.f21536 = z;
        this.f21540 = z2;
        this.f21534 = runnable;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f21538 = this.f21535.m23169(true, this.f21539.mo20195(this.f21536));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38921. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public void mo1136() {
        /*
            Method dump skipped, instruction units count: 3892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6378.mo1136():void");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C8614 c8614 = this.f21535;
        C3966 c3966 = c8614.f28159;
        AbstractC7364 abstractC7364 = c8614.f28157;
        AbstractC7364 abstractC7365 = this.f21539;
        if (abstractC7364 != abstractC7365) {
            return;
        }
        if (this.f21538.m8779()) {
            if (this.f21540) {
                c8614.m23127(Collections.EMPTY_LIST, false);
                c3966.m12741();
                return;
            }
            return;
        }
        c8614.m23127(this.f21537, false);
        if (this.f21537.size() == 3 && (abstractC7365 instanceof C7495) && c8614.m23166().equals("/data/data/")) {
            Set set = (Set) C1170.stream(this.f21537).filter(new C20548(0)).map(new C18061(2)).collect(C2025.toSet());
            if (set.contains(C21576.m49092()) && set.contains("com.google.android.gms")) {
                C2361 c2361BuildDialog = c8614.m23233().buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8000(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨۨܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f39645.f21535.m23233().m40420("https://mt.cc/download");
                    }
                });
                c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog.m8016();
            }
        }
        c3966.m12741();
        Runnable runnable = this.f21534;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f21538.m8779()) {
            return;
        }
        boolean z = exc instanceof C4866;
        C8614 c8614 = this.f21535;
        if (z || (exc instanceof C3090)) {
            C22673.m51153(0, exc.getMessage()).m51163();
        } else {
            c8614.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
        }
        c8614.m23124();
        if (this.f21540) {
            c8614.m23127(Collections.EMPTY_LIST, false);
            c8614.f28159.m12741();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f21538.m8777();
    }
}
