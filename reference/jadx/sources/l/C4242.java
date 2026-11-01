package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۘ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes3.dex */
public final class C4242 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9183 f15331;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f15332;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12233 f15334;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f15335;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C4785 f15336;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3062 f15337;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f15330 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C16842 f15333 = new C16842(0);

    public C4242(C9183 c9183, C11545 c11545, C4245 c4245, ArrayList arrayList, AbstractC12233 abstractC12233) {
        this.f15331 = c9183;
        this.f15335 = c11545;
        this.f15337 = c4245;
        this.f15332 = arrayList;
        this.f15334 = abstractC12233;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C4785 c4785 = new C4785(this.f15335.m28824());
        c4785.m13292(C16737.m39283(R.string.MT_Protector));
        c4785.m13289((RunnableC10098) null);
        c4785.m13297();
        this.f15336 = c4785;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        ArrayList<C23540> arrayList = new ArrayList();
        long jMo33964 = 0;
        for (C23540 c23540 : this.f15332) {
            if (c23540.m51886()) {
                arrayList.add(c23540);
                jMo33964 += c23540.m51884().mo33964();
            }
        }
        C3761 c3761 = new C3761(arrayList.size(), jMo33964);
        this.f15336.m13290(true);
        C7293 c7293 = new C7293(this.f15334);
        C13416 c13416 = new C13416(this, c3761);
        C16842 c16842 = this.f15333;
        c16842.m39499();
        try {
            for (C23540 c23541 : arrayList) {
                this.f15336.m13294(c23541.m51883());
                c7293.m19444(C21611.f70098, c23541.m51884().mo33986(), c23541.m51888(), C0674.f2826, c13416);
                if (this.f15336.m13282() || this.f15337.mo9170() == EnumC9414.DESTROYED) {
                    return;
                }
                c23541.m51889();
                c3761.m10992();
                this.f15330.add(c23541.m51883());
            }
        } finally {
            c16842.m39498();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C9183 c9183 = this.f15331;
        c9183.f31252 = false;
        if (this.f15336.m13282()) {
            C15829.m37611(R.string.MT_Protector);
            c9183.m23620(this.f15335, this.f15332, C16737.m39288(R.string.MT_Protector), true);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f15331.f31252 = false;
        final C11545 c11545 = this.f15335;
        Main mainM28824 = c11545.m28824();
        final ArrayList arrayList = this.f15332;
        mainM28824.m31002(exc, new DialogInterface.OnDismissListener() { // from class: l.֨᩺֨
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f5862.f15331.m23620(c11545, arrayList, C16737.m39288(R.string.MT_Protector), true);
            }
        });
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f15336.m13295();
        ArrayList arrayList = this.f15330;
        C11545 c11545 = this.f15335;
        c11545.m28777((Collection) arrayList);
        c11545.m28830();
        C21094.m47529(this.f15334.mo10276());
    }
}
