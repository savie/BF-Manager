package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1472 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CheckBox f5990;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f5991;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CheckBox f5992;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9160 f5993;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public CheckBox f5994;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C9160 f5995;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo5118();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo5119(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo5120(String str);

    public AbstractC1472(AbstractActivityC12483 abstractActivityC12483) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        this.f5993 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        this.f5995 = (C9160) viewM30995.findViewById(R.id.editText2);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f5990 = checkBox;
        int i = 0;
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean("filter_match_case", false));
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        this.f5992 = checkBox2;
        checkBox2.setOnCheckedChangeListener(new C10646(i, this));
        checkBox2.setChecked(ApplicationC0716.f2992.getBoolean("filter_regex", false));
        CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f5994 = checkBox3;
        checkBox3.setChecked(ApplicationC0716.f2992.getBoolean("filter_exactly_match", false));
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067.m21269();
        this.f5991 = dialogInterfaceC19356M21269;
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new ViewOnClickListenerC23346(i, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5117(AbstractC1472 abstractC1472, boolean z) {
        abstractC1472.f5993.m23518(z);
        abstractC1472.f5995.m23514(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5116(AbstractC1472 abstractC1472) {
        C14690 c14690M35218;
        String string;
        String strExpandReplacement;
        C9160 c9160 = abstractC1472.f5993;
        String string2 = c9160.m23513().toString();
        C9160 c9161 = abstractC1472.f5995;
        String string3 = c9161.m23513().toString();
        boolean zIsChecked = abstractC1472.f5990.isChecked();
        boolean zIsChecked2 = abstractC1472.f5992.isChecked();
        boolean zIsChecked3 = abstractC1472.f5994.isChecked();
        if (string2.length() == 0) {
            return;
        }
        if (zIsChecked2) {
            try {
                try {
                    C9751.m24733(C14690.m35219(string2), string3);
                } catch (Exception e) {
                    C15829.m37613((CharSequence) e.getMessage());
                    c9161.requestFocus();
                    return;
                }
            } catch (Exception e2) {
                C15829.m37613((CharSequence) e2.getMessage());
                c9160.requestFocus();
                return;
            }
        }
        abstractC1472.f5991.dismiss();
        c9160.m23519();
        c9161.m23519();
        ApplicationC0716.f2992.edit().putBoolean("filter_match_case", zIsChecked).putBoolean("filter_regex", zIsChecked2).putBoolean("filter_exactly_match", zIsChecked3).apply();
        if (!zIsChecked2) {
            string2 = C17874.m41459(string2);
        }
        if (zIsChecked) {
            c14690M35218 = C14690.m35219(string2);
        } else {
            c14690M35218 = C14690.m35218(66, string2);
        }
        C14174 c14174 = new C14174();
        C6222 c6222Matcher = c14690M35218.matcher((CharSequence) "");
        while (true) {
            String strMo5118 = abstractC1472.mo5118();
            if (strMo5118 == null) {
                abstractC1472.mo5119(c14174.m34272());
                return;
            }
            ArrayList<C11162> arrayList = new ArrayList();
            c6222Matcher.m17276reset((CharSequence) strMo5118);
            if (zIsChecked3) {
                if (c6222Matcher.matches()) {
                    arrayList.add(c6222Matcher.toSnapshot());
                }
            } else {
                while (c6222Matcher.find()) {
                    arrayList.add(c6222Matcher.toSnapshot());
                }
            }
            if (arrayList.isEmpty()) {
                string = null;
            } else {
                c14174.m34273(arrayList.size());
                StringBuilder sb = new StringBuilder(strMo5118.length());
                int i = 0;
                for (C11162 c11162 : arrayList) {
                    int iStart = c11162.start();
                    int iEnd = c11162.end();
                    if (zIsChecked2) {
                        try {
                            strExpandReplacement = c11162.expandReplacement(string3);
                        } catch (Exception unused) {
                            strExpandReplacement = string3;
                        }
                        if (iStart > i) {
                            sb.append((CharSequence) strMo5118, i, iStart);
                        }
                        sb.append(strExpandReplacement);
                    } else {
                        if (iStart > i) {
                            sb.append((CharSequence) strMo5118, i, iStart);
                        }
                        sb.append(string3);
                    }
                    i = iEnd;
                }
                if (i < strMo5118.length()) {
                    sb.append((CharSequence) strMo5118, i, strMo5118.length());
                }
                string = sb.toString();
            }
            if (string != null) {
                abstractC1472.mo5120(string);
            }
        }
    }
}
