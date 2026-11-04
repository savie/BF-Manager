package l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.motion.MotionUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.֨ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41GJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0954 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3937 f3498;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f3499 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f3497 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f3500 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3806(C3937 c3937) {
        this.f3498 = c3937;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3937 m3817() {
        return this.f3498;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m3810() {
        this.f3497.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3805(ArrayList arrayList) {
        this.f3499.clear();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ComponentCallbacksC11612 componentCallbacksC11612M3823 = m3823(str);
                if (componentCallbacksC11612M3823 == null) {
                    throw new IllegalStateException(C14442.m34865("No instantiated fragment for (", str, MotionUtils.EASING_TYPE_FORMAT_END));
                }
                if (AbstractC3191.m10427(2)) {
                    componentCallbacksC11612M3823.toString();
                }
                m3808(componentCallbacksC11612M3823);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3807(C9902 c9902) {
        ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
        if (m3809(componentCallbacksC11612M25719.mWho)) {
            return;
        }
        this.f3497.put(componentCallbacksC11612M25719.mWho, c9902);
        if (componentCallbacksC11612M25719.mRetainInstanceChangedWhileDetached) {
            if (componentCallbacksC11612M25719.mRetainInstance) {
                this.f3498.m12641(componentCallbacksC11612M25719);
            } else {
                this.f3498.m12645(componentCallbacksC11612M25719);
            }
            componentCallbacksC11612M25719.mRetainInstanceChangedWhileDetached = false;
        }
        if (AbstractC3191.m10427(2)) {
            componentCallbacksC11612M25719.toString();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3808(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (this.f3499.contains(componentCallbacksC11612)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC11612);
        }
        synchronized (this.f3499) {
            this.f3499.add(componentCallbacksC11612);
        }
        componentCallbacksC11612.mAdded = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3803(int i) {
        for (C9902 c9902 : this.f3497.values()) {
            if (c9902 != null) {
                c9902.m25721(i);
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m3815() {
        HashMap map;
        Iterator it = this.f3499.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f3497;
            if (!zHasNext) {
                break;
            }
            C9902 c9902 = (C9902) map.get(((ComponentCallbacksC11612) it.next()).mWho);
            if (c9902 != null) {
                c9902.m25725();
            }
        }
        for (C9902 c9903 : map.values()) {
            if (c9903 != null) {
                c9903.m25725();
                ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9903.m25719();
                if (componentCallbacksC11612M25719.mRemoving && !componentCallbacksC11612M25719.isInBackStack()) {
                    if (componentCallbacksC11612M25719.mBeingSaved && !this.f3500.containsKey(componentCallbacksC11612M25719.mWho)) {
                        c9903.m25728();
                    }
                    m3825(c9903);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m3813(ComponentCallbacksC11612 componentCallbacksC11612) {
        synchronized (this.f3499) {
            this.f3499.remove(componentCallbacksC11612);
        }
        componentCallbacksC11612.mAdded = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3825(C9902 c9902) {
        ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
        if (componentCallbacksC11612M25719.mRetainInstance) {
            this.f3498.m12645(componentCallbacksC11612M25719);
        }
        if (((C9902) this.f3497.put(componentCallbacksC11612M25719.mWho, null)) != null && AbstractC3191.m10427(2)) {
            componentCallbacksC11612M25719.toString();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3802() {
        this.f3497.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0208 m3816(String str) {
        return (C0208) this.f3500.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0208 m3801(String str, C0208 c0208) {
        HashMap map = this.f3500;
        if (c0208 != null) {
            return (C0208) map.put(str, c0208);
        }
        return (C0208) map.remove(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3824(ArrayList arrayList) {
        HashMap map = this.f3500;
        map.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0208 c0208 = (C0208) it.next();
            map.put(c0208.f1408, c0208);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList m3826() {
        return new ArrayList(this.f3500.values());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m3800() {
        HashMap map = this.f3497;
        ArrayList arrayList = new ArrayList(map.size());
        for (C9902 c9902 : map.values()) {
            if (c9902 != null) {
                ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
                c9902.m25728();
                arrayList.add(componentCallbacksC11612M25719.mWho);
                if (AbstractC3191.m10427(2)) {
                    componentCallbacksC11612M25719.toString();
                    C17359.toString(componentCallbacksC11612M25719.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m3814() {
        synchronized (this.f3499) {
            if (this.f3499.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f3499.size());
            for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f3499) {
                arrayList.add(componentCallbacksC11612.mWho);
                if (AbstractC3191.m10427(2)) {
                    componentCallbacksC11612.toString();
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m3821() {
        ArrayList arrayList = new ArrayList();
        for (C9902 c9902 : this.f3497.values()) {
            if (c9902 != null) {
                arrayList.add(c9902);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m3818() {
        ArrayList arrayList;
        if (this.f3499.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f3499) {
            arrayList = new ArrayList(this.f3499);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m3811() {
        ArrayList arrayList = new ArrayList();
        for (C9902 c9902 : this.f3497.values()) {
            if (c9902 != null) {
                arrayList.add(c9902.m25719());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m3822(int i) {
        ArrayList arrayList = this.f3499;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ComponentCallbacksC11612 componentCallbacksC11612 = (ComponentCallbacksC11612) arrayList.get(size);
                if (componentCallbacksC11612 != null && componentCallbacksC11612.mFragmentId == i) {
                    return componentCallbacksC11612;
                }
            } else {
                for (C9902 c9902 : this.f3497.values()) {
                    if (c9902 != null) {
                        ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
                        if (componentCallbacksC11612M25719.mFragmentId == i) {
                            return componentCallbacksC11612M25719;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m3812(String str) {
        if (str != null) {
            ArrayList arrayList = this.f3499;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ComponentCallbacksC11612 componentCallbacksC11612 = (ComponentCallbacksC11612) arrayList.get(size);
                if (componentCallbacksC11612 != null && str.equals(componentCallbacksC11612.mTag)) {
                    return componentCallbacksC11612;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C9902 c9902 : this.f3497.values()) {
            if (c9902 != null) {
                ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
                if (str.equals(componentCallbacksC11612M25719.mTag)) {
                    return componentCallbacksC11612M25719;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3809(String str) {
        return this.f3497.get(str) != null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9902 m3819(String str) {
        return (C9902) this.f3497.get(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m3827(String str) {
        ComponentCallbacksC11612 componentCallbacksC11612FindFragmentByWho;
        for (C9902 c9902 : this.f3497.values()) {
            if (c9902 != null && (componentCallbacksC11612FindFragmentByWho = c9902.m25719().findFragmentByWho(str)) != null) {
                return componentCallbacksC11612FindFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m3823(String str) {
        C9902 c9902 = (C9902) this.f3497.get(str);
        if (c9902 != null) {
            return c9902.m25719();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m3820(ComponentCallbacksC11612 componentCallbacksC11612) {
        View view;
        View view2;
        ViewGroup viewGroup = componentCallbacksC11612.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        ArrayList arrayList = this.f3499;
        int iIndexOf = arrayList.indexOf(componentCallbacksC11612);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            ComponentCallbacksC11612 componentCallbacksC11613 = (ComponentCallbacksC11612) arrayList.get(i);
            if (componentCallbacksC11613.mContainer == viewGroup && (view2 = componentCallbacksC11613.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= arrayList.size()) {
                return -1;
            }
            ComponentCallbacksC11612 componentCallbacksC11614 = (ComponentCallbacksC11612) arrayList.get(iIndexOf);
            if (componentCallbacksC11614.mContainer == viewGroup && (view = componentCallbacksC11614.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3804(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strM34972 = C14483.m34972(str, ASN1Dump.TAB);
        HashMap map = this.f3497;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C9902 c9902 : map.values()) {
                printWriter.print(str);
                if (c9902 != null) {
                    ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
                    printWriter.println(componentCallbacksC11612M25719);
                    componentCallbacksC11612M25719.dump(strM34972, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = this.f3499;
        int size = arrayList.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC11612 componentCallbacksC11612 = (ComponentCallbacksC11612) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC11612.toString());
            }
        }
    }
}
