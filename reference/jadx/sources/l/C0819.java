package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import bin.mt.plus.R;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0819 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f3095;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f3096;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC11499 f3097;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f3098;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CheckBox f3099;

    public C0819(ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        this.f3097 = viewOnClickListenerC11499;
        C15243.m36586(viewOnClickListenerC11499.f36186);
        C7495 c7495 = viewOnClickListenerC11499.f36186;
        C15243.m36586(c7495);
        this.f3096 = C25272.m56409("local:", c7495.m20193());
        View viewM40395 = viewOnClickListenerC11499.m40395(R.layout.MT_Protector);
        RadioButton[] radioButtonArr = new RadioButton[4];
        boolean z = false;
        int i = 0;
        while (i < 4) {
            RadioButton radioButton = (RadioButton) (i != 0 ? i != 1 ? i != 2 ? viewM40395.findViewById(R.id.MT_Protector) : viewM40395.findViewById(R.id.MT_Protector) : viewM40395.findViewById(R.id.MT_Protector) : viewM40395.findViewById(R.id.MT_Protector));
            C15243.m36586((Object) radioButton);
            radioButtonArr[i] = radioButton;
            i++;
        }
        this.f3098 = radioButtonArr;
        int i2 = 0;
        final int i3 = 0;
        while (i2 < 4) {
            radioButtonArr[i2].setOnClickListener(new View.OnClickListener() { // from class: l.۟֨֫
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f24857.m3289(i3);
                }
            });
            i2++;
            i3++;
        }
        View viewFindViewById = viewM40395.findViewById(R.id.MT_Protector);
        C15243.m36591(viewFindViewById, "findViewById(...)");
        CheckBox checkBox = (CheckBox) viewFindViewById;
        this.f3095 = checkBox;
        View viewFindViewById2 = viewM40395.findViewById(R.id.MT_Protector);
        C15243.m36591(viewFindViewById2, "findViewById(...)");
        CheckBox checkBox2 = (CheckBox) viewFindViewById2;
        this.f3099 = checkBox2;
        HashMap map = C17423.f56652;
        if (map.containsKey(this.f3096)) {
            checkBox2.setChecked(true);
            Object obj = map.get(this.f3096);
            C15243.m36586(obj);
            int iIntValue = ((Number) obj).intValue();
            m3289(C14118.m34280(iIntValue));
            checkBox.setChecked(C14118.m34290(iIntValue));
            z = true;
        } else {
            m3289(this.f3097.f36193);
            checkBox.setChecked(this.f3097.f36179);
        }
        C2361 c2361BuildDialog = this.f3097.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        final ViewOnClickListenerC11499 viewOnClickListenerC114910 = this.f3097;
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳ֨֫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C0819.m3287(this.f60849, viewOnClickListenerC114910);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (!z) {
            c2361BuildDialog.m8016();
            return;
        }
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        Button buttonM22440 = c2361BuildDialog.m8016().m22440();
        final ViewOnClickListenerC11499 viewOnClickListenerC114911 = this.f3097;
        buttonM22440.setOnClickListener(new View.OnClickListener() { // from class: l.ۢ֨֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0819.m3288(this.f31487, viewOnClickListenerC114911, view);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3287(C0819 c0819, ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        RadioButton[] radioButtonArr = c0819.f3098;
        CheckBox checkBox = c0819.f3099;
        CheckBox checkBox2 = c0819.f3095;
        String str = c0819.f3096;
        int i = -1;
        if (!checkBox.isChecked()) {
            int length = radioButtonArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (radioButtonArr[i2].isChecked()) {
                    i = i2;
                    break;
                }
            }
            ViewOnClickListenerC11499.m28927(viewOnClickListenerC11499, i);
            ViewOnClickListenerC11499.m28914(viewOnClickListenerC11499, checkBox2.isChecked());
            HashMap map = C17423.f56652;
            if (map.containsKey(str)) {
                map.remove(str);
            }
            ViewOnClickListenerC11499.m28915(viewOnClickListenerC11499, false, (InterfaceC19479) null, 2);
        }
        HashMap map2 = C17423.f56652;
        C15243.m36591(map2, "sortOnlyInPathList");
        int length2 = radioButtonArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (radioButtonArr[i3].isChecked()) {
                i = i3;
                break;
            }
        }
        map2.put(str, Integer.valueOf(C14118.m34281(i, checkBox2.isChecked())));
        ApplicationC17729.f58258.edit().putString("sort_only_in_path_list", C17423.m40910(C17423.f56652)).apply();
        ViewOnClickListenerC11499.m28915(viewOnClickListenerC11499, false, (InterfaceC19479) null, 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3288(C0819 c0819, ViewOnClickListenerC11499 viewOnClickListenerC11499, View view) {
        C15243.m36586((Object) view);
        view.setVisibility(8);
        c0819.m3289(viewOnClickListenerC11499.f36193);
        c0819.f3095.setChecked(viewOnClickListenerC11499.f36179);
        c0819.f3099.setChecked(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3289(int i) {
        RadioButton[] radioButtonArr = this.f3098;
        int length = radioButtonArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            radioButtonArr[i2].setChecked(i3 == i);
            i2++;
            i3 = i4;
        }
    }
}
