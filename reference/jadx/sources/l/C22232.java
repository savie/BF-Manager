package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes.dex */
public final class C22232 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3886 f72691;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C22232(AbstractC3886 abstractC3886) {
        this.f72691 = abstractC3886;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:33:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0103  */
    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String[] strArr;
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        int iIndexOf;
        AbstractC3886 abstractC3886 = this.f72691;
        EnumC13060 enumC13060 = abstractC3886.f14521[i];
        abstractC3886.m11278();
        switch (C1064.f4912[enumC13060.ordinal()]) {
            case 1:
                strArr = abstractC3886.f14527;
                z = true;
                z2 = true;
                z3 = false;
                if (strArr != null && abstractC3886.f14530.getCount() != strArr.length) {
                    String str = (String) abstractC3886.f14534.getSelectedItem();
                    List listAsList = Arrays.asList(strArr);
                    abstractC3886.f14538.clear();
                    abstractC3886.f14538.addAll(listAsList);
                    abstractC3886.f14530.notifyDataSetChanged();
                    iIndexOf = listAsList.indexOf(str);
                    if (iIndexOf == -1 && (iIndexOf = listAsList.indexOf(abstractC3886.f14527[3])) == -1) {
                        iIndexOf = 0;
                    }
                    abstractC3886.f14534.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC3886.f14524.setVisibility(0);
                    abstractC3886.f14525.setVisibility(0);
                    if (z3) {
                        abstractC3886.f14539.setVisibility(0);
                    } else {
                        abstractC3886.f14539.setVisibility(8);
                    }
                } else {
                    abstractC3886.f14524.setVisibility(8);
                    abstractC3886.f14525.setVisibility(8);
                    abstractC3886.f14539.setVisibility(8);
                }
                if (z) {
                    abstractC3886.f14536.setVisibility(0);
                    abstractC3886.f14531.setVisibility(0);
                    abstractC3886.f14515.setVisibility(0);
                    abstractC3886.f14532.setVisibility(0);
                } else {
                    abstractC3886.f14536.setVisibility(8);
                    abstractC3886.f14531.setVisibility(8);
                    abstractC3886.f14515.setVisibility(8);
                    abstractC3886.f14532.setVisibility(8);
                }
                TextView textView = abstractC3886.f14533;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView.setAlpha(f);
                abstractC3886.f14534.setEnabled(strArr != null);
                return;
            case 2:
                strArr = abstractC3886.f14537;
                z = true;
                z2 = true;
                z3 = true;
                if (strArr != null) {
                    String str2 = (String) abstractC3886.f14534.getSelectedItem();
                    List listAsList2 = Arrays.asList(strArr);
                    abstractC3886.f14538.clear();
                    abstractC3886.f14538.addAll(listAsList2);
                    abstractC3886.f14530.notifyDataSetChanged();
                    iIndexOf = listAsList2.indexOf(str2);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC3886.f14534.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC3886.f14524.setVisibility(0);
                    abstractC3886.f14525.setVisibility(0);
                    if (z3) {
                        abstractC3886.f14539.setVisibility(0);
                    } else {
                        abstractC3886.f14539.setVisibility(8);
                    }
                } else {
                    abstractC3886.f14524.setVisibility(8);
                    abstractC3886.f14525.setVisibility(8);
                    abstractC3886.f14539.setVisibility(8);
                }
                if (z) {
                    abstractC3886.f14536.setVisibility(0);
                    abstractC3886.f14531.setVisibility(0);
                    abstractC3886.f14515.setVisibility(0);
                    abstractC3886.f14532.setVisibility(0);
                } else {
                    abstractC3886.f14536.setVisibility(8);
                    abstractC3886.f14531.setVisibility(8);
                    abstractC3886.f14515.setVisibility(8);
                    abstractC3886.f14532.setVisibility(8);
                }
                TextView textView2 = abstractC3886.f14533;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView2.setAlpha(f);
                abstractC3886.f14534.setEnabled(strArr != null);
                return;
            case 3:
                strArr = null;
                z = false;
                z2 = false;
                z3 = false;
                if (strArr != null) {
                    String str3 = (String) abstractC3886.f14534.getSelectedItem();
                    List listAsList3 = Arrays.asList(strArr);
                    abstractC3886.f14538.clear();
                    abstractC3886.f14538.addAll(listAsList3);
                    abstractC3886.f14530.notifyDataSetChanged();
                    iIndexOf = listAsList3.indexOf(str3);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC3886.f14534.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC3886.f14524.setVisibility(0);
                    abstractC3886.f14525.setVisibility(0);
                    if (z3) {
                        abstractC3886.f14539.setVisibility(0);
                    } else {
                        abstractC3886.f14539.setVisibility(8);
                    }
                } else {
                    abstractC3886.f14524.setVisibility(8);
                    abstractC3886.f14525.setVisibility(8);
                    abstractC3886.f14539.setVisibility(8);
                }
                if (z) {
                    abstractC3886.f14536.setVisibility(0);
                    abstractC3886.f14531.setVisibility(0);
                    abstractC3886.f14515.setVisibility(0);
                    abstractC3886.f14532.setVisibility(0);
                } else {
                    abstractC3886.f14536.setVisibility(8);
                    abstractC3886.f14531.setVisibility(8);
                    abstractC3886.f14515.setVisibility(8);
                    abstractC3886.f14532.setVisibility(8);
                }
                TextView textView3 = abstractC3886.f14533;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView3.setAlpha(f);
                abstractC3886.f14534.setEnabled(strArr != null);
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                strArr = abstractC3886.f14523;
                z = false;
                z2 = false;
                z3 = false;
                if (strArr != null) {
                    String str4 = (String) abstractC3886.f14534.getSelectedItem();
                    List listAsList4 = Arrays.asList(strArr);
                    abstractC3886.f14538.clear();
                    abstractC3886.f14538.addAll(listAsList4);
                    abstractC3886.f14530.notifyDataSetChanged();
                    iIndexOf = listAsList4.indexOf(str4);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC3886.f14534.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC3886.f14524.setVisibility(0);
                    abstractC3886.f14525.setVisibility(0);
                    if (z3) {
                        abstractC3886.f14539.setVisibility(0);
                    } else {
                        abstractC3886.f14539.setVisibility(8);
                    }
                } else {
                    abstractC3886.f14524.setVisibility(8);
                    abstractC3886.f14525.setVisibility(8);
                    abstractC3886.f14539.setVisibility(8);
                }
                if (z) {
                    abstractC3886.f14536.setVisibility(0);
                    abstractC3886.f14531.setVisibility(0);
                    abstractC3886.f14515.setVisibility(0);
                    abstractC3886.f14532.setVisibility(0);
                } else {
                    abstractC3886.f14536.setVisibility(8);
                    abstractC3886.f14531.setVisibility(8);
                    abstractC3886.f14515.setVisibility(8);
                    abstractC3886.f14532.setVisibility(8);
                }
                TextView textView4 = abstractC3886.f14533;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView4.setAlpha(f);
                abstractC3886.f14534.setEnabled(strArr != null);
                return;
            default:
                throw new RuntimeException(enumC13060.toString());
        }
    }
}
