package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: renamed from: l.ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4WV */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC4348 extends ActivityC3409 implements InterfaceC14788, InterfaceC23171, InterfaceC14130 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC1365 f15723;

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // l.InterfaceC14788
    public final void onSupportActionModeFinished(AbstractC10116 abstractC10116) {
    }

    @Override // l.InterfaceC14788
    public final void onSupportActionModeStarted(AbstractC10116 abstractC10116) {
    }

    @Override // l.InterfaceC14788
    public final AbstractC10116 onWindowStartingSupportActionMode(InterfaceC19067 interfaceC19067) {
        return null;
    }

    public ActivityC4348() {
        getSavedStateRegistry().m36621("androidx:appcompat", new C6586(this));
        m16527(new C24486(this));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m13854().mo5026(context));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        m13854().mo5044(i);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m13854().mo5050();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC2944 m13853() {
        return m13854().mo5039();
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return m13854().mo5043();
    }

    @Override // l.ActivityC5577, android.app.Activity
    public final void setContentView(int i) {
        m16533();
        m13854().mo5036(i);
    }

    @Override // l.ActivityC5577, android.app.Activity
    public final void setContentView(View view) {
        m16533();
        m13854().mo5030(view);
    }

    @Override // l.ActivityC5577, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m16533();
        m13854().mo5045(view, layoutParams);
    }

    @Override // l.ActivityC5577, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m16533();
        m13854().mo5031(view, layoutParams);
    }

    @Override // l.ActivityC5577, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m13854().mo5029(configuration);
    }

    @Override // l.ActivityC3409, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m13854().mo5041();
    }

    @Override // l.ActivityC3409, android.app.Activity
    public void onStart() {
        super.onStart();
        m13854().mo5042();
    }

    @Override // l.ActivityC3409, android.app.Activity
    public void onStop() {
        super.onStop();
        m13854().mo5040();
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return m13854().mo5027(i);
    }

    @Override // l.ActivityC3409, l.ActivityC5577, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM56153;
        if (!super.onMenuItemSelected(i, menuItem)) {
            AbstractC2944 abstractC2944M13853 = m13853();
            if (menuItem.getItemId() != 16908332 || abstractC2944M13853 == null || (abstractC2944M13853.mo9632() & 4) == 0 || (intentM56153 = C25188.m56153(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentM56153)) {
                navigateUpTo(intentM56153);
                return true;
            }
            C3033 c3033M9859 = C3033.m9859(this);
            c3033M9859.m9862(this);
            c3033M9859.m9863();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // l.ActivityC3409, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m13854().mo5037();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m13854().mo5032(charSequence);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m13854().mo5034();
    }

    @Override // l.InterfaceC23171
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Intent mo13855() {
        return C25188.m56153(this);
    }

    @Override // l.InterfaceC14130
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7419 mo13852() {
        LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = (LayoutInflaterFactory2C24354) m13854();
        layoutInflaterFactory2C24354.getClass();
        return new C22116(layoutInflaterFactory2C24354);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC1365 m13854() {
        if (this.f15723 == null) {
            ExecutorC19264 executorC19264 = AbstractC1365.f4859;
            this.f15723 = new LayoutInflaterFactory2C24354(this, this);
        }
        return this.f15723;
    }

    @Override // l.ActivityC8866, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC2944 abstractC2944M13853 = m13853();
        if (keyCode == 82 && abstractC2944M13853 != null && abstractC2944M13853.mo9630(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = C18628.f60549;
        return super.getResources();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        AbstractC2944 abstractC2944M13853 = m13853();
        if (getWindow().hasFeature(0)) {
            if (abstractC2944M13853 == null || !abstractC2944M13853.mo9631()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        AbstractC2944 abstractC2944M13853 = m13853();
        if (getWindow().hasFeature(0)) {
            if (abstractC2944M13853 == null || !abstractC2944M13853.mo9628()) {
                super.closeOptionsMenu();
            }
        }
    }
}
