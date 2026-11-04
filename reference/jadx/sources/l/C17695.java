package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Process;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import bin.mt.plus.R;
import com.google.android.accessibility.selecttospeak.SelectToSpeakService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.ܽܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CIUF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17695 implements InterfaceC4249 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C17695 f58156 = new C17695();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile WeakReference f58157;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21403 f58158;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21447 f58159;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f58160;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C20733 f58165;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0564 f58163 = new C0564(C21576.f68934);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C22917 f58161 = new C22917(C21576.f68934);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17930 f58164 = new C17930();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17930 f58162 = new C17930(0);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static C17695 m41415() {
        return f58156;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static boolean m41412() {
        C11750 c11750M41405 = m41405();
        return (c11750M41405 == null || c11750M41405.m29500()) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41433() {
        return this.f58160;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C11750 m41405() {
        WeakReference weakReference = f58157;
        if (weakReference == null) {
            return null;
        }
        return (C11750) weakReference.get();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11750 m41440() {
        C11750 c11750M41405 = m41405();
        if (this.f58160 || c11750M41405 == null || !c11750M41405.m29499()) {
            return null;
        }
        return c11750M41405;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m41448() {
        C21403 c21403;
        C21447 c21447;
        if (m41440() == null || (c21403 = this.f58158) == null || c21403.m48697() || (c21447 = this.f58159) == null) {
            return false;
        }
        if (c21447.m48799()) {
            return true;
        }
        C20733 c20733 = this.f58165;
        return c20733 != null && c20733.m47429();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17930 m41443() {
        return this.f58164;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList m41435() {
        return this.f58163.m2577();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m41416() {
        C0564 c0564 = this.f58163;
        return c0564.m2576() ? c0564.m2577() : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C17930 m41417() {
        return this.f58162;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2012 m41436() {
        C21403 c21403 = this.f58158;
        if (c21403 == null) {
            return null;
        }
        return c21403.m48692();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m41410() {
        return Math.max(0, Math.min(50, C21576.f68931.getInt("itp", 0)));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m41429() {
        return 1.0f - (m41410() / 100.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41420(int i) {
        C21576.f68931.edit().mo3486(Math.max(0, Math.min(50, i)), "itp").apply();
        C21447 c21447 = this.f58159;
        if (c21447 != null) {
            c21447.setAlpha(m41429());
        }
        C20733 c20733 = this.f58165;
        if (c20733 != null) {
            c20733.m47427(m41429());
        }
        C21403 c21403 = this.f58158;
        if (c21403 != null) {
            c21403.m48696();
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m41430() {
        C21447 c21447 = this.f58159;
        if (c21447 != null) {
            c21447.m48804();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m41438() {
        C21447 c21447 = this.f58159;
        return c21447 != null && c21447.m48794();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m41447() {
        C11750 c11750M41440 = m41440();
        if (c11750M41440 == null) {
            throw new IllegalStateException("Accessibility service is not connected");
        }
        if (!C7543.m20616(c11750M41440)) {
            throw new IllegalStateException("Overlay permission is not granted");
        }
        try {
            C21403 c21403 = this.f58158;
            if (c21403 == null || c21403.m48697()) {
                this.f58161.m51671();
                this.f58163.m2578();
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(C21576.f68934, C7207.m19791());
                Configuration configuration = new Configuration();
                configuration.fontScale = 1.0f;
                contextThemeWrapper.applyOverrideConfiguration(configuration);
                this.f58158 = new C21403(contextThemeWrapper, new C0292(this), new C5763(this), this);
                this.f58159 = new C21447(contextThemeWrapper, this);
            }
            if (this.f58165 != null) {
                m41411();
            } else {
                this.f58159.m48800();
                this.f58158.m48687();
            }
        } catch (RuntimeException e) {
            m41442();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14689 m41406(C17695 c17695) {
        C10982 c10982M51672 = c17695.f58161.m51672();
        if (c10982M51672 == null) {
            return null;
        }
        return new C14689(c10982M51672.f34690, c10982M51672.f34689);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m41442() {
        C21403 c21403 = this.f58158;
        if (c21403 != null) {
            c21403.m48698();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m41434() {
        m41414(true);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m41445() {
        m41414(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m41414(final boolean z) {
        C2056.m7091();
        m41442();
        final C11750 c11750M41440 = m41440();
        if (c11750M41440 != null) {
            if (!z || (C21576.f68931.getBoolean("iad", true) && C15457.m37014((ContextWrapper) c11750M41440))) {
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        c11750M41440.disableSelf();
                        C15457.m37012();
                        c11750M41440.m29498(true);
                        this.f58164.mo40353((Object) null);
                        return;
                    } catch (RuntimeException unused) {
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                }
                this.f58160 = true;
                c11750M41440.m29498(true);
                this.f58164.mo40353((Object) null);
                try {
                    C5261.f18540.execute(new Runnable() { // from class: l.֫ܺܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            final C17695 c17695 = this.f6763;
                            boolean z2 = z;
                            final C11750 c11750 = c11750M41440;
                            ApplicationC17729 applicationC17729 = C21576.f68934;
                            InterfaceC24911 interfaceC24911M21117 = C7756.m21117();
                            final boolean zM50139 = false;
                            if (C22171.m50137((Context) applicationC17729, interfaceC24911M21117)) {
                                synchronized (interfaceC24911M21117) {
                                    if (z2) {
                                        if (!C15457.m37014((ContextWrapper) applicationC17729)) {
                                        }
                                    }
                                    zM50139 = C22171.m50139(interfaceC24911M21117, Process.myUserHandle().hashCode(), new ComponentName(applicationC17729, (Class<?>) SelectToSpeakService.class).flattenToString(), new C9732());
                                }
                            }
                            C21576.m49068(new Runnable() { // from class: l.ۧܺܳ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c17695.m41407(c11750, zM50139);
                                }
                            });
                        }
                    });
                } catch (RejectedExecutionException unused2) {
                    m41407(c11750M41440, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m41407(C11750 c11750, boolean z) {
        this.f58160 = false;
        if (z) {
            C15457.m37012();
        }
        if (m41405() == c11750) {
            c11750.m29498(z);
        }
        if (!z) {
            C22673.m51152(R.string.MT_Protector);
        }
        this.f58164.mo40353((Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41419() {
        C21403 c21403 = this.f58158;
        if (c21403 == null || this.f58165 != null) {
            return;
        }
        c21403.m48689();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41439() {
        C21447 c21447;
        C21403 c21403 = this.f58158;
        if (c21403 == null || c21403.m48697() || this.f58159 == null || this.f58165 != null) {
            return;
        }
        if (m41440() == null || !C7543.m20616(this.f58159.getContext())) {
            m41442();
            return;
        }
        C20733 c20733M47419 = C20733.m47419(this.f58159.getContext(), "inspector");
        c20733M47419.setImageDrawable(C24920.m55517(this.f58159.getResources(), R.drawable.MT_Protector, this.f58159.getContext().getTheme()));
        c20733M47419.setOnClickListener(new ViewOnClickListenerC3238(2, this));
        c20733M47419.setContentDescription(this.f58159.getContext().getString(R.string.MT_Protector));
        c20733M47419.m47427(m41429());
        c20733M47419.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC16949(this, c20733M47419));
        try {
            c20733M47419.m47426();
            this.f58165 = c20733M47419;
            this.f58159.m48801();
            this.f58158.m48693();
        } catch (RuntimeException unused) {
            C20733 c20733 = this.f58165;
            boolean z = c20733 == c20733M47419;
            if (c20733 == c20733M47419) {
                this.f58165 = null;
            }
            c20733M47419.m47428();
            if (z && (c21447 = this.f58159) != null) {
                try {
                    c21447.m48800();
                } catch (RuntimeException unused2) {
                    m41442();
                }
            }
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void m41411() {
        if (this.f58165 == null || this.f58158 == null || this.f58159 == null) {
            return;
        }
        if (m41440() == null || !C7543.m20616(this.f58159.getContext())) {
            m41442();
            return;
        }
        try {
            this.f58159.m48800();
            this.f58158.m48687();
            C20733 c20733 = this.f58165;
            this.f58165 = null;
            if (c20733 != null) {
                c20733.m47428();
            }
        } catch (RuntimeException unused) {
            C21447 c21447 = this.f58159;
            if (c21447 != null) {
                c21447.m48801();
            }
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41427(C21447 c21447) {
        if (this.f58159 == c21447) {
            m41442();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m41437() {
        C21403 c21403 = this.f58158;
        if (c21403 != null) {
            c21403.m48691();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41426(C21403 c21403, int i) {
        if (c21403 == this.f58158) {
            this.f58162.mo40353(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41428(boolean z) {
        C21447 c21447 = this.f58159;
        if (c21447 == null || this.f58165 != null) {
            return;
        }
        c21447.m48798(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41424(RunnableC16181 runnableC16181) {
        C21447 c21447 = this.f58159;
        if (c21447 != null) {
            c21447.m48797(runnableC16181);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41425(C21403 c21403) {
        if (c21403 != this.f58158) {
            return;
        }
        C20733 c20733 = this.f58165;
        this.f58165 = null;
        if (c20733 != null) {
            c20733.m47428();
        }
        C21447 c21447 = this.f58159;
        if (c21447 != null) {
            c21447.m48802();
        }
        this.f58159 = null;
        this.f58158 = null;
        this.f58161.m51671();
        this.f58162.mo40353((Object) 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18452 m41418(View view) {
        C21447 c21447 = this.f58159;
        if (c21447 == null) {
            throw new IllegalStateException("Inspector window is not available");
        }
        return c21447.m48795(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41421(C8723 c8723) {
        C21447 c21447 = this.f58159;
        if (c21447 == null) {
            throw new IllegalStateException("Inspector window is not available");
        }
        c21447.m48796(c8723);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41431() {
        this.f58163.m2574();
        C21447 c21447 = this.f58159;
        if (c21447 != null && this.f58165 == null) {
            c21447.m48803();
        }
        this.f58164.mo40353((Object) null);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41432(C11750 c11750) {
        if (m41405() != c11750) {
            m41442();
            this.f58161.m51669();
        }
        f58157 = new WeakReference(c11750);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41444(C11750 c11750) {
        if (m41405() != c11750) {
            return;
        }
        this.f58161.m51671();
        this.f58164.mo40353((Object) null);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m41441(C11750 c11750) {
        if (m41405() != c11750) {
            return;
        }
        m41442();
        this.f58161.m51669();
        this.f58164.mo40353((Object) null);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m41446(C11750 c11750) {
        m41441(c11750);
        if (m41405() == c11750) {
            f58157 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41422(C11750 c11750) {
        C21403 c21403;
        if (m41405() != c11750 || (c21403 = this.f58158) == null) {
            return;
        }
        c21403.m48691();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41423(C11750 c11750, AccessibilityEvent accessibilityEvent) {
        if (m41405() == c11750 && accessibilityEvent.getEventType() == 32) {
            this.f58161.m51670(accessibilityEvent);
            if (m41448()) {
                if (!C7543.m20616(c11750)) {
                    m41442();
                    return;
                }
                if (this.f58163.m2575(accessibilityEvent)) {
                    C21447 c21447 = this.f58159;
                    if (c21447 != null && this.f58165 == null) {
                        c21447.m48803();
                    }
                    this.f58164.mo40353((Object) null);
                }
            }
        }
    }
}
