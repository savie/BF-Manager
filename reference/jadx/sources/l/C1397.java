package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 37SW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1397 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Spinner f4964;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f4965;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Spinner f4966;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f4967;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f4968;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f4969;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f4970;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C0236 f4971;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CheckBox f4972;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f4973;

    public C1397(Main main, AbstractC18881 abstractC18881, String str, String str2, boolean z, Runnable runnable) {
        this.f4967 = z;
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        this.f4968 = (TextView) viewM40395.findViewById(R.id.title);
        this.f4966 = (Spinner) viewM40395.findViewById(R.id.spinner1);
        this.f4964 = (Spinner) viewM40395.findViewById(R.id.spinner2);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f4965 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f4972 = checkBox2;
        if (!z) {
            checkBox.setVisibility(8);
            checkBox2.setVisibility(8);
        }
        new C10345(this, main, abstractC18881, viewM40395, runnable, str, str2).m8197();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m5102() {
        return this.f4966.getSelectedItemPosition() != this.f4970 || this.f4964.getSelectedItemPosition() != this.f4969 || m5104() || m5103();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m5104() {
        return this.f4967 && this.f4965.isChecked();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m5103() {
        return this.f4967 && this.f4972.isChecked();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m5101() {
        return ((C7694) this.f4971.m1717().get(this.f4966.getSelectedItemPosition())).m20966();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m5099() {
        return ((C7694) this.f4971.m1716().get(this.f4964.getSelectedItemPosition())).m20966();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m5106() {
        return ((C7694) this.f4971.m1717().get(this.f4966.getSelectedItemPosition())).m20965();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m5105() {
        return ((C7694) this.f4971.m1716().get(this.f4964.getSelectedItemPosition())).m20965();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m5095(C1397 c1397, String str) {
        List listM1717 = c1397.f4971.m1717();
        int size = listM1717.size();
        for (int i = 0; i < size; i++) {
            if (((C7694) listM1717.get(i)).m20965().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m5089(C1397 c1397, String str) {
        List listM1716 = c1397.f4971.m1716();
        int size = listM1716.size();
        for (int i = 0; i < size; i++) {
            if (((C7694) listM1716.get(i)).m20965().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5100(String str) {
        this.f4968.setText(str);
    }
}
