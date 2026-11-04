package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes3.dex */
public final class C2985 extends AbstractC0157 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7460 f9691;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2985(C7460 c7460, int i) {
        super(i);
        this.f9691 = c7460;
    }

    @Override // l.AbstractC18056
    /* JADX INFO: renamed from: ᩷ */
    public final char mo2590(int i) {
        C7460 c7460 = this.f9691;
        return c7460.f24582.f44819[c7460.f26648 + i];
    }

    @Override // l.AbstractC0157
    /* JADX INFO: renamed from: ۙ */
    public final void mo1357(char c, int i) {
        this.f9691.mo21904(c, i);
    }

    @Override // l.AbstractC0157
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1361(char c, int i) {
        this.f9691.mo21898(c, i);
    }

    @Override // l.AbstractC18056
    /* JADX INFO: renamed from: ۤ */
    public final void mo2589(int i) {
        this.f9691.mo21903(i);
    }

    @Override // l.AbstractC18056
    /* JADX INFO: renamed from: ۙ */
    public final int mo2588() {
        C7460 c7460 = this.f9691;
        return c7460.f26649 - c7460.f26648;
    }

    @Override // l.AbstractC18056, l.InterfaceC21040
    /* JADX INFO: renamed from: ᩵᩷ */
    public final char mo5320() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C7460 c7460 = this.f9691;
        char[] cArr = c7460.f24582.f44819;
        int i = c7460.f26648;
        int i2 = this.f59121;
        this.f59121 = i2 + 1;
        this.f59120 = i2;
        return cArr[i + i2];
    }

    @Override // l.AbstractC0157, l.InterfaceC8360
    /* JADX INFO: renamed from: ۠ۙ */
    public final char mo1359() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C7460 c7460 = this.f9691;
        char[] cArr = c7460.f24582.f44819;
        int i = c7460.f26648;
        int i2 = this.f59121 - 1;
        this.f59121 = i2;
        this.f59120 = i2;
        return cArr[i + i2];
    }

    @Override // l.AbstractC14741, l.InterfaceC24073
    /* JADX INFO: renamed from: ᩷ */
    public final void forEachRemaining(InterfaceC12089 interfaceC12089) {
        C7460 c7460 = this.f9691;
        char[] cArr = c7460.f24582.f44819;
        int i = c7460.f26649 - c7460.f26648;
        while (true) {
            int i2 = this.f59121;
            if (i2 >= i) {
                return;
            }
            int i3 = c7460.f26648;
            this.f59121 = i2 + 1;
            this.f59120 = i2;
            interfaceC12089.mo10258(cArr[i3 + i2]);
        }
    }
}
