package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18106 extends C3936 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f59261;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18106(C22010 c22010, C12775 c12775) {
        super(c22010, EnumC13603.f43212, "inapplicable symbols", c12775);
        this.f59261 = c22010;
    }

    @Override // l.C3936, l.AbstractC2335
    /* JADX INFO: renamed from: ۙ */
    public final C17007 mo3799(EnumC22229 enumC22229, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, C14769 c147610) {
        Map mapM42226;
        EnumSet enumSetNoneOf;
        Map mapM42227 = m42226();
        C22010 c22010 = this.f59261;
        C15252 c15252 = c22010.f71026;
        if (c22010.f71024) {
            mapM42226 = m42224(mapM42227);
        } else {
            mapM42226 = m42226();
        }
        if (mapM42226.isEmpty()) {
            mapM42226 = mapM42227;
        }
        boolean z = ((HashMap) mapM42227).size() != mapM42226.size();
        if (mapM42226.size() > 1) {
            C19991 c19991 = c22010.f71000;
            if (z) {
                enumSetNoneOf = EnumSet.of(EnumC6984.COMPRESSED);
            } else {
                enumSetNoneOf = EnumSet.noneOf(EnumC6984.class);
            }
            C17007 c17007M45977 = c19991.m45977(enumC22229, enumSetNoneOf, c22010.f71001.m34514(), interfaceC5075, abstractC19728 == c15252.f49865 ? EnumC4960.CONSTRUCTOR : this.f38066.m33347(), abstractC19728 == c15252.f49865 ? abstractC22664.f73596.f38072 : abstractC19728, c22010.m49759(c14769));
            C14769 c14769M35543 = C14769.m35543();
            for (Map.Entry entry : mapM42226.entrySet()) {
                AbstractC11781 abstractC11782 = (AbstractC11781) entry.getKey();
                C19991 c19992 = c22010.f71000;
                C24705 c24705 = c22010.f71021;
                EnumC4960 enumC4960M27726 = C10925.m27726(abstractC11782);
                AbstractC11781 abstractC11781M29594 = abstractC11782.m29594(abstractC22664, c24705);
                AbstractC11781 abstractC11781Mo16954 = abstractC11782.mo16954(abstractC22664, c24705);
                C17007 c17007 = (C17007) entry.getValue();
                C15515 c15515 = C19859.f63823;
                c14769M35543 = c14769M35543.m35552(c19992.m45975(new C15515("compiler", "inapplicable.method", enumC4960M27726, abstractC11781M29594, abstractC11781Mo16954, c17007)));
            }
            return new C13278(c17007M45977, c14769M35543);
        }
        if (mapM42226.size() == 1) {
            Map.Entry entry2 = (Map.Entry) mapM42226.entrySet().iterator().next();
            C17007 c17007Mo3799 = new C14376(this, this.f13431, new C5558((AbstractC11781) entry2.getKey(), (C17007) entry2.getValue())).mo3799(enumC22229, interfaceC5075, abstractC11781, abstractC22664, abstractC19728, c14769, c147610);
            if (z) {
                c17007Mo3799.m40092(EnumC6984.COMPRESSED);
            }
            return c17007Mo3799;
        }
        return new C6810(c22010, EnumC13603.f43216).mo3799(enumC22229, interfaceC5075, abstractC11781, abstractC22664, abstractC19728, c14769, c147610);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public Map m42226() {
        C21090 c21090 = new C21090(this);
        for (C15012 c15012 : this.f13431.f40880) {
            boolean zM36160 = c15012.m36160();
            AbstractC11781 abstractC11781 = c15012.f49048;
            if (!zM36160) {
                C22010 c22010 = c21090.f67370.f59261;
                C18499 c18499 = new C18499();
                Iterator it = c21090.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = c18499.iterator();
                        while (it2.hasNext()) {
                            c21090.remove((AbstractC11781) it2.next());
                        }
                        c21090.put(abstractC11781, c15012.f49045);
                        break;
                    }
                    AbstractC11781 abstractC11782 = (AbstractC11781) it.next();
                    if (abstractC11782 != abstractC11781) {
                        if (abstractC11781.mo26689(abstractC11782, (AbstractC22970) abstractC11782.f38069, c22010.f71021, false)) {
                            c18499.m43089(abstractC11782);
                        } else if (abstractC11782.mo26689(abstractC11781, (AbstractC22970) abstractC11781.f38069, c22010.f71021, false)) {
                            break;
                        }
                    }
                }
            }
        }
        return c21090;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m42224(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            C17007 c17007 = (C17007) entry.getValue();
            String strM14347 = EnumC4572.ARITY_MISMATCH.m14347();
            C15758[] c15758Arr = new C15758[0];
            Object[] objArrM40085 = c17007.m40085();
            if (c17007.mo32405().matches(strM14347) && c17007.m40085().length == 0) {
                for (int i = 0; i < objArrM40085.length; i++) {
                    if (c15758Arr[i].mo15967(objArrM40085[i])) {
                    }
                }
            }
            linkedHashMap.put((AbstractC11781) entry.getKey(), c17007);
        }
        return linkedHashMap;
    }

    @Override // l.C3936
    /* JADX INFO: renamed from: ᩶ۙ */
    public final C5558 mo12637() {
        LinkedHashMap linkedHashMapM42224 = m42224(m42226());
        if (linkedHashMapM42224.size() == 1) {
            return new C5558((AbstractC11781) linkedHashMapM42224.keySet().iterator().next(), (C17007) linkedHashMapM42224.values().iterator().next());
        }
        return null;
    }
}
