package l;

import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: l.ܺ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16679 extends AbstractC17425 implements Closeable, InterfaceC14852 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f53881;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Stack f53882;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumSet f53883;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f53884;

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo11630() {
        return true;
    }

    public C16679(C4747 c4747) {
        c4747.m14646(AbstractC17425.f56660, this);
        this.f53882 = new Stack();
        this.f53881 = new LinkedHashMap();
        String[] strArrSplit = C13015.m32421(c4747).m32422("debug.completionDeps").split(",");
        for (String str : strArrSplit) {
            if (str.startsWith("file=")) {
                this.f53884 = str.substring(5);
            }
        }
        this.f53883 = EnumC5493.m16322(strArrSplit);
        C4878 c4878M14927 = C4878.m14927(c4747);
        C14769 c14769 = c4878M14927.f17026;
        c14769.getClass();
        c4878M14927.f17026 = new C14769(this, c14769);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m39421(C4747 c4747) {
        c4747.m14647(AbstractC17425.f56660, (InterfaceC6766) new C19663());
    }

    @Override // l.AbstractC17425
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39423(C24550 c24550, EnumC10712 enumC10712) {
        C12950 c12950 = new C12950(c24550);
        LinkedHashMap linkedHashMap = this.f53881;
        AbstractC11458 abstractC11458 = (AbstractC11458) linkedHashMap.get(c24550);
        if (abstractC11458 == null) {
            linkedHashMap.put(c24550, c12950);
            abstractC11458 = c12950;
        }
        Stack stack = this.f53882;
        if (!stack.isEmpty()) {
            List list = (List) ((AbstractC11458) stack.peek()).f36037.get(enumC10712);
            if (!list.contains(abstractC11458)) {
                list.add(abstractC11458);
            }
        }
        stack.push(abstractC11458);
        if (c12950 == abstractC11458) {
            c24550.f38070 = this;
        }
    }

    @Override // l.AbstractC17425
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39422() {
        this.f53882.pop();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        EnumC5493 enumC5493 = EnumC5493.REDUNDANT;
        EnumSet enumSet = this.f53883;
        boolean zContains = enumSet.contains(enumC5493);
        LinkedHashMap linkedHashMap = this.f53881;
        if (!zContains) {
            new C24885().m42341(linkedHashMap.values(), (StringBuilder) null);
        }
        if (!enumSet.contains(EnumC5493.CLASS)) {
            new C1764(this, EnumC15187.SOURCE).m42341(linkedHashMap.values(), (StringBuilder) null);
        }
        if (!enumSet.contains(EnumC5493.SOURCE)) {
            new C1764(this, EnumC15187.CLASS).m42341(linkedHashMap.values(), (StringBuilder) null);
        }
        String str = this.f53884;
        if (str != null) {
            FileWriter fileWriter = new FileWriter(str);
            try {
                fileWriter.append((CharSequence) C18917.m43924(linkedHashMap.values(), "CompletionDeps", ""));
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

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public final void mo11629(AbstractC11781 abstractC11781) {
        mo39423((C24550) abstractC11781, EnumC10712.OTHER);
        mo39422();
        abstractC11781.f38070 = this;
    }
}
