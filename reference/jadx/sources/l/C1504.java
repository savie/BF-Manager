package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes2.dex */
public final class C1504 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5358(C9170 c9170, C8614 c8614) {
        Main mainM23233 = c8614.m23233();
        View viewM40395 = mainM23233.m40395(R.layout.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        checkBox.setVisibility(0);
        checkBox2.setVisibility(0);
        checkBox.setText(R.string.MT_Protector);
        checkBox2.setText(R.string.MT_Protector);
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean("aciad", true));
        checkBox2.setChecked(ActivityC18143.m42278());
        c23255.m54107(true);
        c23256.m54107(true);
        C2459.m8293(c9170.f29768, c9170.f29767, c23255, c23256);
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(mainM23233);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0758(c9170, checkBox, checkBox2, c8614, 0));
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016().m22440().setOnClickListener(new ViewOnClickListenerC8216(c9170, c23255, c23256, 0));
    }
}
