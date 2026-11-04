package l;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes2.dex */
public final class C3966 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static long f13552;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static int f13553;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC11423 f13554;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C7607 f13555;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ViewOnTouchListenerC20208 f13556;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5349 f13557;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f13558;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C19987 f13559;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f13560;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f13561;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f13562;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f13563;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8614 f13564;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f13565;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnPreDrawListenerC24850 f13566;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f13567;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f13568;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f13569;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC7364 f13570;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f13571;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f13572;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0149 f13573;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC12169 f13574;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f13575;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.ۧۛܳ] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.ViewTreeObserver$OnPreDrawListener, l.᩻ۛܳ] */
    public C3966(C8614 c8614, final C19987 c19987) {
        C5349 c5349 = new C5349(new C20374(this));
        this.f13557 = c5349;
        this.f13555 = new C7607();
        this.f13565 = Collections.EMPTY_LIST;
        this.f13558 = -1;
        this.f13575 = -1;
        this.f13567 = -1;
        this.f13571 = -1;
        this.f13560 = new int[0];
        this.f13562 = true;
        this.f13561 = C25227.FOREVER_NS;
        this.f13554 = new Runnable() { // from class: l.ۧۛܳ
            @Override // java.lang.Runnable
            public final void run() {
                C3966.m12730(this.f35923);
            }
        };
        ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.᩻ۛܳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C3966.m12716(this.f80441);
                return true;
            }
        };
        this.f13566 = r1;
        this.f13564 = c8614;
        this.f13559 = c19987;
        this.f13556 = new ViewOnTouchListenerC20208(this, c19987);
        c5349.m45065(c19987);
        c19987.setAdapter((ListAdapter) c5349);
        this.f13573 = new C0149(new C16644(this), new C17390(0, this));
        c19987.getViewTreeObserver().addOnPreDrawListener(r1);
        c19987.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC23358(this));
        c8614.m23233().getLifecycle().mo23077(new InterfaceC5252() { // from class: l.ܶۛܳ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                C3966.m12721(this.f51663, c19987, interfaceC11217, enumC9330);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12721(C3966 c3966, C19987 c19987, InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_DESTROY) {
            c3966.m12725();
            c19987.getViewTreeObserver().removeOnPreDrawListener(c3966.f13566);
        } else if (interfaceC11217.getLifecycle().mo23076().m8762(EnumC2619.STARTED)) {
            c3966.m12714(0L);
        } else {
            c3966.m12725();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12737(String str) {
        this.f13572 = str;
        this.f13569 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12743(String str) {
        m12715(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m12715(String str, boolean z) {
        C24104 c24104;
        InterfaceC2386 interfaceC2386;
        int iM10871;
        C19987 c19987 = this.f13559;
        int childCount = c19987.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            Object tag = c19987.getChildAt(i2).getTag();
            if ((tag instanceof C24104) && (interfaceC2386 = (c24104 = (C24104) tag).f77922) != null && interfaceC2386.isDirectory() == z && interfaceC2386.getPath().equals(str)) {
                if (z) {
                    iM10871 = C3296.m10871(553648127, 620756991);
                } else {
                    iM10871 = C3296.m10871(889192447, 822083583);
                }
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(iM10871 & C3296.f10758), new ColorDrawable(0)});
                transitionDrawable.setCrossFadeEnabled(true);
                c24104.f77920.setBackground(transitionDrawable);
                if (z) {
                    transitionDrawable.startTransition(EnumC5810.f19974);
                    return;
                } else {
                    C21576.m49069(new RunnableC5458(i, transitionDrawable), 250L);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12735(int i, String str, String str2, List list) {
        ViewTreeObserverOnPreDrawListenerC12169 viewTreeObserverOnPreDrawListenerC12169 = this.f13574;
        if (viewTreeObserverOnPreDrawListenerC12169 != null) {
            viewTreeObserverOnPreDrawListenerC12169.m30433();
        }
        this.f13574 = new ViewTreeObserverOnPreDrawListenerC12169(this, i, str, str2, list);
        this.f13564.m23233().getLifecycle().mo23077(this.f13574);
        C19987 c19987 = this.f13559;
        c19987.getViewTreeObserver().addOnPreDrawListener(this.f13574);
        c19987.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12732() {
        return this.f13559.getFirstVisiblePosition();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12742(final int i) {
        this.f13559.setSelection(i);
        C21576.m49069(new Runnable() { // from class: l.֫ۛܳ
            @Override // java.lang.Runnable
            public final void run() {
                C3966.m12717(this.f5909, i);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12717(C3966 c3966, int i) {
        C19987 c19987 = c3966.f13559;
        int firstVisiblePosition = c19987.getFirstVisiblePosition();
        int lastVisiblePosition = c19987.getLastVisiblePosition();
        if (i < firstVisiblePosition || lastVisiblePosition < i) {
            c19987.setSelection(i);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12733(int i, int i2, String str, C10851 c10851) {
        m12737((String) null);
        C19987 c19987 = this.f13559;
        c19987.setSelection(i);
        ViewTreeObserverOnPreDrawListenerC3220 viewTreeObserverOnPreDrawListenerC3220 = new ViewTreeObserverOnPreDrawListenerC3220(this, c10851, i2, new RunnableC16313(2, this, str));
        c19987.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3220);
        c19987.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC3220);
        c19987.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12736(int i, C22786 c22786) {
        ViewTreeObserverOnPreDrawListenerC3220 viewTreeObserverOnPreDrawListenerC3220 = new ViewTreeObserverOnPreDrawListenerC3220(this, c22786, i, null);
        C19987 c19987 = this.f13559;
        c19987.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3220);
        c19987.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC3220);
        c19987.invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8352 m12713(C3966 c3966, int i, View view, ViewGroup viewGroup) {
        C8352 c8352;
        View view2;
        C8614 c8614 = c3966.f13564;
        C24104 c24104 = view != null ? (C24104) view.getTag() : null;
        boolean z = false;
        if (view instanceof C8352) {
            C8352 c8353 = (C8352) view;
            c8353.m22479();
            view2 = view;
            c8352 = c8353;
        } else {
            C8352 c8354 = new C8352(viewGroup.getContext());
            c24104 = new C24104(z ? 1 : 0);
            c24104.f77920 = c8354.m22486();
            c24104.f77919 = c8354.m22483();
            c24104.f77923 = c8354.m22481();
            c24104.f77925 = c8354.m22484();
            c24104.f77927 = c8354.m22482();
            c24104.f77926 = c8354.m22485();
            c24104.f77928 = c8354.m22487();
            c8354.setTag(c24104);
            c8352 = c8354;
            view2 = c8354;
        }
        String str = c3966.f13572;
        if (str != null && System.currentTimeMillis() - c3966.f13569 > 800) {
            str = null;
        }
        try {
            InterfaceC2386 interfaceC2386M23168 = c8614.m23168(i);
            c24104.f77922 = interfaceC2386M23168;
            if (!c8614.m23218() || interfaceC2386M23168.isDirectory() || interfaceC2386M23168.mo8092()) {
                view2.setAlpha(1.0f);
            } else {
                view2.setAlpha(0.4f);
            }
            if (c8614.f28158.m36475()) {
                view2.setBackgroundColor(interfaceC2386M23168.isChecked() ? C3296.f10761 : 0);
            } else {
                view2.setBackgroundColor(0);
            }
            if (interfaceC2386M23168.mo8089()) {
                c8352.m22480(true);
                c24104.f77928.setText(interfaceC2386M23168.getName());
            } else {
                c8352.m22480(false);
                if (interfaceC2386M23168.mo8103()) {
                    c24104.f77919.setTextColor(C3296.f10768);
                } else {
                    c24104.f77919.setTextColor(C3296.f10751);
                }
                c24104.f77919.setText(interfaceC2386M23168.mo8100());
                if (str != null && str.equals(interfaceC2386M23168.getPath())) {
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C3296.f10758 & C3296.m10871(553648127, 620756991)), new ColorDrawable(0)});
                    transitionDrawable.setCrossFadeEnabled(true);
                    c24104.f77920.setBackground(transitionDrawable);
                    transitionDrawable.startTransition(EnumC5810.f19974);
                    c3966.f13572 = null;
                } else if (c24104.f77920.getBackground() != null) {
                    c24104.f77920.setBackground(null);
                }
                CharSequence charSequenceMo8099 = interfaceC2386M23168.mo8099();
                if (charSequenceMo8099 != null) {
                    c24104.f77923.setText(charSequenceMo8099);
                } else if (interfaceC2386M23168.mo8102()) {
                    long jMo8104 = interfaceC2386M23168.mo8104();
                    if (jMo8104 == -1) {
                        jMo8104 = interfaceC2386M23168.getSize();
                    }
                    c24104.f77923.setText(C8311.m22390(jMo8104));
                } else {
                    c24104.f77923.setText((CharSequence) null);
                }
                if (interfaceC2386M23168.mo8092()) {
                    c24104.f77925.setVisibility(4);
                    c24104.f77925.setText((CharSequence) null);
                    c24104.f77927.setText((CharSequence) null);
                    if (c24104.f77927.getVisibility() != 0) {
                        c24104.f77927.setVisibility(0);
                    }
                } else if (interfaceC2386M23168.mo8116()) {
                    c24104.f77925.setVisibility(4);
                    c24104.f77925.setText((CharSequence) null);
                    c24104.f77927.setVisibility(8);
                } else {
                    if (interfaceC2386M23168.mo8107()) {
                        c24104.f77925.setVisibility(0);
                        c24104.f77925.setText("->");
                    } else if (interfaceC2386M23168.mo8113()) {
                        c24104.f77925.setVisibility(0);
                        c24104.f77925.setText("* ");
                    } else {
                        c24104.f77925.setVisibility(4);
                        c24104.f77925.setText(" ");
                    }
                    CharSequence charSequenceMo8101 = interfaceC2386M23168.mo8101();
                    if (charSequenceMo8101 == null) {
                        int i2 = C17423.f56650;
                        charSequenceMo8101 = C22482.m50714(interfaceC2386M23168.getTime(), (i2 & 1) != 0, (i2 & 2) != 0);
                    }
                    c24104.f77927.setText(charSequenceMo8101);
                    if (c24104.f77927.getVisibility() != 0) {
                        c24104.f77927.setVisibility(0);
                    }
                }
                C11983 icon = interfaceC2386M23168.getIcon();
                if (icon != null) {
                    c24104.f77926.setImageDrawable(icon.m30080());
                }
            }
            int i3 = c24104.f77921;
            int i4 = C17423.f56645;
            if (i3 != i4) {
                c24104.f77921 = i4;
                c24104.f77919.setSingleLine(i4 == 1);
                c24104.f77919.setMaxLines(c24104.f77921);
            }
            int i5 = c24104.f77924;
            int i6 = C17423.f56647;
            if (i5 != i6) {
                c24104.f77924 = i6;
                if (i6 == 1) {
                    c24104.f77928.setTextSize(2, 15.0f);
                    c24104.f77919.setTextSize(2, 13.0f);
                    c24104.f77923.setTextSize(2, 10.0f);
                    c24104.f77925.setTextSize(2, 10.0f);
                    c24104.f77927.setTextSize(2, 10.0f);
                } else if (i6 == 2) {
                    c24104.f77928.setTextSize(2, 17.0f);
                    c24104.f77919.setTextSize(2, 15.0f);
                    c24104.f77923.setTextSize(2, 11.0f);
                    c24104.f77925.setTextSize(2, 11.0f);
                    c24104.f77927.setTextSize(2, 11.0f);
                } else if (i6 == 3) {
                    c24104.f77928.setTextSize(2, 19.0f);
                    c24104.f77919.setTextSize(2, 17.0f);
                    c24104.f77923.setTextSize(2, 12.0f);
                    c24104.f77925.setTextSize(2, 12.0f);
                    c24104.f77927.setTextSize(2, 12.0f);
                }
            }
        } catch (Exception unused) {
        }
        return (C8352) view2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m12724(int i) {
        f13553 = i;
        f13552 = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12741() {
        m12727();
        C8614 c8614 = this.f13564;
        InterfaceC0895 interfaceC0895Mo10169 = c8614.m23213().mo10169();
        for (InterfaceC2386 interfaceC2386 : c8614.m23202()) {
            if (interfaceC2386.getIcon() == null) {
                interfaceC2386.mo8095(interfaceC0895Mo10169.mo3626(interfaceC2386));
                int iMo2786 = interfaceC0895Mo10169.mo2786(interfaceC2386);
                if (iMo2786 != 0) {
                    interfaceC2386.mo8109(iMo2786);
                }
            }
        }
        long j = f13552 + ((long) f13553);
        long jUptimeMillis = SystemClock.uptimeMillis();
        C5349 c5349 = this.f13557;
        if (j > jUptimeMillis) {
            c5349.m36199(false);
        } else {
            c5349.m36199(true);
            c5349.m36200();
        }
        c5349.notifyDataSetChanged();
        m12714(0L);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m12744() {
        m12727();
        C8614 c8614 = this.f13564;
        InterfaceC0895 interfaceC0895Mo10169 = c8614.m23213().mo10169();
        for (InterfaceC2386 interfaceC2386 : c8614.m23202()) {
            interfaceC2386.mo8095(interfaceC0895Mo10169.mo3626(interfaceC2386));
            int iMo2786 = interfaceC0895Mo10169.mo2786(interfaceC2386);
            if (iMo2786 != 0) {
                interfaceC2386.mo8109(iMo2786);
            }
        }
        this.f13557.notifyDataSetChanged();
        m12714(0L);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m12740() {
        m12727();
        C5349 c5349 = this.f13557;
        c5349.m36199(false);
        c5349.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m12730(C3966 c3966) {
        c3966.f13561 = C25227.FOREVER_NS;
        c3966.f13559.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m12714(long j) {
        if (this.f13564.m23233().getLifecycle().mo23076() == EnumC2619.DESTROYED) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + j;
        if (jUptimeMillis >= this.f13561) {
            return;
        }
        C19987 c19987 = this.f13559;
        RunnableC11423 runnableC11423 = this.f13554;
        c19987.removeCallbacks(runnableC11423);
        this.f13561 = jUptimeMillis;
        c19987.postOnAnimationDelayed(runnableC11423, j);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m12727() {
        this.f13573.m1339();
        this.f13555.m20807();
        this.f13565 = Collections.EMPTY_LIST;
        this.f13571 = -1;
        this.f13567 = -1;
        this.f13575 = -1;
        this.f13558 = -1;
        this.f13560 = new int[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m12725() {
        if (!this.f13562) {
            m12727();
        }
        this.f13562 = true;
        this.f13559.removeCallbacks(this.f13554);
        this.f13561 = C25227.FOREVER_NS;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12716(C3966 c3966) {
        int i;
        int i2;
        int iCompare;
        int i3;
        int i4;
        int top;
        C19987 c19987 = c3966.f13559;
        C8614 c8614 = c3966.f13564;
        if (!c8614.m23233().getLifecycle().mo23076().m8762(EnumC2619.STARTED) || !c19987.isShown() || !c19987.isAttachedToWindow()) {
            c3966.m12725();
            return;
        }
        if (c8614.m23193()) {
            c3966.m12725();
            c3966.m12714(80L);
            return;
        }
        c3966.f13562 = false;
        AbstractC7364 abstractC7364M23213 = c8614.m23213();
        if (abstractC7364M23213 != c3966.f13570 || !C17359.equals(abstractC7364M23213.m20218(), c3966.f13568)) {
            c3966.m12727();
            c3966.f13570 = abstractC7364M23213;
            c3966.f13568 = abstractC7364M23213.m20218();
        }
        int firstVisiblePosition = c19987.getFirstVisiblePosition();
        int childCount = c19987.getChildCount();
        int i5 = (firstVisiblePosition + childCount) - 1;
        if (childCount <= 0 || (i2 = c3966.f13571) < 0) {
            i = 0;
        } else {
            if (firstVisiblePosition >= i2) {
                int i6 = firstVisiblePosition - i2;
                int[] iArr = c3966.f13560;
                if (i6 < iArr.length) {
                    i4 = iArr[i6];
                    top = c19987.getChildAt(0).getTop();
                } else if (i2 < firstVisiblePosition && (i3 = i2 - firstVisiblePosition) < childCount) {
                    i4 = c3966.f13560[0];
                    top = c19987.getChildAt(i3).getTop();
                } else {
                    iCompare = Integer.compare(firstVisiblePosition, i2) * c19987.getHeight();
                }
                iCompare = i4 - top;
            } else {
                if (i2 < firstVisiblePosition) {
                }
                iCompare = Integer.compare(firstVisiblePosition, i2) * c19987.getHeight();
            }
            i = iCompare;
        }
        if (c3966.f13560.length != childCount) {
            c3966.f13560 = new int[childCount];
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            c3966.f13560[i7] = c19987.getChildAt(i7).getTop();
        }
        c3966.f13571 = childCount == 0 ? -1 : firstVisiblePosition;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int iM20806 = c3966.f13555.m20806(jUptimeMillis, i, c19987.getHeight(), c19987.m45949(), c19987.m45950());
        int iM20805 = c3966.f13555.m20805();
        if (firstVisiblePosition != c3966.f13558 || i5 != c3966.f13575 || iM20806 != c3966.f13567 || iM20805 != c3966.f13563) {
            c3966.f13565 = C7607.m20803(c8614.m23215(), firstVisiblePosition, i5, iM20806, iM20805);
            c3966.f13558 = firstVisiblePosition;
            c3966.f13575 = i5;
            c3966.f13567 = iM20806;
            c3966.f13563 = iM20805;
        }
        c3966.f13573.m1340(c3966.f13565, childCount, abstractC7364M23213, abstractC7364M23213.mo10169(), iM20806, jUptimeMillis);
        if (c19987.m45949()) {
            c3966.m12714(80L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12720(C3966 c3966, InterfaceC2386 interfaceC2386) {
        C19987 c19987 = c3966.f13559;
        int childCount = c19987.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object tag = c19987.getChildAt(i).getTag();
            if (tag instanceof C24104) {
                C24104 c24104 = (C24104) tag;
                C11983 icon = interfaceC2386.getIcon();
                if (c24104.f77922 == interfaceC2386 && icon != null) {
                    C15688 c15688 = c24104.f77926;
                    if (c19987.m45949()) {
                        c15688.setImageDrawable(icon.m30080());
                        return;
                    }
                    Drawable drawable = c15688.getDrawable();
                    if (drawable == null) {
                        drawable = new ColorDrawable(0);
                    }
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, icon.m30080()});
                    transitionDrawable.setCrossFadeEnabled(true);
                    c15688.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12734(int i, View view) {
        view.setBackgroundColor(C3296.f10761);
        C15152 c15152 = this.f13564.f28158;
        if (!c15152.m36475()) {
            c15152.m36467(i);
        } else if (c15152.m36474(i)) {
            m12740();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m12739() {
        ApplicationC17729.m41518(this.f13564.f28158.m36470());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12738(int i) {
        List listM23215;
        C8614 c8614 = this.f13564;
        if (!c8614.m23218() && (listM23215 = c8614.m23215()) != null && i >= 0 && i < listM23215.size()) {
            return !((InterfaceC2386) listM23215.get(i)).mo8106();
        }
        return false;
    }
}
