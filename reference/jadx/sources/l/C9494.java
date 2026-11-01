package l;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9494 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C9494 f32114;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C9494 f32115;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C9494 f32118;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C9494 f32119;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C9494 f32120;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C9494 f32121;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C9494 f32122;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C9494 f32123;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C9494 f32124;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Class f32125;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f32126;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f32127;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8601 f32128;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C9494 f32117 = new C9494(1, (String) null);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C9494 f32116 = new C9494(2, (String) null);

    static {
        new C9494(4, (String) null);
        new C9494(8, (String) null);
        f32123 = new C9494(16, (String) null);
        new C9494(32, (String) null);
        new C9494(64, (String) null);
        new C9494(128, (String) null);
        new C9494(C22712.class, 256);
        new C9494(C22712.class, 512);
        new C9494(C14951.class, 1024);
        new C9494(C14951.class, 2048);
        f32122 = new C9494(4096, (String) null);
        f32124 = new C9494(8192, (String) null);
        new C9494(16384, (String) null);
        new C9494(32768, (String) null);
        new C9494(65536, (String) null);
        new C9494(C7895.class, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        f32115 = new C9494(262144, (String) null);
        f32114 = new C9494(524288, (String) null);
        f32118 = new C9494(1048576, (String) null);
        new C9494(C19184.class, 2097152);
        int i = Build.VERSION.SDK_INT;
        new C9494(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C9494(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, C17772.class);
        f32120 = new C9494(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
        new C9494(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
        f32119 = new C9494(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
        new C9494(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
        new C9494(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C9494(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C9494(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C9494(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C9494(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
        f32121 = new C9494(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, C18478.class);
        new C9494(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, C21300.class);
        new C9494(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C9494(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C9494(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C9494(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C9494(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C9494(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C9494(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C9494(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C9494(i >= 34 ? C13540.m33086() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C9494(int i, String str) {
        this(null, i, str, null, null);
    }

    public C9494(int i, CharSequence charSequence, InterfaceC8601 interfaceC8601) {
        this(null, i, charSequence, interfaceC8601, null);
    }

    public C9494(Class cls, int i) {
        this(null, i, null, null, cls);
    }

    public C9494(Object obj, int i, CharSequence charSequence, InterfaceC8601 interfaceC8601, Class cls) {
        this.f32127 = i;
        this.f32128 = interfaceC8601;
        if (obj == null) {
            this.f32126 = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.f32126 = obj;
        }
        this.f32125 = cls;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24321() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f32126).getId();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence m24324() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f32126).getLabel();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24323(View view) {
        InterfaceC8601 interfaceC8601 = this.f32128;
        if (interfaceC8601 == null) {
            return false;
        }
        Class cls = this.f32125;
        AbstractC6483 abstractC6483 = null;
        if (cls != null) {
            try {
                AbstractC6483 abstractC6484 = (AbstractC6483) cls.getDeclaredConstructor(null).newInstance(null);
                try {
                    abstractC6484.getClass();
                } catch (Exception unused) {
                }
                abstractC6483 = abstractC6484;
            } catch (Exception unused2) {
            }
        }
        return interfaceC8601.perform(view, abstractC6483);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9494 m24322(CharSequence charSequence, InterfaceC8601 interfaceC8601) {
        return new C9494(null, this.f32127, charSequence, interfaceC8601, this.f32125);
    }

    public final int hashCode() {
        Object obj = this.f32126;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C9494)) {
            return false;
        }
        Object obj2 = ((C9494) obj).f32126;
        Object obj3 = this.f32126;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM48819 = C22006.m48819(this.f32127);
        if (strM48819.equals("ACTION_UNKNOWN") && m24324() != null) {
            strM48819 = m24324().toString();
        }
        sb.append(strM48819);
        return sb.toString();
    }
}
