package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes2.dex */
public final class C1837 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16752 f6215;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C1837(AbstractC16752 abstractC16752) {
        this.f6215 = abstractC16752;
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
        AbstractC16752 abstractC16752 = this.f6215;
        EnumC24958 enumC24958 = abstractC16752.f54081[i];
        abstractC16752.m39549();
        switch (C11531.f36278[enumC24958.ordinal()]) {
            case 1:
                strArr = abstractC16752.f54079;
                z = true;
                z2 = true;
                z3 = false;
                if (strArr != null && abstractC16752.f54088.getCount() != strArr.length) {
                    String str = (String) abstractC16752.f54073.getSelectedItem();
                    List listAsList = Arrays.asList(strArr);
                    abstractC16752.f54086.clear();
                    abstractC16752.f54086.addAll(listAsList);
                    abstractC16752.f54088.notifyDataSetChanged();
                    iIndexOf = listAsList.indexOf(str);
                    if (iIndexOf == -1 && (iIndexOf = listAsList.indexOf(abstractC16752.f54079[3])) == -1) {
                        iIndexOf = 0;
                    }
                    abstractC16752.f54073.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC16752.f54077.setVisibility(0);
                    abstractC16752.f54097.setVisibility(0);
                    if (z3) {
                        abstractC16752.f54085.setVisibility(0);
                    } else {
                        abstractC16752.f54085.setVisibility(8);
                    }
                } else {
                    abstractC16752.f54077.setVisibility(8);
                    abstractC16752.f54097.setVisibility(8);
                    abstractC16752.f54085.setVisibility(8);
                }
                if (z) {
                    abstractC16752.f54071.setVisibility(0);
                    abstractC16752.f54089.setVisibility(0);
                    abstractC16752.f54078.setVisibility(0);
                    abstractC16752.f54090.setVisibility(0);
                } else {
                    abstractC16752.f54071.setVisibility(8);
                    abstractC16752.f54089.setVisibility(8);
                    abstractC16752.f54078.setVisibility(8);
                    abstractC16752.f54090.setVisibility(8);
                }
                TextView textView = abstractC16752.f54096;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView.setAlpha(f);
                abstractC16752.f54073.setEnabled(strArr != null);
                return;
            case 2:
                strArr = abstractC16752.f54084;
                z = true;
                z2 = true;
                z3 = true;
                if (strArr != null) {
                    String str2 = (String) abstractC16752.f54073.getSelectedItem();
                    List listAsList2 = Arrays.asList(strArr);
                    abstractC16752.f54086.clear();
                    abstractC16752.f54086.addAll(listAsList2);
                    abstractC16752.f54088.notifyDataSetChanged();
                    iIndexOf = listAsList2.indexOf(str2);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC16752.f54073.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC16752.f54077.setVisibility(0);
                    abstractC16752.f54097.setVisibility(0);
                    if (z3) {
                        abstractC16752.f54085.setVisibility(0);
                    } else {
                        abstractC16752.f54085.setVisibility(8);
                    }
                } else {
                    abstractC16752.f54077.setVisibility(8);
                    abstractC16752.f54097.setVisibility(8);
                    abstractC16752.f54085.setVisibility(8);
                }
                if (z) {
                    abstractC16752.f54071.setVisibility(0);
                    abstractC16752.f54089.setVisibility(0);
                    abstractC16752.f54078.setVisibility(0);
                    abstractC16752.f54090.setVisibility(0);
                } else {
                    abstractC16752.f54071.setVisibility(8);
                    abstractC16752.f54089.setVisibility(8);
                    abstractC16752.f54078.setVisibility(8);
                    abstractC16752.f54090.setVisibility(8);
                }
                TextView textView2 = abstractC16752.f54096;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView2.setAlpha(f);
                abstractC16752.f54073.setEnabled(strArr != null);
                return;
            case 3:
                strArr = null;
                z = false;
                z2 = false;
                z3 = false;
                if (strArr != null) {
                    String str3 = (String) abstractC16752.f54073.getSelectedItem();
                    List listAsList3 = Arrays.asList(strArr);
                    abstractC16752.f54086.clear();
                    abstractC16752.f54086.addAll(listAsList3);
                    abstractC16752.f54088.notifyDataSetChanged();
                    iIndexOf = listAsList3.indexOf(str3);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC16752.f54073.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC16752.f54077.setVisibility(0);
                    abstractC16752.f54097.setVisibility(0);
                    if (z3) {
                        abstractC16752.f54085.setVisibility(0);
                    } else {
                        abstractC16752.f54085.setVisibility(8);
                    }
                } else {
                    abstractC16752.f54077.setVisibility(8);
                    abstractC16752.f54097.setVisibility(8);
                    abstractC16752.f54085.setVisibility(8);
                }
                if (z) {
                    abstractC16752.f54071.setVisibility(0);
                    abstractC16752.f54089.setVisibility(0);
                    abstractC16752.f54078.setVisibility(0);
                    abstractC16752.f54090.setVisibility(0);
                } else {
                    abstractC16752.f54071.setVisibility(8);
                    abstractC16752.f54089.setVisibility(8);
                    abstractC16752.f54078.setVisibility(8);
                    abstractC16752.f54090.setVisibility(8);
                }
                TextView textView3 = abstractC16752.f54096;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView3.setAlpha(f);
                abstractC16752.f54073.setEnabled(strArr != null);
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
                strArr = abstractC16752.f54092;
                z = false;
                z2 = false;
                z3 = false;
                if (strArr != null) {
                    String str4 = (String) abstractC16752.f54073.getSelectedItem();
                    List listAsList4 = Arrays.asList(strArr);
                    abstractC16752.f54086.clear();
                    abstractC16752.f54086.addAll(listAsList4);
                    abstractC16752.f54088.notifyDataSetChanged();
                    iIndexOf = listAsList4.indexOf(str4);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC16752.f54073.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC16752.f54077.setVisibility(0);
                    abstractC16752.f54097.setVisibility(0);
                    if (z3) {
                        abstractC16752.f54085.setVisibility(0);
                    } else {
                        abstractC16752.f54085.setVisibility(8);
                    }
                } else {
                    abstractC16752.f54077.setVisibility(8);
                    abstractC16752.f54097.setVisibility(8);
                    abstractC16752.f54085.setVisibility(8);
                }
                if (z) {
                    abstractC16752.f54071.setVisibility(0);
                    abstractC16752.f54089.setVisibility(0);
                    abstractC16752.f54078.setVisibility(0);
                    abstractC16752.f54090.setVisibility(0);
                } else {
                    abstractC16752.f54071.setVisibility(8);
                    abstractC16752.f54089.setVisibility(8);
                    abstractC16752.f54078.setVisibility(8);
                    abstractC16752.f54090.setVisibility(8);
                }
                TextView textView4 = abstractC16752.f54096;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView4.setAlpha(f);
                abstractC16752.f54073.setEnabled(strArr != null);
                return;
            default:
                throw new RuntimeException(enumC24958.toString());
        }
    }
}
