package l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.Button;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G58J */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceC7957 extends DialogC7749 implements DialogInterface {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17834 f26144;

    public DialogInterfaceC7957(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, m21013(contextThemeWrapper, i));
        this.f26144 = new C17834(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21013(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21362 m21015() {
        return this.f26144.f56500;
    }

    @Override // l.DialogC7749, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f26144.m41420(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21018(CharSequence charSequence) {
        this.f26144.m41417(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21017(ViewGroup viewGroup) {
        this.f26144.m41419(viewGroup);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21016(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f26144.m41413(i, charSequence, onClickListener, null);
    }

    @Override // l.DialogC7749, l.DialogC13082, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26144.m41411();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C19229 c19229 = this.f26144.f56496;
        if (c19229 == null || !c19229.m44182(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        C19229 c19229 = this.f26144.f56496;
        if (c19229 == null || !c19229.m44182(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Button m21014(int i) {
        C17834 c17834 = this.f26144;
        if (i == -3) {
            return c17834.f56475;
        }
        if (i == -2) {
            return c17834.f56479;
        }
        if (i != -1) {
            c17834.getClass();
            return null;
        }
        return c17834.f56506;
    }
}
