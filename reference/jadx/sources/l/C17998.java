package l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.ᩳۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Z17V */
/* JADX INFO: loaded from: classes4.dex */
public final class C17998 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f57538;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CheckBox[] f57539;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final TextView f57540;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f57541;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean[] f57542;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f57543;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CheckBox f57544;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f57545;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CheckBox f57546;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f57547;

    public C17998(Main main, int i, boolean z, boolean z2, final Runnable runnable) {
        this.f57541 = main;
        int i2 = i & 4095;
        this.f57545 = i2;
        this.f57547 = z;
        this.f57543 = z2;
        this.f57542 = C13672.m33381(i2);
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f57540 = textView;
        textView.setTypeface(Typeface.MONOSPACE);
        textView.setOnClickListener(new ViewOnClickListenerC11953(2, this));
        ViewOnClickListenerC20535 viewOnClickListenerC20535 = new ViewOnClickListenerC20535(2, this);
        int[] iArr = {R.id.MT_Protector, R.id.checkBox2, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.checkBox10, R.id.checkBox11, R.id.checkBox12};
        this.f57539 = new CheckBox[12];
        for (int i3 = 0; i3 < 12; i3++) {
            CheckBox checkBox = (CheckBox) viewM30995.findViewById(iArr[i3]);
            checkBox.setChecked(this.f57542[i3]);
            checkBox.setTag(Integer.valueOf(i3));
            checkBox.setOnClickListener(viewOnClickListenerC20535);
            this.f57539[i3] = checkBox;
        }
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f57546 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f57544 = checkBox3;
        if (!z) {
            checkBox2.setVisibility(8);
            checkBox3.setVisibility(8);
        }
        if (!z2) {
            viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        C8067 c8067BuildDialog = main.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067BuildDialog.m21252();
        this.f57538 = dialogInterfaceC19356M21252;
        dialogInterfaceC19356M21252.m44365(-1, C16737.m39288(R.string.MT_Protector), new DialogInterface.OnClickListener() { // from class: l.ܶۤ᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                runnable.run();
            }
        });
        dialogInterfaceC19356M21252.m44365(-2, C16737.m39288(R.string.MT_Protector), null);
        m41906();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41903(C17998 c17998, View view) {
        CheckBox checkBox = (CheckBox) view;
        c17998.f57542[((Integer) checkBox.getTag()).intValue()] = checkBox.isChecked();
        c17998.m41906();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41902(C17998 c17998) {
        String octalString = Integer.toOctalString(c17998.m41908());
        while (true) {
            if (octalString.length() >= 3) {
                break;
            } else {
                octalString = "0".concat(octalString);
            }
        }
        C21526 c21526 = new C21526(c17998, c17998.f57541);
        c21526.m40376(R.string.MT_Protector);
        c21526.m40346((CharSequence) octalString);
        c21526.m40375(c17998.f57543 ? 4 : 3);
        c21526.m40350(o.a.b);
        c21526.m40340();
        c21526.m40336(6);
        c21526.m40355();
        c21526.m40368(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41908() {
        boolean[] zArr = this.f57542;
        int i = zArr[0] ? 256 : 0;
        if (zArr[1]) {
            i |= 128;
        }
        if (zArr[2]) {
            i |= 64;
        }
        if (zArr[3]) {
            i |= 32;
        }
        if (zArr[4]) {
            i |= 16;
        }
        if (zArr[5]) {
            i |= 8;
        }
        if (zArr[6]) {
            i |= 4;
        }
        if (zArr[7]) {
            i |= 2;
        }
        if (zArr[8]) {
            i |= 1;
        }
        if (zArr[9]) {
            i |= 2048;
        }
        if (zArr[10]) {
            i |= 1024;
        }
        return zArr[11] ? i | 512 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m41906() {
        int iM41908 = m41908();
        String octalString = Integer.toOctalString(iM41908);
        while (octalString.length() < 3) {
            octalString = "0".concat(octalString);
        }
        String str = C13672.m33382(iM41908) + MotionUtils.EASING_TYPE_FORMAT_START;
        SpannableString spannableString = new SpannableString(C1679.m5594(str, octalString, MotionUtils.EASING_TYPE_FORMAT_END));
        spannableString.setSpan(new UnderlineSpan(), str.length(), spannableString.length() - 1, 0);
        this.f57540.setText(spannableString);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m41907() {
        return this.f57545 != m41908() || m41911() || m41910();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m41911() {
        return this.f57547 && this.f57546.isChecked();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m41910() {
        return this.f57547 && this.f57544.isChecked();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m41909() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f57538;
        dialogInterfaceC19356.m44362();
        if (this.f57547) {
            C23250.m51309(dialogInterfaceC19356);
        }
    }
}
