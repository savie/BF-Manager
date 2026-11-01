package l;

import java.io.IOException;
import java.util.Locale;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۘ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes2.dex */
public class C4146 extends RuntimeException {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient Supplier f15168;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final transient C4831 f15169;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient AbstractC23903 f15170;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient C11948 f15171;

    public C4146(AbstractC23903 abstractC23903, Supplier supplier, C4831 c4831) {
        this.f15169 = c4831;
        this.f15170 = abstractC23903;
        this.f15168 = supplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11948 m11788() {
        Supplier supplier;
        if (this.f15171 == null && (supplier = this.f15168) != null) {
            this.f15171 = (C11948) supplier.get();
        }
        return this.f15171;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return m11788().mo29758((Locale) null);
    }

    @Override // java.lang.Throwable
    public final Throwable initCause(Throwable th) {
        super.initCause(th);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11789(IOException iOException) {
        super.initCause(iOException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11790(C17906 c17906) {
        this.f15168 = c17906;
        this.f15171 = null;
    }
}
