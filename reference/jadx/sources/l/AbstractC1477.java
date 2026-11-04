package l;

/* JADX INFO: renamed from: l.֨᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1477 implements InterfaceC13409 {
    public final InterfaceC13409 a;
    public final InterfaceC13409 b;
    public final long c;

    @Override // l.InterfaceC13409
    public final int o() {
        return 2;
    }

    public AbstractC1477(InterfaceC13409 interfaceC13409, InterfaceC13409 interfaceC134010) {
        this.a = interfaceC13409;
        this.b = interfaceC134010;
        this.c = interfaceC134010.count() + interfaceC13409.count();
    }

    @Override // l.InterfaceC13409
    public final InterfaceC13409 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC13409
    public final long count() {
        return this.c;
    }

    @Override // l.InterfaceC13409
    public /* bridge */ /* synthetic */ InterfaceC9459 a(int i) {
        return (InterfaceC9459) a(i);
    }
}
