package l;

/* JADX INFO: renamed from: l.ܿ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18542 extends AbstractC9591 {
    public final /* synthetic */ int b = 2;
    public boolean c;
    public Object d;

    public /* synthetic */ C18542(InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18542(C2465 c2465, InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
        this.d = c2465;
        this.c = true;
    }

    @Override // l.AbstractC9591, l.InterfaceC15143
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
                InterfaceC15143 interfaceC15143 = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    interfaceC15143.accept((Object) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    interfaceC15143.accept(obj);
                    return;
                }
                return;
            case 1:
                InterfaceC20670 interfaceC20670 = (InterfaceC20670) ((C14680) this.d).t.apply(obj);
                if (interfaceC20670 != null) {
                    try {
                        boolean z = this.c;
                        InterfaceC15143 interfaceC15144 = this.a;
                        if (!z) {
                            ((InterfaceC20670) interfaceC20670.sequential()).forEach(interfaceC15144);
                        } else {
                            InterfaceC8409 interfaceC8409Spliterator = ((InterfaceC20670) interfaceC20670.sequential()).spliterator();
                            while (!interfaceC15144.f() && interfaceC8409Spliterator.tryAdvance(interfaceC15144)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC20670.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (interfaceC20670 != null) {
                    interfaceC20670.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean zTest = ((C2465) this.d).t.test(obj);
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

    @Override // l.AbstractC9591, l.InterfaceC15143
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

    @Override // l.AbstractC9591, l.InterfaceC15143
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
    public C18542(C14680 c14680, InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
        this.d = c14680;
    }
}
