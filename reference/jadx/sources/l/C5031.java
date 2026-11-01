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
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5031 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static ThreadLocal f17537;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f17538;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f17539 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Field f17540;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static WeakHashMap f17542;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f17543 = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C8932 f17541 = new C8932();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final ViewTreeObserverOnGlobalLayoutListenerC20221 f17544 = new ViewTreeObserverOnGlobalLayoutListenerC20221();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13992(View view, AbstractC17026 abstractC17026) {
        if (Build.VERSION.SDK_INT >= 30) {
            C11610.m28941(view, abstractC17026);
            return;
        }
        int i = C1503.f6076;
        Object tag = view.getTag(R.id.MT_Protector);
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC14205 = new ViewOnApplyWindowInsetsListenerC14205(view, abstractC17026);
        view.setTag(R.id.MT_Protector, viewOnApplyWindowInsetsListenerC14205);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC14205);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rect m13977() {
        if (f17537 == null) {
            f17537 = new ThreadLocal();
        }
        Rect rect = (Rect) f17537.get();
        if (rect == null) {
            rect = new Rect();
            f17537.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13983(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C9638.m24536(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13990(View view, C12025 c12025) {
        if (c12025 == null && (m14003(view) instanceof C14142)) {
            c12025 = new C12025();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c12025 == null ? null : c12025.getBridge());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13976(C17492 c17492) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C23749.m52307(c17492);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13994(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C23749.m52299(viewGroup, i);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m14014(View view) {
        return m14003(view) != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12025 m14007(View view) {
        View.AccessibilityDelegate accessibilityDelegateM14003 = m14003(view);
        if (accessibilityDelegateM14003 == null) {
            return null;
        }
        if (accessibilityDelegateM14003 instanceof C14142) {
            return ((C14142) accessibilityDelegateM14003).f46413;
        }
        return new C12025(accessibilityDelegateM14003);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static View.AccessibilityDelegate m14003(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C9638.m24535(view);
        }
        if (f17538) {
            return null;
        }
        if (f17540 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f17540 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f17538 = true;
                return null;
            }
        }
        try {
            Object obj = f17540.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f17538 = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13975(View view, String str, InterfaceC8601 interfaceC8601) {
        int iM24321;
        ArrayList arrayListM13999 = m13999(view);
        int i = 0;
        while (true) {
            if (i >= arrayListM13999.size()) {
                int i2 = -1;
                for (int i3 = 0; i3 < 32 && i2 == -1; i3++) {
                    int i4 = f17543[i3];
                    boolean z = true;
                    for (int i5 = 0; i5 < arrayListM13999.size(); i5++) {
                        z &= ((C9494) arrayListM13999.get(i5)).m24321() != i4;
                    }
                    if (z) {
                        i2 = i4;
                    }
                }
                iM24321 = i2;
                break;
            }
            if (TextUtils.equals(str, ((C9494) arrayListM13999.get(i)).m24324())) {
                iM24321 = ((C9494) arrayListM13999.get(i)).m24321();
                break;
            }
            i++;
        }
        if (iM24321 != -1) {
            C9494 c9494 = new C9494(iM24321, str, interfaceC8601);
            C12025 c12025M14007 = m14007(view);
            if (c12025M14007 == null) {
                c12025M14007 = new C12025();
            }
            m13990(view, c12025M14007);
            m14000(c9494.m24321(), view);
            m13999(view).add(c9494);
            m13981(0, view);
        }
        return iM24321;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13988(View view, C9494 c9494, String str, InterfaceC8601 interfaceC8601) {
        if (interfaceC8601 == null && str == null) {
            m13973(c9494.m24321(), view);
            return;
        }
        C9494 c9494M24322 = c9494.m24322(str, interfaceC8601);
        C12025 c12025M14007 = m14007(view);
        if (c12025M14007 == null) {
            c12025M14007 = new C12025();
        }
        m13990(view, c12025M14007);
        m14000(c9494M24322.m24321(), view);
        m13999(view).add(c9494M24322);
        m13981(0, view);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m13973(int i, View view) {
        m14000(i, view);
        m13981(0, view);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m14000(int i, View view) {
        ArrayList arrayListM13999 = m13999(view);
        for (int i2 = 0; i2 < arrayListM13999.size(); i2++) {
            if (((C9494) arrayListM13999.get(i2)).m24321() == i) {
                arrayListM13999.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static ArrayList m13999(View view) {
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
    public static C20554 m13980(View view) {
        if (f17542 == null) {
            f17542 = new WeakHashMap();
        }
        C20554 c20554 = (C20554) f17542.get(view);
        if (c20554 != null) {
            return c20554;
        }
        C20554 c20555 = new C20554(view);
        f17542.put(view, c20555);
        return c20555;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13982(View view, float f) {
        C17398.m40525(view, f);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static float m14006(View view) {
        return C17398.m40539(view);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m14010(View view, float f) {
        C17398.m40543(view, f);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static float m14019(View view) {
        return C17398.m40544(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13987(View view, String str) {
        C17398.m40528(view, str);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m14001(View view) {
        return C17398.m40537(view);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static void m14002(View view) {
        C16693.m39169(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13989(View view, InterfaceC11754 interfaceC11754) {
        C17398.m40529(view, interfaceC11754);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C15844 m14008(View view, C15844 c15844) {
        WindowInsets windowInsetsM37687 = c15844.m37687();
        if (windowInsetsM37687 != null) {
            WindowInsets windowInsetsM39170 = C16693.m39170(view, windowInsetsM37687);
            if (!windowInsetsM39170.equals(windowInsetsM37687)) {
                return C15844.m37669(view, windowInsetsM39170);
            }
        }
        return c15844;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15844 m13978(View view, C15844 c15844) {
        WindowInsets windowInsetsM37687 = c15844.m37687();
        if (windowInsetsM37687 != null) {
            WindowInsets windowInsetsM39168 = C16693.m39168(view, windowInsetsM37687);
            if (!windowInsetsM39168.equals(windowInsetsM37687)) {
                return C15844.m37669(view, windowInsetsM39168);
            }
        }
        return c15844;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C15844 m13974(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C6109.m16608(view);
        }
        return C17398.m40521(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13991(View view, C15844 c15844, Rect rect) {
        C17398.m40524(view, c15844, rect);
    }

    @Deprecated
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static C5965 m14013(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C3286.m9792(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new C5965(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m13998(C1647 c1647) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C4325.m12165(c1647);
        }
        return (String[]) c1647.getTag(R.id.MT_Protector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18374 m13979(View view, C18374 c18374) {
        if (Log.isLoggable("ViewCompat", 3)) {
            C13638.toString(c18374);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C4325.m12163(view, c18374);
        }
        InterfaceC2580 interfaceC2580 = (InterfaceC2580) view.getTag(R.id.MT_Protector);
        InterfaceC5403 interfaceC5403 = f17541;
        if (interfaceC2580 != null) {
            C18374 c18374Mo8037 = interfaceC2580.mo8037(view, c18374);
            if (c18374Mo8037 == null) {
                return null;
            }
            if (view instanceof InterfaceC5403) {
                interfaceC5403 = (InterfaceC5403) view;
            }
            return interfaceC5403.onReceiveContent(c18374Mo8037);
        }
        if (view instanceof InterfaceC5403) {
            interfaceC5403 = (InterfaceC5403) view;
        }
        return interfaceC5403.onReceiveContent(c18374);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static ColorStateList m14018(View view) {
        return C17398.m40523(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13984(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        C17398.m40526(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C17398.m40523(view) == null && C17398.m40542(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m13971(View view) {
        return C17398.m40542(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13985(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        C17398.m40527(view, mode);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C17398.m40523(view) == null && C17398.m40542(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m14015(View view) {
        return C17398.m40538(view);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static float m14017(View view) {
        return C17398.m40520(view);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m14005(View view, float f) {
        C17398.m40540(view, f);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m14004(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect rectM13977 = m13977();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM13977.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM13977.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m14016(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m14016((View) parent2);
            }
        }
        if (z && rectM13977.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM13977);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m14009(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect rectM13977 = m13977();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM13977.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM13977.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m14016(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m14016((View) parent2);
            }
        }
        if (z && rectM13977.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM13977);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static void m14016(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13995(ViewGroup viewGroup, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C6109.m16610(viewGroup, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13996(ViewGroup viewGroup, C13165 c13165) {
        if (Build.VERSION.SDK_INT >= 24) {
            C11049.m27868(viewGroup, (PointerIcon) (c13165 != null ? c13165.m32554() : null));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m14011(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C23749.m52300(view, charSequence);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m14012(View view, boolean z) {
        new C10343(R.id.MT_Protector, 0, 28, Boolean.class).m2321(view, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static CharSequence m13972(View view) {
        return (CharSequence) new C7520(R.id.MT_Protector, 8, 28, CharSequence.class).m2320(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13986(View view, CharSequence charSequence) {
        new C7520(R.id.MT_Protector, 8, 28, CharSequence.class).m2321(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC20221 viewTreeObserverOnGlobalLayoutListenerC20221 = f17544;
        if (charSequence != null) {
            viewTreeObserverOnGlobalLayoutListenerC20221.m45715(view);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC20221.m45716(view);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13997(C12562 c12562, CharSequence charSequence) {
        new C20926(R.id.MT_Protector, 64, 30, CharSequence.class).m2321(c12562, charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13993(View view, boolean z) {
        new C15988(R.id.MT_Protector, 0, 28, Boolean.class).m2321(view, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13981(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m13972(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m13972(view));
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
                accessibilityEventObtain2.getText().add(m13972(view));
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
