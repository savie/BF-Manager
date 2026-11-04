package l;

import android.text.Editable;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76QP */
/* JADX INFO: loaded from: classes3.dex */
public final class C3354 extends C5068 implements InterfaceC19106 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f10954;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f10955;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public volatile long f10956;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C0371 f10957;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f10958;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C17505 f10959;

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo11038(InterfaceC19459 interfaceC19459) {
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo11042() {
        return false;
    }

    @Override // l.C5068, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m11050(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // l.C5068, android.text.Editable
    public final /* bridge */ /* synthetic */ C5068 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m11050(i, i2, charSequence, i3, i4);
        return this;
    }

    public C3354(C17505 c17505) {
        this(c17505, (Long) null);
    }

    public C3354(C17505 c17505, long j) {
        this(c17505, Long.valueOf(j));
    }

    public C3354(C17505 c17505, Long l2) {
        super(c17505);
        this.f10957 = new C0371(new InterfaceC18270() { // from class: l.ܽۤᩴ
            @Override // l.InterfaceC18270
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo41142(int i, int i2, CharSequence charSequence, int i3, int i4) {
                super/*l.ۙܿ᩸*/.replace(i, i2, charSequence, i3, i4);
            }
        });
        this.f10959 = c17505;
        synchronized (c17505) {
            byte[] bArrM41104 = c17505.m41104();
            if (l2 == null && bArrM41104.length == 0) {
                l2 = Long.valueOf(c17505.m41115());
            }
            C11557 c11557M29073 = C11557.m29073(bArrM41104, l2);
            c11557M29073.m29076(c17505.m41108());
            c17505.m41118(c11557M29073.m29077(c11557M29073.f36342));
            this.f10956 = c11557M29073.f36342;
        }
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11037(C6178 c6178) {
        throw new IllegalStateException("Session recovery protocol required");
    }

    @Override // l.C5068, l.InterfaceC19106
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo11047() {
        throw new IllegalStateException("Session recovery protocol required");
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final C17505 mo11043() {
        return this.f10959;
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11049() {
        mo11039(true);
    }

    @Override // l.InterfaceC19106
    public final void setReadOnly(boolean z) {
        this.f10957.m2156(z);
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11034() {
        return this.f10957.m2159() || m15345();
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11036(int i) {
        this.f10958 = i;
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public final int mo11048() {
        return this.f10958;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m11044() {
        return this.f10957.m2157();
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo11052(long j) {
        synchronized (this.f10959) {
            if (m15341()) {
                return;
            }
            this.f10959.m41118(C11557.m29073(this.f10959.m41104(), Long.valueOf(j)).m29077(j));
            this.f10956 = j;
        }
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long mo11046() {
        return this.f10956;
    }

    @Override // l.InterfaceC19106
    public final boolean isChanged() {
        if (m15341()) {
            return this.f10954;
        }
        try {
            return this.f10956 != this.f10959.m41115();
        } catch (C13271 e) {
            if (!m15341()) {
                throw e;
            }
            return this.f10954;
        }
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo11051(boolean z) {
        synchronized (this.f10959) {
            if (m15341()) {
                return;
            }
            if (this.f10955) {
                throw new IllegalStateException("Editable is closed");
            }
            long jM41115 = z ? -1L : this.f10959.m41115();
            C11557 c11557M29073 = C11557.m29073(this.f10959.m41104(), (Long) null);
            c11557M29073.m29076(this.f10959.m41108());
            this.f10959.m41118(c11557M29073.m29077(jM41115));
            this.f10956 = jM41115;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11050(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f10958 == 0) {
            C0371 c0371 = this.f10957;
            c0371.getClass();
            c0371.m2153(null, new C21254(c0371, i, i2, charSequence, i3, i4));
        }
    }

    @Override // l.C5068, l.InterfaceC19106
    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC1844 mo11033() {
        if (this.f10958 != 0) {
            return EnumC1844.UNAVAILABLE;
        }
        Supplier supplier = new Supplier() { // from class: l.ܺۤᩴ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۙܿ᩸*/.mo11033();
            }
        };
        return (EnumC1844) this.f10957.m2153(EnumC1844.UNAVAILABLE, supplier);
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11040(final Runnable runnable) {
        if (this.f10958 != 0) {
            return false;
        }
        return ((Boolean) this.f10957.m2153(Boolean.FALSE, new Supplier() { // from class: l.ܶۤᩴ
            @Override // java.util.function.Supplier
            public final Object get() {
                this.f52012.m15354(runnable);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    @Override // l.C5068, l.InterfaceC19106
    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC1844 mo11041() {
        if (this.f10958 != 0) {
            return EnumC1844.UNAVAILABLE;
        }
        Supplier supplier = new Supplier() { // from class: l.᩻ۤᩴ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۙܿ᩸*/.mo11041();
            }
        };
        return (EnumC1844) this.f10957.m2153(EnumC1844.UNAVAILABLE, supplier);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩹ۤᩴ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.C5068
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21170 mo11035(final C24482 c24482) {
        C21170 c21170 = (C21170) this.f10957.m2154((C23492) new Supplier() { // from class: l.᩹ۤᩴ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۙܿ᩸*/.mo11035(c24482);
            }
        });
        if (c21170 != null) {
            return c21170;
        }
        throw new IllegalStateException("Text load publication is waiting for internal readers");
    }

    @Override // l.C5068, l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11039(boolean z) {
        if (m15345()) {
            C21576.m49068(new RunnableC22358(3, this));
        } else {
            close();
        }
    }

    @Override // l.C5068, java.lang.AutoCloseable
    public final void close() {
        if (this.f10955) {
            return;
        }
        this.f10954 = isChanged();
        super.close();
        this.f10955 = true;
        this.f10957.m2158();
    }

    @Override // l.InterfaceC19106
    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public final void mo11045() {
        this.f10959.m41114();
    }
}
