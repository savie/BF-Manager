package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6H3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16984 implements InterfaceC13255 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f55513;

    public AbstractC16984() {
        ArrayList arrayList = new ArrayList();
        this.f55513 = arrayList;
        C20180 c20180 = (C20180) this;
        C25190 c25190 = new C25190();
        EnumC11763 enumC11763 = EnumC11763.STRING;
        c25190.m56159(Arrays.asList(Boolean.TRUE, Boolean.FALSE));
        c25190.m56160(new C0415(5));
        c25190.m56161(new C7873(6));
        c20180.f55513.add(c25190);
        c25190.m56158();
        c25190.m56165();
        c25190.m56162(new C10711(2, c20180));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C25190) it.next()).m56164();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40049(Map map) {
        Object objApply;
        for (C25190 c25190 : this.f55513) {
            String str = (String) map.get(c25190.f81423);
            if (str == null) {
                objApply = c25190.f81417;
            } else {
                try {
                    objApply = ((C7873) c25190.m56163()).apply(str);
                } catch (Exception e) {
                    throw new RuntimeException(C12669.m31438(new StringBuilder("Parse failed for option: "), c25190.f81423, ", value: ", str), e);
                }
            }
            try {
                ((C10711) c25190.m56166()).accept(objApply);
            } catch (Exception e2) {
                throw new RuntimeException("Setter invoke failed for option: " + c25190.f81423 + ", value: " + objApply, e2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m40048() {
        return C4681.unmodifiableList(this.f55513);
    }
}
