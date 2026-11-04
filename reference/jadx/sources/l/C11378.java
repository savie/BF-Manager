package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AJ9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11378 implements InterfaceC14864 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f35807;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f35808;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f35809;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public volatile boolean f35810;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f35811;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f35812;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f35813 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f35814;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f35815;

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int mo28696(String str, C21578 c21578, C21578 c21579, boolean z, boolean z2) {
        return C8008.m21872(this, str, c21578, c21579, z, z2);
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo28698(boolean z) {
        return !z && mo28694();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public C11378(AbstractActivityC17204 abstractActivityC17204) {
        boolean z;
        if (C19632.m45281()) {
            z = C21576.f68932.getBoolean("def_mov_recycle_bin", true);
        }
        this.f35808 = z;
        this.f35812 = 0;
        this.f35815 = abstractActivityC17204;
        this.f35811 = false;
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final void mo28702() {
        this.f35811 = true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m28703() {
        this.f35809 = true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m28701() {
        this.f35814 = true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m28699(String str) {
        C21578 c21578 = C21578.f68936;
        mo28697(str, c21578, c21578, false);
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28697(final String str, final C21578 c21578, final C21578 c21579, final boolean z) {
        C22415.m50556();
        this.f35810 = true;
        C21576.m49068(new Runnable() { // from class: l.۫ۙ۫
            @Override // java.lang.Runnable
            public final void run() {
                C11378.m28692(this.f41198, str, c21578, c21579, z);
            }
        });
        while (this.f35810) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28692(final C11378 c11378, String str, C21578 c21578, C21578 c21579, boolean z) {
        AbstractActivityC17204 abstractActivityC17204 = c11378.f35815;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(str);
        C0695.m3002(viewM40395, c21578, c21579);
        int i = 1;
        final RadioButton[] radioButtonArr = {(RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.radioButton3)};
        if (c11378.f35811) {
            radioButtonArr[0].setText(R.string.MT_Protector);
            radioButtonArr[2].setText(R.string.MT_Protector);
        }
        if (c11378.f35814) {
            radioButtonArr[2].setVisibility(8);
        }
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        if (c11378.f35809) {
            checkBox.setVisibility(8);
            viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        final CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        checkBox2.setChecked(c11378.f35808);
        final boolean z2 = z && C19632.m45281();
        if (z2) {
            checkBox2.setVisibility(c11378.f35812 == 0 ? 0 : 8);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۚۙ۫
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
            radioButtonArr[i2].setChecked(i2 == c11378.f35812);
            radioButtonArr[i2].setOnClickListener(onClickListener);
            i2++;
        }
        int i3 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8012(false);
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫ۙ۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C11378.m28693(this.f5791, radioButtonArr, checkBox, checkBox2);
            }
        });
        c2361.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC4724(i, c11378));
        c2361.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28693(C11378 c11378, RadioButton[] radioButtonArr, CheckBox checkBox, CheckBox checkBox2) {
        c11378.f35810 = false;
        if (radioButtonArr[0].isChecked()) {
            c11378.f35812 = 0;
        } else if (radioButtonArr[1].isChecked()) {
            c11378.f35812 = 1;
        } else {
            c11378.f35812 = 2;
        }
        c11378.f35813 = checkBox.isChecked();
        c11378.f35808 = checkBox2.isChecked();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28691(C11378 c11378) {
        c11378.f35807 = true;
        c11378.f35810 = false;
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean mo28694() {
        return !this.f35813;
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean mo28695() {
        return this.f35808;
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo28700() {
        return this.f35812;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f35807;
    }
}
