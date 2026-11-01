package l;

import java.util.Deque;

/* JADX INFO: renamed from: l.ۨᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EAH2 */
/* JADX INFO: loaded from: classes4.dex */
public class C11874 implements InterfaceC11273 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile C18285 f39834;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC23973 f39835 = EnumC23973.IDLE;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile C16812 f39836;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f39837;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC23225 f39838;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C18285 f39839;

    @Override // l.InterfaceC11273
    public final synchronized EnumC23973 getState() {
        return this.f39835;
    }

    @Override // l.InterfaceC11273
    public final synchronized void invalidate() {
        this.f39835 = EnumC23973.INVALID;
    }

    @Override // l.InterfaceC11273
    /* JADX INFO: renamed from: ۖۙ */
    public final synchronized boolean mo28251() {
        EnumC23973 enumC23973 = this.f39835;
        if (enumC23973 == EnumC23973.IDLE) {
            this.f39835 = EnumC23973.ALLOCATED;
            this.f39839 = this.f39838.instant();
            return true;
        }
        if (enumC23973 == EnumC23973.EVICTION) {
            this.f39835 = EnumC23973.EVICTION_RETURN_TO_HEAD;
        }
        return false;
    }

    @Override // l.InterfaceC11273
    /* JADX INFO: renamed from: ۘۙ */
    public final synchronized void mo28252() {
        this.f39835 = EnumC23973.RETURNING;
    }

    @Override // l.InterfaceC11273
    /* JADX INFO: renamed from: ۙ */
    public final synchronized boolean mo28253(Deque deque) {
        EnumC23973 enumC23973 = this.f39835;
        if (enumC23973 == EnumC23973.EVICTION) {
            this.f39835 = EnumC23973.IDLE;
            return true;
        }
        if (enumC23973 == EnumC23973.EVICTION_RETURN_TO_HEAD) {
            this.f39835 = EnumC23973.IDLE;
            deque.offerFirst(this);
        }
        return false;
    }

    @Override // l.InterfaceC11273
    /* JADX INFO: renamed from: ܿۙ */
    public final synchronized boolean mo28255() {
        EnumC23973 enumC23973 = this.f39835;
        if (enumC23973 != EnumC23973.ALLOCATED && enumC23973 != EnumC23973.RETURNING) {
            return false;
        }
        this.f39835 = EnumC23973.IDLE;
        this.f39834 = this.f39838.instant();
        this.f39836.getClass();
        return true;
    }

    @Override // l.InterfaceC11273
    /* JADX INFO: renamed from: ᩸ܰ */
    public final synchronized boolean mo28259() {
        if (this.f39835 != EnumC23973.IDLE) {
            return false;
        }
        this.f39835 = EnumC23973.EVICTION;
        return true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC11273 interfaceC11273 = (InterfaceC11273) obj;
        int iCompareTo = this.f39834.compareTo(interfaceC11273.mo28258());
        return iCompareTo == 0 ? System.identityHashCode(this) - System.identityHashCode(interfaceC11273) : iCompareTo;
    }

    public C11874(Object obj) {
        AbstractC23225 abstractC23225SystemUTC = AbstractC23225.systemUTC();
        this.f39838 = abstractC23225SystemUTC;
        C18285 c18285Instant = abstractC23225SystemUTC.instant();
        this.f39839 = c18285Instant;
        this.f39834 = c18285Instant;
        this.f39836 = C16812.f53819;
        this.f39837 = obj;
    }

    @Override // l.InterfaceC11273
    /* JADX INFO: renamed from: ᩴܰ */
    public final C21813 mo28256() {
        C21813 c21813Between = C21813.between(this.f39834, this.f39838.instant());
        return c21813Between.isNegative() ? C21813.ZERO : c21813Between;
    }

    @Override // l.InterfaceC11273
    /* JADX INFO: renamed from: ᩶ܰ */
    public final C21813 mo28257() {
        C18285 c18285 = this.f39834;
        C18285 c18286 = this.f39839;
        if (c18285.isAfter(c18286)) {
            return C21813.between(c18286, c18285);
        }
        return C21813.between(c18286, C18285.now());
    }

    @Override // l.InterfaceC11273
    /* JADX INFO: renamed from: ᩷ۙ */
    public final C18285 mo28258() {
        return this.f39834;
    }

    @Override // l.InterfaceC11273
    /* JADX INFO: renamed from: ܽܰ */
    public final Object mo28254() {
        return this.f39837;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Object: ");
        sb.append(this.f39837.toString());
        sb.append(", State: ");
        synchronized (this) {
            sb.append(this.f39835.toString());
        }
        return sb.toString();
    }
}
