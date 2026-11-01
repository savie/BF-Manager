package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import bin.mt.plus.R;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14019 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CheckBox f46076;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f46077;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8374 f46078;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f46079;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f46080;

    public C14019(ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        this.f46078 = viewOnClickListenerC8374;
        C13465.m32962(viewOnClickListenerC8374.f29060);
        C11672 c11672 = viewOnClickListenerC8374.f29060;
        C13465.m32962(c11672);
        this.f46079 = C0252.m1693("local:", c11672.m28640());
        View viewM30995 = viewOnClickListenerC8374.m30995(R.layout.MT_Protector);
        RadioButton[] radioButtonArr = new RadioButton[4];
        boolean z = false;
        int i = 0;
        while (i < 4) {
            RadioButton radioButton = (RadioButton) (i != 0 ? i != 1 ? i != 2 ? viewM30995.findViewById(R.id.MT_Protector) : viewM30995.findViewById(R.id.MT_Protector) : viewM30995.findViewById(R.id.MT_Protector) : viewM30995.findViewById(R.id.MT_Protector));
            C13465.m32962((Object) radioButton);
            radioButtonArr[i] = radioButton;
            i++;
        }
        this.f46080 = radioButtonArr;
        int i2 = 0;
        final int i3 = 0;
        while (i2 < 4) {
            radioButtonArr[i2].setOnClickListener(new View.OnClickListener() { // from class: l.ۢ۠ۘ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32002.m33904(i3);
                }
            });
            i2++;
            i3++;
        }
        View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
        C13465.m32967(viewFindViewById, "findViewById(...)");
        CheckBox checkBox = (CheckBox) viewFindViewById;
        this.f46077 = checkBox;
        View viewFindViewById2 = viewM30995.findViewById(R.id.MT_Protector);
        C13465.m32967(viewFindViewById2, "findViewById(...)");
        CheckBox checkBox2 = (CheckBox) viewFindViewById2;
        this.f46076 = checkBox2;
        HashMap map = C0674.f2833;
        if (map.containsKey(this.f46079)) {
            checkBox2.setChecked(true);
            Object obj = map.get(this.f46079);
            C13465.m32962(obj);
            int iIntValue = ((Number) obj).intValue();
            m33904(C3386.m10039(iIntValue));
            checkBox.setChecked(C3386.m10049(iIntValue));
            z = true;
        } else {
            m33904(this.f46078.f29063);
            checkBox.setChecked(this.f46078.f29068);
        }
        C8067 c8067BuildDialog = this.f46078.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        final ViewOnClickListenerC8374 viewOnClickListenerC8375 = this.f46078;
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗ۠ۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C14019.m33902(this.f11698, viewOnClickListenerC8375);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (!z) {
            c8067BuildDialog.m21269();
            return;
        }
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        Button buttonM44361 = c8067BuildDialog.m21269().m44361();
        final ViewOnClickListenerC8374 viewOnClickListenerC8376 = this.f46078;
        buttonM44361.setOnClickListener(new View.OnClickListener() { // from class: l.ۙ᩵ۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14019.m33903(this.f17028, viewOnClickListenerC8376, view);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33902(C14019 c14019, ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        RadioButton[] radioButtonArr = c14019.f46080;
        CheckBox checkBox = c14019.f46076;
        CheckBox checkBox2 = c14019.f46077;
        String str = c14019.f46079;
        int i = -1;
        if (!checkBox.isChecked()) {
            int length = radioButtonArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (radioButtonArr[i2].isChecked()) {
                    i = i2;
                    break;
                }
            }
            ViewOnClickListenerC8374.m21961(viewOnClickListenerC8374, i);
            ViewOnClickListenerC8374.m21943(viewOnClickListenerC8374, checkBox2.isChecked());
            HashMap map = C0674.f2833;
            if (map.containsKey(str)) {
                map.remove(str);
            }
            ViewOnClickListenerC8374.m21944(viewOnClickListenerC8374, false, (InterfaceC4871) null, 2);
        }
        HashMap map2 = C0674.f2833;
        C13465.m32967(map2, "sortOnlyInPathList");
        int length2 = radioButtonArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (radioButtonArr[i3].isChecked()) {
                i = i3;
                break;
            }
        }
        map2.put(str, Integer.valueOf(C3386.m10040(i, checkBox2.isChecked())));
        ApplicationC0716.f2992.edit().putString("sort_only_in_path_list", C0674.m3026(C0674.f2833)).apply();
        ViewOnClickListenerC8374.m21944(viewOnClickListenerC8374, false, (InterfaceC4871) null, 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33903(C14019 c14019, ViewOnClickListenerC8374 viewOnClickListenerC8374, View view) {
        C13465.m32962((Object) view);
        view.setVisibility(8);
        c14019.m33904(viewOnClickListenerC8374.f29063);
        c14019.f46077.setChecked(viewOnClickListenerC8374.f29068);
        c14019.f46076.setChecked(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33904(int i) {
        RadioButton[] radioButtonArr = this.f46080;
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
