package l;

import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: l.ۨ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11554 extends AbstractC2380 implements Closeable, InterfaceC13320 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumSet f38851;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Stack f38852;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f38853;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f38854;

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo1180() {
        return true;
    }

    public C11554(C12343 c12343) {
        c12343.m30659(AbstractC2380.f8407, this);
        this.f38852 = new Stack();
        this.f38853 = new LinkedHashMap();
        String[] strArrSplit = C14770.m35395(c12343).m35397("debug.completionDeps").split(",");
        for (String str : strArrSplit) {
            if (str.startsWith("file=")) {
                this.f38854 = str.substring(5);
            }
        }
        this.f38851 = EnumC9521.m24364(strArrSplit);
        C16949 c16949M39706 = C16949.m39706(c12343);
        C21825 c21825 = c16949M39706.f54241;
        c21825.getClass();
        c16949M39706.f54241 = new C21825(this, c21825);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m28860(C12343 c12343) {
        c12343.m30660(AbstractC2380.f8407, (InterfaceC0347) new C23632());
    }

    @Override // l.AbstractC2380
    /* JADX INFO: renamed from: ۙ */
    public final void mo7239(C22492 c22492, EnumC5992 enumC5992) {
        C1758 c1758 = new C1758(c22492);
        LinkedHashMap linkedHashMap = this.f38853;
        AbstractC4497 abstractC4497 = (AbstractC4497) linkedHashMap.get(c22492);
        if (abstractC4497 == null) {
            linkedHashMap.put(c22492, c1758);
            abstractC4497 = c1758;
        }
        Stack stack = this.f38852;
        if (!stack.isEmpty()) {
            List list = (List) ((AbstractC4497) stack.peek()).f16002.get(enumC5992);
            if (!list.contains(abstractC4497)) {
                list.add(abstractC4497);
            }
        }
        stack.push(abstractC4497);
        if (c1758 == abstractC4497) {
            c22492.f77451 = this;
        }
    }

    @Override // l.AbstractC2380
    /* JADX INFO: renamed from: ۙ */
    public final void mo7238() {
        this.f38852.pop();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        EnumC9521 enumC9521 = EnumC9521.REDUNDANT;
        EnumSet enumSet = this.f38851;
        boolean zContains = enumSet.contains(enumC9521);
        LinkedHashMap linkedHashMap = this.f38853;
        if (!zContains) {
            new C13671().m43013(linkedHashMap.values(), (StringBuilder) null);
        }
        if (!enumSet.contains(EnumC9521.CLASS)) {
            new C3169(this, EnumC14460.SOURCE).m43013(linkedHashMap.values(), (StringBuilder) null);
        }
        if (!enumSet.contains(EnumC9521.SOURCE)) {
            new C3169(this, EnumC14460.CLASS).m43013(linkedHashMap.values(), (StringBuilder) null);
        }
        String str = this.f38854;
        if (str != null) {
            FileWriter fileWriter = new FileWriter(str);
            try {
                fileWriter.append((CharSequence) C8732.m22597(linkedHashMap.values(), "CompletionDeps", ""));
                fileWriter.close();
            } catch (Throwable th) {
                try {
                    fileWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public final void mo1179(AbstractC23903 abstractC23903) {
        mo7239((C22492) abstractC23903, EnumC5992.OTHER);
        mo7238();
        abstractC23903.f77451 = this;
    }
}
