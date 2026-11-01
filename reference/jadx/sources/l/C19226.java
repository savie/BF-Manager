package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O515 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19226 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f62112;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f62113;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Spinner f62114;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f62115;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f62116;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final TextView f62117;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f62118;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Spinner f62119;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CheckBox f62120;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f62121;

    public C19226(final Main main, String str, String str2, boolean z, final Runnable runnable) {
        this.f62118 = z;
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        this.f62117 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f62119 = (Spinner) viewM30995.findViewById(R.id.spinner1);
        this.f62114 = (Spinner) viewM30995.findViewById(R.id.spinner2);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f62115 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f62120 = checkBox2;
        if (!z) {
            checkBox.setVisibility(8);
            checkBox2.setVisibility(8);
        }
        C8067 c8067BuildDialog = main.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        this.f62113 = c8067BuildDialog.m21252();
        ArrayList arrayListM5803 = C1757.m5803();
        this.f62116 = arrayListM5803;
        int size = arrayListM5803.size();
        String[] strArr = new String[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C14459 c14459 = (C14459) this.f62116.get(i2);
            strArr[i2] = c14459.f47427 + " - " + c14459.f47424;
        }
        C0733 c0733 = new C0733(main, strArr);
        this.f62119.setAdapter((SpinnerAdapter) c0733);
        this.f62114.setAdapter((SpinnerAdapter) c0733);
        this.f62119.setOnClickListener(new View.OnClickListener() { // from class: l.ܶۙ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19226.m44154(this.f48920, main);
            }
        });
        this.f62114.setOnClickListener(new View.OnClickListener() { // from class: l.᩸ۙ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19226.m44156(this.f69458, main);
            }
        });
        if (str == null) {
            Spinner spinner = this.f62119;
            this.f62121 = 0;
            spinner.setSelection(0);
        } else {
            Spinner spinner2 = this.f62119;
            ArrayList arrayList = this.f62116;
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    i3 = 0;
                    break;
                } else if (((C14459) arrayList.get(i3)).f47427.equals(str)) {
                    break;
                } else {
                    i3++;
                }
            }
            this.f62121 = i3;
            spinner2.setSelection(i3);
        }
        if (str2 == null) {
            Spinner spinner3 = this.f62114;
            this.f62112 = 0;
            spinner3.setSelection(0);
        } else {
            Spinner spinner4 = this.f62114;
            ArrayList arrayList2 = this.f62116;
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                if (((C14459) arrayList2.get(i4)).f47427.equals(str2)) {
                    i = i4;
                    break;
                }
            }
            this.f62112 = i;
            spinner4.setSelection(i);
        }
        this.f62113.m44365(-1, C16737.m39288(R.string.MT_Protector), new DialogInterface.OnClickListener() { // from class: l.ᩳۙ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                runnable.run();
            }
        });
        this.f62113.m44365(-2, C16737.m39288(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44154(C19226 c19226, AbstractActivityC12483 abstractActivityC12483) {
        C16611 c16611 = new C16611(abstractActivityC12483, c19226.f62116);
        c16611.m39068(R.string.MT_Protector);
        c16611.m39066(c19226.f62119.getSelectedItemPosition());
        c16611.m39067(new C7937(c19226));
        c16611.m39065();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44156(final C19226 c19226, AbstractActivityC12483 abstractActivityC12483) {
        C16611 c16611 = new C16611(abstractActivityC12483, c19226.f62116);
        c16611.m39068(R.string.MT_Protector);
        c16611.m39066(c19226.f62114.getSelectedItemPosition());
        c16611.m39067(new InterfaceC0382() { // from class: l.ᩴۙ֨
            @Override // l.InterfaceC0382
            /* JADX INFO: renamed from: ۙ */
            public final void mo2118(int i, C14459 c14459) {
                this.f58979.f62114.setSelection(i);
            }
        });
        c16611.m39065();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m44160() {
        return this.f62119.getSelectedItemPosition() != this.f62121 || this.f62114.getSelectedItemPosition() != this.f62112 || m44161() || m44157();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m44161() {
        return this.f62118 && this.f62115.isChecked();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m44157() {
        return this.f62118 && this.f62120.isChecked();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m44162() {
        return ((C14459) this.f62116.get(this.f62119.getSelectedItemPosition())).f47424;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44158() {
        return ((C14459) this.f62116.get(this.f62114.getSelectedItemPosition())).f47424;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m44163() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f62113;
        dialogInterfaceC19356.m44362();
        C23250.m51309(dialogInterfaceC19356);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44159(String str) {
        this.f62117.setText(str);
    }
}
