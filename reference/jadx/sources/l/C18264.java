package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18264 extends AbstractC12311 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18970 f58286;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18264(C18970 c18970) {
        super(c18970.f39905);
        this.f58286 = c18970;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18264(C18970 c18970, int i, int i2) {
        super(i, i2);
        this.f58286 = c18970;
    }

    @Override // l.AbstractC12311
    /* JADX INFO: renamed from: ܰ */
    public final int mo24749() {
        return this.f58286.f39904;
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13685(int i) {
        return this.f58286.f61421.f29126[i];
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7371 mo13686(int i, int i2) {
        return new C18264(this.f58286, i, i2);
    }

    @Override // l.AbstractC20777, l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        if (this.f67579 >= mo1946()) {
            return false;
        }
        Object[] objArr = this.f58286.f61421.f29126;
        int i = this.f67579;
        this.f67579 = i + 1;
        consumer.n(objArr[i]);
        return true;
    }

    @Override // l.AbstractC20777, l.AbstractC1309, l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        Object[] objArr = this.f58286.f61421.f29126;
        int iMo1946 = mo1946();
        while (true) {
            int i = this.f67579;
            if (i >= iMo1946) {
                return;
            }
            this.f67579 = i + 1;
            consumer.n(objArr[i]);
        }
    }
}
