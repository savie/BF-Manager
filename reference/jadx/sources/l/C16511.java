package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes5.dex */
public final class C16511 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f53478;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2386 f53479;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f53480;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16511(Main main, C12915 c12915, String str, InterfaceC2386 interfaceC2386) {
        super(main, -1);
        this.f53478 = c12915;
        this.f53480 = str;
        this.f53479 = interfaceC2386;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        final C12915 c12915 = this.f53478;
        try {
            C6265.m17912(c12915.m31976(), EnumC12230.MODIFY_DIRECTORY_LINKED);
            String strM22914 = m22914();
            if (strM22914.equals(this.f53480) || strM22914.isEmpty()) {
                m22951();
                return;
            }
            InterfaceC2386 interfaceC2386 = this.f53479;
            final AbstractC22044 abstractC22044Mo8093 = interfaceC2386.mo8093();
            final AbstractC22044 abstractC22044M35193 = C14584.m35193(interfaceC2386.getParent(), strM22914);
            String strMo4294 = abstractC22044Mo8093.mo4294();
            EnumC22346 enumC22346M50415 = EnumC22346.m50415(abstractC22044Mo8093.mo4281());
            String strM35188 = C14584.m35188(abstractC22044Mo8093, abstractC22044M35193);
            if (strM35188 != null) {
                m22925(strM35188);
                if (strM35188.equals(C21576.m49088(R.string.MT_Protector)) && abstractC22044Mo8093.mo4304() && abstractC22044M35193.mo4304()) {
                    Main mainM31979 = c12915.m31979();
                    View viewM40395 = mainM31979.m40395(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.radioButton3)};
                    boolean z = C19632.m45281() && abstractC22044M35193.mo4292();
                    textView.setText(mainM31979.getString(R.string.MT_Protector, abstractC22044Mo8093.getName(), abstractC22044M35193.getName()));
                    if (!z) {
                        radioButtonArr[2].setVisibility(8);
                    }
                    byte bMo7901 = ApplicationC17729.f58258.mo7901((byte) 0, "rco");
                    final byte b = (bMo7901 < 0 || bMo7901 > 3) ? (byte) 0 : (z || bMo7901 != 2) ? bMo7901 : (byte) 1;
                    radioButtonArr[b].setChecked(true);
                    ViewOnClickListenerC3238 viewOnClickListenerC3238 = new ViewOnClickListenerC3238(3, radioButtonArr);
                    for (int i = 0; i < 4; i++) {
                        radioButtonArr[i].setOnClickListener(viewOnClickListenerC3238);
                    }
                    C2361 c2361BuildDialog = mainM31979.buildDialog();
                    c2361BuildDialog.m8005(viewM40395);
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻֫۫
                        /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
                        /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0108  */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            AbstractC22044 abstractC22044M49839;
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
                                ApplicationC17729.f58258.edit().mo3485((byte) i3, "rco").apply();
                            }
                            AbstractC22044 abstractC22044 = abstractC22044M35193;
                            AbstractC22044 abstractC22045 = abstractC22044Mo8093;
                            if (i3 == 0) {
                                AbstractC22044 abstractC22044M49862 = abstractC22044.m49862(".tmp");
                                if (!abstractC22044.mo4301(abstractC22044M49862)) {
                                    C22673.m51152(R.string.MT_Protector);
                                    return;
                                } else {
                                    if (!abstractC22045.mo4301(abstractC22044)) {
                                        abstractC22044M49862.mo4301(abstractC22044);
                                        C22673.m51152(R.string.MT_Protector);
                                        return;
                                    }
                                    abstractC22044M49862.mo4301(abstractC22045);
                                }
                            } else if (i3 == 1) {
                                AbstractC22044 abstractC22044M49863 = abstractC22044.m49862(".tmp");
                                if (abstractC22044.mo4301(abstractC22044M49863)) {
                                    if (abstractC22045.mo4301(abstractC22044)) {
                                        abstractC22044M49863.mo4296();
                                    } else {
                                        abstractC22044M49863.mo4301(abstractC22044);
                                        C22673.m51152(R.string.MT_Protector);
                                        return;
                                    }
                                } else if (abstractC22045.mo4301(abstractC22044M49863)) {
                                    if (!abstractC22044.mo4296() || !abstractC22044M49863.mo4301(abstractC22044)) {
                                        abstractC22044M49863.mo4301(abstractC22045);
                                        C22673.m51152(R.string.MT_Protector);
                                        return;
                                    }
                                } else {
                                    C22673.m51152(R.string.MT_Protector);
                                    return;
                                }
                            } else {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        abstractC22044M49839 = C14584.m35193(abstractC22044.mo4294() + ".bak", new String[0]).m49839(true);
                                        if (!abstractC22044.mo4301(abstractC22044M49839)) {
                                            C22673.m51152(R.string.MT_Protector);
                                            return;
                                        } else if (!abstractC22045.mo4301(abstractC22044)) {
                                            abstractC22044M49839.mo4301(abstractC22044);
                                            C22673.m51152(R.string.MT_Protector);
                                            return;
                                        }
                                    }
                                    if (i3 != 0) {
                                        int i4 = C20108.f64607;
                                        C20108.m46239(abstractC22045.mo4294());
                                    } else {
                                        int i5 = C20108.f64607;
                                        C20108.m46233(abstractC22045.mo4294(), true);
                                    }
                                    C20108.m46233(abstractC22044.mo4294(), true);
                                    if (abstractC22044M49839 != null) {
                                        C20108.m46233(abstractC22044M49839.mo4294(), true);
                                    }
                                    c12915.m31975(abstractC22044.getName());
                                    C6331.m18055();
                                    C22961.m51805();
                                    this.m22951();
                                }
                                if (!abstractC22044.mo4300(new C8730())) {
                                    C22673.m51152(R.string.MT_Protector);
                                    return;
                                } else if (!abstractC22045.mo4301(abstractC22044)) {
                                    C22673.m51152(R.string.MT_Protector);
                                    return;
                                }
                            }
                            abstractC22044M49839 = null;
                            if (i3 != 0) {
                                int i6 = C20108.f64607;
                                C20108.m46239(abstractC22045.mo4294());
                            } else {
                                int i7 = C20108.f64607;
                                C20108.m46233(abstractC22045.mo4294(), true);
                            }
                            C20108.m46233(abstractC22044.mo4294(), true);
                            if (abstractC22044M49839 != null) {
                                C20108.m46233(abstractC22044M49839.mo4294(), true);
                            }
                            c12915.m31975(abstractC22044.getName());
                            C6331.m18055();
                            C22961.m51805();
                            this.m22951();
                        }
                    });
                    c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog.m8012(false);
                    c2361BuildDialog.m8016();
                    return;
                }
                return;
            }
            enumC22346M50415.m50417(strMo4294);
            int i2 = C20108.f64607;
            C20108.m46233(abstractC22044M35193.mo4294(), true);
            c12915.m31975(strM22914);
            C6331.m18055();
            C22961.m51805();
            m22951();
        } catch (C4866 e) {
            c12915.m31979().m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
