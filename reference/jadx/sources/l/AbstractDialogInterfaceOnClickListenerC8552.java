package l;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5F9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC8552 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final FrameLayout f27927;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final TextView f27928;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public View.OnLongClickListener f27929;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f27930 = false;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final TextView f27931;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public View.OnClickListener f27932;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f27933;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f27934;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23255 f27935;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1626 f27936;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f27937;

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: ܶ */
    public abstract void mo1877();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void mo22944() {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo22946() {
    }

    public AbstractDialogInterfaceOnClickListenerC8552(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f27934 = abstractActivityC17204;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        this.f27931 = (TextView) viewM40395.findViewById(R.id.title);
        this.f27936 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        this.f27933 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f27928 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        this.f27935 = c23255;
        this.f27927 = (FrameLayout) viewM40395.findViewById(R.id.MT_Protector);
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8012(false);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, this);
        if (i != -1) {
            c2361.m8018(i, this);
        }
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
        this.f27937 = dialogInterfaceC8327M7999;
        dialogInterfaceC8327M7999.m22427(new DialogInterface.OnKeyListener() { // from class: l.֨ۢᩴ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552 = this.f3903;
                abstractDialogInterfaceOnClickListenerC8552.getClass();
                if (keyEvent.getAction() != 0 || i3 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                abstractDialogInterfaceOnClickListenerC8552.mo22944();
                return true;
            }
        });
        dialogInterfaceC8327M7999.m22426(this);
        c23255.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۡۢᩴ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                return AbstractDialogInterfaceOnClickListenerC8552.m22913(this.f30232, i3, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22913(AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552, int i, KeyEvent keyEvent) {
        C23255 c23255 = abstractDialogInterfaceOnClickListenerC8552.f27935;
        if ((c23255.mo52297() & 131087) == 131073) {
            return false;
        }
        if (i != 66 && i != 160) {
            return false;
        }
        int iMo52341 = c23255.mo52341();
        if (iMo52341 != 2 && iMo52341 != 3 && iMo52341 != 4 && iMo52341 != 6) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            abstractDialogInterfaceOnClickListenerC8552.mo1877();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 m22931() {
        return this.f27934;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m22950() {
        this.f27937.m22431(true);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            mo22944();
        } else {
            mo22946();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m22961() {
        this.f27935.m52326(131073);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22927(boolean z) {
        this.f27935.m54052(z);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22934(boolean z) {
        this.f27935.mo52291(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22940() {
        this.f27935.mo52291(2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22937() {
        this.f27936.m5766();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22919(int i) {
        C1626 c1626 = this.f27936;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1626.getLayoutParams();
        marginLayoutParams.topMargin = i;
        c1626.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m22939(int i) {
        this.f27935.m52310(i);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m22960() {
        this.f27935.m52328(8);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m22948(int i) {
        this.f27935.m52326(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m22957(int i) {
        this.f27935.m52333(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22923(TextWatcher textWatcher) {
        this.f27935.m53899(textWatcher);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22951() {
        this.f27937.dismiss();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m22914() {
        return this.f27935.m54021().toString();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 m22947() {
        return this.f27935.m54021();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22955(boolean z) {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f27937;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(this);
        if (this.f27930 && this.f27932 != null) {
            dialogInterfaceC8327.m22440().setOnClickListener(this.f27932);
        }
        if (this.f27930 && this.f27929 != null) {
            dialogInterfaceC8327.m22440().setOnLongClickListener(this.f27929);
        }
        if (z) {
            C21576.m49090(this.f27935);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22921(int i, View.OnClickListener onClickListener, ViewOnLongClickListenerC1596 viewOnLongClickListenerC1596) {
        if (i == -1) {
            return;
        }
        this.f27932 = onClickListener;
        this.f27929 = viewOnLongClickListenerC1596;
        this.f27937.m22424(-3, C21576.m49088(i), null);
        this.f27930 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22924(CharSequence charSequence) {
        this.f27935.mo52335(charSequence);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22933(String str) {
        this.f27935.m52337(str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m22943(String str) {
        this.f27935.m53903(str, true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22929(int i) {
        TextView textView = this.f27933;
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22935(int i) {
        TextView textView = this.f27928;
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m22962(int i) {
        this.f27935.mo52339(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22920(int i, int i2) {
        this.f27935.mo52316(i, i2);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m22916() {
        C23255 c23255 = this.f27935;
        c23255.mo52339(c23255.m54099());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m22959() {
        this.f27935.m52289();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m22942(int i) {
        this.f27935.m52304(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m22917() {
        this.f27935.m53981(13);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22915(int i) {
        this.f27933.setTextColor(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22922(ColorStateList colorStateList) {
        this.f27933.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m22930() {
        this.f27933.setTextSize(12);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m22958(String str) {
        TextView textView = this.f27933;
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m22949(String str) {
        TextView textView = this.f27928;
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m22945(int i) {
        this.f27931.setText(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22953(CharSequence charSequence) {
        this.f27931.setText(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m22936() {
        return this.f27936.m5770();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22925(String str) {
        this.f27936.m5768(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22952(int i) {
        this.f27936.m5768(this.f27934.getString(i));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22954(String str) {
        this.f27936.m5764(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22932(int i) {
        this.f27936.m5758(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22918() {
        m22923(new C2586(this));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Button m22928() {
        return this.f27937.m22440();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22926(ViewOnClickListenerC16971 viewOnClickListenerC16971) {
        C1626 c1626 = this.f27936;
        c1626.m5757(R.drawable.MT_Protector);
        c1626.m5760(this.f27934.getText(R.string.MT_Protector));
        c1626.m5759(viewOnClickListenerC16971);
        c1626.m5767(-1);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final FrameLayout m22941() {
        return this.f27927;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView m22938() {
        return this.f27933;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 m22956() {
        return this.f27937;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo1877();
    }
}
