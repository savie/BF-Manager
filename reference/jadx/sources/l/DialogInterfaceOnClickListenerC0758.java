package l;

import android.content.DialogInterface;
import android.widget.CheckBox;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0758 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2761;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2762;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2763;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2764;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2765;

    public /* synthetic */ DialogInterfaceOnClickListenerC0758(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2763 = i;
        this.f2765 = obj;
        this.f2764 = obj2;
        this.f2761 = obj3;
        this.f2762 = obj4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f2763;
        Object obj = this.f2762;
        Object obj2 = this.f2761;
        Object obj3 = this.f2764;
        Object obj4 = this.f2765;
        switch (i2) {
            case 0:
                C9170 c9170 = (C9170) obj4;
                CheckBox checkBox = (CheckBox) obj3;
                CheckBox checkBox2 = (CheckBox) obj2;
                c9170.m24303();
                ApplicationC17729.f58258.edit().putBoolean("aciad", checkBox.isChecked()).apply();
                boolean zIsChecked = checkBox2.isChecked();
                int i3 = ActivityC18143.f59323;
                C6421.m18184(ApplicationC17729.f58258, "axml_id_2_name", zIsChecked);
                AbstractC22044 abstractC22044 = c9170.f29765;
                AbstractC22044 abstractC22045 = c9170.f29769;
                boolean zIsChecked2 = checkBox2.isChecked();
                boolean zIsChecked3 = checkBox.isChecked();
                AbstractC22044 abstractC22044M33163 = C13485.m33163((C8614) obj, R.string.MT_Protector, "mtcr");
                int i4 = C13678.f43415;
                C8458 c8458 = new C8458(C10452.class);
                c8458.m22719("saveAsPath", abstractC22044M33163.mo4294());
                c8458.m22719("inputPath1", abstractC22044.mo4294());
                c8458.m22719("inputPath2", abstractC22045.mo4294());
                c8458.m22720("id2name", zIsChecked2);
                c8458.m22720("ignoreAddOrDel", zIsChecked3);
                c8458.m22714();
                break;
            default:
                ViewOnClickListenerC19404.m44882((ViewOnClickListenerC19404) obj4, (DialogInterfaceC8327) obj3, (InterfaceC23955) obj2, (String) obj);
                break;
        }
    }
}
