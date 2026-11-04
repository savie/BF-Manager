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

/* JADX INFO: renamed from: l.ۤ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 83VO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11129 extends C22687 {
    public static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    public static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final InterfaceC23064 NODE_ADAPTER = new C13609();
    public static final InterfaceC20080 SPARSE_VALUES_ADAPTER = new C5164();
    public final View mHost;
    public final AccessibilityManager mManager;
    public C22318 mNodeProvider;
    public final Rect mTempScreenRect = new Rect();
    public final Rect mTempParentRect = new Rect();
    public final Rect mTempVisibleRect = new Rect();
    public final int[] mTempGlobalRect = new int[2];
    public int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m28092(int i) {
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

    public void onPopulateNodeForHost(C19835 c19835) {
    }

    public abstract void onPopulateNodeForVirtualView(int i, C19835 c19835);

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    public AbstractC11129(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        int i = C22666.f73603;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // l.C22687
    public C5665 getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new C22318(this);
        }
        return this.mNodeProvider;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                m28086(virtualViewAt);
                if (virtualViewAt != Integer.MIN_VALUE) {
                    return true;
                }
            } else {
                if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                    return false;
                }
                m28086(Integer.MIN_VALUE);
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
                                int iM28092 = m28092(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && m28091(iM28092, (Rect) null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                m28079();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    m28079();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return m28091(2, (Rect) null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m28091(1, (Rect) null);
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
            m28091(i, rect);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28078(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).m45636(rect);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m28091(int i, Rect rect) {
        C19835 c19835;
        C19835 c19835M32952;
        C2375 c2375M28084 = m28084();
        int i2 = this.mKeyboardFocusedVirtualViewId;
        Object obj = null;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            c19835 = null;
        } else {
            c2375M28084.getClass();
            c19835 = (C19835) C8341.m22446(c2375M28084, i2);
        }
        int i4 = -1;
        if (i == 1 || i == 2) {
            View view = this.mHost;
            int i5 = C22666.f73603;
            boolean z = view.getLayoutDirection() == 1;
            InterfaceC20080 interfaceC20080 = SPARSE_VALUES_ADAPTER;
            InterfaceC23064 interfaceC23064 = NODE_ADAPTER;
            ((C5164) interfaceC20080).getClass();
            int iM8074 = c2375M28084.m8074();
            ArrayList arrayList = new ArrayList(iM8074);
            for (int i6 = 0; i6 < iM8074; i6++) {
                arrayList.add((C19835) c2375M28084.m8075(i6));
            }
            Collections.sort(arrayList, new C15604(z, interfaceC23064));
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size = arrayList.size();
                int iLastIndexOf = (c19835 == null ? -1 : arrayList.lastIndexOf(c19835)) + 1;
                if (iLastIndexOf < size) {
                    obj = arrayList.get(iLastIndexOf);
                }
            } else {
                int size2 = arrayList.size();
                if (c19835 != null) {
                    size2 = arrayList.indexOf(c19835);
                }
                int i7 = size2 - 1;
                if (i7 >= 0) {
                    obj = arrayList.get(i7);
                }
            }
            c19835M32952 = (C19835) obj;
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i8 = this.mKeyboardFocusedVirtualViewId;
            if (i8 != Integer.MIN_VALUE) {
                m28078(i8, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m28076(this.mHost, i, rect2);
            }
            c19835M32952 = C13367.m32952(c2375M28084, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c19835, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (c19835M32952 != null) {
            if (c2375M28084.f7643) {
                C8341.m22447(c2375M28084);
            }
            int i9 = c2375M28084.f7644;
            for (int i10 = 0; i10 < i9; i10++) {
                if (c2375M28084.f7642[i10] == c19835M32952) {
                    i4 = i10;
                    break;
                }
            }
            if (c2375M28084.f7643) {
                C8341.m22447(c2375M28084);
            }
            i3 = c2375M28084.f7645[i4];
        }
        return requestKeyboardFocusForVirtualView(i3);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C2375 m28084() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        C2375 c2375 = new C2375();
        for (int i = 0; i < arrayList.size(); i++) {
            c2375.m8077(((Integer) arrayList.get(i)).intValue(), m28085(((Integer) arrayList.get(i)).intValue()));
        }
        return c2375;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rect m28076(View view, int i, Rect rect) {
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
    private boolean m28079() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null);
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, m28077(i, i2));
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
        AccessibilityEvent accessibilityEventM28077 = m28077(i, 2048);
        accessibilityEventM28077.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventM28077);
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m28086(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.mHoveredVirtualViewId = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AccessibilityEvent m28077(int i, int i2) {
        if (i == -1) {
            return m28088(i2);
        }
        return m28089(i, i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AccessibilityEvent m28088(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @Override // l.C22687
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AccessibilityEvent m28089(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        C19835 c19835ObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        accessibilityEventObtain.getText().add(c19835ObtainAccessibilityNodeInfo.m45659());
        accessibilityEventObtain.setContentDescription(c19835ObtainAccessibilityNodeInfo.m45685());
        accessibilityEventObtain.setScrollable(c19835ObtainAccessibilityNodeInfo.m45630());
        accessibilityEventObtain.setPassword(c19835ObtainAccessibilityNodeInfo.m45691());
        accessibilityEventObtain.setEnabled(c19835ObtainAccessibilityNodeInfo.m45694());
        accessibilityEventObtain.setChecked(c19835ObtainAccessibilityNodeInfo.m45628());
        onPopulateEventForVirtualView(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c19835ObtainAccessibilityNodeInfo.m45650());
        accessibilityEventObtain.setSource(this.mHost, i);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public C19835 obtainAccessibilityNodeInfo(int i) {
        if (i == -1) {
            return m28090();
        }
        return m28085(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C19835 m28090() {
        C19835 c19835M45622 = C19835.m45622(this.mHost);
        View view = this.mHost;
        int i = C22666.f73603;
        view.onInitializeAccessibilityNodeInfo(c19835M45622.m45662());
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (c19835M45622.m45677() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c19835M45622.m45635(((Integer) arrayList.get(i2)).intValue(), this.mHost);
        }
        return c19835M45622;
    }

    @Override // l.C22687
    public void onInitializeAccessibilityNodeInfo(View view, C19835 c19835) {
        super.onInitializeAccessibilityNodeInfo(view, c19835);
        onPopulateNodeForHost(c19835);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C19835 m28085(int i) {
        C19835 c19835M45624 = C19835.m45624();
        c19835M45624.m45661(true);
        c19835M45624.m45647(true);
        c19835M45624.m45639("android.view.View");
        Rect rect = INVALID_PARENT_BOUNDS;
        c19835M45624.m45652(rect);
        c19835M45624.m45686(rect);
        c19835M45624.m45653(this.mHost);
        onPopulateNodeForVirtualView(i, c19835M45624);
        if (c19835M45624.m45659() == null && c19835M45624.m45685() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c19835M45624.m45636(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM45632 = c19835M45624.m45632();
        if ((iM45632 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM45632 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c19835M45624.m45674(this.mHost.getContext().getPackageName());
        c19835M45624.m45679(i, this.mHost);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            c19835M45624.m45645(true);
            c19835M45624.m45633(128);
        } else {
            c19835M45624.m45645(false);
            c19835M45624.m45633(64);
        }
        boolean z = this.mKeyboardFocusedVirtualViewId == i;
        if (z) {
            c19835M45624.m45633(2);
        } else if (c19835M45624.m45669()) {
            c19835M45624.m45633(1);
        }
        c19835M45624.m45627(z);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        c19835M45624.m45680(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            c19835M45624.m45636(this.mTempScreenRect);
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                c19835M45624.m45686(this.mTempScreenRect);
                if (m28083(this.mTempScreenRect)) {
                    c19835M45624.m45629(true);
                }
            }
        }
        return c19835M45624;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return m28082(i2, bundle);
        }
        return m28081(i, i2, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28082(int i, Bundle bundle) {
        View view = this.mHost;
        int i2 = C22666.f73603;
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28081(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return requestKeyboardFocusForVirtualView(i);
        }
        if (i2 == 2) {
            return clearKeyboardFocusForVirtualView(i);
        }
        if (i2 == 64) {
            return m28087(i);
        }
        if (i2 == 128) {
            return m28080(i);
        }
        return onPerformActionForVirtualView(i, i2, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28083(Rect rect) {
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

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m28087(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m28080(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28080(int i) {
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
