package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5114 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f17811;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f17812;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0880 f17813;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f17814;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC10138 f17816;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f17815 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22959 f17810 = C22959.m50797();

    public C5114(C0880 c0880, long j, boolean z, boolean z2, RunnableC10138 runnableC10138) {
        this.f17813 = c0880;
        this.f17814 = j;
        this.f17811 = z;
        this.f17812 = z2;
        this.f17816 = runnableC10138;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f17813.f3569.m28824(), R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        ArrayList<C22048> arrayList = new ArrayList();
        C0880 c0880 = this.f17813;
        for (InterfaceC2557 interfaceC2557 : c0880.f3572) {
            AbstractC20745 abstractC20745Mo7989 = interfaceC2557.mo7989();
            String name = interfaceC2557.getName();
            if ((this.f17811 || this.f17812) && interfaceC2557.isDirectory() && !interfaceC2557.mo7986()) {
                for (AbstractC20745 abstractC20745 : abstractC20745Mo7989.mo33983(true)) {
                    StringBuilder sbM8976 = C3012.m8976(name, "/");
                    sbM8976.append(abstractC20745.getName());
                    m14260(arrayList, abstractC20745, sbM8976.toString());
                }
            }
            arrayList.add(new C22048(abstractC20745Mo7989, name));
        }
        try {
            for (C22048 c22048 : arrayList) {
                if (this.f17810.m50802()) {
                    this.f12806.m40698(c22048.f71467);
                }
                AbstractC20745 abstractC20746 = c22048.f71466;
                if (abstractC20746.mo8448() && abstractC20746.mo32855(this.f17814)) {
                    this.f17815 = true;
                }
            }
        } finally {
            if (this.f17815) {
                for (InterfaceC2557 interfaceC2558 : c0880.f3572) {
                    interfaceC2558.setTime(interfaceC2558.mo7989().mo33991());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14260(ArrayList arrayList, AbstractC20745 abstractC20745, String str) {
        if (abstractC20745.m46723()) {
            return;
        }
        if (!abstractC20745.mo33974()) {
            if (this.f17811) {
                arrayList.add(new C22048(abstractC20745, str));
                return;
            }
            return;
        }
        for (AbstractC20745 abstractC20746 : abstractC20745.mo33983(true)) {
            StringBuilder sbM8976 = C3012.m8976(str, "/");
            sbM8976.append(abstractC20746.getName());
            m14260(arrayList, abstractC20746, sbM8976.toString());
        }
        if (this.f17812) {
            arrayList.add(new C22048(abstractC20745, str));
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f17815) {
            this.f17816.run();
            C15829.m37611(R.string.MT_Protector);
        } else {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f17815) {
            this.f17816.run();
        }
        this.f17813.f3569.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
