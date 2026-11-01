package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩻۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 37SW */
/* JADX INFO: loaded from: classes.dex */
public final class C23708 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f76721;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f76722;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Spinner f76723;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f76724;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C0237 f76725;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final TextView f76726;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f76727;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Spinner f76728;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CheckBox f76729;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f76730;

    public C23708(Main main, AbstractC12233 abstractC12233, String str, String str2, boolean z, Runnable runnable) {
        this.f76727 = z;
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        this.f76726 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f76728 = (Spinner) viewM30995.findViewById(R.id.spinner1);
        this.f76723 = (Spinner) viewM30995.findViewById(R.id.spinner2);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f76724 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f76729 = checkBox2;
        if (!z) {
            checkBox.setVisibility(8);
            checkBox2.setVisibility(8);
        }
        new C11008(this, main, abstractC12233, viewM30995, runnable, str, str2).m10243();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m52194() {
        return this.f76728.getSelectedItemPosition() != this.f76730 || this.f76723.getSelectedItemPosition() != this.f76721 || m52198() || m52201();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m52198() {
        return this.f76727 && this.f76724.isChecked();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m52201() {
        return this.f76727 && this.f76729.isChecked();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m52199() {
        return ((C16466) this.f76725.m1604().get(this.f76728.getSelectedItemPosition())).m38729();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52196() {
        return ((C16466) this.f76725.m1603().get(this.f76723.getSelectedItemPosition())).m38729();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m52195() {
        return ((C16466) this.f76725.m1604().get(this.f76728.getSelectedItemPosition())).m38728();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m52200() {
        return ((C16466) this.f76725.m1603().get(this.f76723.getSelectedItemPosition())).m38728();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m52191(C23708 c23708, String str) {
        List listM1604 = c23708.f76725.m1604();
        int size = listM1604.size();
        for (int i = 0; i < size; i++) {
            if (((C16466) listM1604.get(i)).m38728().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52185(C23708 c23708, String str) {
        List listM1603 = c23708.f76725.m1603();
        int size = listM1603.size();
        for (int i = 0; i < size; i++) {
            if (((C16466) listM1603.get(i)).m38728().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52197(String str) {
        this.f76726.setText(str);
    }
}
