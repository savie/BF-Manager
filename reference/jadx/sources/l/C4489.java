package l;

import java.util.Deque;

/* JADX INFO: renamed from: l.ۘ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAH2 */
/* JADX INFO: loaded from: classes3.dex */
public class C4489 implements InterfaceC17913 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f16046;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC16421 f16047 = EnumC16421.IDLE;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C11355 f16048;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile C0358 f16049;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14527 f16050;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C0358 f16051;

    @Override // l.InterfaceC17913
    public final synchronized EnumC16421 getState() {
        return this.f16047;
    }

    @Override // l.InterfaceC17913
    public final synchronized void invalidate() {
        this.f16047 = EnumC16421.INVALID;
    }

    @Override // l.InterfaceC17913
    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo14205() {
        this.f16047 = EnumC16421.RETURNING;
    }

    @Override // l.InterfaceC17913
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo14207(Deque deque) {
        EnumC16421 enumC16421 = this.f16047;
        if (enumC16421 == EnumC16421.EVICTION) {
            this.f16047 = EnumC16421.IDLE;
            return true;
        }
        if (enumC16421 == EnumC16421.EVICTION_RETURN_TO_HEAD) {
            this.f16047 = EnumC16421.IDLE;
            deque.offerFirst(this);
        }
        return false;
    }

    @Override // l.InterfaceC17913
    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo14208() {
        if (this.f16047 != EnumC16421.IDLE) {
            return false;
        }
        this.f16047 = EnumC16421.EVICTION;
        return true;
    }

    @Override // l.InterfaceC17913
    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo14209() {
        EnumC16421 enumC16421 = this.f16047;
        if (enumC16421 != EnumC16421.ALLOCATED && enumC16421 != EnumC16421.RETURNING) {
            return false;
        }
        this.f16047 = EnumC16421.IDLE;
        this.f16049 = this.f16050.instant();
        this.f16048.getClass();
        return true;
    }

    @Override // l.InterfaceC17913
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo14211() {
        EnumC16421 enumC16421 = this.f16047;
        if (enumC16421 == EnumC16421.IDLE) {
            this.f16047 = EnumC16421.ALLOCATED;
            this.f16051 = this.f16050.instant();
            return true;
        }
        if (enumC16421 == EnumC16421.EVICTION) {
            this.f16047 = EnumC16421.EVICTION_RETURN_TO_HEAD;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC17913 interfaceC17913 = (InterfaceC17913) obj;
        int iCompareTo = this.f16049.compareTo(interfaceC17913.mo14206());
        return iCompareTo == 0 ? System.identityHashCode(this) - System.identityHashCode(interfaceC17913) : iCompareTo;
    }

    public C4489(Object obj) {
        AbstractC14527 abstractC14527SystemUTC = AbstractC14527.systemUTC();
        this.f16050 = abstractC14527SystemUTC;
        C0358 c0358Instant = abstractC14527SystemUTC.instant();
        this.f16051 = c0358Instant;
        this.f16049 = c0358Instant;
        this.f16048 = C11355.f35759;
        this.f16046 = obj;
    }

    @Override // l.InterfaceC17913
    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public final C18257 mo14212() {
        C18257 c18257Between = C18257.between(this.f16049, this.f16050.instant());
        return c18257Between.isNegative() ? C18257.ZERO : c18257Between;
    }

    @Override // l.InterfaceC17913
    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C0358 mo14206() {
        return this.f16049;
    }

    @Override // l.InterfaceC17913
    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public final C18257 mo14210() {
        C0358 c0358 = this.f16049;
        C0358 c0359 = this.f16051;
        if (c0358.isAfter(c0359)) {
            return C18257.between(c0359, c0358);
        }
        return C18257.between(c0359, C0358.now());
    }

    @Override // l.InterfaceC17913
    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public final Object mo14204() {
        return this.f16046;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Object: ");
        sb.append(this.f16046.toString());
        sb.append(", State: ");
        synchronized (this) {
            sb.append(this.f16047.toString());
        }
        return sb.toString();
    }
}
