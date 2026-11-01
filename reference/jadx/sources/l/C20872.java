package l;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.᩷۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7E3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20872 extends AbstractC9584 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7466 f67803;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f67804;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m46906() {
        if (!this.f67804.isEmpty()) {
            AbstractC21016 abstractC21016 = this.f32305;
            Iterator it = this.f67804.iterator();
            while (it.hasNext()) {
                abstractC21016.mo20147((String) it.next());
            }
            synchronized (abstractC21016) {
                abstractC21016.flush();
                this.f67804.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46903(C20872 c20872, String str) {
        if (str != null) {
            c20872.f67804.add(str);
        }
    }

    public C20872(C16078 c16078) {
        super("jdis", c16078);
        this.f67804 = new LinkedHashSet();
        this.f67803 = new C7466(this);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m46904(String str, Object... objArr) {
        this.f67803.accept(EnumC14523.VERBOSE.m34966(EnumC15934.WARNING, m24456(), AbstractC9584.m24455(str, objArr), new Object[0]));
    }

    @Override // l.AbstractC9584
    /* JADX INFO: renamed from: ۙ */
    public final void mo24457(String str, Object... objArr) {
        this.f67803.accept(EnumC14523.VERBOSE.m34966(EnumC15934.ERROR, m24456(), AbstractC9584.m24455(str, objArr), new Object[0]));
    }

    @Override // l.AbstractC9584
    /* JADX INFO: renamed from: ۙ */
    public final void mo24458(Throwable th) {
        this.f67803.accept(EnumC14523.VERBOSE.m34966(EnumC15934.ERROR, m24456(), th.getMessage(), new Object[0]));
    }

    @Override // l.AbstractC9584
    /* JADX INFO: renamed from: ܰ */
    public final String mo23029(String str, Object... objArr) {
        return AbstractC9584.m24455(str, objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46905(int i, InterfaceC1260 interfaceC1260) {
        EnumC15934 enumC15934 = EnumC15934.ERROR;
        LinkedHashSet linkedHashSet = this.f67804;
        int i2 = 2;
        int iCount = (int) C9030.stream(linkedHashSet).filter(new C20522(i2, enumC15934)).count();
        int iCount2 = (int) C9030.stream(linkedHashSet).filter(new C20522(i2, EnumC15934.WARNING)).count();
        if (iCount2 <= 0 && iCount <= 0) {
            return 0;
        }
        int iMax = Math.max(i, iCount);
        String strConcat = "";
        if (iCount2 > 0) {
            strConcat = String.format("%d warning(s)", Integer.valueOf(iCount2)).concat(iCount > 0 ? ", " : "");
        }
        this.f67803.accept(EnumC14523.SHORT.m34966(enumC15934, m24456(), AbstractC9584.m24455("{0}{1}in the file: {2}", strConcat, iCount > 0 ? String.format("%d error(s) ", Integer.valueOf(iCount)) : " ", interfaceC1260), new Object[0]));
        return iMax;
    }
}
