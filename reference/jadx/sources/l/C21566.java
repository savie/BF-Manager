package l;

import java.io.IOException;
import java.util.Locale;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩶᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes.dex */
public class C21566 extends RuntimeException {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient AbstractC11781 f68881;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final transient C3163 f68882;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient Supplier f68883;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient C17007 f68884;

    public C21566(AbstractC11781 abstractC11781, Supplier supplier, C3163 c3163) {
        this.f68882 = c3163;
        this.f68881 = abstractC11781;
        this.f68883 = supplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17007 m49041() {
        Supplier supplier;
        if (this.f68884 == null && (supplier = this.f68883) != null) {
            this.f68884 = (C17007) supplier.get();
        }
        return this.f68884;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return m49041().mo32403((Locale) null);
    }

    @Override // java.lang.Throwable
    public final Throwable initCause(Throwable th) {
        super.initCause(th);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49042(IOException iOException) {
        super.initCause(iOException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49043(C8974 c8974) {
        this.f68883 = c8974;
        this.f68884 = null;
    }
}
