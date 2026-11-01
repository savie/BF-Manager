package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 37SW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11008 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f37433;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f37434;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f37435;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f37436;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f37437;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23708 f37438;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12233 f37439;

    public C11008(C23708 c23708, AbstractActivityC12483 abstractActivityC12483, AbstractC12233 abstractC12233, View view, Runnable runnable, String str, String str2) {
        this.f37438 = c23708;
        this.f37433 = abstractActivityC12483;
        this.f37439 = abstractC12233;
        this.f37437 = view;
        this.f37434 = runnable;
        this.f37435 = str;
        this.f37436 = str2;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10248(this.f37433, R.string.MT_Protector, 100, new Runnable() { // from class: l.ۛ۬֨
            @Override // java.lang.Runnable
            public final void run() {
                C11008.m27765(this.f20572);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27765(C11008 c11008) {
        c11008.f12806.m40697((Runnable) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f37438.f76725 = this.f37439.mo30343();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C17485 c17485 = this.f12806;
        if (c17485 == null || !c17485.m40693()) {
            AbstractActivityC12483 abstractActivityC12483 = this.f37433;
            C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
            c8067BuildDialog.m21258(this.f37437);
            String strM39288 = C16737.m39288(R.string.MT_Protector);
            final Runnable runnable = this.f37434;
            c8067BuildDialog.m21272(strM39288, new DialogInterface.OnClickListener() { // from class: l.ܿ۬֨
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    runnable.run();
                }
            });
            c8067BuildDialog.m21262(C16737.m39288(R.string.MT_Protector), (DialogInterface.OnClickListener) null);
            DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
            C23708 c23708 = this.f37438;
            c23708.f76722 = dialogInterfaceC19356M21269;
            c23708.f76728.setAdapter((SpinnerAdapter) new C0733(abstractActivityC12483, c23708.f76725.m1604()));
            c23708.f76723.setAdapter((SpinnerAdapter) new C0733(abstractActivityC12483, c23708.f76725.m1603()));
            String str = this.f37435;
            if (str == null) {
                Spinner spinner = c23708.f76728;
                c23708.f76730 = 0;
                spinner.setSelection(0);
            } else {
                Spinner spinner2 = c23708.f76728;
                int iM52191 = C23708.m52191(c23708, str);
                c23708.f76730 = iM52191;
                spinner2.setSelection(iM52191);
            }
            String str2 = this.f37436;
            if (str2 == null) {
                Spinner spinner3 = c23708.f76723;
                c23708.f76721 = 0;
                spinner3.setSelection(0);
            } else {
                Spinner spinner4 = c23708.f76723;
                int iM52185 = C23708.m52185(c23708, str2);
                c23708.f76721 = iM52185;
                spinner4.setSelection(iM52185);
            }
            C23250.m51309(c23708.f76722);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C17485 c17485 = this.f12806;
        if (c17485 == null || !c17485.m40693()) {
            this.f37433.m31002(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
