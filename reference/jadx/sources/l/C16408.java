package l;

import android.text.Editable;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܽۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76QP */
/* JADX INFO: loaded from: classes5.dex */
public final class C16408 extends C11092 implements InterfaceC2916 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C4681 f52782;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f52783;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public volatile long f52784;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f52785;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f52786;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C1254 f52787;

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo8721(InterfaceC3453 interfaceC3453) {
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ܺۙ */
    public final /* synthetic */ boolean mo8731() {
        return false;
    }

    @Override // l.C11092, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m38633(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // l.C11092, android.text.Editable
    public final /* bridge */ /* synthetic */ C11092 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m38633(i, i2, charSequence, i3, i4);
        return this;
    }

    public C16408(C1254 c1254) {
        this(c1254, (Long) null);
    }

    public C16408(C1254 c1254, long j) {
        this(c1254, Long.valueOf(j));
    }

    public C16408(C1254 c1254, Long l2) {
        super(c1254);
        this.f52782 = new C4681(new InterfaceC3001() { // from class: l.ܺۙۚ
            @Override // l.InterfaceC3001
            /* JADX INFO: renamed from: ۙ */
            public final void mo8962(int i, int i2, CharSequence charSequence, int i3, int i4) {
                super/*l.ۧܺۖ*/.replace(i, i2, charSequence, i3, i4);
            }
        });
        this.f52787 = c1254;
        synchronized (c1254) {
            byte[] bArrM4549 = c1254.m4549();
            if (l2 == null && bArrM4549.length == 0) {
                l2 = Long.valueOf(c1254.m4560());
            }
            C7235 c7235M19277 = C7235.m19277(bArrM4549, l2);
            c7235M19277.m19281(c1254.m4527());
            c1254.m4552(c7235M19277.m19282(c7235M19277.f24093));
            this.f52784 = c7235M19277.f24093;
        }
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public final void mo8722(C11018 c11018) {
        throw new IllegalStateException("Session recovery protocol required");
    }

    @Override // l.C11092, l.InterfaceC2916
    /* JADX INFO: renamed from: ܿ */
    public final int mo8732() {
        throw new IllegalStateException("Session recovery protocol required");
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ᩶ۙ */
    public final void mo8734() {
        mo8723(true);
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ᩹ܰ */
    public final C1254 mo8735() {
        return this.f52787;
    }

    @Override // l.InterfaceC2916
    public final void setReadOnly(boolean z) {
        this.f52782.m12983(z);
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۠ۙ */
    public final boolean mo8725() {
        return this.f52782.m12986() || m27990();
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public final void mo8720(int i) {
        this.f52786 = i;
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ᩵ܰ */
    public final int mo8733() {
        return this.f52786;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m38634() {
        return this.f52782.m12984();
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۖ */
    public final void mo8719(long j) {
        synchronized (this.f52787) {
            if (m27995()) {
                return;
            }
            this.f52787.m4552(C7235.m19277(this.f52787.m4549(), Long.valueOf(j)).m19282(j));
            this.f52784 = j;
        }
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ֡ */
    public final long mo8718() {
        return this.f52784;
    }

    @Override // l.InterfaceC2916
    public final boolean isChanged() {
        if (m27995()) {
            return this.f52783;
        }
        try {
            return this.f52784 != this.f52787.m4560();
        } catch (C4865 e) {
            if (!m27995()) {
                throw e;
            }
            return this.f52783;
        }
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ܰ */
    public final void mo8728(boolean z) {
        synchronized (this.f52787) {
            if (m27995()) {
                return;
            }
            if (this.f52785) {
                throw new IllegalStateException("Editable is closed");
            }
            long jM4560 = z ? -1L : this.f52787.m4560();
            C7235 c7235M19277 = C7235.m19277(this.f52787.m4549(), (Long) null);
            c7235M19277.m19281(this.f52787.m4527());
            this.f52787.m4552(c7235M19277.m19282(jM4560));
            this.f52784 = jM4560;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38633(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f52786 == 0) {
            C4681 c4681 = this.f52782;
            c4681.getClass();
            c4681.m12980(null, new C9353(c4681, i, i2, charSequence, i3, i4));
        }
    }

    @Override // l.C11092, l.InterfaceC2916
    /* JADX INFO: renamed from: ۧۙ */
    public final EnumC11839 mo8726() {
        if (this.f52786 != 0) {
            return EnumC11839.UNAVAILABLE;
        }
        C2438 c2438 = new C2438(1, this);
        return (EnumC11839) this.f52782.m12980(EnumC11839.UNAVAILABLE, c2438);
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8724(final Runnable runnable) {
        if (this.f52786 != 0) {
            return false;
        }
        return ((Boolean) this.f52782.m12980(Boolean.FALSE, new Supplier() { // from class: l.᩶ۙۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                this.f63875.m27998(runnable);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    @Override // l.C11092, l.InterfaceC2916
    /* JADX INFO: renamed from: ۫ۙ */
    public final EnumC11839 mo8727() {
        if (this.f52786 != 0) {
            return EnumC11839.UNAVAILABLE;
        }
        Supplier supplier = new Supplier() { // from class: l.᩷ۙۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۧܺۖ*/.mo8727();
            }
        };
        return (EnumC11839) this.f52782.m12980(EnumC11839.UNAVAILABLE, supplier);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.֡ۙۚ] */
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
    @Override // l.C11092
    /* JADX INFO: renamed from: ۙ */
    public final C8996 mo27991(final C18749 c18749) {
        C8996 c8996 = (C8996) this.f52782.m12981((C0179) new Supplier() { // from class: l.֡ۙۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۧܺۖ*/.mo27991(c18749);
            }
        });
        if (c8996 != null) {
            return c8996;
        }
        throw new IllegalStateException("Text load publication is waiting for internal readers");
    }

    @Override // l.C11092, l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public final void mo8723(boolean z) {
        if (m27990()) {
            C16737.m39273(new RunnableC23440(2, this));
        } else {
            close();
        }
    }

    @Override // l.C11092, java.lang.AutoCloseable
    public final void close() {
        if (this.f52785) {
            return;
        }
        this.f52783 = isChanged();
        super.close();
        this.f52785 = true;
        this.f52782.m12985();
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ܶܰ */
    public final void mo8730() {
        this.f52787.m4557();
    }
}
