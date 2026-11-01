package l;

import com.alipay.sdk.m.y.l;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4YV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2813 extends AbstractC11447 implements InterfaceC23005, InterfaceC8188 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f10689;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC8894 f10690;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f10691;

    public final String toString() {
        StringBuilder sbM40152 = C17214.m40152(128, "BackStackEntry{");
        sbM40152.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f10689 >= 0) {
            sbM40152.append(" #");
            sbM40152.append(this.f10689);
        }
        if (this.f38512 != null) {
            sbM40152.append(" ");
            sbM40152.append(this.f38512);
        }
        sbM40152.append(l.d);
        return sbM40152.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8556(String str, PrintWriter printWriter, boolean z) {
        String str2;
        ArrayList arrayList = this.f38515;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f38512);
            printWriter.print(" mIndex=");
            printWriter.print(this.f10689);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f10691);
            if (this.f38516 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f38516));
            }
            if (this.f38510 != 0 || this.f38518 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f38510));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f38518));
            }
            if (this.f38525 != 0 || this.f38520 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f38525));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f38520));
            }
            if (this.f38514 != 0 || this.f38524 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f38514));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f38524);
            }
            if (this.f38517 != 0 || this.f38511 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f38517));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f38511);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C13564 c13564 = (C13564) arrayList.get(i);
            switch (c13564.f44745) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c13564.f44745;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c13564.f44746);
            if (z) {
                if (c13564.f44747 != 0 || c13564.f44743 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c13564.f44747));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c13564.f44743));
                }
                if (c13564.f44748 != 0 || c13564.f44744 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c13564.f44748));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c13564.f44744));
                }
            }
        }
    }

    public C2813(AbstractC8894 abstractC8894) {
        abstractC8894.m23108();
        if (abstractC8894.m23106() != null) {
            abstractC8894.m23106().m38450().getClassLoader();
        }
        this.f38515 = new ArrayList();
        this.f38519 = true;
        this.f38523 = false;
        this.f10689 = -1;
        this.f10690 = abstractC8894;
    }

    @Override // l.InterfaceC23005
    public final int getId() {
        return this.f10689;
    }

    @Override // l.AbstractC11447
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC11447 mo8559(ComponentCallbacksC22654 componentCallbacksC22654) {
        AbstractC8894 abstractC8894 = componentCallbacksC22654.mFragmentManager;
        if (abstractC8894 != null && abstractC8894 != this.f10690) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC22654.toString() + " is already attached to a FragmentManager.");
        }
        m28563(new C13564(componentCallbacksC22654, 3));
        return this;
    }

    @Override // l.AbstractC11447
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11447 mo8552(AbstractC22611 abstractC22611) {
        AbstractC8894 abstractC8894 = abstractC22611.mFragmentManager;
        if (abstractC8894 != null && abstractC8894 != this.f10690) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + abstractC22611.toString() + " is already attached to a FragmentManager.");
        }
        m28563(new C13564(abstractC22611, 4));
        return this;
    }

    @Override // l.AbstractC11447
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC11447 mo8561(AbstractC22611 abstractC22611) {
        AbstractC8894 abstractC8894 = abstractC22611.mFragmentManager;
        if (abstractC8894 != null && abstractC8894 != this.f10690) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + abstractC22611.toString() + " is already attached to a FragmentManager.");
        }
        m28563(new C13564(abstractC22611, 5));
        return this;
    }

    @Override // l.AbstractC11447
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC11447 mo8562(ComponentCallbacksC22654 componentCallbacksC22654) {
        AbstractC8894 abstractC8894 = componentCallbacksC22654.mFragmentManager;
        if (abstractC8894 != null && abstractC8894 != this.f10690) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC22654.toString() + " is already attached to a FragmentManager.");
        }
        m28563(new C13564(componentCallbacksC22654, 6));
        return this;
    }

    @Override // l.AbstractC11447
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11447 mo8551(AbstractC3340 abstractC3340) {
        AbstractC8894 abstractC8894 = abstractC3340.mFragmentManager;
        if (abstractC8894 != null && abstractC8894 != this.f10690) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractC3340.toString() + " is already attached to a FragmentManager.");
        }
        m28563(new C13564(abstractC3340, 8));
        return this;
    }

    @Override // l.AbstractC11447
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11447 mo8553(ComponentCallbacksC22654 componentCallbacksC22654, EnumC9414 enumC9414) {
        AbstractC8894 abstractC8894 = componentCallbacksC22654.mFragmentManager;
        AbstractC8894 abstractC8895 = this.f10690;
        if (abstractC8894 != abstractC8895) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + abstractC8895);
        }
        if (enumC9414 == EnumC9414.INITIALIZED && componentCallbacksC22654.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC9414 + " after the Fragment has been created");
        }
        if (enumC9414 != EnumC9414.DESTROYED) {
            C13564 c13564 = new C13564();
            c13564.f44745 = 10;
            c13564.f44746 = componentCallbacksC22654;
            c13564.f44750 = false;
            c13564.f44742 = componentCallbacksC22654.mMaxState;
            c13564.f44749 = enumC9414;
            m28563(c13564);
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC9414 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8554(int i) {
        ArrayList arrayList = this.f38515;
        if (this.f38513) {
            if (AbstractC8894.m23060(2)) {
                toString();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13564 c13564 = (C13564) arrayList.get(i2);
                ComponentCallbacksC22654 componentCallbacksC22654 = c13564.f44746;
                if (componentCallbacksC22654 != null) {
                    componentCallbacksC22654.mBackStackNesting += i;
                    if (AbstractC8894.m23060(2)) {
                        C13638.toString(c13564.f44746);
                        int i3 = c13564.f44746.mBackStackNesting;
                    }
                }
            }
        }
    }

    @Override // l.AbstractC11447
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8555(int i, ComponentCallbacksC22654 componentCallbacksC22654, String str, int i2) {
        String str2 = componentCallbacksC22654.mPreviousWho;
        if (str2 != null) {
            C1568.m5363(componentCallbacksC22654, str2);
        }
        Class<?> cls = componentCallbacksC22654.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC22654.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(componentCallbacksC22654);
                sb.append(": was ");
                throw new IllegalStateException(C1694.m5622(sb, componentCallbacksC22654.mTag, " now ", str));
            }
            componentCallbacksC22654.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC22654 + " with tag " + str + " to container view with no id");
            }
            int i3 = componentCallbacksC22654.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC22654 + ": was " + componentCallbacksC22654.mFragmentId + " now " + i);
            }
            componentCallbacksC22654.mFragmentId = i;
            componentCallbacksC22654.mContainerId = i;
        }
        m28563(new C13564(componentCallbacksC22654, i2));
        componentCallbacksC22654.mFragmentManager = this.f10690;
    }

    @Override // l.AbstractC11447
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo8560() {
        return m8550(false);
    }

    @Override // l.AbstractC11447
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo8558() {
        return m8550(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8550(boolean z) {
        if (this.f10691) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC8894.m23060(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new C19208());
            m8556(EnumC19730.f63352, printWriter, true);
            printWriter.close();
        }
        this.f10691 = true;
        boolean z2 = this.f38513;
        AbstractC8894 abstractC8894 = this.f10690;
        if (z2) {
            this.f10689 = abstractC8894.m23076();
        } else {
            this.f10689 = -1;
        }
        abstractC8894.m23085((InterfaceC8188) this, z);
        return this.f10689;
    }

    @Override // l.InterfaceC8188
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8557(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC8894.m23060(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f38513) {
            return true;
        }
        AbstractC8894 abstractC8894 = this.f10690;
        if (abstractC8894.f30490 == null) {
            abstractC8894.f30490 = new ArrayList();
        }
        abstractC8894.f30490.add(this);
        return true;
    }

    @Override // l.AbstractC11447
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo8549() {
        if (this.f38513) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f38519 = false;
        this.f10690.m23084(this, false);
    }
}
