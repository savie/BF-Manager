package l;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8451 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C8451 f27625;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C8451 f27626;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C8451 f27627;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C8451 f27629;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C8451 f27630;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C8451 f27631;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C8451 f27632;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C8451 f27633;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C8451 f27635;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C8451 f27636;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C8451 f27637;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f27638;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f27639;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC20581 f27640;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Class f27641;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C8451 f27628 = new C8451(1, (String) null);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8451 f27634 = new C8451(2, (String) null);

    static {
        new C8451(4, (String) null);
        new C8451(8, (String) null);
        f27630 = new C8451(16, (String) null);
        new C8451(32, (String) null);
        new C8451(64, (String) null);
        new C8451(128, (String) null);
        new C8451(C11630.class, 256);
        new C8451(C11630.class, 512);
        new C8451(C25057.class, 1024);
        new C8451(C25057.class, 2048);
        f27633 = new C8451(4096, (String) null);
        f27637 = new C8451(8192, (String) null);
        new C8451(16384, (String) null);
        new C8451(32768, (String) null);
        new C8451(65536, (String) null);
        new C8451(C23565.class, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        f27625 = new C8451(262144, (String) null);
        f27629 = new C8451(524288, (String) null);
        f27627 = new C8451(1048576, (String) null);
        new C8451(C3427.class, 2097152);
        int i = Build.VERSION.SDK_INT;
        new C8451(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
        f27636 = new C8451(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, C17597.class);
        f27626 = new C8451(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
        new C8451(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
        f27632 = new C8451(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
        new C8451(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
        new C8451(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C8451(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C8451(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C8451(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C8451(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
        f27635 = new C8451(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, C16105.class);
        new C8451(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, C16851.class);
        new C8451(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C8451(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C8451(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C8451(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C8451(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C8451(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C8451(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C8451(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        f27631 = new C8451(i >= 34 ? C4919.m15102() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C8451(int i, String str) {
        this(null, i, str, null, null);
    }

    public C8451(int i, CharSequence charSequence, InterfaceC20581 interfaceC20581) {
        this(null, i, charSequence, interfaceC20581, null);
    }

    public C8451(Class cls, int i) {
        this(null, i, null, null, cls);
    }

    public C8451(Object obj, int i, CharSequence charSequence, InterfaceC20581 interfaceC20581, Class cls) {
        this.f27639 = i;
        this.f27640 = interfaceC20581;
        if (obj == null) {
            this.f27638 = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.f27638 = obj;
        }
        this.f27641 = cls;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22638() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f27638).getId();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence m22641() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f27638).getLabel();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22640(View view) {
        InterfaceC20581 interfaceC20581 = this.f27640;
        if (interfaceC20581 == null) {
            return false;
        }
        Class cls = this.f27641;
        AbstractC1936 abstractC1936 = null;
        if (cls != null) {
            try {
                AbstractC1936 abstractC1937 = (AbstractC1936) cls.getDeclaredConstructor(null).newInstance(null);
                try {
                    abstractC1937.getClass();
                } catch (Exception unused) {
                }
                abstractC1936 = abstractC1937;
            } catch (Exception unused2) {
            }
        }
        return interfaceC20581.perform(view, abstractC1936);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8451 m22639(CharSequence charSequence, InterfaceC20581 interfaceC20581) {
        return new C8451(null, this.f27639, charSequence, interfaceC20581, this.f27641);
    }

    public final int hashCode() {
        Object obj = this.f27638;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C8451)) {
            return false;
        }
        Object obj2 = ((C8451) obj).f27638;
        Object obj3 = this.f27638;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM45626 = C19835.m45626(this.f27639);
        if (strM45626.equals("ACTION_UNKNOWN") && m22641() != null) {
            strM45626 = m22641().toString();
        }
        sb.append(strM45626);
        return sb.toString();
    }
}
