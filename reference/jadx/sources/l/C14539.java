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

/* JADX INFO: renamed from: l.ܳ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41GJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14539 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20183 f47609;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f47610 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f47608 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f47607 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34983(C20183 c20183) {
        this.f47609 = c20183;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20183 m35001() {
        return this.f47609;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m34993() {
        this.f47608.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34982(ArrayList arrayList) {
        this.f47610.clear();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ComponentCallbacksC22654 componentCallbacksC22654M34997 = m34997(str);
                if (componentCallbacksC22654M34997 == null) {
                    throw new IllegalStateException(C16523.m38890("No instantiated fragment for (", str, MotionUtils.EASING_TYPE_FORMAT_END));
                }
                if (AbstractC8894.m23060(2)) {
                    componentCallbacksC22654M34997.toString();
                }
                m34984(componentCallbacksC22654M34997);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34985(C23711 c23711) {
        ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
        if (m34986(componentCallbacksC22654M52206.mWho)) {
            return;
        }
        this.f47608.put(componentCallbacksC22654M52206.mWho, c23711);
        if (componentCallbacksC22654M52206.mRetainInstanceChangedWhileDetached) {
            if (componentCallbacksC22654M52206.mRetainInstance) {
                this.f47609.m45623(componentCallbacksC22654M52206);
            } else {
                this.f47609.m45625(componentCallbacksC22654M52206);
            }
            componentCallbacksC22654M52206.mRetainInstanceChangedWhileDetached = false;
        }
        if (AbstractC8894.m23060(2)) {
            componentCallbacksC22654M52206.toString();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34984(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (this.f47610.contains(componentCallbacksC22654)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC22654);
        }
        synchronized (this.f47610) {
            this.f47610.add(componentCallbacksC22654);
        }
        componentCallbacksC22654.mAdded = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34980(int i) {
        for (C23711 c23711 : this.f47608.values()) {
            if (c23711 != null) {
                c23711.m52208(i);
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m34974() {
        HashMap map;
        Iterator it = this.f47610.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f47608;
            if (!zHasNext) {
                break;
            }
            C23711 c23711 = (C23711) map.get(((ComponentCallbacksC22654) it.next()).mWho);
            if (c23711 != null) {
                c23711.m52211();
            }
        }
        for (C23711 c23712 : map.values()) {
            if (c23712 != null) {
                c23712.m52211();
                ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23712.m52206();
                if (componentCallbacksC22654M52206.mRemoving && !componentCallbacksC22654M52206.isInBackStack()) {
                    if (componentCallbacksC22654M52206.mBeingSaved && !this.f47607.containsKey(componentCallbacksC22654M52206.mWho)) {
                        c23712.m52215();
                    }
                    m34999(c23712);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34992(ComponentCallbacksC22654 componentCallbacksC22654) {
        synchronized (this.f47610) {
            this.f47610.remove(componentCallbacksC22654);
        }
        componentCallbacksC22654.mAdded = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34999(C23711 c23711) {
        ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
        if (componentCallbacksC22654M52206.mRetainInstance) {
            this.f47609.m45625(componentCallbacksC22654M52206);
        }
        if (((C23711) this.f47608.put(componentCallbacksC22654M52206.mWho, null)) != null && AbstractC8894.m23060(2)) {
            componentCallbacksC22654M52206.toString();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34979() {
        this.f47608.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17360 m35000(String str) {
        return (C17360) this.f47607.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17360 m34978(String str, C17360 c17360) {
        HashMap map = this.f47607;
        if (c17360 != null) {
            return (C17360) map.put(str, c17360);
        }
        return (C17360) map.remove(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34998(ArrayList arrayList) {
        HashMap map = this.f47607;
        map.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17360 c17360 = (C17360) it.next();
            map.put(c17360.f55231, c17360);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList m34975() {
        return new ArrayList(this.f47607.values());
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList m34977() {
        HashMap map = this.f47608;
        ArrayList arrayList = new ArrayList(map.size());
        for (C23711 c23711 : map.values()) {
            if (c23711 != null) {
                ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
                c23711.m52215();
                arrayList.add(componentCallbacksC22654M52206.mWho);
                if (AbstractC8894.m23060(2)) {
                    componentCallbacksC22654M52206.toString();
                    C13638.toString(componentCallbacksC22654M52206.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m34989() {
        synchronized (this.f47610) {
            if (this.f47610.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f47610.size());
            for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f47610) {
                arrayList.add(componentCallbacksC22654.mWho);
                if (AbstractC8894.m23060(2)) {
                    componentCallbacksC22654.toString();
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList m34995() {
        ArrayList arrayList = new ArrayList();
        for (C23711 c23711 : this.f47608.values()) {
            if (c23711 != null) {
                arrayList.add(c23711);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m34987() {
        ArrayList arrayList;
        if (this.f47610.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f47610) {
            arrayList = new ArrayList(this.f47610);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m34990() {
        ArrayList arrayList = new ArrayList();
        for (C23711 c23711 : this.f47608.values()) {
            if (c23711 != null) {
                arrayList.add(c23711.m52206());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m34996(int i) {
        ArrayList arrayList = this.f47610;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ComponentCallbacksC22654 componentCallbacksC22654 = (ComponentCallbacksC22654) arrayList.get(size);
                if (componentCallbacksC22654 != null && componentCallbacksC22654.mFragmentId == i) {
                    return componentCallbacksC22654;
                }
            } else {
                for (C23711 c23711 : this.f47608.values()) {
                    if (c23711 != null) {
                        ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
                        if (componentCallbacksC22654M52206.mFragmentId == i) {
                            return componentCallbacksC22654M52206;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m34991(String str) {
        if (str != null) {
            ArrayList arrayList = this.f47610;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ComponentCallbacksC22654 componentCallbacksC22654 = (ComponentCallbacksC22654) arrayList.get(size);
                if (componentCallbacksC22654 != null && str.equals(componentCallbacksC22654.mTag)) {
                    return componentCallbacksC22654;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C23711 c23711 : this.f47608.values()) {
            if (c23711 != null) {
                ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
                if (str.equals(componentCallbacksC22654M52206.mTag)) {
                    return componentCallbacksC22654M52206;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34986(String str) {
        return this.f47608.get(str) != null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23711 m34988(String str) {
        return (C23711) this.f47608.get(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m34976(String str) {
        ComponentCallbacksC22654 componentCallbacksC22654FindFragmentByWho;
        for (C23711 c23711 : this.f47608.values()) {
            if (c23711 != null && (componentCallbacksC22654FindFragmentByWho = c23711.m52206().findFragmentByWho(str)) != null) {
                return componentCallbacksC22654FindFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m34997(String str) {
        C23711 c23711 = (C23711) this.f47608.get(str);
        if (c23711 != null) {
            return c23711.m52206();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m34994(ComponentCallbacksC22654 componentCallbacksC22654) {
        View view;
        View view2;
        ViewGroup viewGroup = componentCallbacksC22654.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        ArrayList arrayList = this.f47610;
        int iIndexOf = arrayList.indexOf(componentCallbacksC22654);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            ComponentCallbacksC22654 componentCallbacksC22655 = (ComponentCallbacksC22654) arrayList.get(i);
            if (componentCallbacksC22655.mContainer == viewGroup && (view2 = componentCallbacksC22655.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= arrayList.size()) {
                return -1;
            }
            ComponentCallbacksC22654 componentCallbacksC22656 = (ComponentCallbacksC22654) arrayList.get(iIndexOf);
            if (componentCallbacksC22656.mContainer == viewGroup && (view = componentCallbacksC22656.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34981(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strM37076 = C15489.m37076(str, ASN1Dump.TAB);
        HashMap map = this.f47608;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C23711 c23711 : map.values()) {
                printWriter.print(str);
                if (c23711 != null) {
                    ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
                    printWriter.println(componentCallbacksC22654M52206);
                    componentCallbacksC22654M52206.dump(strM37076, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = this.f47610;
        int size = arrayList.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC22654 componentCallbacksC22654 = (ComponentCallbacksC22654) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC22654.toString());
            }
        }
    }
}
