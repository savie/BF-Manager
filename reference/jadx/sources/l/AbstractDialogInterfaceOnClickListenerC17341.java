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

/* JADX INFO: renamed from: l.ܿ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5F9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC17341 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f55195;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public View.OnLongClickListener f55196;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f55197 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f55198;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f55199;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView f55200;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public View.OnClickListener f55201;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f55202;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10948 f55203;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final FrameLayout f55204;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Button f55205;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final TextView f55206;

    public void onDismiss(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo21386() {
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract void mo1069();

    /* JADX INFO: renamed from: ᩸ */
    public void mo24190() {
    }

    public AbstractDialogInterfaceOnClickListenerC17341(AbstractActivityC12483 abstractActivityC12483, int i) {
        this.f55202 = abstractActivityC12483;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        this.f55198 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f55200 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f55199 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f55206 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        C10948 c10948 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        this.f55203 = c10948;
        C7000.m18806(c10948, 0, -1, 0, -1);
        this.f55204 = (FrameLayout) viewM30995.findViewById(R.id.MT_Protector);
        this.f55205 = (Button) viewM30995.findViewById(R.id.button1);
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21265(false);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, this);
        if (i != -1) {
            c8067.m21271(i, this);
        }
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067.m21252();
        this.f55195 = dialogInterfaceC19356M21252;
        dialogInterfaceC19356M21252.m44368(new DialogInterface.OnKeyListener() { // from class: l.֡۫ۚ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341 = this.f1898;
                abstractDialogInterfaceOnClickListenerC17341.getClass();
                if (keyEvent.getAction() != 0 || i3 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                abstractDialogInterfaceOnClickListenerC17341.mo24190();
                return true;
            }
        });
        dialogInterfaceC19356M21252.m44367(this);
        c10948.setOnKeyListener(new View.OnKeyListener() { // from class: l.ܽ۫ۚ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                return AbstractDialogInterfaceOnClickListenerC17341.m40332(this.f53364, i3, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40332(AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341, int i, KeyEvent keyEvent) {
        C10948 c10948 = abstractDialogInterfaceOnClickListenerC17341.f55203;
        if ((c10948.mo17038() & 131087) == 131073) {
            return false;
        }
        if (i != 66 && i != 160) {
            return false;
        }
        int iMo16933 = c10948.mo16933();
        if (iMo16933 != 2 && iMo16933 != 3 && iMo16933 != 4 && iMo16933 != 6) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            abstractDialogInterfaceOnClickListenerC17341.mo1069();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 m40358() {
        return this.f55202;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m40356() {
        this.f55195.m44372(true);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            mo24190();
        } else {
            mo21386();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m40369() {
        this.f55203.m27484(131073);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40348(boolean z) {
        this.f55203.m16907(z);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40361(boolean z) {
        this.f55203.m16930(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m40372() {
        this.f55203.m16930(2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m40357() {
        this.f55203.m27483(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40341(int i) {
        C10948 c10948 = this.f55203;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c10948.getLayoutParams();
        marginLayoutParams.topMargin = i;
        c10948.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m40334(int i) {
        this.f55203.m27482(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40373() {
        this.f55203.m27477(8);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m40350(int i) {
        this.f55203.m27484(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m40336(int i) {
        this.f55203.m27481(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40345(TextWatcher textWatcher) {
        this.f55203.m16853(textWatcher);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40364() {
        this.f55195.dismiss();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m40352() {
        return this.f55203.m17000().toString();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 m40374() {
        return this.f55203.m17000();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40368(boolean z) {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f55195;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(this);
        if (this.f55197 && this.f55201 != null) {
            dialogInterfaceC19356.m44361().setOnClickListener(this.f55201);
        }
        if (this.f55197 && this.f55196 != null) {
            dialogInterfaceC19356.m44361().setOnLongClickListener(this.f55196);
        }
        if (z) {
            C16737.m39290(this.f55203);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40343(int i, View.OnClickListener onClickListener, ViewOnLongClickListenerC0856 viewOnLongClickListenerC0856) {
        if (i == -1) {
            return;
        }
        this.f55201 = onClickListener;
        this.f55196 = viewOnLongClickListenerC0856;
        this.f55195.m44365(-3, C16737.m39288(i), null);
        this.f55197 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40346(CharSequence charSequence) {
        this.f55203.mo16989(charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40367(String str) {
        this.f55203.m16962(str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m40351(String str) {
        this.f55203.m16857(str, true);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m40363(int i) {
        TextView textView = this.f55199;
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m40353(int i) {
        TextView textView = this.f55206;
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40342(int i, int i2) {
        this.f55203.mo16839(i, i2);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m40371() {
        C10948 c10948 = this.f55203;
        c10948.mo17029(c10948.m16842());
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m40355() {
        this.f55203.m27486();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m40375(int i) {
        this.f55203.m27473(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m40370() {
        this.f55203.m16960(13);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m40339(int i) {
        this.f55199.setTextColor(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40344(ColorStateList colorStateList) {
        this.f55199.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m40354() {
        this.f55199.setTextSize(12);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40360(String str) {
        TextView textView = this.f55199;
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m40337(String str) {
        TextView textView = this.f55206;
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m40376(int i) {
        this.f55198.setText(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40366(CharSequence charSequence) {
        this.f55198.setText(charSequence);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m40377() {
        return this.f55200.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40347(String str) {
        TextView textView = this.f55200;
        if (str == null || str.isEmpty()) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40365(int i) {
        TextView textView = this.f55200;
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40340() {
        m40345(new C12403(this));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Button m40338() {
        return this.f55195.m44361();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Button m40349() {
        return this.f55205;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final FrameLayout m40333() {
        return this.f55204;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40359(int i) {
        this.f55200.setTextColor(i);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView m40362() {
        return this.f55199;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 m40335() {
        return this.f55195;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo1069();
    }
}
