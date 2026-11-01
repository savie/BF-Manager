package l;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L4DX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15009 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22906 f48943;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f48944;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f48945;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16328 f48946;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC7953 f48947;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f48948;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f48949;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC0327 f48950;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11617 f48951;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C8608 f48952;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6541 f48953;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3718 f48954;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C0896 f48955;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f48956;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized C0896 m36003() {
        return this.f48955;
    }

    public C15009(C22906 c22906, C16328 c16328, InterfaceC11617 interfaceC11617, AbstractC0327 abstractC0327, Object obj) {
        this.f48943 = c22906;
        this.f48946 = c16328;
        this.f48951 = interfaceC11617;
        this.f48950 = abstractC0327;
        this.f48953 = new C6541(c16328, AbstractC7196.f24003.mo19136(c22906), interfaceC11617, abstractC0327);
        this.f48949 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7953 m35997(C5079 c5079, C7247 c7247, boolean z) {
        try {
            InterfaceC7953 interfaceC7953M3577 = m35993(c7247.m19375(), c7247.m19376(), c7247.m19368(), 0, c5079.m14164(), z).m3577(c5079, c7247, this);
            synchronized (this.f48943) {
                this.f48947 = interfaceC7953M3577;
            }
            return interfaceC7953M3577;
        } catch (IOException e) {
            throw new C12892(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0896 m35993(int i, int i2, int i3, int i4, boolean z, boolean z2) throws Throwable {
        while (true) {
            C0896 c0896M35992 = m35992(i, i2, i3, i4, z);
            synchronized (this.f48943) {
                if (c0896M35992.f3615 == 0 && !c0896M35992.m3586()) {
                    return c0896M35992;
                }
                if (c0896M35992.m3584(z2)) {
                    return c0896M35992;
                }
                m36002();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0896 m35992(int i, int i2, int i3, int i4, boolean z) throws Throwable {
        C0896 c0896;
        Socket socketMo19134;
        Socket socketM35991;
        C8608 c8608;
        C8608 c8608M10885;
        C0896 c0897;
        boolean z2;
        boolean z3;
        C3718 c3718;
        synchronized (this.f48943) {
            if (this.f48948) {
                throw new IllegalStateException("released");
            }
            if (this.f48947 != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f48944) {
                throw new IOException("Canceled");
            }
            c0896 = this.f48955;
            socketMo19134 = null;
            socketM35991 = (c0896 == null || !c0896.f3611) ? null : m35991(false, false, true);
            C0896 c0898 = this.f48955;
            if (c0898 != null) {
                c0896 = null;
            } else {
                c0898 = null;
            }
            if (!this.f48956) {
                c0896 = null;
            }
            if (c0898 == null) {
                AbstractC7196.f24003.mo19135(this.f48943, this.f48946, this, null);
                c0897 = this.f48955;
                if (c0897 != null) {
                    z2 = true;
                    c8608M10885 = null;
                } else {
                    c8608 = this.f48952;
                }
            } else {
                c8608 = null;
            }
            c8608M10885 = c8608;
            c0897 = c0898;
            z2 = false;
        }
        C0140.m1233(socketM35991);
        if (c0896 != null) {
            this.f48950.getClass();
        }
        if (z2) {
            this.f48950.getClass();
        }
        if (c0897 != null) {
            this.f48952 = this.f48955.m3576();
            return c0897;
        }
        if (c8608M10885 != null || ((c3718 = this.f48954) != null && c3718.m10886())) {
            z3 = false;
        } else {
            this.f48954 = this.f48953.m17774();
            z3 = true;
        }
        synchronized (this.f48943) {
            if (this.f48944) {
                throw new IOException("Canceled");
            }
            if (z3) {
                ArrayList arrayListM10884 = this.f48954.m10884();
                int size = arrayListM10884.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C8608 c8609 = (C8608) arrayListM10884.get(i5);
                    AbstractC7196.f24003.mo19135(this.f48943, this.f48946, this, c8609);
                    C0896 c0899 = this.f48955;
                    if (c0899 != null) {
                        this.f48952 = c8609;
                        z2 = true;
                        c0897 = c0899;
                        break;
                    }
                }
            }
            if (!z2) {
                if (c8608M10885 == null) {
                    c8608M10885 = this.f48954.m10885();
                }
                this.f48952 = c8608M10885;
                this.f48945 = 0;
                c0897 = new C0896(this.f48943, c8608M10885);
                m36000(c0897, false);
            }
        }
        if (z2) {
            this.f48950.getClass();
            return c0897;
        }
        c0897.m3579(i, i2, i3, i4, z, this.f48950);
        AbstractC7196.f24003.mo19136(this.f48943).m50617(c0897.m3576());
        synchronized (this.f48943) {
            this.f48956 = true;
            AbstractC7196.f24003.mo19142(this.f48943, c0897);
            if (c0897.m3586()) {
                socketMo19134 = AbstractC7196.f24003.mo19134(this.f48943, this.f48946, this);
                c0897 = this.f48955;
            }
        }
        C0140.m1233(socketMo19134);
        this.f48950.getClass();
        return c0897;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36001(boolean z, InterfaceC7953 interfaceC7953, IOException iOException) {
        C0896 c0896;
        Socket socketM35991;
        boolean z2;
        this.f48950.getClass();
        synchronized (this.f48943) {
            if (interfaceC7953 != this.f48947) {
                throw new IllegalStateException("expected " + this.f48947 + " but was " + interfaceC7953);
            }
            if (!z) {
                this.f48955.f3615++;
            }
            c0896 = this.f48955;
            socketM35991 = m35991(z, false, true);
            if (this.f48955 != null) {
                c0896 = null;
            }
            z2 = this.f48948;
        }
        C0140.m1233(socketM35991);
        if (c0896 != null) {
            this.f48950.getClass();
        }
        if (iOException != null) {
            AbstractC7196.f24003.mo19133(this.f48951, iOException);
            this.f48950.getClass();
        } else if (z2) {
            AbstractC7196.f24003.mo19133(this.f48951, (IOException) null);
            this.f48950.getClass();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7953 m36004() {
        InterfaceC7953 interfaceC7953;
        synchronized (this.f48943) {
            interfaceC7953 = this.f48947;
        }
        return interfaceC7953;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C8608 m35994() {
        return this.f48952;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m36005() {
        C0896 c0896;
        Socket socketM35991;
        synchronized (this.f48943) {
            c0896 = this.f48955;
            socketM35991 = m35991(false, true, false);
            if (this.f48955 != null) {
                c0896 = null;
            }
        }
        C0140.m1233(socketM35991);
        if (c0896 != null) {
            AbstractC7196.f24003.mo19133(this.f48951, (IOException) null);
            this.f48950.getClass();
            this.f48950.getClass();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m36002() {
        C0896 c0896;
        Socket socketM35991;
        synchronized (this.f48943) {
            c0896 = this.f48955;
            socketM35991 = m35991(true, false, false);
            if (this.f48955 != null) {
                c0896 = null;
            }
        }
        C0140.m1233(socketM35991);
        if (c0896 != null) {
            this.f48950.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Socket m35991(boolean z, boolean z2, boolean z3) {
        Socket socketM3585;
        if (z3) {
            this.f48947 = null;
        }
        if (z2) {
            this.f48948 = true;
        }
        C0896 c0896 = this.f48955;
        if (c0896 != null) {
            if (z) {
                c0896.f3611 = true;
            }
            if (this.f48947 == null && (this.f48948 || c0896.f3611)) {
                ArrayList arrayList = c0896.f3610;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Reference) arrayList.get(i)).get() == this) {
                        arrayList.remove(i);
                        if (this.f48955.f3610.isEmpty()) {
                            this.f48955.f3605 = System.nanoTime();
                            if (AbstractC7196.f24003.mo19141(this.f48943, this.f48955)) {
                                socketM3585 = this.f48955.m3585();
                            } else {
                                socketM3585 = null;
                            }
                        } else {
                            socketM3585 = null;
                        }
                        this.f48955 = null;
                        return socketM3585;
                    }
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35998() {
        InterfaceC7953 interfaceC7953;
        C0896 c0896;
        synchronized (this.f48943) {
            this.f48944 = true;
            interfaceC7953 = this.f48947;
            c0896 = this.f48955;
        }
        if (interfaceC7953 != null) {
            interfaceC7953.cancel();
        } else if (c0896 != null) {
            c0896.m3578();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35999(IOException iOException) {
        C0896 c0896;
        boolean z;
        Socket socketM35991;
        synchronized (this.f48943) {
            c0896 = null;
            if (iOException instanceof C13805) {
                EnumC9365 enumC9365 = ((C13805) iOException).f45559;
                if (enumC9365 == EnumC9365.REFUSED_STREAM) {
                    int i = this.f48945 + 1;
                    this.f48945 = i;
                    if (i > 1) {
                        this.f48952 = null;
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (enumC9365 != EnumC9365.CANCEL) {
                    this.f48952 = null;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                C0896 c0897 = this.f48955;
                if (c0897 == null || (c0897.m3586() && !(iOException instanceof C1602))) {
                    z = false;
                } else {
                    if (this.f48955.f3615 == 0) {
                        C8608 c8608 = this.f48952;
                        if (c8608 != null && iOException != null) {
                            this.f48953.m17772(c8608, iOException);
                        }
                        this.f48952 = null;
                    }
                    z = true;
                }
            }
            C0896 c0898 = this.f48955;
            socketM35991 = m35991(z, false, true);
            if (this.f48955 == null && this.f48956) {
                c0896 = c0898;
            }
        }
        C0140.m1233(socketM35991);
        if (c0896 != null) {
            this.f48950.getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36000(C0896 c0896, boolean z) {
        if (this.f48955 != null) {
            throw new IllegalStateException();
        }
        this.f48955 = c0896;
        this.f48956 = z;
        c0896.f3610.add(new C22770(this, this.f48949));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Socket m35996(C0896 c0896) {
        if (this.f48947 != null || this.f48955.f3610.size() != 1) {
            throw new IllegalStateException();
        }
        Reference reference = (Reference) this.f48955.f3610.get(0);
        Socket socketM35991 = m35991(true, false, false);
        this.f48955 = c0896;
        c0896.f3610.add(reference);
        return socketM35991;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m35995() {
        if (this.f48952 != null) {
            return true;
        }
        C3718 c3718 = this.f48954;
        return (c3718 != null && c3718.m10886()) || this.f48953.m17773();
    }

    public final String toString() {
        C0896 c0896M36003 = m36003();
        return c0896M36003 != null ? c0896M36003.toString() : this.f48946.toString();
    }
}
