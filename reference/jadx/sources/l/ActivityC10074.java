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
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4WV */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10074 extends ActivityC19126 implements InterfaceC7251, InterfaceC13227, InterfaceC1523 {

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17129 f34413;

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // l.InterfaceC7251
    public final void onSupportActionModeFinished(AbstractC12067 abstractC12067) {
    }

    @Override // l.InterfaceC7251
    public final void onSupportActionModeStarted(AbstractC12067 abstractC12067) {
    }

    @Override // l.InterfaceC7251
    public final AbstractC12067 onWindowStartingSupportActionMode(InterfaceC16300 interfaceC16300) {
        return null;
    }

    public ActivityC10074() {
        getSavedStateRegistry().m46525("androidx:appcompat", new C19246(this));
        m4081(new C8663(this));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m25488().mo23542(context));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        m25488().mo23557(i);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m25488().mo23577();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC10697 m25489() {
        return m25488().mo23576();
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return m25488().mo23556();
    }

    @Override // l.ActivityC1086, android.app.Activity
    public final void setContentView(int i) {
        m25486();
        m25488().mo23562(i);
    }

    @Override // l.ActivityC1086, android.app.Activity
    public final void setContentView(View view) {
        m25486();
        m25488().mo23548(view);
    }

    @Override // l.ActivityC1086, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m25486();
        m25488().mo23566(view, layoutParams);
    }

    @Override // l.ActivityC1086, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m25486();
        m25488().mo23549(view, layoutParams);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m25486() {
        C23773.m52318(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C13465.m32966(decorView, "<this>");
        decorView.setTag(R.id.MT_Protector, this);
        C12076.m30041(getWindow().getDecorView(), this);
        C2228.m6854(getWindow().getDecorView(), this);
    }

    @Override // l.ActivityC1086, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m25488().mo23547(configuration);
    }

    @Override // l.ActivityC19126, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m25488().mo23569();
    }

    @Override // l.ActivityC19126, android.app.Activity
    public void onStart() {
        super.onStart();
        m25488().mo23575();
    }

    @Override // l.ActivityC19126, android.app.Activity
    public void onStop() {
        super.onStop();
        m25488().mo23572();
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return m25488().mo23543(i);
    }

    @Override // l.ActivityC19126, l.ActivityC1086, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM6745;
        if (!super.onMenuItemSelected(i, menuItem)) {
            AbstractC10697 abstractC10697M25489 = m25489();
            if (menuItem.getItemId() != 16908332 || abstractC10697M25489 == null || (abstractC10697M25489.mo13894() & 4) == 0 || (intentM6745 = C2166.m6745(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentM6745)) {
                navigateUpTo(intentM6745);
                return true;
            }
            C4053 c4053M11557 = C4053.m11557(this);
            c4053M11557.m11558(this);
            c4053M11557.m11559();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // l.ActivityC19126, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m25488().mo23558();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m25488().mo23550(charSequence);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m25488().mo23564();
    }

    @Override // l.InterfaceC13227
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Intent mo25487() {
        return C2166.m6745(this);
    }

    @Override // l.InterfaceC1523
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC14225 mo5291() {
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = (LayoutInflaterFactory2C9161) m25488();
        layoutInflaterFactory2C9161.getClass();
        return new C3017(layoutInflaterFactory2C9161);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC17129 m25488() {
        if (this.f34413 == null) {
            int i = AbstractC17129.f54626;
            this.f34413 = new LayoutInflaterFactory2C9161(this, this);
        }
        return this.f34413;
    }

    @Override // l.ActivityC16858, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC10697 abstractC10697M25489 = m25489();
        if (keyCode == 82 && abstractC10697M25489 != null && abstractC10697M25489.mo26901(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = C7644.f25234;
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
        AbstractC10697 abstractC10697M25489 = m25489();
        if (getWindow().hasFeature(0)) {
            if (abstractC10697M25489 == null || !abstractC10697M25489.mo26903()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        AbstractC10697 abstractC10697M25489 = m25489();
        if (getWindow().hasFeature(0)) {
            if (abstractC10697M25489 == null || !abstractC10697M25489.mo26900()) {
                super.closeOptionsMenu();
            }
        }
    }
}
