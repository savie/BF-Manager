package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0102 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17036 f1043;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17036 f1044;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17036 f1045;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17036 f1046;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0102(AbstractActivityC12483 abstractActivityC12483, C17036 c17036, C17036 c17037, C17036 c17038, C17036 c17039) {
        super(abstractActivityC12483, -1);
        this.f1043 = c17036;
        this.f1044 = c17037;
        this.f1046 = c17038;
        this.f1045 = c17039;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo1069() {
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        String str5;
        String str6;
        String strTrim = m40352().trim();
        String str7 = null;
        if (strTrim == null) {
            str = null;
            str2 = null;
            str3 = null;
            z = false;
            String str8 = str7;
            str4 = str;
            str5 = str2;
            str6 = str8;
        } else {
            String[] strArrSplit = strTrim.split("->");
            if (strArrSplit.length != 2) {
                str = null;
                str2 = null;
                str3 = null;
            } else {
                str6 = strArrSplit[0];
                if (str6.length() > 2 && str6.startsWith("L") && str6.endsWith(l.b)) {
                    z = true;
                    String[] strArrSplit2 = strArrSplit[1].split("\\(");
                    if (strArrSplit2.length != 2) {
                        str = null;
                        str3 = null;
                        str7 = str6;
                        str2 = null;
                    } else {
                        str3 = strArrSplit2[0];
                        if (str3.isEmpty()) {
                            str = null;
                            str7 = str6;
                            str2 = null;
                        } else {
                            String[] strArrSplit3 = strArrSplit2[1].split("\\)");
                            if (strArrSplit3.length != 2) {
                                str = null;
                                str7 = str6;
                                str2 = null;
                            } else {
                                str4 = strArrSplit3[0];
                                str5 = strArrSplit3[1];
                                if (!str4.matches("(\\[*([CZBISJDF]|L[^;:()\\r\\n]+;))*") || !str5.matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)")) {
                                    str2 = str5;
                                    str = str4;
                                    str7 = str6;
                                }
                            }
                        }
                    }
                } else {
                    str = null;
                    str3 = null;
                    str7 = str6;
                    str2 = null;
                }
            }
            z = false;
            String str9 = str7;
            str4 = str;
            str5 = str2;
            str6 = str9;
        }
        if (!z) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        C17036 c17036 = this.f1043;
        c17036.f54424.setText(str6);
        C17036 c17037 = this.f1044;
        c17037.f54424.setText(str3);
        C17036 c17038 = this.f1046;
        c17038.f54424.setText(str4);
        C17036 c17039 = this.f1045;
        c17039.f54424.setText(str5);
        c17036.f54421.setChecked(false);
        c17036.f54423.setChecked(false);
        c17037.f54421.setChecked(false);
        c17037.f54423.setChecked(false);
        c17038.f54421.setChecked(false);
        c17038.f54423.setChecked(false);
        c17039.f54421.setChecked(false);
        c17039.f54423.setChecked(false);
        m40364();
    }
}
