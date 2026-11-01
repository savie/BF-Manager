package l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 34P4 */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC7749 extends DialogC13082 implements InterfaceC7251 {
    public AbstractC17129 mDelegate;
    public final InterfaceC7791 mKeyDispatcher;

    @Override // l.InterfaceC7251
    public void onSupportActionModeFinished(AbstractC12067 abstractC12067) {
    }

    @Override // l.InterfaceC7251
    public void onSupportActionModeStarted(AbstractC12067 abstractC12067) {
    }

    @Override // l.InterfaceC7251
    public AbstractC12067 onWindowStartingSupportActionMode(InterfaceC16300 interfaceC16300) {
        return null;
    }

    public DialogC7749(Context context) {
        this(context, 0);
    }

    public DialogC7749(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new InterfaceC7791() { // from class: l.ۤ᩹
            @Override // l.InterfaceC7791
            /* JADX INFO: renamed from: ۙ */
            public final boolean mo20463(KeyEvent keyEvent) {
                return this.f36177.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC17129 delegate = getDelegate();
        delegate.mo23557(getThemeResId(context, i));
        delegate.mo23538();
    }

    public DialogC7749(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new InterfaceC7791() { // from class: l.ۤ᩹
            @Override // l.InterfaceC7791
            /* JADX INFO: renamed from: ۙ */
            public final boolean mo20463(KeyEvent keyEvent) {
                return this.f36177.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    @Override // l.DialogC13082, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().mo23534();
        super.onCreate(bundle);
        getDelegate().mo23538();
    }

    public AbstractC10697 getSupportActionBar() {
        return getDelegate().mo23576();
    }

    @Override // l.DialogC13082, android.app.Dialog
    public void setContentView(int i) {
        m20398();
        getDelegate().mo23562(i);
    }

    @Override // l.DialogC13082, android.app.Dialog
    public void setContentView(View view) {
        m20398();
        getDelegate().mo23548(view);
    }

    @Override // l.DialogC13082, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m20398();
        getDelegate().mo23566(view, layoutParams);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20398() {
        C23773.m52318(getWindow().getDecorView(), this);
        C12076.m30041(getWindow().getDecorView(), this);
        C2228.m6854(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        return getDelegate().mo23543(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo23550(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo23550(getContext().getString(i));
    }

    @Override // l.DialogC13082, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo23549(view, layoutParams);
    }

    @Override // l.DialogC13082, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().mo23572();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo23558();
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo23568(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().mo23564();
    }

    public AbstractC17129 getDelegate() {
        if (this.mDelegate == null) {
            int i = AbstractC17129.f54626;
            this.mDelegate = new LayoutInflaterFactory2C9161(this, this);
        }
        return this.mDelegate;
    }

    public static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        return typedValue.resourceId;
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C21196.m47655(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }
}
