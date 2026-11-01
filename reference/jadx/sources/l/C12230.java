package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12230 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C1777 f40861;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f40862;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f40863;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23519 f40864;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f40865;

    public C12230(C23519 c23519, int[] iArr, Runnable runnable) {
        this.f40864 = c23519;
        this.f40863 = iArr;
        this.f40862 = runnable;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f40864.f76117);
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f40861 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C23519 c23519;
        int[] iArr = this.f40863;
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        while (true) {
            c23519 = this.f40864;
            if (i >= length) {
                break;
            }
            arrayList.add((InterfaceC20957) c23519.f76119[iArr[i]].f36844.get());
            i++;
        }
        AbstractC9677 abstractC9677Mo13029 = c23519.f76115.m28817().mo13029();
        C8963 c8963 = new C8963(arrayList);
        try {
            abstractC9677Mo13029.mo24618(null, c23519.f76116, new C16463(this, c8963));
            c8963.close();
            if (this.f40865 || this.f40861.m5824()) {
                return;
            }
            this.f40861.m5840(100);
            c23519.f76118.m40086(arrayList, iArr);
        } catch (Throwable th) {
            try {
                c8963.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f40865 || this.f40861.m5824()) {
            return;
        }
        this.f40862.run();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f40864.f76117.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f40861.m5825();
        C15829.m37616();
    }
}
