package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩻᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes.dex */
public final class C25374 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6728 f81918;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f81920;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12765 f81922;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18881 f81923;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f81924;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8585 f81925;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f81921 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C12919 f81919 = new C12919(0);

    public C25374(C6728 c6728, C8614 c8614, C20168 c20168, ArrayList arrayList, AbstractC18881 abstractC18881) {
        this.f81918 = c6728;
        this.f81924 = c8614;
        this.f81925 = c20168;
        this.f81920 = arrayList;
        this.f81923 = abstractC18881;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C12765 c12765 = new C12765(this.f81924.m23233());
        c12765.m31643(C21576.m49075(R.string.MT_Protector));
        c12765.m31635((Runnable) null);
        c12765.m31640();
        this.f81922 = c12765;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ArrayList<C21120> arrayList = new ArrayList();
        long jMo4285 = 0;
        for (C21120 c21120 : this.f81920) {
            if (c21120.m48219()) {
                arrayList.add(c21120);
                jMo4285 += c21120.m48215().mo4285();
            }
        }
        C1858 c1858 = new C1858(arrayList.size(), jMo4285);
        C12765 c12765 = this.f81922;
        c12765.getClass();
        c12765.m31645(R.string.MT_Protector);
        C3965 c3965 = new C3965(this.f81923);
        C11947 c11947 = new C11947(this, c1858);
        C12919 c12919 = this.f81919;
        c12919.m31997();
        try {
            for (C21120 c21121 : arrayList) {
                this.f81922.m31639(c21121.m48221());
                c3965.m12712(C11969.f38536, c21121.m48215().mo4294(), c21121.m48220(), C17423.f56646, c11947);
                if (this.f81922.m31648() || this.f81925.mo23076() == EnumC2619.DESTROYED) {
                    return;
                }
                c21121.m48218();
                c1858.m6376();
                this.f81921.add(c21121.m48221());
            }
        } finally {
            c12919.m31996();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C6728 c6728 = this.f81918;
        c6728.f22419 = false;
        if (this.f81922.m31648()) {
            C22673.m51152(R.string.MT_Protector);
            c6728.m18791(this.f81924, this.f81920, C21576.m49088(R.string.MT_Protector), true);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f81918.f22419 = false;
        final C8614 c8614 = this.f81924;
        Main mainM23233 = c8614.m23233();
        final ArrayList arrayList = this.f81920;
        mainM23233.m40401(exc, new DialogInterface.OnDismissListener() { // from class: l.֫᩺۫
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f7370.f81918.m18791(c8614, arrayList, C21576.m49088(R.string.MT_Protector), true);
            }
        });
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f81922.m31644();
        ArrayList arrayList = this.f81921;
        C8614 c8614 = this.f81924;
        c8614.m23176((Collection) arrayList);
        c8614.m23216();
        C6331.m18054(this.f81923.mo35579());
    }
}
