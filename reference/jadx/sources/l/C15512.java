package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15512 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f50515;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50516;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2557 f50517;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12233 f50518;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f50519;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50520;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15512(Main main, String str, boolean z, Map map, InterfaceC2557 interfaceC2557, C21422 c21422, AbstractC12233 abstractC12233) {
        super(main, -1);
        this.f50519 = str;
        this.f50520 = z;
        this.f50516 = map;
        this.f50517 = interfaceC2557;
        this.f50515 = c21422;
        this.f50518 = abstractC12233;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        final String strM40352 = m40352();
        String str = this.f50519;
        if (strM40352.equals(str) || strM40352.length() == 0) {
            m40364();
            return;
        }
        if (strM40352.contains("\\") || strM40352.contains("/")) {
            m40365(R.string.MT_Protector);
            return;
        }
        if (!this.f50520 || !strM40352.equalsIgnoreCase(str)) {
            ?? r0 = this.f50516;
            if (r0.containsKey(strM40352)) {
                if (((Boolean) r0.get(strM40352)).booleanValue()) {
                    m40365(R.string.MT_Protector);
                    return;
                }
                m40365(R.string.MT_Protector);
                final InterfaceC2557 interfaceC2557 = this.f50517;
                if (interfaceC2557.mo7985()) {
                    final C21422 c21422 = this.f50515;
                    final Main mainM47980 = c21422.m47980();
                    View viewM30995 = mainM47980.m30995(R.layout.MT_Protector);
                    TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
                    viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
                    final RadioButton[] radioButtonArr = {(RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.radioButton3)};
                    textView.setText(mainM47980.getString(R.string.MT_Protector, interfaceC2557.getName(), strM40352));
                    byte bMo16345 = ApplicationC0716.f2992.mo16345((byte) 0, "rcon");
                    byte b = (bMo16345 < 0 || bMo16345 > 2) ? (byte) 0 : bMo16345;
                    radioButtonArr[b].setChecked(true);
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۘ᩹֨
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            RadioButton[] radioButtonArr2 = radioButtonArr;
                            int length = radioButtonArr2.length;
                            for (int i = 0; i < length; i++) {
                                RadioButton radioButton = radioButtonArr2[i];
                                radioButton.setChecked(view == radioButton);
                            }
                        }
                    };
                    for (int i = 0; i < 3; i++) {
                        radioButtonArr[i].setOnClickListener(onClickListener);
                    }
                    C8067 c8067BuildDialog = mainM47980.buildDialog();
                    c8067BuildDialog.m21258(viewM30995);
                    final AbstractC12233 abstractC12233 = this.f50518;
                    final byte b2 = b;
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜ᩹֨
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= 3) {
                                    i3 = 0;
                                    break;
                                } else {
                                    if (radioButtonArr[i4].isChecked()) {
                                        i3 = i4;
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            if (b2 != i3) {
                                ApplicationC0716.f2992.edit().mo4064((byte) i3, "rcon").apply();
                            }
                            InterfaceC2557 interfaceC2558 = interfaceC2557;
                            String path = interfaceC2558.getPath();
                            String parent = interfaceC2558.getParent();
                            String str2 = strM40352;
                            new C18333(mainM47980, i3, parent, abstractC12233, C6730.m18162(parent, str2), path, c21422, str2, this).m10243();
                        }
                    });
                    c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067BuildDialog.m21265(false);
                    c8067BuildDialog.m21269();
                    return;
                }
                return;
            }
        }
        new C23273(this, strM40352).m10243();
    }
}
