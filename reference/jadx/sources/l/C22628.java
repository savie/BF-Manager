package l;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.᩸ۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7E3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22628 extends AbstractC3236 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f73222;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C17271 f73223;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m50976() {
        if (!this.f73222.isEmpty()) {
            AbstractC22078 abstractC22078 = this.f10544;
            Iterator it = this.f73222.iterator();
            while (it.hasNext()) {
                abstractC22078.mo15108((String) it.next());
            }
            synchronized (abstractC22078) {
                abstractC22078.flush();
                this.f73222.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50974(C22628 c22628, String str) {
        if (str != null) {
            c22628.f73222.add(str);
        }
    }

    public C22628(C10889 c10889) {
        super("jdis", c10889);
        this.f73222 = new LinkedHashSet();
        this.f73223 = new C17271(2, this);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m50977(String str, Object... objArr) {
        this.f73223.accept(EnumC15914.VERBOSE.m37950(EnumC19644.WARNING, m10581(), AbstractC3236.m10580(str, objArr), new Object[0]));
    }

    @Override // l.AbstractC3236
    /* JADX INFO: renamed from: ۙ */
    public final void mo10582(String str, Object... objArr) {
        this.f73223.accept(EnumC15914.VERBOSE.m37950(EnumC19644.ERROR, m10581(), AbstractC3236.m10580(str, objArr), new Object[0]));
    }

    @Override // l.AbstractC3236
    /* JADX INFO: renamed from: ۙ */
    public final void mo10583(Throwable th) {
        this.f73223.accept(EnumC15914.VERBOSE.m37950(EnumC19644.ERROR, m10581(), th.getMessage(), new Object[0]));
    }

    @Override // l.AbstractC3236
    /* JADX INFO: renamed from: ᩷ */
    public final String mo10586(String str, Object... objArr) {
        return AbstractC3236.m10580(str, objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50975(int i, InterfaceC18152 interfaceC18152) {
        EnumC19644 enumC19644 = EnumC19644.ERROR;
        LinkedHashSet linkedHashSet = this.f73222;
        int iCount = (int) C1170.stream(linkedHashSet).filter(new C10693(0, enumC19644)).count();
        int iCount2 = (int) C1170.stream(linkedHashSet).filter(new C10693(0, EnumC19644.WARNING)).count();
        if (iCount2 <= 0 && iCount <= 0) {
            return 0;
        }
        int iMax = Math.max(i, iCount);
        String strConcat = "";
        if (iCount2 > 0) {
            strConcat = String.format("%d warning(s)", Integer.valueOf(iCount2)).concat(iCount > 0 ? ", " : "");
        }
        this.f73223.accept(EnumC15914.SHORT.m37950(enumC19644, m10581(), AbstractC3236.m10580("{0}{1}in the file: {2}", strConcat, iCount > 0 ? String.format("%d error(s) ", Integer.valueOf(iCount)) : " ", interfaceC18152), new Object[0]));
        return iMax;
    }
}
