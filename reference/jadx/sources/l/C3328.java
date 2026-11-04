package l;

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

/* JADX INFO: renamed from: l.ۗۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z17V */
/* JADX INFO: loaded from: classes2.dex */
public final class C3328 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TextView f10884;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC17204 f10885;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f10886;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f10887;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f10888;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f10889;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f10890;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean[] f10891;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CheckBox f10892;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CheckBox[] f10893;

    public C3328(Main main, int i, boolean z, boolean z2, Runnable runnable) {
        this.f10885 = main;
        int i2 = i & 4095;
        this.f10886 = i2;
        this.f10890 = z;
        this.f10888 = z2;
        this.f10891 = C6790.m18972(i2);
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f10884 = textView;
        textView.setTypeface(Typeface.MONOSPACE);
        textView.setOnClickListener(new ViewOnClickListenerC2162(3, this));
        ViewOnClickListenerC4356 viewOnClickListenerC4356 = new ViewOnClickListenerC4356(1, this);
        int[] iArr = {R.id.MT_Protector, R.id.checkBox2, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.checkBox10, R.id.checkBox11, R.id.checkBox12};
        this.f10893 = new CheckBox[12];
        for (int i3 = 0; i3 < 12; i3++) {
            CheckBox checkBox = (CheckBox) viewM40395.findViewById(iArr[i3]);
            checkBox.setChecked(this.f10891[i3]);
            checkBox.setTag(Integer.valueOf(i3));
            checkBox.setOnClickListener(viewOnClickListenerC4356);
            this.f10893[i3] = checkBox;
        }
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f10892 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f10887 = checkBox3;
        if (!z) {
            checkBox2.setVisibility(8);
            checkBox3.setVisibility(8);
        }
        if (!z2) {
            viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        C2361 c2361BuildDialog = main.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361BuildDialog.m7999();
        this.f10889 = dialogInterfaceC8327M7999;
        dialogInterfaceC8327M7999.m22424(-1, C21576.m49088(R.string.MT_Protector), new DialogInterfaceOnClickListenerC16351(2, runnable));
        dialogInterfaceC8327M7999.m22424(-2, C21576.m49088(R.string.MT_Protector), null);
        m10965();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10963(C3328 c3328, View view) {
        CheckBox checkBox = (CheckBox) view;
        c3328.f10891[((Integer) checkBox.getTag()).intValue()] = checkBox.isChecked();
        c3328.m10965();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10962(C3328 c3328) {
        String octalString = Integer.toOctalString(c3328.m10968());
        while (true) {
            if (octalString.length() >= 3) {
                break;
            } else {
                octalString = "0".concat(octalString);
            }
        }
        C23466 c23466 = new C23466(c3328, c3328.f10885);
        c23466.m22945(R.string.MT_Protector);
        c23466.m22924((CharSequence) octalString);
        c23466.m22942(c3328.f10888 ? 4 : 3);
        c23466.m22948(o.a.b);
        c23466.m22918();
        c23466.m22957(6);
        c23466.m22959();
        c23466.m22955(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10968() {
        boolean[] zArr = this.f10891;
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
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m10965() {
        int iM10968 = m10968();
        String octalString = Integer.toOctalString(iM10968);
        while (octalString.length() < 3) {
            octalString = "0".concat(octalString);
        }
        String str = C6790.m18977(iM10968) + MotionUtils.EASING_TYPE_FORMAT_START;
        SpannableString spannableString = new SpannableString(C20196.m46451(str, octalString, MotionUtils.EASING_TYPE_FORMAT_END));
        spannableString.setSpan(new UnderlineSpan(), str.length(), spannableString.length() - 1, 0);
        this.f10884.setText(spannableString);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m10972() {
        return this.f10886 != m10968() || m10971() || m10969();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m10971() {
        return this.f10890 && this.f10892.isChecked();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m10969() {
        return this.f10890 && this.f10887.isChecked();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m10970() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f10889;
        dialogInterfaceC8327.m22432();
        if (this.f10890) {
            C5416.m16144(dialogInterfaceC8327);
        }
    }
}
