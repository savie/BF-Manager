package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 37SW */
/* JADX INFO: loaded from: classes4.dex */
public final class C10345 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f32954;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f32955;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f32956;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f32957;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1397 f32958;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f32959;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18881 f32960;

    public C10345(C1397 c1397, AbstractActivityC17204 abstractActivityC17204, AbstractC18881 abstractC18881, View view, Runnable runnable, String str, String str2) {
        this.f32958 = c1397;
        this.f32957 = abstractActivityC17204;
        this.f32960 = abstractC18881;
        this.f32959 = view;
        this.f32954 = runnable;
        this.f32956 = str;
        this.f32955 = str2;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8193(this.f32957, R.string.MT_Protector, 100, new Runnable() { // from class: l.ᩳ᩵۫
            @Override // java.lang.Runnable
            public final void run() {
                C10345.m26609(this.f62370);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26609(C10345 c10345) {
        c10345.f7780.m33188((Runnable) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f32958.f4971 = this.f32960.mo43785();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C13511 c13511 = this.f7780;
        if (c13511 == null || !c13511.m33196()) {
            AbstractActivityC17204 abstractActivityC17204 = this.f32957;
            C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
            c2361BuildDialog.m8005(this.f32959);
            String strM49088 = C21576.m49088(R.string.MT_Protector);
            final Runnable runnable = this.f32954;
            c2361BuildDialog.m8019(strM49088, new DialogInterface.OnClickListener() { // from class: l.۟᩵۫
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    runnable.run();
                }
            });
            c2361BuildDialog.m8009(C21576.m49088(R.string.MT_Protector), (DialogInterface.OnClickListener) null);
            DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
            C1397 c1397 = this.f32958;
            c1397.f4973 = dialogInterfaceC8327M8016;
            c1397.f4966.setAdapter((SpinnerAdapter) new C3054(abstractActivityC17204, c1397.f4971.m1717()));
            c1397.f4964.setAdapter((SpinnerAdapter) new C3054(abstractActivityC17204, c1397.f4971.m1716()));
            String str = this.f32956;
            if (str == null) {
                Spinner spinner = c1397.f4966;
                c1397.f4970 = 0;
                spinner.setSelection(0);
            } else {
                Spinner spinner2 = c1397.f4966;
                int iM5095 = C1397.m5095(c1397, str);
                c1397.f4970 = iM5095;
                spinner2.setSelection(iM5095);
            }
            String str2 = this.f32955;
            if (str2 == null) {
                Spinner spinner3 = c1397.f4964;
                c1397.f4969 = 0;
                spinner3.setSelection(0);
            } else {
                Spinner spinner4 = c1397.f4964;
                int iM5089 = C1397.m5089(c1397, str2);
                c1397.f4969 = iM5089;
                spinner4.setSelection(iM5089);
            }
            C5416.m16144(c1397.f4973);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C13511 c13511 = this.f7780;
        if (c13511 == null || !c13511.m33196()) {
            this.f32957.m40401(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
