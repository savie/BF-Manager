package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩸֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6GG */
/* JADX INFO: loaded from: classes2.dex */
public final class C22449 extends C10514 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C10514 f72665;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C10514 f72666;

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo5550() {
        return true;
    }

    public C22449(C10514 c10514, C10514 c10515) {
        super(c10514.f33450 + '$' + c10515.f33450);
        this.f72665 = c10514;
        this.f72666 = c10515;
        this.f5441 = (((c10515.f5441 * 31) + c10514.f5441) * 31) + this.f33450.hashCode();
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ֫ */
    public final List mo5541() {
        return this.f72666.mo5541();
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC1566 mo5559() {
        return this.f72665;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC1566 mo5553() {
        return this.f72666;
    }

    @Override // l.C10514, l.AbstractC1566
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5547(Object obj) {
        if (!super.mo5547(obj)) {
            return false;
        }
        C22449 c22449 = (C22449) obj;
        return C17359.equals(this.f72665, c22449.f72665) && C17359.equals(this.f72666, c22449.f72666);
    }

    @Override // l.C10514, l.AbstractC1566
    public final String toString() {
        return this.f72665.toString() + '$' + this.f72666.toString();
    }
}
