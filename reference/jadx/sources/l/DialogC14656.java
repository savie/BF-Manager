package l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34P4 */
/* JADX INFO: loaded from: classes5.dex */
public class DialogC14656 extends DialogC11542 implements InterfaceC14788 {
    public AbstractC1365 mDelegate;
    public final InterfaceC4041 mKeyDispatcher;

    @Override // l.InterfaceC14788
    public void onSupportActionModeFinished(AbstractC10116 abstractC10116) {
    }

    @Override // l.InterfaceC14788
    public void onSupportActionModeStarted(AbstractC10116 abstractC10116) {
    }

    @Override // l.InterfaceC14788
    public AbstractC10116 onWindowStartingSupportActionMode(InterfaceC19067 interfaceC19067) {
        return null;
    }

    public DialogC14656(Context context) {
        this(context, 0);
    }

    public DialogC14656(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new InterfaceC4041() { // from class: l.ۘܳ
            @Override // l.InterfaceC4041
            /* JADX INFO: renamed from: ۙ */
            public final boolean mo13007(KeyEvent keyEvent) {
                return this.f15405.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC1365 delegate = getDelegate();
        delegate.mo5044(getThemeResId(context, i));
        delegate.mo5025();
    }

    public DialogC14656(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new InterfaceC4041() { // from class: l.ۘܳ
            @Override // l.InterfaceC4041
            /* JADX INFO: renamed from: ۙ */
            public final boolean mo13007(KeyEvent keyEvent) {
                return this.f15405.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    @Override // l.DialogC11542, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().mo5038();
        super.onCreate(bundle);
        getDelegate().mo5025();
    }

    public AbstractC2944 getSupportActionBar() {
        return getDelegate().mo5039();
    }

    @Override // l.DialogC11542, android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().mo5036(i);
    }

    @Override // l.DialogC11542, android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().mo5030(view);
    }

    @Override // l.DialogC11542, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().mo5045(view, layoutParams);
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        return getDelegate().mo5027(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo5032(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo5032(getContext().getString(i));
    }

    @Override // l.DialogC11542, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().mo5031(view, layoutParams);
    }

    @Override // l.DialogC11542, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().mo5040();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo5037();
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo5047(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().mo5034();
    }

    public AbstractC1365 getDelegate() {
        if (this.mDelegate == null) {
            ExecutorC19264 executorC19264 = AbstractC1365.f4859;
            this.mDelegate = new LayoutInflaterFactory2C24354(this, this);
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
        return C14481.m34959(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }
}
