package l;

/* JADX INFO: renamed from: l.ۙ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4566 extends AbstractC2590 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f16240;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16241;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract int mo14344();

    public AbstractC4566(int i) {
        super(i);
        this.f16241 = -1;
        this.f16240 = false;
    }

    public AbstractC4566(int i, int i2) {
        super(i);
        this.f16241 = i2;
        this.f16240 = true;
    }

    @Override // l.AbstractC2590
    /* JADX INFO: renamed from: ۙ */
    public final int mo8662() {
        return this.f16240 ? this.f16241 : mo14344();
    }

    @Override // l.AbstractC2590, l.AbstractC2108, l.InterfaceC8409
    public final InterfaceC9301 trySplit() {
        InterfaceC9301 interfaceC9301TrySplit = super.trySplit();
        if (!this.f16240 && interfaceC9301TrySplit != null) {
            this.f16241 = mo14344();
            this.f16240 = true;
        }
        return interfaceC9301TrySplit;
    }
}
