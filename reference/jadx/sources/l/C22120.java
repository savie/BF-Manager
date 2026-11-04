package l;

import com.alipay.sdk.m.y.l;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4YV */
/* JADX INFO: loaded from: classes.dex */
public final class C22120 extends AbstractC4573 implements InterfaceC1700, InterfaceC15869 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC3191 f71289;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f71290;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f71291;

    public final String toString() {
        StringBuilder sbM3018 = C0703.m3018(128, "BackStackEntry{");
        sbM3018.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f71290 >= 0) {
            sbM3018.append(" #");
            sbM3018.append(this.f71290);
        }
        if (this.f16261 != null) {
            sbM3018.append(" ");
            sbM3018.append(this.f16261);
        }
        sbM3018.append(l.d);
        return sbM3018.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50075(String str, PrintWriter printWriter, boolean z) {
        String str2;
        ArrayList arrayList = this.f16266;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f16261);
            printWriter.print(" mIndex=");
            printWriter.print(this.f71290);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f71291);
            if (this.f16262 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f16262));
            }
            if (this.f16267 != 0 || this.f16264 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16267));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16264));
            }
            if (this.f16276 != 0 || this.f16270 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16276));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16270));
            }
            if (this.f16272 != 0 || this.f16268 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f16272));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f16268);
            }
            if (this.f16265 != 0 || this.f16274 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f16265));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f16274);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C13631 c13631 = (C13631) arrayList.get(i);
            switch (c13631.f43284) {
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
                    str2 = "cmd=" + c13631.f43284;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c13631.f43289);
            if (z) {
                if (c13631.f43286 != 0 || c13631.f43291 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c13631.f43286));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c13631.f43291));
                }
                if (c13631.f43285 != 0 || c13631.f43283 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c13631.f43285));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c13631.f43283));
                }
            }
        }
    }

    public C22120(AbstractC3191 abstractC3191) {
        abstractC3191.m10476();
        if (abstractC3191.m10504() != null) {
            abstractC3191.m10504().m42754().getClassLoader();
        }
        this.f16266 = new ArrayList();
        this.f16273 = true;
        this.f16271 = false;
        this.f71290 = -1;
        this.f71289 = abstractC3191;
    }

    @Override // l.InterfaceC1700
    public final int getId() {
        return this.f71290;
    }

    @Override // l.AbstractC4573
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC4573 mo14360(ComponentCallbacksC11612 componentCallbacksC11612) {
        AbstractC3191 abstractC3191 = componentCallbacksC11612.mFragmentManager;
        if (abstractC3191 != null && abstractC3191 != this.f71289) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC11612.toString() + " is already attached to a FragmentManager.");
        }
        m14358(new C13631(componentCallbacksC11612, 3));
        return this;
    }

    @Override // l.AbstractC4573
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4573 mo14348(AbstractC9051 abstractC9051) {
        AbstractC3191 abstractC3191 = abstractC9051.mFragmentManager;
        if (abstractC3191 != null && abstractC3191 != this.f71289) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + abstractC9051.toString() + " is already attached to a FragmentManager.");
        }
        m14358(new C13631(abstractC9051, 4));
        return this;
    }

    @Override // l.AbstractC4573
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC4573 mo14364(AbstractC9051 abstractC9051) {
        AbstractC3191 abstractC3191 = abstractC9051.mFragmentManager;
        if (abstractC3191 != null && abstractC3191 != this.f71289) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + abstractC9051.toString() + " is already attached to a FragmentManager.");
        }
        m14358(new C13631(abstractC9051, 5));
        return this;
    }

    @Override // l.AbstractC4573
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC4573 mo14365(ComponentCallbacksC11612 componentCallbacksC11612) {
        AbstractC3191 abstractC3191 = componentCallbacksC11612.mFragmentManager;
        if (abstractC3191 != null && abstractC3191 != this.f71289) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC11612.toString() + " is already attached to a FragmentManager.");
        }
        m14358(new C13631(componentCallbacksC11612, 6));
        return this;
    }

    @Override // l.AbstractC4573
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4573 mo14350(AbstractC24349 abstractC24349) {
        AbstractC3191 abstractC3191 = abstractC24349.mFragmentManager;
        if (abstractC3191 != null && abstractC3191 != this.f71289) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractC24349.toString() + " is already attached to a FragmentManager.");
        }
        m14358(new C13631(abstractC24349, 8));
        return this;
    }

    @Override // l.AbstractC4573
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4573 mo14349(ComponentCallbacksC11612 componentCallbacksC11612, EnumC2619 enumC2619) {
        AbstractC3191 abstractC3191 = componentCallbacksC11612.mFragmentManager;
        AbstractC3191 abstractC3192 = this.f71289;
        if (abstractC3191 != abstractC3192) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + abstractC3192);
        }
        if (enumC2619 == EnumC2619.INITIALIZED && componentCallbacksC11612.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC2619 + " after the Fragment has been created");
        }
        if (enumC2619 != EnumC2619.DESTROYED) {
            C13631 c13631 = new C13631();
            c13631.f43284 = 10;
            c13631.f43289 = componentCallbacksC11612;
            c13631.f43288 = false;
            c13631.f43287 = componentCallbacksC11612.mMaxState;
            c13631.f43290 = enumC2619;
            m14358(c13631);
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC2619 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50074(int i) {
        ArrayList arrayList = this.f16266;
        if (this.f16263) {
            if (AbstractC3191.m10427(2)) {
                toString();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13631 c13631 = (C13631) arrayList.get(i2);
                ComponentCallbacksC11612 componentCallbacksC11612 = c13631.f43289;
                if (componentCallbacksC11612 != null) {
                    componentCallbacksC11612.mBackStackNesting += i;
                    if (AbstractC3191.m10427(2)) {
                        C17359.toString(c13631.f43289);
                        int i3 = c13631.f43289.mBackStackNesting;
                    }
                }
            }
        }
    }

    @Override // l.AbstractC4573
    /* JADX INFO: renamed from: ۙ */
    public final void mo14354(int i, ComponentCallbacksC11612 componentCallbacksC11612, String str, int i2) {
        String str2 = componentCallbacksC11612.mPreviousWho;
        if (str2 != null) {
            C9047.m24149(componentCallbacksC11612, str2);
        }
        Class<?> cls = componentCallbacksC11612.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC11612.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(componentCallbacksC11612);
                sb.append(": was ");
                throw new IllegalStateException(C12669.m31438(sb, componentCallbacksC11612.mTag, " now ", str));
            }
            componentCallbacksC11612.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC11612 + " with tag " + str + " to container view with no id");
            }
            int i3 = componentCallbacksC11612.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC11612 + ": was " + componentCallbacksC11612.mFragmentId + " now " + i);
            }
            componentCallbacksC11612.mFragmentId = i;
            componentCallbacksC11612.mContainerId = i;
        }
        m14358(new C13631(componentCallbacksC11612, i2));
        componentCallbacksC11612.mFragmentManager = this.f71289;
    }

    @Override // l.AbstractC4573
    /* JADX INFO: renamed from: ᩷ */
    public final int mo14363() {
        return m50073(false);
    }

    @Override // l.AbstractC4573
    /* JADX INFO: renamed from: ۤ */
    public final int mo14359() {
        return m50073(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50073(boolean z) {
        if (this.f71291) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC3191.m10427(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new C23219());
            m50075(EnumC7687.f25319, printWriter, true);
            printWriter.close();
        }
        this.f71291 = true;
        boolean z2 = this.f16263;
        AbstractC3191 abstractC3191 = this.f71289;
        if (z2) {
            this.f71290 = abstractC3191.m10439();
        } else {
            this.f71290 = -1;
        }
        abstractC3191.m10454((InterfaceC15869) this, z);
        return this.f71290;
    }

    @Override // l.InterfaceC15869
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo37837(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC3191.m10427(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f16263) {
            return true;
        }
        AbstractC3191 abstractC3191 = this.f71289;
        if (abstractC3191.f10391 == null) {
            abstractC3191.f10391 = new ArrayList();
        }
        abstractC3191.f10391.add(this);
        return true;
    }

    @Override // l.AbstractC4573
    /* JADX INFO: renamed from: ᩸ */
    public final void mo14366() {
        if (this.f16263) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f16273 = false;
        this.f71289.m10457(this, false);
    }
}
