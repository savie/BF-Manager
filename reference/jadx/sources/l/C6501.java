package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes3.dex */
public final class C6501 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2557 f21911;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f21912;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f21913;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6501(Main main, C21422 c21422, String str, InterfaceC2557 interfaceC2557) {
        super(main, -1);
        this.f21913 = c21422;
        this.f21912 = str;
        this.f21911 = interfaceC2557;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        final C21422 c21422 = this.f21913;
        try {
            C2462.m7541(c21422.m47966(), EnumC11636.MODIFY_DIRECTORY_LINKED);
            String strM40352 = m40352();
            if (strM40352.equals(this.f21912) || strM40352.isEmpty()) {
                m40364();
                return;
            }
            InterfaceC2557 interfaceC2557 = this.f21911;
            final AbstractC20745 abstractC20745Mo7989 = interfaceC2557.mo7989();
            final AbstractC20745 abstractC20745M15313 = C5553.m15313(interfaceC2557.getParent(), strM40352);
            String strMo33986 = abstractC20745Mo7989.mo33986();
            EnumC11669 enumC11669M29115 = EnumC11669.m29115(abstractC20745Mo7989.mo33974());
            String strM15308 = C5553.m15308(abstractC20745Mo7989, abstractC20745M15313);
            if (strM15308 != null) {
                m40347(strM15308);
                if (strM15308.equals(C16737.m39288(R.string.MT_Protector)) && abstractC20745Mo7989.mo33971() && abstractC20745M15313.mo33971()) {
                    Main mainM47980 = c21422.m47980();
                    View viewM30995 = mainM47980.m30995(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.radioButton3)};
                    boolean z = C20370.m46024() && abstractC20745M15313.mo35233();
                    textView.setText(mainM47980.getString(R.string.MT_Protector, abstractC20745Mo7989.getName(), abstractC20745M15313.getName()));
                    if (!z) {
                        radioButtonArr[2].setVisibility(8);
                    }
                    byte bMo16345 = ApplicationC0716.f2992.mo16345((byte) 0, "rco");
                    final byte b = (bMo16345 < 0 || bMo16345 > 3) ? (byte) 0 : (z || bMo16345 != 2) ? bMo16345 : (byte) 1;
                    radioButtonArr[b].setChecked(true);
                    ViewOnClickListenerC11517 viewOnClickListenerC11517 = new ViewOnClickListenerC11517(1, radioButtonArr);
                    for (int i = 0; i < 4; i++) {
                        radioButtonArr[i].setOnClickListener(viewOnClickListenerC11517);
                    }
                    C8067 c8067BuildDialog = mainM47980.buildDialog();
                    c8067BuildDialog.m21258(viewM30995);
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۗ᩹
                        /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
                        /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0108  */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            AbstractC20745 abstractC20745M46693;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 4) {
                                    i3 = 0;
                                    break;
                                } else if (radioButtonArr[i3].isChecked()) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (b != i3) {
                                ApplicationC0716.f2992.edit().mo4064((byte) i3, "rco").apply();
                            }
                            AbstractC20745 abstractC20745 = abstractC20745M15313;
                            AbstractC20745 abstractC20746 = abstractC20745Mo7989;
                            if (i3 == 0) {
                                AbstractC20745 abstractC20745M46733 = abstractC20745.m46733(".tmp");
                                if (!abstractC20745.mo24646(abstractC20745M46733)) {
                                    C15829.m37611(R.string.MT_Protector);
                                    return;
                                } else {
                                    if (!abstractC20746.mo24646(abstractC20745)) {
                                        abstractC20745M46733.mo24646(abstractC20745);
                                        C15829.m37611(R.string.MT_Protector);
                                        return;
                                    }
                                    abstractC20745M46733.mo24646(abstractC20746);
                                }
                            } else if (i3 == 1) {
                                AbstractC20745 abstractC20745M46734 = abstractC20745.m46733(".tmp");
                                if (abstractC20745.mo24646(abstractC20745M46734)) {
                                    if (abstractC20746.mo24646(abstractC20745)) {
                                        abstractC20745M46734.mo24647();
                                    } else {
                                        abstractC20745M46734.mo24646(abstractC20745);
                                        C15829.m37611(R.string.MT_Protector);
                                        return;
                                    }
                                } else if (abstractC20746.mo24646(abstractC20745M46734)) {
                                    if (!abstractC20745.mo24647() || !abstractC20745M46734.mo24646(abstractC20745)) {
                                        abstractC20745M46734.mo24646(abstractC20746);
                                        C15829.m37611(R.string.MT_Protector);
                                        return;
                                    }
                                } else {
                                    C15829.m37611(R.string.MT_Protector);
                                    return;
                                }
                            } else {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        abstractC20745M46693 = C5553.m15313(abstractC20745.mo33986() + ".bak", new String[0]).m46693(true);
                                        if (!abstractC20745.mo24646(abstractC20745M46693)) {
                                            C15829.m37611(R.string.MT_Protector);
                                            return;
                                        } else if (!abstractC20746.mo24646(abstractC20745)) {
                                            abstractC20745M46693.mo24646(abstractC20745);
                                            C15829.m37611(R.string.MT_Protector);
                                            return;
                                        }
                                    }
                                    if (i3 != 0) {
                                        int i4 = C22252.f72742;
                                        C22252.m49404(abstractC20746.mo33986());
                                    } else {
                                        int i5 = C22252.f72742;
                                        C22252.m49408(abstractC20746.mo33986(), true);
                                    }
                                    C22252.m49408(abstractC20745.mo33986(), true);
                                    if (abstractC20745M46693 != null) {
                                        C22252.m49408(abstractC20745M46693.mo33986(), true);
                                    }
                                    c21422.m47971(abstractC20745.getName());
                                    C21094.m47530();
                                    C23186.m51173();
                                    this.m40364();
                                }
                                if (!abstractC20745.mo35234(new C14681())) {
                                    C15829.m37611(R.string.MT_Protector);
                                    return;
                                } else if (!abstractC20746.mo24646(abstractC20745)) {
                                    C15829.m37611(R.string.MT_Protector);
                                    return;
                                }
                            }
                            abstractC20745M46693 = null;
                            if (i3 != 0) {
                                int i6 = C22252.f72742;
                                C22252.m49404(abstractC20746.mo33986());
                            } else {
                                int i7 = C22252.f72742;
                                C22252.m49408(abstractC20746.mo33986(), true);
                            }
                            C22252.m49408(abstractC20745.mo33986(), true);
                            if (abstractC20745M46693 != null) {
                                C22252.m49408(abstractC20745M46693.mo33986(), true);
                            }
                            c21422.m47971(abstractC20745.getName());
                            C21094.m47530();
                            C23186.m51173();
                            this.m40364();
                        }
                    });
                    c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067BuildDialog.m21265(false);
                    c8067BuildDialog.m21269();
                    return;
                }
                return;
            }
            enumC11669M29115.m29117(strMo33986);
            int i2 = C22252.f72742;
            C22252.m49408(abstractC20745M15313.mo33986(), true);
            c21422.m47971(strM40352);
            C21094.m47530();
            C23186.m51173();
            m40364();
        } catch (C4987 e) {
            c21422.m47980().m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
