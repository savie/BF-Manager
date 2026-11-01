package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes4.dex */
public final class C7246 extends AbstractC18098 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15714 f24141;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7246(C15714 c15714, int i) {
        super(i);
        this.f24141 = c15714;
    }

    @Override // l.AbstractC21626
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char mo19364(int i) {
        C15714 c15714 = this.f24141;
        return c15714.f50999.f63895[c15714.f57484 + i];
    }

    @Override // l.AbstractC18098
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19362(char c, int i) {
        this.f24141.mo26241(c, i);
    }

    @Override // l.AbstractC18098
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo19365(char c, int i) {
        this.f24141.mo26237(c, i);
    }

    @Override // l.AbstractC21626
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo19363(int i) {
        this.f24141.mo26242(i);
    }

    @Override // l.AbstractC21626
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo19361() {
        C15714 c15714 = this.f24141;
        return c15714.f57483 - c15714.f57484;
    }

    @Override // l.AbstractC21626, l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ */
    public final char mo1416() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C15714 c15714 = this.f24141;
        char[] cArr = c15714.f50999.f63895;
        int i = c15714.f57484;
        int i2 = this.f70141;
        this.f70141 = i2 + 1;
        this.f70140 = i2;
        return cArr[i + i2];
    }

    @Override // l.AbstractC18098, l.InterfaceC20921
    /* JADX INFO: renamed from: ֫ۙ */
    public final char mo19146() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C15714 c15714 = this.f24141;
        char[] cArr = c15714.f50999.f63895;
        int i = c15714.f57484;
        int i2 = this.f70141 - 1;
        this.f70141 = i2;
        this.f70140 = i2;
        return cArr[i + i2];
    }

    @Override // l.AbstractC6684, l.InterfaceC3758
    /* JADX INFO: renamed from: ܰ */
    public final void forEachRemaining(InterfaceC1164 interfaceC1164) {
        C15714 c15714 = this.f24141;
        char[] cArr = c15714.f50999.f63895;
        int i = c15714.f57483 - c15714.f57484;
        while (true) {
            int i2 = this.f70141;
            if (i2 >= i) {
                return;
            }
            int i3 = c15714.f57484;
            this.f70141 = i2 + 1;
            this.f70140 = i2;
            interfaceC1164.mo4297(cArr[i3 + i2]);
        }
    }
}
