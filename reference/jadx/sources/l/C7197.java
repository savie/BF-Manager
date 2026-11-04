package l;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public class C7197 extends C24352 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo19770() {
        for (C14769 c14769M43093 = this.f78966.m43093(); c14769M43093.m35550(); c14769M43093 = c14769M43093.f48336) {
            c14769M43093.f48335 = m19769((AbstractC16344) c14769M43093.f48335);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC16344 m19769(AbstractC16344 abstractC16344) {
        if (abstractC16344 instanceof C9433) {
            AbstractC11781 abstractC11781 = abstractC16344.f53083;
            C9433 c9433 = (C9433) abstractC16344;
            if (abstractC11781.f38066 == EnumC13603.f43213 && c9433.m24812()) {
                C2175 c2175 = new C2175(abstractC11781);
                Iterator it = abstractC16344.mo7472((Predicate) null, EnumC13908.RECURSIVE).iterator();
                while (it.hasNext()) {
                    c2175.mo7481((AbstractC11781) it.next());
                }
                C25296 c25296 = c2175.f53082;
                c25296.f81699 = c25296.f81699.m35552(new WeakReference(new C8688()));
                return c2175;
            }
        }
        return abstractC16344;
    }
}
