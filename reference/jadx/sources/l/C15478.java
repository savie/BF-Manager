package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15478 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f50390;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13241 f50391;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50392;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public StringBuilder f50393 = new StringBuilder();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C24720 f50394 = C24720.m55195();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7629 f50395;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50396;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50397;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f50398;

    public C15478(C13241 c13241, Main main, List list, boolean z, boolean z2, boolean z3, AbstractC7629 abstractC7629) {
        this.f50391 = c13241;
        this.f50390 = main;
        this.f50398 = list;
        this.f50396 = z;
        this.f50392 = z2;
        this.f50397 = z3;
        this.f50395 = abstractC7629;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f50390);
        this.f7780.m33190().setSingleLine(false);
        this.f7780.m33190().setMaxLines(3);
        this.f7780.m33188((Runnable) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f50394.m55199();
        Iterator it = this.f50398.iterator();
        while (it.hasNext()) {
            m37043((InterfaceC2386) it.next(), "");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37043(InterfaceC2386 interfaceC2386, String str) {
        if (interfaceC2386.mo8106() || this.f7780.m33196()) {
            return;
        }
        boolean z = this.f50396;
        StringBuilder sb = this.f50393;
        if (z) {
            sb.append(str);
            sb.append(interfaceC2386.getName());
        } else {
            sb.append(interfaceC2386.getPath());
        }
        if (this.f50392 && interfaceC2386.isDirectory()) {
            sb.append('/');
        }
        sb.append('\n');
        if (this.f50397 && interfaceC2386.isDirectory()) {
            if (this.f50394.m55199()) {
                C13511 c13511 = this.f7780;
                StringBuilder sbM27333 = C10732.m27333(str);
                sbM27333.append(interfaceC2386.getName());
                c13511.m33189(sbM27333.toString());
            }
            StringBuilder sbM27334 = C10732.m27333(str);
            sbM27334.append(interfaceC2386.getName());
            sbM27334.append("/");
            String string = sbM27334.toString();
            ArrayList arrayListMo20830 = this.f50395.mo20830(interfaceC2386.getPath(), true);
            C14118.m34287(arrayListMo20830, 0, false);
            Iterator it = arrayListMo20830.iterator();
            while (it.hasNext()) {
                m37043((InterfaceC2386) it.next(), string);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f7780.m33196()) {
            return;
        }
        StringBuilder sb = this.f50393;
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        ActivityC4300.m13685(this.f50390, sb.toString(), C21576.m49088(this.f50391.m25627()), null, null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f50390.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
