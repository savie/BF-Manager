package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ۧ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: O515 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20525 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Spinner f65734;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f65735;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Spinner f65736;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f65737;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f65738;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f65739;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f65740;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65741;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CheckBox f65742;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f65743;

    public C20525(final Main main, String str, String str2, boolean z, Runnable runnable) {
        this.f65737 = z;
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        this.f65738 = (TextView) viewM40395.findViewById(R.id.title);
        this.f65736 = (Spinner) viewM40395.findViewById(R.id.spinner1);
        this.f65734 = (Spinner) viewM40395.findViewById(R.id.spinner2);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f65735 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f65742 = checkBox2;
        if (!z) {
            checkBox.setVisibility(8);
            checkBox2.setVisibility(8);
        }
        C2361 c2361BuildDialog = main.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        this.f65743 = c2361BuildDialog.m7999();
        ArrayList arrayListM55393 = C24868.m55393();
        this.f65741 = arrayListM55393;
        int size = arrayListM55393.size();
        String[] strArr = new String[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C11441 c11441 = (C11441) this.f65741.get(i2);
            strArr[i2] = c11441.f35957 + " - " + c11441.f35958;
        }
        C3054 c3054 = new C3054(main, strArr);
        this.f65736.setAdapter((SpinnerAdapter) c3054);
        this.f65734.setAdapter((SpinnerAdapter) c3054);
        this.f65736.setOnClickListener(new View.OnClickListener() { // from class: l.ܽۧ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20525.m47049(this.f57017, main);
            }
        });
        this.f65734.setOnClickListener(new View.OnClickListener() { // from class: l.ܶۧ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20525.m47051(this.f52049, main);
            }
        });
        if (str == null) {
            Spinner spinner = this.f65736;
            this.f65740 = 0;
            spinner.setSelection(0);
        } else {
            Spinner spinner2 = this.f65736;
            ArrayList arrayList = this.f65741;
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    i3 = 0;
                    break;
                } else if (((C11441) arrayList.get(i3)).f35957.equals(str)) {
                    break;
                } else {
                    i3++;
                }
            }
            this.f65740 = i3;
            spinner2.setSelection(i3);
        }
        if (str2 == null) {
            Spinner spinner3 = this.f65734;
            this.f65739 = 0;
            spinner3.setSelection(0);
        } else {
            Spinner spinner4 = this.f65734;
            ArrayList arrayList2 = this.f65741;
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                if (((C11441) arrayList2.get(i4)).f35957.equals(str2)) {
                    i = i4;
                    break;
                }
            }
            this.f65739 = i;
            spinner4.setSelection(i);
        }
        this.f65743.m22424(-1, C21576.m49088(R.string.MT_Protector), new DialogInterfaceOnClickListenerC7670(1, runnable));
        this.f65743.m22424(-2, C21576.m49088(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47049(final C20525 c20525, AbstractActivityC17204 abstractActivityC17204) {
        C4270 c4270 = new C4270(abstractActivityC17204, c20525.f65741);
        c4270.m13611(R.string.MT_Protector);
        c4270.m13609(c20525.f65736.getSelectedItemPosition());
        c4270.m13610(new InterfaceC24408() { // from class: l.ۗۧ۫
            @Override // l.InterfaceC24408
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo11073(int i, C11441 c11441) {
                this.f10984.f65736.setSelection(i);
            }
        });
        c4270.m13608();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47051(final C20525 c20525, AbstractActivityC17204 abstractActivityC17204) {
        C4270 c4270 = new C4270(abstractActivityC17204, c20525.f65741);
        c4270.m13611(R.string.MT_Protector);
        c4270.m13609(c20525.f65734.getSelectedItemPosition());
        c4270.m13610(new InterfaceC24408() { // from class: l.᩹ۧ۫
            @Override // l.InterfaceC24408
            /* JADX INFO: renamed from: ۙ */
            public final void mo11073(int i, C11441 c11441) {
                this.f75987.f65734.setSelection(i);
            }
        });
        c4270.m13608();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m47056() {
        return this.f65736.getSelectedItemPosition() != this.f65740 || this.f65734.getSelectedItemPosition() != this.f65739 || m47054() || m47058();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m47054() {
        return this.f65737 && this.f65735.isChecked();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m47058() {
        return this.f65737 && this.f65742.isChecked();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m47057() {
        return ((C11441) this.f65741.get(this.f65736.getSelectedItemPosition())).f35958;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47052() {
        return ((C11441) this.f65741.get(this.f65734.getSelectedItemPosition())).f35958;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m47055() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f65743;
        dialogInterfaceC8327.m22432();
        C5416.m16144(dialogInterfaceC8327);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47053(String str) {
        this.f65738.setText(str);
    }
}
