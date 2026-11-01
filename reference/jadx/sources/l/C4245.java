package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۘ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4245 extends AbstractC3062 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f15341;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final WeakReference f15342;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15343;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f15344;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f15345;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public EnumC9414 f15346;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f15347;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11172 f15348;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11902(EnumC1651 enumC1651) {
        C13465.m32966(enumC1651, "event");
        m11898("handleLifecycleEvent");
        m11901(enumC1651.m5550());
    }

    @Override // l.AbstractC3062
    /* JADX INFO: renamed from: ۙ */
    public final void mo9171(InterfaceC22591 interfaceC22591) {
        InterfaceC1423 interfaceC1423;
        C13465.m32966(interfaceC22591, "observer");
        m11898("addObserver");
        EnumC9414 enumC9414 = this.f15346;
        EnumC9414 enumC9415 = EnumC9414.DESTROYED;
        if (enumC9414 != enumC9415) {
            enumC9415 = EnumC9414.INITIALIZED;
        }
        C13419 c13419 = new C13419(interfaceC22591, enumC9415);
        if (((C13419) this.f15348.mo28103(interfaceC22591, c13419)) == null && (interfaceC1423 = (InterfaceC1423) this.f15342.get()) != null) {
            boolean z = this.f15343 != 0 || this.f15345;
            EnumC9414 enumC9414M11899 = m11899(interfaceC22591);
            this.f15343++;
            while (c13419.m32907().compareTo(enumC9414M11899) < 0 && this.f15348.m28104(interfaceC22591)) {
                EnumC9414 enumC9414M32907 = c13419.m32907();
                ArrayList arrayList = this.f15341;
                arrayList.add(enumC9414M32907);
                C23525 c23525 = EnumC1651.f6602;
                EnumC9414 enumC9414M32908 = c13419.m32907();
                c23525.getClass();
                EnumC1651 enumC1651M51823 = C23525.m51823(enumC9414M32908);
                if (enumC1651M51823 == null) {
                    throw new IllegalStateException("no event up from " + c13419.m32907());
                }
                c13419.m32908(interfaceC1423, enumC1651M51823);
                arrayList.remove(arrayList.size() - 1);
                enumC9414M11899 = m11899(interfaceC22591);
            }
            if (!z) {
                m11900();
            }
            this.f15343--;
        }
    }

    @Override // l.AbstractC3062
    /* JADX INFO: renamed from: ܰ */
    public final void mo9172(InterfaceC22591 interfaceC22591) {
        C13465.m32966(interfaceC22591, "observer");
        m11898("removeObserver");
        this.f15348.remove(interfaceC22591);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11903(EnumC9414 enumC9414) {
        C13465.m32966(enumC9414, "state");
        m11898("setCurrentState");
        m11901(enumC9414);
    }

    public C4245(InterfaceC1423 interfaceC1423) {
        new AtomicReference();
        this.f15347 = true;
        this.f15348 = new C11172();
        this.f15346 = EnumC9414.INITIALIZED;
        this.f15341 = new ArrayList();
        this.f15342 = new WeakReference(interfaceC1423);
    }

    @Override // l.AbstractC3062
    /* JADX INFO: renamed from: ۙ */
    public final EnumC9414 mo9170() {
        return this.f15346;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final void m11901(EnumC9414 enumC9414) {
        EnumC9414 enumC9415 = this.f15346;
        if (enumC9415 == enumC9414) {
            return;
        }
        if (enumC9415 == EnumC9414.INITIALIZED && enumC9414 == EnumC9414.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f15346 + " in component " + this.f15342.get()).toString());
        }
        this.f15346 = enumC9414;
        if (this.f15345 || this.f15343 != 0) {
            this.f15344 = true;
            return;
        }
        this.f15345 = true;
        m11900();
        this.f15345 = false;
        if (this.f15346 == EnumC9414.DESTROYED) {
            this.f15348 = new C11172();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private final EnumC9414 m11899(InterfaceC22591 interfaceC22591) {
        C13419 c13419;
        Map.Entry entryM28102 = this.f15348.m28102(interfaceC22591);
        EnumC9414 enumC9414M32907 = (entryM28102 == null || (c13419 = (C13419) entryM28102.getValue()) == null) ? null : c13419.m32907();
        ArrayList arrayList = this.f15341;
        EnumC9414 enumC9414 = arrayList.isEmpty() ? null : (EnumC9414) C19084.m43861(arrayList, 1);
        EnumC9414 enumC9415 = this.f15346;
        C13465.m32966(enumC9415, "state1");
        if (enumC9414M32907 == null || enumC9414M32907.compareTo(enumC9415) >= 0) {
            enumC9414M32907 = enumC9415;
        }
        return (enumC9414 == null || enumC9414.compareTo(enumC9414M32907) >= 0) ? enumC9414M32907 : enumC9414;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final void m11900() {
        InterfaceC1423 interfaceC1423 = (InterfaceC1423) this.f15342.get();
        if (interfaceC1423 != null) {
            while (this.f15348.size() != 0) {
                Map.Entry entryM33393 = this.f15348.m33393();
                C13465.m32962(entryM33393);
                EnumC9414 enumC9414M32907 = ((C13419) entryM33393.getValue()).m32907();
                Map.Entry entryM33390 = this.f15348.m33390();
                C13465.m32962(entryM33390);
                EnumC9414 enumC9414M32908 = ((C13419) entryM33390.getValue()).m32907();
                if (enumC9414M32907 == enumC9414M32908 && this.f15346 == enumC9414M32908) {
                    break;
                }
                this.f15344 = false;
                EnumC9414 enumC9414 = this.f15346;
                Map.Entry entryM33394 = this.f15348.m33393();
                C13465.m32962(entryM33394);
                int iCompareTo = enumC9414.compareTo(((C13419) entryM33394.getValue()).m32907());
                ArrayList arrayList = this.f15341;
                if (iCompareTo < 0) {
                    Iterator itDescendingIterator = this.f15348.descendingIterator();
                    while (itDescendingIterator.hasNext() && !this.f15344) {
                        Map.Entry entry = (Map.Entry) itDescendingIterator.next();
                        C13465.m32967(entry, "next()");
                        InterfaceC22591 interfaceC22591 = (InterfaceC22591) entry.getKey();
                        C13419 c13419 = (C13419) entry.getValue();
                        while (c13419.m32907().compareTo(this.f15346) > 0 && !this.f15344 && this.f15348.m28104(interfaceC22591)) {
                            C23525 c23525 = EnumC1651.f6602;
                            EnumC9414 enumC9414M32909 = c13419.m32907();
                            c23525.getClass();
                            EnumC1651 enumC1651M51821 = C23525.m51821(enumC9414M32909);
                            if (enumC1651M51821 != null) {
                                arrayList.add(enumC1651M51821.m5550());
                                c13419.m32908(interfaceC1423, enumC1651M51821);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                throw new IllegalStateException("no event down from " + c13419.m32907());
                            }
                        }
                    }
                }
                Map.Entry entryM33391 = this.f15348.m33390();
                if (!this.f15344 && entryM33391 != null && this.f15346.compareTo(((C13419) entryM33391.getValue()).m32907()) > 0) {
                    C9761 c9761M33392 = this.f15348.m33392();
                    while (c9761M33392.hasNext() && !this.f15344) {
                        Map.Entry entry2 = (Map.Entry) c9761M33392.next();
                        InterfaceC22591 interfaceC22592 = (InterfaceC22591) entry2.getKey();
                        C13419 c134110 = (C13419) entry2.getValue();
                        while (c134110.m32907().compareTo(this.f15346) < 0 && !this.f15344 && this.f15348.m28104(interfaceC22592)) {
                            arrayList.add(c134110.m32907());
                            C23525 c23526 = EnumC1651.f6602;
                            EnumC9414 enumC9414M329010 = c134110.m32907();
                            c23526.getClass();
                            EnumC1651 enumC1651M51823 = C23525.m51823(enumC9414M329010);
                            if (enumC1651M51823 == null) {
                                throw new IllegalStateException("no event up from " + c134110.m32907());
                            }
                            c134110.m32908(interfaceC1423, enumC1651M51823);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
            this.f15344 = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m11898(String str) {
        if (this.f15347 && !C16816.m39456().m39458()) {
            throw new IllegalStateException(C16523.m38890("Method ", str, " must be called on the main thread").toString());
        }
    }
}
