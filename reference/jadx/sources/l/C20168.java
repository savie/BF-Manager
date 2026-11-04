package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ᩴ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 596F */
/* JADX INFO: loaded from: classes5.dex */
public final class C20168 extends AbstractC8585 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC2619 f64776;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3920 f64777;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f64778;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f64779;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C7441 f64780;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f64781;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final WeakReference f64782;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f64783;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f64784;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46395(EnumC9330 enumC9330) {
        C15243.m36590(enumC9330, "event");
        m46390("handleLifecycleEvent");
        m46393(enumC9330.m24584());
    }

    @Override // l.AbstractC8585
    /* JADX INFO: renamed from: ۙ */
    public final void mo23077(InterfaceC22406 interfaceC22406) {
        InterfaceC11217 interfaceC11217;
        C15243.m36590(interfaceC22406, "observer");
        m46390("addObserver");
        EnumC2619 enumC2619 = this.f64776;
        EnumC2619 enumC26110 = EnumC2619.DESTROYED;
        if (enumC2619 != enumC26110) {
            enumC26110 = EnumC2619.INITIALIZED;
        }
        C23152 c23152 = new C23152(interfaceC22406, enumC26110);
        if (((C23152) this.f64780.mo20394(interfaceC22406, c23152)) == null && (interfaceC11217 = (InterfaceC11217) this.f64782.get()) != null) {
            boolean z = this.f64783 != 0 || this.f64784;
            EnumC2619 enumC2619M46391 = m46391(interfaceC22406);
            this.f64783++;
            while (c23152.m52070().compareTo(enumC2619M46391) < 0 && this.f64780.m20395(interfaceC22406)) {
                EnumC2619 enumC2619M52070 = c23152.m52070();
                ArrayList arrayList = this.f64778;
                arrayList.add(enumC2619M52070);
                C10076 c10076 = EnumC9330.f30332;
                EnumC2619 enumC2619M52071 = c23152.m52070();
                c10076.getClass();
                EnumC9330 enumC9330M26040 = C10076.m26040(enumC2619M52071);
                if (enumC9330M26040 == null) {
                    throw new IllegalStateException("no event up from " + c23152.m52070());
                }
                c23152.m52071(interfaceC11217, enumC9330M26040);
                arrayList.remove(arrayList.size() - 1);
                enumC2619M46391 = m46391(interfaceC22406);
            }
            if (!z) {
                m46392();
            }
            this.f64783--;
        }
    }

    @Override // l.AbstractC8585
    /* JADX INFO: renamed from: ᩷ */
    public final void mo23078(InterfaceC22406 interfaceC22406) {
        C15243.m36590(interfaceC22406, "observer");
        m46390("removeObserver");
        this.f64780.remove(interfaceC22406);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46394(EnumC2619 enumC2619) {
        C15243.m36590(enumC2619, "state");
        m46390("setCurrentState");
        m46393(enumC2619);
    }

    public C20168(InterfaceC11217 interfaceC11217) {
        new AtomicReference(null);
        this.f64779 = true;
        this.f64780 = new C7441();
        EnumC2619 enumC2619 = EnumC2619.INITIALIZED;
        this.f64776 = enumC2619;
        this.f64778 = new ArrayList();
        this.f64782 = new WeakReference(interfaceC11217);
        this.f64777 = C0191.m1548(enumC2619);
    }

    @Override // l.AbstractC8585
    /* JADX INFO: renamed from: ۙ */
    public final EnumC2619 mo23076() {
        return this.f64776;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m46393(EnumC2619 enumC2619) {
        if (this.f64776 == enumC2619) {
            return;
        }
        InterfaceC11217 interfaceC11217 = (InterfaceC11217) this.f64782.get();
        EnumC2619 enumC26110 = this.f64776;
        C15243.m36590(enumC26110, "current");
        C15243.m36590(enumC2619, "next");
        if (enumC26110 == EnumC2619.INITIALIZED && enumC2619 == EnumC2619.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + EnumC2619.CREATED + "' to be moved to '" + enumC2619 + "' in component " + interfaceC11217).toString());
        }
        EnumC2619 enumC26111 = EnumC2619.DESTROYED;
        if (enumC26110 == enumC26111 && enumC26110 != enumC2619) {
            throw new IllegalStateException(("State is '" + enumC26111 + "' and cannot be moved to `" + enumC2619 + "` in component " + interfaceC11217).toString());
        }
        this.f64776 = enumC2619;
        if (this.f64784 || this.f64783 != 0) {
            this.f64781 = true;
            return;
        }
        this.f64784 = true;
        m46392();
        this.f64784 = false;
        if (this.f64776 == enumC26111) {
            this.f64780 = new C7441();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private final EnumC2619 m46391(InterfaceC22406 interfaceC22406) {
        C23152 c23152;
        Map.Entry entryM20393 = this.f64780.m20393(interfaceC22406);
        EnumC2619 enumC2619M52070 = (entryM20393 == null || (c23152 = (C23152) entryM20393.getValue()) == null) ? null : c23152.m52070();
        ArrayList arrayList = this.f64778;
        EnumC2619 enumC2619 = arrayList.isEmpty() ? null : (EnumC2619) j$$ExternalSyntheticOutline0.m(arrayList, 1);
        EnumC2619 enumC26110 = this.f64776;
        C15243.m36590(enumC26110, "state1");
        if (enumC2619M52070 == null || enumC2619M52070.compareTo(enumC26110) >= 0) {
            enumC2619M52070 = enumC26110;
        }
        return (enumC2619 == null || enumC2619.compareTo(enumC2619M52070) >= 0) ? enumC2619M52070 : enumC2619;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m46392() {
        InterfaceC11217 interfaceC11217 = (InterfaceC11217) this.f64782.get();
        if (interfaceC11217 != null) {
            while (this.f64780.size() != 0) {
                Map.Entry entryM36207 = this.f64780.m36207();
                C15243.m36586(entryM36207);
                EnumC2619 enumC2619M52070 = ((C23152) entryM36207.getValue()).m52070();
                Map.Entry entryM36208 = this.f64780.m36208();
                C15243.m36586(entryM36208);
                EnumC2619 enumC2619M52071 = ((C23152) entryM36208.getValue()).m52070();
                if (enumC2619M52070 == enumC2619M52071 && this.f64776 == enumC2619M52071) {
                    break;
                }
                this.f64781 = false;
                EnumC2619 enumC2619 = this.f64776;
                Map.Entry entryM36209 = this.f64780.m36207();
                C15243.m36586(entryM36209);
                int iCompareTo = enumC2619.compareTo(((C23152) entryM36209.getValue()).m52070());
                ArrayList arrayList = this.f64778;
                if (iCompareTo < 0) {
                    Iterator itDescendingIterator = this.f64780.descendingIterator();
                    while (itDescendingIterator.hasNext() && !this.f64781) {
                        Map.Entry entry = (Map.Entry) itDescendingIterator.next();
                        C15243.m36586(entry);
                        InterfaceC22406 interfaceC22406 = (InterfaceC22406) entry.getKey();
                        C23152 c23152 = (C23152) entry.getValue();
                        while (c23152.m52070().compareTo(this.f64776) > 0 && !this.f64781 && this.f64780.m20395(interfaceC22406)) {
                            C10076 c10076 = EnumC9330.f30332;
                            EnumC2619 enumC2619M52072 = c23152.m52070();
                            c10076.getClass();
                            EnumC9330 enumC9330M26039 = C10076.m26039(enumC2619M52072);
                            if (enumC9330M26039 != null) {
                                arrayList.add(enumC9330M26039.m24584());
                                c23152.m52071(interfaceC11217, enumC9330M26039);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                throw new IllegalStateException("no event down from " + c23152.m52070());
                            }
                        }
                    }
                }
                Map.Entry entryM362010 = this.f64780.m36208();
                if (!this.f64781 && entryM362010 != null && this.f64776.compareTo(((C23152) entryM362010.getValue()).m52070()) > 0) {
                    C10578 c10578M36206 = this.f64780.m36206();
                    while (c10578M36206.hasNext() && !this.f64781) {
                        Map.Entry entry2 = (Map.Entry) c10578M36206.next();
                        InterfaceC22406 interfaceC22407 = (InterfaceC22406) entry2.getKey();
                        C23152 c23153 = (C23152) entry2.getValue();
                        while (c23153.m52070().compareTo(this.f64776) < 0 && !this.f64781 && this.f64780.m20395(interfaceC22407)) {
                            arrayList.add(c23153.m52070());
                            C10076 c10077 = EnumC9330.f30332;
                            EnumC2619 enumC2619M52073 = c23153.m52070();
                            c10077.getClass();
                            EnumC9330 enumC9330M26040 = C10076.m26040(enumC2619M52073);
                            if (enumC9330M26040 == null) {
                                throw new IllegalStateException("no event up from " + c23153.m52070());
                            }
                            c23153.m52071(interfaceC11217, enumC9330M26040);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
            this.f64781 = false;
            this.f64777.setValue(this.f64776);
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m46390(String str) {
        if (this.f64779 && !C1475.m5264().m5266()) {
            throw new IllegalStateException(C14442.m34865("Method ", str, " must be called on the main thread").toString());
        }
    }
}
