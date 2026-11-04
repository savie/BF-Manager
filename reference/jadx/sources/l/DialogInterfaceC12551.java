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

/* JADX INFO: renamed from: l.ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G58J */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceC12551 extends DialogC14656 implements DialogInterface {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3602 f40321;

    public DialogInterfaceC12551(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, m31224(contextThemeWrapper, i));
        this.f40321 = new C3602(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31224(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23740 m31226() {
        return this.f40321.f12340;
    }

    @Override // l.DialogC14656, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f40321.m11680(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31229(CharSequence charSequence) {
        this.f40321.m11677(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31228(ViewGroup viewGroup) {
        this.f40321.m11679(viewGroup);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31227(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f40321.m11673(i, charSequence, onClickListener, null);
    }

    @Override // l.DialogC14656, l.DialogC11542, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f40321.m11671();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C23307 c23307 = this.f40321.f12313;
        if (c23307 == null || !c23307.m52442(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        C23307 c23307 = this.f40321.f12313;
        if (c23307 == null || !c23307.m52442(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Button m31225(int i) {
        C3602 c3602 = this.f40321;
        if (i == -3) {
            return c3602.f12311;
        }
        if (i == -2) {
            return c3602.f12341;
        }
        if (i != -1) {
            c3602.getClass();
            return null;
        }
        return c3602.f12338;
    }
}
