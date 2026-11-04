package l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۗۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3191 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C1172 f10385;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC11612 f10386;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f10387;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC11612 f10388;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f10389;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C3937 f10390;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f10391;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17114 f10392;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C22583 f10393;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8515 f10394;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C2663 f10396;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC17114 f10397;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C9374 f10399;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f10401;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Runnable f10402;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10120 f10403;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f10404;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC17114 f10405;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f10406;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f10407;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f10408;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public AbstractC18325 f10409;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f10411;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7068 f10412;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8629 f10413;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC24293 f10414;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f10415;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f10418;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f10419;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f10421;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21309 f10422;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f10423;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f10424;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f10398 = new ArrayList();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0954 f10410 = new C0954();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final LayoutInflaterFactory2C7884 f10416 = new LayoutInflaterFactory2C7884(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC6323 f10417 = new C4683(this);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f10400 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map f10420 = C4681.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Map f10395 = C4681.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v14, types: [l.ۖ۫ۙ] */
    /* JADX WARN: Type inference failed for: r0v15, types: [l.۠۫ۙ] */
    public AbstractC3191() {
        C4681.synchronizedMap(new HashMap());
        this.f10403 = new C10120(this);
        this.f10406 = new CopyOnWriteArrayList();
        int i = 0;
        this.f10385 = new C1172(i, this);
        this.f10399 = new C9374(i, this);
        this.f10396 = new InterfaceC0818() { // from class: l.ۖ۫ۙ
            @Override // l.InterfaceC0818
            public final void accept(Object obj) {
                AbstractC3191.m10417(this.f8481, (C11761) obj);
            }
        };
        this.f10413 = new InterfaceC0818() { // from class: l.۠۫ۙ
            @Override // l.InterfaceC0818
            public final void accept(Object obj) {
                AbstractC3191.m10418(this.f28194, (C12728) obj);
            }
        };
        this.f10394 = new C21837(this);
        this.f10404 = -1;
        this.f10422 = new C10648(this);
        this.f10393 = new C22583();
        this.f10389 = new ArrayDeque();
        this.f10402 = new RunnableC19599(this);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m10427(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10415(AbstractC3191 abstractC3191, Configuration configuration) {
        if (abstractC3191.m10424()) {
            abstractC3191.m10459(false, configuration);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10416(AbstractC3191 abstractC3191, Integer num) {
        if (abstractC3191.m10424() && num.intValue() == 80) {
            abstractC3191.m10458(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10417(AbstractC3191 abstractC3191, C11761 c11761) {
        if (abstractC3191.m10424()) {
            abstractC3191.m10460(c11761.m29536(), false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10418(AbstractC3191 abstractC3191, C12728 c12728) {
        if (abstractC3191.m10424()) {
            abstractC3191.m10497(c12728.m31541(), false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10413(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C23219());
        AbstractC18325 abstractC18325 = this.f10409;
        try {
            if (abstractC18325 != null) {
                abstractC18325.mo42747(printWriter, new String[0]);
            } else {
                m10446(EnumC7687.f25319, (FileDescriptor) null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC4573 m10492() {
        return new C22120(this);
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    private void m10420() {
        synchronized (this.f10398) {
            if (!this.f10398.isEmpty()) {
                this.f10417.m18045(true);
            } else {
                this.f10417.m18045(m10437() > 0 && m10411(this.f10386));
            }
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static boolean m10411(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (componentCallbacksC11612 == null) {
            return true;
        }
        AbstractC3191 abstractC3191 = componentCallbacksC11612.mFragmentManager;
        return componentCallbacksC11612.equals(abstractC3191.f10388) && m10411(abstractC3191.f10386);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m10432() {
        m10500(true);
        if (this.f10417.m18046()) {
            m10433();
        } else {
            this.f10412.m19401();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m10433() {
        return m10419(-1, 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10494(int i) {
        m10495(i, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10495(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException(C13645.m33382(i, "Bad id: "));
        }
        m10454(new C23329(this, i), z);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m10472(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C13645.m33382(i, "Bad id: "));
        }
        m10419(i, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m10419(int i, int i2) {
        m10500(false);
        m10423(true);
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f10388;
        if (componentCallbacksC11612 != null && i < 0 && componentCallbacksC11612.getChildFragmentManager().m10433()) {
            return true;
        }
        boolean zM10463 = m10463(this.f10408, this.f10415, i, i2);
        if (zM10463) {
            this.f10424 = true;
            try {
                m10414(this.f10408, this.f10415);
                m10422();
            } catch (Throwable th) {
                m10422();
                throw th;
            }
        }
        m10420();
        boolean z = this.f10411;
        C0954 c0954 = this.f10410;
        if (z) {
            this.f10411 = false;
            Iterator it = c0954.m3821().iterator();
            while (it.hasNext()) {
                m10448((C9902) it.next());
            }
        }
        c0954.m3802();
        return zM10463;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m10437() {
        ArrayList arrayList = this.f10391;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC1700 m10503() {
        return (InterfaceC1700) this.f10391.get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10456(C20619 c20619) {
        if (this.f10418 == null) {
            this.f10418 = new ArrayList();
        }
        this.f10418.add(c20619);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10447(C4155 c4155) {
        View view;
        for (C9902 c9902 : this.f10410.m3821()) {
            ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
            if (componentCallbacksC11612M25719.mContainerId == c4155.getId() && (view = componentCallbacksC11612M25719.mView) != null && view.getParent() == null) {
                componentCallbacksC11612M25719.mContainer = c4155;
                c9902.m25720();
            }
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final List m10466() {
        return this.f10410.m3818();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23656 m10477(ComponentCallbacksC11612 componentCallbacksC11612) {
        return this.f10390.m12650(componentCallbacksC11612);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10496(ComponentCallbacksC11612 componentCallbacksC11612) {
        this.f10390.m12641(componentCallbacksC11612);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m10506(ComponentCallbacksC11612 componentCallbacksC11612) {
        this.f10390.m12645(componentCallbacksC11612);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m10467() {
        return this.f10387;
    }

    public final String toString() {
        StringBuilder sbM3018 = C0703.m3018(128, "FragmentManager{");
        sbM3018.append(Integer.toHexString(System.identityHashCode(this)));
        sbM3018.append(" in ");
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f10386;
        if (componentCallbacksC11612 != null) {
            sbM3018.append(componentCallbacksC11612.getClass().getSimpleName());
            sbM3018.append("{");
            sbM3018.append(Integer.toHexString(System.identityHashCode(this.f10386)));
            sbM3018.append(l.d);
        } else {
            AbstractC18325 abstractC18325 = this.f10409;
            if (abstractC18325 != null) {
                sbM3018.append(abstractC18325.getClass().getSimpleName());
                sbM3018.append("{");
                sbM3018.append(Integer.toHexString(System.identityHashCode(this.f10409)));
                sbM3018.append(l.d);
            } else {
                sbM3018.append("null");
            }
        }
        sbM3018.append("}}");
        return sbM3018.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10446(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM34972 = C14483.m34972(str, ASN1Dump.TAB);
        this.f10410.m3804(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f10407;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                ComponentCallbacksC11612 componentCallbacksC11612 = (ComponentCallbacksC11612) this.f10407.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC11612.toString());
            }
        }
        ArrayList arrayList2 = this.f10391;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C22120 c22120 = (C22120) this.f10391.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c22120.toString());
                c22120.m50075(strM34972, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f10400.get());
        synchronized (this.f10398) {
            int size3 = this.f10398.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC15869 interfaceC15869 = (InterfaceC15869) this.f10398.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(interfaceC15869);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f10409);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f10414);
        if (this.f10386 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f10386);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f10404);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f10419);
        printWriter.print(" mStopped=");
        printWriter.print(this.f10401);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f10387);
        if (this.f10423) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f10423);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10448(C9902 c9902) {
        ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
        if (componentCallbacksC11612M25719.mDeferStart) {
            if (this.f10424) {
                this.f10411 = true;
            } else {
                componentCallbacksC11612M25719.mDeferStart = false;
                c9902.m25725();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10452(ComponentCallbacksC11612 componentCallbacksC11612, boolean z) {
        ViewGroup viewGroupM10425 = m10425(componentCallbacksC11612);
        if (viewGroupM10425 == null || !(viewGroupM10425 instanceof C4155)) {
            return;
        }
        ((C4155) viewGroupM10425).m13308(!z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10443(int i, boolean z) {
        AbstractC18325 abstractC18325;
        if (this.f10409 == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f10404) {
            this.f10404 = i;
            C0954 c0954 = this.f10410;
            c0954.m3815();
            Iterator it = c0954.m3821().iterator();
            while (it.hasNext()) {
                m10448((C9902) it.next());
            }
            if (this.f10423 && (abstractC18325 = this.f10409) != null && this.f10404 == 7) {
                abstractC18325.mo42748();
                this.f10423 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9902 m10501(ComponentCallbacksC11612 componentCallbacksC11612) {
        String str = componentCallbacksC11612.mWho;
        C0954 c0954 = this.f10410;
        C9902 c9902M3819 = c0954.m3819(str);
        if (c9902M3819 != null) {
            return c9902M3819;
        }
        C9902 c9902 = new C9902(this.f10403, c0954, componentCallbacksC11612);
        c9902.m25722(this.f10409.m42754().getClassLoader());
        c9902.m25721(this.f10404);
        return c9902;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9902 m10440(ComponentCallbacksC11612 componentCallbacksC11612) {
        String str = componentCallbacksC11612.mPreviousWho;
        if (str != null) {
            C9047.m24149(componentCallbacksC11612, str);
        }
        if (m10427(2)) {
            componentCallbacksC11612.toString();
        }
        C9902 c9902M10501 = m10501(componentCallbacksC11612);
        componentCallbacksC11612.mFragmentManager = this;
        C0954 c0954 = this.f10410;
        c0954.m3807(c9902M10501);
        if (!componentCallbacksC11612.mDetached) {
            c0954.m3808(componentCallbacksC11612);
            componentCallbacksC11612.mRemoving = false;
            if (componentCallbacksC11612.mView == null) {
                componentCallbacksC11612.mHiddenChanged = false;
            }
            if (m10431(componentCallbacksC11612)) {
                this.f10423 = true;
            }
        }
        return c9902M10501;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10475(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (m10427(2)) {
            C17359.toString(componentCallbacksC11612);
        }
        boolean zIsInBackStack = componentCallbacksC11612.isInBackStack();
        if (componentCallbacksC11612.mDetached && zIsInBackStack) {
            return;
        }
        this.f10410.m3813(componentCallbacksC11612);
        if (m10431(componentCallbacksC11612)) {
            this.f10423 = true;
        }
        componentCallbacksC11612.mRemoving = true;
        m10428(componentCallbacksC11612);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m10465(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (m10427(2)) {
            C17359.toString(componentCallbacksC11612);
        }
        if (componentCallbacksC11612.mHidden) {
            return;
        }
        componentCallbacksC11612.mHidden = true;
        componentCallbacksC11612.mHiddenChanged = true ^ componentCallbacksC11612.mHiddenChanged;
        m10428(componentCallbacksC11612);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m10489(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (m10427(2)) {
            C17359.toString(componentCallbacksC11612);
        }
        if (componentCallbacksC11612.mDetached) {
            return;
        }
        componentCallbacksC11612.mDetached = true;
        if (componentCallbacksC11612.mAdded) {
            if (m10427(2)) {
                componentCallbacksC11612.toString();
            }
            this.f10410.m3813(componentCallbacksC11612);
            if (m10431(componentCallbacksC11612)) {
                this.f10423 = true;
            }
            m10428(componentCallbacksC11612);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m10473(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (m10427(2)) {
            C17359.toString(componentCallbacksC11612);
        }
        if (componentCallbacksC11612.mDetached) {
            componentCallbacksC11612.mDetached = false;
            if (componentCallbacksC11612.mAdded) {
                return;
            }
            this.f10410.m3808(componentCallbacksC11612);
            if (m10427(2)) {
                componentCallbacksC11612.toString();
            }
            if (m10431(componentCallbacksC11612)) {
                this.f10423 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m10441(int i) {
        return this.f10410.m3822(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m10493(String str) {
        return this.f10410.m3812(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m10470(String str) {
        return this.f10410.m3827(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m10442(String str) {
        return this.f10410.m3823(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m10487() {
        return this.f10419 || this.f10401;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10454(InterfaceC15869 interfaceC15869, boolean z) {
        if (!z) {
            if (this.f10409 != null) {
                if (m10487()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
            } else {
                if (this.f10387) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f10398) {
            if (this.f10409 == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f10398.add(interfaceC15869);
                m10436();
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m10436() {
        synchronized (this.f10398) {
            if (this.f10398.size() == 1) {
                this.f10409.m42752().removeCallbacks(this.f10402);
                this.f10409.m42752().post(this.f10402);
                m10420();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10439() {
        return this.f10400.getAndIncrement();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m10423(boolean z) {
        if (this.f10424) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f10409 == null) {
            if (this.f10387) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if (Looper.myLooper() == this.f10409.m42752().getLooper()) {
            if (!z && m10487()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
            if (this.f10408 == null) {
                this.f10408 = new ArrayList();
                this.f10415 = new ArrayList();
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be called from main thread of fragment host");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10457(C22120 c22120, boolean z) {
        if (z && (this.f10409 == null || this.f10387)) {
            return;
        }
        m10423(z);
        c22120.mo37837(this.f10408, this.f10415);
        this.f10424 = true;
        try {
            m10414(this.f10408, this.f10415);
            m10422();
            m10420();
            if (this.f10411) {
                this.f10411 = false;
                Iterator it = this.f10410.m3821().iterator();
                while (it.hasNext()) {
                    m10448((C9902) it.next());
                }
            }
            this.f10410.m3802();
        } catch (Throwable th) {
            m10422();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m10422() {
        this.f10424 = false;
        this.f10415.clear();
        this.f10408.clear();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m10500(boolean z) {
        boolean z2;
        m10423(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f10408;
            ArrayList arrayList2 = this.f10415;
            synchronized (this.f10398) {
                if (this.f10398.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.f10398.size();
                        boolean zMo37837 = false;
                        for (int i = 0; i < size; i++) {
                            zMo37837 |= ((InterfaceC15869) this.f10398.get(i)).mo37837(arrayList, arrayList2);
                        }
                        this.f10398.clear();
                        this.f10409.m42752().removeCallbacks(this.f10402);
                        z2 = zMo37837;
                    } catch (Throwable th) {
                        this.f10398.clear();
                        this.f10409.m42752().removeCallbacks(this.f10402);
                        throw th;
                    }
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.f10424 = true;
            try {
                m10414(this.f10408, this.f10415);
                m10422();
            } catch (Throwable th2) {
                m10422();
                throw th2;
            }
        }
        m10420();
        if (this.f10411) {
            this.f10411 = false;
            Iterator it = this.f10410.m3821().iterator();
            while (it.hasNext()) {
                m10448((C9902) it.next());
            }
        }
        this.f10410.m3802();
        return z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10414(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C22120) arrayList.get(i)).f16271) {
                if (i2 != i) {
                    m10429(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C22120) arrayList.get(i2)).f16271) {
                        i2++;
                    }
                }
                m10429(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m10429(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m10429(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        C22120 c22120;
        C0954 c0954;
        ComponentCallbacksC11612 componentCallbacksC11612;
        C0954 c0955;
        int i3;
        int i4;
        ArrayList arrayList3 = arrayList;
        boolean z = ((C22120) arrayList3.get(i)).f16271;
        ArrayList arrayList4 = this.f10421;
        if (arrayList4 == null) {
            this.f10421 = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.f10421;
        C0954 c0956 = this.f10410;
        arrayList5.addAll(c0956.m3818());
        ComponentCallbacksC11612 componentCallbacksC11613 = this.f10388;
        boolean z2 = false;
        int i5 = i;
        while (true) {
            int i6 = 1;
            if (i5 < i2) {
                C22120 c22121 = (C22120) arrayList3.get(i5);
                if (!((Boolean) arrayList2.get(i5)).booleanValue()) {
                    ArrayList arrayList6 = this.f10421;
                    ArrayList arrayList7 = c22121.f16266;
                    int i7 = 0;
                    while (i7 < arrayList7.size()) {
                        C13631 c13631 = (C13631) arrayList7.get(i7);
                        int i8 = c13631.f43284;
                        if (i8 == i6) {
                            c0955 = c0956;
                            i3 = 1;
                            arrayList6.add(c13631.f43289);
                        } else if (i8 != 2) {
                            if (i8 == 3 || i8 == 6) {
                                arrayList6.remove(c13631.f43289);
                                ComponentCallbacksC11612 componentCallbacksC11614 = c13631.f43289;
                                if (componentCallbacksC11614 == componentCallbacksC11613) {
                                    arrayList7.add(i7, new C13631(componentCallbacksC11614, 9));
                                    i7++;
                                    i3 = 1;
                                    componentCallbacksC11613 = null;
                                }
                                c0955 = c0956;
                            } else if (i8 == 7) {
                                c0955 = c0956;
                                i3 = 1;
                                arrayList6.add(c13631.f43289);
                            } else if (i8 == 8) {
                                arrayList7.add(i7, new C13631(9, componentCallbacksC11613, 0));
                                c13631.f43288 = true;
                                i7++;
                                componentCallbacksC11613 = c13631.f43289;
                            }
                            i3 = 1;
                            c0955 = c0956;
                        } else {
                            ComponentCallbacksC11612 componentCallbacksC11615 = c13631.f43289;
                            int i9 = componentCallbacksC11615.mContainerId;
                            int size = arrayList6.size() - 1;
                            boolean z3 = false;
                            while (size >= 0) {
                                C0954 c0957 = c0956;
                                ComponentCallbacksC11612 componentCallbacksC11616 = (ComponentCallbacksC11612) arrayList6.get(size);
                                if (componentCallbacksC11616.mContainerId != i9) {
                                    i9 = i9;
                                } else if (componentCallbacksC11616 == componentCallbacksC11615) {
                                    i9 = i9;
                                    z3 = true;
                                } else {
                                    if (componentCallbacksC11616 == componentCallbacksC11613) {
                                        i4 = 0;
                                        arrayList7.add(i7, new C13631(9, componentCallbacksC11616, 0));
                                        i7++;
                                        componentCallbacksC11613 = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    C13631 c13632 = new C13631(3, componentCallbacksC11616, i4);
                                    c13632.f43286 = c13631.f43286;
                                    c13632.f43285 = c13631.f43285;
                                    c13632.f43291 = c13631.f43291;
                                    c13632.f43283 = c13631.f43283;
                                    arrayList7.add(i7, c13632);
                                    arrayList6.remove(componentCallbacksC11616);
                                    i7++;
                                    componentCallbacksC11613 = componentCallbacksC11613;
                                }
                                size--;
                                i9 = i9;
                                c0956 = c0957;
                            }
                            c0955 = c0956;
                            if (z3) {
                                arrayList7.remove(i7);
                                i7--;
                            } else {
                                c13631.f43284 = 1;
                                c13631.f43288 = true;
                                arrayList6.add(componentCallbacksC11615);
                            }
                            i3 = 1;
                        }
                        i7 += i3;
                        i6 = 1;
                        c0956 = c0955;
                    }
                    c0954 = c0956;
                } else {
                    c0954 = c0956;
                    int i10 = 1;
                    ArrayList arrayList8 = this.f10421;
                    ArrayList arrayList9 = c22121.f16266;
                    int size2 = arrayList9.size() - 1;
                    while (size2 >= 0) {
                        C13631 c13633 = (C13631) arrayList9.get(size2);
                        int i11 = c13633.f43284;
                        if (i11 == i10) {
                            arrayList8.remove(c13633.f43289);
                        } else if (i11 != 3) {
                            switch (i11) {
                                case 6:
                                    arrayList8.add(c13633.f43289);
                                    break;
                                case 7:
                                    arrayList8.remove(c13633.f43289);
                                    break;
                                case 8:
                                    componentCallbacksC11612 = null;
                                    componentCallbacksC11613 = componentCallbacksC11612;
                                    break;
                                case 9:
                                    componentCallbacksC11612 = c13633.f43289;
                                    componentCallbacksC11613 = componentCallbacksC11612;
                                    break;
                                case 10:
                                    c13633.f43290 = c13633.f43287;
                                    break;
                            }
                        } else {
                            arrayList8.add(c13633.f43289);
                        }
                        size2--;
                        i10 = 1;
                    }
                }
                z2 = z2 || c22121.f16263;
                i5++;
                arrayList3 = arrayList;
                c0956 = c0954;
            } else {
                C0954 c0958 = c0956;
                this.f10421.clear();
                if (!z && this.f10404 >= 1) {
                    for (int i12 = i; i12 < i2; i12++) {
                        Iterator it = ((C22120) arrayList.get(i12)).f16266.iterator();
                        while (it.hasNext()) {
                            ComponentCallbacksC11612 componentCallbacksC11617 = ((C13631) it.next()).f43289;
                            if (componentCallbacksC11617 != null && componentCallbacksC11617.mFragmentManager != null) {
                                c0958.m3807(m10501(componentCallbacksC11617));
                            }
                        }
                    }
                }
                for (int i13 = i; i13 < i2; i13++) {
                    C22120 c22122 = (C22120) arrayList.get(i13);
                    if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                        c22122.m50074(-1);
                        AbstractC3191 abstractC3191 = c22122.f71289;
                        ArrayList arrayList10 = c22122.f16266;
                        boolean z4 = true;
                        for (int size3 = arrayList10.size() - 1; size3 >= 0; size3--) {
                            C13631 c13634 = (C13631) arrayList10.get(size3);
                            ComponentCallbacksC11612 componentCallbacksC11618 = c13634.f43289;
                            if (componentCallbacksC11618 != null) {
                                componentCallbacksC11618.mBeingSaved = false;
                                componentCallbacksC11618.setPopDirection(z4);
                                int i14 = c22122.f16262;
                                int i15 = o.a.r;
                                if (i14 != 4097) {
                                    if (i14 != 8194) {
                                        i15 = o.a.d;
                                        if (i14 != 8197) {
                                            i15 = i14 != 4099 ? i14 != 4100 ? 0 : o.a.u : o.a.c;
                                        }
                                    } else {
                                        i15 = o.a.a;
                                    }
                                }
                                componentCallbacksC11618.setNextTransition(i15);
                                componentCallbacksC11618.setSharedElementNames(c22122.f16275, c22122.f16269);
                            }
                            switch (c13634.f43284) {
                                case 1:
                                    componentCallbacksC11618.setAnimations(c13634.f43286, c13634.f43291, c13634.f43285, c13634.f43283);
                                    z4 = true;
                                    abstractC3191.m10452(componentCallbacksC11618, true);
                                    abstractC3191.m10475(componentCallbacksC11618);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c13634.f43284);
                                case 3:
                                    componentCallbacksC11618.setAnimations(c13634.f43286, c13634.f43291, c13634.f43285, c13634.f43283);
                                    abstractC3191.m10440(componentCallbacksC11618);
                                    z4 = true;
                                    break;
                                case 4:
                                    componentCallbacksC11618.setAnimations(c13634.f43286, c13634.f43291, c13634.f43285, c13634.f43283);
                                    abstractC3191.getClass();
                                    if (m10427(2)) {
                                        C17359.toString(componentCallbacksC11618);
                                    }
                                    if (componentCallbacksC11618.mHidden) {
                                        componentCallbacksC11618.mHidden = false;
                                        componentCallbacksC11618.mHiddenChanged = !componentCallbacksC11618.mHiddenChanged;
                                    }
                                    z4 = true;
                                    break;
                                case 5:
                                    componentCallbacksC11618.setAnimations(c13634.f43286, c13634.f43291, c13634.f43285, c13634.f43283);
                                    abstractC3191.m10452(componentCallbacksC11618, true);
                                    abstractC3191.m10465(componentCallbacksC11618);
                                    z4 = true;
                                    break;
                                case 6:
                                    componentCallbacksC11618.setAnimations(c13634.f43286, c13634.f43291, c13634.f43285, c13634.f43283);
                                    abstractC3191.m10473(componentCallbacksC11618);
                                    z4 = true;
                                    break;
                                case 7:
                                    componentCallbacksC11618.setAnimations(c13634.f43286, c13634.f43291, c13634.f43285, c13634.f43283);
                                    abstractC3191.m10452(componentCallbacksC11618, true);
                                    abstractC3191.m10489(componentCallbacksC11618);
                                    z4 = true;
                                    break;
                                case 8:
                                    abstractC3191.m10484(null);
                                    z4 = true;
                                    break;
                                case 9:
                                    abstractC3191.m10484(componentCallbacksC11618);
                                    z4 = true;
                                    break;
                                case 10:
                                    abstractC3191.m10451(componentCallbacksC11618, c13634.f43287);
                                    z4 = true;
                                    break;
                            }
                        }
                    } else {
                        c22122.m50074(1);
                        AbstractC3191 abstractC3192 = c22122.f71289;
                        ArrayList arrayList11 = c22122.f16266;
                        int size4 = arrayList11.size();
                        int i16 = 0;
                        while (i16 < size4) {
                            C13631 c13635 = (C13631) arrayList11.get(i16);
                            ComponentCallbacksC11612 componentCallbacksC11619 = c13635.f43289;
                            if (componentCallbacksC11619 != null) {
                                componentCallbacksC11619.mBeingSaved = false;
                                componentCallbacksC11619.setPopDirection(false);
                                componentCallbacksC11619.setNextTransition(c22122.f16262);
                                componentCallbacksC11619.setSharedElementNames(c22122.f16269, c22122.f16275);
                            }
                            switch (c13635.f43284) {
                                case 1:
                                    c22120 = c22122;
                                    componentCallbacksC11619.setAnimations(c13635.f43286, c13635.f43291, c13635.f43285, c13635.f43283);
                                    abstractC3192.m10452(componentCallbacksC11619, false);
                                    abstractC3192.m10440(componentCallbacksC11619);
                                    i16++;
                                    c22122 = c22120;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c13635.f43284);
                                case 3:
                                    c22120 = c22122;
                                    componentCallbacksC11619.setAnimations(c13635.f43286, c13635.f43291, c13635.f43285, c13635.f43283);
                                    abstractC3192.m10475(componentCallbacksC11619);
                                    i16++;
                                    c22122 = c22120;
                                    break;
                                case 4:
                                    c22120 = c22122;
                                    componentCallbacksC11619.setAnimations(c13635.f43286, c13635.f43291, c13635.f43285, c13635.f43283);
                                    abstractC3192.m10465(componentCallbacksC11619);
                                    i16++;
                                    c22122 = c22120;
                                    break;
                                case 5:
                                    c22120 = c22122;
                                    componentCallbacksC11619.setAnimations(c13635.f43286, c13635.f43291, c13635.f43285, c13635.f43283);
                                    abstractC3192.m10452(componentCallbacksC11619, false);
                                    if (m10427(2)) {
                                        C17359.toString(componentCallbacksC11619);
                                    }
                                    if (componentCallbacksC11619.mHidden) {
                                        componentCallbacksC11619.mHidden = false;
                                        componentCallbacksC11619.mHiddenChanged = !componentCallbacksC11619.mHiddenChanged;
                                    }
                                    i16++;
                                    c22122 = c22120;
                                    break;
                                case 6:
                                    c22120 = c22122;
                                    componentCallbacksC11619.setAnimations(c13635.f43286, c13635.f43291, c13635.f43285, c13635.f43283);
                                    abstractC3192.m10489(componentCallbacksC11619);
                                    i16++;
                                    c22122 = c22120;
                                    break;
                                case 7:
                                    c22120 = c22122;
                                    componentCallbacksC11619.setAnimations(c13635.f43286, c13635.f43291, c13635.f43285, c13635.f43283);
                                    abstractC3192.m10452(componentCallbacksC11619, false);
                                    abstractC3192.m10473(componentCallbacksC11619);
                                    i16++;
                                    c22122 = c22120;
                                    break;
                                case 8:
                                    abstractC3192.m10484(componentCallbacksC11619);
                                    c22120 = c22122;
                                    i16++;
                                    c22122 = c22120;
                                    break;
                                case 9:
                                    abstractC3192.m10484(null);
                                    c22120 = c22122;
                                    i16++;
                                    c22122 = c22120;
                                    break;
                                case 10:
                                    abstractC3192.m10451(componentCallbacksC11619, c13635.f43290);
                                    c22120 = c22122;
                                    i16++;
                                    c22122 = c22120;
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i17 = i; i17 < i2; i17++) {
                    C22120 c22123 = (C22120) arrayList.get(i17);
                    if (zBooleanValue) {
                        int size5 = c22123.f16266.size();
                        while (true) {
                            size5--;
                            if (size5 >= 0) {
                                ComponentCallbacksC11612 componentCallbacksC116110 = ((C13631) c22123.f16266.get(size5)).f43289;
                                if (componentCallbacksC116110 != null) {
                                    m10501(componentCallbacksC116110).m25725();
                                }
                            }
                        }
                    } else {
                        Iterator it2 = c22123.f16266.iterator();
                        while (it2.hasNext()) {
                            ComponentCallbacksC11612 componentCallbacksC116111 = ((C13631) it2.next()).f43289;
                            if (componentCallbacksC116111 != null) {
                                m10501(componentCallbacksC116111).m25725();
                            }
                        }
                    }
                }
                m10443(this.f10404, true);
                HashSet<AbstractC17997> hashSet = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    Iterator it3 = ((C22120) arrayList.get(i18)).f16266.iterator();
                    while (it3.hasNext()) {
                        ComponentCallbacksC11612 componentCallbacksC116112 = ((C13631) it3.next()).f43289;
                        if (componentCallbacksC116112 != null && (viewGroup = componentCallbacksC116112.mContainer) != null) {
                            hashSet.add(AbstractC17997.m41957(viewGroup, m10486()));
                        }
                    }
                }
                for (AbstractC17997 abstractC17997 : hashSet) {
                    abstractC17997.f58943 = zBooleanValue;
                    abstractC17997.m41970();
                    abstractC17997.m41962();
                }
                for (int i19 = i; i19 < i2; i19++) {
                    C22120 c22124 = (C22120) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c22124.f71290 >= 0) {
                        c22124.f71290 = -1;
                    }
                    c22124.getClass();
                }
                if (!z2 || this.f10418 == null) {
                    return;
                }
                for (int i20 = 0; i20 < this.f10418.size(); i20++) {
                    ((InterfaceC17361) this.f10418.get(i20)).mo40789();
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m10428(ComponentCallbacksC11612 componentCallbacksC11612) {
        ViewGroup viewGroupM10425 = m10425(componentCallbacksC11612);
        if (viewGroupM10425 == null || componentCallbacksC11612.getEnterAnim() + componentCallbacksC11612.getExitAnim() + componentCallbacksC11612.getPopEnterAnim() + componentCallbacksC11612.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupM10425.getTag(R.id.MT_Protector) == null) {
            viewGroupM10425.setTag(R.id.MT_Protector, componentCallbacksC11612);
        }
        ((ComponentCallbacksC11612) viewGroupM10425.getTag(R.id.MT_Protector)).setPopDirection(componentCallbacksC11612.getPopDirection());
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private ViewGroup m10425(ComponentCallbacksC11612 componentCallbacksC11612) {
        ViewGroup viewGroup = componentCallbacksC11612.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC11612.mContainerId <= 0 || !this.f10414.mo21643()) {
            return null;
        }
        View viewMo21642 = this.f10414.mo21642(componentCallbacksC11612.mContainerId);
        if (viewMo21642 instanceof ViewGroup) {
            return (ViewGroup) viewMo21642;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private HashSet m10421() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f10410.m3821().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C9902) it.next()).m25719().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC17997.m41957(viewGroup, m10486()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10463(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f10391;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f10391.size() - 1;
            } else {
                int size2 = this.f10391.size() - 1;
                while (size2 >= 0) {
                    C22120 c22120 = (C22120) this.f10391.get(size2);
                    if (i >= 0 && i == c22120.f71290) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C22120 c22121 = (C22120) this.f10391.get(size - 1);
                        if (i < 0 || i != c22121.f71290) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f10391.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f10391.size() - 1; size3 >= size; size3--) {
            arrayList.add((C22120) this.f10391.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Bundle m10468() {
        int i;
        C22866[] c22866Arr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m10421().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC17997 abstractC17997 = (AbstractC17997) it.next();
            if (abstractC17997.f58945) {
                m10427(2);
                abstractC17997.f58945 = false;
                abstractC17997.m41962();
            }
        }
        Iterator it2 = m10421().iterator();
        while (it2.hasNext()) {
            ((AbstractC17997) it2.next()).m41967();
        }
        m10500(true);
        this.f10419 = true;
        this.f10390.m12642(true);
        C0954 c0954 = this.f10410;
        ArrayList arrayListM3800 = c0954.m3800();
        ArrayList<C0208> arrayListM3826 = c0954.m3826();
        if (arrayListM3826.isEmpty()) {
            m10427(2);
            return bundle;
        }
        ArrayList arrayListM3814 = c0954.m3814();
        ArrayList arrayList = this.f10391;
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            c22866Arr = null;
        } else {
            c22866Arr = new C22866[size];
            for (i = 0; i < size; i++) {
                c22866Arr[i] = new C22866((C22120) this.f10391.get(i));
                if (m10427(2)) {
                    C17359.toString(this.f10391.get(i));
                }
            }
        }
        C6175 c6175 = new C6175();
        c6175.f21033 = arrayListM3800;
        c6175.f21036 = arrayListM3814;
        c6175.f21034 = c22866Arr;
        c6175.f21029 = this.f10400.get();
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f10388;
        if (componentCallbacksC11612 != null) {
            c6175.f21030 = componentCallbacksC11612.mWho;
        }
        ArrayList arrayList2 = c6175.f21031;
        Map map = this.f10420;
        arrayList2.addAll(map.keySet());
        c6175.f21035.addAll(map.values());
        c6175.f21032 = new ArrayList(this.f10389);
        bundle.putParcelable("state", c6175);
        Map map2 = this.f10395;
        for (String str : map2.keySet()) {
            bundle.putBundle(C25272.m56409("result_", str), (Bundle) map2.get(str));
        }
        for (C0208 c0208 : arrayListM3826) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("state", c0208);
            bundle.putBundle("fragment_" + c0208.f1408, bundle2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10444(Parcelable parcelable) {
        C10120 c10120;
        int i;
        C9902 c9902;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f10409.m42754().getClassLoader());
                this.f10395.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f10409.m42754().getClassLoader());
                arrayList.add((C0208) bundle.getParcelable("state"));
            }
        }
        C0954 c0954 = this.f10410;
        c0954.m3824(arrayList);
        C6175 c6175 = (C6175) bundle3.getParcelable("state");
        if (c6175 == null) {
            return;
        }
        c0954.m3810();
        Iterator it = c6175.f21033.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c10120 = this.f10403;
            i = 2;
            if (!zHasNext) {
                break;
            }
            C0208 c0208M3801 = c0954.m3801((String) it.next(), null);
            if (c0208M3801 != null) {
                ComponentCallbacksC11612 componentCallbacksC11612M12647 = this.f10390.m12647(c0208M3801.f1408);
                if (componentCallbacksC11612M12647 != null) {
                    if (m10427(2)) {
                        componentCallbacksC11612M12647.toString();
                    }
                    c9902 = new C9902(c10120, c0954, componentCallbacksC11612M12647, c0208M3801);
                } else {
                    c9902 = new C9902(this.f10403, this.f10410, this.f10409.m42754().getClassLoader(), m10476(), c0208M3801);
                }
                ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
                componentCallbacksC11612M25719.mFragmentManager = this;
                if (m10427(2)) {
                    componentCallbacksC11612M25719.toString();
                }
                c9902.m25722(this.f10409.m42754().getClassLoader());
                c0954.m3807(c9902);
                c9902.m25721(this.f10404);
            }
        }
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10390.m12649()) {
            if (!c0954.m3809(componentCallbacksC11612.mWho)) {
                if (m10427(2)) {
                    componentCallbacksC11612.toString();
                    C17359.toString(c6175.f21033);
                }
                this.f10390.m12645(componentCallbacksC11612);
                componentCallbacksC11612.mFragmentManager = this;
                C9902 c9903 = new C9902(c10120, c0954, componentCallbacksC11612);
                c9903.m25721(1);
                c9903.m25725();
                componentCallbacksC11612.mRemoving = true;
                c9903.m25725();
            }
        }
        c0954.m3805(c6175.f21036);
        if (c6175.f21034 != null) {
            this.f10391 = new ArrayList(c6175.f21034.length);
            int i2 = 0;
            while (true) {
                C22866[] c22866Arr = c6175.f21034;
                if (i2 >= c22866Arr.length) {
                    break;
                }
                C22866 c22866 = c22866Arr[i2];
                ArrayList arrayList2 = c22866.f74319;
                C22120 c22120 = new C22120(this);
                int[] iArr = c22866.f74309;
                int i3 = 0;
                int i4 = 0;
                while (i3 < iArr.length) {
                    C13631 c13631 = new C13631();
                    int i5 = i3 + 1;
                    c13631.f43284 = iArr[i3];
                    if (m10427(i)) {
                        C17359.toString(c22120);
                        int i6 = iArr[i5];
                    }
                    c13631.f43287 = EnumC2619.values()[c22866.f74314[i4]];
                    c13631.f43290 = EnumC2619.values()[c22866.f74312[i4]];
                    int i7 = i3 + 2;
                    c13631.f43288 = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    c13631.f43286 = i8;
                    int i9 = iArr[i3 + 3];
                    c13631.f43291 = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    c13631.f43285 = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    c13631.f43283 = i12;
                    c22120.f16267 = i8;
                    c22120.f16264 = i9;
                    c22120.f16276 = i11;
                    c22120.f16270 = i12;
                    c22120.m14358(c13631);
                    i4++;
                    i = 2;
                }
                c22120.f16262 = c22866.f74310;
                c22120.f16261 = c22866.f74308;
                c22120.f16263 = true;
                c22120.f16272 = c22866.f74318;
                c22120.f16268 = c22866.f74307;
                c22120.f16265 = c22866.f74317;
                c22120.f16274 = c22866.f74320;
                c22120.f16269 = c22866.f74311;
                c22120.f16275 = c22866.f74316;
                c22120.f16271 = c22866.f74313;
                c22120.f71290 = c22866.f74315;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    String str3 = (String) arrayList2.get(i13);
                    if (str3 != null) {
                        ((C13631) c22120.f16266.get(i13)).f43289 = c0954.m3823(str3);
                    }
                }
                c22120.m50074(1);
                if (m10427(2)) {
                    c22120.toString();
                    PrintWriter printWriter = new PrintWriter(new C23219());
                    c22120.m50075(EnumC7687.f25319, printWriter, false);
                    printWriter.close();
                }
                this.f10391.add(c22120);
                i2++;
                i = 2;
            }
        } else {
            this.f10391 = null;
        }
        this.f10400.set(c6175.f21029);
        String str4 = c6175.f21030;
        if (str4 != null) {
            ComponentCallbacksC11612 componentCallbacksC11612M3823 = c0954.m3823(str4);
            this.f10388 = componentCallbacksC11612M3823;
            m10426(componentCallbacksC11612M3823);
        }
        ArrayList arrayList3 = c6175.f21031;
        if (arrayList3 != null) {
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                this.f10420.put((String) arrayList3.get(i14), (C15406) c6175.f21035.get(i14));
            }
        }
        this.f10389 = new ArrayDeque(c6175.f21032);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC18325 m10504() {
        return this.f10409;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m10491() {
        return this.f10386;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC24293 m10490() {
        return this.f10414;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10455(AbstractC18325 abstractC18325, AbstractC24293 abstractC24293, ComponentCallbacksC11612 componentCallbacksC11612) {
        Object c15123;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String strM23910;
        Bundle bundleM36619;
        InterfaceC13779 interfaceC13779;
        InterfaceC11217 interfaceC11217;
        if (this.f10409 != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f10409 = abstractC18325;
        this.f10414 = abstractC24293;
        this.f10386 = componentCallbacksC11612;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10406;
        if (componentCallbacksC11612 == null) {
            if (abstractC18325 instanceof InterfaceC14377) {
                c15123 = (InterfaceC14377) abstractC18325;
            }
            if (this.f10386 != null) {
                m10420();
            }
            if (abstractC18325 instanceof InterfaceC13779) {
                interfaceC13779 = (InterfaceC13779) abstractC18325;
                C7068 onBackPressedDispatcher = interfaceC13779.getOnBackPressedDispatcher();
                this.f10412 = onBackPressedDispatcher;
                if (componentCallbacksC11612 != null) {
                    interfaceC11217 = interfaceC13779;
                    interfaceC11217 = componentCallbacksC11612;
                }
                interfaceC11217 = interfaceC13779;
                onBackPressedDispatcher.m19403(interfaceC11217, this.f10417);
            }
            if (componentCallbacksC11612 != null) {
                this.f10390 = componentCallbacksC11612.mFragmentManager.f10390.m12643(componentCallbacksC11612);
            } else if (abstractC18325 instanceof InterfaceC3518) {
                this.f10390 = C3937.m12638(((InterfaceC3518) abstractC18325).getViewModelStore());
            } else {
                this.f10390 = new C3937(false);
            }
            this.f10390.m12642(m10487());
            this.f10410.m3806(this.f10390);
            obj = this.f10409;
            if ((obj instanceof InterfaceC1843) && componentCallbacksC11612 == null) {
                C15266 savedStateRegistry = ((InterfaceC1843) obj).getSavedStateRegistry();
                savedStateRegistry.m36621("android:support:fragments", new InterfaceC19742() { // from class: l.ۜ۫ۙ
                    @Override // l.InterfaceC19742
                    /* JADX INFO: renamed from: ۙ */
                    public final Bundle mo14860() {
                        return this.f23601.m10468();
                    }
                });
                bundleM36619 = savedStateRegistry.m36619("android:support:fragments");
                if (bundleM36619 != null) {
                    m10444(bundleM36619);
                }
            }
            obj2 = this.f10409;
            if (obj2 instanceof InterfaceC6674) {
                AbstractC12639 abstractC12639Mo16524 = ((InterfaceC6674) obj2).mo16524();
                if (componentCallbacksC11612 != null) {
                    strM23910 = C8947.m23910(new StringBuilder(), componentCallbacksC11612.mWho, ":");
                } else {
                    strM23910 = "";
                }
                String strM56409 = C25272.m56409("FragmentManager:", strM23910);
                this.f10405 = abstractC12639Mo16524.m31421(C14483.m34972(strM56409, "StartActivityForResult"), new C8165(), new C12886(this));
                this.f10392 = abstractC12639Mo16524.m31421(C14483.m34972(strM56409, "StartIntentSenderForResult"), new C11394(), new C5429(this));
                this.f10397 = abstractC12639Mo16524.m31421(C14483.m34972(strM56409, "RequestPermissions"), new C0707(), new C13849(this));
            }
            obj3 = this.f10409;
            if (obj3 instanceof InterfaceC6763) {
                ((InterfaceC6763) obj3).mo16526(this.f10385);
            }
            obj4 = this.f10409;
            if (obj4 instanceof InterfaceC13474) {
                ((InterfaceC13474) obj4).mo16535(this.f10399);
            }
            obj5 = this.f10409;
            if (obj5 instanceof InterfaceC21679) {
                ((InterfaceC21679) obj5).mo16531(this.f10396);
            }
            obj6 = this.f10409;
            if (obj6 instanceof InterfaceC10490) {
                ((InterfaceC10490) obj6).mo16537(this.f10413);
            }
            obj7 = this.f10409;
            if ((obj7 instanceof InterfaceC0312) || componentCallbacksC11612 != null) {
            }
            ((InterfaceC0312) obj7).addMenuProvider(this.f10394);
            return;
        }
        c15123 = new C15123(componentCallbacksC11612);
        copyOnWriteArrayList.add(c15123);
        if (this.f10386 != null) {
            m10420();
        }
        if (abstractC18325 instanceof InterfaceC13779) {
            interfaceC13779 = (InterfaceC13779) abstractC18325;
            C7068 onBackPressedDispatcher2 = interfaceC13779.getOnBackPressedDispatcher();
            this.f10412 = onBackPressedDispatcher2;
            if (componentCallbacksC11612 != null) {
                interfaceC11217 = interfaceC13779;
                interfaceC11217 = componentCallbacksC11612;
            }
            interfaceC11217 = interfaceC13779;
            onBackPressedDispatcher2.m19403(interfaceC11217, this.f10417);
        }
        if (componentCallbacksC11612 != null) {
            this.f10390 = componentCallbacksC11612.mFragmentManager.f10390.m12643(componentCallbacksC11612);
        } else if (abstractC18325 instanceof InterfaceC3518) {
            this.f10390 = C3937.m12638(((InterfaceC3518) abstractC18325).getViewModelStore());
        } else {
            this.f10390 = new C3937(false);
        }
        this.f10390.m12642(m10487());
        this.f10410.m3806(this.f10390);
        obj = this.f10409;
        if (obj instanceof InterfaceC1843) {
            C15266 savedStateRegistry2 = ((InterfaceC1843) obj).getSavedStateRegistry();
            savedStateRegistry2.m36621("android:support:fragments", new InterfaceC19742() { // from class: l.ۜ۫ۙ
                @Override // l.InterfaceC19742
                /* JADX INFO: renamed from: ۙ */
                public final Bundle mo14860() {
                    return this.f23601.m10468();
                }
            });
            bundleM36619 = savedStateRegistry2.m36619("android:support:fragments");
            if (bundleM36619 != null) {
                m10444(bundleM36619);
            }
        }
        obj2 = this.f10409;
        if (obj2 instanceof InterfaceC6674) {
            AbstractC12639 abstractC12639Mo16525 = ((InterfaceC6674) obj2).mo16524();
            if (componentCallbacksC11612 != null) {
                strM23910 = C8947.m23910(new StringBuilder(), componentCallbacksC11612.mWho, ":");
            } else {
                strM23910 = "";
            }
            String strM564010 = C25272.m56409("FragmentManager:", strM23910);
            this.f10405 = abstractC12639Mo16525.m31421(C14483.m34972(strM564010, "StartActivityForResult"), new C8165(), new C12886(this));
            this.f10392 = abstractC12639Mo16525.m31421(C14483.m34972(strM564010, "StartIntentSenderForResult"), new C11394(), new C5429(this));
            this.f10397 = abstractC12639Mo16525.m31421(C14483.m34972(strM564010, "RequestPermissions"), new C0707(), new C13849(this));
        }
        obj3 = this.f10409;
        if (obj3 instanceof InterfaceC6763) {
            ((InterfaceC6763) obj3).mo16526(this.f10385);
        }
        obj4 = this.f10409;
        if (obj4 instanceof InterfaceC13474) {
            ((InterfaceC13474) obj4).mo16535(this.f10399);
        }
        obj5 = this.f10409;
        if (obj5 instanceof InterfaceC21679) {
            ((InterfaceC21679) obj5).mo16531(this.f10396);
        }
        obj6 = this.f10409;
        if (obj6 instanceof InterfaceC10490) {
            ((InterfaceC10490) obj6).mo16537(this.f10413);
        }
        obj7 = this.f10409;
        if (obj7 instanceof InterfaceC0312) {
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m10469() {
        if (this.f10409 == null) {
            return;
        }
        this.f10419 = false;
        this.f10401 = false;
        this.f10390.m12642(false);
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10410.m3818()) {
            if (componentCallbacksC11612 != null) {
                componentCallbacksC11612.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10449(ComponentCallbacksC11612 componentCallbacksC11612, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f10405 != null) {
            this.f10389.addLast(new C16615(componentCallbacksC11612.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f10405.mo4472(intent);
            return;
        }
        this.f10409.m42745(intent, i, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10450(ComponentCallbacksC11612 componentCallbacksC11612, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        if (this.f10392 != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m10427(2)) {
                    bundle.toString();
                    intent2.toString();
                    C17359.toString(componentCallbacksC11612);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            C24574 c24574 = new C24574(intentSender);
            c24574.m54892(intent2);
            c24574.m54891(i3, i2);
            C14876 c14876M54890 = c24574.m54890();
            this.f10389.addLast(new C16615(componentCallbacksC11612.mWho, i));
            if (m10427(2)) {
                componentCallbacksC11612.toString();
            }
            this.f10392.mo4472(c14876M54890);
            return;
        }
        this.f10409.m42746(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10453(ComponentCallbacksC11612 componentCallbacksC11612, String[] strArr, int i) {
        if (this.f10397 != null) {
            this.f10389.addLast(new C16615(componentCallbacksC11612.mWho, i));
            this.f10397.mo4472(strArr);
            return;
        }
        this.f10409.getClass();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m10502() {
        this.f10419 = false;
        this.f10401 = false;
        this.f10390.m12642(false);
        m10430(0);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m10488() {
        this.f10419 = false;
        this.f10401 = false;
        this.f10390.m12642(false);
        m10430(1);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m10482() {
        m10430(2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m10471() {
        this.f10419 = false;
        this.f10401 = false;
        this.f10390.m12642(false);
        m10430(4);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m10483() {
        this.f10419 = false;
        this.f10401 = false;
        this.f10390.m12642(false);
        m10430(5);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m10505() {
        this.f10419 = false;
        this.f10401 = false;
        this.f10390.m12642(false);
        m10430(7);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10434() {
        m10430(5);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10485() {
        this.f10401 = true;
        this.f10390.m12642(true);
        m10430(4);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m10478() {
        m10430(1);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m10480() {
        boolean zIsChangingConfigurations = true;
        this.f10387 = true;
        m10500(true);
        Iterator it = m10421().iterator();
        while (it.hasNext()) {
            ((AbstractC17997) it.next()).m41967();
        }
        AbstractC18325 abstractC18325 = this.f10409;
        boolean z = abstractC18325 instanceof InterfaceC3518;
        C0954 c0954 = this.f10410;
        if (z) {
            zIsChangingConfigurations = c0954.m3817().m12646();
        } else if (C1402.m5130(abstractC18325.m42754())) {
            zIsChangingConfigurations = true ^ ((Activity) this.f10409.m42754()).isChangingConfigurations();
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f10420.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C15406) it2.next()).f50219.iterator();
                while (it3.hasNext()) {
                    c0954.m3817().m12640((String) it3.next());
                }
            }
        }
        m10430(-1);
        Object obj = this.f10409;
        if (obj instanceof InterfaceC13474) {
            ((InterfaceC13474) obj).mo16530(this.f10399);
        }
        Object obj2 = this.f10409;
        if (obj2 instanceof InterfaceC6763) {
            ((InterfaceC6763) obj2).mo16529(this.f10385);
        }
        Object obj3 = this.f10409;
        if (obj3 instanceof InterfaceC21679) {
            ((InterfaceC21679) obj3).mo16532(this.f10396);
        }
        Object obj4 = this.f10409;
        if (obj4 instanceof InterfaceC10490) {
            ((InterfaceC10490) obj4).mo16536(this.f10413);
        }
        Object obj5 = this.f10409;
        if (obj5 instanceof InterfaceC0312) {
            ((InterfaceC0312) obj5).removeMenuProvider(this.f10394);
        }
        this.f10409 = null;
        this.f10414 = null;
        this.f10386 = null;
        if (this.f10412 != null) {
            this.f10417.m18048();
            this.f10412 = null;
        }
        AbstractC17114 abstractC17114 = this.f10405;
        if (abstractC17114 != null) {
            abstractC17114.mo4471();
            this.f10392.mo4471();
            this.f10397.mo4471();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m10430(int i) {
        try {
            this.f10424 = true;
            this.f10410.m3803(i);
            m10443(i, false);
            Iterator it = m10421().iterator();
            while (it.hasNext()) {
                ((AbstractC17997) it.next()).m41967();
            }
            this.f10424 = false;
            m10500(true);
        } catch (Throwable th) {
            this.f10424 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10460(boolean z, boolean z2) {
        if (z2 && (this.f10409 instanceof InterfaceC21679)) {
            m10413(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10410.m3818()) {
            if (componentCallbacksC11612 != null) {
                componentCallbacksC11612.performMultiWindowModeChanged(z);
                if (z2) {
                    componentCallbacksC11612.mChildFragmentManager.m10460(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10497(boolean z, boolean z2) {
        if (z2 && (this.f10409 instanceof InterfaceC10490)) {
            m10413(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10410.m3818()) {
            if (componentCallbacksC11612 != null) {
                componentCallbacksC11612.performPictureInPictureModeChanged(z);
                if (z2) {
                    componentCallbacksC11612.mChildFragmentManager.m10497(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10459(boolean z, Configuration configuration) {
        if (z && (this.f10409 instanceof InterfaceC6763)) {
            m10413(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10410.m3818()) {
            if (componentCallbacksC11612 != null) {
                componentCallbacksC11612.performConfigurationChanged(configuration);
                if (z) {
                    componentCallbacksC11612.mChildFragmentManager.m10459(true, configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10458(boolean z) {
        if (z && (this.f10409 instanceof InterfaceC13474)) {
            m10413(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10410.m3818()) {
            if (componentCallbacksC11612 != null) {
                componentCallbacksC11612.performLowMemory();
                if (z) {
                    componentCallbacksC11612.mChildFragmentManager.m10458(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10461(Menu menu, MenuInflater menuInflater) {
        if (this.f10404 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10410.m3818()) {
            if (componentCallbacksC11612 != null && componentCallbacksC11612.isMenuVisible() && componentCallbacksC11612.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(componentCallbacksC11612);
                z = true;
            }
        }
        if (this.f10407 != null) {
            for (int i = 0; i < this.f10407.size(); i++) {
                ComponentCallbacksC11612 componentCallbacksC11613 = (ComponentCallbacksC11612) this.f10407.get(i);
                if (arrayList == null || !arrayList.contains(componentCallbacksC11613)) {
                    componentCallbacksC11613.onDestroyOptionsMenu();
                }
            }
        }
        this.f10407 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m10498(Menu menu) {
        boolean z = false;
        if (this.f10404 < 1) {
            return false;
        }
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10410.m3818()) {
            if (componentCallbacksC11612 != null && componentCallbacksC11612.isMenuVisible() && componentCallbacksC11612.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m10499(MenuItem menuItem) {
        if (this.f10404 < 1) {
            return false;
        }
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10410.m3818()) {
            if (componentCallbacksC11612 != null && componentCallbacksC11612.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10462(MenuItem menuItem) {
        if (this.f10404 < 1) {
            return false;
        }
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10410.m3818()) {
            if (componentCallbacksC11612 != null && componentCallbacksC11612.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10445(Menu menu) {
        if (this.f10404 < 1) {
            return;
        }
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10410.m3818()) {
            if (componentCallbacksC11612 != null) {
                componentCallbacksC11612.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m10484(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (componentCallbacksC11612 != null) {
            if (!componentCallbacksC11612.equals(this.f10410.m3823(componentCallbacksC11612.mWho)) || (componentCallbacksC11612.mHost != null && componentCallbacksC11612.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + componentCallbacksC11612 + " is not an active fragment of FragmentManager " + this);
            }
        }
        ComponentCallbacksC11612 componentCallbacksC11613 = this.f10388;
        this.f10388 = componentCallbacksC11612;
        m10426(componentCallbacksC11613);
        m10426(this.f10388);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m10426(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (componentCallbacksC11612 != null) {
            if (componentCallbacksC11612.equals(this.f10410.m3823(componentCallbacksC11612.mWho))) {
                componentCallbacksC11612.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10474() {
        m10420();
        m10426(this.f10388);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10451(ComponentCallbacksC11612 componentCallbacksC11612, EnumC2619 enumC2619) {
        if (!componentCallbacksC11612.equals(this.f10410.m3823(componentCallbacksC11612.mWho)) || (componentCallbacksC11612.mHost != null && componentCallbacksC11612.mFragmentManager != this)) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC11612 + " is not an active fragment of FragmentManager " + this);
        }
        componentCallbacksC11612.mMaxState = enumC2619;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21309 m10476() {
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f10386;
        if (componentCallbacksC11612 != null) {
            return componentCallbacksC11612.mFragmentManager.m10476();
        }
        return this.f10422;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0098 m10486() {
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f10386;
        if (componentCallbacksC11612 != null) {
            return componentCallbacksC11612.mFragmentManager.m10486();
        }
        return this.f10393;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10120 m10479() {
        return this.f10403;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m10481(ComponentCallbacksC11612 componentCallbacksC11612) {
        Iterator it = this.f10406.iterator();
        while (it.hasNext()) {
            ((InterfaceC14377) it.next()).mo34814(componentCallbacksC11612);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m10464() {
        for (ComponentCallbacksC11612 componentCallbacksC11612 : this.f10410.m3811()) {
            if (componentCallbacksC11612 != null) {
                componentCallbacksC11612.onHiddenChanged(componentCallbacksC11612.isHidden());
                componentCallbacksC11612.mChildFragmentManager.m10464();
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m10431(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (componentCallbacksC11612.mHasMenu && componentCallbacksC11612.mMenuVisible) {
            return true;
        }
        boolean zM10431 = false;
        for (ComponentCallbacksC11612 componentCallbacksC11613 : componentCallbacksC11612.mChildFragmentManager.f10410.m3811()) {
            if (componentCallbacksC11613 != null) {
                zM10431 = m10431(componentCallbacksC11613);
            }
            if (zM10431) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10435(ComponentCallbacksC11612 componentCallbacksC11612) {
        if (componentCallbacksC11612.mAdded && m10431(componentCallbacksC11612)) {
            this.f10423 = true;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m10424() {
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f10386;
        if (componentCallbacksC11612 == null) {
            return true;
        }
        return componentCallbacksC11612.isAdded() && this.f10386.getParentFragmentManager().m10424();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final LayoutInflater.Factory2 m10438() {
        return this.f10416;
    }
}
