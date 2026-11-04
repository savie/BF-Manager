package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0297 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9991 f1618;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9991 f1619;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9991 f1620;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9991 f1621;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0297(AbstractActivityC17204 abstractActivityC17204, C9991 c9991, C9991 c9992, C9991 c9993, C9991 c9994) {
        super(abstractActivityC17204, -1);
        this.f1619 = c9991;
        this.f1620 = c9992;
        this.f1618 = c9993;
        this.f1621 = c9994;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void mo1877() {
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        String str5;
        String str6;
        String strTrim = m22914().trim();
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
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        C9991 c9991 = this.f1619;
        c9991.f32102.mo52335((CharSequence) str6);
        C9991 c9992 = this.f1620;
        c9992.f32102.mo52335((CharSequence) str3);
        C9991 c9993 = this.f1618;
        c9993.f32102.mo52335((CharSequence) str4);
        C9991 c9994 = this.f1621;
        c9994.f32102.mo52335((CharSequence) str5);
        c9991.f32099.setChecked(false);
        c9991.f32101.setChecked(false);
        c9992.f32099.setChecked(false);
        c9992.f32101.setChecked(false);
        c9993.f32099.setChecked(false);
        c9993.f32101.setChecked(false);
        c9994.f32099.setChecked(false);
        c9994.f32101.setChecked(false);
        m22951();
    }
}
