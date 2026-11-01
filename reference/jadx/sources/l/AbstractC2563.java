package l;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 83VO */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2563 extends C12025 {
    public static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    public static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final InterfaceC5386 NODE_ADAPTER = new C4680();
    public static final InterfaceC22320 SPARSE_VALUES_ADAPTER = new C13854();
    public final View mHost;
    public final AccessibilityManager mManager;
    public C11737 mNodeProvider;
    public final Rect mTempScreenRect = new Rect();
    public final Rect mTempParentRect = new Rect();
    public final Rect mTempVisibleRect = new Rect();
    public final int[] mTempGlobalRect = new int[2];
    public int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m8000(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List list);

    public abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    public void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(C22006 c22006) {
    }

    public abstract void onPopulateNodeForVirtualView(int i, C22006 c22006);

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    public AbstractC2563(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        int i = C5031.f17539;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // l.C12025
    public C3660 getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new C11737(this);
        }
        return this.mNodeProvider;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                m8016(virtualViewAt);
                if (virtualViewAt != Integer.MIN_VALUE) {
                    return true;
                }
            } else {
                if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                    return false;
                }
                m8016(Integer.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iM8000 = m8000(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && m8015(iM8000, (Rect) null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                m8004();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    m8004();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return m8015(2, (Rect) null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m8015(1, (Rect) null);
                }
            }
        }
        return false;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            m8015(i, rect);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8003(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).m48841(rect);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m8015(int i, Rect rect) {
        C22006 c22006M32519;
        C17212 c17212M8010 = m8010();
        int i2 = this.mKeyboardFocusedVirtualViewId;
        Object obj = null;
        C22006 c22006 = i2 == Integer.MIN_VALUE ? null : (C22006) c17212M8010.m40144(i2, (Integer) null);
        if (i == 1 || i == 2) {
            View view = this.mHost;
            int i3 = C5031.f17539;
            boolean z = view.getLayoutDirection() == 1;
            InterfaceC22320 interfaceC22320 = SPARSE_VALUES_ADAPTER;
            InterfaceC5386 interfaceC5386 = NODE_ADAPTER;
            ((C13854) interfaceC22320).getClass();
            int iM40147 = c17212M8010.m40147();
            ArrayList arrayList = new ArrayList(iM40147);
            for (int i4 = 0; i4 < iM40147; i4++) {
                arrayList.add((C22006) c17212M8010.m40141(i4));
            }
            Collections.sort(arrayList, new C1152(z, interfaceC5386));
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size = arrayList.size();
                int iLastIndexOf = (c22006 == null ? -1 : arrayList.lastIndexOf(c22006)) + 1;
                if (iLastIndexOf < size) {
                    obj = arrayList.get(iLastIndexOf);
                }
            } else {
                int size2 = arrayList.size();
                if (c22006 != null) {
                    size2 = arrayList.indexOf(c22006);
                }
                int i5 = size2 - 1;
                if (i5 >= 0) {
                    obj = arrayList.get(i5);
                }
            }
            c22006M32519 = (C22006) obj;
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i6 = this.mKeyboardFocusedVirtualViewId;
            if (i6 != Integer.MIN_VALUE) {
                m8003(i6, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m8001(this.mHost, i, rect2);
            }
            c22006M32519 = C13148.m32519(c17212M8010, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c22006, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return requestKeyboardFocusForVirtualView(c22006M32519 != null ? c17212M8010.m40142(c17212M8010.m40143(c22006M32519)) : Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C17212 m8010() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        C17212 c17212 = new C17212();
        for (int i = 0; i < arrayList.size(); i++) {
            c17212.m40149(((Integer) arrayList.get(i)).intValue(), m8011(((Integer) arrayList.get(i)).intValue()));
        }
        return c17212;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rect m8001(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i == 130) {
            rect.set(0, -1, width, -1);
            return rect;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8004() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null);
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, m8002(i, i2));
    }

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventM8002 = m8002(i, 2048);
        accessibilityEventM8002.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventM8002);
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m8016(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.mHoveredVirtualViewId = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AccessibilityEvent m8002(int i, int i2) {
        if (i == -1) {
            return m8012(i2);
        }
        return m8013(i, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private AccessibilityEvent m8012(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @Override // l.C12025
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private AccessibilityEvent m8013(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        C22006 c22006ObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        accessibilityEventObtain.getText().add(c22006ObtainAccessibilityNodeInfo.m48827());
        accessibilityEventObtain.setContentDescription(c22006ObtainAccessibilityNodeInfo.m48830());
        accessibilityEventObtain.setScrollable(c22006ObtainAccessibilityNodeInfo.m48858());
        accessibilityEventObtain.setPassword(c22006ObtainAccessibilityNodeInfo.m48883());
        accessibilityEventObtain.setEnabled(c22006ObtainAccessibilityNodeInfo.m48892());
        accessibilityEventObtain.setChecked(c22006ObtainAccessibilityNodeInfo.m48836());
        onPopulateEventForVirtualView(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c22006ObtainAccessibilityNodeInfo.m48861());
        accessibilityEventObtain.setSource(this.mHost, i);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public C22006 obtainAccessibilityNodeInfo(int i) {
        if (i == -1) {
            return m8014();
        }
        return m8011(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C22006 m8014() {
        C22006 c22006M48826 = C22006.m48826(this.mHost);
        View view = this.mHost;
        int i = C5031.f17539;
        view.onInitializeAccessibilityNodeInfo(c22006M48826.m48885());
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (c22006M48826.m48869() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c22006M48826.m48840(((Integer) arrayList.get(i2)).intValue(), this.mHost);
        }
        return c22006M48826;
    }

    @Override // l.C12025
    public void onInitializeAccessibilityNodeInfo(View view, C22006 c22006) {
        super.onInitializeAccessibilityNodeInfo(view, c22006);
        onPopulateNodeForHost(c22006);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C22006 m8011(int i) {
        C22006 c22006M48825 = C22006.m48825();
        c22006M48825.m48890(true);
        c22006M48825.m48829(true);
        c22006M48825.m48844("android.view.View");
        Rect rect = INVALID_PARENT_BOUNDS;
        c22006M48825.m48863(rect);
        c22006M48825.m48831(rect);
        c22006M48825.m48864(this.mHost);
        onPopulateNodeForVirtualView(i, c22006M48825);
        if (c22006M48825.m48827() == null && c22006M48825.m48830() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c22006M48825.m48841(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM48837 = c22006M48825.m48837();
        if ((iM48837 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM48837 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c22006M48825.m48833(this.mHost.getContext().getPackageName());
        c22006M48825.m48871(i, this.mHost);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            c22006M48825.m48850(true);
            c22006M48825.m48838(128);
        } else {
            c22006M48825.m48850(false);
            c22006M48825.m48838(64);
        }
        boolean z = this.mKeyboardFocusedVirtualViewId == i;
        if (z) {
            c22006M48825.m48838(2);
        } else if (c22006M48825.m48879()) {
            c22006M48825.m48838(1);
        }
        c22006M48825.m48867(z);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        c22006M48825.m48872(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            c22006M48825.m48841(this.mTempScreenRect);
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                c22006M48825.m48831(this.mTempScreenRect);
                if (m8008(this.mTempScreenRect)) {
                    c22006M48825.m48882(true);
                }
            }
        }
        return c22006M48825;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return m8007(i2, bundle);
        }
        return m8006(i, i2, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8007(int i, Bundle bundle) {
        View view = this.mHost;
        int i2 = C5031.f17539;
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8006(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return requestKeyboardFocusForVirtualView(i);
        }
        if (i2 == 2) {
            return clearKeyboardFocusForVirtualView(i);
        }
        if (i2 == 64) {
            return m8009(i);
        }
        if (i2 == 128) {
            return m8005(i);
        }
        return onPerformActionForVirtualView(i, i2, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8008(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m8009(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m8005(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8005(int i) {
        if (this.mAccessibilityFocusedVirtualViewId != i) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 65536);
        return true;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }
}
