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

/* JADX INFO: renamed from: l.ۡ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8894 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C14494 f30483;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f30484;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC6462 f30485;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f30487;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC6462 f30488;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f30489;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f30490;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC6462 f30491;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC20537 f30492;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f30493;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C14188 f30494;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Runnable f30495;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f30496;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ArrayDeque f30497;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C10660 f30498;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14847 f30500;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC22654 f30501;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f30503;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1486 f30504;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C5365 f30505;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f30506;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f30507;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC22654 f30508;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f30510;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23360 f30511;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9249 f30512;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC16304 f30513;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C0075 f30514;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20183 f30517;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f30518;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f30519;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f30520;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f30521;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f30522 = new ArrayList();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C14539 f30509 = new C14539();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final LayoutInflaterFactory2C17009 f30515 = new LayoutInflaterFactory2C17009(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC19432 f30516 = new C13833(this);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f30502 = new AtomicInteger();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map f30486 = C0561.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Map f30499 = C0561.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v14, types: [l.֫֨ۙ] */
    /* JADX WARN: Type inference failed for: r0v15, types: [l.ۢ֨ۙ] */
    public AbstractC8894() {
        C0561.synchronizedMap(new HashMap());
        this.f30498 = new C10660(this);
        this.f30510 = new CopyOnWriteArrayList();
        int i = 0;
        this.f30511 = new C23360(i, this);
        this.f30494 = new C14188(i, this);
        this.f30504 = new InterfaceC17295() { // from class: l.֫֨ۙ
            @Override // l.InterfaceC17295
            public final void accept(Object obj) {
                AbstractC8894.m23057(this.f6023, (C11340) obj);
            }
        };
        this.f30512 = new InterfaceC17295() { // from class: l.ۢ֨ۙ
            @Override // l.InterfaceC17295
            public final void accept(Object obj) {
                AbstractC8894.m23056(this.f31461, (C2872) obj);
            }
        };
        this.f30500 = new C11716(this);
        this.f30484 = -1;
        this.f30514 = new C2542(this);
        this.f30505 = new C5365();
        this.f30497 = new ArrayDeque();
        this.f30495 = new RunnableC22299(this);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m23060(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23054(AbstractC8894 abstractC8894, Configuration configuration) {
        if (abstractC8894.m23050()) {
            abstractC8894.m23096(false, configuration);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23055(AbstractC8894 abstractC8894, Integer num) {
        if (abstractC8894.m23050() && num.intValue() == 80) {
            abstractC8894.m23095(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23057(AbstractC8894 abstractC8894, C11340 c11340) {
        if (abstractC8894.m23050()) {
            abstractC8894.m23097(c11340.m28421(), false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23056(AbstractC8894 abstractC8894, C2872 c2872) {
        if (abstractC8894.m23050()) {
            abstractC8894.m23123(c2872.m8653(), false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23052(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C19208());
        AbstractC16304 abstractC16304 = this.f30513;
        try {
            if (abstractC16304 != null) {
                abstractC16304.mo20669(printWriter, new String[0]);
            } else {
                m23083(EnumC19730.f63352, (FileDescriptor) null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC11447 m23118() {
        return new C2813(this);
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    private void m23059() {
        synchronized (this.f30522) {
            if (!this.f30522.isEmpty()) {
                this.f30516.m44475(true);
            } else {
                this.f30516.m44475(m23107() > 0 && m23061(this.f30501));
            }
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static boolean m23061(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (componentCallbacksC22654 == null) {
            return true;
        }
        AbstractC8894 abstractC8894 = componentCallbacksC22654.mFragmentManager;
        return componentCallbacksC22654.equals(abstractC8894.f30508) && m23061(abstractC8894.f30501);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m23131() {
        m23126(true);
        if (this.f30516.m44476()) {
            m23110();
        } else {
            this.f30483.m34906();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m23110() {
        return m23058(-1, 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23120(int i) {
        m23121(i, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23121(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException(C8479.m22141(i, "Bad id: "));
        }
        m23085(new C19477(this, i), z);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23113(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C8479.m22141(i, "Bad id: "));
        }
        m23058(i, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m23058(int i, int i2) {
        m23126(false);
        m23063(true);
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f30508;
        if (componentCallbacksC22654 != null && i < 0 && componentCallbacksC22654.getChildFragmentManager().m23110()) {
            return true;
        }
        boolean zM23100 = m23100(this.f30520, this.f30493, i, i2);
        if (zM23100) {
            this.f30521 = true;
            try {
                m23053(this.f30520, this.f30493);
                m23048();
            } catch (Throwable th) {
                m23048();
                throw th;
            }
        }
        m23059();
        boolean z = this.f30518;
        C14539 c14539 = this.f30509;
        if (z) {
            this.f30518 = false;
            Iterator it = c14539.m34995().iterator();
            while (it.hasNext()) {
                m23094((C23711) it.next());
            }
        }
        c14539.m34979();
        return zM23100;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m23107() {
        ArrayList arrayList = this.f30490;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23005 m23134() {
        return (InterfaceC23005) this.f30490.get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23086(C14631 c14631) {
        if (this.f30506 == null) {
            this.f30506 = new ArrayList();
        }
        this.f30506.add(c14631);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23087(C15599 c15599) {
        View view;
        for (C23711 c23711 : this.f30509.m34995()) {
            ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
            if (componentCallbacksC22654M52206.mContainerId == c15599.getId() && (view = componentCallbacksC22654M52206.mView) != null && view.getParent() == null) {
                componentCallbacksC22654M52206.mContainer = c15599;
                c23711.m52207();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m23109() {
        return this.f30509.m34987();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C12484 m23070(ComponentCallbacksC22654 componentCallbacksC22654) {
        return this.f30517.m45621(componentCallbacksC22654);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23122(ComponentCallbacksC22654 componentCallbacksC22654) {
        this.f30517.m45623(componentCallbacksC22654);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m23142(ComponentCallbacksC22654 componentCallbacksC22654) {
        this.f30517.m45625(componentCallbacksC22654);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m23115() {
        return this.f30489;
    }

    public final String toString() {
        StringBuilder sbM40152 = C17214.m40152(128, "FragmentManager{");
        sbM40152.append(Integer.toHexString(System.identityHashCode(this)));
        sbM40152.append(" in ");
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f30501;
        if (componentCallbacksC22654 != null) {
            sbM40152.append(componentCallbacksC22654.getClass().getSimpleName());
            sbM40152.append("{");
            sbM40152.append(Integer.toHexString(System.identityHashCode(this.f30501)));
            sbM40152.append(l.d);
        } else {
            AbstractC16304 abstractC16304 = this.f30513;
            if (abstractC16304 != null) {
                sbM40152.append(abstractC16304.getClass().getSimpleName());
                sbM40152.append("{");
                sbM40152.append(Integer.toHexString(System.identityHashCode(this.f30513)));
                sbM40152.append(l.d);
            } else {
                sbM40152.append("null");
            }
        }
        sbM40152.append("}}");
        return sbM40152.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23083(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM37076 = C15489.m37076(str, ASN1Dump.TAB);
        this.f30509.m34981(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f30519;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                ComponentCallbacksC22654 componentCallbacksC22654 = (ComponentCallbacksC22654) this.f30519.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC22654.toString());
            }
        }
        ArrayList arrayList2 = this.f30490;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C2813 c2813 = (C2813) this.f30490.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c2813.toString());
                c2813.m8556(strM37076, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f30502.get());
        synchronized (this.f30522) {
            int size3 = this.f30522.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC8188 interfaceC8188 = (InterfaceC8188) this.f30522.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(interfaceC8188);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f30513);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f30492);
        if (this.f30501 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f30501);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f30484);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f30507);
        printWriter.print(" mStopped=");
        printWriter.print(this.f30503);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f30489);
        if (this.f30496) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f30496);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23094(C23711 c23711) {
        ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
        if (componentCallbacksC22654M52206.mDeferStart) {
            if (this.f30521) {
                this.f30518 = true;
            } else {
                componentCallbacksC22654M52206.mDeferStart = false;
                c23711.m52211();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23092(ComponentCallbacksC22654 componentCallbacksC22654, boolean z) {
        ViewGroup viewGroupM23065 = m23065(componentCallbacksC22654);
        if (viewGroupM23065 == null || !(viewGroupM23065 instanceof C15599)) {
            return;
        }
        ((C15599) viewGroupM23065).m37257(!z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23080(int i, boolean z) {
        AbstractC16304 abstractC16304;
        if (this.f30513 == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f30484) {
            this.f30484 = i;
            C14539 c14539 = this.f30509;
            c14539.m34974();
            Iterator it = c14539.m34995().iterator();
            while (it.hasNext()) {
                m23094((C23711) it.next());
            }
            if (this.f30496 && (abstractC16304 = this.f30513) != null && this.f30484 == 7) {
                abstractC16304.mo20668();
                this.f30496 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23711 m23072(ComponentCallbacksC22654 componentCallbacksC22654) {
        String str = componentCallbacksC22654.mWho;
        C14539 c14539 = this.f30509;
        C23711 c23711M34988 = c14539.m34988(str);
        if (c23711M34988 != null) {
            return c23711M34988;
        }
        C23711 c23711 = new C23711(this.f30498, c14539, componentCallbacksC22654);
        c23711.m52209(this.f30513.m38450().getClassLoader());
        c23711.m52208(this.f30484);
        return c23711;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23711 m23079(ComponentCallbacksC22654 componentCallbacksC22654) {
        String str = componentCallbacksC22654.mPreviousWho;
        if (str != null) {
            C1568.m5363(componentCallbacksC22654, str);
        }
        if (m23060(2)) {
            componentCallbacksC22654.toString();
        }
        C23711 c23711M23072 = m23072(componentCallbacksC22654);
        componentCallbacksC22654.mFragmentManager = this;
        C14539 c14539 = this.f30509;
        c14539.m34985(c23711M23072);
        if (!componentCallbacksC22654.mDetached) {
            c14539.m34984(componentCallbacksC22654);
            componentCallbacksC22654.mRemoving = false;
            if (componentCallbacksC22654.mView == null) {
                componentCallbacksC22654.mHiddenChanged = false;
            }
            if (m23066(componentCallbacksC22654)) {
                this.f30496 = true;
            }
        }
        return c23711M23072;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m23105(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (m23060(2)) {
            C13638.toString(componentCallbacksC22654);
        }
        boolean zIsInBackStack = componentCallbacksC22654.isInBackStack();
        if (componentCallbacksC22654.mDetached && zIsInBackStack) {
            return;
        }
        this.f30509.m34992(componentCallbacksC22654);
        if (m23066(componentCallbacksC22654)) {
            this.f30496 = true;
        }
        componentCallbacksC22654.mRemoving = true;
        m23067(componentCallbacksC22654);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m23117(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (m23060(2)) {
            C13638.toString(componentCallbacksC22654);
        }
        if (componentCallbacksC22654.mHidden) {
            return;
        }
        componentCallbacksC22654.mHidden = true;
        componentCallbacksC22654.mHiddenChanged = true ^ componentCallbacksC22654.mHiddenChanged;
        m23067(componentCallbacksC22654);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m23102(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (m23060(2)) {
            C13638.toString(componentCallbacksC22654);
        }
        if (componentCallbacksC22654.mDetached) {
            return;
        }
        componentCallbacksC22654.mDetached = true;
        if (componentCallbacksC22654.mAdded) {
            if (m23060(2)) {
                componentCallbacksC22654.toString();
            }
            this.f30509.m34992(componentCallbacksC22654);
            if (m23066(componentCallbacksC22654)) {
                this.f30496 = true;
            }
            m23067(componentCallbacksC22654);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23114(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (m23060(2)) {
            C13638.toString(componentCallbacksC22654);
        }
        if (componentCallbacksC22654.mDetached) {
            componentCallbacksC22654.mDetached = false;
            if (componentCallbacksC22654.mAdded) {
                return;
            }
            this.f30509.m34984(componentCallbacksC22654);
            if (m23060(2)) {
                componentCallbacksC22654.toString();
            }
            if (m23066(componentCallbacksC22654)) {
                this.f30496 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m23077(int i) {
        return this.f30509.m34996(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m23119(String str) {
        return this.f30509.m34991(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m23111(String str) {
        return this.f30509.m34976(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m23078(String str) {
        return this.f30509.m34997(str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m23132() {
        return this.f30507 || this.f30503;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23085(InterfaceC8188 interfaceC8188, boolean z) {
        if (!z) {
            if (this.f30513 != null) {
                if (m23132()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
            } else {
                if (this.f30489) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f30522) {
            if (this.f30513 == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f30522.add(interfaceC8188);
                m23127();
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m23127() {
        synchronized (this.f30522) {
            if (this.f30522.size() == 1) {
                this.f30513.m38453().removeCallbacks(this.f30495);
                this.f30513.m38453().post(this.f30495);
                m23059();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23076() {
        return this.f30502.getAndIncrement();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m23063(boolean z) {
        if (this.f30521) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f30513 == null) {
            if (this.f30489) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if (Looper.myLooper() == this.f30513.m38453().getLooper()) {
            if (!z && m23132()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
            if (this.f30520 == null) {
                this.f30520 = new ArrayList();
                this.f30493 = new ArrayList();
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be called from main thread of fragment host");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23084(C2813 c2813, boolean z) {
        if (z && (this.f30513 == null || this.f30489)) {
            return;
        }
        m23063(z);
        c2813.mo8557(this.f30520, this.f30493);
        this.f30521 = true;
        try {
            m23053(this.f30520, this.f30493);
            m23048();
            m23059();
            boolean z2 = this.f30518;
            C14539 c14539 = this.f30509;
            if (z2) {
                this.f30518 = false;
                Iterator it = c14539.m34995().iterator();
                while (it.hasNext()) {
                    m23094((C23711) it.next());
                }
            }
            c14539.m34979();
        } catch (Throwable th) {
            m23048();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23048() {
        this.f30521 = false;
        this.f30493.clear();
        this.f30520.clear();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m23126(boolean z) {
        boolean z2;
        m23063(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f30520;
            ArrayList arrayList2 = this.f30493;
            synchronized (this.f30522) {
                if (this.f30522.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.f30522.size();
                        boolean zMo8557 = false;
                        for (int i = 0; i < size; i++) {
                            zMo8557 |= ((InterfaceC8188) this.f30522.get(i)).mo8557(arrayList, arrayList2);
                        }
                        this.f30522.clear();
                        this.f30513.m38453().removeCallbacks(this.f30495);
                        z2 = zMo8557;
                    } catch (Throwable th) {
                        this.f30522.clear();
                        this.f30513.m38453().removeCallbacks(this.f30495);
                        throw th;
                    }
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.f30521 = true;
            try {
                m23053(this.f30520, this.f30493);
                m23048();
            } catch (Throwable th2) {
                m23048();
                throw th2;
            }
        }
        m23059();
        if (this.f30518) {
            this.f30518 = false;
            Iterator it = this.f30509.m34995().iterator();
            while (it.hasNext()) {
                m23094((C23711) it.next());
            }
        }
        this.f30509.m34979();
        return z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23053(ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((C2813) arrayList.get(i)).f38523) {
                if (i2 != i) {
                    m23064(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C2813) arrayList.get(i2)).f38523) {
                        i2++;
                    }
                }
                m23064(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m23064(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m23064(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        C2813 c2813;
        C14539 c14539;
        ComponentCallbacksC22654 componentCallbacksC22654;
        C14539 c145310;
        int i3;
        int i4;
        ArrayList arrayList3 = arrayList;
        boolean z = ((C2813) arrayList3.get(i)).f38523;
        ArrayList arrayList4 = this.f30487;
        if (arrayList4 == null) {
            this.f30487 = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.f30487;
        C14539 c145311 = this.f30509;
        arrayList5.addAll(c145311.m34987());
        ComponentCallbacksC22654 componentCallbacksC22655 = this.f30508;
        boolean z2 = false;
        int i5 = i;
        while (true) {
            int i6 = 1;
            if (i5 < i2) {
                C2813 c2814 = (C2813) arrayList3.get(i5);
                if (!((Boolean) arrayList2.get(i5)).booleanValue()) {
                    ArrayList arrayList6 = this.f30487;
                    ArrayList arrayList7 = c2814.f38515;
                    int i7 = 0;
                    while (i7 < arrayList7.size()) {
                        C13564 c13564 = (C13564) arrayList7.get(i7);
                        int i8 = c13564.f44745;
                        if (i8 == i6) {
                            c145310 = c145311;
                            i3 = 1;
                            arrayList6.add(c13564.f44746);
                        } else if (i8 != 2) {
                            if (i8 == 3 || i8 == 6) {
                                arrayList6.remove(c13564.f44746);
                                ComponentCallbacksC22654 componentCallbacksC22656 = c13564.f44746;
                                if (componentCallbacksC22656 == componentCallbacksC22655) {
                                    arrayList7.add(i7, new C13564(componentCallbacksC22656, 9));
                                    i7++;
                                    i3 = 1;
                                    componentCallbacksC22655 = null;
                                }
                                c145310 = c145311;
                            } else if (i8 == 7) {
                                c145310 = c145311;
                                i3 = 1;
                                arrayList6.add(c13564.f44746);
                            } else if (i8 == 8) {
                                arrayList7.add(i7, new C13564(9, componentCallbacksC22655, 0));
                                c13564.f44750 = true;
                                i7++;
                                componentCallbacksC22655 = c13564.f44746;
                            }
                            i3 = 1;
                            c145310 = c145311;
                        } else {
                            ComponentCallbacksC22654 componentCallbacksC22657 = c13564.f44746;
                            int i9 = componentCallbacksC22657.mContainerId;
                            int size = arrayList6.size() - 1;
                            boolean z3 = false;
                            while (size >= 0) {
                                C14539 c145312 = c145311;
                                ComponentCallbacksC22654 componentCallbacksC22658 = (ComponentCallbacksC22654) arrayList6.get(size);
                                if (componentCallbacksC22658.mContainerId != i9) {
                                    i9 = i9;
                                } else if (componentCallbacksC22658 == componentCallbacksC22657) {
                                    i9 = i9;
                                    z3 = true;
                                } else {
                                    if (componentCallbacksC22658 == componentCallbacksC22655) {
                                        i4 = 0;
                                        arrayList7.add(i7, new C13564(9, componentCallbacksC22658, 0));
                                        i7++;
                                        componentCallbacksC22655 = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    C13564 c13565 = new C13564(3, componentCallbacksC22658, i4);
                                    c13565.f44747 = c13564.f44747;
                                    c13565.f44748 = c13564.f44748;
                                    c13565.f44743 = c13564.f44743;
                                    c13565.f44744 = c13564.f44744;
                                    arrayList7.add(i7, c13565);
                                    arrayList6.remove(componentCallbacksC22658);
                                    i7++;
                                    componentCallbacksC22655 = componentCallbacksC22655;
                                }
                                size--;
                                i9 = i9;
                                c145311 = c145312;
                            }
                            c145310 = c145311;
                            if (z3) {
                                arrayList7.remove(i7);
                                i7--;
                            } else {
                                c13564.f44745 = 1;
                                c13564.f44750 = true;
                                arrayList6.add(componentCallbacksC22657);
                            }
                            i3 = 1;
                        }
                        i7 += i3;
                        i6 = 1;
                        c145311 = c145310;
                    }
                    c14539 = c145311;
                } else {
                    c14539 = c145311;
                    int i10 = 1;
                    ArrayList arrayList8 = this.f30487;
                    ArrayList arrayList9 = c2814.f38515;
                    int size2 = arrayList9.size() - 1;
                    while (size2 >= 0) {
                        C13564 c13566 = (C13564) arrayList9.get(size2);
                        int i11 = c13566.f44745;
                        if (i11 == i10) {
                            arrayList8.remove(c13566.f44746);
                        } else if (i11 != 3) {
                            switch (i11) {
                                case 6:
                                    arrayList8.add(c13566.f44746);
                                    break;
                                case 7:
                                    arrayList8.remove(c13566.f44746);
                                    break;
                                case 8:
                                    componentCallbacksC22654 = null;
                                    componentCallbacksC22655 = componentCallbacksC22654;
                                    break;
                                case 9:
                                    componentCallbacksC22654 = c13566.f44746;
                                    componentCallbacksC22655 = componentCallbacksC22654;
                                    break;
                                case 10:
                                    c13566.f44749 = c13566.f44742;
                                    break;
                            }
                        } else {
                            arrayList8.add(c13566.f44746);
                        }
                        size2--;
                        i10 = 1;
                    }
                }
                z2 = z2 || c2814.f38513;
                i5++;
                arrayList3 = arrayList;
                c145311 = c14539;
            } else {
                C14539 c145313 = c145311;
                this.f30487.clear();
                if (!z && this.f30484 >= 1) {
                    for (int i12 = i; i12 < i2; i12++) {
                        Iterator it = ((C2813) arrayList.get(i12)).f38515.iterator();
                        while (it.hasNext()) {
                            ComponentCallbacksC22654 componentCallbacksC22659 = ((C13564) it.next()).f44746;
                            if (componentCallbacksC22659 != null && componentCallbacksC22659.mFragmentManager != null) {
                                c145313.m34985(m23072(componentCallbacksC22659));
                            }
                        }
                    }
                }
                for (int i13 = i; i13 < i2; i13++) {
                    C2813 c2815 = (C2813) arrayList.get(i13);
                    if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                        c2815.m8554(-1);
                        AbstractC8894 abstractC8894 = c2815.f10690;
                        ArrayList arrayList10 = c2815.f38515;
                        boolean z4 = true;
                        for (int size3 = arrayList10.size() - 1; size3 >= 0; size3--) {
                            C13564 c13567 = (C13564) arrayList10.get(size3);
                            ComponentCallbacksC22654 componentCallbacksC226510 = c13567.f44746;
                            if (componentCallbacksC226510 != null) {
                                componentCallbacksC226510.mBeingSaved = false;
                                componentCallbacksC226510.setPopDirection(z4);
                                int i14 = c2815.f38516;
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
                                componentCallbacksC226510.setNextTransition(i15);
                                componentCallbacksC226510.setSharedElementNames(c2815.f38522, c2815.f38521);
                            }
                            switch (c13567.f44745) {
                                case 1:
                                    componentCallbacksC226510.setAnimations(c13567.f44747, c13567.f44743, c13567.f44748, c13567.f44744);
                                    z4 = true;
                                    abstractC8894.m23092(componentCallbacksC226510, true);
                                    abstractC8894.m23105(componentCallbacksC226510);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c13567.f44745);
                                case 3:
                                    componentCallbacksC226510.setAnimations(c13567.f44747, c13567.f44743, c13567.f44748, c13567.f44744);
                                    abstractC8894.m23079(componentCallbacksC226510);
                                    z4 = true;
                                    break;
                                case 4:
                                    componentCallbacksC226510.setAnimations(c13567.f44747, c13567.f44743, c13567.f44748, c13567.f44744);
                                    abstractC8894.getClass();
                                    if (m23060(2)) {
                                        C13638.toString(componentCallbacksC226510);
                                    }
                                    if (componentCallbacksC226510.mHidden) {
                                        componentCallbacksC226510.mHidden = false;
                                        componentCallbacksC226510.mHiddenChanged = !componentCallbacksC226510.mHiddenChanged;
                                    }
                                    z4 = true;
                                    break;
                                case 5:
                                    componentCallbacksC226510.setAnimations(c13567.f44747, c13567.f44743, c13567.f44748, c13567.f44744);
                                    abstractC8894.m23092(componentCallbacksC226510, true);
                                    abstractC8894.m23117(componentCallbacksC226510);
                                    z4 = true;
                                    break;
                                case 6:
                                    componentCallbacksC226510.setAnimations(c13567.f44747, c13567.f44743, c13567.f44748, c13567.f44744);
                                    abstractC8894.m23114(componentCallbacksC226510);
                                    z4 = true;
                                    break;
                                case 7:
                                    componentCallbacksC226510.setAnimations(c13567.f44747, c13567.f44743, c13567.f44748, c13567.f44744);
                                    abstractC8894.m23092(componentCallbacksC226510, true);
                                    abstractC8894.m23102(componentCallbacksC226510);
                                    z4 = true;
                                    break;
                                case 8:
                                    abstractC8894.m23129(null);
                                    z4 = true;
                                    break;
                                case 9:
                                    abstractC8894.m23129(componentCallbacksC226510);
                                    z4 = true;
                                    break;
                                case 10:
                                    abstractC8894.m23091(componentCallbacksC226510, c13567.f44742);
                                    z4 = true;
                                    break;
                            }
                        }
                    } else {
                        c2815.m8554(1);
                        AbstractC8894 abstractC8895 = c2815.f10690;
                        ArrayList arrayList11 = c2815.f38515;
                        int size4 = arrayList11.size();
                        int i16 = 0;
                        while (i16 < size4) {
                            C13564 c13568 = (C13564) arrayList11.get(i16);
                            ComponentCallbacksC22654 componentCallbacksC226511 = c13568.f44746;
                            if (componentCallbacksC226511 != null) {
                                componentCallbacksC226511.mBeingSaved = false;
                                componentCallbacksC226511.setPopDirection(false);
                                componentCallbacksC226511.setNextTransition(c2815.f38516);
                                componentCallbacksC226511.setSharedElementNames(c2815.f38521, c2815.f38522);
                            }
                            switch (c13568.f44745) {
                                case 1:
                                    c2813 = c2815;
                                    componentCallbacksC226511.setAnimations(c13568.f44747, c13568.f44743, c13568.f44748, c13568.f44744);
                                    abstractC8895.m23092(componentCallbacksC226511, false);
                                    abstractC8895.m23079(componentCallbacksC226511);
                                    i16++;
                                    c2815 = c2813;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c13568.f44745);
                                case 3:
                                    c2813 = c2815;
                                    componentCallbacksC226511.setAnimations(c13568.f44747, c13568.f44743, c13568.f44748, c13568.f44744);
                                    abstractC8895.m23105(componentCallbacksC226511);
                                    i16++;
                                    c2815 = c2813;
                                    break;
                                case 4:
                                    c2813 = c2815;
                                    componentCallbacksC226511.setAnimations(c13568.f44747, c13568.f44743, c13568.f44748, c13568.f44744);
                                    abstractC8895.m23117(componentCallbacksC226511);
                                    i16++;
                                    c2815 = c2813;
                                    break;
                                case 5:
                                    c2813 = c2815;
                                    componentCallbacksC226511.setAnimations(c13568.f44747, c13568.f44743, c13568.f44748, c13568.f44744);
                                    abstractC8895.m23092(componentCallbacksC226511, false);
                                    if (m23060(2)) {
                                        C13638.toString(componentCallbacksC226511);
                                    }
                                    if (componentCallbacksC226511.mHidden) {
                                        componentCallbacksC226511.mHidden = false;
                                        componentCallbacksC226511.mHiddenChanged = !componentCallbacksC226511.mHiddenChanged;
                                    }
                                    i16++;
                                    c2815 = c2813;
                                    break;
                                case 6:
                                    c2813 = c2815;
                                    componentCallbacksC226511.setAnimations(c13568.f44747, c13568.f44743, c13568.f44748, c13568.f44744);
                                    abstractC8895.m23102(componentCallbacksC226511);
                                    i16++;
                                    c2815 = c2813;
                                    break;
                                case 7:
                                    c2813 = c2815;
                                    componentCallbacksC226511.setAnimations(c13568.f44747, c13568.f44743, c13568.f44748, c13568.f44744);
                                    abstractC8895.m23092(componentCallbacksC226511, false);
                                    abstractC8895.m23114(componentCallbacksC226511);
                                    i16++;
                                    c2815 = c2813;
                                    break;
                                case 8:
                                    abstractC8895.m23129(componentCallbacksC226511);
                                    c2813 = c2815;
                                    i16++;
                                    c2815 = c2813;
                                    break;
                                case 9:
                                    abstractC8895.m23129(null);
                                    c2813 = c2815;
                                    i16++;
                                    c2815 = c2813;
                                    break;
                                case 10:
                                    abstractC8895.m23091(componentCallbacksC226511, c13568.f44749);
                                    c2813 = c2815;
                                    i16++;
                                    c2815 = c2813;
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i17 = i; i17 < i2; i17++) {
                    C2813 c2816 = (C2813) arrayList.get(i17);
                    if (zBooleanValue) {
                        int size5 = c2816.f38515.size();
                        while (true) {
                            size5--;
                            if (size5 >= 0) {
                                ComponentCallbacksC22654 componentCallbacksC226512 = ((C13564) c2816.f38515.get(size5)).f44746;
                                if (componentCallbacksC226512 != null) {
                                    m23072(componentCallbacksC226512).m52211();
                                }
                            }
                        }
                    } else {
                        Iterator it2 = c2816.f38515.iterator();
                        while (it2.hasNext()) {
                            ComponentCallbacksC22654 componentCallbacksC226513 = ((C13564) it2.next()).f44746;
                            if (componentCallbacksC226513 != null) {
                                m23072(componentCallbacksC226513).m52211();
                            }
                        }
                    }
                }
                m23080(this.f30484, true);
                HashSet<AbstractC12153> hashSet = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    Iterator it3 = ((C2813) arrayList.get(i18)).f38515.iterator();
                    while (it3.hasNext()) {
                        ComponentCallbacksC22654 componentCallbacksC226514 = ((C13564) it3.next()).f44746;
                        if (componentCallbacksC226514 != null && (viewGroup = componentCallbacksC226514.mContainer) != null) {
                            hashSet.add(AbstractC12153.m30221(viewGroup, m23069()));
                        }
                    }
                }
                for (AbstractC12153 abstractC12153 : hashSet) {
                    abstractC12153.f40674 = zBooleanValue;
                    abstractC12153.m30226();
                    abstractC12153.m30227();
                }
                for (int i19 = i; i19 < i2; i19++) {
                    C2813 c2817 = (C2813) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c2817.f10689 >= 0) {
                        c2817.f10689 = -1;
                    }
                    c2817.getClass();
                }
                if (!z2 || this.f30506 == null) {
                    return;
                }
                for (int i20 = 0; i20 < this.f30506.size(); i20++) {
                    ((InterfaceC18771) this.f30506.get(i20)).mo35139();
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m23067(ComponentCallbacksC22654 componentCallbacksC22654) {
        ViewGroup viewGroupM23065 = m23065(componentCallbacksC22654);
        if (viewGroupM23065 == null || componentCallbacksC22654.getEnterAnim() + componentCallbacksC22654.getExitAnim() + componentCallbacksC22654.getPopEnterAnim() + componentCallbacksC22654.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupM23065.getTag(R.id.MT_Protector) == null) {
            viewGroupM23065.setTag(R.id.MT_Protector, componentCallbacksC22654);
        }
        ((ComponentCallbacksC22654) viewGroupM23065.getTag(R.id.MT_Protector)).setPopDirection(componentCallbacksC22654.getPopDirection());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private ViewGroup m23065(ComponentCallbacksC22654 componentCallbacksC22654) {
        ViewGroup viewGroup = componentCallbacksC22654.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC22654.mContainerId <= 0 || !this.f30492.mo12111()) {
            return null;
        }
        View viewMo12110 = this.f30492.mo12110(componentCallbacksC22654.mContainerId);
        if (viewMo12110 instanceof ViewGroup) {
            return (ViewGroup) viewMo12110;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private HashSet m23062() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f30509.m34995().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C23711) it.next()).m52206().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC12153.m30221(viewGroup, m23069()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23100(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f30490;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f30490.size() - 1;
            } else {
                int size2 = this.f30490.size() - 1;
                while (size2 >= 0) {
                    C2813 c2813 = (C2813) this.f30490.get(size2);
                    if (i >= 0 && i == c2813.f10689) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C2813 c2814 = (C2813) this.f30490.get(size - 1);
                        if (i < 0 || i != c2814.f10689) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f30490.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f30490.size() - 1; size3 >= size; size3--) {
            arrayList.add((C2813) this.f30490.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Bundle m23143() {
        int i;
        C22570[] c22570Arr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m23062().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC12153 abstractC12153 = (AbstractC12153) it.next();
            if (abstractC12153.f40675) {
                m23060(2);
                abstractC12153.f40675 = false;
                abstractC12153.m30227();
            }
        }
        Iterator it2 = m23062().iterator();
        while (it2.hasNext()) {
            ((AbstractC12153) it2.next()).m30233();
        }
        m23126(true);
        this.f30507 = true;
        this.f30517.m45624(true);
        C14539 c14539 = this.f30509;
        ArrayList arrayListM34977 = c14539.m34977();
        ArrayList<C17360> arrayListM34975 = c14539.m34975();
        if (arrayListM34975.isEmpty()) {
            m23060(2);
            return bundle;
        }
        ArrayList arrayListM34989 = c14539.m34989();
        ArrayList arrayList = this.f30490;
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            c22570Arr = null;
        } else {
            c22570Arr = new C22570[size];
            for (i = 0; i < size; i++) {
                c22570Arr[i] = new C22570((C2813) this.f30490.get(i));
                if (m23060(2)) {
                    C13638.toString(this.f30490.get(i));
                }
            }
        }
        C20888 c20888 = new C20888();
        c20888.f67842 = arrayListM34977;
        c20888.f67845 = arrayListM34989;
        c20888.f67838 = c22570Arr;
        c20888.f67843 = this.f30502.get();
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f30508;
        if (componentCallbacksC22654 != null) {
            c20888.f67840 = componentCallbacksC22654.mWho;
        }
        ArrayList arrayList2 = c20888.f67841;
        Map map = this.f30486;
        arrayList2.addAll(map.keySet());
        c20888.f67844.addAll(map.values());
        c20888.f67839 = new ArrayList(this.f30497);
        bundle.putParcelable("state", c20888);
        Map map2 = this.f30499;
        for (String str : map2.keySet()) {
            bundle.putBundle(C0252.m1693("result_", str), (Bundle) map2.get(str));
        }
        for (C17360 c17360 : arrayListM34975) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("state", c17360);
            bundle.putBundle("fragment_" + c17360.f55231, bundle2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23081(Parcelable parcelable) {
        C10660 c10660;
        int i;
        C23711 c23711;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f30513.m38450().getClassLoader());
                this.f30499.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f30513.m38450().getClassLoader());
                arrayList.add((C17360) bundle.getParcelable("state"));
            }
        }
        C14539 c14539 = this.f30509;
        c14539.m34998(arrayList);
        C20888 c20888 = (C20888) bundle3.getParcelable("state");
        if (c20888 == null) {
            return;
        }
        c14539.m34993();
        Iterator it = c20888.f67842.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c10660 = this.f30498;
            i = 2;
            if (!zHasNext) {
                break;
            }
            C17360 c17360M34978 = c14539.m34978((String) it.next(), null);
            if (c17360M34978 != null) {
                ComponentCallbacksC22654 componentCallbacksC22654M45628 = this.f30517.m45628(c17360M34978.f55231);
                if (componentCallbacksC22654M45628 != null) {
                    if (m23060(2)) {
                        componentCallbacksC22654M45628.toString();
                    }
                    c23711 = new C23711(c10660, c14539, componentCallbacksC22654M45628, c17360M34978);
                } else {
                    c23711 = new C23711(this.f30498, this.f30509, this.f30513.m38450().getClassLoader(), m23108(), c17360M34978);
                }
                ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
                componentCallbacksC22654M52206.mFragmentManager = this;
                if (m23060(2)) {
                    componentCallbacksC22654M52206.toString();
                }
                c23711.m52209(this.f30513.m38450().getClassLoader());
                c14539.m34985(c23711);
                c23711.m52208(this.f30484);
            }
        }
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30517.m45620()) {
            if (!c14539.m34986(componentCallbacksC22654.mWho)) {
                if (m23060(2)) {
                    componentCallbacksC22654.toString();
                    C13638.toString(c20888.f67842);
                }
                this.f30517.m45625(componentCallbacksC22654);
                componentCallbacksC22654.mFragmentManager = this;
                C23711 c23712 = new C23711(c10660, c14539, componentCallbacksC22654);
                c23712.m52208(1);
                c23712.m52211();
                componentCallbacksC22654.mRemoving = true;
                c23712.m52211();
            }
        }
        c14539.m34982(c20888.f67845);
        if (c20888.f67838 != null) {
            this.f30490 = new ArrayList(c20888.f67838.length);
            int i2 = 0;
            while (true) {
                C22570[] c22570Arr = c20888.f67838;
                if (i2 >= c22570Arr.length) {
                    break;
                }
                C22570 c22570 = c22570Arr[i2];
                ArrayList arrayList2 = c22570.f73564;
                C2813 c2813 = new C2813(this);
                int[] iArr = c22570.f73561;
                int i3 = 0;
                int i4 = 0;
                while (i3 < iArr.length) {
                    C13564 c13564 = new C13564();
                    int i5 = i3 + 1;
                    c13564.f44745 = iArr[i3];
                    if (m23060(i)) {
                        C13638.toString(c2813);
                        int i6 = iArr[i5];
                    }
                    c13564.f44742 = EnumC9414.values()[c22570.f73566[i4]];
                    c13564.f44749 = EnumC9414.values()[c22570.f73560[i4]];
                    int i7 = i3 + 2;
                    c13564.f44750 = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    c13564.f44747 = i8;
                    int i9 = iArr[i3 + 3];
                    c13564.f44743 = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    c13564.f44748 = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    c13564.f44744 = i12;
                    c2813.f38510 = i8;
                    c2813.f38518 = i9;
                    c2813.f38525 = i11;
                    c2813.f38520 = i12;
                    c2813.m28563(c13564);
                    i4++;
                    i = 2;
                }
                c2813.f38516 = c22570.f73556;
                c2813.f38512 = c22570.f73559;
                c2813.f38513 = true;
                c2813.f38514 = c22570.f73553;
                c2813.f38524 = c22570.f73563;
                c2813.f38517 = c22570.f73562;
                c2813.f38511 = c22570.f73565;
                c2813.f38521 = c22570.f73558;
                c2813.f38522 = c22570.f73555;
                c2813.f38523 = c22570.f73554;
                c2813.f10689 = c22570.f73557;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    String str3 = (String) arrayList2.get(i13);
                    if (str3 != null) {
                        ((C13564) c2813.f38515.get(i13)).f44746 = c14539.m34997(str3);
                    }
                }
                c2813.m8554(1);
                if (m23060(2)) {
                    c2813.toString();
                    PrintWriter printWriter = new PrintWriter(new C19208());
                    c2813.m8556(EnumC19730.f63352, printWriter, false);
                    printWriter.close();
                }
                this.f30490.add(c2813);
                i2++;
                i = 2;
            }
        } else {
            this.f30490 = null;
        }
        this.f30502.set(c20888.f67843);
        String str4 = c20888.f67840;
        if (str4 != null) {
            ComponentCallbacksC22654 componentCallbacksC22654M34997 = c14539.m34997(str4);
            this.f30508 = componentCallbacksC22654M34997;
            m23068(componentCallbacksC22654M34997);
        }
        ArrayList arrayList3 = c20888.f67841;
        if (arrayList3 != null) {
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                this.f30486.put((String) arrayList3.get(i14), (C13398) c20888.f67844.get(i14));
            }
        }
        this.f30497 = new ArrayDeque(c20888.f67839);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC16304 m23106() {
        return this.f30513;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m23136() {
        return this.f30501;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC20537 m23135() {
        return this.f30492;
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
    public final void m23088(AbstractC16304 abstractC16304, AbstractC20537 abstractC20537, ComponentCallbacksC22654 componentCallbacksC22654) {
        Object c13127;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String strM50267;
        Bundle bundleM46522;
        InterfaceC1792 interfaceC1792;
        InterfaceC1423 interfaceC1423;
        if (this.f30513 != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f30513 = abstractC16304;
        this.f30492 = abstractC20537;
        this.f30501 = componentCallbacksC22654;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f30510;
        if (componentCallbacksC22654 == null) {
            if (abstractC16304 instanceof InterfaceC0426) {
                c13127 = (InterfaceC0426) abstractC16304;
            }
            if (this.f30501 != null) {
                m23059();
            }
            if (abstractC16304 instanceof InterfaceC1792) {
                interfaceC1792 = (InterfaceC1792) abstractC16304;
                C14494 onBackPressedDispatcher = interfaceC1792.getOnBackPressedDispatcher();
                this.f30483 = onBackPressedDispatcher;
                if (componentCallbacksC22654 != null) {
                    interfaceC1423 = interfaceC1792;
                    interfaceC1423 = componentCallbacksC22654;
                }
                interfaceC1423 = interfaceC1792;
                onBackPressedDispatcher.m34908(interfaceC1423, this.f30516);
            }
            if (componentCallbacksC22654 != null) {
                this.f30517 = componentCallbacksC22654.mFragmentManager.f30517.m45627(componentCallbacksC22654);
            } else if (abstractC16304 instanceof InterfaceC17422) {
                this.f30517 = C20183.m45618(((InterfaceC17422) abstractC16304).getViewModelStore());
            } else {
                this.f30517 = new C20183(false);
            }
            this.f30517.m45624(m23132());
            this.f30509.m34983(this.f30517);
            obj = this.f30513;
            if ((obj instanceof InterfaceC19985) && componentCallbacksC22654 == null) {
                C20690 savedStateRegistry = ((InterfaceC19985) obj).getSavedStateRegistry();
                savedStateRegistry.m46525("android:support:fragments", new InterfaceC7284() { // from class: l.ۗ֨ۙ
                    @Override // l.InterfaceC7284
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final Bundle mo8703() {
                        return this.f10932.m23143();
                    }
                });
                bundleM46522 = savedStateRegistry.m46522("android:support:fragments");
                if (bundleM46522 != null) {
                    m23081(bundleM46522);
                }
            }
            obj2 = this.f30513;
            if (obj2 instanceof InterfaceC19163) {
                AbstractC7874 abstractC7874Mo4078 = ((InterfaceC19163) obj2).mo4078();
                if (componentCallbacksC22654 != null) {
                    strM50267 = C22697.m50267(new StringBuilder(), componentCallbacksC22654.mWho, ":");
                } else {
                    strM50267 = "";
                }
                String strM1693 = C0252.m1693("FragmentManager:", strM50267);
                this.f30488 = abstractC7874Mo4078.m20781(C15489.m37076(strM1693, "StartActivityForResult"), new C0112(), new C3953(this));
                this.f30491 = abstractC7874Mo4078.m20781(C15489.m37076(strM1693, "StartIntentSenderForResult"), new C15244(), new C6776(this));
                this.f30485 = abstractC7874Mo4078.m20781(C15489.m37076(strM1693, "RequestPermissions"), new C19869(), new C4659(this));
            }
            obj3 = this.f30513;
            if (obj3 instanceof InterfaceC12522) {
                ((InterfaceC12522) obj3).mo4079(this.f30511);
            }
            obj4 = this.f30513;
            if (obj4 instanceof InterfaceC17460) {
                ((InterfaceC17460) obj4).mo4082(this.f30494);
            }
            obj5 = this.f30513;
            if (obj5 instanceof InterfaceC10635) {
                ((InterfaceC10635) obj5).mo4074(this.f30504);
            }
            obj6 = this.f30513;
            if (obj6 instanceof InterfaceC23335) {
                ((InterfaceC23335) obj6).mo4075(this.f30512);
            }
            obj7 = this.f30513;
            if ((obj7 instanceof InterfaceC0734) || componentCallbacksC22654 != null) {
            }
            ((InterfaceC0734) obj7).addMenuProvider(this.f30500);
            return;
        }
        c13127 = new C13127(componentCallbacksC22654);
        copyOnWriteArrayList.add(c13127);
        if (this.f30501 != null) {
            m23059();
        }
        if (abstractC16304 instanceof InterfaceC1792) {
            interfaceC1792 = (InterfaceC1792) abstractC16304;
            C14494 onBackPressedDispatcher2 = interfaceC1792.getOnBackPressedDispatcher();
            this.f30483 = onBackPressedDispatcher2;
            if (componentCallbacksC22654 != null) {
                interfaceC1423 = interfaceC1792;
                interfaceC1423 = componentCallbacksC22654;
            }
            interfaceC1423 = interfaceC1792;
            onBackPressedDispatcher2.m34908(interfaceC1423, this.f30516);
        }
        if (componentCallbacksC22654 != null) {
            this.f30517 = componentCallbacksC22654.mFragmentManager.f30517.m45627(componentCallbacksC22654);
        } else if (abstractC16304 instanceof InterfaceC17422) {
            this.f30517 = C20183.m45618(((InterfaceC17422) abstractC16304).getViewModelStore());
        } else {
            this.f30517 = new C20183(false);
        }
        this.f30517.m45624(m23132());
        this.f30509.m34983(this.f30517);
        obj = this.f30513;
        if (obj instanceof InterfaceC19985) {
            C20690 savedStateRegistry2 = ((InterfaceC19985) obj).getSavedStateRegistry();
            savedStateRegistry2.m46525("android:support:fragments", new InterfaceC7284() { // from class: l.ۗ֨ۙ
                @Override // l.InterfaceC7284
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final Bundle mo8703() {
                    return this.f10932.m23143();
                }
            });
            bundleM46522 = savedStateRegistry2.m46522("android:support:fragments");
            if (bundleM46522 != null) {
                m23081(bundleM46522);
            }
        }
        obj2 = this.f30513;
        if (obj2 instanceof InterfaceC19163) {
            AbstractC7874 abstractC7874Mo4079 = ((InterfaceC19163) obj2).mo4078();
            if (componentCallbacksC22654 != null) {
                strM50267 = C22697.m50267(new StringBuilder(), componentCallbacksC22654.mWho, ":");
            } else {
                strM50267 = "";
            }
            String strM1694 = C0252.m1693("FragmentManager:", strM50267);
            this.f30488 = abstractC7874Mo4079.m20781(C15489.m37076(strM1694, "StartActivityForResult"), new C0112(), new C3953(this));
            this.f30491 = abstractC7874Mo4079.m20781(C15489.m37076(strM1694, "StartIntentSenderForResult"), new C15244(), new C6776(this));
            this.f30485 = abstractC7874Mo4079.m20781(C15489.m37076(strM1694, "RequestPermissions"), new C19869(), new C4659(this));
        }
        obj3 = this.f30513;
        if (obj3 instanceof InterfaceC12522) {
            ((InterfaceC12522) obj3).mo4079(this.f30511);
        }
        obj4 = this.f30513;
        if (obj4 instanceof InterfaceC17460) {
            ((InterfaceC17460) obj4).mo4082(this.f30494);
        }
        obj5 = this.f30513;
        if (obj5 instanceof InterfaceC10635) {
            ((InterfaceC10635) obj5).mo4074(this.f30504);
        }
        obj6 = this.f30513;
        if (obj6 instanceof InterfaceC23335) {
            ((InterfaceC23335) obj6).mo4075(this.f30512);
        }
        obj7 = this.f30513;
        if (obj7 instanceof InterfaceC0734) {
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m23103() {
        if (this.f30513 == null) {
            return;
        }
        this.f30507 = false;
        this.f30503 = false;
        this.f30517.m45624(false);
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30509.m34987()) {
            if (componentCallbacksC22654 != null) {
                componentCallbacksC22654.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23089(ComponentCallbacksC22654 componentCallbacksC22654, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f30488 != null) {
            this.f30497.addLast(new C18065(componentCallbacksC22654.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f30488.mo17659(intent);
            return;
        }
        this.f30513.m38451(intent, i, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23090(ComponentCallbacksC22654 componentCallbacksC22654, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        if (this.f30491 != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m23060(2)) {
                    bundle.toString();
                    intent2.toString();
                    C13638.toString(componentCallbacksC22654);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            C8580 c8580 = new C8580(intentSender);
            c8580.m22353(intent2);
            c8580.m22352(i3, i2);
            C7168 c7168M22351 = c8580.m22351();
            this.f30497.addLast(new C18065(componentCallbacksC22654.mWho, i));
            if (m23060(2)) {
                componentCallbacksC22654.toString();
            }
            this.f30491.mo17659(c7168M22351);
            return;
        }
        this.f30513.m38452(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23093(ComponentCallbacksC22654 componentCallbacksC22654, String[] strArr, int i) {
        if (this.f30485 != null) {
            this.f30497.addLast(new C18065(componentCallbacksC22654.mWho, i));
            this.f30485.mo17659(strArr);
            return;
        }
        this.f30513.getClass();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m23073() {
        this.f30507 = false;
        this.f30503 = false;
        this.f30517.m45624(false);
        m23049(0);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m23101() {
        this.f30507 = false;
        this.f30503 = false;
        this.f30517.m45624(false);
        m23049(1);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m23133() {
        m23049(2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23112() {
        this.f30507 = false;
        this.f30503 = false;
        this.f30517.m45624(false);
        m23049(4);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m23128() {
        this.f30507 = false;
        this.f30503 = false;
        this.f30517.m45624(false);
        m23049(5);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m23141() {
        this.f30507 = false;
        this.f30503 = false;
        this.f30517.m45624(false);
        m23049(7);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m23074() {
        m23049(5);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m23138() {
        this.f30503 = true;
        this.f30517.m45624(true);
        m23049(4);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m23071() {
        m23049(1);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m23139() {
        boolean zIsChangingConfigurations = true;
        this.f30489 = true;
        m23126(true);
        Iterator it = m23062().iterator();
        while (it.hasNext()) {
            ((AbstractC12153) it.next()).m30233();
        }
        AbstractC16304 abstractC16304 = this.f30513;
        boolean z = abstractC16304 instanceof InterfaceC17422;
        C14539 c14539 = this.f30509;
        if (z) {
            zIsChangingConfigurations = c14539.m35001().m45626();
        } else if (C6009.m16315(abstractC16304.m38450())) {
            zIsChangingConfigurations = true ^ ((Activity) this.f30513.m38450()).isChangingConfigurations();
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f30486.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C13398) it2.next()).f44357.iterator();
                while (it3.hasNext()) {
                    c14539.m35001().m45622((String) it3.next());
                }
            }
        }
        m23049(-1);
        Object obj = this.f30513;
        if (obj instanceof InterfaceC17460) {
            ((InterfaceC17460) obj).mo4083(this.f30494);
        }
        Object obj2 = this.f30513;
        if (obj2 instanceof InterfaceC12522) {
            ((InterfaceC12522) obj2).mo4085(this.f30511);
        }
        Object obj3 = this.f30513;
        if (obj3 instanceof InterfaceC10635) {
            ((InterfaceC10635) obj3).mo4087(this.f30504);
        }
        Object obj4 = this.f30513;
        if (obj4 instanceof InterfaceC23335) {
            ((InterfaceC23335) obj4).mo4086(this.f30512);
        }
        Object obj5 = this.f30513;
        if (obj5 instanceof InterfaceC0734) {
            ((InterfaceC0734) obj5).removeMenuProvider(this.f30500);
        }
        this.f30513 = null;
        this.f30492 = null;
        this.f30501 = null;
        if (this.f30483 != null) {
            this.f30516.m44471();
            this.f30483 = null;
        }
        AbstractC6462 abstractC6462 = this.f30488;
        if (abstractC6462 != null) {
            abstractC6462.mo17658();
            this.f30491.mo17658();
            this.f30485.mo17658();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m23049(int i) {
        try {
            this.f30521 = true;
            this.f30509.m34980(i);
            m23080(i, false);
            Iterator it = m23062().iterator();
            while (it.hasNext()) {
                ((AbstractC12153) it.next()).m30233();
            }
            this.f30521 = false;
            m23126(true);
        } catch (Throwable th) {
            this.f30521 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23097(boolean z, boolean z2) {
        if (z2 && (this.f30513 instanceof InterfaceC10635)) {
            m23052(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30509.m34987()) {
            if (componentCallbacksC22654 != null) {
                componentCallbacksC22654.performMultiWindowModeChanged(z);
                if (z2) {
                    componentCallbacksC22654.mChildFragmentManager.m23097(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23123(boolean z, boolean z2) {
        if (z2 && (this.f30513 instanceof InterfaceC23335)) {
            m23052(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30509.m34987()) {
            if (componentCallbacksC22654 != null) {
                componentCallbacksC22654.performPictureInPictureModeChanged(z);
                if (z2) {
                    componentCallbacksC22654.mChildFragmentManager.m23123(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23096(boolean z, Configuration configuration) {
        if (z && (this.f30513 instanceof InterfaceC12522)) {
            m23052(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30509.m34987()) {
            if (componentCallbacksC22654 != null) {
                componentCallbacksC22654.performConfigurationChanged(configuration);
                if (z) {
                    componentCallbacksC22654.mChildFragmentManager.m23096(true, configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23095(boolean z) {
        if (z && (this.f30513 instanceof InterfaceC17460)) {
            m23052(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30509.m34987()) {
            if (componentCallbacksC22654 != null) {
                componentCallbacksC22654.performLowMemory();
                if (z) {
                    componentCallbacksC22654.mChildFragmentManager.m23095(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23098(Menu menu, MenuInflater menuInflater) {
        if (this.f30484 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30509.m34987()) {
            if (componentCallbacksC22654 != null && componentCallbacksC22654.isMenuVisible() && componentCallbacksC22654.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(componentCallbacksC22654);
                z = true;
            }
        }
        if (this.f30519 != null) {
            for (int i = 0; i < this.f30519.size(); i++) {
                ComponentCallbacksC22654 componentCallbacksC22655 = (ComponentCallbacksC22654) this.f30519.get(i);
                if (arrayList == null || !arrayList.contains(componentCallbacksC22655)) {
                    componentCallbacksC22655.onDestroyOptionsMenu();
                }
            }
        }
        this.f30519 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m23124(Menu menu) {
        boolean z = false;
        if (this.f30484 < 1) {
            return false;
        }
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30509.m34987()) {
            if (componentCallbacksC22654 != null && componentCallbacksC22654.isMenuVisible() && componentCallbacksC22654.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m23125(MenuItem menuItem) {
        if (this.f30484 < 1) {
            return false;
        }
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30509.m34987()) {
            if (componentCallbacksC22654 != null && componentCallbacksC22654.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23099(MenuItem menuItem) {
        if (this.f30484 < 1) {
            return false;
        }
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30509.m34987()) {
            if (componentCallbacksC22654 != null && componentCallbacksC22654.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23082(Menu menu) {
        if (this.f30484 < 1) {
            return;
        }
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30509.m34987()) {
            if (componentCallbacksC22654 != null) {
                componentCallbacksC22654.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m23129(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (componentCallbacksC22654 != null) {
            if (!componentCallbacksC22654.equals(this.f30509.m34997(componentCallbacksC22654.mWho)) || (componentCallbacksC22654.mHost != null && componentCallbacksC22654.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + componentCallbacksC22654 + " is not an active fragment of FragmentManager " + this);
            }
        }
        ComponentCallbacksC22654 componentCallbacksC22655 = this.f30508;
        this.f30508 = componentCallbacksC22654;
        m23068(componentCallbacksC22655);
        m23068(this.f30508);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m23068(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (componentCallbacksC22654 != null) {
            if (componentCallbacksC22654.equals(this.f30509.m34997(componentCallbacksC22654.mWho))) {
                componentCallbacksC22654.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m23104() {
        m23059();
        m23068(this.f30508);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23091(ComponentCallbacksC22654 componentCallbacksC22654, EnumC9414 enumC9414) {
        if (!componentCallbacksC22654.equals(this.f30509.m34997(componentCallbacksC22654.mWho)) || (componentCallbacksC22654.mHost != null && componentCallbacksC22654.mFragmentManager != this)) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC22654 + " is not an active fragment of FragmentManager " + this);
        }
        componentCallbacksC22654.mMaxState = enumC9414;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C0075 m23108() {
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f30501;
        if (componentCallbacksC22654 != null) {
            return componentCallbacksC22654.mFragmentManager.m23108();
        }
        return this.f30514;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC17091 m23069() {
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f30501;
        if (componentCallbacksC22654 != null) {
            return componentCallbacksC22654.mFragmentManager.m23069();
        }
        return this.f30505;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10660 m23130() {
        return this.f30498;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m23140(ComponentCallbacksC22654 componentCallbacksC22654) {
        Iterator it = this.f30510.iterator();
        while (it.hasNext()) {
            ((InterfaceC0426) it.next()).mo2217(componentCallbacksC22654);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m23116() {
        for (ComponentCallbacksC22654 componentCallbacksC22654 : this.f30509.m34990()) {
            if (componentCallbacksC22654 != null) {
                componentCallbacksC22654.onHiddenChanged(componentCallbacksC22654.isHidden());
                componentCallbacksC22654.mChildFragmentManager.m23116();
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m23066(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (componentCallbacksC22654.mHasMenu && componentCallbacksC22654.mMenuVisible) {
            return true;
        }
        boolean zM23066 = false;
        for (ComponentCallbacksC22654 componentCallbacksC22655 : componentCallbacksC22654.mChildFragmentManager.f30509.m34990()) {
            if (componentCallbacksC22655 != null) {
                zM23066 = m23066(componentCallbacksC22655);
            }
            if (zM23066) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m23075(ComponentCallbacksC22654 componentCallbacksC22654) {
        if (componentCallbacksC22654.mAdded && m23066(componentCallbacksC22654)) {
            this.f30496 = true;
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private boolean m23050() {
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f30501;
        if (componentCallbacksC22654 == null) {
            return true;
        }
        return componentCallbacksC22654.isAdded() && this.f30501.getParentFragmentManager().m23050();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LayoutInflater.Factory2 m23137() {
        return this.f30515;
    }
}
