package l;

/* JADX INFO: renamed from: l.֡ܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0451 extends AbstractC1094 {
    public final /* synthetic */ int b = 1;
    public boolean c;
    public Object d;

    public /* synthetic */ C0451(InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0451(C12904 c12904, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.d = c12904;
        this.c = true;
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public final void c(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.c(-1L);
                break;
            case 1:
                this.a.c(-1L);
                break;
            default:
                this.a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                InterfaceC19171 interfaceC19171 = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    interfaceC19171.accept((Object) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    interfaceC19171.accept(obj);
                    return;
                }
                return;
            case 1:
                InterfaceC5046 interfaceC5046 = (InterfaceC5046) ((C9509) this.d).t.apply(obj);
                if (interfaceC5046 != null) {
                    try {
                        boolean z = this.c;
                        InterfaceC19171 interfaceC19172 = this.a;
                        if (!z) {
                            ((InterfaceC5046) interfaceC5046.sequential()).forEach(interfaceC19172);
                        } else {
                            InterfaceC20693 interfaceC20693Spliterator = ((InterfaceC5046) interfaceC5046.sequential()).spliterator();
                            while (!interfaceC19172.f() && interfaceC20693Spliterator.tryAdvance(interfaceC19172)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC5046.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (interfaceC5046 != null) {
                    interfaceC5046.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean zTest = ((C12904) this.d).t.test(obj);
                    this.c = zTest;
                    if (zTest) {
                        this.a.accept(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public boolean f() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.f();
            case 2:
                return !this.c || this.a.f();
            default:
                return super.f();
        }
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0451(C9509 c9509, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.d = c9509;
    }
}
