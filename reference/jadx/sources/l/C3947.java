package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AJ9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3947 implements InterfaceC16088 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f14671 = false;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f14672;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f14673;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f14674;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f14675;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f14676;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f14677;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f14678;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public volatile boolean f14679;

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int mo11423(String str, C20321 c20321, C20321 c20322, boolean z, boolean z2) {
        return C17745.m41306(this, str, c20321, c20322, z, z2);
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11425(boolean z) {
        return !z && mo11428();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public C3947(AbstractActivityC12483 abstractActivityC12483) {
        boolean z;
        if (C20370.m46024()) {
            z = C16737.f53615.getBoolean("def_mov_recycle_bin", true);
        }
        this.f14673 = z;
        this.f14675 = 0;
        this.f14678 = abstractActivityC12483;
        this.f14672 = false;
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final void mo11427() {
        this.f14672 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11430() {
        this.f14674 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m11426() {
        this.f14677 = true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m11429(String str) {
        C20321 c20321 = C20321.f65801;
        mo11424(str, c20321, c20321, false);
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11424(final String str, final C20321 c20321, final C20321 c20322, final boolean z) {
        C13890.m33727();
        this.f14679 = true;
        C16737.m39273(new Runnable() { // from class: l.᩹۫᩹
            @Override // java.lang.Runnable
            public final void run() {
                C3947.m11421(this.f72830, str, c20321, c20322, z);
            }
        });
        while (this.f14679) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11421(final C3947 c3947, String str, C20321 c20321, C20321 c20322, boolean z) {
        AbstractActivityC12483 abstractActivityC12483 = c3947.f14678;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(str);
        C16793.m39443(viewM30995, c20321, c20322);
        int i = 3;
        final RadioButton[] radioButtonArr = {(RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.radioButton3)};
        if (c3947.f14672) {
            radioButtonArr[0].setText(R.string.MT_Protector);
            radioButtonArr[2].setText(R.string.MT_Protector);
        }
        if (c3947.f14677) {
            radioButtonArr[2].setVisibility(8);
        }
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        if (c3947.f14674) {
            checkBox.setVisibility(8);
            viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        final CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        checkBox2.setChecked(c3947.f14673);
        final boolean z2 = z && C20370.m46024();
        if (z2) {
            checkBox2.setVisibility(c3947.f14675 == 0 ? 0 : 8);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.֨۫᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadioButton[] radioButtonArr2 = radioButtonArr;
                int length = radioButtonArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    RadioButton radioButton = radioButtonArr2[i2];
                    radioButton.setChecked(radioButton == view);
                }
                if (z2) {
                    checkBox2.setVisibility(view.getId() != R.id.MT_Protector ? 8 : 0);
                }
            }
        };
        int i2 = 0;
        while (i2 < 3) {
            radioButtonArr[i2].setChecked(i2 == c3947.f14675);
            radioButtonArr[i2].setOnClickListener(onClickListener);
            i2++;
        }
        int i3 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21265(false);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬۫᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C3947.m11422(this.f43699, radioButtonArr, checkBox, checkBox2);
            }
        });
        c8067.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2627(i, c3947));
        c8067.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11422(C3947 c3947, RadioButton[] radioButtonArr, CheckBox checkBox, CheckBox checkBox2) {
        c3947.f14679 = false;
        if (radioButtonArr[0].isChecked()) {
            c3947.f14675 = 0;
        } else if (radioButtonArr[1].isChecked()) {
            c3947.f14675 = 1;
        } else {
            c3947.f14675 = 2;
        }
        c3947.f14671 = checkBox.isChecked();
        c3947.f14673 = checkBox2.isChecked();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11420(C3947 c3947) {
        c3947.f14676 = true;
        c3947.f14679 = false;
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean mo11428() {
        return !this.f14671;
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo11432() {
        return this.f14673;
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo11431() {
        return this.f14675;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f14676;
    }
}
