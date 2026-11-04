package l;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4DX */
/* JADX INFO: loaded from: classes4.dex */
public final class C19076 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f61768;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13306 f61769;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC19887 f61770;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f61771;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f61772;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C19273 f61773;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14600 f61774;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C0431 f61775;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C7208 f61776;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18330 f61777;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC2668 f61778;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC6595 f61779;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f61780;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f61781;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized C14600 m44182() {
        return this.f61774;
    }

    public C19076(C19273 c19273, C13306 c13306, InterfaceC6595 interfaceC6595, AbstractC19887 abstractC19887, Object obj) {
        this.f61773 = c19273;
        this.f61769 = c13306;
        this.f61779 = interfaceC6595;
        this.f61770 = abstractC19887;
        this.f61775 = new C0431(c13306, AbstractC4906.f17137.mo15054(c19273), interfaceC6595, abstractC19887);
        this.f61771 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2668 m44177(C24363 c24363, C4688 c4688, boolean z) {
        try {
            InterfaceC2668 interfaceC2668M35241 = m44175(c4688.m14561(), c4688.m14559(), c4688.m14552(), 0, c24363.m54452(), z).m35241(c24363, c4688, this);
            synchronized (this.f61773) {
                this.f61778 = interfaceC2668M35241;
            }
            return interfaceC2668M35241;
        } catch (IOException e) {
            throw new C21314(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14600 m44175(int i, int i2, int i3, int i4, boolean z, boolean z2) throws Throwable {
        while (true) {
            C14600 c14600M44174 = m44174(i, i2, i3, i4, z);
            synchronized (this.f61773) {
                if (c14600M44174.f46000 == 0 && !c14600M44174.m35247()) {
                    return c14600M44174;
                }
                if (c14600M44174.m35246(z2)) {
                    return c14600M44174;
                }
                m44185();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14600 m44174(int i, int i2, int i3, int i4, boolean z) throws Throwable {
        C14600 c14600;
        Socket socketMo15052;
        Socket socketM44173;
        C7208 c7208;
        C7208 c7208M42786;
        C14600 c14601;
        boolean z2;
        boolean z3;
        C18330 c18330;
        synchronized (this.f61773) {
            if (this.f61772) {
                throw new IllegalStateException("released");
            }
            if (this.f61778 != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f61780) {
                throw new IOException("Canceled");
            }
            c14600 = this.f61774;
            socketMo15052 = null;
            socketM44173 = (c14600 == null || !c14600.f45989) ? null : m44173(false, false, true);
            C14600 c14602 = this.f61774;
            if (c14602 != null) {
                c14600 = null;
            } else {
                c14602 = null;
            }
            if (!this.f61781) {
                c14600 = null;
            }
            if (c14602 == null) {
                AbstractC4906.f17137.mo15053(this.f61773, this.f61769, this, null);
                c14601 = this.f61774;
                if (c14601 != null) {
                    z2 = true;
                    c7208M42786 = null;
                } else {
                    c7208 = this.f61776;
                }
            } else {
                c7208 = null;
            }
            c7208M42786 = c7208;
            c14601 = c14602;
            z2 = false;
        }
        C19822.m45603(socketM44173);
        if (c14600 != null) {
            this.f61770.getClass();
        }
        if (z2) {
            this.f61770.getClass();
        }
        if (c14601 != null) {
            this.f61776 = this.f61774.m35250();
            return c14601;
        }
        if (c7208M42786 != null || ((c18330 = this.f61777) != null && c18330.m42787())) {
            z3 = false;
        } else {
            this.f61777 = this.f61775.m2236();
            z3 = true;
        }
        synchronized (this.f61773) {
            if (this.f61780) {
                throw new IOException("Canceled");
            }
            if (z3) {
                ArrayList arrayListM42785 = this.f61777.m42785();
                int size = arrayListM42785.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C7208 c7209 = (C7208) arrayListM42785.get(i5);
                    AbstractC4906.f17137.mo15053(this.f61773, this.f61769, this, c7209);
                    C14600 c14603 = this.f61774;
                    if (c14603 != null) {
                        this.f61776 = c7209;
                        z2 = true;
                        c14601 = c14603;
                        break;
                    }
                }
            }
            if (!z2) {
                if (c7208M42786 == null) {
                    c7208M42786 = this.f61777.m42786();
                }
                this.f61776 = c7208M42786;
                this.f61768 = 0;
                c14601 = new C14600(this.f61773, c7208M42786);
                m44180(c14601, false);
            }
        }
        if (z2) {
            this.f61770.getClass();
            return c14601;
        }
        c14601.m35243(i, i2, i3, i4, z, this.f61770);
        AbstractC4906.f17137.mo15054(this.f61773).m40751(c14601.m35250());
        synchronized (this.f61773) {
            this.f61781 = true;
            AbstractC4906.f17137.mo15060(this.f61773, c14601);
            if (c14601.m35247()) {
                socketMo15052 = AbstractC4906.f17137.mo15052(this.f61773, this.f61769, this);
                c14601 = this.f61774;
            }
        }
        C19822.m45603(socketMo15052);
        this.f61770.getClass();
        return c14601;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44181(boolean z, InterfaceC2668 interfaceC2668, IOException iOException) {
        C14600 c14600;
        Socket socketM44173;
        boolean z2;
        this.f61770.getClass();
        synchronized (this.f61773) {
            if (interfaceC2668 != this.f61778) {
                throw new IllegalStateException("expected " + this.f61778 + " but was " + interfaceC2668);
            }
            if (!z) {
                this.f61774.f46000++;
            }
            c14600 = this.f61774;
            socketM44173 = m44173(z, false, true);
            if (this.f61774 != null) {
                c14600 = null;
            }
            z2 = this.f61772;
        }
        C19822.m45603(socketM44173);
        if (c14600 != null) {
            this.f61770.getClass();
        }
        if (iOException != null) {
            AbstractC4906.f17137.mo15051(this.f61779, iOException);
            this.f61770.getClass();
        } else if (z2) {
            AbstractC4906.f17137.mo15051(this.f61779, (IOException) null);
            this.f61770.getClass();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC2668 m44186() {
        InterfaceC2668 interfaceC2668;
        synchronized (this.f61773) {
            interfaceC2668 = this.f61778;
        }
        return interfaceC2668;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7208 m44183() {
        return this.f61776;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m44184() {
        C14600 c14600;
        Socket socketM44173;
        synchronized (this.f61773) {
            c14600 = this.f61774;
            socketM44173 = m44173(false, true, false);
            if (this.f61774 != null) {
                c14600 = null;
            }
        }
        C19822.m45603(socketM44173);
        if (c14600 != null) {
            AbstractC4906.f17137.mo15051(this.f61779, (IOException) null);
            this.f61770.getClass();
            this.f61770.getClass();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m44185() {
        C14600 c14600;
        Socket socketM44173;
        synchronized (this.f61773) {
            c14600 = this.f61774;
            socketM44173 = m44173(true, false, false);
            if (this.f61774 != null) {
                c14600 = null;
            }
        }
        C19822.m45603(socketM44173);
        if (c14600 != null) {
            this.f61770.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Socket m44173(boolean z, boolean z2, boolean z3) {
        Socket socketM35248;
        if (z3) {
            this.f61778 = null;
        }
        if (z2) {
            this.f61772 = true;
        }
        C14600 c14600 = this.f61774;
        if (c14600 != null) {
            if (z) {
                c14600.f45989 = true;
            }
            if (this.f61778 == null && (this.f61772 || c14600.f45989)) {
                ArrayList arrayList = c14600.f45990;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Reference) arrayList.get(i)).get() == this) {
                        arrayList.remove(i);
                        if (this.f61774.f45990.isEmpty()) {
                            this.f61774.f45992 = System.nanoTime();
                            if (AbstractC4906.f17137.mo15059(this.f61773, this.f61774)) {
                                socketM35248 = this.f61774.m35248();
                            } else {
                                socketM35248 = null;
                            }
                        } else {
                            socketM35248 = null;
                        }
                        this.f61774 = null;
                        return socketM35248;
                    }
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44178() {
        InterfaceC2668 interfaceC2668;
        C14600 c14600;
        synchronized (this.f61773) {
            this.f61780 = true;
            interfaceC2668 = this.f61778;
            c14600 = this.f61774;
        }
        if (interfaceC2668 != null) {
            interfaceC2668.cancel();
        } else if (c14600 != null) {
            c14600.m35242();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44179(IOException iOException) {
        C14600 c14600;
        boolean z;
        Socket socketM44173;
        synchronized (this.f61773) {
            c14600 = null;
            if (iOException instanceof C20240) {
                EnumC15874 enumC15874 = ((C20240) iOException).f64945;
                if (enumC15874 == EnumC15874.REFUSED_STREAM) {
                    int i = this.f61768 + 1;
                    this.f61768 = i;
                    if (i > 1) {
                        this.f61776 = null;
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (enumC15874 != EnumC15874.CANCEL) {
                    this.f61776 = null;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                C14600 c14601 = this.f61774;
                if (c14601 == null || (c14601.m35247() && !(iOException instanceof C17366))) {
                    z = false;
                } else {
                    if (this.f61774.f46000 == 0) {
                        C7208 c7208 = this.f61776;
                        if (c7208 != null && iOException != null) {
                            this.f61775.m2234(c7208, iOException);
                        }
                        this.f61776 = null;
                    }
                    z = true;
                }
            }
            C14600 c14602 = this.f61774;
            socketM44173 = m44173(z, false, true);
            if (this.f61774 == null && this.f61781) {
                c14600 = c14602;
            }
        }
        C19822.m45603(socketM44173);
        if (c14600 != null) {
            this.f61770.getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44180(C14600 c14600, boolean z) {
        if (this.f61774 != null) {
            throw new IllegalStateException();
        }
        this.f61774 = c14600;
        this.f61781 = z;
        c14600.f45990.add(new C7889(this, this.f61771));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Socket m44176(C14600 c14600) {
        if (this.f61778 != null || this.f61774.f45990.size() != 1) {
            throw new IllegalStateException();
        }
        Reference reference = (Reference) this.f61774.f45990.get(0);
        Socket socketM44173 = m44173(true, false, false);
        this.f61774 = c14600;
        c14600.f45990.add(reference);
        return socketM44173;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m44187() {
        if (this.f61776 != null) {
            return true;
        }
        C18330 c18330 = this.f61777;
        return (c18330 != null && c18330.m42787()) || this.f61775.m2235();
    }

    public final String toString() {
        C14600 c14600M44182 = m44182();
        return c14600M44182 != null ? c14600M44182.toString() : this.f61769.toString();
    }
}
