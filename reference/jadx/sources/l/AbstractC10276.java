package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10276 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f32810;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17771 f32811;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17771 f32812;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public CheckBox f32813;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public CheckBox f32814;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public CheckBox f32815;

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo5948();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5949(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5950(String str);

    public AbstractC10276(AbstractActivityC17204 abstractActivityC17204) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        this.f32811 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        this.f32812 = (C17771) viewM40395.findViewById(R.id.editText2);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f32815 = checkBox;
        int i = 0;
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean("filter_match_case", false));
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        this.f32813 = checkBox2;
        checkBox2.setOnCheckedChangeListener(new C0582(i, this));
        checkBox2.setChecked(ApplicationC17729.f58258.getBoolean("filter_regex", false));
        CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f32814 = checkBox3;
        checkBox3.setChecked(ApplicationC17729.f58258.getBoolean("filter_exactly_match", false));
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361.m8016();
        this.f32810 = dialogInterfaceC8327M8016;
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new ViewOnClickListenerC8040(i, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26489(AbstractC10276 abstractC10276, boolean z) {
        abstractC10276.f32811.m41606(z);
        abstractC10276.f32812.m41600(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26488(AbstractC10276 abstractC10276) {
        C18415 c18415M42924;
        String string;
        String strExpandReplacement;
        C17771 c17771 = abstractC10276.f32811;
        String string2 = c17771.m41599().toString();
        C17771 c17772 = abstractC10276.f32812;
        String string3 = c17772.m41599().toString();
        boolean zIsChecked = abstractC10276.f32815.isChecked();
        boolean zIsChecked2 = abstractC10276.f32813.isChecked();
        boolean zIsChecked3 = abstractC10276.f32814.isChecked();
        if (string2.length() == 0) {
            return;
        }
        if (zIsChecked2) {
            try {
                try {
                    C7974.m21762(C18415.m42925(string2), string3);
                } catch (Exception e) {
                    C22673.m51154((CharSequence) e.getMessage());
                    c17772.requestFocus();
                    return;
                }
            } catch (Exception e2) {
                C22673.m51154((CharSequence) e2.getMessage());
                c17771.requestFocus();
                return;
            }
        }
        abstractC10276.f32810.dismiss();
        c17771.m41603();
        c17772.m41603();
        ApplicationC17729.f58258.edit().putBoolean("filter_match_case", zIsChecked).putBoolean("filter_regex", zIsChecked2).putBoolean("filter_exactly_match", zIsChecked3).apply();
        if (!zIsChecked2) {
            string2 = C17370.m40798(string2);
        }
        if (zIsChecked) {
            c18415M42924 = C18415.m42925(string2);
        } else {
            c18415M42924 = C18415.m42924(66, string2);
        }
        C19227 c19227 = new C19227();
        C4245 c4245Matcher = c18415M42924.matcher((CharSequence) "");
        while (true) {
            String strMo5948 = abstractC10276.mo5948();
            if (strMo5948 == null) {
                abstractC10276.mo5949(c19227.m44557());
                return;
            }
            ArrayList<C14685> arrayList = new ArrayList();
            c4245Matcher.m13568reset((CharSequence) strMo5948);
            if (zIsChecked3) {
                if (c4245Matcher.matches()) {
                    arrayList.add(c4245Matcher.toSnapshot());
                }
            } else {
                while (c4245Matcher.find()) {
                    arrayList.add(c4245Matcher.toSnapshot());
                }
            }
            if (arrayList.isEmpty()) {
                string = null;
            } else {
                c19227.m44558(arrayList.size());
                StringBuilder sb = new StringBuilder(strMo5948.length());
                int i = 0;
                for (C14685 c14685 : arrayList) {
                    int iStart = c14685.start();
                    int iEnd = c14685.end();
                    if (zIsChecked2) {
                        try {
                            strExpandReplacement = c14685.expandReplacement(string3);
                        } catch (Exception unused) {
                            strExpandReplacement = string3;
                        }
                        if (iStart > i) {
                            sb.append((CharSequence) strMo5948, i, iStart);
                        }
                        sb.append(strExpandReplacement);
                    } else {
                        if (iStart > i) {
                            sb.append((CharSequence) strMo5948, i, iStart);
                        }
                        sb.append(string3);
                    }
                    i = iEnd;
                }
                if (i < strMo5948.length()) {
                    sb.append((CharSequence) strMo5948, i, strMo5948.length());
                }
                string = sb.toString();
            }
            if (string != null) {
                abstractC10276.mo5950(string);
            }
        }
    }
}
