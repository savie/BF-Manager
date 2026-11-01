package l;

/* JADX INFO: renamed from: l.᩹ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22055 implements InterfaceC8616 {
    public final InterfaceC8616 a;
    public final InterfaceC8616 b;
    public final long c;

    @Override // l.InterfaceC8616
    public final int o() {
        return 2;
    }

    public AbstractC22055(InterfaceC8616 interfaceC8616, InterfaceC8616 interfaceC8617) {
        this.a = interfaceC8616;
        this.b = interfaceC8617;
        this.c = interfaceC8617.count() + interfaceC8616.count();
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC8616 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC8616
    public final long count() {
        return this.c;
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public /* bridge */ /* synthetic */ InterfaceC0853 a(int i) {
        return (InterfaceC0853) a(i);
    }
}
