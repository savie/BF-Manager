package l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import bin.mt.plus.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C22666 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73603 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static WeakHashMap f73604;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static ThreadLocal f73606;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Field f73608;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f73610;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f73609 = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C6083 f73605 = new C6083();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final ViewTreeObserverOnGlobalLayoutListenerC18015 f73607 = new ViewTreeObserverOnGlobalLayoutListenerC18015();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51095(View view, AbstractC7749 abstractC7749) {
        if (Build.VERSION.SDK_INT >= 30) {
            C21877.m49567(view, abstractC7749);
            return;
        }
        int i = C2528.f8077;
        Object tag = view.getTag(R.id.MT_Protector);
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC9239 = new ViewOnApplyWindowInsetsListenerC9239(view, abstractC7749);
        view.setTag(R.id.MT_Protector, viewOnApplyWindowInsetsListenerC9239);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC9239);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rect m51082() {
        if (f73606 == null) {
            f73606 = new ThreadLocal();
        }
        Rect rect = (Rect) f73606.get();
        if (rect == null) {
            rect = new Rect();
            f73606.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51088(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C6829.m19012(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51098(View view, C22687 c22687) {
        if (c22687 == null && (m51106(view) instanceof C10752)) {
            c22687 = new C22687();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c22687 == null ? null : c22687.getBridge());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51081(C25227 c25227) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2354.m7970(c25227);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51100(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2354.m7971(viewGroup, i);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m51112(View view) {
        return m51106(view) != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C22687 m51119(View view) {
        View.AccessibilityDelegate accessibilityDelegateM51106 = m51106(view);
        if (accessibilityDelegateM51106 == null) {
            return null;
        }
        if (accessibilityDelegateM51106 instanceof C10752) {
            return ((C10752) accessibilityDelegateM51106).f34151;
        }
        return new C22687(accessibilityDelegateM51106);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static View.AccessibilityDelegate m51106(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C6829.m19011(view);
        }
        if (f73610) {
            return null;
        }
        if (f73608 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f73608 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f73610 = true;
                return null;
            }
        }
        try {
            Object obj = f73608.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f73610 = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51080(View view, String str, InterfaceC20581 interfaceC20581) {
        int iM22638;
        ArrayList arrayListM51115 = m51115(view);
        int i = 0;
        while (true) {
            if (i >= arrayListM51115.size()) {
                int i2 = -1;
                for (int i3 = 0; i3 < 32 && i2 == -1; i3++) {
                    int i4 = f73609[i3];
                    boolean z = true;
                    for (int i5 = 0; i5 < arrayListM51115.size(); i5++) {
                        z &= ((C8451) arrayListM51115.get(i5)).m22638() != i4;
                    }
                    if (z) {
                        i2 = i4;
                    }
                }
                iM22638 = i2;
                break;
            }
            if (TextUtils.equals(str, ((C8451) arrayListM51115.get(i)).m22641())) {
                iM22638 = ((C8451) arrayListM51115.get(i)).m22638();
                break;
            }
            i++;
        }
        if (iM22638 != -1) {
            C8451 c8451 = new C8451(iM22638, str, interfaceC20581);
            C22687 c22687M51119 = m51119(view);
            if (c22687M51119 == null) {
                c22687M51119 = new C22687();
            }
            m51098(view, c22687M51119);
            m51116(c8451.m22638(), view);
            m51115(view).add(c8451);
            m51086(0, view);
        }
        return iM22638;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51096(View view, C8451 c8451, String str, InterfaceC20581 interfaceC20581) {
        if (interfaceC20581 == null && str == null) {
            m51125(c8451.m22638(), view);
            return;
        }
        C8451 c8451M22639 = c8451.m22639(str, interfaceC20581);
        C22687 c22687M51119 = m51119(view);
        if (c22687M51119 == null) {
            c22687M51119 = new C22687();
        }
        m51098(view, c22687M51119);
        m51116(c8451M22639.m22638(), view);
        m51115(view).add(c8451M22639);
        m51086(0, view);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m51125(int i, View view) {
        m51116(i, view);
        m51086(0, view);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m51116(int i, View view) {
        ArrayList arrayListM51115 = m51115(view);
        for (int i2 = 0; i2 < arrayListM51115.size(); i2++) {
            if (((C8451) arrayListM51115.get(i2)).m22638() == i) {
                arrayListM51115.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static ArrayList m51115(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.MT_Protector);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.MT_Protector, arrayList2);
        return arrayList2;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24158 m51085(View view) {
        if (f73604 == null) {
            f73604 = new WeakHashMap();
        }
        C24158 c24158 = (C24158) f73604.get(view);
        if (c24158 != null) {
            return c24158;
        }
        C24158 c24159 = new C24158(view);
        f73604.put(view, c24159);
        return c24159;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51087(View view, float f) {
        C9810.m25552(view, f);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static float m51105(View view) {
        return C9810.m25559(view);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51121(View view, float f) {
        C9810.m25565(view, f);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static float m51127(View view) {
        return C9810.m25562(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51092(View view, String str) {
        C9810.m25555(view, str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51109(View view) {
        return C9810.m25563(view);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static void m51079(View view) {
        C7574.m20697(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51097(View view, InterfaceC22491 interfaceC22491) {
        C9810.m25556(view, interfaceC22491);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3977 m51118(View view, C3977 c3977) {
        WindowInsets windowInsetsM12827 = c3977.m12827();
        if (windowInsetsM12827 != null) {
            WindowInsets windowInsetsM20698 = C7574.m20698(view, windowInsetsM12827);
            if (!windowInsetsM20698.equals(windowInsetsM12827)) {
                return C3977.m12812(view, windowInsetsM20698);
            }
        }
        return c3977;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3977 m51083(View view, C3977 c3977) {
        WindowInsets windowInsetsM12827 = c3977.m12827();
        if (windowInsetsM12827 != null) {
            WindowInsets windowInsetsM20696 = C7574.m20696(view, windowInsetsM12827);
            if (!windowInsetsM20696.equals(windowInsetsM12827)) {
                return C3977.m12812(view, windowInsetsM20696);
            }
        }
        return c3977;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51093(View view, List list) {
        if (Build.VERSION.SDK_INT >= 29) {
            C6829.m19013(view, list);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3977 m51078(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0862.m3497(view);
        }
        return C9810.m25566(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51094(View view, C3977 c3977, Rect rect) {
        C9810.m25551(view, c3977, rect);
    }

    @Deprecated
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C18893 m51113(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C13540.m33244(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new C18893(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m51104(C13801 c13801) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C4766.m14703(c13801);
        }
        return (String[]) c13801.getTag(R.id.MT_Protector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23433 m51084(View view, C23433 c23433) {
        if (Log.isLoggable("ViewCompat", 3)) {
            C17359.toString(c23433);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C4766.m14702(view, c23433);
        }
        InterfaceC19507 interfaceC19507 = (InterfaceC19507) view.getTag(R.id.MT_Protector);
        InterfaceC15031 interfaceC15031 = f73605;
        if (interfaceC19507 != null) {
            C23433 c23433Mo1540 = interfaceC19507.mo1540(view, c23433);
            if (c23433Mo1540 == null) {
                return null;
            }
            if (view instanceof InterfaceC15031) {
                interfaceC15031 = (InterfaceC15031) view;
            }
            return interfaceC15031.onReceiveContent(c23433Mo1540);
        }
        if (view instanceof InterfaceC15031) {
            interfaceC15031 = (InterfaceC15031) view;
        }
        return interfaceC15031.onReceiveContent(c23433);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m51111(View view) {
        return C9810.m25550(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51089(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        C9810.m25553(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C9810.m25550(view) == null && C9810.m25564(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m51110(View view) {
        return C9810.m25564(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51090(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        C9810.m25554(view, mode);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C9810.m25550(view) == null && C9810.m25564(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m51126(View view) {
        return C9810.m25558(view);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static float m51114(View view) {
        return C9810.m25561(view);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m51108(View view, float f) {
        C9810.m25560(view, f);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m51107(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect rectM51082 = m51082();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM51082.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM51082.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m51117(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m51117((View) parent2);
            }
        }
        if (z && rectM51082.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM51082);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51120(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect rectM51082 = m51082();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM51082.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM51082.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m51117(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m51117((View) parent2);
            }
        }
        if (z && rectM51082.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM51082);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static void m51117(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51101(ViewGroup viewGroup, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0862.m3498(viewGroup, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51102(ViewGroup viewGroup, C1608 c1608) {
        if (Build.VERSION.SDK_INT >= 24) {
            C9065.m24197(viewGroup, (PointerIcon) (c1608 != null ? c1608.m5658() : null));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51122(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2354.m7972(view, charSequence);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51123(View view, boolean z) {
        new C23983(R.id.MT_Protector, 0, 28, Boolean.class).m1250(view, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51091(View view, CharSequence charSequence) {
        new C3845(R.id.MT_Protector, 8, 28, CharSequence.class).m1250(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC18015 viewTreeObserverOnGlobalLayoutListenerC18015 = f73607;
        if (charSequence != null) {
            viewTreeObserverOnGlobalLayoutListenerC18015.m41994(view);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC18015.m41995(view);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static CharSequence m51124(View view) {
        return (CharSequence) new C3845(R.id.MT_Protector, 8, 28, CharSequence.class).m1249(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51103(C1255 c1255, CharSequence charSequence) {
        new C14285(R.id.MT_Protector, 64, 30, CharSequence.class).m1250(c1255, charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51099(View view, boolean z) {
        new C20999(R.id.MT_Protector, 0, 28, Boolean.class).m1250(view, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51086(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m51124(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m51124(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(m51124(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                }
            }
        }
    }
}
